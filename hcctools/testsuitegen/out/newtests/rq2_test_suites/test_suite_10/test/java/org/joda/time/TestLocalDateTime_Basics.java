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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Basics  { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_NEW_YORK = ISOChronology.getInstance(NEW_YORK);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private int MILLIS_OF_DAY_UTC =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);

    private long TEST_TIME_NOW_UTC =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY + MILLIS_OF_DAY_UTC;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception  {
        TestLocalDateTime_Basics TB= new TestLocalDateTime_Basics();
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
        TB.setUp(); TB.testIsEqual_LocalDateTime(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_LocalDateTime(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_LocalDateTime(); TB.tearDown();
        TB.setUp(); TB.testWithDate(); TB.tearDown();
        TB.setUp(); TB.testWithTime(); TB.tearDown();
        TB.setUp(); TB.testWithField_DateTimeFieldType_int_1(); TB.tearDown();
        TB.setUp(); TB.testWithField_DateTimeFieldType_int_2(); TB.tearDown();
        TB.setUp(); TB.testWithField_DateTimeFieldType_int_3(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_1(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_2(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_3(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_DurationFieldType_int_4(); TB.tearDown();
        TB.setUp(); TB.testPlus_RP(); TB.tearDown();
        TB.setUp(); TB.testPlusYears_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testPlusWeeks_int(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int(); TB.tearDown();
        TB.setUp(); TB.testPlusHours_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMinutes_int(); TB.tearDown();
        TB.setUp(); TB.testPlusSeconds_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMillis_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_RP(); TB.tearDown();
        TB.setUp(); TB.testMinusYears_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testMinusWeeks_int(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int(); TB.tearDown();
        TB.setUp(); TB.testMinusHours_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMinutes_int(); TB.tearDown();
        TB.setUp(); TB.testMinusSeconds_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMillis_int(); TB.tearDown();
        TB.setUp(); TB.testGetters(); TB.tearDown();
        TB.setUp(); TB.testWithers(); TB.tearDown();
        TB.setUp(); TB.testToDateTime(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_nullZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_Zone_dstGap(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_Zone_dstOverlap(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_Zone_dstOverlap_NewYork(); TB.tearDown();
        TB.setUp(); TB.testToLocalDate(); TB.tearDown();
        TB.setUp(); TB.testToLocalTime(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_RI(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_nullRI(); TB.tearDown();
        TB.setUp(); TB.testToDate_summer(); TB.tearDown();
        TB.setUp(); TB.testToDate_winter(); TB.tearDown();
        TB.setUp(); TB.testToDate_springDST(); TB.tearDown();
        TB.setUp(); TB.testToDate_springDST_2Hour40Savings(); TB.tearDown();
        TB.setUp(); TB.testToDate_autumnDST(); TB.tearDown();
        TB.setUp(); TB.testToDate_summer_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDate_winter_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDate_springDST_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDate_springDST_2Hour40Savings_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDate_autumnDST_Zone(); TB.tearDown();
        TB.setUp(); TB.testProperty(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToString_String(); TB.tearDown();
        TB.setUp(); TB.testToString_String_Locale(); TB.tearDown();
        TB.setUp(); TB.testToString_DTFormatter(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Basics.class);
    }

    public TestLocalDateTime_Basics(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
        systemDefaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(systemDefaultLocale);
        systemDefaultLocale = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testGet_DateTimeFieldType() {
        LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(1970, test.get(DateTimeFieldType.year()));
NoAssert.donothing(6, test.get(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(9, test.get(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(2, test.get(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(160, test.get(DateTimeFieldType.dayOfYear()));
NoAssert.donothing(24, test.get(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(1970, test.get(DateTimeFieldType.weekyear()));
NoAssert.donothing(10, test.get(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(20, test.get(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(30, test.get(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(40, test.get(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(MILLIS_OF_DAY_UTC / 60000 , test.get(DateTimeFieldType.minuteOfDay()));
NoAssert.donothing(MILLIS_OF_DAY_UTC / 1000 , test.get(DateTimeFieldType.secondOfDay()));
NoAssert.donothing(MILLIS_OF_DAY_UTC , test.get(DateTimeFieldType.millisOfDay()));
NoAssert.donothing(10, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        
        test = new LocalDateTime(1970, 6, 9, 12, 30);
NoAssert.donothing(0, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(12, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        test = new LocalDateTime(1970, 6, 9, 14, 30);
        assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(2, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(14, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        test = new LocalDateTime(1970, 6, 9, 0, 30);
NoAssert.donothing(0, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(24, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        try {
            test.get(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSize() {
        LocalDateTime test = new LocalDateTime();
NoAssert.donothing(4, test.size());
    }

    @Test public void testGetFieldType_int() {
        LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        assertSame(DateTimeFieldType.year(), test.getFieldType(0));
NoAssert.donothing(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
NoAssert.donothing(DateTimeFieldType.millisOfDay(), test.getFieldType(3));
        try {
            test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFieldTypes() {
        LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        DateTimeFieldType[] fields = test.getFieldTypes();
NoAssert.donothing(DateTimeFieldType.year(), fields[0]);
NoAssert.donothing(DateTimeFieldType.monthOfYear(), fields[1]);
        assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
NoAssert.donothing(DateTimeFieldType.millisOfDay(), fields[3]);
NoAssert.donothing(test.getFieldTypes(), test.getFieldTypes());
    }

    @Test public void testGetField_int() {
        LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
NoAssert.donothing(COPTIC_UTC.year(), test.getField(0));
NoAssert.donothing(COPTIC_UTC.monthOfYear(), test.getField(1));
NoAssert.donothing(COPTIC_UTC.dayOfMonth(), test.getField(2));
NoAssert.donothing(COPTIC_UTC.millisOfDay(), test.getField(3));
        try {
            test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getField(3);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFields() {
        LocalDateTime test = new LocalDateTime(COPTIC_PARIS);
        DateTimeField[] fields = test.getFields();
NoAssert.donothing(COPTIC_UTC.year(), fields[0]);
NoAssert.donothing(COPTIC_UTC.monthOfYear(), fields[1]);
NoAssert.donothing(COPTIC_UTC.dayOfMonth(), fields[2]);
NoAssert.donothing(COPTIC_UTC.millisOfDay(), fields[3]);
        assertNotSame(test.getFields(), test.getFields());
    }

    @Test public void testGetValue_int() {
        LocalDateTime test = new LocalDateTime(ISO_UTC);
NoAssert.donothing(1970, test.getValue(0));
NoAssert.donothing(6, test.getValue(1));
        assertEquals(9, test.getValue(2));
NoAssert.donothing(MILLIS_OF_DAY_UTC, test.getValue(3));
        try {
            test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetValues() {
        LocalDateTime test = new LocalDateTime(ISO_UTC);
        int[] values = test.getValues();
NoAssert.donothing(1970, values[0]);
        assertEquals(6, values[1]);
NoAssert.donothing(9, values[2]);
        assertEquals(MILLIS_OF_DAY_UTC, values[3]);
NoAssert.donothing(test.getValues(), test.getValues());
    }

    @Test public void testIsSupported_DateTimeFieldType() {
        LocalDateTime test = new LocalDateTime();
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.year()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfYear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.weekyear()));
        assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
        assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.era()));
        
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
        
NoAssert.donothing(false, test.isSupported((DateTimeFieldType) null));
    }

    @Test public void testIsSupported_DurationFieldType() {
        LocalDateTime test = new LocalDateTime();
NoAssert.donothing(false, test.isSupported(DurationFieldType.eras()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.centuries()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.years()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.months()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.weekyears()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.weeks()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.days()));
        
NoAssert.donothing(true, test.isSupported(DurationFieldType.hours()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.minutes()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.seconds()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.millis()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.halfdays()));
        
NoAssert.donothing(false, test.isSupported((DurationFieldType) null));
    }

    @Test public void testEqualsHashCode() {
        LocalDateTime test1 = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        LocalDateTime test2 = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
        assertEquals(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        LocalDateTime test3 = new LocalDateTime(1971, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockInstant()));
        Partial partial = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth(), DateTimeFieldType.millisOfDay()},
                new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC}, COPTIC_PARIS);
NoAssert.donothing(true, test1.equals(partial));
NoAssert.donothing(true, test1.hashCode() == partial.hashCode());
NoAssert.donothing(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }
        public int[] getValues() {
            return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testCompareTo() {
        LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
        LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
NoAssert.donothing(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
NoAssert.donothing(0, test3.compareTo(test2));
        
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
            DateTimeFieldType.millisOfDay(),
        };
        int[] values = new int[] {2005, 6, 2, MILLIS_OF_DAY_UTC};
        Partial p = new Partial(types, values);
NoAssert.donothing(0, test1.compareTo(p));
        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        try {
            @SuppressWarnings("deprecation")
            YearMonthDay ymd = new YearMonthDay();
            test1.compareTo(ymd);
            fail();
        } catch (ClassCastException ex) {}
        try {
            @SuppressWarnings("deprecation")
            TimeOfDay tod = new TimeOfDay();
            test1.compareTo(tod);
            fail();
        } catch (ClassCastException ex) {}
        Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        try {
            new LocalDateTime(1970, 6, 9, 10, 20, 30, 40).compareTo(partial);
            fail();
        } catch (ClassCastException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsEqual_LocalDateTime() {
        LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        assertEquals(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
        LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
        try {
            new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isEqual(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsBefore_LocalDateTime() {
        LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
NoAssert.donothing(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
NoAssert.donothing(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));
        
        LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
        try {
            new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsAfter_LocalDateTime() {
        LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
        LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
NoAssert.donothing(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40);
NoAssert.donothing(false, test1.isAfter(test2));
NoAssert.donothing(true, test2.isAfter(test1));
        
        LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC);
NoAssert.donothing(false, test1.isAfter(test3));
        assertEquals(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
        try {
            new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isAfter(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testWithDate() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        LocalDateTime result = test.withDate(2006, 2, 1);
        
        check(test, 2004, 6, 9, 10, 20, 30, 40);
        check(result, 2006, 2, 1, 10, 20, 30, 40);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithTime() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        LocalDateTime result = test.withTime(9, 8, 7, 6);
        
        check(test, 2004, 6, 9, 10, 20, 30, 40);
        check(result, 2004, 6, 9, 9, 8, 7, 6);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithField_DateTimeFieldType_int_1() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        LocalDateTime result = test.withField(DateTimeFieldType.year(), 2006);
        
NoAssert.donothing(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
NoAssert.donothing(new LocalDateTime(2006, 6, 9, 10, 20, 30, 40), result);
    }

    @Test public void testWithField_DateTimeFieldType_int_2() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField_DateTimeFieldType_int_3() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        LocalDateTime result = test.withField(DateTimeFieldType.year(), 2004);
NoAssert.donothing(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFieldAdded_DurationFieldType_int_1() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 6);
        
NoAssert.donothing(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test);
NoAssert.donothing(new LocalDateTime(2010, 6, 9, 10, 20, 30, 40), result);
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_2() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_3() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_DurationFieldType_int_4() {
        LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40);
        LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_RP() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8));
        LocalDateTime expected = new LocalDateTime(2003, 7, 29, 15, 26, 37, 48, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusYears_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusYears(1);
        LocalDateTime expected = new LocalDateTime(2003, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusYears(0);
        assertSame(test, result);
    }

    @Test public void testPlusMonths_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusMonths(1);
        LocalDateTime expected = new LocalDateTime(2002, 6, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusMonths(0);
        assertSame(test, result);
    }

    @Test public void testPlusWeeks_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusWeeks(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 10, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusWeeks(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusDays_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusDays(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 4, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusDays(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusHours_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusHours(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 11, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusHours(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMinutes_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusMinutes(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 21, 30, 40, BUDDHIST_LONDON);
        assertEquals(expected, result);
        
        result = test.plusMinutes(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusSeconds_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusSeconds(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 31, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusSeconds(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMillis_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.plusMillis(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.plusMillis(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMinus_RP() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        
        LocalDateTime expected = new LocalDateTime(2001, 3, 26, 9, 19, 29, 39, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusYears_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusYears(1);
        LocalDateTime expected = new LocalDateTime(2001, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusYears(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMonths_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusMonths(1);
        LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusMonths(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusWeeks_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusWeeks(1);
        LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusWeeks(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusDays_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusDays(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusDays(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusHours_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusHours(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 9, 20, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusHours(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMinutes_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusMinutes(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 19, 30, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusMinutes(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusSeconds_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusSeconds(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 29, 40, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusSeconds(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMillis_int() {
        LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON);
        LocalDateTime result = test.minusMillis(1);
        LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 39, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);
        
        result = test.minusMillis(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testGetters() {
        LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC);
NoAssert.donothing(1970, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
        assertEquals(9, test.getDayOfMonth());
NoAssert.donothing(160, test.getDayOfYear());
NoAssert.donothing(2, test.getDayOfWeek());
NoAssert.donothing(24, test.getWeekOfWeekyear());
NoAssert.donothing(1970, test.getWeekyear());
        assertEquals(70, test.getYearOfCentury());
NoAssert.donothing(20, test.getCenturyOfEra());
NoAssert.donothing(1970, test.getYearOfEra());
NoAssert.donothing(DateTimeConstants.AD, test.getEra());
        assertEquals(10, test.getHourOfDay());
NoAssert.donothing(20, test.getMinuteOfHour());
NoAssert.donothing(30, test.getSecondOfMinute());
NoAssert.donothing(40, test.getMillisOfSecond());
NoAssert.donothing(MILLIS_OF_DAY_UTC, test.getMillisOfDay());
    }

    //-----------------------------------------------------------------------
    @Test public void testWithers() {
        LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC);
        check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40);
        check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40);
        check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40);
        check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40);
        check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40);
        check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40);
        check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40);
        check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40);
        check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40);
        check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40);
        check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40);
        check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40);
        check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40);
        check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40);
        check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6);
        check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234);
        try {
            test.withMonthOfYear(0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.withMonthOfYear(13);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime() {
        LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        
        DateTime test = base.toDateTime();
        check(base, 2005, 6, 9, 6, 7, 8, 9);
        DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_Zone() {
        LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        
        DateTime test = base.toDateTime(TOKYO);
        check(base, 2005, 6, 9, 6, 7, 8, 9);
        DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_TOKYO);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_nullZone() {
        LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        
        DateTime test = base.toDateTime((DateTimeZone) null);
        check(base, 2005, 6, 9, 6, 7, 8, 9);
        DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON);
        assertEquals(expected, test);
    }

    @Test public void testToDateTime_Zone_dstGap() {
        LocalDateTime base = new LocalDateTime(2014, 3, 30, 1, 30, 0, 0, ISO_LONDON);
        try {
            base.toDateTime(LONDON);
            fail();
        } catch (IllegalInstantException ex) {}
    }

    @Test public void testToDateTime_Zone_dstOverlap() {
        LocalDateTime base = new LocalDateTime(2014, 10, 26, 1, 30, 0, 0, ISO_LONDON);
        DateTime test = base.toDateTime(LONDON);
        DateTime expected = new DateTime(2014, 10, 26, 1, 30, ISO_LONDON).withEarlierOffsetAtOverlap();
        assertEquals(expected, test);
    }

    @Test public void testToDateTime_Zone_dstOverlap_NewYork() {
        LocalDateTime base = new LocalDateTime(2007, 11, 4, 1, 30, 0, 0, ISO_NEW_YORK);
        DateTime test = base.toDateTime(NEW_YORK);
        DateTime expected = new DateTime(2007, 11, 4, 1, 30, ISO_NEW_YORK).withEarlierOffsetAtOverlap();
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToLocalDate() {
        LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalDate expected = new LocalDate(2005, 6, 9, COPTIC_LONDON);
NoAssert.donothing(expected,base.toLocalDate());
    }

    @Test public void testToLocalTime() {
        LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalTime expected = new LocalTime(6, 7, 8, 9, COPTIC_LONDON);
NoAssert.donothing(expected,base.toLocalTime());
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_RI() {
        LocalDateTime base = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7, BUDDHIST_TOKYO);
        
        DateTime test = base.toDateTime(dt);
        check(base, 2005, 6, 9, 10, 20, 30, 40);
        DateTime expected = new DateTime(2005, 6, 9, 10, 20, 30, 40, BUDDHIST_TOKYO);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_nullRI() {
        LocalDateTime base = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        DateTime test = base.toDateTime((ReadableInstant) null);
        check(base, 2005, 6, 9, 10, 20, 30, 40);
        DateTime expected = new DateTime(2005, 6, 9, 10, 20, 30, 40, ISO_LONDON);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDate_summer() {
        LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        Date test = base.toDate();
        check(base, 2005, 7, 9, 10, 20, 30, 40);
        
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.clear();
        gcal.set(Calendar.YEAR, 2005);
        gcal.set(Calendar.MONTH, Calendar.JULY);
        gcal.set(Calendar.DAY_OF_MONTH, 9);
        gcal.set(Calendar.HOUR_OF_DAY, 10);
        gcal.set(Calendar.MINUTE, 20);
        gcal.set(Calendar.SECOND, 30);
        gcal.set(Calendar.MILLISECOND, 40);
NoAssert.donothing(gcal.getTime(), test);
    }

    @Test public void testToDate_winter() {
        LocalDateTime base = new LocalDateTime(2005, 1, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        Date test = base.toDate();
        check(base, 2005, 1, 9, 10, 20, 30, 40);
        
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.clear();
        gcal.set(Calendar.YEAR, 2005);
        gcal.set(Calendar.MONTH, Calendar.JANUARY);
        gcal.set(Calendar.DAY_OF_MONTH, 9);
        gcal.set(Calendar.HOUR_OF_DAY, 10);
        gcal.set(Calendar.MINUTE, 20);
        gcal.set(Calendar.SECOND, 30);
        gcal.set(Calendar.MILLISECOND, 40);
NoAssert.donothing(gcal.getTime(), test);
    }

    @Test public void testToDate_springDST() {
        LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate();
            check(base, 2007, 4, 2, 0, 20, 0, 0);
NoAssert.donothing("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    @Test public void testToDate_springDST_2Hour40Savings() {
        LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate();
            check(base, 2007, 4, 2, 0, 20, 0, 0);
NoAssert.donothing("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    @Test public void testToDate_autumnDST() {
        LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0);
        
        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate();
            check(base, 2007, 10, 2, 0, 20, 30, 0);
NoAssert.donothing("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testToDate_summer_Zone() {
        LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        Date test = base.toDate(TimeZone.getDefault());
        check(base, 2005, 7, 9, 10, 20, 30, 40);
        
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.clear();
        gcal.set(Calendar.YEAR, 2005);
        gcal.set(Calendar.MONTH, Calendar.JULY);
        gcal.set(Calendar.DAY_OF_MONTH, 9);
        gcal.set(Calendar.HOUR_OF_DAY, 10);
        gcal.set(Calendar.MINUTE, 20);
        gcal.set(Calendar.SECOND, 30);
        gcal.set(Calendar.MILLISECOND, 40);
NoAssert.donothing(gcal.getTime(), test);
    }

    @Test public void testToDate_winter_Zone() {
        LocalDateTime base = new LocalDateTime(2005, 1, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        Date test = base.toDate(TimeZone.getDefault());
        check(base, 2005, 1, 9, 10, 20, 30, 40);
        
        GregorianCalendar gcal = new GregorianCalendar();
        gcal.clear();
        gcal.set(Calendar.YEAR, 2005);
        gcal.set(Calendar.MONTH, Calendar.JANUARY);
        gcal.set(Calendar.DAY_OF_MONTH, 9);
        gcal.set(Calendar.HOUR_OF_DAY, 10);
        gcal.set(Calendar.MINUTE, 20);
        gcal.set(Calendar.SECOND, 30);
        gcal.set(Calendar.MILLISECOND, 40);
NoAssert.donothing(gcal.getTime(), test);
    }

    @Test public void testToDate_springDST_Zone() {
        LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate(TimeZone.getDefault());
            check(base, 2007, 4, 2, 0, 20, 0, 0);
NoAssert.donothing("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    @Test public void testToDate_springDST_2Hour40Savings_Zone() {
        LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0);
        
        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate(TimeZone.getDefault());
            check(base, 2007, 4, 2, 0, 20, 0, 0);
            assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    @Test public void testToDate_autumnDST_Zone() {
        LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0);
        
        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate(TimeZone.getDefault());
            check(base, 2007, 10, 2, 0, 20, 30, 0);
NoAssert.donothing("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }
    
    
    //-----------------------------------------------------------------------
    @Test public void testProperty() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GJ_UTC);
NoAssert.donothing(test.year(), test.property(DateTimeFieldType.year()));
NoAssert.donothing(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear()));
NoAssert.donothing(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(test.weekyear(), test.property(DateTimeFieldType.weekyear()));
NoAssert.donothing(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury()));
NoAssert.donothing(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra()));
NoAssert.donothing(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra()));
NoAssert.donothing(test.era(), test.property(DateTimeFieldType.era()));
NoAssert.donothing(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay()));
        
        try {
            test.property(null);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalDateTime());
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40, COPTIC_PARIS);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDateTime result = (LocalDateTime) ois.readObject();
        ois.close();
        
        assertEquals(test, result);
NoAssert.donothing(Arrays.equals(test.getValues(), result.getValues()));
NoAssert.donothing(Arrays.equals(test.getFields(), result.getFields()));
NoAssert.donothing(test.getChronology(), result.getChronology());
NoAssert.donothing(result.isSupported(DateTimeFieldType.dayOfMonth()));  // check deserialization
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
        assertEquals("2002-06-09T10:20:30.040", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String() {
        LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
NoAssert.donothing("2002 10", test.toString("yyyy HH"));
NoAssert.donothing("2002-06-09T10:20:30.040", test.toString((String) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String_Locale() {
        LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40);
NoAssert.donothing("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH));
NoAssert.donothing("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH));
NoAssert.donothing("1970-06-09T10:20:30.040", test.toString(null, Locale.ENGLISH));
NoAssert.donothing("Tue 9/6", test.toString("EEE d/M", null));
NoAssert.donothing("1970-06-09T10:20:30.040", test.toString(null, null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_DTFormatter() {
        LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40);
NoAssert.donothing("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
NoAssert.donothing("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {
NoAssert.donothing(year, test.getYear());
NoAssert.donothing(month, test.getMonthOfYear());
NoAssert.donothing(day, test.getDayOfMonth());
NoAssert.donothing(hour, test.getHourOfDay());
NoAssert.donothing(min, test.getMinuteOfHour());
NoAssert.donothing(sec, test.getSecondOfMinute());
NoAssert.donothing(mil, test.getMillisOfSecond());
    }
}
