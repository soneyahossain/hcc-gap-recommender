/*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Basics  { //extends TestCase {
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
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception  {
        TestInstant_Basics TB= new TestInstant_Basics();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testGet_DateTimeFieldType(); TB.tearDown();
        TB.setUp(); TB.testGet_DateTimeField(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testCompareTo(); TB.tearDown();
        TB.setUp(); TB.testIsEqual_long(); TB.tearDown();
        TB.setUp(); TB.testIsEqualNow(); TB.tearDown();
        TB.setUp(); TB.testIsEqual_RI(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_long(); TB.tearDown();
        TB.setUp(); TB.testIsBeforeNow(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_RI(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_long(); TB.tearDown();
        TB.setUp(); TB.testIsAfterNow(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_RI(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToInstant(); TB.tearDown();
        TB.setUp(); TB.testToDateTime(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeISO(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTimeISO(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToDate(); TB.tearDown();
        TB.setUp(); TB.testWithMillis_long(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_long_int(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int(); TB.tearDown();
        TB.setUp(); TB.testPlus_long(); TB.tearDown();
        TB.setUp(); TB.testPlus_RD(); TB.tearDown();
        TB.setUp(); TB.testMinus_long(); TB.tearDown();
        TB.setUp(); TB.testMinus_RD(); TB.tearDown();
        TB.setUp(); TB.testImmutable(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestInstant_Basics.class);
    }

    public TestInstant_Basics(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testGet_DateTimeFieldType() {
        Instant test = new Instant();  // 2002-06-09
NoAssert.donothing(1, test.get(DateTimeFieldType.era()));
NoAssert.donothing(20, test.get(DateTimeFieldType.centuryOfEra()));
NoAssert.donothing(2, test.get(DateTimeFieldType.yearOfCentury()));
NoAssert.donothing(2002, test.get(DateTimeFieldType.yearOfEra()));
NoAssert.donothing(2002, test.get(DateTimeFieldType.year()));
NoAssert.donothing(6, test.get(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(9, test.get(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(2002, test.get(DateTimeFieldType.weekyear()));
NoAssert.donothing(23, test.get(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(7, test.get(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(160, test.get(DateTimeFieldType.dayOfYear()));
NoAssert.donothing(0, test.get(DateTimeFieldType.halfdayOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.hourOfHalfday()));  // UTC zone
NoAssert.donothing(24, test.get(DateTimeFieldType.clockhourOfDay()));  // UTC zone
NoAssert.donothing(12, test.get(DateTimeFieldType.clockhourOfHalfday()));  // UTC zone
        assertEquals(0, test.get(DateTimeFieldType.hourOfDay()));  // UTC zone
NoAssert.donothing(0, test.get(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(0, test.get(DateTimeFieldType.minuteOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(0, test.get(DateTimeFieldType.secondOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(0, test.get(DateTimeFieldType.millisOfDay()));
        try {
            test.get((DateTimeFieldType) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testGet_DateTimeField() {
        Instant test = new Instant();  // 2002-06-09
NoAssert.donothing(1, test.get(ISOChronology.getInstance().era()));
NoAssert.donothing(20, test.get(ISOChronology.getInstance().centuryOfEra()));
NoAssert.donothing(2, test.get(ISOChronology.getInstance().yearOfCentury()));
NoAssert.donothing(2002, test.get(ISOChronology.getInstance().yearOfEra()));
NoAssert.donothing(2002, test.get(ISOChronology.getInstance().year()));
NoAssert.donothing(6, test.get(ISOChronology.getInstance().monthOfYear()));
NoAssert.donothing(9, test.get(ISOChronology.getInstance().dayOfMonth()));
NoAssert.donothing(2002, test.get(ISOChronology.getInstance().weekyear()));
NoAssert.donothing(23, test.get(ISOChronology.getInstance().weekOfWeekyear()));
NoAssert.donothing(7, test.get(ISOChronology.getInstance().dayOfWeek()));
NoAssert.donothing(160, test.get(ISOChronology.getInstance().dayOfYear()));
NoAssert.donothing(0, test.get(ISOChronology.getInstance().halfdayOfDay()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().hourOfHalfday()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().clockhourOfDay()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().clockhourOfHalfday()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().hourOfDay()));
NoAssert.donothing(0, test.get(ISOChronology.getInstance().minuteOfHour()));
NoAssert.donothing(60, test.get(ISOChronology.getInstance().minuteOfDay()));
NoAssert.donothing(0, test.get(ISOChronology.getInstance().secondOfMinute()));
NoAssert.donothing(60 * 60, test.get(ISOChronology.getInstance().secondOfDay()));
NoAssert.donothing(0, test.get(ISOChronology.getInstance().millisOfSecond()));
NoAssert.donothing(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay()));
        try {
            test.get((DateTimeField) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testGetMethods() {
        Instant test = new Instant();
        
NoAssert.donothing(ISOChronology.getInstanceUTC(), test.getChronology());
NoAssert.donothing(DateTimeZone.UTC, test.getZone());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    @Test public void testEqualsHashCode() {
        Instant test1 = new Instant(TEST_TIME1);
        Instant test2 = new Instant(TEST_TIME1);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        Instant test3 = new Instant(TEST_TIME2);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
        assertEquals(true, test1.equals(new MockInstant()));
NoAssert.donothing(false, test1.equals(new DateTime(TEST_TIME1)));
    }
    
    class MockInstant extends AbstractInstant {
        public String toString() {
            return null;
        }
        public long getMillis() {
            return TEST_TIME1;
        }
        public Chronology getChronology() {
            return ISOChronology.getInstanceUTC();
        }
    }

    @Test public void testCompareTo() {
        Instant test1 = new Instant(TEST_TIME1);
        Instant test1a = new Instant(TEST_TIME1);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        Instant test2 = new Instant(TEST_TIME2);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
NoAssert.donothing(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
NoAssert.donothing(0, test3.compareTo(test2));
        
NoAssert.donothing(+1, test2.compareTo(new MockInstant()));
NoAssert.donothing(0, test1.compareTo(new MockInstant()));
        
        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsEqual_long() {
NoAssert.donothing(false, new Instant(TEST_TIME1).isEqual(TEST_TIME2));
NoAssert.donothing(true, new Instant(TEST_TIME1).isEqual(TEST_TIME1));
NoAssert.donothing(false, new Instant(TEST_TIME2).isEqual(TEST_TIME1));
    }
    
    @Test public void testIsEqualNow() {
NoAssert.donothing(false, new Instant(TEST_TIME_NOW - 1).isEqualNow());
NoAssert.donothing(true, new Instant(TEST_TIME_NOW).isEqualNow());
NoAssert.donothing(false, new Instant(TEST_TIME_NOW + 1).isEqualNow());
    }
    
    @Test public void testIsEqual_RI() {
        Instant test1 = new Instant(TEST_TIME1);
        Instant test1a = new Instant(TEST_TIME1);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        Instant test2 = new Instant(TEST_TIME2);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
NoAssert.donothing(false, test2.isEqual(new MockInstant()));
NoAssert.donothing(true, test1.isEqual(new MockInstant()));
        
NoAssert.donothing(false, new Instant(TEST_TIME_NOW + 1).isEqual(null));
NoAssert.donothing(true, new Instant(TEST_TIME_NOW).isEqual(null));
NoAssert.donothing(false, new Instant(TEST_TIME_NOW - 1).isEqual(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsBefore_long() {
NoAssert.donothing(true, new Instant(TEST_TIME1).isBefore(TEST_TIME2));
NoAssert.donothing(false, new Instant(TEST_TIME1).isBefore(TEST_TIME1));
NoAssert.donothing(false, new Instant(TEST_TIME2).isBefore(TEST_TIME1));
    }
    
    @Test public void testIsBeforeNow() {
NoAssert.donothing(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow());
NoAssert.donothing(false, new Instant(TEST_TIME_NOW).isBeforeNow());
NoAssert.donothing(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow());
    }
    
    @Test public void testIsBefore_RI() {
        Instant test1 = new Instant(TEST_TIME1);
        Instant test1a = new Instant(TEST_TIME1);
NoAssert.donothing(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
NoAssert.donothing(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));
        
        Instant test2 = new Instant(TEST_TIME2);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
NoAssert.donothing(false, test2.isBefore(new MockInstant()));
NoAssert.donothing(false, test1.isBefore(new MockInstant()));
        
NoAssert.donothing(false, new Instant(TEST_TIME_NOW + 1).isBefore(null));
NoAssert.donothing(false, new Instant(TEST_TIME_NOW).isBefore(null));
NoAssert.donothing(true, new Instant(TEST_TIME_NOW - 1).isBefore(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsAfter_long() {
NoAssert.donothing(false, new Instant(TEST_TIME1).isAfter(TEST_TIME2));
NoAssert.donothing(false, new Instant(TEST_TIME1).isAfter(TEST_TIME1));
NoAssert.donothing(true, new Instant(TEST_TIME2).isAfter(TEST_TIME1));
    }
    
    @Test public void testIsAfterNow() {
NoAssert.donothing(false, new Instant(TEST_TIME_NOW - 1).isAfterNow());
NoAssert.donothing(false, new Instant(TEST_TIME_NOW).isAfterNow());
NoAssert.donothing(true, new Instant(TEST_TIME_NOW + 1).isAfterNow());
    }
    
    @Test public void testIsAfter_RI() {
        Instant test1 = new Instant(TEST_TIME1);
        Instant test1a = new Instant(TEST_TIME1);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
NoAssert.donothing(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        Instant test2 = new Instant(TEST_TIME2);
NoAssert.donothing(false, test1.isAfter(test2));
NoAssert.donothing(true, test2.isAfter(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
NoAssert.donothing(false, test1.isAfter(test3));
NoAssert.donothing(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
NoAssert.donothing(true, test2.isAfter(new MockInstant()));
NoAssert.donothing(false, test1.isAfter(new MockInstant()));
        
NoAssert.donothing(true, new Instant(TEST_TIME_NOW + 1).isAfter(null));
NoAssert.donothing(false, new Instant(TEST_TIME_NOW).isAfter(null));
NoAssert.donothing(false, new Instant(TEST_TIME_NOW - 1).isAfter(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Instant test = new Instant(TEST_TIME_NOW);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Instant result = (Instant) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        Instant test = new Instant(TEST_TIME_NOW);
NoAssert.donothing("2002-06-09T00:00:00.000Z", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToInstant() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.toInstant();
NoAssert.donothing(test, result);
    }

    @Test public void testToDateTime() {
        Instant test = new Instant(TEST_TIME1);
        DateTime result = test.toDateTime();
NoAssert.donothing(TEST_TIME1, result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToDateTimeISO() {
        Instant test = new Instant(TEST_TIME1);
        DateTime result = test.toDateTimeISO();
NoAssert.donothing(DateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToDateTime_DateTimeZone() {
        Instant test = new Instant(TEST_TIME1);
        DateTime result = test.toDateTime(LONDON);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(LONDON), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toDateTime(PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToDateTime_Chronology() {
        Instant test = new Instant(TEST_TIME1);
        DateTime result = test.toDateTime(ISOChronology.getInstance());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toDateTime(GregorianChronology.getInstance(PARIS));
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GregorianChronology.getInstance(PARIS), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toDateTime((Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToMutableDateTime() {
        Instant test = new Instant(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime();
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToMutableDateTimeISO() {
        Instant test = new Instant(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTimeISO();
NoAssert.donothing(MutableDateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToMutableDateTime_DateTimeZone() {
        Instant test = new Instant(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(LONDON);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toMutableDateTime(PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToMutableDateTime_Chronology() {
        Instant test = new Instant(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GregorianChronology.getInstance(PARIS), result.getChronology());

        test = new Instant(TEST_TIME1);
        result = test.toMutableDateTime((Chronology) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToDate() {
        Instant test = new Instant(TEST_TIME1);
        Date result = test.toDate();
NoAssert.donothing(test.getMillis(), result.getTime());
    }

    //-----------------------------------------------------------------------
    @Test public void testWithMillis_long() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.withMillis(TEST_TIME2);
NoAssert.donothing(TEST_TIME2, result.getMillis());
NoAssert.donothing(test.getChronology(), result.getChronology());
        
        test = new Instant(TEST_TIME1);
        result = test.withMillis(TEST_TIME1);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithDurationAdded_long_int() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.withDurationAdded(123456789L, 1);
        Instant expected = new Instant(TEST_TIME1 + 123456789L);
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(123456789L, 0);
NoAssert.donothing(test, result);
        
        result = test.withDurationAdded(123456789L, 2);
        expected = new Instant(TEST_TIME1 + (2L * 123456789L));
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(123456789L, -3);
        expected = new Instant(TEST_TIME1 - (3L * 123456789L));
NoAssert.donothing(expected, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithDurationAdded_RD_int() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.withDurationAdded(new Duration(123456789L), 1);
        Instant expected = new Instant(TEST_TIME1 + 123456789L);
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(null, 1);
NoAssert.donothing(test, result);
        
        result = test.withDurationAdded(new Duration(123456789L), 0);
NoAssert.donothing(test, result);
        
        result = test.withDurationAdded(new Duration(123456789L), 2);
        expected = new Instant(TEST_TIME1 + (2L * 123456789L));
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(new Duration(123456789L), -3);
        expected = new Instant(TEST_TIME1 - (3L * 123456789L));
NoAssert.donothing(expected, result);
    }
    
    //-----------------------------------------------------------------------    
    @Test public void testPlus_long() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.plus(123456789L);
        Instant expected = new Instant(TEST_TIME1 + 123456789L);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testPlus_RD() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.plus(new Duration(123456789L));
        Instant expected = new Instant(TEST_TIME1 + 123456789L);
NoAssert.donothing(expected, result);
        
        result = test.plus((ReadableDuration) null);
NoAssert.donothing(test, result);
    }
    
    //-----------------------------------------------------------------------    
    @Test public void testMinus_long() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.minus(123456789L);
        Instant expected = new Instant(TEST_TIME1 - 123456789L);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testMinus_RD() {
        Instant test = new Instant(TEST_TIME1);
        Instant result = test.minus(new Duration(123456789L));
        Instant expected = new Instant(TEST_TIME1 - 123456789L);
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadableDuration) null);
NoAssert.donothing(test, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testImmutable() {
NoAssert.donothing(Modifier.isFinal(Instant.class.getModifiers()));
    }

}
