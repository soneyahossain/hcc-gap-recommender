/*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;import org.joda.time.NoAssert;

import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for DateTimeUtils.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeUtils  { //extends TestCase {

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {
        String str = System.getProperty("java.version");
        boolean old = true;
        if (str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6')) {
            old = false;
        }
        OLD_JDK = old;
    }

    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {
        // don't call Policy.getPolicy()
        RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {
                Permissions p = new Permissions();
                p.add(new AllPermission());  // enable everything
                return p;
            }
            public void refresh() {
            }
            public boolean implies(ProtectionDomain domain, Permission permission) {
                if (permission instanceof JodaTimePermission) {
                    return false;
                }
                return true;
//                return super.implies(domain, permission);
            }
        };
        ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {
                Permissions p = new Permissions();
                p.add(new AllPermission());  // enable everything
                return p;
            }
            public void refresh() {
            }
        };
    }
    
    public static void main(String[] args) throws Exception  {
        TestDateTimeUtils TB= new TestDateTimeUtils();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testClass(); TB.tearDown();
        TB.setUp(); TB.testSystemMillis(); TB.tearDown();
        TB.setUp(); TB.testSystemMillisSecurity(); TB.tearDown();
        TB.setUp(); TB.testFixedMillis(); TB.tearDown();
        TB.setUp(); TB.testFixedMillisSecurity(); TB.tearDown();
        TB.setUp(); TB.testOffsetMillis(); TB.tearDown();
        TB.setUp(); TB.testOffsetMillisToZero(); TB.tearDown();
        TB.setUp(); TB.testOffsetMillisSecurity(); TB.tearDown();
        TB.setUp(); TB.testMillisProvider(); TB.tearDown();
        TB.setUp(); TB.testMillisProvider_null(); TB.tearDown();
        TB.setUp(); TB.testMillisProviderSecurity(); TB.tearDown();
        TB.setUp(); TB.testGetInstantMillis_RI(); TB.tearDown();
        TB.setUp(); TB.testGetInstantChronology_RI(); TB.tearDown();
        TB.setUp(); TB.testGetIntervalChronology_RInterval(); TB.tearDown();
        TB.setUp(); TB.testGetIntervalChronology_RI_RI(); TB.tearDown();
        TB.setUp(); TB.testGetReadableInterval_ReadableInterval(); TB.tearDown();
        TB.setUp(); TB.testGetChronology_Chronology(); TB.tearDown();
        TB.setUp(); TB.testGetZone_Zone(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType_PeriodType(); TB.tearDown();
        TB.setUp(); TB.testGetDurationMillis_RI(); TB.tearDown();
        TB.setUp(); TB.testIsContiguous_RP(); TB.tearDown();
        TB.setUp(); TB.testIsContiguous_RP_GJChronology(); TB.tearDown();
        TB.setUp(); TB.test_julianDay(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeUtils.class);
    }

    public TestDateTimeUtils(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testClass() {
        Class<?> cls = DateTimeUtils.class;
NoAssert.donothing(true, Modifier.isPublic(cls.getModifiers()));
NoAssert.donothing(false, Modifier.isFinal(cls.getModifiers()));
        
NoAssert.donothing(1, cls.getDeclaredConstructors().length);
NoAssert.donothing(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers()));
        
        new DateTimeUtils() {};
    }
    
    //-----------------------------------------------------------------------
    @Test public void testSystemMillis() {
        long nowSystem = System.currentTimeMillis();
        long now = DateTimeUtils.currentTimeMillis();
NoAssert.donothing((now >= nowSystem));
NoAssert.donothing((now - nowSystem) < 10000L);
    }

    //-----------------------------------------------------------------------
    @Test public void testSystemMillisSecurity() {
        if (OLD_JDK) {
            return;
        }
        try {
            try {
                Policy.setPolicy(RESTRICT);
                System.setSecurityManager(new SecurityManager());
                DateTimeUtils.setCurrentMillisSystem();
                fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                System.setSecurityManager(null);
                Policy.setPolicy(ALLOW);
            }
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testFixedMillis() {
        try {
            DateTimeUtils.setCurrentMillisFixed(0L);
NoAssert.donothing(0L, DateTimeUtils.currentTimeMillis());
NoAssert.donothing(0L, DateTimeUtils.currentTimeMillis());
NoAssert.donothing(0L, DateTimeUtils.currentTimeMillis());
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
        long nowSystem = System.currentTimeMillis();
        long now = DateTimeUtils.currentTimeMillis();
NoAssert.donothing((now >= nowSystem));
NoAssert.donothing((now - nowSystem) < 10000L);
    }

    //-----------------------------------------------------------------------
    @Test public void testFixedMillisSecurity() {
        if (OLD_JDK) {
            return;
        }
        try {
            try {
                Policy.setPolicy(RESTRICT);
                System.setSecurityManager(new SecurityManager());
                DateTimeUtils.setCurrentMillisFixed(0L);
                fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                System.setSecurityManager(null);
                Policy.setPolicy(ALLOW);
            }
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testOffsetMillis() {
        try {
            // set time to one day ago
            DateTimeUtils.setCurrentMillisOffset(-24 * 60 *  60 * 1000);
            long nowSystem = System.currentTimeMillis();
            long now = DateTimeUtils.currentTimeMillis();
            long nowAdjustDay = now + (24 * 60 *  60 * 1000);
NoAssert.donothing((now < nowSystem));
NoAssert.donothing((nowAdjustDay >= nowSystem));
NoAssert.donothing((nowAdjustDay - nowSystem) < 10000L);
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
        long nowSystem = System.currentTimeMillis();
        long now = DateTimeUtils.currentTimeMillis();
NoAssert.donothing((now >= nowSystem));
NoAssert.donothing((now - nowSystem) < 10000L);
    }

    //-----------------------------------------------------------------------
    @Test public void testOffsetMillisToZero() {
        long now1 = 0L;
        try {
            // set time to one day ago
            DateTimeUtils.setCurrentMillisOffset(0);
            now1 = DateTimeUtils.currentTimeMillis();
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
        long now2 = DateTimeUtils.currentTimeMillis();
NoAssert.donothing(Math.abs(now1 - now2) < 100, true);
    }

    //-----------------------------------------------------------------------
    @Test public void testOffsetMillisSecurity() {
        if (OLD_JDK) {
            return;
        }
        try {
            try {
                Policy.setPolicy(RESTRICT);
                System.setSecurityManager(new SecurityManager());
                DateTimeUtils.setCurrentMillisOffset(-24 * 60 *  60 * 1000);
                fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                System.setSecurityManager(null);
                Policy.setPolicy(ALLOW);
            }
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testMillisProvider() {
        try {
            DateTimeUtils.setCurrentMillisProvider(new MillisProvider() {
                public long getMillis() {
                    return 1L;
                }
            });
NoAssert.donothing(1L, DateTimeUtils.currentTimeMillis());
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    @Test public void testMillisProvider_null() {
        try {
            DateTimeUtils.setCurrentMillisProvider(null);
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testMillisProviderSecurity() {
        if (OLD_JDK) {
            return;
        }
        try {
            try {
                Policy.setPolicy(RESTRICT);
                System.setSecurityManager(new SecurityManager());
                DateTimeUtils.setCurrentMillisProvider(new MillisProvider() {
                    public long getMillis() {
                        return 0L;
                    }
                });
                fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                System.setSecurityManager(null);
                Policy.setPolicy(ALLOW);
            }
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetInstantMillis_RI() {
        Instant i = new Instant(123L);
NoAssert.donothing(123L, DateTimeUtils.getInstantMillis(i));
        try {
            DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
NoAssert.donothing(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null));
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetInstantChronology_RI() {
        DateTime dt = new DateTime(123L, BuddhistChronology.getInstance());
NoAssert.donothing(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt));
        
        Instant i = new Instant(123L);
NoAssert.donothing(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i));
        
        AbstractInstant ai = new AbstractInstant() {
            public long getMillis() {
                return 0L;
            }
            public Chronology getChronology() {
                return null; // testing for this
            }
        };
        assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai));
        
        assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetIntervalChronology_RInterval() {
        Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance());
NoAssert.donothing(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt));
        
NoAssert.donothing(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null));
        
        MutableInterval ai = new MutableInterval() {
            private static final long serialVersionUID = 1L;

            public Chronology getChronology() {
                return null; // testing for this
            }
        };
        assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetIntervalChronology_RI_RI() {
        DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance());
        DateTime dt2 = new DateTime(123L, CopticChronology.getInstance());
NoAssert.donothing(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2));
NoAssert.donothing(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null));
        assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2));
NoAssert.donothing(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetReadableInterval_ReadableInterval() {
        ReadableInterval input = new Interval(0, 100L);
NoAssert.donothing(input, DateTimeUtils.getReadableInterval(input));
        
        try {
            DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
NoAssert.donothing(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null));
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetChronology_Chronology() {
NoAssert.donothing(BuddhistChronology.getInstance(), DateTimeUtils.getChronology(BuddhistChronology.getInstance()));
NoAssert.donothing(ISOChronology.getInstance(), DateTimeUtils.getChronology(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetZone_Zone() {
NoAssert.donothing(PARIS, DateTimeUtils.getZone(PARIS));
NoAssert.donothing(DateTimeZone.getDefault(), DateTimeUtils.getZone(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetPeriodType_PeriodType() {
NoAssert.donothing(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime()));
NoAssert.donothing(PeriodType.standard(), DateTimeUtils.getPeriodType(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetDurationMillis_RI() {
        Duration dur = new Duration(123L);
NoAssert.donothing(123L, DateTimeUtils.getDurationMillis(dur));
NoAssert.donothing(0L, DateTimeUtils.getDurationMillis(null));
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testIsContiguous_RP() {
        YearMonthDay ymd = new YearMonthDay(2005, 6, 9);
NoAssert.donothing(true, DateTimeUtils.isContiguous(ymd));
        TimeOfDay tod = new TimeOfDay(12, 20, 30, 0);
NoAssert.donothing(true, DateTimeUtils.isContiguous(tod));
        Partial year = new Partial(DateTimeFieldType.year(), 2005);
NoAssert.donothing(true, DateTimeUtils.isContiguous(year));
        Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12);
NoAssert.donothing(true, DateTimeUtils.isContiguous(hourOfDay));
        Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12);
NoAssert.donothing(false, DateTimeUtils.isContiguous(yearHour));
        Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2);
NoAssert.donothing(false, DateTimeUtils.isContiguous(ymdd));
        Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5);
NoAssert.donothing(false, DateTimeUtils.isContiguous(dd));
        
        try {
            DateTimeUtils.isContiguous((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testIsContiguous_RP_GJChronology() {
        YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ);
NoAssert.donothing(true, DateTimeUtils.isContiguous(ymd));
        TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ);
NoAssert.donothing(true, DateTimeUtils.isContiguous(tod));
        Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ);
NoAssert.donothing(true, DateTimeUtils.isContiguous(year));
        Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ);
NoAssert.donothing(true, DateTimeUtils.isContiguous(hourOfDay));
        Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12);
NoAssert.donothing(false, DateTimeUtils.isContiguous(yearHour));
        Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2);
NoAssert.donothing(false, DateTimeUtils.isContiguous(ymdd));
        Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5);
NoAssert.donothing(false, DateTimeUtils.isContiguous(dd));
        
        try {
            DateTimeUtils.isContiguous((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void test_julianDay() {
        DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC);
        
NoAssert.donothing(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
NoAssert.donothing(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
NoAssert.donothing(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d));
        
        base = base.plusHours(6);
NoAssert.donothing(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
NoAssert.donothing(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
NoAssert.donothing(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d));
        
        base = base.plusHours(6);
NoAssert.donothing(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
NoAssert.donothing(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
NoAssert.donothing(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d));
        
        base = base.plusHours(6);
NoAssert.donothing(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
NoAssert.donothing(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
NoAssert.donothing(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d));
        
        base = base.plusHours(6);
NoAssert.donothing(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis()));
NoAssert.donothing(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d));
        
        base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC);
NoAssert.donothing(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
NoAssert.donothing(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        
        base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC());
NoAssert.donothing(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
NoAssert.donothing(0, DateTimeUtils.toJulianDayNumber(base.getMillis()));
NoAssert.donothing(base.getMillis(), DateTimeUtils.fromJulianDay(0d));
        
        base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC());
NoAssert.donothing(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
NoAssert.donothing(0, DateTimeUtils.toJulianDayNumber(base.getMillis()));
NoAssert.donothing(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d));
    }

}
