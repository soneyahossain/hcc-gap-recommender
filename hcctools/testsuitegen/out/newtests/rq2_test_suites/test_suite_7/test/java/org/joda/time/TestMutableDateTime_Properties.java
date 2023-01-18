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

import java.util.Locale;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Exception  {
        TestMutableDateTime_Properties TB= new TestMutableDateTime_Properties();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYearOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetCenturyOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYearOfCentury(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddLongDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertySetDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundFloorHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundCeilingHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundHalfFloorHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundHalfCeilingHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundHalfEvenHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyRemainderHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMinuteOfHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMinuteOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetSecondOfMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetSecondOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMillisOfSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMillisOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalYearOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalYearOfCentury(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalMinuteOfHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalSecondOfMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalMillisOfSecond(); TB.tearDown();

    }



    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetEra() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().era(), test.era().getField());
NoAssert.donothing("era", test.era().getName());
NoAssert.donothing("Property[era]", test.era().toString());
NoAssert.donothing(test, test.era().getMutableDateTime());
NoAssert.donothing(1, test.era().get());
NoAssert.donothing("AD", test.era().getAsText());
NoAssert.donothing("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
NoAssert.donothing("AD", test.era().getAsShortText());
NoAssert.donothing("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().eras(), test.era().getDurationField());
        assertEquals(null, test.era().getRangeDurationField());
NoAssert.donothing(2, test.era().getMaximumTextLength(null));
NoAssert.donothing(9, test.era().getMaximumTextLength(Locale.FRENCH));
NoAssert.donothing(2, test.era().getMaximumShortTextLength(null));
        assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYearOfEra() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().yearOfEra(), test.yearOfEra().getField());
NoAssert.donothing("yearOfEra", test.yearOfEra().getName());
NoAssert.donothing("Property[yearOfEra]", test.yearOfEra().toString());
NoAssert.donothing(2004, test.yearOfEra().get());
NoAssert.donothing("2004", test.yearOfEra().getAsText());
NoAssert.donothing("2004", test.yearOfEra().getAsText(Locale.FRENCH));
NoAssert.donothing("2004", test.yearOfEra().getAsShortText());
NoAssert.donothing("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
NoAssert.donothing(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
NoAssert.donothing(9, test.yearOfEra().getMaximumTextLength(null));
        assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetCenturyOfEra() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
NoAssert.donothing("centuryOfEra", test.centuryOfEra().getName());
NoAssert.donothing("Property[centuryOfEra]", test.centuryOfEra().toString());
NoAssert.donothing(20, test.centuryOfEra().get());
NoAssert.donothing("20", test.centuryOfEra().getAsText());
NoAssert.donothing("20", test.centuryOfEra().getAsText(Locale.FRENCH));
NoAssert.donothing("20", test.centuryOfEra().getAsShortText());
NoAssert.donothing("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
NoAssert.donothing(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
        assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
NoAssert.donothing(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYearOfCentury() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
NoAssert.donothing("yearOfCentury", test.yearOfCentury().getName());
NoAssert.donothing("Property[yearOfCentury]", test.yearOfCentury().toString());
NoAssert.donothing(4, test.yearOfCentury().get());
NoAssert.donothing("4", test.yearOfCentury().getAsText());
NoAssert.donothing("4", test.yearOfCentury().getAsText(Locale.FRENCH));
NoAssert.donothing("4", test.yearOfCentury().getAsShortText());
NoAssert.donothing("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.yearOfCentury().getDurationField());
NoAssert.donothing(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
        assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
NoAssert.donothing(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetWeekyear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().weekyear(), test.weekyear().getField());
        assertEquals("weekyear", test.weekyear().getName());
NoAssert.donothing("Property[weekyear]", test.weekyear().toString());
NoAssert.donothing(2004, test.weekyear().get());
        assertEquals("2004", test.weekyear().getAsText());
NoAssert.donothing("2004", test.weekyear().getAsText(Locale.FRENCH));
NoAssert.donothing("2004", test.weekyear().getAsShortText());
NoAssert.donothing("2004", test.weekyear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().weekyears(), test.weekyear().getDurationField());
NoAssert.donothing(null, test.weekyear().getRangeDurationField());
NoAssert.donothing(9, test.weekyear().getMaximumTextLength(null));
NoAssert.donothing(9, test.weekyear().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().year(), test.year().getField());
        assertEquals("year", test.year().getName());
NoAssert.donothing("Property[year]", test.year().toString());
NoAssert.donothing(2004, test.year().get());
NoAssert.donothing("2004", test.year().getAsText());
        assertEquals("2004", test.year().getAsText(Locale.FRENCH));
        assertEquals("2004", test.year().getAsShortText());
NoAssert.donothing("2004", test.year().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.year().getDurationField());
NoAssert.donothing(null, test.year().getRangeDurationField());
NoAssert.donothing(9, test.year().getMaximumTextLength(null));
NoAssert.donothing(9, test.year().getMaximumShortTextLength(null));
NoAssert.donothing(-292275054, test.year().getMinimumValue());
NoAssert.donothing(-292275054, test.year().getMinimumValueOverall());
NoAssert.donothing(292278993, test.year().getMaximumValue());
NoAssert.donothing(292278993, test.year().getMaximumValueOverall());
    }

    @Test public void testPropertyAddYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.year().add(9);
NoAssert.donothing("2013-06-09T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyAddWrapFieldYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.year().addWrapField(9);
NoAssert.donothing("2013-06-09T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertySetYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.year().set(1960);
NoAssert.donothing("1960-06-09T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertySetTextYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.year().set("1960");
NoAssert.donothing("1960-06-09T00:00:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMonthOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().monthOfYear(), test.monthOfYear().getField());
NoAssert.donothing("monthOfYear", test.monthOfYear().getName());
NoAssert.donothing("Property[monthOfYear]", test.monthOfYear().toString());
NoAssert.donothing(6, test.monthOfYear().get());
NoAssert.donothing("June", test.monthOfYear().getAsText());
NoAssert.donothing("juin", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("Jun", test.monthOfYear().getAsShortText());
NoAssert.donothing("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().months(), test.monthOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
NoAssert.donothing(9, test.monthOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.monthOfYear().getMaximumShortTextLength(null));
        test = new MutableDateTime(2004, 7, 9, 0, 0, 0, 0);
NoAssert.donothing("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
NoAssert.donothing(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
NoAssert.donothing(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
    }

    @Test public void testPropertyAddMonthOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.monthOfYear().add(6);
NoAssert.donothing("2004-12-09T00:00:00.000Z", test.toString());
    }

    @Test public void testPropertyAddWrapFieldMonthOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.monthOfYear().addWrapField(8);
NoAssert.donothing("2004-02-09T00:00:00.000Z", test.toString());
    }

    @Test public void testPropertySetMonthOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.monthOfYear().set(12);
        assertEquals("2004-12-09T00:00:00.000Z", test.toString());
    }

    @Test public void testPropertySetTextMonthOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.monthOfYear().set("12");
NoAssert.donothing("2004-12-09T00:00:00.000Z", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.monthOfYear().set("December");
NoAssert.donothing("2004-12-09T00:00:00.000Z", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.monthOfYear().set("Dec");
NoAssert.donothing("2004-12-09T00:00:00.000Z", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfMonth() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
NoAssert.donothing("dayOfMonth", test.dayOfMonth().getName());
NoAssert.donothing("Property[dayOfMonth]", test.dayOfMonth().toString());
NoAssert.donothing(9, test.dayOfMonth().get());
NoAssert.donothing("9", test.dayOfMonth().getAsText());
NoAssert.donothing("9", test.dayOfMonth().getAsText(Locale.FRENCH));
NoAssert.donothing("9", test.dayOfMonth().getAsShortText());
NoAssert.donothing("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
NoAssert.donothing(2, test.dayOfMonth().getMaximumTextLength(null));
NoAssert.donothing(2, test.dayOfMonth().getMaximumShortTextLength(null));
NoAssert.donothing(1, test.dayOfMonth().getMinimumValue());
NoAssert.donothing(1, test.dayOfMonth().getMinimumValueOverall());
NoAssert.donothing(30, test.dayOfMonth().getMaximumValue());
        assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
NoAssert.donothing(false, test.dayOfMonth().isLeap());
NoAssert.donothing(0, test.dayOfMonth().getLeapAmount());
NoAssert.donothing(null, test.dayOfMonth().getLeapDurationField());
    }

    @Test public void testPropertyAddDayOfMonth() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfMonth().add(9);
NoAssert.donothing("2004-06-18T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyAddWrapFieldDayOfMonth() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfMonth().addWrapField(22);
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertySetDayOfMonth() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfMonth().set(12);
NoAssert.donothing("2004-06-12T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertySetTextDayOfMonth() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfMonth().set("12");
NoAssert.donothing("2004-06-12T00:00:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfYear() {
        // 31+29+31+30+31+9 = 161
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField());
NoAssert.donothing("dayOfYear", test.dayOfYear().getName());
NoAssert.donothing("Property[dayOfYear]", test.dayOfYear().toString());
NoAssert.donothing(161, test.dayOfYear().get());
NoAssert.donothing("161", test.dayOfYear().getAsText());
NoAssert.donothing("161", test.dayOfYear().getAsText(Locale.FRENCH));
        assertEquals("161", test.dayOfYear().getAsShortText());
NoAssert.donothing("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
NoAssert.donothing(3, test.dayOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.dayOfYear().getMaximumShortTextLength(null));
NoAssert.donothing(false, test.dayOfYear().isLeap());
NoAssert.donothing(0, test.dayOfYear().getLeapAmount());
NoAssert.donothing(null, test.dayOfYear().getLeapDurationField());
    }

    @Test public void testPropertyAddDayOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfYear().add(9);
NoAssert.donothing("2004-06-18T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyAddWrapFieldDayOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfYear().addWrapField(206);
NoAssert.donothing("2004-01-01T00:00:00.000Z", test.toString());
    }

    @Test public void testPropertySetDayOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfYear().set(12);
NoAssert.donothing("2004-01-12T00:00:00.000Z", test.toString());
    }

    @Test public void testPropertySetTextDayOfYear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfYear().set("12");
NoAssert.donothing("2004-01-12T00:00:00.000Z", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetWeekOfWeekyear() {
        // 2002-01-01 = Thu
        // 2002-12-31 = Thu (+364 days)
        // 2003-12-30 = Thu (+364 days)
        // 2004-01-03 = Mon             W1
        // 2004-01-31 = Mon (+28 days)  W5
        // 2004-02-28 = Mon (+28 days)  W9
        // 2004-03-27 = Mon (+28 days)  W13
        // 2004-04-24 = Mon (+28 days)  W17
        // 2004-05-23 = Mon (+28 days)  W21
        // 2004-06-05 = Mon (+14 days)  W23
        // 2004-06-09 = Fri
        // 2004-12-25 = Mon             W52
        // 2005-01-01 = Mon             W1
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
NoAssert.donothing("weekOfWeekyear", test.weekOfWeekyear().getName());
        assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
NoAssert.donothing(24, test.weekOfWeekyear().get());
NoAssert.donothing("24", test.weekOfWeekyear().getAsText());
NoAssert.donothing("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
NoAssert.donothing("24", test.weekOfWeekyear().getAsShortText());
NoAssert.donothing("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
NoAssert.donothing(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(2, test.weekOfWeekyear().getMaximumTextLength(null));
NoAssert.donothing(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
NoAssert.donothing(false, test.weekOfWeekyear().isLeap());
NoAssert.donothing(0, test.weekOfWeekyear().getLeapAmount());
NoAssert.donothing(null, test.weekOfWeekyear().getLeapDurationField());
    }

    @Test public void testPropertyAddWeekOfWeekyear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        test.weekOfWeekyear().add(1);
NoAssert.donothing("2004-06-14T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyAddWrapFieldWeekOfWeekyear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        test.weekOfWeekyear().addWrapField(30);
NoAssert.donothing("2003-12-29T00:00:00.000Z", test.toString());
    }

    @Test public void testPropertySetWeekOfWeekyear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        test.weekOfWeekyear().set(4);
NoAssert.donothing("2004-01-19T00:00:00.000Z", test.toString());
    }

    @Test public void testPropertySetTextWeekOfWeekyear() {
        MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0);
        test.weekOfWeekyear().set("4");
NoAssert.donothing("2004-01-19T00:00:00.000Z", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfWeek() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
NoAssert.donothing("dayOfWeek", test.dayOfWeek().getName());
NoAssert.donothing("Property[dayOfWeek]", test.dayOfWeek().toString());
NoAssert.donothing(3, test.dayOfWeek().get());
NoAssert.donothing("Wednesday", test.dayOfWeek().getAsText());
NoAssert.donothing("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
NoAssert.donothing("Wed", test.dayOfWeek().getAsShortText());
NoAssert.donothing("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfWeek().getDurationField());
        assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
NoAssert.donothing(9, test.dayOfWeek().getMaximumTextLength(null));
NoAssert.donothing(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
NoAssert.donothing(3, test.dayOfWeek().getMaximumShortTextLength(null));
NoAssert.donothing(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
NoAssert.donothing(1, test.dayOfWeek().getMinimumValue());
NoAssert.donothing(1, test.dayOfWeek().getMinimumValueOverall());
        assertEquals(7, test.dayOfWeek().getMaximumValue());
NoAssert.donothing(7, test.dayOfWeek().getMaximumValueOverall());
NoAssert.donothing(false, test.dayOfWeek().isLeap());
NoAssert.donothing(0, test.dayOfWeek().getLeapAmount());
NoAssert.donothing(null, test.dayOfWeek().getLeapDurationField());
    }

    @Test public void testPropertyAddDayOfWeek() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfWeek().add(1);
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyAddLongDayOfWeek() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfWeek().add(1L);
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyAddWrapFieldDayOfWeek() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);  // Wed
        test.dayOfWeek().addWrapField(5);
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertySetDayOfWeek() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfWeek().set(4);
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertySetTextDayOfWeek() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfWeek().set("4");
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfWeek().set("Mon");
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfWeek().set("Tuesday");
NoAssert.donothing("2004-06-08T00:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0);
        test.dayOfWeek().set("lundi", Locale.FRENCH);
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetHourOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().hourOfDay(), test.hourOfDay().getField());
NoAssert.donothing("hourOfDay", test.hourOfDay().getName());
NoAssert.donothing("Property[hourOfDay]", test.hourOfDay().toString());
NoAssert.donothing(13, test.hourOfDay().get());
NoAssert.donothing("13", test.hourOfDay().getAsText());
NoAssert.donothing("13", test.hourOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("13", test.hourOfDay().getAsShortText());
NoAssert.donothing("13", test.hourOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().hours(), test.hourOfDay().getDurationField());
NoAssert.donothing(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
NoAssert.donothing(2, test.hourOfDay().getMaximumTextLength(null));
NoAssert.donothing(2, test.hourOfDay().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyRoundFloorHourOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        test.hourOfDay().roundFloor();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyRoundCeilingHourOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        test.hourOfDay().roundCeiling();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyRoundHalfFloorHourOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        test.hourOfDay().roundHalfFloor();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        test.hourOfDay().roundHalfFloor();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        test.hourOfDay().roundHalfFloor();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyRoundHalfCeilingHourOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        test.hourOfDay().roundHalfCeiling();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        test.hourOfDay().roundHalfCeiling();
        assertEquals("2004-06-09T14:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        test.hourOfDay().roundHalfCeiling();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyRoundHalfEvenHourOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
        test.hourOfDay().roundHalfEven();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0);
        test.hourOfDay().roundHalfEven();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1);
        test.hourOfDay().roundHalfEven();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999);
        test.hourOfDay().roundHalfEven();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", test.toString());
    }

    @Test public void testPropertyRemainderHourOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0);
NoAssert.donothing(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMinuteOfHour() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
NoAssert.donothing("minuteOfHour", test.minuteOfHour().getName());
NoAssert.donothing("Property[minuteOfHour]", test.minuteOfHour().toString());
NoAssert.donothing(23, test.minuteOfHour().get());
        assertEquals("23", test.minuteOfHour().getAsText());
NoAssert.donothing("23", test.minuteOfHour().getAsText(Locale.FRENCH));
NoAssert.donothing("23", test.minuteOfHour().getAsShortText());
NoAssert.donothing("23", test.minuteOfHour().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
NoAssert.donothing(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
NoAssert.donothing(2, test.minuteOfHour().getMaximumTextLength(null));
NoAssert.donothing(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMinuteOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().minuteOfDay(), test.minuteOfDay().getField());
NoAssert.donothing("minuteOfDay", test.minuteOfDay().getName());
NoAssert.donothing("Property[minuteOfDay]", test.minuteOfDay().toString());
        assertEquals(803, test.minuteOfDay().get());
NoAssert.donothing("803", test.minuteOfDay().getAsText());
NoAssert.donothing("803", test.minuteOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("803", test.minuteOfDay().getAsShortText());
NoAssert.donothing("803", test.minuteOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().minutes(), test.minuteOfDay().getDurationField());
NoAssert.donothing(test.getChronology().days(), test.minuteOfDay().getRangeDurationField());
NoAssert.donothing(4, test.minuteOfDay().getMaximumTextLength(null));
NoAssert.donothing(4, test.minuteOfDay().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetSecondOfMinute() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
NoAssert.donothing("secondOfMinute", test.secondOfMinute().getName());
        assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
NoAssert.donothing(43, test.secondOfMinute().get());
NoAssert.donothing("43", test.secondOfMinute().getAsText());
NoAssert.donothing("43", test.secondOfMinute().getAsText(Locale.FRENCH));
NoAssert.donothing("43", test.secondOfMinute().getAsShortText());
NoAssert.donothing("43", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
NoAssert.donothing(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
NoAssert.donothing(2, test.secondOfMinute().getMaximumTextLength(null));
NoAssert.donothing(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetSecondOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().secondOfDay(), test.secondOfDay().getField());
NoAssert.donothing("secondOfDay", test.secondOfDay().getName());
NoAssert.donothing("Property[secondOfDay]", test.secondOfDay().toString());
NoAssert.donothing(48223, test.secondOfDay().get());
NoAssert.donothing("48223", test.secondOfDay().getAsText());
NoAssert.donothing("48223", test.secondOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("48223", test.secondOfDay().getAsShortText());
NoAssert.donothing("48223", test.secondOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().seconds(), test.secondOfDay().getDurationField());
        assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField());
NoAssert.donothing(5, test.secondOfDay().getMaximumTextLength(null));
NoAssert.donothing(5, test.secondOfDay().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMillisOfSecond() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        assertEquals("millisOfSecond", test.millisOfSecond().getName());
NoAssert.donothing("Property[millisOfSecond]", test.millisOfSecond().toString());
NoAssert.donothing(53, test.millisOfSecond().get());
NoAssert.donothing("53", test.millisOfSecond().getAsText());
NoAssert.donothing("53", test.millisOfSecond().getAsText(Locale.FRENCH));
NoAssert.donothing("53", test.millisOfSecond().getAsShortText());
NoAssert.donothing("53", test.millisOfSecond().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().millis(), test.millisOfSecond().getDurationField());
NoAssert.donothing(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
NoAssert.donothing(3, test.millisOfSecond().getMaximumTextLength(null));
NoAssert.donothing(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMillisOfDay() {
        MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().millisOfDay(), test.millisOfDay().getField());
NoAssert.donothing("millisOfDay", test.millisOfDay().getName());
NoAssert.donothing("Property[millisOfDay]", test.millisOfDay().toString());
NoAssert.donothing(48223053, test.millisOfDay().get());
NoAssert.donothing("48223053", test.millisOfDay().getAsText());
NoAssert.donothing("48223053", test.millisOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("48223053", test.millisOfDay().getAsShortText());
NoAssert.donothing("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().millis(), test.millisOfDay().getDurationField());
NoAssert.donothing(test.getChronology().days(), test.millisOfDay().getRangeDurationField());
NoAssert.donothing(8, test.millisOfDay().getMaximumTextLength(null));
NoAssert.donothing(8, test.millisOfDay().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyToIntervalYearOfEra() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.yearOfEra().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }

    @Test public void testPropertyToIntervalYearOfCentury() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.yearOfCentury().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }

    @Test public void testPropertyToIntervalYear() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.year().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }

    @Test public void testPropertyToIntervalMonthOfYear() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.monthOfYear().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }

    @Test public void testPropertyToIntervalDayOfMonth() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.dayOfMonth().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 6, 10, 0, 0, 0, 0), testInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);

      MutableDateTime febTest = new MutableDateTime(2004, 2, 29, 13, 23, 43, 53);
      Interval febTestInterval = febTest.dayOfMonth().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0), febTestInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 3, 1, 0, 0, 0, 0), febTestInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 13, 23, 43, 53), febTest);
    }

    @Test public void testPropertyToIntervalHourOfDay() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.hourOfDay().toInterval();
      assertEquals(new MutableDateTime(2004, 6, 9, 13, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 14, 0, 0, 0), testInterval.getEnd());
      assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);

      MutableDateTime midnightTest = new MutableDateTime(2004, 6, 9, 23, 23, 43, 53);
      Interval midnightTestInterval = midnightTest.hourOfDay().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 23, 0, 0, 0), midnightTestInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 6, 10, 0, 0, 0, 0), midnightTestInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 23, 23, 43, 53), midnightTest);
    }

    @Test public void testPropertyToIntervalMinuteOfHour() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.minuteOfHour().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 0, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 24, 0, 0), testInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }

    @Test public void testPropertyToIntervalSecondOfMinute() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.secondOfMinute().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 0), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 44, 0), testInterval.getEnd());
      assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }

    @Test public void testPropertyToIntervalMillisOfSecond() {
      MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.millisOfSecond().toInterval();
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd());
NoAssert.donothing(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test);
    }

}
