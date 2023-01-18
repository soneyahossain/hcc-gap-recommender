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
package org.joda.time;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.convert.StringConvert;
import org.joda.time.chrono.ISOChronology;

/**
 * Test string conversion.
 *
 * @author Stephen Colebourne
 */
public class TestStringConvert  { //extends TestCase {

    private static final DateTimeZone ZONE = DateTimeZone.forID("+02:00");

    public static void main(String[] args) throws Exception  {
        TestStringConvert TB= new TestStringConvert();
        TB.setUp(); TB.testDateMidnight(); TB.tearDown();
        TB.setUp(); TB.testDateTime(); TB.tearDown();
        TB.setUp(); TB.testMutableDateTime(); TB.tearDown();
        TB.setUp(); TB.testLocalDateTime(); TB.tearDown();
        TB.setUp(); TB.testLocalDate(); TB.tearDown();
        TB.setUp(); TB.testLocalTime(); TB.tearDown();
        TB.setUp(); TB.testYearMonth(); TB.tearDown();
        TB.setUp(); TB.testMonthDay(); TB.tearDown();
        TB.setUp(); TB.testMonthDay_leapDay(); TB.tearDown();
        TB.setUp(); TB.testTimeZone(); TB.tearDown();
//    TB.setUp(); TB.testInterval(); TB.tearDown();
        TB.setUp(); TB.testDuration(); TB.tearDown();
        TB.setUp(); TB.testPeriod(); TB.tearDown();
        TB.setUp(); TB.testMutablePeriod(); TB.tearDown();
        TB.setUp(); TB.testYears(); TB.tearDown();
        TB.setUp(); TB.testMonths(); TB.tearDown();
        TB.setUp(); TB.testWeeks(); TB.tearDown();
        TB.setUp(); TB.testDays(); TB.tearDown();
        TB.setUp(); TB.testHours(); TB.tearDown();
        TB.setUp(); TB.testMinutes(); TB.tearDown();
        TB.setUp(); TB.testSeconds(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestStringConvert.class);
    }

    public TestStringConvert(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testDateMidnight() {
        DateMidnight test = new DateMidnight(2010, 6, 30, ISOChronology.getInstance(ZONE));
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("2010-06-30T00:00:00.000+02:00", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(DateMidnight.class, str));
    }

    @Test public void testDateTime() {
        DateTime test = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("2010-06-30T02:30:50.678+02:00", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTime.class, str));
    }

    @Test public void testMutableDateTime() {
        MutableDateTime test = new MutableDateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("2010-06-30T02:30:50.678+02:00", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(MutableDateTime.class, str));
    }

    @Test public void testLocalDateTime() {
        LocalDateTime test = new LocalDateTime(2010, 6, 30, 2, 30);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("2010-06-30T02:30:00.000", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalDateTime.class, str));
    }

    @Test public void testLocalDate() {
        LocalDate test = new LocalDate(2010, 6, 30);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("2010-06-30", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalDate.class, str));
    }

    @Test public void testLocalTime() {
        LocalTime test = new LocalTime(2, 30, 50, 678);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("02:30:50.678", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(LocalTime.class, str));
    }

    @Test public void testYearMonth() {
        YearMonth test = new YearMonth(2010, 6);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("2010-06", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(YearMonth.class, str));
    }

    @Test public void testMonthDay() {
        MonthDay test = new MonthDay(6, 30);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("--06-30", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str));
    }

    @Test public void testMonthDay_leapDay() {
        MonthDay test = new MonthDay(2, 29);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("--02-29", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(MonthDay.class, str));
    }

    //-----------------------------------------------------------------------
    @Test public void testTimeZone() {
        DateTimeZone test = DateTimeZone.forID("Europe/Paris");
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("Europe/Paris", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(DateTimeZone.class, str));
    }

//    @Test public void testInterval() {
//        DateTime a = new DateTime(2010, 6, 30, 2, 30, 50, 678, ISOChronology.getInstance(ZONE));
//        DateTime b = new DateTime(2011, 9, 10, 4, 20, 40, 234, ISOChronology.getInstance(ZONE));
//        Interval test = new Interval(a, b);
//        String str = StringConvert.INSTANCE.convertToString(test);
//        assertEquals("2010-06-30T02:30:50.678+02:00/2011-09-10T04:20:40.234+02:00", str);
//        assertEquals(test, StringConvert.INSTANCE.convertFromString(Interval.class, str));
//    }

    @Test public void testDuration() {
        Duration test = new Duration(12345678L);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("PT12345.678S", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Duration.class, str));
    }

    @Test public void testPeriod() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("P1Y2M3W4DT5H6M7.008S", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Period.class, str));
    }

    @Test public void testMutablePeriod() {
        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("P1Y2M3W4DT5H6M7.008S", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(MutablePeriod.class, str));
    }

    @Test public void testYears() {
        Years test = Years.years(5);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("P5Y", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Years.class, str));
    }

    @Test public void testMonths() {
        Months test = Months.months(5);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("P5M", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Months.class, str));
    }

    @Test public void testWeeks() {
        Weeks test = Weeks.weeks(5);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("P5W", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Weeks.class, str));
    }

    @Test public void testDays() {
        Days test = Days.days(5);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("P5D", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Days.class, str));
    }

    @Test public void testHours() {
        Hours test = Hours.hours(5);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("PT5H", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Hours.class, str));
    }

    @Test public void testMinutes() {
        Minutes test = Minutes.minutes(5);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("PT5M", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Minutes.class, str));
    }

    @Test public void testSeconds() {
        Seconds test = Seconds.seconds(5);
        String str = StringConvert.INSTANCE.convertToString(test);
        assertEquals("PT5S", str);
        assertEquals(test, StringConvert.INSTANCE.convertFromString(Seconds.class, str));
    }

}
