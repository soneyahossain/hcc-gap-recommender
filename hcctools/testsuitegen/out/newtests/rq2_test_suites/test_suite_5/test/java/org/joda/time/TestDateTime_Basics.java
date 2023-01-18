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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Basics  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final BuddhistChronology BUDDHIST_DEFAULT = BuddhistChronology.getInstance(LONDON);
    private static final CopticChronology COPTIC_DEFAULT = CopticChronology.getInstance(LONDON);
    
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
        TestDateTime_Basics TB= new TestDateTime_Basics();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testGet_DateTimeField(); TB.tearDown();
        TB.setUp(); TB.testGet_DateTimeFieldType(); TB.tearDown();
        TB.setUp(); TB.testIsSupported_DateTimeFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetters(); TB.tearDown();
        TB.setUp(); TB.testWithers(); TB.tearDown();
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
        TB.setUp(); TB.testToString_String(); TB.tearDown();
        TB.setUp(); TB.testToString_String_Locale(); TB.tearDown();
        TB.setUp(); TB.testToString_DTFormatter(); TB.tearDown();
        TB.setUp(); TB.testToInstant(); TB.tearDown();
        TB.setUp(); TB.testToDateTime(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeISO(); TB.tearDown();
        //TB.setUp(); TB.testToDateTime_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTimeISO(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToDate(); TB.tearDown();
        TB.setUp(); TB.testToCalendar_Locale(); TB.tearDown();
        TB.setUp(); TB.testToGregorianCalendar(); TB.tearDown();
        TB.setUp(); TB.testToDateMidnight(); TB.tearDown();
        TB.setUp(); TB.testToYearMonthDay(); TB.tearDown();
        TB.setUp(); TB.testToTimeOfDay(); TB.tearDown();
        TB.setUp(); TB.testToLocalDateTime(); TB.tearDown();
        TB.setUp(); TB.testToLocalDate(); TB.tearDown();
        TB.setUp(); TB.testToLocalTime(); TB.tearDown();
        TB.setUp(); TB.testWithMillis_long(); TB.tearDown();
        TB.setUp(); TB.testWithChronology_Chronology(); TB.tearDown();
        TB.setUp(); TB.testWithZone_DateTimeZone(); TB.tearDown();
        //TB.setUp(); TB.testWithZoneRetainFields_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testWithDate_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testWithDate_int_int_int_toDST1(); TB.tearDown();
        TB.setUp(); TB.testWithDate_int_int_int_toDST2(); TB.tearDown();
        TB.setUp(); TB.testWithDate_int_int_int_affectedByDST(); TB.tearDown();
        TB.setUp(); TB.testWithDate_LocalDate(); TB.tearDown();
        TB.setUp(); TB.testWithTime_int_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testWithTime_int_int_int_int_toDST(); TB.tearDown();
        TB.setUp(); TB.testWithTime_LocalTime(); TB.tearDown();
        TB.setUp(); TB.testWithTimeAtStartOfDay(); TB.tearDown();
        TB.setUp(); TB.testWithFields_RPartial(); TB.tearDown();
        TB.setUp(); TB.testWithField1(); TB.tearDown();
        TB.setUp(); TB.testWithField2(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded1(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded2(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded3(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded4(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_long_int(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RP_int(); TB.tearDown();
        TB.setUp(); TB.testPlus_long(); TB.tearDown();
        TB.setUp(); TB.testPlus_RD(); TB.tearDown();
        TB.setUp(); TB.testPlus_RP(); TB.tearDown();
        TB.setUp(); TB.testPlusYears_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_intMax(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_intMin(); TB.tearDown();
        TB.setUp(); TB.testPlusWeeks_int(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int(); TB.tearDown();
        TB.setUp(); TB.testPlusHours_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMinutes_int(); TB.tearDown();
        TB.setUp(); TB.testPlusSeconds_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMillis_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_long(); TB.tearDown();
        TB.setUp(); TB.testMinus_RD(); TB.tearDown();
        TB.setUp(); TB.testMinus_RP(); TB.tearDown();
        TB.setUp(); TB.testMinusYears_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_intMax(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_intMin(); TB.tearDown();
        TB.setUp(); TB.testMinusWeeks_int(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int(); TB.tearDown();
        TB.setUp(); TB.testMinusHours_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMinutes_int(); TB.tearDown();
        TB.setUp(); TB.testMinusSeconds_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMillis_int(); TB.tearDown();
        TB.setUp(); TB.testProperty(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTime_Basics.class);
    }

    public TestDateTime_Basics(String name) {
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
    @Test public void testGet_DateTimeField() {
        DateTime test = new DateTime();
NoAssert.donothing(1, test.get(ISO_DEFAULT.era()));
NoAssert.donothing(20, test.get(ISO_DEFAULT.centuryOfEra()));
NoAssert.donothing(2, test.get(ISO_DEFAULT.yearOfCentury()));
NoAssert.donothing(2002, test.get(ISO_DEFAULT.yearOfEra()));
NoAssert.donothing(2002, test.get(ISO_DEFAULT.year()));
NoAssert.donothing(6, test.get(ISO_DEFAULT.monthOfYear()));
NoAssert.donothing(9, test.get(ISO_DEFAULT.dayOfMonth()));
NoAssert.donothing(2002, test.get(ISO_DEFAULT.weekyear()));
NoAssert.donothing(23, test.get(ISO_DEFAULT.weekOfWeekyear()));
NoAssert.donothing(7, test.get(ISO_DEFAULT.dayOfWeek()));
NoAssert.donothing(160, test.get(ISO_DEFAULT.dayOfYear()));
NoAssert.donothing(0, test.get(ISO_DEFAULT.halfdayOfDay()));
NoAssert.donothing(1, test.get(ISO_DEFAULT.hourOfHalfday()));
NoAssert.donothing(1, test.get(ISO_DEFAULT.clockhourOfDay()));
NoAssert.donothing(1, test.get(ISO_DEFAULT.clockhourOfHalfday()));
        assertEquals(1, test.get(ISO_DEFAULT.hourOfDay()));
NoAssert.donothing(0, test.get(ISO_DEFAULT.minuteOfHour()));
NoAssert.donothing(60, test.get(ISO_DEFAULT.minuteOfDay()));
NoAssert.donothing(0, test.get(ISO_DEFAULT.secondOfMinute()));
NoAssert.donothing(60 * 60, test.get(ISO_DEFAULT.secondOfDay()));
NoAssert.donothing(0, test.get(ISO_DEFAULT.millisOfSecond()));
NoAssert.donothing(60 * 60 * 1000, test.get(ISO_DEFAULT.millisOfDay()));
        try {
            test.get((DateTimeField) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testGet_DateTimeFieldType() {
        DateTime test = new DateTime();
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
NoAssert.donothing(1, test.get(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(1, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(1, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(1, test.get(DateTimeFieldType.hourOfDay()));
        assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(60, test.get(DateTimeFieldType.minuteOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(60 * 60, test.get(DateTimeFieldType.secondOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(60 * 60 * 1000, test.get(DateTimeFieldType.millisOfDay()));
        try {
            test.get((DateTimeFieldType) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testIsSupported_DateTimeFieldType() {
        DateTime test = new DateTime();
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.era()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.centuryOfEra()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.yearOfCentury()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.yearOfEra()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.year()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.weekyear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.weekOfWeekyear()));
        assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfYear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.secondOfDay()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.millisOfDay()));
NoAssert.donothing(false, test.isSupported(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetters() {
        DateTime test = new DateTime();
        
NoAssert.donothing(ISO_DEFAULT, test.getChronology());
NoAssert.donothing(LONDON, test.getZone());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
        
NoAssert.donothing(1, test.getEra());
NoAssert.donothing(20, test.getCenturyOfEra());
NoAssert.donothing(2, test.getYearOfCentury());
NoAssert.donothing(2002, test.getYearOfEra());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(2002, test.getWeekyear());
NoAssert.donothing(23, test.getWeekOfWeekyear());
NoAssert.donothing(7, test.getDayOfWeek());
NoAssert.donothing(160, test.getDayOfYear());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
NoAssert.donothing(60, test.getMinuteOfDay());
NoAssert.donothing(0, test.getSecondOfMinute());
NoAssert.donothing(60 * 60, test.getSecondOfDay());
NoAssert.donothing(0, test.getMillisOfSecond());
NoAssert.donothing(60 * 60 * 1000, test.getMillisOfDay());
    }

    @Test public void testWithers() {
        DateTime test = new DateTime(1970, 6, 9, 10, 20, 30, 40, GJ_DEFAULT);
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
    @Test public void testEqualsHashCode() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test2 = new DateTime(TEST_TIME1);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        DateTime test3 = new DateTime(TEST_TIME2);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockInstant()));
NoAssert.donothing(false, test1.equals(new DateTime(TEST_TIME1, GREGORIAN_DEFAULT)));
NoAssert.donothing(true, new DateTime(TEST_TIME1, new MockEqualsChronology()).equals(new DateTime(TEST_TIME1, new MockEqualsChronology())));
NoAssert.donothing(false, new DateTime(TEST_TIME1, new MockEqualsChronology()).equals(new DateTime(TEST_TIME1, ISO_DEFAULT)));
    }
    
    class MockInstant extends AbstractInstant {
        public String toString() {
            return null;
        }
        public long getMillis() {
            return TEST_TIME1;
        }
        public Chronology getChronology() {
            return ISO_DEFAULT;
        }
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {
            return obj instanceof MockEqualsChronology;
        }
        public DateTimeZone getZone() {
            return null;
        }
        public Chronology withUTC() {
            return this;
        }
        public Chronology withZone(DateTimeZone zone) {
            return this;
        }
        public String toString() {
            return "";
        }
    }

    @Test public void testCompareTo() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test1a = new DateTime(TEST_TIME1);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
        assertEquals(-1, test1.compareTo(test3));
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
NoAssert.donothing(false, new DateTime(TEST_TIME1).isEqual(TEST_TIME2));
NoAssert.donothing(true, new DateTime(TEST_TIME1).isEqual(TEST_TIME1));
NoAssert.donothing(false, new DateTime(TEST_TIME2).isEqual(TEST_TIME1));
    }
    
    @Test public void testIsEqualNow() {
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW - 1).isEqualNow());
NoAssert.donothing(true, new DateTime(TEST_TIME_NOW).isEqualNow());
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW + 1).isEqualNow());
    }
    
    @Test public void testIsEqual_RI() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test1a = new DateTime(TEST_TIME1);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(false, test1.isEqual(test2));
        assertEquals(false, test2.isEqual(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
NoAssert.donothing(false, test2.isEqual(new MockInstant()));
NoAssert.donothing(true, test1.isEqual(new MockInstant()));
        
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW + 1).isEqual(null));
NoAssert.donothing(true, new DateTime(TEST_TIME_NOW).isEqual(null));
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW - 1).isEqual(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsBefore_long() {
NoAssert.donothing(true, new DateTime(TEST_TIME1).isBefore(TEST_TIME2));
NoAssert.donothing(false, new DateTime(TEST_TIME1).isBefore(TEST_TIME1));
NoAssert.donothing(false, new DateTime(TEST_TIME2).isBefore(TEST_TIME1));
    }
    
    @Test public void testIsBeforeNow() {
NoAssert.donothing(true, new DateTime(TEST_TIME_NOW - 1).isBeforeNow());
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW).isBeforeNow());
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW + 1).isBeforeNow());
    }
    
    @Test public void testIsBefore_RI() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test1a = new DateTime(TEST_TIME1);
        assertEquals(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
NoAssert.donothing(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));
        
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
NoAssert.donothing(false, test2.isBefore(new MockInstant()));
NoAssert.donothing(false, test1.isBefore(new MockInstant()));
        
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW + 1).isBefore(null));
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW).isBefore(null));
NoAssert.donothing(true, new DateTime(TEST_TIME_NOW - 1).isBefore(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsAfter_long() {
NoAssert.donothing(false, new DateTime(TEST_TIME1).isAfter(TEST_TIME2));
NoAssert.donothing(false, new DateTime(TEST_TIME1).isAfter(TEST_TIME1));
NoAssert.donothing(true, new DateTime(TEST_TIME2).isAfter(TEST_TIME1));
    }
    
    @Test public void testIsAfterNow() {
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW - 1).isAfterNow());
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW).isAfterNow());
NoAssert.donothing(true, new DateTime(TEST_TIME_NOW + 1).isAfterNow());
    }
    
    @Test public void testIsAfter_RI() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test1a = new DateTime(TEST_TIME1);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
NoAssert.donothing(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(false, test1.isAfter(test2));
        assertEquals(true, test2.isAfter(test1));
        
        DateTime test3 = new DateTime(TEST_TIME2, GREGORIAN_PARIS);
NoAssert.donothing(false, test1.isAfter(test3));
NoAssert.donothing(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
NoAssert.donothing(true, test2.isAfter(new MockInstant()));
NoAssert.donothing(false, test1.isAfter(new MockInstant()));
        
NoAssert.donothing(true, new DateTime(TEST_TIME_NOW + 1).isAfter(null));
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW).isAfter(null));
NoAssert.donothing(false, new DateTime(TEST_TIME_NOW - 1).isAfter(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        DateTime test = new DateTime(TEST_TIME_NOW);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTime result = (DateTime) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        DateTime test = new DateTime(TEST_TIME_NOW);
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString());
        
        test = new DateTime(TEST_TIME_NOW, PARIS);
NoAssert.donothing("2002-06-09T02:00:00.000+02:00", test.toString());
    }

    @Test public void testToString_String() {
        DateTime test = new DateTime(TEST_TIME_NOW);
NoAssert.donothing("2002 01", test.toString("yyyy HH"));
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString((String) null));
    }

    @Test public void testToString_String_Locale() {
        DateTime test = new DateTime(TEST_TIME_NOW);
NoAssert.donothing("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
NoAssert.donothing("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
NoAssert.donothing("Sun 9/6", test.toString("EEE d/M", null));
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString(null, null));
    }

    @SuppressWarnings("deprecation")
    @Test public void testToString_DTFormatter() {
        DateMidnight test = new DateMidnight(TEST_TIME_NOW);
NoAssert.donothing("2002 00", test.toString(DateTimeFormat.forPattern("yyyy HH")));
NoAssert.donothing("2002-06-09T00:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToInstant() {
        DateTime test = new DateTime(TEST_TIME1);
        Instant result = test.toInstant();
NoAssert.donothing(TEST_TIME1, result.getMillis());
    }

    @Test public void testToDateTime() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.toDateTime();
NoAssert.donothing(test, result);
    }

    @Test public void testToDateTimeISO() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.toDateTimeISO();
NoAssert.donothing(test, result);
        
        test = new DateTime(TEST_TIME1, ISO_PARIS);
        result = test.toDateTimeISO();
        assertSame(DateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_PARIS, result.getChronology());
NoAssert.donothing(test, result);
        
        test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        result = test.toDateTimeISO();
NoAssert.donothing(DateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());
NoAssert.donothing(test, result);
        
        test = new DateTime(TEST_TIME1, new MockNullZoneChronology());
        result = test.toDateTimeISO();
NoAssert.donothing(DateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());
NoAssert.donothing(test, result);
    }

    public void testToDateTime_DateTimeZone() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.toDateTime(LONDON);
NoAssert.donothing(test, result);

        test = new DateTime(TEST_TIME1);
        result = test.toDateTime(PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(PARIS, result.getZone());

        test = new DateTime(TEST_TIME1, PARIS);
        result = test.toDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(LONDON, result.getZone());

        test = new DateTime(TEST_TIME1);
        result = test.toDateTime((DateTimeZone) null);
NoAssert.donothing(test, result);
    }

    @Test public void testToDateTime_Chronology() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.toDateTime(ISO_DEFAULT);
        assertSame(test, result);

        test = new DateTime(TEST_TIME1);
        result = test.toDateTime(GREGORIAN_PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GREGORIAN_PARIS, result.getChronology());

        test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        result = test.toDateTime((Chronology) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());

        test = new DateTime(TEST_TIME1);
        result = test.toDateTime((Chronology) null);
NoAssert.donothing(test, result);
    }

    @Test public void testToMutableDateTime() {
        DateTime test = new DateTime(TEST_TIME1, PARIS);
        MutableDateTime result = test.toMutableDateTime();
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_PARIS, result.getChronology());
    }

    @Test public void testToMutableDateTimeISO() {
        DateTime test = new DateTime(TEST_TIME1, PARIS);
        MutableDateTime result = test.toMutableDateTimeISO();
NoAssert.donothing(MutableDateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_PARIS, result.getChronology());
    }

    @Test public void testToMutableDateTime_DateTimeZone() {
        DateTime test = new DateTime(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(LONDON);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());

        test = new DateTime(TEST_TIME1);
        result = test.toMutableDateTime(PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_PARIS, result.getChronology());

        test = new DateTime(TEST_TIME1, PARIS);
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());

        test = new DateTime(TEST_TIME1);
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());
    }

    @Test public void testToMutableDateTime_Chronology() {
        DateTime test = new DateTime(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(ISO_DEFAULT);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());

        test = new DateTime(TEST_TIME1);
        result = test.toMutableDateTime(GREGORIAN_PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GREGORIAN_PARIS, result.getChronology());

        test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        result = test.toMutableDateTime((Chronology) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
        assertEquals(ISO_DEFAULT, result.getChronology());

        test = new DateTime(TEST_TIME1);
        result = test.toMutableDateTime((Chronology) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());
    }

    @Test public void testToDate() {
        DateTime test = new DateTime(TEST_TIME1);
        Date result = test.toDate();
NoAssert.donothing(test.getMillis(), result.getTime());
    }

    @Test public void testToCalendar_Locale() {
        DateTime test = new DateTime(TEST_TIME1);
        Calendar result = test.toCalendar(null);
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        test = new DateTime(TEST_TIME1, PARIS);
        result = test.toCalendar(null);
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
        assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        test = new DateTime(TEST_TIME1, PARIS);
        result = test.toCalendar(Locale.UK);
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }

    @Test public void testToGregorianCalendar() {
        DateTime test = new DateTime(TEST_TIME1);
        GregorianCalendar result = test.toGregorianCalendar();
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        test = new DateTime(TEST_TIME1, PARIS);
        result = test.toGregorianCalendar();
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testToDateMidnight() {
        DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        DateMidnight test = base.toDateMidnight();
NoAssert.donothing(new DateMidnight(base, COPTIC_DEFAULT), test);
    }

    @SuppressWarnings("deprecation")
    @Test public void testToYearMonthDay() {
        DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        YearMonthDay test = base.toYearMonthDay();
NoAssert.donothing(new YearMonthDay(TEST_TIME1, COPTIC_DEFAULT), test);
    }

    @SuppressWarnings("deprecation")
    @Test public void testToTimeOfDay() {
        DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        TimeOfDay test = base.toTimeOfDay();
NoAssert.donothing(new TimeOfDay(TEST_TIME1, COPTIC_DEFAULT), test);
    }

    @Test public void testToLocalDateTime() {
        DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        LocalDateTime test = base.toLocalDateTime();
NoAssert.donothing(new LocalDateTime(TEST_TIME1, COPTIC_DEFAULT), test);
    }

    @Test public void testToLocalDate() {
        DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        LocalDate test = base.toLocalDate();
NoAssert.donothing(new LocalDate(TEST_TIME1, COPTIC_DEFAULT), test);
    }

    @Test public void testToLocalTime() {
        DateTime base = new DateTime(TEST_TIME1, COPTIC_DEFAULT);
        LocalTime test = base.toLocalTime();
NoAssert.donothing(new LocalTime(TEST_TIME1, COPTIC_DEFAULT), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithMillis_long() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.withMillis(TEST_TIME2);
NoAssert.donothing(TEST_TIME2, result.getMillis());
NoAssert.donothing(test.getChronology(), result.getChronology());
        
        test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        result = test.withMillis(TEST_TIME2);
NoAssert.donothing(TEST_TIME2, result.getMillis());
NoAssert.donothing(test.getChronology(), result.getChronology());
        
        test = new DateTime(TEST_TIME1);
        result = test.withMillis(TEST_TIME1);
NoAssert.donothing(test, result);
    }

    @Test public void testWithChronology_Chronology() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.withChronology(GREGORIAN_PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GREGORIAN_PARIS, result.getChronology());
        
        test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        result = test.withChronology(null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());
        
        test = new DateTime(TEST_TIME1);
        result = test.withChronology(null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_DEFAULT, result.getChronology());
        
        test = new DateTime(TEST_TIME1);
        result = test.withChronology(ISO_DEFAULT);
NoAssert.donothing(test, result);
    }

    @Test public void testWithZone_DateTimeZone() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.withZone(PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISO_PARIS, result.getChronology());
        
        test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        result = test.withZone(null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GREGORIAN_DEFAULT, result.getChronology());
        
        test = new DateTime(TEST_TIME1);
        result = test.withZone(null);
NoAssert.donothing(test, result);
    }

    public void testWithZoneRetainFields_DateTimeZone() {
        DateTime test = new DateTime(TEST_TIME1);
        DateTime result = test.withZoneRetainFields(PARIS);
NoAssert.donothing(test.getMillis() - DateTimeConstants.MILLIS_PER_HOUR, result.getMillis());
NoAssert.donothing(ISO_PARIS, result.getChronology());
        
        test = new DateTime(TEST_TIME1);
        result = test.withZoneRetainFields(LONDON);
NoAssert.donothing(test, result);
        
        test = new DateTime(TEST_TIME1);
        result = test.withZoneRetainFields(null);
        assertSame(test, result);
        
        test = new DateTime(TEST_TIME1, GREGORIAN_PARIS);
        result = test.withZoneRetainFields(null);
        assertEquals(test.getMillis() + DateTimeConstants.MILLIS_PER_HOUR, result.getMillis());
NoAssert.donothing(GREGORIAN_DEFAULT, result.getChronology());
        
        test = new DateTime(TEST_TIME1, new MockNullZoneChronology());
        result = test.withZoneRetainFields(LONDON);
NoAssert.donothing(test, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithDate_int_int_int() {
        DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC);
        DateTime result = test.withDate(2003, 5, 6);
        DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC);
        assertEquals(expected, result);
        
        test = new DateTime(TEST_TIME1);
        try {
            test.withDate(2003, 13, 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    @Test public void testWithDate_int_int_int_toDST1() {
        // 2010-03-28T02:55 is DST time, need to change to 03:55
        DateTime test = new DateTime(2015, 1, 10, 2, 55, 0, 0, ISO_PARIS);
        DateTime result = test.withDate(2010, 3, 28);
        DateTime expected = new DateTime(2010, 3, 28, 3, 55, 0, 0, ISO_PARIS);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testWithDate_int_int_int_toDST2() {
        // 2010-03-28T02:55 is DST time, need to change to 03:55
        DateTime test = new DateTime(2015, 1, 28, 2, 55, 0, 0, ISO_PARIS);
        DateTime result = test.withDate(2010, 3, 28);
        DateTime expected = new DateTime(2010, 3, 28, 3, 55, 0, 0, ISO_PARIS);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testWithDate_int_int_int_affectedByDST() {
        // 2010-03-28T02:55 is DST time, need to avoid time being changed to 03:55
        DateTime test = new DateTime(2015, 1, 28, 2, 55, 0, 0, ISO_PARIS);
        DateTime result = test.withDate(2010, 3, 10);
        DateTime expected = new DateTime(2010, 3, 10, 2, 55, 0, 0, ISO_PARIS);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testWithDate_LocalDate() {
        DateTime test = new DateTime(2002, 4, 5, 1, 2, 3, 4, ISO_UTC);
        DateTime result = test.withDate(new LocalDate(2003, 5, 6));
        DateTime expected = new DateTime(2003, 5, 6, 1, 2, 3, 4, ISO_UTC);
NoAssert.donothing(expected, result);
        
        test = new DateTime(TEST_TIME1);
        try {
            test.withDate(new LocalDate(2003, 13, 1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithTime_int_int_int_int() {
        DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC);
        DateTime result = test.withTime(12, 24, 0, 0);
NoAssert.donothing(TEST_TIME1, result.getMillis());
NoAssert.donothing(BUDDHIST_UTC, result.getChronology());
        
        test = new DateTime(TEST_TIME1);
        try {
            test.withTime(25, 1, 1, 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    @Test public void testWithTime_int_int_int_int_toDST() {
        // 2010-03-28T02:55 is DST time, need to change to 03:55
        DateTime test = new DateTime(2010, 3, 28, 0, 0, 0, 0, ISO_PARIS);
        DateTime result = test.withTime(2, 55, 0, 0);
        DateTime expected = new DateTime(2010, 3, 28, 3, 55, 0, 0, ISO_PARIS);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testWithTime_LocalTime() {
        DateTime test = new DateTime(TEST_TIME1 - 12345L, BUDDHIST_UTC);
        DateTime result = test.withTime(new LocalTime(12, 24, 0, 0));
NoAssert.donothing(TEST_TIME1, result.getMillis());
NoAssert.donothing(BUDDHIST_UTC, result.getChronology());
        
        test = new DateTime(TEST_TIME1);
        try {
            test.withTime(new LocalTime(25, 1, 1, 1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    @Test public void testWithTimeAtStartOfDay() {
        DateTime test = new DateTime(2018, 10, 28, 0, 0, DateTimeZone.forID("Atlantic/Azores"));
        DateTime result = test.withTimeAtStartOfDay();
NoAssert.donothing(test, result);
    }
    
    @SuppressWarnings("deprecation")
    @Test public void testWithFields_RPartial() {
        DateTime test = new DateTime(2004, 5, 6, 7, 8, 9, 0);
        DateTime result = test.withFields(new YearMonthDay(2003, 4, 5));
        DateTime expected = new DateTime(2003, 4, 5, 7, 8, 9, 0);
NoAssert.donothing(expected, result);
        
        test = new DateTime(TEST_TIME1);
        result = test.withFields(null);
NoAssert.donothing(test, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithField1() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime result = test.withField(DateTimeFieldType.year(), 2006);
        
NoAssert.donothing(new DateTime(2004, 6, 9, 0, 0, 0, 0), test);
NoAssert.donothing(new DateTime(2006, 6, 9, 0, 0, 0, 0), result);
    }

    @Test public void testWithField2() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFieldAdded1() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime result = test.withFieldAdded(DurationFieldType.years(), 6);
        
NoAssert.donothing(new DateTime(2004, 6, 9, 0, 0, 0, 0), test);
NoAssert.donothing(new DateTime(2010, 6, 9, 0, 0, 0, 0), result);
    }

    @Test public void testWithFieldAdded2() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded3() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded4() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime result = test.withFieldAdded(DurationFieldType.years(), 0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithDurationAdded_long_int() {
        DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        DateTime result = test.withDurationAdded(123456789L, 1);
        DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(123456789L, 0);
NoAssert.donothing(test, result);
        
        result = test.withDurationAdded(123456789L, 2);
        expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(123456789L, -3);
        expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithDurationAdded_RD_int() {
        DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        DateTime result = test.withDurationAdded(new Duration(123456789L), 1);
        DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(null, 1);
NoAssert.donothing(test, result);
        
        result = test.withDurationAdded(new Duration(123456789L), 0);
NoAssert.donothing(test, result);
        
        result = test.withDurationAdded(new Duration(123456789L), 2);
        expected = new DateTime(TEST_TIME1 + (2L * 123456789L), BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.withDurationAdded(new Duration(123456789L), -3);
        expected = new DateTime(TEST_TIME1 - (3L * 123456789L), BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithDurationAdded_RP_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 1);
        DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.withPeriodAdded(null, 1);
NoAssert.donothing(test, result);
        
        result = test.withPeriodAdded(new Period(1, 2, 3, 4, 5, 6, 7, 8), 0);
        assertSame(test, result);
        
        result = test.withPeriodAdded(new Period(1, 2, 0, 4, 5, 6, 7, 8), 3);
        expected = new DateTime(2005, 11, 15, 16, 20, 24, 28, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.withPeriodAdded(new Period(1, 2, 0, 1, 1, 2, 3, 4), -1);
        expected = new DateTime(2001, 3, 2, 0, 0, 0, 0, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
    }

    //-----------------------------------------------------------------------    
    @Test public void testPlus_long() {
        DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        DateTime result = test.plus(123456789L);
        DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testPlus_RD() {
        DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        DateTime result = test.plus(new Duration(123456789L));
        DateTime expected = new DateTime(TEST_TIME1 + 123456789L, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plus((ReadableDuration) null);
NoAssert.donothing(test, result);
    }
    
    @Test public void testPlus_RP() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        DateTime expected = new DateTime(2003, 7, 28, 6, 8, 10, 12, BUDDHIST_DEFAULT);
        assertEquals(expected, result);
        
        result = test.plus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusYears_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusYears(1);
        DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusYears(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMonths_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusMonths(1);
        DateTime expected = new DateTime(2002, 6, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusMonths(0);
        assertSame(test, result);
    }

    @Test public void testPlusMonths_intMax() {
        DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
NoAssert.donothing(new DateTime(178958986, 7, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MAX_VALUE - 2));
NoAssert.donothing(new DateTime(178958986, 8, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MAX_VALUE - 1));
NoAssert.donothing(new DateTime(178958986, 9, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MAX_VALUE));

NoAssert.donothing(new DateTime(178958986, 7, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MAX_VALUE - 2));
NoAssert.donothing(new DateTime(178958986, 8, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MAX_VALUE - 1));
NoAssert.donothing(new DateTime(178958986, 9, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MAX_VALUE));
    }

    @Test public void testPlusMonths_intMin() {
        DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
NoAssert.donothing(new DateTime(-178954955, 8, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MIN_VALUE + 2));
NoAssert.donothing(new DateTime(-178954955, 7, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MIN_VALUE + 1));
NoAssert.donothing(new DateTime(-178954955, 6, 20, 1, 2, 3, 4, ISO_UTC), test.plusMonths(Integer.MIN_VALUE));

NoAssert.donothing(new DateTime(-178954955, 8, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MIN_VALUE + 2));
NoAssert.donothing(new DateTime(-178954955, 7, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MIN_VALUE + 1));
NoAssert.donothing(new DateTime(-178954955, 6, 20, 1, 2, 3, 4, ISO_UTC), test.monthOfYear().addToCopy(Integer.MIN_VALUE));
    }

    @Test public void testPlusWeeks_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusWeeks(1);
        DateTime expected = new DateTime(2002, 5, 10, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusWeeks(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusDays_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusDays(1);
        DateTime expected = new DateTime(2002, 5, 4, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusDays(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusHours_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusHours(1);
        DateTime expected = new DateTime(2002, 5, 3, 2, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusHours(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMinutes_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusMinutes(1);
        DateTime expected = new DateTime(2002, 5, 3, 1, 3, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusMinutes(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusSeconds_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusSeconds(1);
        DateTime expected = new DateTime(2002, 5, 3, 1, 2, 4, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusSeconds(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMillis_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.plusMillis(1);
        DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 5, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.plusMillis(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------    
    @Test public void testMinus_long() {
        DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        DateTime result = test.minus(123456789L);
        DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
    }
    
    @Test public void testMinus_RD() {
        DateTime test = new DateTime(TEST_TIME1, BUDDHIST_DEFAULT);
        DateTime result = test.minus(new Duration(123456789L));
        DateTime expected = new DateTime(TEST_TIME1 - 123456789L, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadableDuration) null);
        assertSame(test, result);
    }
    
    @Test public void testMinus_RP() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        DateTime expected = new DateTime(2001, 3, 26, 0, 1, 2, 3, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusYears_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusYears(1);
        DateTime expected = new DateTime(2001, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusYears(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMonths_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusMonths(1);
        DateTime expected = new DateTime(2002, 4, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusMonths(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMonths_intMax() {
        DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
NoAssert.donothing(new DateTime(-178954955, 9, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MAX_VALUE - 2));
NoAssert.donothing(new DateTime(-178954955, 8, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MAX_VALUE - 1));
NoAssert.donothing(new DateTime(-178954955, 7, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MAX_VALUE));
    }

    @Test public void testMinusMonths_intMin() {
        DateTime test = new DateTime(2016, 2, 20, 1, 2, 3, 4, ISO_UTC);
NoAssert.donothing(new DateTime(178958986, 8, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MIN_VALUE + 2));
NoAssert.donothing(new DateTime(178958986, 9, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MIN_VALUE + 1));
NoAssert.donothing(new DateTime(178958986, 10, 20, 1, 2, 3, 4, ISO_UTC), test.minusMonths(Integer.MIN_VALUE));
    }

    @Test public void testMinusWeeks_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusWeeks(1);
        DateTime expected = new DateTime(2002, 4, 26, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusWeeks(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusDays_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusDays(1);
        DateTime expected = new DateTime(2002, 5, 2, 1, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusDays(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusHours_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusHours(1);
        DateTime expected = new DateTime(2002, 5, 3, 0, 2, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusHours(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMinutes_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusMinutes(1);
        DateTime expected = new DateTime(2002, 5, 3, 1, 1, 3, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusMinutes(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusSeconds_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusSeconds(1);
        DateTime expected = new DateTime(2002, 5, 3, 1, 2, 2, 4, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusSeconds(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMillis_int() {
        DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT);
        DateTime result = test.minusMillis(1);
        DateTime expected = new DateTime(2002, 5, 3, 1, 2, 3, 3, BUDDHIST_DEFAULT);
NoAssert.donothing(expected, result);
        
        result = test.minusMillis(0);
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testProperty() {
        DateTime test = new DateTime();
NoAssert.donothing(test.year(), test.property(DateTimeFieldType.year()));
NoAssert.donothing(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {
                return DurationFieldType.weeks();
            }
            public DurationFieldType getRangeDurationType() {
                return null;
            }
            public DateTimeField getField(Chronology chronology) {
                return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }
        };
        try {
            test.property(bad);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.property(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    private void check(DateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {
NoAssert.donothing(year, test.getYear());
        assertEquals(month, test.getMonthOfYear());
        assertEquals(day, test.getDayOfMonth());
NoAssert.donothing(hour, test.getHourOfDay());
NoAssert.donothing(min, test.getMinuteOfHour());
NoAssert.donothing(sec, test.getSecondOfMinute());
NoAssert.donothing(mil, test.getMillisOfSecond());
    }

}
