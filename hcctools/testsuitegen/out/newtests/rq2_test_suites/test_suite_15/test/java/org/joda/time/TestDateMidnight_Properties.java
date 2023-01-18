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
@SuppressWarnings("deprecation")
public class TestDateMidnight_Properties  { //extends TestCase {
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
        TestDateMidnight_Properties TB= new TestDateMidnight_Properties();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYearOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetCenturyOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYearOfCentury(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextLocaleMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddLongMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDifferenceMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundFloorMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundCeilingMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundHalfFloorMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundHalfCeilingMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundHalfEvenMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyRemainderMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaximumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMinimumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetWeekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDayOfWeek(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalYearOfEra(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalYearOfCentury(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalMonthOfYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyToIntervalDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeLenient(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeStrict(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateMidnight_Properties.class);
    }

    public TestDateMidnight_Properties(String name) {
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
        assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetEra() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().era(), test.era().getField());
NoAssert.donothing("era", test.era().getName());
        assertEquals("Property[era]", test.era().toString());
NoAssert.donothing(test, test.era().getDateMidnight());
NoAssert.donothing(1, test.era().get());
NoAssert.donothing("AD", test.era().getAsText());
NoAssert.donothing("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
NoAssert.donothing("AD", test.era().getAsShortText());
NoAssert.donothing("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().eras(), test.era().getDurationField());
        assertEquals(null, test.era().getRangeDurationField());
NoAssert.donothing(2, test.era().getMaximumTextLength(null));
NoAssert.donothing(9, test.era().getMaximumTextLength(Locale.FRENCH));
NoAssert.donothing(2, test.era().getMaximumShortTextLength(null));
NoAssert.donothing(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYearOfEra() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().yearOfEra(), test.yearOfEra().getField());
NoAssert.donothing("yearOfEra", test.yearOfEra().getName());
        assertEquals("Property[yearOfEra]", test.yearOfEra().toString());
NoAssert.donothing(test, test.yearOfEra().getDateMidnight());
NoAssert.donothing(2004, test.yearOfEra().get());
NoAssert.donothing("2004", test.yearOfEra().getAsText());
NoAssert.donothing("2004", test.yearOfEra().getAsText(Locale.FRENCH));
NoAssert.donothing("2004", test.yearOfEra().getAsShortText());
NoAssert.donothing("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
NoAssert.donothing(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
NoAssert.donothing(9, test.yearOfEra().getMaximumTextLength(null));
NoAssert.donothing(9, test.yearOfEra().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetCenturyOfEra() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
        assertEquals("centuryOfEra", test.centuryOfEra().getName());
NoAssert.donothing("Property[centuryOfEra]", test.centuryOfEra().toString());
NoAssert.donothing(test, test.centuryOfEra().getDateMidnight());
NoAssert.donothing(20, test.centuryOfEra().get());
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
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
        assertEquals("yearOfCentury", test.yearOfCentury().getName());
        assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString());
        assertSame(test, test.yearOfCentury().getDateMidnight());
NoAssert.donothing(4, test.yearOfCentury().get());
        assertEquals("4", test.yearOfCentury().getAsText());
NoAssert.donothing("4", test.yearOfCentury().getAsText(Locale.FRENCH));
NoAssert.donothing("4", test.yearOfCentury().getAsShortText());
NoAssert.donothing("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.yearOfCentury().getDurationField());
        assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
NoAssert.donothing(2, test.yearOfCentury().getMaximumTextLength(null));
        assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetWeekyear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().weekyear(), test.weekyear().getField());
NoAssert.donothing("weekyear", test.weekyear().getName());
NoAssert.donothing("Property[weekyear]", test.weekyear().toString());
NoAssert.donothing(test, test.weekyear().getDateMidnight());
NoAssert.donothing(2004, test.weekyear().get());
NoAssert.donothing("2004", test.weekyear().getAsText());
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
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().year(), test.year().getField());
NoAssert.donothing("year", test.year().getName());
NoAssert.donothing("Property[year]", test.year().toString());
NoAssert.donothing(test, test.year().getDateMidnight());
NoAssert.donothing(2004, test.year().get());
NoAssert.donothing("2004", test.year().getAsText());
NoAssert.donothing("2004", test.year().getAsText(Locale.FRENCH));
NoAssert.donothing("2004", test.year().getAsShortText());
NoAssert.donothing("2004", test.year().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.year().getDurationField());
NoAssert.donothing(null, test.year().getRangeDurationField());
NoAssert.donothing(9, test.year().getMaximumTextLength(null));
NoAssert.donothing(9, test.year().getMaximumShortTextLength(null));
        assertEquals(-292275054, test.year().getMinimumValue());
NoAssert.donothing(-292275054, test.year().getMinimumValueOverall());
        assertEquals(292278993, test.year().getMaximumValue());
NoAssert.donothing(292278993, test.year().getMaximumValueOverall());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().monthOfYear(), test.monthOfYear().getField());
NoAssert.donothing("monthOfYear", test.monthOfYear().getName());
NoAssert.donothing("Property[monthOfYear]", test.monthOfYear().toString());
NoAssert.donothing(test, test.monthOfYear().getDateMidnight());
NoAssert.donothing(6, test.monthOfYear().get());
NoAssert.donothing("6", test.monthOfYear().getAsString());
NoAssert.donothing("June", test.monthOfYear().getAsText());
NoAssert.donothing("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        assertEquals("Jun", test.monthOfYear().getAsShortText());
NoAssert.donothing("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().months(), test.monthOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
NoAssert.donothing(9, test.monthOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.monthOfYear().getMaximumShortTextLength(null));
        test = new DateMidnight(2004, 7, 9);
NoAssert.donothing("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
NoAssert.donothing(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
NoAssert.donothing(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
    }

    @Test public void testPropertySetMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.monthOfYear().setCopy(8);
NoAssert.donothing(2004, copy.getYear());
NoAssert.donothing(8, copy.getMonthOfYear());
NoAssert.donothing(9, copy.getDayOfMonth());
    }

    @Test public void testPropertySetTextMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.monthOfYear().setCopy("8");
        assertEquals(2004, copy.getYear());
NoAssert.donothing(8, copy.getMonthOfYear());
NoAssert.donothing(9, copy.getDayOfMonth());
    }

    @Test public void testPropertySetTextLocaleMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.monthOfYear().setCopy("mars", Locale.FRENCH);
NoAssert.donothing(2004, copy.getYear());
        assertEquals(3, copy.getMonthOfYear());
NoAssert.donothing(9, copy.getDayOfMonth());
    }

    @Test public void testPropertyAddMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.monthOfYear().addToCopy(8);
        assertEquals(2005, copy.getYear());
NoAssert.donothing(2, copy.getMonthOfYear());
NoAssert.donothing(9, copy.getDayOfMonth());
    }

    @Test public void testPropertyAddLongMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.monthOfYear().addToCopy(8L);
NoAssert.donothing(2005, copy.getYear());
NoAssert.donothing(2, copy.getMonthOfYear());
NoAssert.donothing(9, copy.getDayOfMonth());
    }

    @Test public void testPropertyAddWrapFieldMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.monthOfYear().addWrapFieldToCopy(8);
NoAssert.donothing(2004, copy.getYear());
        assertEquals(2, copy.getMonthOfYear());
NoAssert.donothing(9, copy.getDayOfMonth());
    }

    @Test public void testPropertyGetDifferenceMonthOfYear() {
        DateMidnight test1 = new DateMidnight(2004, 6, 9);
        DateMidnight test2 = new DateMidnight(2004, 8, 9);
        assertEquals(-2, test1.monthOfYear().getDifference(test2));
NoAssert.donothing(2, test2.monthOfYear().getDifference(test1));
NoAssert.donothing(-2L, test1.monthOfYear().getDifferenceAsLong(test2));
NoAssert.donothing(2L, test2.monthOfYear().getDifferenceAsLong(test1));
    }

    @Test public void testPropertyRoundFloorMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 16);
        DateMidnight copy = test.monthOfYear().roundFloorCopy();
        assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundCeilingMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 16);
        DateMidnight copy = test.monthOfYear().roundCeilingCopy();
        assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundHalfFloorMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 16);
        DateMidnight copy = test.monthOfYear().roundHalfFloorCopy();
        assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        test = new DateMidnight(2004, 6, 17);
        copy = test.monthOfYear().roundHalfFloorCopy();
        assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        test = new DateMidnight(2004, 6, 15);
        copy = test.monthOfYear().roundHalfFloorCopy();
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundHalfCeilingMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 16);
        DateMidnight copy = test.monthOfYear().roundHalfCeilingCopy();
NoAssert.donothing("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        test = new DateMidnight(2004, 6, 17);
        copy = test.monthOfYear().roundHalfCeilingCopy();
NoAssert.donothing("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        test = new DateMidnight(2004, 6, 15);
        copy = test.monthOfYear().roundHalfCeilingCopy();
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRoundHalfEvenMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 16);
        DateMidnight copy = test.monthOfYear().roundHalfEvenCopy();
        assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
        
        test = new DateMidnight(2004, 9, 16);
        copy = test.monthOfYear().roundHalfEvenCopy();
NoAssert.donothing("2004-10-01T00:00:00.000+01:00", copy.toString());
        
        test = new DateMidnight(2004, 6, 17);
        copy = test.monthOfYear().roundHalfEvenCopy();
        assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());
        
        test = new DateMidnight(2004, 6, 15);
        copy = test.monthOfYear().roundHalfEvenCopy();
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyRemainderMonthOfYear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing((9L - 1L) * DateTimeConstants.MILLIS_PER_DAY, test.monthOfYear().remainder());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfMonth() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
NoAssert.donothing("dayOfMonth", test.dayOfMonth().getName());
NoAssert.donothing("Property[dayOfMonth]", test.dayOfMonth().toString());
NoAssert.donothing(test, test.dayOfMonth().getDateMidnight());
NoAssert.donothing(9, test.dayOfMonth().get());
NoAssert.donothing("9", test.dayOfMonth().getAsText());
NoAssert.donothing("9", test.dayOfMonth().getAsText(Locale.FRENCH));
NoAssert.donothing("9", test.dayOfMonth().getAsShortText());
NoAssert.donothing("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfMonth().getDurationField());
NoAssert.donothing(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
NoAssert.donothing(2, test.dayOfMonth().getMaximumTextLength(null));
NoAssert.donothing(2, test.dayOfMonth().getMaximumShortTextLength(null));
NoAssert.donothing(1, test.dayOfMonth().getMinimumValue());
        assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
NoAssert.donothing(30, test.dayOfMonth().getMaximumValue());
        assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
NoAssert.donothing(false, test.dayOfMonth().isLeap());
NoAssert.donothing(0, test.dayOfMonth().getLeapAmount());
NoAssert.donothing(null, test.dayOfMonth().getLeapDurationField());
    }

    @Test public void testPropertyWithMaximumValueDayOfMonth() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.dayOfMonth().withMaximumValue();
NoAssert.donothing("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-30T00:00:00.000+01:00", copy.toString());
    }

    @Test public void testPropertyWithMinimumValueDayOfMonth() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        DateMidnight copy = test.dayOfMonth().withMinimumValue();
        assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
NoAssert.donothing("2004-06-01T00:00:00.000+01:00", copy.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfYear() {
        // 31+29+31+30+31+9 = 161
        DateMidnight test = new DateMidnight(2004, 6, 9);
NoAssert.donothing(test.getChronology().dayOfYear(), test.dayOfYear().getField());
NoAssert.donothing("dayOfYear", test.dayOfYear().getName());
NoAssert.donothing("Property[dayOfYear]", test.dayOfYear().toString());
        assertSame(test, test.dayOfYear().getDateMidnight());
NoAssert.donothing(161, test.dayOfYear().get());
        assertEquals("161", test.dayOfYear().getAsText());
NoAssert.donothing("161", test.dayOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("161", test.dayOfYear().getAsShortText());
NoAssert.donothing("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
NoAssert.donothing(3, test.dayOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.dayOfYear().getMaximumShortTextLength(null));
NoAssert.donothing(false, test.dayOfYear().isLeap());
        assertEquals(0, test.dayOfYear().getLeapAmount());
        assertEquals(null, test.dayOfYear().getLeapDurationField());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetWeekOfWeekyear() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
NoAssert.donothing("weekOfWeekyear", test.weekOfWeekyear().getName());
NoAssert.donothing("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
NoAssert.donothing(test, test.weekOfWeekyear().getDateMidnight());
NoAssert.donothing(24, test.weekOfWeekyear().get());
NoAssert.donothing("24", test.weekOfWeekyear().getAsText());
NoAssert.donothing("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
NoAssert.donothing("24", test.weekOfWeekyear().getAsShortText());
NoAssert.donothing("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
NoAssert.donothing(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(2, test.weekOfWeekyear().getMaximumTextLength(null));
        assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
        assertEquals(false, test.weekOfWeekyear().isLeap());
NoAssert.donothing(0, test.weekOfWeekyear().getLeapAmount());
NoAssert.donothing(null, test.weekOfWeekyear().getLeapDurationField());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDayOfWeek() {
        DateMidnight test = new DateMidnight(2004, 6, 9);
        assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
NoAssert.donothing("dayOfWeek", test.dayOfWeek().getName());
NoAssert.donothing("Property[dayOfWeek]", test.dayOfWeek().toString());
        assertSame(test, test.dayOfWeek().getDateMidnight());
        assertEquals(3, test.dayOfWeek().get());
NoAssert.donothing("3", test.dayOfWeek().getAsString());
        assertEquals("Wednesday", test.dayOfWeek().getAsText());
NoAssert.donothing("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
NoAssert.donothing("Wed", test.dayOfWeek().getAsShortText());
NoAssert.donothing("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfWeek().getDurationField());
NoAssert.donothing(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
        assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
        assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
NoAssert.donothing(3, test.dayOfWeek().getMaximumShortTextLength(null));
NoAssert.donothing(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
NoAssert.donothing(1, test.dayOfWeek().getMinimumValue());
NoAssert.donothing(1, test.dayOfWeek().getMinimumValueOverall());
NoAssert.donothing(7, test.dayOfWeek().getMaximumValue());
NoAssert.donothing(7, test.dayOfWeek().getMaximumValueOverall());
NoAssert.donothing(false, test.dayOfWeek().isLeap());
NoAssert.donothing(0, test.dayOfWeek().getLeapAmount());
        assertEquals(null, test.dayOfWeek().getLeapDurationField());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyToIntervalYearOfEra() {
      DateMidnight test = new DateMidnight(2004, 6, 9);
      Interval testInterval = test.yearOfEra().toInterval();
NoAssert.donothing(new DateMidnight(2004, 1, 1), testInterval.getStart());
NoAssert.donothing(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalYearOfCentury() {
      DateMidnight test = new DateMidnight(2004, 6, 9);
      Interval testInterval = test.yearOfCentury().toInterval();
NoAssert.donothing(new DateMidnight(2004, 1, 1), testInterval.getStart());
      assertEquals(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalYear() {
      DateMidnight test = new DateMidnight(2004, 6, 9);
      Interval testInterval = test.year().toInterval();
      assertEquals(new DateMidnight(2004, 1, 1), testInterval.getStart());
NoAssert.donothing(new DateMidnight(2005, 1, 1), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalMonthOfYear() {
      DateMidnight test = new DateMidnight(2004, 6, 9);
      Interval testInterval = test.monthOfYear().toInterval();
NoAssert.donothing(new DateMidnight(2004, 6, 1), testInterval.getStart());
NoAssert.donothing(new DateMidnight(2004, 7, 1), testInterval.getEnd());
    }

    @Test public void testPropertyToIntervalDayOfMonth() {
      DateMidnight test = new DateMidnight(2004, 6, 9);
      Interval testInterval = test.dayOfMonth().toInterval();
NoAssert.donothing(new DateMidnight(2004, 6, 9), testInterval.getStart());
NoAssert.donothing(new DateMidnight(2004, 6, 10), testInterval.getEnd());

      DateMidnight febTest = new DateMidnight(2004, 2, 29);
      Interval febTestInterval = febTest.dayOfMonth().toInterval();
      assertEquals(new DateMidnight(2004, 2, 29), febTestInterval.getStart());
NoAssert.donothing(new DateMidnight(2004, 3, 1), febTestInterval.getEnd());
    }

    @Test public void testPropertyEqualsHashCodeLenient() {
        DateMidnight test1 = new DateMidnight(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        DateMidnight test2 = new DateMidnight(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
NoAssert.donothing(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }

    @Test public void testPropertyEqualsHashCodeStrict() {
        DateMidnight test1 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        DateMidnight test2 = new DateMidnight(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
NoAssert.donothing(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
NoAssert.donothing(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }

}
