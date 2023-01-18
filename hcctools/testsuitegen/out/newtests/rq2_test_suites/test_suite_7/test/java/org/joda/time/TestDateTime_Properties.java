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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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
        TestDateTime_Properties TB= new TestDateTime_Properties();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYearOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetCenturyOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYearOfCentury(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyLeapYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToYear2(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyLeapMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaximumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaximumValueMillisOfDayDSTGap(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMinimumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMinimumValueMillisOfDayDSTGap(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddLongDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertySetDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetHourOfDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDifferenceHourOfDay(); TB.tearDown();
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
        TB.setUp(); TB.testPropertyEqualsHashCodeLenient(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeStrict(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTime_Properties.class);
    }

    public TestDateTime_Properties(String name) {
        super(name);
    }

     */

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
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetEra() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().era(), test.era().getField());
NoAssert.donothing("era", test.era().getName());
NoAssert.donothing("Property[era]", test.era().toString());
NoAssert.donothing(test, test.era().getDateTime());
NoAssert.donothing(1, test.era().get());
NoAssert.donothing("1", test.era().getAsString());
NoAssert.donothing("AD", test.era().getAsText());
NoAssert.donothing("AD", test.era().getField().getAsText(1, Locale.ENGLISH));
        assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
NoAssert.donothing("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH));
NoAssert.donothing("AD", test.era().getAsShortText());
NoAssert.donothing("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH));
NoAssert.donothing("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
NoAssert.donothing("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH));
NoAssert.donothing(test.getChronology().eras(), test.era().getDurationField());
NoAssert.donothing(null, test.era().getRangeDurationField());
NoAssert.donothing(2, test.era().getMaximumTextLength(null));
        assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
NoAssert.donothing(2, test.era().getMaximumShortTextLength(null));
NoAssert.donothing(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYearOfEra() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().yearOfEra(), test.yearOfEra().getField());
NoAssert.donothing("yearOfEra", test.yearOfEra().getName());
NoAssert.donothing("Property[yearOfEra]", test.yearOfEra().toString());
NoAssert.donothing(test, test.yearOfEra().getDateTime());
NoAssert.donothing(2004, test.yearOfEra().get());
NoAssert.donothing("2004", test.yearOfEra().getAsString());
NoAssert.donothing("2004", test.yearOfEra().getAsText());
NoAssert.donothing("2004", test.yearOfEra().getAsText(Locale.FRENCH));
NoAssert.donothing("2004", test.yearOfEra().getAsShortText());
NoAssert.donothing("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.yearOfEra().getDurationField());
NoAssert.donothing(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
NoAssert.donothing(9, test.yearOfEra().getMaximumTextLength(null));
NoAssert.donothing(9, test.yearOfEra().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetCenturyOfEra() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
NoAssert.donothing("centuryOfEra", test.centuryOfEra().getName());
        assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString());
NoAssert.donothing(test, test.centuryOfEra().getDateTime());
NoAssert.donothing(20, test.centuryOfEra().get());
NoAssert.donothing("20", test.centuryOfEra().getAsString());
NoAssert.donothing("20", test.centuryOfEra().getAsText());
NoAssert.donothing("20", test.centuryOfEra().getAsText(Locale.FRENCH));
NoAssert.donothing("20", test.centuryOfEra().getAsShortText());
NoAssert.donothing("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
NoAssert.donothing(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
NoAssert.donothing(7, test.centuryOfEra().getMaximumTextLength(null));
NoAssert.donothing(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYearOfCentury() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
NoAssert.donothing("yearOfCentury", test.yearOfCentury().getName());
NoAssert.donothing("Property[yearOfCentury]", test.yearOfCentury().toString());
NoAssert.donothing(test, test.yearOfCentury().getDateTime());
NoAssert.donothing(4, test.yearOfCentury().get());
NoAssert.donothing("4", test.yearOfCentury().getAsString());
NoAssert.donothing("4", test.yearOfCentury().getAsText());
NoAssert.donothing("4", test.yearOfCentury().getAsText(Locale.FRENCH));
NoAssert.donothing("4", test.yearOfCentury().getAsShortText());
NoAssert.donothing("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.yearOfCentury().getDurationField());
NoAssert.donothing(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
NoAssert.donothing(2, test.yearOfCentury().getMaximumTextLength(null));
NoAssert.donothing(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetWeekyear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().weekyear(), test.weekyear().getField());
NoAssert.donothing("weekyear", test.weekyear().getName());
NoAssert.donothing("Property[weekyear]", test.weekyear().toString());
NoAssert.donothing(test, test.weekyear().getDateTime());
NoAssert.donothing(2004, test.weekyear().get());
NoAssert.donothing("2004", test.weekyear().getAsString());
NoAssert.donothing("2004", test.weekyear().getAsText());
NoAssert.donothing("2004", test.weekyear().getAsText(Locale.FRENCH));
NoAssert.donothing("2004", test.weekyear().getAsShortText());
        assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().weekyears(), test.weekyear().getDurationField());
        assertEquals(null, test.weekyear().getRangeDurationField());
NoAssert.donothing(9, test.weekyear().getMaximumTextLength(null));
        assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().year(), test.year().getField());
NoAssert.donothing("year", test.year().getName());
NoAssert.donothing("Property[year]", test.year().toString());
NoAssert.donothing(test, test.year().getDateTime());
        assertEquals(2004, test.year().get());
NoAssert.donothing("2004", test.year().getAsString());
NoAssert.donothing("2004", test.year().getAsText());
NoAssert.donothing("2004", test.year().getAsText(Locale.FRENCH));
NoAssert.donothing("2004", test.year().getAsShortText());
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

    @Test public void testPropertyLeapYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        assertEquals(true, test.year().isLeap());
NoAssert.donothing(1, test.year().getLeapAmount());
NoAssert.donothing(test.getChronology().days(), test.year().getLeapDurationField());
        test = new DateTime(2003, 6, 9, 0, 0, 0, 0);
        assertEquals(false, test.year().isLeap());
NoAssert.donothing(0, test.year().getLeapAmount());
NoAssert.donothing(test.getChronology().days(), test.year().getLeapDurationField());
    }

    @Test public void testPropertyAddYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.year().addToCopy(9);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2013-06-09T00:00:00.000+01:00", copy.toString());
        
        copy = test.year().addToCopy(0);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", copy.toString());
        
        copy = test.year().addToCopy(292277023 - 2004);
NoAssert.donothing(292277023, copy.getYear());
        
        try {
            test.year().addToCopy(292278993 - 2004 + 1);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        copy = test.year().addToCopy(-2004);
NoAssert.donothing(0, copy.getYear());
        
        copy = test.year().addToCopy(-2005);
NoAssert.donothing(-1, copy.getYear());
        
        try {
            test.year().addToCopy(-292275054 - 2004 - 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertyAddWrapFieldYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.year().addWrapFieldToCopy(9);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2013-06-09T00:00:00.000+01:00", copy.toString());
        
        copy = test.year().addWrapFieldToCopy(0);
NoAssert.donothing(2004, copy.getYear());
        
        copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1);
NoAssert.donothing(-292275054, copy.getYear());
        
        copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1);
NoAssert.donothing(292278993, copy.getYear());
    }

    @Test public void testPropertySetYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.year().setCopy(1960);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("1960-06-09T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertySetTextYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.year().setCopy("1960");
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
        assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyCompareToYear() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.year().compareTo(test2) < 0);
        assertEquals(true, test2.year().compareTo(test1) > 0);
NoAssert.donothing(true, test1.year().compareTo(test1) == 0);
        try {
            test1.year().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @SuppressWarnings("deprecation")
    @Test public void testPropertyCompareToYear2() {
        DateTime test1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        YearMonthDay ymd1 = new YearMonthDay(2003, 6, 9);
        YearMonthDay ymd2 = new YearMonthDay(2004, 6, 9);
        YearMonthDay ymd3 = new YearMonthDay(2005, 6, 9);
NoAssert.donothing(true, test1.year().compareTo(ymd1) > 0);
NoAssert.donothing(true, test1.year().compareTo(ymd2) == 0);
NoAssert.donothing(true, test1.year().compareTo(ymd3) < 0);
        try {
            test1.year().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertyEqualsHashCodeYear() {
        DateTime test1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(true, test1.year().equals(test1.year()));
NoAssert.donothing(true, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0).year()));
NoAssert.donothing(false, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0).monthOfYear()));
NoAssert.donothing(false, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()).year()));
        
NoAssert.donothing(true, test1.year().hashCode() == test1.year().hashCode());
NoAssert.donothing(true, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0).year().hashCode());
NoAssert.donothing(false, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0).monthOfYear().hashCode());
NoAssert.donothing(false, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()).year().hashCode());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMonthOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().monthOfYear(), test.monthOfYear().getField());
NoAssert.donothing("monthOfYear", test.monthOfYear().getName());
NoAssert.donothing("Property[monthOfYear]", test.monthOfYear().toString());
NoAssert.donothing(test, test.monthOfYear().getDateTime());
NoAssert.donothing(6, test.monthOfYear().get());
NoAssert.donothing("6", test.monthOfYear().getAsString());
NoAssert.donothing("June", test.monthOfYear().getAsText());
NoAssert.donothing("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH));
NoAssert.donothing("juin", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH));
NoAssert.donothing("Jun", test.monthOfYear().getAsShortText());
NoAssert.donothing("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH));
NoAssert.donothing("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH));
NoAssert.donothing(test.getChronology().months(), test.monthOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
NoAssert.donothing(9, test.monthOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.monthOfYear().getMaximumShortTextLength(null));
        test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
NoAssert.donothing("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH));
NoAssert.donothing("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH));
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
        assertEquals(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
NoAssert.donothing(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
    }

    @Test public void testPropertyLeapMonthOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(false, test.monthOfYear().isLeap());
NoAssert.donothing(0, test.monthOfYear().getLeapAmount());
NoAssert.donothing(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
        
        test = new DateTime(2004, 2, 9, 0, 0, 0, 0);
NoAssert.donothing(true, test.monthOfYear().isLeap());
NoAssert.donothing(1, test.monthOfYear().getLeapAmount());
NoAssert.donothing(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
        
        test = new DateTime(2003, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(false, test.monthOfYear().isLeap());
NoAssert.donothing(0, test.monthOfYear().getLeapAmount());
NoAssert.donothing(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
        
        test = new DateTime(2003, 2, 9, 0, 0, 0, 0);
NoAssert.donothing(false, test.monthOfYear().isLeap());
NoAssert.donothing(0, test.monthOfYear().getLeapAmount());
NoAssert.donothing(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
    }

    @Test public void testPropertyAddMonthOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.monthOfYear().addToCopy(6);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-12-09T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().addToCopy(7);
NoAssert.donothing("2005-01-09T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().addToCopy(-5);
        assertEquals("2004-01-09T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().addToCopy(-6);
NoAssert.donothing("2003-12-09T00:00:00.000Z", copy.toString());
        
        test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        copy = test.monthOfYear().addToCopy(1);
NoAssert.donothing("2004-01-31T00:00:00.000Z", test.toString());
NoAssert.donothing("2004-02-29T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().addToCopy(2);
NoAssert.donothing("2004-03-31T00:00:00.000+01:00", copy.toString());
        
        copy = test.monthOfYear().addToCopy(3);
NoAssert.donothing("2004-04-30T00:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2003, 1, 31, 0, 0, 0, 0);
        copy = test.monthOfYear().addToCopy(1);
NoAssert.donothing("2003-02-28T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyAddWrapFieldMonthOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.monthOfYear().addWrapFieldToCopy(4);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-10-09T00:00:00.000+01:00", copy.toString());
        
        copy = test.monthOfYear().addWrapFieldToCopy(8);
NoAssert.donothing("2004-02-09T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().addWrapFieldToCopy(-8);
NoAssert.donothing("2004-10-09T00:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        copy = test.monthOfYear().addWrapFieldToCopy(1);
NoAssert.donothing("2004-01-31T00:00:00.000Z", test.toString());
NoAssert.donothing("2004-02-29T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().addWrapFieldToCopy(2);
NoAssert.donothing("2004-03-31T00:00:00.000+01:00", copy.toString());
        
        copy = test.monthOfYear().addWrapFieldToCopy(3);
NoAssert.donothing("2004-04-30T00:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2005, 1, 31, 0, 0, 0, 0);
        copy = test.monthOfYear().addWrapFieldToCopy(1);
NoAssert.donothing("2005-01-31T00:00:00.000Z", test.toString());
NoAssert.donothing("2005-02-28T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertySetMonthOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.monthOfYear().setCopy(12);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-12-09T00:00:00.000Z", copy.toString());
        
        test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        copy = test.monthOfYear().setCopy(2);
NoAssert.donothing("2004-02-29T00:00:00.000Z", copy.toString());
        
        try {
            test.monthOfYear().setCopy(13);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.monthOfYear().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextMonthOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.monthOfYear().setCopy("12");
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
        assertEquals("2004-12-09T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().setCopy("December");
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-12-09T00:00:00.000Z", copy.toString());
        
        copy = test.monthOfYear().setCopy("Dec");
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-12-09T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyCompareToMonthOfYear() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.monthOfYear().compareTo(test2) < 0);
NoAssert.donothing(true, test2.monthOfYear().compareTo(test1) > 0);
NoAssert.donothing(true, test1.monthOfYear().compareTo(test1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.monthOfYear().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.monthOfYear().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.monthOfYear().compareTo(dt1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
NoAssert.donothing("dayOfMonth", test.dayOfMonth().getName());
NoAssert.donothing("Property[dayOfMonth]", test.dayOfMonth().toString());
NoAssert.donothing(test, test.dayOfMonth().getDateTime());
NoAssert.donothing(9, test.dayOfMonth().get());
NoAssert.donothing("9", test.dayOfMonth().getAsString());
NoAssert.donothing("9", test.dayOfMonth().getAsText());
NoAssert.donothing("9", test.dayOfMonth().getAsText(Locale.FRENCH));
NoAssert.donothing("9", test.dayOfMonth().getAsShortText());
NoAssert.donothing("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfMonth().getDurationField());
NoAssert.donothing(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
NoAssert.donothing(2, test.dayOfMonth().getMaximumTextLength(null));
NoAssert.donothing(2, test.dayOfMonth().getMaximumShortTextLength(null));
        assertEquals(1, test.dayOfMonth().getMinimumValue());
NoAssert.donothing(1, test.dayOfMonth().getMinimumValueOverall());
NoAssert.donothing(30, test.dayOfMonth().getMaximumValue());
        assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
NoAssert.donothing(false, test.dayOfMonth().isLeap());
NoAssert.donothing(0, test.dayOfMonth().getLeapAmount());
        assertEquals(null, test.dayOfMonth().getLeapDurationField());
    }

    @Test public void testPropertyGetMaxMinValuesDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(1, test.dayOfMonth().getMinimumValue());
NoAssert.donothing(1, test.dayOfMonth().getMinimumValueOverall());
NoAssert.donothing(30, test.dayOfMonth().getMaximumValue());
NoAssert.donothing(31, test.dayOfMonth().getMaximumValueOverall());
        test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
NoAssert.donothing(31, test.dayOfMonth().getMaximumValue());
        test = new DateTime(2004, 2, 9, 0, 0, 0, 0);
NoAssert.donothing(29, test.dayOfMonth().getMaximumValue());
        test = new DateTime(2003, 2, 9, 0, 0, 0, 0);
NoAssert.donothing(28, test.dayOfMonth().getMaximumValue());
    }

    @Test public void testPropertyAddDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfMonth().addToCopy(9);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-18T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(21);
NoAssert.donothing("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(22);
NoAssert.donothing("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(22 + 30);
NoAssert.donothing("2004-07-31T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(22 + 31);
NoAssert.donothing("2004-08-01T00:00:00.000+01:00", copy.toString());

        copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
NoAssert.donothing("2004-12-31T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
NoAssert.donothing("2005-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(-8);
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(-9);
NoAssert.donothing("2004-05-31T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
NoAssert.donothing("2004-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
NoAssert.donothing("2003-12-31T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyAddWrapFieldDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfMonth().addWrapFieldToCopy(21);
        assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addWrapFieldToCopy(22);
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfMonth().addWrapFieldToCopy(-12);
NoAssert.donothing("2004-06-27T00:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
        copy = test.dayOfMonth().addWrapFieldToCopy(21);
NoAssert.donothing("2004-07-30T00:00:00.000+01:00", copy.toString());
    
        copy = test.dayOfMonth().addWrapFieldToCopy(22);
NoAssert.donothing("2004-07-31T00:00:00.000+01:00", copy.toString());
    
        copy = test.dayOfMonth().addWrapFieldToCopy(23);
NoAssert.donothing("2004-07-01T00:00:00.000+01:00", copy.toString());
    
        copy = test.dayOfMonth().addWrapFieldToCopy(-12);
NoAssert.donothing("2004-07-28T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertySetDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfMonth().setCopy(12);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-12T00:00:00.000+01:00", copy.toString());
        
        try {
            test.dayOfMonth().setCopy(31);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.dayOfMonth().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfMonth().setCopy("12");
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
        assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyWithMaximumValueDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfMonth().withMaximumValue();
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-30T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyWithMaximumValueMillisOfDayDSTGap() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris);  // DST gap 23:00 to 00:00
        DateTime test = dt.millisOfDay().withMaximumValue();
NoAssert.donothing("1926-04-17T22:59:59.999Z", test.toString());
    }

    @Test public void testPropertyWithMinimumValueDayOfMonth() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfMonth().withMinimumValue();
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyWithMinimumValueMillisOfDayDSTGap() {
        DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza");
        DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza);  // DST gap 00:00 to 01:00
        DateTime test = dt.millisOfDay().withMinimumValue();
NoAssert.donothing("2001-04-20T01:00:00.000+03:00", test.toString());
    }

    @Test public void testPropertyCompareToDayOfMonth() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(test2) < 0);
NoAssert.donothing(true, test2.dayOfMonth().compareTo(test1) > 0);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(test1) == 0);
        try {
            test1.dayOfMonth().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.dayOfMonth().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(dt1) == 0);
        try {
            test1.dayOfMonth().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfYear() {
        // 31+29+31+30+31+9 = 161
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().dayOfYear(), test.dayOfYear().getField());
NoAssert.donothing("dayOfYear", test.dayOfYear().getName());
NoAssert.donothing("Property[dayOfYear]", test.dayOfYear().toString());
NoAssert.donothing(test, test.dayOfYear().getDateTime());
NoAssert.donothing(161, test.dayOfYear().get());
NoAssert.donothing("161", test.dayOfYear().getAsString());
NoAssert.donothing("161", test.dayOfYear().getAsText());
NoAssert.donothing("161", test.dayOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("161", test.dayOfYear().getAsShortText());
NoAssert.donothing("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
NoAssert.donothing(3, test.dayOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.dayOfYear().getMaximumShortTextLength(null));
NoAssert.donothing(false, test.dayOfYear().isLeap());
NoAssert.donothing(0, test.dayOfYear().getLeapAmount());
NoAssert.donothing(null, test.dayOfYear().getLeapDurationField());
    }

    @Test public void testPropertyGetMaxMinValuesDayOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(1, test.dayOfYear().getMinimumValue());
        assertEquals(1, test.dayOfYear().getMinimumValueOverall());
NoAssert.donothing(366, test.dayOfYear().getMaximumValue());
NoAssert.donothing(366, test.dayOfYear().getMaximumValueOverall());
        test = new DateTime(2002, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(365, test.dayOfYear().getMaximumValue());
NoAssert.donothing(366, test.dayOfYear().getMaximumValueOverall());
    }

    @Test public void testPropertyAddDayOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfYear().addToCopy(9);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-18T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addToCopy(21);
NoAssert.donothing("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addToCopy(22);
        assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
NoAssert.donothing("2004-12-31T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfYear().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        assertEquals("2005-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfYear().addToCopy(-8);
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addToCopy(-9);
NoAssert.donothing("2004-05-31T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
NoAssert.donothing("2004-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfYear().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyAddWrapFieldDayOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfYear().addWrapFieldToCopy(21);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addWrapFieldToCopy(22);
NoAssert.donothing("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addWrapFieldToCopy(-12);
NoAssert.donothing("2004-05-28T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfYear().addWrapFieldToCopy(205);
NoAssert.donothing("2004-12-31T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfYear().addWrapFieldToCopy(206);
NoAssert.donothing("2004-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfYear().addWrapFieldToCopy(-160);
NoAssert.donothing("2004-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfYear().addWrapFieldToCopy(-161);
NoAssert.donothing("2004-12-31T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertySetDayOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfYear().setCopy(12);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-01-12T00:00:00.000Z", copy.toString());
        
        try {
            test.dayOfYear().setCopy(367);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.dayOfYear().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextDayOfYear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfYear().setCopy("12");
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-01-12T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyCompareToDayOfYear() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.dayOfYear().compareTo(test2) < 0);
NoAssert.donothing(true, test2.dayOfYear().compareTo(test1) > 0);
NoAssert.donothing(true, test1.dayOfYear().compareTo(test1) == 0);
        try {
            test1.dayOfYear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.dayOfYear().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.dayOfYear().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.dayOfYear().compareTo(dt1) == 0);
        try {
            test1.dayOfYear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
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
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
NoAssert.donothing("weekOfWeekyear", test.weekOfWeekyear().getName());
NoAssert.donothing("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
NoAssert.donothing(test, test.weekOfWeekyear().getDateTime());
NoAssert.donothing(24, test.weekOfWeekyear().get());
        assertEquals("24", test.weekOfWeekyear().getAsString());
NoAssert.donothing("24", test.weekOfWeekyear().getAsText());
NoAssert.donothing("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
NoAssert.donothing("24", test.weekOfWeekyear().getAsShortText());
NoAssert.donothing("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
NoAssert.donothing(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
        assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
NoAssert.donothing(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
NoAssert.donothing(false, test.weekOfWeekyear().isLeap());
NoAssert.donothing(0, test.weekOfWeekyear().getLeapAmount());
NoAssert.donothing(null, test.weekOfWeekyear().getLeapDurationField());
    }

    @Test public void testPropertyGetMaxMinValuesWeekOfWeekyear() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(1, test.weekOfWeekyear().getMinimumValue());
NoAssert.donothing(1, test.weekOfWeekyear().getMinimumValueOverall());
NoAssert.donothing(53, test.weekOfWeekyear().getMaximumValue());
NoAssert.donothing(53, test.weekOfWeekyear().getMaximumValueOverall());
        test = new DateTime(2005, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(52, test.weekOfWeekyear().getMaximumValue());
        assertEquals(53, test.weekOfWeekyear().getMaximumValueOverall());
    }

    @Test public void testPropertyAddWeekOfWeekyear() {
        DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        DateTime copy = test.weekOfWeekyear().addToCopy(1);
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-14T00:00:00.000+01:00", copy.toString());
        
        copy = test.weekOfWeekyear().addToCopy(29);
        assertEquals("2004-12-27T00:00:00.000Z", copy.toString());
        
        copy = test.weekOfWeekyear().addToCopy(30);
NoAssert.donothing("2005-01-03T00:00:00.000Z", copy.toString());
        
        copy = test.weekOfWeekyear().addToCopy(-22);
NoAssert.donothing("2004-01-05T00:00:00.000Z", copy.toString());
        
        copy = test.weekOfWeekyear().addToCopy(-23);
NoAssert.donothing("2003-12-29T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyAddWrapFieldWeekOfWeekyear() {
        DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        DateTime copy = test.weekOfWeekyear().addWrapFieldToCopy(1);
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-14T00:00:00.000+01:00", copy.toString());
        
        copy = test.weekOfWeekyear().addWrapFieldToCopy(29);
NoAssert.donothing("2004-12-27T00:00:00.000Z", copy.toString());
        
        copy = test.weekOfWeekyear().addWrapFieldToCopy(30);
NoAssert.donothing("2003-12-29T00:00:00.000Z", copy.toString());
        
        copy = test.weekOfWeekyear().addWrapFieldToCopy(-23);
NoAssert.donothing("2003-12-29T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertySetWeekOfWeekyear() {
        DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        DateTime copy = test.weekOfWeekyear().setCopy(4);
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-01-19T00:00:00.000Z", copy.toString());
        
        try {
            test.weekOfWeekyear().setCopy(54);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.weekOfWeekyear().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextWeekOfWeekyear() {
        DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        DateTime copy = test.weekOfWeekyear().setCopy("4");
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-01-19T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyCompareToWeekOfWeekyear() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.weekOfWeekyear().compareTo(test2) < 0);
NoAssert.donothing(true, test2.weekOfWeekyear().compareTo(test1) > 0);
NoAssert.donothing(true, test1.weekOfWeekyear().compareTo(test1) == 0);
        try {
            test1.weekOfWeekyear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.weekOfWeekyear().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.weekOfWeekyear().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.weekOfWeekyear().compareTo(dt1) == 0);
        try {
            test1.weekOfWeekyear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfWeek() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
NoAssert.donothing(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
NoAssert.donothing("dayOfWeek", test.dayOfWeek().getName());
NoAssert.donothing("Property[dayOfWeek]", test.dayOfWeek().toString());
NoAssert.donothing(test, test.dayOfWeek().getDateTime());
NoAssert.donothing(3, test.dayOfWeek().get());
NoAssert.donothing("3", test.dayOfWeek().getAsString());
NoAssert.donothing("Wednesday", test.dayOfWeek().getAsText());
NoAssert.donothing("Wednesday", test.dayOfWeek().getField().getAsText(3, Locale.ENGLISH));
        assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
NoAssert.donothing("mercredi", test.dayOfWeek().getField().getAsText(3, Locale.FRENCH));
NoAssert.donothing("Wed", test.dayOfWeek().getAsShortText());
NoAssert.donothing("Wed", test.dayOfWeek().getField().getAsShortText(3, Locale.ENGLISH));
        assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
NoAssert.donothing("mer.", test.dayOfWeek().getField().getAsShortText(3, Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfWeek().getDurationField());
NoAssert.donothing(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
NoAssert.donothing(9, test.dayOfWeek().getMaximumTextLength(null));
NoAssert.donothing(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
        assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
NoAssert.donothing(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
NoAssert.donothing(1, test.dayOfWeek().getMinimumValue());
NoAssert.donothing(1, test.dayOfWeek().getMinimumValueOverall());
NoAssert.donothing(7, test.dayOfWeek().getMaximumValue());
NoAssert.donothing(7, test.dayOfWeek().getMaximumValueOverall());
NoAssert.donothing(false, test.dayOfWeek().isLeap());
NoAssert.donothing(0, test.dayOfWeek().getLeapAmount());
NoAssert.donothing(null, test.dayOfWeek().getLeapDurationField());
    }

    @Test public void testPropertyAddDayOfWeek() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfWeek().addToCopy(1);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(21);
NoAssert.donothing("2004-06-30T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(22);
NoAssert.donothing("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
NoAssert.donothing("2004-12-31T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        assertEquals("2005-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(-8);
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(-9);
NoAssert.donothing("2004-05-31T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
NoAssert.donothing("2004-01-01T00:00:00.000Z", copy.toString());
        
        copy = test.dayOfWeek().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }

    @Test public void testPropertyAddLongDayOfWeek() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfWeek().addToCopy(1L);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", copy.toString());
    }        

    @Test public void testPropertyAddWrapFieldDayOfWeek() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);  // Wed
        DateTime copy = test.dayOfWeek().addWrapFieldToCopy(1);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfWeek().addWrapFieldToCopy(5);
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", copy.toString());
        
        copy = test.dayOfWeek().addWrapFieldToCopy(-10);
        assertEquals("2004-06-13T00:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 2, 0, 0, 0, 0);
        copy = test.dayOfWeek().addWrapFieldToCopy(5);
NoAssert.donothing("2004-06-02T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-05-31T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertySetDayOfWeek() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfWeek().setCopy(4);
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", copy.toString());
        
        try {
            test.dayOfWeek().setCopy(8);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.dayOfWeek().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextDayOfWeek() {
        DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime copy = test.dayOfWeek().setCopy("4");
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-10T00:00:00.000+01:00", copy.toString());
        copy = test.dayOfWeek().setCopy("Mon");
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", copy.toString());
        copy = test.dayOfWeek().setCopy("Tuesday");
NoAssert.donothing("2004-06-08T00:00:00.000+01:00", copy.toString());
        copy = test.dayOfWeek().setCopy("lundi", Locale.FRENCH);
NoAssert.donothing("2004-06-07T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyCompareToDayOfWeek() {
        DateTime test1 = new DateTime(TEST_TIME1);
        DateTime test2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test2.dayOfWeek().compareTo(test1) < 0);
NoAssert.donothing(true, test1.dayOfWeek().compareTo(test2) > 0);
NoAssert.donothing(true, test1.dayOfWeek().compareTo(test1) == 0);
        try {
            test1.dayOfWeek().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test2.dayOfWeek().compareTo(dt1) < 0);
NoAssert.donothing(true, test1.dayOfWeek().compareTo(dt2) > 0);
NoAssert.donothing(true, test1.dayOfWeek().compareTo(dt1) == 0);
        try {
            test1.dayOfWeek().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetHourOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().hourOfDay(), test.hourOfDay().getField());
NoAssert.donothing("hourOfDay", test.hourOfDay().getName());
NoAssert.donothing("Property[hourOfDay]", test.hourOfDay().toString());
NoAssert.donothing(test, test.hourOfDay().getDateTime());
NoAssert.donothing(13, test.hourOfDay().get());
NoAssert.donothing("13", test.hourOfDay().getAsString());
NoAssert.donothing("13", test.hourOfDay().getAsText());
NoAssert.donothing("13", test.hourOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("13", test.hourOfDay().getAsShortText());
NoAssert.donothing("13", test.hourOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().hours(), test.hourOfDay().getDurationField());
NoAssert.donothing(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
NoAssert.donothing(2, test.hourOfDay().getMaximumTextLength(null));
NoAssert.donothing(2, test.hourOfDay().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetDifferenceHourOfDay() {
        DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0);
NoAssert.donothing(-2, test1.hourOfDay().getDifference(test2));
NoAssert.donothing(2, test2.hourOfDay().getDifference(test1));
NoAssert.donothing(-2L, test1.hourOfDay().getDifferenceAsLong(test2));
NoAssert.donothing(2L, test2.hourOfDay().getDifferenceAsLong(test1));
        
        DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR));
NoAssert.donothing(13, test.hourOfDay().getDifference(null));
NoAssert.donothing(13L, test.hourOfDay().getDifferenceAsLong(null));
    }

    @Test public void testPropertyRoundFloorHourOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        DateTime copy = test.hourOfDay().roundFloorCopy();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundCeilingHourOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        DateTime copy = test.hourOfDay().roundCeilingCopy();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundHalfFloorHourOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        DateTime copy = test.hourOfDay().roundHalfFloorCopy();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        copy = test.hourOfDay().roundHalfFloorCopy();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        copy = test.hourOfDay().roundHalfFloorCopy();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundHalfCeilingHourOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        DateTime copy = test.hourOfDay().roundHalfCeilingCopy();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        copy = test.hourOfDay().roundHalfCeilingCopy();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        copy = test.hourOfDay().roundHalfCeilingCopy();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundHalfEvenHourOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        DateTime copy = test.hourOfDay().roundHalfEvenCopy();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 9, 14, 30, 0, 0);
        copy = test.hourOfDay().roundHalfEvenCopy();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        copy = test.hourOfDay().roundHalfEvenCopy();
NoAssert.donothing("2004-06-09T14:00:00.000+01:00", copy.toString());
        
        test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        copy = test.hourOfDay().roundHalfEvenCopy();
NoAssert.donothing("2004-06-09T13:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRemainderHourOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
NoAssert.donothing(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMinuteOfHour() {
        DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
NoAssert.donothing("minuteOfHour", test.minuteOfHour().getName());
NoAssert.donothing("Property[minuteOfHour]", test.minuteOfHour().toString());
NoAssert.donothing(test, test.minuteOfHour().getDateTime());
NoAssert.donothing(23, test.minuteOfHour().get());
NoAssert.donothing("23", test.minuteOfHour().getAsString());
NoAssert.donothing("23", test.minuteOfHour().getAsText());
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
        DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().minuteOfDay(), test.minuteOfDay().getField());
NoAssert.donothing("minuteOfDay", test.minuteOfDay().getName());
NoAssert.donothing("Property[minuteOfDay]", test.minuteOfDay().toString());
NoAssert.donothing(test, test.minuteOfDay().getDateTime());
NoAssert.donothing(803, test.minuteOfDay().get());
NoAssert.donothing("803", test.minuteOfDay().getAsString());
NoAssert.donothing("803", test.minuteOfDay().getAsText());
        assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("803", test.minuteOfDay().getAsShortText());
NoAssert.donothing("803", test.minuteOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().minutes(), test.minuteOfDay().getDurationField());
NoAssert.donothing(test.getChronology().days(), test.minuteOfDay().getRangeDurationField());
NoAssert.donothing(4, test.minuteOfDay().getMaximumTextLength(null));
NoAssert.donothing(4, test.minuteOfDay().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetSecondOfMinute() {
        DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
NoAssert.donothing("secondOfMinute", test.secondOfMinute().getName());
NoAssert.donothing("Property[secondOfMinute]", test.secondOfMinute().toString());
NoAssert.donothing(test, test.secondOfMinute().getDateTime());
NoAssert.donothing(43, test.secondOfMinute().get());
NoAssert.donothing("43", test.secondOfMinute().getAsString());
NoAssert.donothing("43", test.secondOfMinute().getAsText());
NoAssert.donothing("43", test.secondOfMinute().getAsText(Locale.FRENCH));
NoAssert.donothing("43", test.secondOfMinute().getAsShortText());
NoAssert.donothing("43", test.secondOfMinute().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
NoAssert.donothing(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
NoAssert.donothing(2, test.secondOfMinute().getMaximumTextLength(null));
NoAssert.donothing(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetSecondOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().secondOfDay(), test.secondOfDay().getField());
        assertEquals("secondOfDay", test.secondOfDay().getName());
NoAssert.donothing("Property[secondOfDay]", test.secondOfDay().toString());
NoAssert.donothing(test, test.secondOfDay().getDateTime());
NoAssert.donothing(48223, test.secondOfDay().get());
NoAssert.donothing("48223", test.secondOfDay().getAsString());
NoAssert.donothing("48223", test.secondOfDay().getAsText());
NoAssert.donothing("48223", test.secondOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("48223", test.secondOfDay().getAsShortText());
NoAssert.donothing("48223", test.secondOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().seconds(), test.secondOfDay().getDurationField());
NoAssert.donothing(test.getChronology().days(), test.secondOfDay().getRangeDurationField());
NoAssert.donothing(5, test.secondOfDay().getMaximumTextLength(null));
NoAssert.donothing(5, test.secondOfDay().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMillisOfSecond() {
        DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
NoAssert.donothing("millisOfSecond", test.millisOfSecond().getName());
NoAssert.donothing("Property[millisOfSecond]", test.millisOfSecond().toString());
NoAssert.donothing(test, test.millisOfSecond().getDateTime());
NoAssert.donothing(53, test.millisOfSecond().get());
NoAssert.donothing("53", test.millisOfSecond().getAsString());
NoAssert.donothing("53", test.millisOfSecond().getAsText());
NoAssert.donothing("53", test.millisOfSecond().getAsText(Locale.FRENCH));
        assertEquals("53", test.millisOfSecond().getAsShortText());
NoAssert.donothing("53", test.millisOfSecond().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().millis(), test.millisOfSecond().getDurationField());
NoAssert.donothing(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
NoAssert.donothing(3, test.millisOfSecond().getMaximumTextLength(null));
        assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMillisOfDay() {
        DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
NoAssert.donothing(test.getChronology().millisOfDay(), test.millisOfDay().getField());
NoAssert.donothing("millisOfDay", test.millisOfDay().getName());
NoAssert.donothing("Property[millisOfDay]", test.millisOfDay().toString());
        assertSame(test, test.millisOfDay().getDateTime());
NoAssert.donothing(48223053, test.millisOfDay().get());
NoAssert.donothing("48223053", test.millisOfDay().getAsString());
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
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.yearOfEra().toInterval();
NoAssert.donothing(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalYearOfCentury() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.yearOfCentury().toInterval();
NoAssert.donothing(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalYear() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.year().toInterval();
NoAssert.donothing(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalMonthOfYear() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.monthOfYear().toInterval();
NoAssert.donothing(new DateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new DateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalDayOfMonth() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.dayOfMonth().toInterval();
NoAssert.donothing(new DateTime(2004, 6, 9, 0, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new DateTime(2004, 6, 10, 0, 0, 0, 0), testInterval.getEnd());

      DateTime febTest = new DateTime(2004, 2, 29, 13, 23, 43, 53);
      Interval febTestInterval = febTest.dayOfMonth().toInterval();
NoAssert.donothing(new DateTime(2004, 2, 29, 0, 0, 0, 0), febTestInterval.getStart());
      assertEquals(new DateTime(2004, 3, 1, 0, 0, 0, 0), febTestInterval.getEnd());
    }

    @Test public void testPropertyToIntervalHourOfDay() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.hourOfDay().toInterval();
NoAssert.donothing(new DateTime(2004, 6, 9, 13, 0, 0, 0), testInterval.getStart());
NoAssert.donothing(new DateTime(2004, 6, 9, 14, 0, 0, 0), testInterval.getEnd());

      DateTime midnightTest = new DateTime(2004, 6, 9, 23, 23, 43, 53, COPTIC_PARIS);
      Interval midnightTestInterval = midnightTest.hourOfDay().toInterval();
NoAssert.donothing(new DateTime(2004, 6, 9, 23, 0, 0, 0, COPTIC_PARIS), midnightTestInterval.getStart());
NoAssert.donothing(new DateTime(2004, 6, 10, 0, 0, 0, 0, COPTIC_PARIS), midnightTestInterval.getEnd());
    }

    @Test public void testPropertyToIntervalMinuteOfHour() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.minuteOfHour().toInterval();
NoAssert.donothing(new DateTime(2004, 6, 9, 13, 23, 0, 0), testInterval.getStart());
      assertEquals(new DateTime(2004, 6, 9, 13, 24, 0, 0), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalSecondOfMinute() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.secondOfMinute().toInterval();
NoAssert.donothing(new DateTime(2004, 6, 9, 13, 23, 43, 0), testInterval.getStart());
      assertEquals(new DateTime(2004, 6, 9, 13, 23, 44, 0), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalMillisOfSecond() {
      DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
      Interval testInterval = test.millisOfSecond().toInterval();
NoAssert.donothing(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart());
NoAssert.donothing(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd());
    }

    @Test public void testPropertyEqualsHashCodeLenient() {
        DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS));
        DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS));
NoAssert.donothing(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
NoAssert.donothing(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }

    @Test public void testPropertyEqualsHashCodeStrict() {
        DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS));
        DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS));
NoAssert.donothing(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }

}
