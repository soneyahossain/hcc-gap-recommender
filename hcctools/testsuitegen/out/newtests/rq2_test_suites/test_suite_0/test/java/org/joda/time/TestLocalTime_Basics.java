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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics  { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception  {
        TestLocalTime_Basics TB= new TestLocalTime_Basics();
        TB.setUp(); TB.testGet_DateTimeFieldType(); TB.tearDown();
        TB.setUp(); TB.testSize(); TB.tearDown();
        TB.setUp(); TB.testGetFieldType_int(); TB.tearDown();
        TB.setUp(); TB.testGetFieldTypes(); TB.tearDown();
        TB.setUp(); TB.testGetField_int(); TB.tearDown();
        TB.setUp(); TB.testGetFields(); TB.tearDown();
        TB.setUp(); TB.testGetValue_int(); TB.tearDown();
        TB.setUp(); TB.testGetValues(); TB.tearDown();
        TB.setUp(); TB.testIsSupported_DateTimeFieldType(); TB.tearDown();
        TB.setUp(); TB.testIsSupported_DurationFieldType(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testCompareTo(); TB.tearDown();
        TB.setUp(); TB.testIsEqual_LocalTime(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_LocalTime(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_LocalTime(); TB.tearDown();
        TB.setUp(); TB.testWithField_DateTimeFieldType_int_1(); TB.tearDown();
        TB.setUp(); TB.testWithField_DateTimeFieldType_int_2(); TB.tearDown();
        TB.setUp(); TB.testWithField_DateTimeFieldType_int_3(); TB.tearDown();
        TB.setUp(); TB.testWithField_DateTimeFieldType_int_4(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_1(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_2(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_3(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_4(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_5(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_6(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_7(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_8(); TB.tearDown();
        TB.setUp(); TB.testPlus_RP(); TB.tearDown();
        TB.setUp(); TB.testPlusHours_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMinutes_int(); TB.tearDown();
        TB.setUp(); TB.testPlusSeconds_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMillis_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_RP(); TB.tearDown();
        TB.setUp(); TB.testMinusHours_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMinutes_int(); TB.tearDown();
        TB.setUp(); TB.testMinusSeconds_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMillis_int(); TB.tearDown();
        TB.setUp(); TB.testGetters(); TB.tearDown();
        TB.setUp(); TB.testWithers(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeTodayDefaultZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeToday_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeToday_nullZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_RI(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_nullRI(); TB.tearDown();
        TB.setUp(); TB.testProperty(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToString_String(); TB.tearDown();
        TB.setUp(); TB.testToString_String_Locale(); TB.tearDown();
        TB.setUp(); TB.testToString_DTFormatter(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestLocalTime_Basics.class);
    }

    public TestLocalTime_Basics(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testGet_DateTimeFieldType() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(10, test.get(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(20, test.get(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(30, test.get(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(40, test.get(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(TEST_TIME_NOW / 60000 , test.get(DateTimeFieldType.minuteOfDay()));
NoAssert.donothing(TEST_TIME_NOW / 1000 , test.get(DateTimeFieldType.secondOfDay()));
NoAssert.donothing(TEST_TIME_NOW , test.get(DateTimeFieldType.millisOfDay()));
NoAssert.donothing(10, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        test = new LocalTime(12, 30);
NoAssert.donothing(0, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(12, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        test = new LocalTime(14, 30);
NoAssert.donothing(2, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(2, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(14, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        test = new LocalTime(0, 30);
NoAssert.donothing(0, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(24, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        try {
            test.get(null);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.get(DateTimeFieldType.dayOfMonth());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSize() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(4, test.size());
    }

    @Test public void testGetFieldType_int() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
NoAssert.donothing(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
NoAssert.donothing(DateTimeFieldType.secondOfMinute(), test.getFieldType(2));
NoAssert.donothing(DateTimeFieldType.millisOfSecond(), test.getFieldType(3));
        try {
            test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getFieldType(5);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFieldTypes() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        DateTimeFieldType[] fields = test.getFieldTypes();
NoAssert.donothing(DateTimeFieldType.hourOfDay(), fields[0]);
NoAssert.donothing(DateTimeFieldType.minuteOfHour(), fields[1]);
NoAssert.donothing(DateTimeFieldType.secondOfMinute(), fields[2]);
NoAssert.donothing(DateTimeFieldType.millisOfSecond(), fields[3]);
NoAssert.donothing(test.getFieldTypes(), test.getFieldTypes());
    }

    @Test public void testGetField_int() {
        LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
NoAssert.donothing(COPTIC_UTC.hourOfDay(), test.getField(0));
NoAssert.donothing(COPTIC_UTC.minuteOfHour(), test.getField(1));
NoAssert.donothing(COPTIC_UTC.secondOfMinute(), test.getField(2));
NoAssert.donothing(COPTIC_UTC.millisOfSecond(), test.getField(3));
        try {
            test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getField(5);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFields() {
        LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        DateTimeField[] fields = test.getFields();
NoAssert.donothing(COPTIC_UTC.hourOfDay(), fields[0]);
NoAssert.donothing(COPTIC_UTC.minuteOfHour(), fields[1]);
NoAssert.donothing(COPTIC_UTC.secondOfMinute(), fields[2]);
NoAssert.donothing(COPTIC_UTC.millisOfSecond(), fields[3]);
NoAssert.donothing(test.getFields(), test.getFields());
    }

    @Test public void testGetValue_int() {
        LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
NoAssert.donothing(10, test.getValue(0));
NoAssert.donothing(20, test.getValue(1));
NoAssert.donothing(30, test.getValue(2));
NoAssert.donothing(40, test.getValue(3));
        try {
            test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getValue(5);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetValues() {
        LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        int[] values = test.getValues();
NoAssert.donothing(10, values[0]);
NoAssert.donothing(20, values[1]);
NoAssert.donothing(30, values[2]);
NoAssert.donothing(40, values[3]);
NoAssert.donothing(test.getValues(), test.getValues());
    }

    @Test public void testIsSupported_DateTimeFieldType() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.secondOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.millisOfDay()));
        
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));
        
NoAssert.donothing(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(false, test.isSupported((DateTimeFieldType) null));
        
        DateTimeFieldType d = new DateTimeFieldType("hours") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {
                return DurationFieldType.hours();
            }
            public DurationFieldType getRangeDurationType() {
                return null;
            }
            public DateTimeField getField(Chronology chronology) {
                return chronology.hourOfDay();
            }
        };
        assertEquals(false, test.isSupported(d));
        
        d = new DateTimeFieldType("hourOfYear") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {
                return DurationFieldType.hours();
            }
            public DurationFieldType getRangeDurationType() {
                return DurationFieldType.years();
            }
            public DateTimeField getField(Chronology chronology) {
                return chronology.hourOfDay();
            }
        };
        assertEquals(false, test.isSupported(d));
    }

    @Test public void testIsSupported_DurationFieldType() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(true, test.isSupported(DurationFieldType.hours()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.minutes()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.seconds()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.millis()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.halfdays()));
        
NoAssert.donothing(false, test.isSupported(DurationFieldType.days()));
NoAssert.donothing(false, test.isSupported((DurationFieldType) null));
    }

    @SuppressWarnings("deprecation")
    @Test public void testEqualsHashCode() {
        LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        LocalTime test3 = new LocalTime(15, 20, 30, 40);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC)));
NoAssert.donothing(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode());
NoAssert.donothing(true, test1.equals(new MockInstant()));
NoAssert.donothing(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }

    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }
        public int[] getValues() {
            return new int[] {10, 20, 30, 40};
        }
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testCompareTo() {
        LocalTime test1 = new LocalTime(10, 20, 30, 40);
        LocalTime test1a = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        LocalTime test2 = new LocalTime(10, 20, 35, 40);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
        LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
NoAssert.donothing(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
NoAssert.donothing(0, test3.compareTo(test2));
        
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.hourOfDay(),
            DateTimeFieldType.minuteOfHour(),
            DateTimeFieldType.secondOfMinute(),
            DateTimeFieldType.millisOfSecond(),
        };
        int[] values = new int[] {10, 20, 30, 40};
        Partial p = new Partial(types, values);
NoAssert.donothing(0, test1.compareTo(p));
NoAssert.donothing(0, test1.compareTo(new TimeOfDay(10, 20, 30, 40)));
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
    @Test public void testIsEqual_LocalTime() {
        LocalTime test1 = new LocalTime(10, 20, 30, 40);
        LocalTime test1a = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        LocalTime test2 = new LocalTime(10, 20, 35, 40);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
        LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
        try {
            new LocalTime(10, 20, 35, 40).isEqual(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsBefore_LocalTime() {
        LocalTime test1 = new LocalTime(10, 20, 30, 40);
        LocalTime test1a = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
NoAssert.donothing(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));
        
        LocalTime test2 = new LocalTime(10, 20, 35, 40);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
        try {
            new LocalTime(10, 20, 35, 40).isBefore(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsAfter_LocalTime() {
        LocalTime test1 = new LocalTime(10, 20, 30, 40);
        LocalTime test1a = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
NoAssert.donothing(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        LocalTime test2 = new LocalTime(10, 20, 35, 40);
NoAssert.donothing(false, test1.isAfter(test2));
NoAssert.donothing(true, test2.isAfter(test1));
        
        LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isAfter(test3));
NoAssert.donothing(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
        try {
            new LocalTime(10, 20, 35, 40).isAfter(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testWithField_DateTimeFieldType_int_1() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15);
        
NoAssert.donothing(new LocalTime(10, 20, 30, 40), test);
NoAssert.donothing(new LocalTime(15, 20, 30, 40), result);
    }

    @Test public void testWithField_DateTimeFieldType_int_2() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField_DateTimeFieldType_int_3() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        try {
            test.withField(DateTimeFieldType.dayOfMonth(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField_DateTimeFieldType_int_4() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 10);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFieldAdded_DurationFieldType_int_1() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6);
        
NoAssert.donothing(new LocalTime(10, 20, 30, 40), test);
NoAssert.donothing(new LocalTime(16, 20, 30, 40), result);
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_2() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_3() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_4() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0);
NoAssert.donothing(test, result);
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_5() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        try {
            test.withFieldAdded(DurationFieldType.days(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_6() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 16);
        
NoAssert.donothing(new LocalTime(10, 20, 30, 40), test);
NoAssert.donothing(new LocalTime(2, 20, 30, 40), result);
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_7() {
        LocalTime test = new LocalTime(23, 59, 59, 999);
        LocalTime result = test.withFieldAdded(DurationFieldType.millis(), 1);
NoAssert.donothing(new LocalTime(0, 0, 0, 0), result);
        
        test = new LocalTime(23, 59, 59, 999);
        result = test.withFieldAdded(DurationFieldType.seconds(), 1);
NoAssert.donothing(new LocalTime(0, 0, 0, 999), result);
        
        test = new LocalTime(23, 59, 59, 999);
        result = test.withFieldAdded(DurationFieldType.minutes(), 1);
NoAssert.donothing(new LocalTime(0, 0, 59, 999), result);
        
        test = new LocalTime(23, 59, 59, 999);
        result = test.withFieldAdded(DurationFieldType.hours(), 1);
NoAssert.donothing(new LocalTime(0, 59, 59, 999), result);
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_8() {
        LocalTime test = new LocalTime(0, 0, 0, 0);
        LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1);
NoAssert.donothing(new LocalTime(23, 59, 59, 999), result);
        
        test = new LocalTime(0, 0, 0, 0);
        result = test.withFieldAdded(DurationFieldType.seconds(), -1);
NoAssert.donothing(new LocalTime(23, 59, 59, 0), result);
        
        test = new LocalTime(0, 0, 0, 0);
        result = test.withFieldAdded(DurationFieldType.minutes(), -1);
NoAssert.donothing(new LocalTime(23, 59, 0, 0), result);
        
        test = new LocalTime(0, 0, 0, 0);
        result = test.withFieldAdded(DurationFieldType.hours(), -1);
NoAssert.donothing(new LocalTime(23, 0, 0, 0), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_RP() {
        LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON);
        LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusHours_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.plusHours(1);
        LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusHours(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMinutes_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.plusMinutes(1);
        LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusMinutes(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusSeconds_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.plusSeconds(1);
        LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusSeconds(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMillis_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.plusMillis(1);
        LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusMillis(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMinus_RP() {
        LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON);
        LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusHours_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.minusHours(1);
        LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusHours(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMinutes_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.minusMinutes(1);
        LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusMinutes(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusSeconds_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.minusSeconds(1);
        LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusSeconds(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMillis_int() {
        LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        LocalTime result = test.minusMillis(1);
        LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusMillis(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testGetters() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(TEST_TIME_NOW, test.getMillisOfDay());
    }

    //-----------------------------------------------------------------------
    @Test public void testWithers() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
        check(test.withHourOfDay(6), 6, 20, 30, 40);
        check(test.withMinuteOfHour(6), 10, 6, 30, 40);
        check(test.withSecondOfMinute(6), 10, 20, 6, 40);
        check(test.withMillisOfSecond(6), 10, 20, 30, 6);
        check(test.withMillisOfDay(61234), 0, 1, 1, 234);
        try {
            test.withHourOfDay(-1);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.withHourOfDay(24);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTimeTodayDefaultZone() {
        LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTimeToday();
        check(base, 10, 20, 30, 40);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        expected = expected.hourOfDay().setCopy(10);
        expected = expected.minuteOfHour().setCopy(20);
        expected = expected.secondOfMinute().setCopy(30);
        expected = expected.millisOfSecond().setCopy(40);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTimeToday_Zone() {
        LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTimeToday(TOKYO);
        check(base, 10, 20, 30, 40);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        expected = expected.hourOfDay().setCopy(10);
        expected = expected.minuteOfHour().setCopy(20);
        expected = expected.secondOfMinute().setCopy(30);
        expected = expected.millisOfSecond().setCopy(40);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTimeToday_nullZone() {
        LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTimeToday((DateTimeZone) null);
        check(base, 10, 20, 30, 40);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        expected = expected.hourOfDay().setCopy(10);
        expected = expected.minuteOfHour().setCopy(20);
        expected = expected.secondOfMinute().setCopy(30);
        expected = expected.millisOfSecond().setCopy(40);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_RI() {
        LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        DateTime dt = new DateTime(0L); // LONDON zone
NoAssert.donothing("1970-01-01T01:00:00.000+01:00", dt.toString());
        
        DateTime test = base.toDateTime(dt);
        check(base, 10, 20, 30, 40);
NoAssert.donothing("1970-01-01T01:00:00.000+01:00", dt.toString());
NoAssert.donothing("1970-01-01T10:20:30.040+01:00", test.toString());
    }

    @Test public void testToDateTime_nullRI() {
        LocalTime base = new LocalTime(1, 2, 3, 4);
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        
        DateTime test = base.toDateTime((ReadableInstant) null);
        check(base, 1, 2, 3, 4);
NoAssert.donothing("1970-01-02T01:02:03.004+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testProperty() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay()));
        
NoAssert.donothing(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime());
NoAssert.donothing(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime());
NoAssert.donothing(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime());
NoAssert.donothing(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime());
NoAssert.donothing(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime());
NoAssert.donothing(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime());
NoAssert.donothing(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime());
        
        try {
            test.property(DateTimeFieldType.dayOfWeek());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.property(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalTime result = (LocalTime) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
NoAssert.donothing(Arrays.equals(test.getValues(), result.getValues()));
NoAssert.donothing(Arrays.equals(test.getFields(), result.getFields()));
NoAssert.donothing(test.getChronology(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing("10:20:30.040", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
NoAssert.donothing("10:20:30.040", test.toString((String) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String_Locale() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing("10 20", test.toString("H m", Locale.ENGLISH));
NoAssert.donothing("10:20:30.040", test.toString(null, Locale.ENGLISH));
NoAssert.donothing("10 20", test.toString("H m", null));
NoAssert.donothing("10:20:30.040", test.toString(null, null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_DTFormatter() {
        LocalTime test = new LocalTime(10, 20, 30, 40);
NoAssert.donothing("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
NoAssert.donothing("10:20:30.040", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {
NoAssert.donothing(hour, test.getHourOfDay());
NoAssert.donothing(min, test.getMinuteOfHour());
NoAssert.donothing(sec, test.getSecondOfMinute());
NoAssert.donothing(milli, test.getMillisOfSecond());
    }
}
