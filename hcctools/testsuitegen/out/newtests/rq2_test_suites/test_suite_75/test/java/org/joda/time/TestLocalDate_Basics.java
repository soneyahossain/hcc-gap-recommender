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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Basics { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    //private static final int OFFSET = 1;
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    //private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_NEW_YORK = ISOChronology.getInstance(NEW_YORK);
    //private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    //private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    //private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    /**
     * Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01
     */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception {
        TestLocalDate_Basics TB = new TestLocalDate_Basics();
        TB.setUp();
        TB.testGet_DateTimeFieldType();
        TB.tearDown();
        TB.setUp();
        TB.testSize();
        TB.tearDown();
        TB.setUp();
        TB.testGetFieldType_int();
        TB.tearDown();
        TB.setUp();
        TB.testGetFieldTypes();
        TB.tearDown();
        TB.setUp();
        TB.testGetField_int();
        TB.tearDown();
        TB.setUp();
        TB.testGetFields();
        TB.tearDown();
        TB.setUp();
        TB.testGetValue_int();
        TB.tearDown();
        TB.setUp();
        TB.testGetValues();
        TB.tearDown();
        TB.setUp();
        TB.testIsSupported_DateTimeFieldType();
        TB.tearDown();
        TB.setUp();
        TB.testIsSupported_DurationFieldType();
        TB.tearDown();
        TB.setUp();
        TB.testEqualsHashCode();
        TB.tearDown();
        TB.setUp();
        TB.testEqualsHashCodeLenient();
        TB.tearDown();
        TB.setUp();
        TB.testEqualsHashCodeStrict();
        TB.tearDown();
        TB.setUp();
        TB.testEqualsHashCodeAPI();
        TB.tearDown();
        TB.setUp();
        TB.testCompareTo();
        TB.tearDown();
        TB.setUp();
        TB.testIsEqual_LocalDate();
        TB.tearDown();
        TB.setUp();
        TB.testIsBefore_LocalDate();
        TB.tearDown();
        TB.setUp();
        TB.testIsAfter_LocalDate();
        TB.tearDown();
        TB.setUp();
        TB.testWithField_DateTimeFieldType_int_1();
        TB.tearDown();
        TB.setUp();
        TB.testWithField_DateTimeFieldType_int_2();
        TB.tearDown();
        TB.setUp();
        TB.testWithField_DateTimeFieldType_int_3();
        TB.tearDown();
        TB.setUp();
        TB.testWithField_DateTimeFieldType_int_4();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded_DurationFieldType_int_1();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded_DurationFieldType_int_2();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded_DurationFieldType_int_3();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded_DurationFieldType_int_4();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded_DurationFieldType_int_5();
        TB.tearDown();
        TB.setUp();
        TB.testPlus_RP();
        TB.tearDown();
        TB.setUp();
        TB.testPlusYears_int();
        TB.tearDown();
        TB.setUp();
        TB.testPlusMonths_int();
        TB.tearDown();
        TB.setUp();
        TB.testPlusWeeks_int();
        TB.tearDown();
        TB.setUp();
        TB.testPlusDays_int();
        TB.tearDown();
        TB.setUp();
        TB.testMinus_RP();
        TB.tearDown();
        TB.setUp();
        TB.testMinusYears_int();
        TB.tearDown();
        TB.setUp();
        TB.testMinusMonths_int();
        TB.tearDown();
        TB.setUp();
        TB.testMinusWeeks_int();
        TB.tearDown();
        TB.setUp();
        TB.testMinusDays_int();
        TB.tearDown();
        TB.setUp();
        TB.testGetters();
        TB.tearDown();
        TB.setUp();
        TB.testWithers();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtStartOfDay();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtStartOfDay_avoidDST();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtStartOfDay_handleMidnightDST();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtStartOfDay_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtStartOfDay_Zone_avoidDST();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtStartOfDay_nullZone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtMidnight();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtMidnight_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtMidnight_nullZone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtCurrentTime();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtCurrentTime_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTimeAtCurrentTime_nullZone();
        TB.tearDown();
        TB.setUp();
        TB.testToLocalDateTime_LocalTime();
        TB.tearDown();
        TB.setUp();
        TB.testToLocalDateTime_nullLocalTime();
        TB.tearDown();
        TB.setUp();
        TB.testToLocalDateTime_wrongChronologyLocalTime();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_LocalTime();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_nullLocalTime();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_LocalTime_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_LocalTime_nullZone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_nullLocalTime_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_LocalTime_Zone_dstGap();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_LocalTime_Zone_dstOverlap();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_LocalTime_Zone_dstOverlap_NewYork();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_wrongChronoLocalTime_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateMidnight();
        TB.tearDown();
        TB.setUp();
        TB.testToDateMidnight_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateMidnight_nullZone();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_RI();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_nullRI();
        TB.tearDown();
        TB.setUp();
        TB.testToInterval();
        TB.tearDown();
        TB.setUp();
        TB.testToInterval_Zone();
        TB.tearDown();
        TB.setUp();
        TB.testToInterval_Zone_noMidnight();
        TB.tearDown();
        TB.setUp();
        TB.testToInterval_nullZone();
        TB.tearDown();
        TB.setUp();
        TB.testToDate_summer();
        TB.tearDown();
        TB.setUp();
        TB.testToDate_winter();
        TB.tearDown();
        //TB.setUp(); TB.testToDate_springDST(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testToDate_springDST_2Hour40Savings(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testToDate_autumnDST(); TB.tearDown(); //Method code too large!
        TB.setUp();
        TB.testProperty();
        TB.tearDown();
        TB.setUp();
        TB.testSerialization();
        TB.tearDown();
        TB.setUp();
        TB.testToString();
        TB.tearDown();
        TB.setUp();
        TB.testToString_String();
        TB.tearDown();
        TB.setUp();
        TB.testToString_String_Locale();
        TB.tearDown();
        TB.setUp();
        TB.testToString_DTFormatter();
        TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDate_Basics.class);
    }

    public TestLocalDate_Basics(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
        systemDefaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
    }

    @After
    public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(systemDefaultLocale);
        systemDefaultLocale = null;
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeFieldType() {
        LocalDate test = new LocalDate();
        assertEquals(1970, test.get(DateTimeFieldType.year()));
NoAssert.donothing(6, test.get(DateTimeFieldType.monthOfYear()));
        assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        assertEquals(2, test.get(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(160, test.get(DateTimeFieldType.dayOfYear()));
        assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(1970, test.get(DateTimeFieldType.weekyear()));
        try {
            test.get(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            test.get(DateTimeFieldType.hourOfDay());
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testSize() {
        LocalDate test = new LocalDate();
NoAssert.donothing(3, test.size());
    }

    @Test
    public void testGetFieldType_int() {
        LocalDate test = new LocalDate(COPTIC_PARIS);
        assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        try {
            test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        try {
            test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }

    @Test
    public void testGetFieldTypes() {
        LocalDate test = new LocalDate(COPTIC_PARIS);
        DateTimeFieldType[] fields = test.getFieldTypes();
        assertSame(DateTimeFieldType.year(), fields[0]);
        assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
        assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }

    @Test
    public void testGetField_int() {
        LocalDate test = new LocalDate(COPTIC_PARIS);
NoAssert.donothing(COPTIC_UTC.year(), test.getField(0));
        assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2));
        try {
            test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        try {
            test.getField(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }

    @Test
    public void testGetFields() {
        LocalDate test = new LocalDate(COPTIC_PARIS);
        DateTimeField[] fields = test.getFields();
        assertSame(COPTIC_UTC.year(), fields[0]);
NoAssert.donothing(COPTIC_UTC.monthOfYear(), fields[1]);
        assertSame(COPTIC_UTC.dayOfMonth(), fields[2]);
        assertNotSame(test.getFields(), test.getFields());
    }

    @Test
    public void testGetValue_int() {
        LocalDate test = new LocalDate();
        assertEquals(1970, test.getValue(0));
        assertEquals(6, test.getValue(1));
NoAssert.donothing(9, test.getValue(2));
        try {
            test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        try {
            test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {
        }
    }

    @Test
    public void testGetValues() {
        LocalDate test = new LocalDate();
        int[] values = test.getValues();
        assertEquals(1970, values[0]);
        assertEquals(6, values[1]);
        assertEquals(9, values[2]);
NoAssert.donothing(test.getValues(), test.getValues());
    }

    @Test
    public void testIsSupported_DateTimeFieldType() {
        LocalDate test = new LocalDate(COPTIC_PARIS);
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.year()));
        assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
        assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.weekyear()));
        assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
        assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra()));
        assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.weekyearOfCentury()));
        assertEquals(true, test.isSupported(DateTimeFieldType.era()));
NoAssert.donothing(false, test.isSupported(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(false, test.isSupported((DateTimeFieldType) null));
    }

    @Test
    public void testIsSupported_DurationFieldType() {
        LocalDate test = new LocalDate(1970, 6, 9);
        assertEquals(false, test.isSupported(DurationFieldType.eras()));
        assertEquals(true, test.isSupported(DurationFieldType.centuries()));
        assertEquals(true, test.isSupported(DurationFieldType.years()));
        assertEquals(true, test.isSupported(DurationFieldType.months()));
        assertEquals(true, test.isSupported(DurationFieldType.weekyears()));
        assertEquals(true, test.isSupported(DurationFieldType.weeks()));
        assertEquals(true, test.isSupported(DurationFieldType.days()));

        assertEquals(false, test.isSupported(DurationFieldType.hours()));
NoAssert.donothing(false, test.isSupported((DurationFieldType) null));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testEqualsHashCode() {
        LocalDate test1 = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        LocalDate test2 = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        assertEquals(true, test1.equals(test2));
        assertEquals(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
        assertEquals(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
        assertEquals(true, test2.hashCode() == test2.hashCode());

        LocalDate test3 = new LocalDate(1971, 6, 9);
        assertEquals(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
        assertEquals(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
        assertEquals(false, test2.hashCode() == test3.hashCode());

        assertEquals(false, test1.equals("Hello"));
        assertEquals(true, test1.equals(new MockInstant()));
        assertEquals(true, test1.equals(new YearMonthDay(1970, 6, 9, COPTIC_PARIS)));
        assertEquals(true, test1.hashCode() == new YearMonthDay(1970, 6, 9, COPTIC_PARIS).hashCode());
        assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }

    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }

        public DateTimeField[] getFields() {
            return new DateTimeField[]{
                    COPTIC_UTC.year(),
                    COPTIC_UTC.monthOfYear(),
                    COPTIC_UTC.dayOfMonth(),
            };
        }

        public int[] getValues() {
            return new int[]{1970, 6, 9};
        }
    }

    @Test
    public void testEqualsHashCodeLenient() {
        LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        assertEquals(true, test1.equals(test2));
        assertEquals(true, test2.equals(test1));
        assertEquals(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
        assertEquals(true, test1.hashCode() == test2.hashCode());
        assertEquals(true, test1.hashCode() == test1.hashCode());
        assertEquals(true, test2.hashCode() == test2.hashCode());
    }

    @Test
    public void testEqualsHashCodeStrict() {
        LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
        assertEquals(true, test1.equals(test1));
        assertEquals(true, test2.equals(test2));
        assertEquals(true, test1.hashCode() == test2.hashCode());
        assertEquals(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
    }

    @Test
    public void testEqualsHashCodeAPI() {
        LocalDate test = new LocalDate(1970, 6, 9, COPTIC_PARIS);
        int expected = 157;
        expected = 23 * expected + 1970;
        expected = 23 * expected + COPTIC_UTC.year().getType().hashCode();
        expected = 23 * expected + 6;
        expected = 23 * expected + COPTIC_UTC.monthOfYear().getType().hashCode();
        expected = 23 * expected + 9;
        expected = 23 * expected + COPTIC_UTC.dayOfMonth().getType().hashCode();
        expected += COPTIC_UTC.hashCode();
NoAssert.donothing(expected, test.hashCode());
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testCompareTo() {
        LocalDate test1 = new LocalDate(2005, 6, 2);
        LocalDate test1a = new LocalDate(2005, 6, 2);
        assertEquals(0, test1.compareTo(test1a));
        assertEquals(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
        assertEquals(0, test1a.compareTo(test1a));

        LocalDate test2 = new LocalDate(2005, 7, 2);
        assertEquals(-1, test1.compareTo(test2));
        assertEquals(+1, test2.compareTo(test1));

        LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        assertEquals(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
        assertEquals(0, test3.compareTo(test2));

        DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        int[] values = new int[]{2005, 6, 2};
        Partial p = new Partial(types, values);
NoAssert.donothing(0, test1.compareTo(p));
NoAssert.donothing(0, test1.compareTo(new YearMonthDay(2005, 6, 2)));
        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        try {
            test1.compareTo(new TimeOfDay());
            fail();
        } catch (ClassCastException ex) {
        }
        Partial partial = new Partial()
                .with(DateTimeFieldType.centuryOfEra(), 1)
                .with(DateTimeFieldType.halfdayOfDay(), 0)
                .with(DateTimeFieldType.dayOfMonth(), 9);
        try {
            new LocalDate(1970, 6, 9).compareTo(partial);
            fail();
        } catch (ClassCastException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_LocalDate() {
        LocalDate test1 = new LocalDate(2005, 6, 2);
        LocalDate test1a = new LocalDate(2005, 6, 2);
        assertEquals(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
        assertEquals(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));

        LocalDate test2 = new LocalDate(2005, 7, 2);
NoAssert.donothing(false, test1.isEqual(test2));
        assertEquals(false, test2.isEqual(test1));

        LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isEqual(test3));
        assertEquals(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));

        try {
            new LocalDate(2005, 7, 2).isEqual(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_LocalDate() {
        LocalDate test1 = new LocalDate(2005, 6, 2);
        LocalDate test1a = new LocalDate(2005, 6, 2);
        assertEquals(false, test1.isBefore(test1a));
        assertEquals(false, test1a.isBefore(test1));
        assertEquals(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));

        LocalDate test2 = new LocalDate(2005, 7, 2);
        assertEquals(true, test1.isBefore(test2));
        assertEquals(false, test2.isBefore(test1));

        LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        assertEquals(true, test1.isBefore(test3));
        assertEquals(false, test3.isBefore(test1));
        assertEquals(false, test3.isBefore(test2));

        try {
            new LocalDate(2005, 7, 2).isBefore(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_LocalDate() {
        LocalDate test1 = new LocalDate(2005, 6, 2);
        LocalDate test1a = new LocalDate(2005, 6, 2);
        assertEquals(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
        assertEquals(false, test1.isAfter(test1));
        assertEquals(false, test1a.isAfter(test1a));

        LocalDate test2 = new LocalDate(2005, 7, 2);
        assertEquals(false, test1.isAfter(test2));
        assertEquals(true, test2.isAfter(test1));

        LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC());
        assertEquals(false, test1.isAfter(test3));
        assertEquals(true, test3.isAfter(test1));
        assertEquals(false, test3.isAfter(test2));

        try {
            new LocalDate(2005, 7, 2).isAfter(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithField_DateTimeFieldType_int_1() {
        LocalDate test = new LocalDate(2004, 6, 9);
        LocalDate result = test.withField(DateTimeFieldType.year(), 2006);

        assertEquals(new LocalDate(2004, 6, 9), test);
NoAssert.donothing(new LocalDate(2006, 6, 9), result);
    }

    @Test
    public void testWithField_DateTimeFieldType_int_2() {
        LocalDate test = new LocalDate(2004, 6, 9);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testWithField_DateTimeFieldType_int_3() {
        LocalDate test = new LocalDate(2004, 6, 9);
        try {
            test.withField(DateTimeFieldType.hourOfDay(), 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testWithField_DateTimeFieldType_int_4() {
        LocalDate test = new LocalDate(2004, 6, 9);
        LocalDate result = test.withField(DateTimeFieldType.year(), 2004);
        assertEquals(new LocalDate(2004, 6, 9), test);
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded_DurationFieldType_int_1() {
        LocalDate test = new LocalDate(2004, 6, 9);
        LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6);

        assertEquals(new LocalDate(2004, 6, 9), test);
        assertEquals(new LocalDate(2010, 6, 9), result);
    }

    @Test
    public void testWithFieldAdded_DurationFieldType_int_2() {
        LocalDate test = new LocalDate(2004, 6, 9);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testWithFieldAdded_DurationFieldType_int_3() {
        LocalDate test = new LocalDate(2004, 6, 9);
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testWithFieldAdded_DurationFieldType_int_4() {
        LocalDate test = new LocalDate(2004, 6, 9);
        LocalDate result = test.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(test, result);
    }

    @Test
    public void testWithFieldAdded_DurationFieldType_int_5() {
        LocalDate test = new LocalDate(2004, 6, 9);
        try {
            test.withFieldAdded(DurationFieldType.hours(), 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8));
        LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.plus((ReadablePeriod) null);
        assertSame(test, result);
    }

    @Test
    public void testPlusYears_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.plusYears(1);
        LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.plusYears(0);
        assertSame(test, result);
    }

    @Test
    public void testPlusMonths_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.plusMonths(1);
        LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);

        result = test.plusMonths(0);
        assertSame(test, result);
    }

    @Test
    public void testPlusWeeks_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.plusWeeks(1);
        LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.plusWeeks(0);
        assertSame(test, result);
    }

    @Test
    public void testPlusDays_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.plusDays(1);
        LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.plusDays(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));

        // TODO breaks because it subtracts millis now, and thus goes
        // into the previous day

        LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON);
NoAssert.donothing(expected, result);

        result = test.minus((ReadablePeriod) null);
        assertSame(test, result);
    }

    @Test
    public void testMinusYears_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.minusYears(1);
        LocalDate expected = new LocalDate(2001, 5, 3, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.minusYears(0);
        assertSame(test, result);
    }

    @Test
    public void testMinusMonths_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.minusMonths(1);
        LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.minusMonths(0);
NoAssert.donothing(test, result);
    }

    @Test
    public void testMinusWeeks_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.minusWeeks(1);
        LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.minusWeeks(0);
        assertSame(test, result);
    }

    @Test
    public void testMinusDays_int() {
        LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON);
        LocalDate result = test.minusDays(1);
        LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON);
        assertEquals(expected, result);

        result = test.minusDays(0);
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetters() {
        LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC);
NoAssert.donothing(1970, test.getYear());
        assertEquals(6, test.getMonthOfYear());
        assertEquals(9, test.getDayOfMonth());
        assertEquals(160, test.getDayOfYear());
        assertEquals(2, test.getDayOfWeek());
        assertEquals(24, test.getWeekOfWeekyear());
        assertEquals(1970, test.getWeekyear());
        assertEquals(70, test.getYearOfCentury());
NoAssert.donothing(20, test.getCenturyOfEra());
        assertEquals(1970, test.getYearOfEra());
        assertEquals(DateTimeConstants.AD, test.getEra());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {
        LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC);
        check(test.withYear(2000), 2000, 6, 9);
        check(test.withMonthOfYear(2), 1970, 2, 9);
        check(test.withDayOfMonth(2), 1970, 6, 2);
        check(test.withDayOfYear(6), 1970, 1, 6);
        check(test.withDayOfWeek(6), 1970, 6, 13);
        check(test.withWeekOfWeekyear(6), 1970, 2, 3);
        check(test.withWeekyear(1971), 1971, 6, 15);
        check(test.withYearOfCentury(60), 1960, 6, 9);
        check(test.withCenturyOfEra(21), 2070, 6, 9);
        check(test.withYearOfEra(1066), 1066, 6, 9);
        check(test.withEra(DateTimeConstants.BC), -1970, 6, 9);
        try {
            test.withMonthOfYear(0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            test.withMonthOfYear(13);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtStartOfDay() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateTime test = base.toDateTimeAtStartOfDay();
        check(base, 2005, 6, 9);
        assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }

    @Test
    public void testToDateTimeAtStartOfDay_avoidDST() {
        LocalDate base = new LocalDate(2007, 4, 1);

        DateTimeZone.setDefault(MOCK_GAZA);
        DateTime test = base.toDateTimeAtStartOfDay();
        check(base, 2007, 4, 1);
        assertEquals(new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA), test);
    }

    @Test
    public void testToDateTimeAtStartOfDay_handleMidnightDST() {
        LocalDate test = new LocalDate(2018, 10, 28);
        DateTime result = test.toDateTimeAtStartOfDay(DateTimeZone.forID("Atlantic/Azores"));
        DateTime expected = new DateTime(2018, 10, 28, 0, 0, DateTimeZone.forID("Atlantic/Azores"));
        assertEquals(expected, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtStartOfDay_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateTime test = base.toDateTimeAtStartOfDay(TOKYO);
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }

    @Test
    public void testToDateTimeAtStartOfDay_Zone_avoidDST() {
        LocalDate base = new LocalDate(2007, 4, 1);

        DateTime test = base.toDateTimeAtStartOfDay(MOCK_GAZA);
        check(base, 2007, 4, 1);
        assertEquals(new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA), test);
    }

    @Test
    public void testToDateTimeAtStartOfDay_nullZone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateTime test = base.toDateTimeAtStartOfDay((DateTimeZone) null);
        check(base, 2005, 6, 9);
        assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateTime test = base.toDateTimeAtMidnight();
        check(base, 2005, 6, 9);
        assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateTime test = base.toDateTimeAtMidnight(TOKYO);
        check(base, 2005, 6, 9);
        assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateTimeAtMidnight_nullZone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null);
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtCurrentTime() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        DateTime test = base.toDateTimeAtCurrentTime();
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
        assertEquals(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeAtCurrentTime_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        DateTime test = base.toDateTimeAtCurrentTime(TOKYO);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
NoAssert.donothing(expected, test);
    }

    @Test
    public void testToDateTimeAtCurrentTime_nullZone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        DateTime test = base.toDateTimeAtCurrentTime((DateTimeZone) null);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
        assertEquals(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToLocalDateTime_LocalTime() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        LocalDateTime test = base.toLocalDateTime(tod);
        check(base, 2005, 6, 9);
        LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC);
        assertEquals(expected, test);
    }

    @Test
    public void testToLocalDateTime_nullLocalTime() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant

        try {
            base.toLocalDateTime((LocalTime) null);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test
    public void testToLocalDateTime_wrongChronologyLocalTime() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); // PARIS irrelevant

        try {
            base.toLocalDateTime(tod);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_LocalTime() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        DateTime test = base.toDateTime(tod);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        assertEquals(expected, test);
    }

    @Test
    public void testToDateTime_nullLocalTime() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_LONDON).getMillis();
        DateTimeUtils.setCurrentMillisFixed(now);

        DateTime test = base.toDateTime((LocalTime) null);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        assertEquals(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_LocalTime_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        DateTime test = base.toDateTime(tod, TOKYO);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
NoAssert.donothing(expected, test);
    }

    @Test
    public void testToDateTime_LocalTime_nullZone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO);

        DateTime test = base.toDateTime(tod, null);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        assertEquals(expected, test);
    }

    @Test
    public void testToDateTime_nullLocalTime_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_TOKYO).getMillis();
        DateTimeUtils.setCurrentMillisFixed(now);

        DateTime test = base.toDateTime((LocalTime) null, TOKYO);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        assertEquals(expected, test);
    }

    @Test
    public void testToDateTime_LocalTime_Zone_dstGap() {
        LocalDate base = new LocalDate(2014, 3, 30, ISO_LONDON);
        LocalTime tod = new LocalTime(1, 30, 0, 0, ISO_LONDON);
        try {
            base.toDateTime(tod, LONDON);
            fail();
        } catch (IllegalInstantException ex) {
        }
    }

    @Test
    public void testToDateTime_LocalTime_Zone_dstOverlap() {
        LocalDate base = new LocalDate(2014, 10, 26, ISO_LONDON);
        LocalTime tod = new LocalTime(1, 30, 0, 0, ISO_LONDON);
        DateTime test = base.toDateTime(tod, LONDON);
        DateTime expected = new DateTime(2014, 10, 26, 1, 30, ISO_LONDON).withEarlierOffsetAtOverlap();
        assertEquals(expected, test);
    }

    @Test
    public void testToDateTime_LocalTime_Zone_dstOverlap_NewYork() {
        LocalDate base = new LocalDate(2007, 11, 4, ISO_NEW_YORK);
        LocalTime tod = new LocalTime(1, 30, 0, 0, ISO_NEW_YORK);
        DateTime test = base.toDateTime(tod, NEW_YORK);
        DateTime expected = new DateTime(2007, 11, 4, 1, 30, ISO_NEW_YORK).withEarlierOffsetAtOverlap();
NoAssert.donothing(expected, test);
    }

    @Test
    public void testToDateTime_wrongChronoLocalTime_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO);

        try {
            base.toDateTime(tod, LONDON);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateMidnight test = base.toDateMidnight();
        check(base, 2005, 6, 9);
        assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateMidnight test = base.toDateMidnight(TOKYO);
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateMidnight(2005, 6, 9, COPTIC_TOKYO), test);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testToDateMidnight_nullZone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);

        DateMidnight test = base.toDateMidnight((DateTimeZone) null);
        check(base, 2005, 6, 9);
        assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);

        DateTime test = base.toDateTime(dt);
        check(base, 2005, 6, 9);
        DateTime expected = dt;
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
        assertEquals(expected, test);
    }

    @Test
    public void testToDateTime_nullRI() {
        LocalDate base = new LocalDate(2005, 6, 9);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        DateTime test = base.toDateTime((ReadableInstant) null);
        check(base, 2005, 6, 9);
        DateTime expected = dt;
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
        assertEquals(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval();
        check(base, 2005, 6, 9);
        DateTime start = base.toDateTimeAtStartOfDay();
        DateTime end = start.plus(Period.days(1));
        Interval expected = new Interval(start, end);
        assertEquals(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval_Zone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval(TOKYO);
        check(base, 2005, 6, 9);
        DateTime start = base.toDateTimeAtStartOfDay(TOKYO);
        DateTime end = start.plus(Period.days(1));
        Interval expected = new Interval(start, end);
        assertEquals(expected, test);
    }

    @Test
    public void testToInterval_Zone_noMidnight() {
        LocalDate base = new LocalDate(2006, 4, 1, ISO_LONDON);  // LONDON irrelevant
        DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza");
        Interval test = base.toInterval(gaza);
        check(base, 2006, 4, 1);
        DateTime start = new DateTime(2006, 4, 1, 1, 0, 0, 0, gaza);
        DateTime end = new DateTime(2006, 4, 2, 0, 0, 0, 0, gaza);
        Interval expected = new Interval(start, end);
        assertEquals(expected, test);
    }

    @Test
    public void testToInterval_nullZone() {
        LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval(null);
        check(base, 2005, 6, 9);
        DateTime start = base.toDateTimeAtStartOfDay(LONDON);
        DateTime end = start.plus(Period.days(1));
        Interval expected = new Interval(start, end);
        assertEquals(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDate_summer() {
        LocalDate base = new LocalDate(2005, 7, 9, COPTIC_PARIS);

        Date test = base.toDate();
        check(base, 2005, 7, 9);

        GregorianCalendar gcal = new GregorianCalendar();
        gcal.clear();
        gcal.set(Calendar.YEAR, 2005);
        gcal.set(Calendar.MONTH, Calendar.JULY);
        gcal.set(Calendar.DAY_OF_MONTH, 9);
NoAssert.donothing(gcal.getTime(), test);
    }

    @Test
    public void testToDate_winter() {
        LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS);

        Date test = base.toDate();
        check(base, 2005, 1, 9);

        GregorianCalendar gcal = new GregorianCalendar();
        gcal.clear();
        gcal.set(Calendar.YEAR, 2005);
        gcal.set(Calendar.MONTH, Calendar.JANUARY);
        gcal.set(Calendar.DAY_OF_MONTH, 9);
        assertEquals(gcal.getTime(), test);
    }

    //@Test
    public void testToDate_springDST() {
        LocalDate base = new LocalDate(2007, 4, 2);

        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate();
            check(base, 2007, 4, 2);
            assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    //@Test
    public void testToDate_springDST_2Hour40Savings() {
        LocalDate base = new LocalDate(2007, 4, 2);

        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate();
            check(base, 2007, 4, 2);
            assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    //@Test
    public void testToDate_autumnDST() {
        LocalDate base = new LocalDate(2007, 10, 2);

        SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight",
                Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000);
        TimeZone currentZone = TimeZone.getDefault();
        try {
            TimeZone.setDefault(testZone);
            Date test = base.toDate();
            check(base, 2007, 10, 2);
            assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString());
        } finally {
            TimeZone.setDefault(currentZone);
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {
        LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC);
NoAssert.donothing(test.year(), test.property(DateTimeFieldType.year()));
NoAssert.donothing(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear()));
NoAssert.donothing(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(test.weekyear(), test.property(DateTimeFieldType.weekyear()));
        assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury()));
        assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra()));
        assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra()));
        assertEquals(test.era(), test.property(DateTimeFieldType.era()));
        try {
            test.property(DateTimeFieldType.millisOfDay());
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            test.property(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {
        LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        LocalDate result = (LocalDate) ois.readObject();
        ois.close();

        assertEquals(test, result);
NoAssert.donothing(Arrays.equals(test.getValues(), result.getValues()));
        assertTrue(Arrays.equals(test.getFields(), result.getFields()));
NoAssert.donothing(test.getChronology(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {
        LocalDate test = new LocalDate(2002, 6, 9);
        assertEquals("2002-06-09", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {
        LocalDate test = new LocalDate(2002, 6, 9);
        assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH"));
        assertEquals("2002-06-09", test.toString((String) null));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {
        LocalDate test = new LocalDate(1970, 6, 9);
        assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH));
NoAssert.donothing("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH));
NoAssert.donothing("Tue 9/6", test.toString("EEE d/M", null));
NoAssert.donothing("1970-06-09", test.toString(null, null));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {
        LocalDate test = new LocalDate(2002, 6, 9);
        assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        assertEquals("2002-06-09", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int hour, int min, int sec) {
        assertEquals(hour, test.getYear());
        assertEquals(min, test.getMonthOfYear());
        assertEquals(sec, test.getDayOfMonth());
    }
}
