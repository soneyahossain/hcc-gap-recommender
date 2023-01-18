/*
 *  Copyright 2001-2014 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilePermission;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZone { //extends TestCase {
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
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365;

    // 2002-06-09
    private long TEST_TIME_SUMMER =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    // 2002-01-09
    private long TEST_TIME_WINTER =
            (y2002days + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

//    // 2002-04-05 Fri
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06 Tue
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

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

    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) throws Exception {
        TestDateTimeZone TB = new TestDateTimeZone();
        TB.setUp();
        TB.testDefault();
        TB.tearDown();
        TB.setUp();
        TB.testDefaultSecurity();
        TB.tearDown();
        TB.setUp();
        TB.testForID_String();
        TB.tearDown();
        TB.setUp();
        TB.testForID_String_old();
        TB.tearDown();
        TB.setUp();
        TB.testForOffsetHours_int();
        TB.tearDown();
        TB.setUp();
        TB.testForOffsetHoursMinutes_int_int();
        TB.tearDown();
        TB.setUp();
        TB.testForOffsetMillis_int();
        TB.tearDown();
        TB.setUp();
        TB.testForTimeZone_TimeZone();
        TB.tearDown();
        TB.setUp();
        TB.testFromTimeZoneInvalid();
        TB.tearDown();
        TB.setUp();
        TB.testTimeZoneConversion();
        TB.tearDown();
        TB.setUp();
        TB.testGetAvailableIDs();
        TB.tearDown();
        TB.setUp();
        TB.testProvider();
        TB.tearDown();
        TB.setUp();
        TB.testProvider_badClassName();
        TB.tearDown();
        TB.setUp();
        TB.testProviderSecurity();
        TB.tearDown();
        TB.setUp();
        TB.testZoneInfoProviderResourceLoading();
        TB.tearDown();
        TB.setUp();
        TB.testNameProvider();
        TB.tearDown();
        TB.setUp();
        TB.testNameProvider_badClassName();
        TB.tearDown();
        TB.setUp();
        TB.testNameProviderSecurity();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor();
        TB.tearDown();
        TB.setUp();
        TB.testGetID();
        TB.tearDown();
        TB.setUp();
        TB.testGetNameKey();
        TB.tearDown();
        //TB.setUp(); TB.testGetShortName(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testGetShortName_berlin(); TB.tearDown();  //Method code too large!
        TB.setUp();
        TB.testGetShortNameProviderName();
        TB.tearDown();
        TB.setUp();
        TB.testGetShortNameNullKey();
        TB.tearDown();
        //TB.setUp(); TB.testGetName(); TB.tearDown();  //Method code too large!

        TB.setUp();
        TB.testGetNameProviderName();
        TB.tearDown();
        TB.setUp();
        TB.testGetNameNullKey();
        TB.tearDown();
        TB.setUp();
        TB.testGetOffset_long();
        TB.tearDown();
        TB.setUp();
        TB.testGetOffset_RI();
        TB.tearDown();
        TB.setUp();
        TB.testGetOffsetFixed();
        TB.tearDown();
        TB.setUp();
        TB.testGetOffsetFixed_RI();
        TB.tearDown();
        TB.setUp();
        TB.testGetMillisKeepLocal();
        TB.tearDown();
        TB.setUp();
        TB.testIsFixed();
        TB.tearDown();
        TB.setUp();
        TB.testTransitionFixed();
        TB.tearDown();
//    TB.setUp(); TB.testIsLocalDateTimeOverlap_Berlin(); TB.tearDown();  //commented in original code
//    TB.setUp(); TB.testIsLocalDateTimeOverlap_NewYork(); TB.tearDown(); //commented in original code
        TB.setUp();
        TB.testIsLocalDateTimeGap_Berlin();
        TB.tearDown();
        TB.setUp();
        TB.testIsLocalDateTimeGap_NewYork();
        TB.tearDown();
        TB.setUp();
        TB.testToTimeZone();
        TB.tearDown();
        TB.setUp();
        TB.testEqualsHashCode();
        TB.tearDown();
        TB.setUp();
        TB.testToString();
        TB.tearDown();
        //TB.setUp(); TB.testDublin(); TB.tearDown();  //Method code too large!
        TB.setUp();
        TB.testWindhoek();
        TB.tearDown();
        TB.setUp();
        TB.testToronto();
        TB.tearDown();
        TB.setUp();
        TB.testJerusalem();
        TB.tearDown();
        TB.setUp();
        TB.testSerialization1();
        TB.tearDown();
        TB.setUp();
        TB.testSerialization2();
        TB.tearDown();
        TB.setUp();
        TB.testCommentParse();
        TB.tearDown();
        //TB.setUp(); TB.testPatchedNameKeysLondon(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testPatchedNameKeysSydney(); TB.tearDown();  //Method code too large!
        //TB.setUp(); TB.testPatchedNameKeysSydneyHistoric(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testPatchedNameKeysGazaHistoric(); TB.tearDown(); //Method code too large!
    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeZone.class);
    }

    public TestDateTimeZone(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {
        locale = Locale.getDefault();
        zone = DateTimeZone.getDefault();
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() throws Exception {
        Locale.setDefault(locale);
        DateTimeZone.setDefault(zone);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDefault() {
NoAssert.donothing(DateTimeZone.getDefault());

        DateTimeZone.setDefault(PARIS);
NoAssert.donothing(PARIS, DateTimeZone.getDefault());

        try {
            DateTimeZone.setDefault(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testDefaultSecurity() {
        if (OLD_JDK) {
            return;
        }
        try {
            Policy.setPolicy(RESTRICT);
            System.setSecurityManager(new SecurityManager());
            DateTimeZone.setDefault(PARIS);
            fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            System.setSecurityManager(null);
            Policy.setPolicy(ALLOW);
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testForID_String() {
NoAssert.donothing(DateTimeZone.getDefault(), DateTimeZone.forID((String) null));

        DateTimeZone zone = DateTimeZone.forID("Europe/London");
NoAssert.donothing("Europe/London", zone.getID());

        zone = DateTimeZone.forID("UTC");
NoAssert.donothing(DateTimeZone.UTC, zone);

        zone = DateTimeZone.forID("+00:00");
NoAssert.donothing(DateTimeZone.UTC, zone);

        zone = DateTimeZone.forID("+00");
NoAssert.donothing(DateTimeZone.UTC, zone);

        zone = DateTimeZone.forID("+01:23");
NoAssert.donothing("+01:23", zone.getID());
NoAssert.donothing(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));

        zone = DateTimeZone.forID("-02:00");
NoAssert.donothing("-02:00", zone.getID());
NoAssert.donothing((-2L * DateTimeConstants.MILLIS_PER_HOUR),
                zone.getOffset(TEST_TIME_SUMMER));

        zone = DateTimeZone.forID("-07:05:34.0");
NoAssert.donothing("-07:05:34", zone.getID());
NoAssert.donothing((-7L * DateTimeConstants.MILLIS_PER_HOUR) +
                        (-5L * DateTimeConstants.MILLIS_PER_MINUTE) +
                        (-34L * DateTimeConstants.MILLIS_PER_SECOND),
                zone.getOffset(TEST_TIME_SUMMER));

        try {
            DateTimeZone.forID("SST");
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            DateTimeZone.forID("europe/london");
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            DateTimeZone.forID("Europe/UK");
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            DateTimeZone.forID("+");
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            DateTimeZone.forID("+0");
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testForID_String_old() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("GMT", "UTC");
        map.put("WET", "WET");
        map.put("CET", "CET");
        map.put("MET", "CET");
        map.put("ECT", "CET");
        map.put("EET", "EET");
        map.put("MIT", "Pacific/Apia");
        map.put("HST", "Pacific/Honolulu");
        map.put("AST", "America/Anchorage");
        map.put("PST", "America/Los_Angeles");
        map.put("MST", "America/Denver");
        map.put("PNT", "America/Phoenix");
        map.put("CST", "America/Chicago");
        map.put("EST", "America/New_York");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("PRT", "America/Puerto_Rico");
        map.put("CNT", "America/St_Johns");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("BET", "America/Sao_Paulo");
        map.put("ART", "Africa/Cairo");
        map.put("CAT", "Africa/Harare");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("NET", "Asia/Yerevan");
        map.put("PLT", "Asia/Karachi");
        map.put("IST", "Asia/Kolkata");
        map.put("BST", "Asia/Dhaka");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("CTT", "Asia/Shanghai");
        map.put("JST", "Asia/Tokyo");
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("NST", "Pacific/Auckland");
        for (String key : map.keySet()) {
            String value = map.get(key);
            TimeZone juZone = TimeZone.getTimeZone(key);
            DateTimeZone zone = DateTimeZone.forTimeZone(juZone);
NoAssert.donothing(DateTimeZone.forID(value), zone);
//            System.out.println(juZone);
//            System.out.println(juZone.getDisplayName());
//            System.out.println(zone);
//            System.out.println("------");
        }
        // gee thanks time-zone db maintainer for damaging the database
        // and breaking the long-standing  association with CAT/EAT
    }

    //-----------------------------------------------------------------------
    @Test
    public void testForOffsetHours_int() {
NoAssert.donothing(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
NoAssert.donothing(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3));
NoAssert.donothing(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2));
        try {
            DateTimeZone.forOffsetHours(999999);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testForOffsetHoursMinutes_int_int() {
NoAssert.donothing(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
NoAssert.donothing(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59));

NoAssert.donothing(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15));
NoAssert.donothing(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0));
        try {
            DateTimeZone.forOffsetHoursMinutes(2, -15);
            fail();
        } catch (IllegalArgumentException ex) {
        }

NoAssert.donothing(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15));
NoAssert.donothing(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0));
NoAssert.donothing(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15));

NoAssert.donothing(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0));
NoAssert.donothing(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15));
NoAssert.donothing(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15));

NoAssert.donothing(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59));
        try {
            DateTimeZone.forOffsetHoursMinutes(2, 60);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            DateTimeZone.forOffsetHoursMinutes(-2, 60);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            DateTimeZone.forOffsetHoursMinutes(24, 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            DateTimeZone.forOffsetHoursMinutes(-24, 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testForOffsetMillis_int() {
NoAssert.donothing(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
NoAssert.donothing(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1));
NoAssert.donothing(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000));
NoAssert.donothing(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000));
NoAssert.donothing(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1));
NoAssert.donothing(DateTimeZone.forID("+04:45:17.045"),
                DateTimeZone.forOffsetMillis(
                        4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testForTimeZone_TimeZone() {
NoAssert.donothing(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null));

        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London"));
NoAssert.donothing("Europe/London", zone.getID());
NoAssert.donothing(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00"));
NoAssert.donothing(DateTimeZone.UTC, zone);

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
NoAssert.donothing(DateTimeZone.UTC, zone);

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
NoAssert.donothing(DateTimeZone.UTC, zone);

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00"));
NoAssert.donothing(DateTimeZone.UTC, zone);

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23"));
NoAssert.donothing("+01:23", zone.getID());
NoAssert.donothing(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23"));
NoAssert.donothing("+01:23", zone.getID());
NoAssert.donothing(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00"));
NoAssert.donothing("-02:00", zone.getID());
NoAssert.donothing((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER));

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2"));
NoAssert.donothing("+02:00", zone.getID());
NoAssert.donothing((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER));

        zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
NoAssert.donothing("America/New_York", zone.getID());

        TimeZone tz = TimeZone.getTimeZone("GMT-08:00");
        tz.setID("GMT-\u0660\u0668:\u0660\u0660");
        zone = DateTimeZone.forTimeZone(tz);
NoAssert.donothing("-08:00", zone.getID());
    }

    @Test
    public void testFromTimeZoneInvalid() throws Exception {
        TimeZone jdkZone = new TimeZone() {
            private static final long serialVersionUID = 1L;

            @Override
            public String getID() {
                return null;
            }

            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }

            @Override
            public void setRawOffset(int offsetMillis) {
            }

            @Override
            public int getRawOffset() {
                return 0;
            }

            @Override
            public boolean useDaylightTime() {
                return false;
            }

            @Override
            public boolean inDaylightTime(Date date) {
                return false;
            }
        };
        try {
            DateTimeZone.forTimeZone(jdkZone);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testTimeZoneConversion() {
        TimeZone jdkTimeZone = TimeZone.getTimeZone("GMT-10");
NoAssert.donothing("GMT-10:00", jdkTimeZone.getID());

        DateTimeZone jodaTimeZone = DateTimeZone.forTimeZone(jdkTimeZone);
NoAssert.donothing("-10:00", jodaTimeZone.getID());
NoAssert.donothing(jdkTimeZone.getRawOffset(), jodaTimeZone.getOffset(0L));

        TimeZone convertedTimeZone = jodaTimeZone.toTimeZone();
NoAssert.donothing("GMT-10:00", jdkTimeZone.getID());

NoAssert.donothing(jdkTimeZone.getID(), convertedTimeZone.getID());
NoAssert.donothing(jdkTimeZone.getRawOffset(), convertedTimeZone.getRawOffset());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetAvailableIDs() {
NoAssert.donothing(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testProvider() {
        try {
NoAssert.donothing(DateTimeZone.getProvider());

            Provider provider = DateTimeZone.getProvider();
            DateTimeZone.setProvider(null);
NoAssert.donothing(provider.getClass(), DateTimeZone.getProvider().getClass());

            try {
                DateTimeZone.setProvider(new MockNullIDSProvider());
                fail();
            } catch (IllegalArgumentException ex) {
            }
            try {
                DateTimeZone.setProvider(new MockEmptyIDSProvider());
                fail();
            } catch (IllegalArgumentException ex) {
            }
            try {
                DateTimeZone.setProvider(new MockNoUTCProvider());
                fail();
            } catch (IllegalArgumentException ex) {
            }
            try {
                DateTimeZone.setProvider(new MockBadUTCProvider());
                fail();
            } catch (IllegalArgumentException ex) {
            }

            Provider prov = new MockOKProvider();
            DateTimeZone.setProvider(prov);
NoAssert.donothing(prov, DateTimeZone.getProvider());
NoAssert.donothing(2, DateTimeZone.getAvailableIDs().size());
NoAssert.donothing(DateTimeZone.getAvailableIDs().contains("UTC"));
NoAssert.donothing(DateTimeZone.getAvailableIDs().contains("Europe/London"));
        } finally {
            DateTimeZone.setProvider(null);
NoAssert.donothing(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        }

        try {
            System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider");
            DateTimeZone.setProvider(null);
NoAssert.donothing(UTCProvider.class, DateTimeZone.getProvider().getClass());
        } finally {
            System.getProperties().remove("org.joda.time.DateTimeZone.Provider");
            DateTimeZone.setProvider(null);
NoAssert.donothing(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        }

        try {
            System.setProperty("org.joda.time.DateTimeZone.Folder", "src/test/resources/tzdata");
            DateTimeZone.setProvider(null);
NoAssert.donothing(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
NoAssert.donothing(2, DateTimeZone.getAvailableIDs().size());
NoAssert.donothing(true, DateTimeZone.getAvailableIDs().contains("UTC"));
NoAssert.donothing(true, DateTimeZone.getAvailableIDs().contains("CET"));

        } finally {
            System.getProperties().remove("org.joda.time.DateTimeZone.Folder");
            DateTimeZone.setProvider(null);
NoAssert.donothing(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
NoAssert.donothing(true, DateTimeZone.getAvailableIDs().size() > 2);
        }
    }

    @Test
    public void testProvider_badClassName() {
        try {
            System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx");
            DateTimeZone.setProvider(null);

        } catch (RuntimeException ex) {
            // expected
NoAssert.donothing(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        } finally {
            System.getProperties().remove("org.joda.time.DateTimeZone.Provider");
            DateTimeZone.setProvider(null);
        }
    }

    @Test
    public void testProviderSecurity() {
        if (OLD_JDK) {
            return;
        }
        try {
            Policy.setPolicy(RESTRICT);
            System.setSecurityManager(new SecurityManager());
            DateTimeZone.setProvider(new MockOKProvider());
            fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            System.setSecurityManager(null);
            Policy.setPolicy(ALLOW);
        }
    }

    @Test
    public void testZoneInfoProviderResourceLoading() {
        final Set<String> ids = new HashSet<String>(DateTimeZone.getAvailableIDs());
        ids.remove(DateTimeZone.getDefault().getID());
        final String id = ids.toArray(new String[ids.size()])[new Random().nextInt(ids.size())];
        try {
            Policy.setPolicy(new Policy() {
                @Override
                public PermissionCollection getPermissions(CodeSource codesource) {
                    Permissions p = new Permissions();
                    p.add(new AllPermission());  // enable everything
                    return p;
                }

                @Override
                public void refresh() {
                }

                @Override
                public boolean implies(ProtectionDomain domain, Permission permission) {
                    return !(permission instanceof FilePermission) && !permission.getName().contains(id);
                }
            });
            System.setSecurityManager(new SecurityManager());
            // will throw IllegalArgumentException if the resource can
            // not be loaded
            final DateTimeZone zone = DateTimeZone.forID(id);
NoAssert.donothing(zone);
        } finally {
            System.setSecurityManager(null);
            Policy.setPolicy(ALLOW);
        }
    }

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {
            return null;
        }

        public DateTimeZone getZone(String id) {
            return null;
        }
    }

    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {
            return new HashSet();
        }

        public DateTimeZone getZone(String id) {
            return null;
        }
    }

    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {
            Set set = new HashSet();
            set.add("Europe/London");
            return set;
        }

        public DateTimeZone getZone(String id) {
            return null;
        }
    }

    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {
            Set set = new HashSet();
            set.add("UTC");
            set.add("Europe/London");
            return set;
        }

        public DateTimeZone getZone(String id) {
            return null;
        }
    }

    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {
            Set set = new HashSet();
            set.add("UTC");
            set.add("Europe/London");
            return set;
        }

        public DateTimeZone getZone(String id) {
            return DateTimeZone.UTC;
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testNameProvider() {
        try {
NoAssert.donothing(DateTimeZone.getNameProvider());

            NameProvider provider = DateTimeZone.getNameProvider();
            DateTimeZone.setNameProvider(null);
NoAssert.donothing(provider.getClass(), DateTimeZone.getNameProvider().getClass());

            provider = new MockOKButNullNameProvider();
            DateTimeZone.setNameProvider(provider);
NoAssert.donothing(provider, DateTimeZone.getNameProvider());

NoAssert.donothing("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER));
NoAssert.donothing("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER));
        } finally {
            DateTimeZone.setNameProvider(null);
        }

        try {
            System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider");
            DateTimeZone.setNameProvider(null);
NoAssert.donothing(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        } finally {
            System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider");
            DateTimeZone.setNameProvider(null);
NoAssert.donothing(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        }
    }

    @Test
    public void testNameProvider_badClassName() {
        try {
            System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx");
            DateTimeZone.setProvider(null);

        } catch (RuntimeException ex) {
            // expected
NoAssert.donothing(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        } finally {
            System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider");
            DateTimeZone.setProvider(null);
        }
    }

    @Test
    public void testNameProviderSecurity() {
        if (OLD_JDK) {
            return;
        }
        try {
            Policy.setPolicy(RESTRICT);
            System.setSecurityManager(new SecurityManager());
            DateTimeZone.setNameProvider(new MockOKButNullNameProvider());
            fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            System.setSecurityManager(null);
            Policy.setPolicy(ALLOW);
        }
    }

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {
            return null;
        }

        public String getName(Locale locale, String id, String nameKey) {
            return null;
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {
NoAssert.donothing(1, DateTimeZone.class.getDeclaredConstructors().length);
NoAssert.donothing(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers()));
        try {
            new DateTimeZone(null) {
                public String getNameKey(long instant) {
                    return null;
                }

                public int getOffset(long instant) {
                    return 0;
                }

                public int getStandardOffset(long instant) {
                    return 0;
                }

                public boolean isFixed() {
                    return false;
                }

                public long nextTransition(long instant) {
                    return 0;
                }

                public long previousTransition(long instant) {
                    return 0;
                }

                public boolean equals(Object object) {
                    return false;
                }
            };
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetID() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
NoAssert.donothing("Europe/Paris", zone.getID());
    }

    @Test
    public void testGetNameKey() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
NoAssert.donothing("BST", zone.getNameKey(TEST_TIME_SUMMER));
        assertEquals("GMT", zone.getNameKey(TEST_TIME_WINTER));
    }

    static final boolean JDK6PLUS;

    static {
        boolean jdk6 = true;
        try {
            DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class});
        } catch (Exception ex) {
            jdk6 = false;
        }
        JDK6PLUS = jdk6;
    }

    static final boolean JDK9;

    static {
        boolean jdk9 = true;
        try {
            String str = System.getProperty("java.version");
            jdk9 = str.startsWith("9");
        } catch (Exception ex) {
            jdk9 = false;
        }
        JDK9 = jdk9;
    }

    //@Test
    public void testGetShortName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
NoAssert.donothing("BST", zone.getShortName(TEST_TIME_SUMMER));
NoAssert.donothing("GMT", zone.getShortName(TEST_TIME_WINTER));
NoAssert.donothing("BST", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }

    //@Test
    public void testGetShortName_berlin() {
        DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
NoAssert.donothing("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.ENGLISH));
NoAssert.donothing("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
        if (JDK6PLUS) {
NoAssert.donothing("MEZ", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
NoAssert.donothing("MESZ", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
        } else {
NoAssert.donothing("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
NoAssert.donothing("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
        }
    }

    @Test
    public void testGetShortNameProviderName() {
NoAssert.donothing(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST"));
NoAssert.donothing(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST"));
NoAssert.donothing(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null));
NoAssert.donothing(null, DateTimeZone.getNameProvider().getShortName(null, null, null));
    }

    @Test
    public void testGetShortNameNullKey() {
        DateTimeZone zone = new MockDateTimeZone("Europe/London");
NoAssert.donothing("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }

    //@Test
    public void testGetName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
NoAssert.donothing("British Summer Time", zone.getName(TEST_TIME_SUMMER));
NoAssert.donothing("Greenwich Mean Time", zone.getName(TEST_TIME_WINTER));
NoAssert.donothing("British Summer Time", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }

    /*
        @Test public void testGetName_berlin_english() {
          DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
          if (JDK9) {
              assertEquals("Central European Standard Time", berlin.getName(TEST_TIME_WINTER, Locale.ENGLISH));
          } else {
              assertEquals("Central European Time", berlin.getName(TEST_TIME_WINTER, Locale.ENGLISH));
          }
          assertEquals("Central European Summer Time", berlin.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
        }

        @Test public void testGetName_berlin_german() {
            DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
            if (JDK9) {
                assertEquals("Mitteleurop\u00e4ische Normalzeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
                assertEquals("Mitteleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
            } else if (JDK6PLUS) {
                assertEquals("Mitteleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
                assertEquals("Mitteleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
            } else {
                assertEquals("Zentraleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
                assertEquals("Zentraleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
            }
        }
    */
    @Test
    public void testGetNameProviderName() {
NoAssert.donothing(null, DateTimeZone.getNameProvider().getName(null, "Europe/London", "BST"));
NoAssert.donothing(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, null, "BST"));
NoAssert.donothing(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, "Europe/London", null));
NoAssert.donothing(null, DateTimeZone.getNameProvider().getName(null, null, null));
    }

    @Test
    public void testGetNameNullKey() {
        DateTimeZone zone = new MockDateTimeZone("Europe/London");
NoAssert.donothing("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }

    static class MockDateTimeZone extends DateTimeZone {
        public MockDateTimeZone(String id) {
            super(id);
        }

        public String getNameKey(long instant) {
            return null;  // null
        }

        public int getOffset(long instant) {
            return 0;
        }

        public int getStandardOffset(long instant) {
            return 0;
        }

        public boolean isFixed() {
            return false;
        }

        public long nextTransition(long instant) {
            return 0;
        }

        public long previousTransition(long instant) {
            return 0;
        }

        public boolean equals(Object object) {
            return false;
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetOffset_long() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
NoAssert.donothing(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER));

NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER));

NoAssert.donothing(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER));

NoAssert.donothing(false, zone.isStandardOffset(TEST_TIME_SUMMER));
NoAssert.donothing(true, zone.isStandardOffset(TEST_TIME_WINTER));
    }

    @Test
    public void testGetOffset_RI() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
NoAssert.donothing(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER)));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER)));

NoAssert.donothing(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null));
    }

    @Test
    public void testGetOffsetFixed() {
        DateTimeZone zone = DateTimeZone.forID("+01:00");
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER));

NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER));

NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER));

NoAssert.donothing(true, zone.isStandardOffset(TEST_TIME_SUMMER));
NoAssert.donothing(true, zone.isStandardOffset(TEST_TIME_WINTER));
    }

    @Test
    public void testGetOffsetFixed_RI() {
        DateTimeZone zone = DateTimeZone.forID("+01:00");
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER)));
NoAssert.donothing(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER)));

NoAssert.donothing(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetMillisKeepLocal() {
        long millisLondon = TEST_TIME_SUMMER;
        long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR;

NoAssert.donothing(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon));
NoAssert.donothing(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis));
NoAssert.donothing(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon));
NoAssert.donothing(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis));

NoAssert.donothing(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon));
NoAssert.donothing(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis));

        DateTimeZone zone = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(LONDON);
NoAssert.donothing(millisLondon, PARIS.getMillisKeepLocal(null, millisParis));
        } finally {
            DateTimeZone.setDefault(zone);
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsFixed() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
NoAssert.donothing(false, zone.isFixed());
NoAssert.donothing(true, DateTimeZone.UTC.isFixed());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testTransitionFixed() {
        DateTimeZone zone = DateTimeZone.forID("+01:00");
NoAssert.donothing(TEST_TIME_SUMMER, zone.nextTransition(TEST_TIME_SUMMER));
NoAssert.donothing(TEST_TIME_WINTER, zone.nextTransition(TEST_TIME_WINTER));
NoAssert.donothing(TEST_TIME_SUMMER, zone.previousTransition(TEST_TIME_SUMMER));
NoAssert.donothing(TEST_TIME_WINTER, zone.previousTransition(TEST_TIME_WINTER));
    }

//    //-----------------------------------------------------------------------
//    @Test public void testIsLocalDateTimeOverlap_Berlin() {
//        DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 3, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 4, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }
//
//    //-----------------------------------------------------------------------
//    @Test public void testIsLocalDateTimeOverlap_NewYork() {
//        DateTimeZone zone = DateTimeZone.forID("America/New_York");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 2, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 3, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsLocalDateTimeGap_Berlin() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0)));
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99)));
NoAssert.donothing(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0)));
NoAssert.donothing(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30)));
NoAssert.donothing(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99)));
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0)));
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0)));

NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30)));  // before overlap
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30)));  // overlap
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30)));  // after overlap
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34)));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsLocalDateTimeGap_NewYork() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 0)));
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 59, 59, 99)));
NoAssert.donothing(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 0)));
NoAssert.donothing(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 30)));
        assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 59, 59, 99)));
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 3, 0)));
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 4, 0)));

NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 0, 30)));  // before overlap
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 1, 30)));  // overlap
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 2, 30)));  // after overlap
NoAssert.donothing(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34)));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        TimeZone tz = zone.toTimeZone();
NoAssert.donothing("Europe/Paris", tz.getID());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris");
NoAssert.donothing(true, zone1.equals(zone1));
NoAssert.donothing(true, zone1.equals(zone2));
NoAssert.donothing(true, zone2.equals(zone1));
NoAssert.donothing(true, zone2.equals(zone2));
NoAssert.donothing(true, zone1.hashCode() == zone2.hashCode());

        DateTimeZone zone3 = DateTimeZone.forID("Europe/London");
NoAssert.donothing(true, zone3.equals(zone3));
NoAssert.donothing(false, zone1.equals(zone3));
NoAssert.donothing(false, zone2.equals(zone3));
NoAssert.donothing(false, zone3.equals(zone1));
NoAssert.donothing(false, zone3.equals(zone2));
NoAssert.donothing(false, zone1.hashCode() == zone3.hashCode());
NoAssert.donothing(true, zone3.hashCode() == zone3.hashCode());

        DateTimeZone zone4 = DateTimeZone.forID("+01:00");
NoAssert.donothing(true, zone4.equals(zone4));
NoAssert.donothing(false, zone1.equals(zone4));
NoAssert.donothing(false, zone2.equals(zone4));
NoAssert.donothing(false, zone3.equals(zone4));
NoAssert.donothing(false, zone4.equals(zone1));
NoAssert.donothing(false, zone4.equals(zone2));
NoAssert.donothing(false, zone4.equals(zone3));
NoAssert.donothing(false, zone1.hashCode() == zone4.hashCode());
NoAssert.donothing(true, zone4.hashCode() == zone4.hashCode());

        DateTimeZone zone5 = DateTimeZone.forID("+02:00");
NoAssert.donothing(true, zone5.equals(zone5));
NoAssert.donothing(false, zone1.equals(zone5));
NoAssert.donothing(false, zone2.equals(zone5));
NoAssert.donothing(false, zone3.equals(zone5));
NoAssert.donothing(false, zone4.equals(zone5));
NoAssert.donothing(false, zone5.equals(zone1));
NoAssert.donothing(false, zone5.equals(zone2));
NoAssert.donothing(false, zone5.equals(zone3));
NoAssert.donothing(false, zone5.equals(zone4));
NoAssert.donothing(false, zone1.hashCode() == zone5.hashCode());
NoAssert.donothing(true, zone5.hashCode() == zone5.hashCode());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
NoAssert.donothing("Europe/Paris", zone.toString());
NoAssert.donothing("UTC", DateTimeZone.UTC.toString());
    }

    //-----------------------------------------------------------------------
    // rule with negative SAVE value
    //@Test
    public void testDublin() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Dublin");
        DateTime winter = new DateTime(2018, 1, 1, 0, 0, 0, 0, zone);
NoAssert.donothing(0, zone.getStandardOffset(winter.getMillis()));
NoAssert.donothing(0, zone.getOffset(winter.getMillis()));
NoAssert.donothing(true, zone.isStandardOffset(winter.getMillis()));
NoAssert.donothing("Greenwich Mean Time", zone.getName(winter.getMillis()));
NoAssert.donothing("GMT", zone.getNameKey(winter.getMillis()));

        DateTime summer = winter.plusMonths(6);
NoAssert.donothing(0, zone.getStandardOffset(summer.getMillis()));
NoAssert.donothing(3600000, zone.getOffset(summer.getMillis()));
NoAssert.donothing(false, zone.isStandardOffset(summer.getMillis()));
NoAssert.donothing(true, zone.getName(summer.getMillis()).startsWith("Irish "));
NoAssert.donothing("IST", zone.getNameKey(summer.getMillis()));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWindhoek() {
        DateTimeZone zone = DateTimeZone.forID("Africa/Windhoek");
        DateTime dtDec1990 = new DateTime(1990, 12, 1, 0, 0, 0, 0, zone);
NoAssert.donothing(3600000, zone.getStandardOffset(dtDec1990.getMillis()));
NoAssert.donothing(7200000, zone.getOffset(dtDec1990.getMillis()));
NoAssert.donothing(false, zone.isStandardOffset(dtDec1990.getMillis()));

        DateTime dtDec1994 = new DateTime(1994, 12, 1, 0, 0, 0, 0, zone);
NoAssert.donothing(3600000, zone.getStandardOffset(dtDec1994.getMillis()));
NoAssert.donothing(7200000, zone.getOffset(dtDec1994.getMillis()));
NoAssert.donothing(false, zone.isStandardOffset(dtDec1994.getMillis()));

        DateTime dtJun1995 = new DateTime(1995, 6, 1, 0, 0, 0, 0, zone);
NoAssert.donothing(3600000, zone.getStandardOffset(dtJun1995.getMillis()));
NoAssert.donothing(3600000, zone.getOffset(dtJun1995.getMillis()));
NoAssert.donothing(true, zone.isStandardOffset(dtJun1995.getMillis()));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToronto() {
        DateTimeZone zone = DateTimeZone.forID("America/Toronto");
        DateTime start = new DateTime(1927, 1, 1, 0, 0, 0, 0, zone);
NoAssert.donothing(-5 * 3600000, zone.getStandardOffset(start.getMillis()));
NoAssert.donothing(-5 * 3600000, zone.getOffset(start.getMillis()));

        DateTime summer1927 = new DateTime(zone.nextTransition(start.getMillis()), zone);
NoAssert.donothing(-4 * 3600000, zone.getOffset(summer1927.getMillis()));
NoAssert.donothing(new LocalDate(1927, 5, 1), summer1927.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, summer1927.getDayOfWeek());

        DateTime winter1927 = new DateTime(zone.nextTransition(summer1927.getMillis()), zone);
NoAssert.donothing(-5 * 3600000, zone.getOffset(winter1927.getMillis()));
NoAssert.donothing(new LocalDate(1927, 9, 25), winter1927.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, winter1927.getDayOfWeek());

        DateTime summer1928 = new DateTime(zone.nextTransition(winter1927.getMillis()), zone);
NoAssert.donothing(-4 * 3600000, zone.getOffset(summer1928.getMillis()));
NoAssert.donothing(new LocalDate(1928, 4, 29), summer1928.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, summer1928.getDayOfWeek());

        DateTime winter1928 = new DateTime(zone.nextTransition(summer1928.getMillis()), zone);
NoAssert.donothing(-5 * 3600000, zone.getOffset(winter1928.getMillis()));
NoAssert.donothing(new LocalDate(1928, 9, 30), winter1928.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, winter1928.getDayOfWeek());

        DateTime summer1929 = new DateTime(zone.nextTransition(winter1928.getMillis()), zone);
NoAssert.donothing(-4 * 3600000, zone.getOffset(summer1929.getMillis()));
NoAssert.donothing(new LocalDate(1929, 4, 28), summer1929.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, summer1929.getDayOfWeek());

        DateTime winter1929 = new DateTime(zone.nextTransition(summer1929.getMillis()), zone);
NoAssert.donothing(-5 * 3600000, zone.getOffset(winter1929.getMillis()));
NoAssert.donothing(new LocalDate(1929, 9, 29), winter1929.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, winter1929.getDayOfWeek());

        DateTime summer1930 = new DateTime(zone.nextTransition(winter1929.getMillis()), zone);
NoAssert.donothing(-4 * 3600000, zone.getOffset(summer1930.getMillis()));
NoAssert.donothing(new LocalDate(1930, 4, 27), summer1930.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, summer1930.getDayOfWeek());

        DateTime winter1930 = new DateTime(zone.nextTransition(summer1930.getMillis()), zone);
NoAssert.donothing(-5 * 3600000, zone.getOffset(winter1930.getMillis()));
NoAssert.donothing(new LocalDate(1930, 9, 28), winter1930.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, winter1930.getDayOfWeek());

        DateTime summer1931 = new DateTime(zone.nextTransition(winter1930.getMillis()), zone);
NoAssert.donothing(-4 * 3600000, zone.getOffset(summer1931.getMillis()));
NoAssert.donothing(new LocalDate(1931, 4, 26), summer1931.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, summer1931.getDayOfWeek());

        DateTime winter1931 = new DateTime(zone.nextTransition(summer1931.getMillis()), zone);
NoAssert.donothing(-5 * 3600000, zone.getOffset(winter1931.getMillis()));
NoAssert.donothing(new LocalDate(1931, 9, 27), winter1931.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, winter1931.getDayOfWeek());

        DateTime summer1932 = new DateTime(zone.nextTransition(winter1931.getMillis()), zone);
NoAssert.donothing(-4 * 3600000, zone.getOffset(summer1932.getMillis()));
NoAssert.donothing(new LocalDate(1932, 5, 1), summer1932.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, summer1932.getDayOfWeek());

        DateTime winter1932 = new DateTime(zone.nextTransition(summer1932.getMillis()), zone);
NoAssert.donothing(-5 * 3600000, zone.getOffset(winter1932.getMillis()));
NoAssert.donothing(new LocalDate(1932, 9, 25), winter1932.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, winter1932.getDayOfWeek());

        DateTime summer1933 = new DateTime(zone.nextTransition(winter1932.getMillis()), zone);
NoAssert.donothing(-4 * 3600000, zone.getOffset(summer1933.getMillis()));
NoAssert.donothing(new LocalDate(1933, 4, 30), summer1933.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, summer1933.getDayOfWeek());

        DateTime winter1933 = new DateTime(zone.nextTransition(summer1933.getMillis()), zone);
NoAssert.donothing(-5 * 3600000, zone.getOffset(winter1933.getMillis()));
NoAssert.donothing(new LocalDate(1933, 10, 1), winter1933.toLocalDate());
NoAssert.donothing(DateTimeConstants.SUNDAY, winter1933.getDayOfWeek());
    }

    //-----------------------------------------------------------------------
    // rule of style "Fri <= 1"
    @Test
    public void testJerusalem() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Jerusalem");
        DateTime winter = new DateTime(2006, 1, 1, 0, 0, 0, 0, zone);
NoAssert.donothing(true, zone.isStandardOffset(winter.getMillis()));

        DateTime cutover = new DateTime(zone.nextTransition(winter.getMillis()), zone);
NoAssert.donothing(false, zone.isStandardOffset(cutover.getMillis()));
NoAssert.donothing(5, cutover.getDayOfWeek());
NoAssert.donothing(31, cutover.getDayOfMonth());
NoAssert.donothing(3, cutover.getMonthOfYear());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization1() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();
        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone result = (DateTimeZone) ois.readObject();
        ois.close();

NoAssert.donothing(zone, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization2() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+01:00");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();
        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone result = (DateTimeZone) ois.readObject();
        ois.close();

NoAssert.donothing(zone, result);
    }

    @Test
    public void testCommentParse() throws Exception {
        // A bug in ZoneInfoCompiler's handling of comments broke Europe/Athens
        // after 1980. This test is included to make sure it doesn't break again.

        DateTimeZone zone = DateTimeZone.forID("Europe/Athens");
        DateTime dt = new DateTime(2005, 5, 5, 20, 10, 15, 0, zone);
NoAssert.donothing(1115313015000L, dt.getMillis());
    }

   //@Test
    public void testPatchedNameKeysLondon() throws Exception {
        // the tz database does not have unique name keys [1716305]
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
        String str1 = zone.getName(now.getMillis());
        String str2 = zone.getName(now.plusMonths(6).getMillis());
NoAssert.donothing(false, str1.equals(str2));
    }

    //@Test
    public void testPatchedNameKeysSydney() throws Exception {
        // the tz database does not have unique name keys [1716305]
        DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");

        DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
        String str1 = zone.getName(now.getMillis());
        String str2 = zone.getName(now.plusMonths(6).getMillis());
NoAssert.donothing(false, str1.equals(str2));
    }

    //@Test
    public void testPatchedNameKeysSydneyHistoric() throws Exception {
        // the tz database does not have unique name keys [1716305]
        DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");

        DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0);
        String str1 = zone.getName(now.getMillis());
        String str2 = zone.getName(now.plusMonths(6).getMillis());
NoAssert.donothing(false, str1.equals(str2));
    }

    //@Test
    public void testPatchedNameKeysGazaHistoric() throws Exception {
        // the tz database does not have unique name keys [1716305]
        DateTimeZone zone = DateTimeZone.forID("Africa/Johannesburg");

        DateTime now = new DateTime(1943, 1, 1, 0, 0, 0, 0);
        String str1 = zone.getName(now.getMillis());
        String str2 = zone.getName(now.plusMonths(6).getMillis());
NoAssert.donothing(false, str1.equals(str2));
    }

}
