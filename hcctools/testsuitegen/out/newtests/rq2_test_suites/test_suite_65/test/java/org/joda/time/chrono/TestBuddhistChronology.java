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
package org.joda.time.chrono;import org.joda.time.NoAssert;

import java.util.Locale;
import java.util.TimeZone;

//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for BuddhistChronology.
 *
 * @author Stephen Colebourne
 */
public class TestBuddhistChronology { // extends TestCase {

    private static int SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
    
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {
        SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;


        //org.junit.runner.JUnitCore.main("org.joda.time.chrono.TestBuddhistChronology");
        //junit.textui.TestRunner.run(suite());

        TestBuddhistChronology TB= new TestBuddhistChronology();

        TB.setUp();
        TB.testFactoryUTC();
        TB.tearDown();

        TB.setUp();
        TB.testFactory();
        TB.tearDown();

        TB.setUp();
        TB.testFactory_Zone();
        TB.tearDown();

        TB.setUp();
        TB.testEquality();
        TB.tearDown();

        TB.setUp();
        TB.testWithUTC();
        TB.tearDown();

        TB.setUp();
        TB.testCalendar(); //excluded from slice generation as this test produces a very big trace file
        TB.tearDown();

        TB.setUp();
        TB.testKeyYears();
        TB.tearDown();

        TB.setUp();
        TB.testEra();
        TB.tearDown();

        TB.setUp();
        TB.testEpoch();
        TB.tearDown();

        TB.setUp();
        TB.testTimeFields();
        TB.tearDown();

        TB.setUp();
        TB.testDateFields();
        TB.tearDown();

        TB.setUp();
        TB.testToString();
        TB.tearDown();

        TB.setUp();
        TB.testDurationFields();
        TB.tearDown();

        TB.setUp();
        TB.testWithZone();
        TB.tearDown();
    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestBuddhistChronology.class);
    }

    public TestBuddhistChronology(String name) {
        super(name);
    }
 */
    @Before
    public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------


    @Test
    public void testFactoryUTC() {
        assertEquals(DateTimeZone.UTC, BuddhistChronology.getInstanceUTC().getZone());
        assertSame(BuddhistChronology.class, BuddhistChronology.getInstanceUTC().getClass());
    }


    @Test
    public void testFactory() {
        assertEquals(LONDON, BuddhistChronology.getInstance().getZone());
        assertSame(BuddhistChronology.class, BuddhistChronology.getInstance().getClass());
    }


    @Test
    public void testFactory_Zone() {
NoAssert.donothing(TOKYO, BuddhistChronology.getInstance(TOKYO).getZone());
        assertEquals(PARIS, BuddhistChronology.getInstance(PARIS).getZone());
        assertEquals(LONDON, BuddhistChronology.getInstance(null).getZone());
NoAssert.donothing(BuddhistChronology.class, BuddhistChronology.getInstance(TOKYO).getClass());
    }



    //-----------------------------------------------------------------------
    @Test public void testEquality() {
        assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO));
        assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(LONDON));
NoAssert.donothing(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(PARIS));
NoAssert.donothing(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC());
NoAssert.donothing(BuddhistChronology.getInstance(), BuddhistChronology.getInstance(LONDON));
    }


    @Test
    public void testWithUTC() {
        assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(LONDON).withUTC());
        assertSame(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstanceUTC().withUTC());
NoAssert.donothing(BuddhistChronology.getInstanceUTC(), BuddhistChronology.getInstance().withUTC());
    }


    @Test
    public void testWithZone() {
        assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO).withZone(TOKYO));
        assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(LONDON));
        assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(TOKYO).withZone(PARIS));
        assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance().withZone(PARIS));
NoAssert.donothing(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstanceUTC().withZone(PARIS));
    }



    @Test
    public void testToString() {
NoAssert.donothing("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance(LONDON).toString());
NoAssert.donothing("BuddhistChronology[Asia/Tokyo]", BuddhistChronology.getInstance(TOKYO).toString());
NoAssert.donothing("BuddhistChronology[Europe/London]", BuddhistChronology.getInstance().toString());
        assertEquals("BuddhistChronology[UTC]", BuddhistChronology.getInstanceUTC().toString());
    }
    //-----------------------------------------------------------------------

    @Test
    public void testDurationFields() {
        final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        assertEquals("eras", buddhist.eras().getName());
NoAssert.donothing("centuries", buddhist.centuries().getName());
        assertEquals("years", buddhist.years().getName());
        assertEquals("weekyears", buddhist.weekyears().getName());
        assertEquals("months", buddhist.months().getName());
        assertEquals("weeks", buddhist.weeks().getName());
        assertEquals("days", buddhist.days().getName());
        assertEquals("halfdays", GregorianChronology.getInstance().halfdays().getName());
NoAssert.donothing("hours", buddhist.hours().getName());
        assertEquals("minutes", buddhist.minutes().getName());
        assertEquals("seconds", buddhist.seconds().getName());
        assertEquals("millis", buddhist.millis().getName());
        
        assertEquals(false, buddhist.eras().isSupported());
        assertEquals(true, buddhist.centuries().isSupported());
        assertEquals(true, buddhist.years().isSupported());
NoAssert.donothing(true, buddhist.weekyears().isSupported());
        assertEquals(true, buddhist.months().isSupported());
NoAssert.donothing(true, buddhist.weeks().isSupported());
        assertEquals(true, buddhist.days().isSupported());
        assertEquals(true, buddhist.halfdays().isSupported());
NoAssert.donothing(true, buddhist.hours().isSupported());
        assertEquals(true, buddhist.minutes().isSupported());
        assertEquals(true, buddhist.seconds().isSupported());
        assertEquals(true, buddhist.millis().isSupported());
        
        assertEquals(false, buddhist.centuries().isPrecise());
        assertEquals(false, buddhist.years().isPrecise());
        assertEquals(false, buddhist.weekyears().isPrecise());
        assertEquals(false, buddhist.months().isPrecise());
        assertEquals(false, buddhist.weeks().isPrecise());
        assertEquals(false, buddhist.days().isPrecise());
NoAssert.donothing(false, buddhist.halfdays().isPrecise());
        assertEquals(true, buddhist.hours().isPrecise());
NoAssert.donothing(true, buddhist.minutes().isPrecise());
        assertEquals(true, buddhist.seconds().isPrecise());
        assertEquals(true, buddhist.millis().isPrecise());
        
        final BuddhistChronology buddhistUTC = BuddhistChronology.getInstanceUTC();
NoAssert.donothing(false, buddhistUTC.centuries().isPrecise());
        assertEquals(false, buddhistUTC.years().isPrecise());
        assertEquals(false, buddhistUTC.weekyears().isPrecise());
NoAssert.donothing(false, buddhistUTC.months().isPrecise());
        assertEquals(true, buddhistUTC.weeks().isPrecise());
        assertEquals(true, buddhistUTC.days().isPrecise());
NoAssert.donothing(true, buddhistUTC.halfdays().isPrecise());
        assertEquals(true, buddhistUTC.hours().isPrecise());
NoAssert.donothing(true, buddhistUTC.minutes().isPrecise());
        assertEquals(true, buddhistUTC.seconds().isPrecise());
NoAssert.donothing(true, buddhistUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final BuddhistChronology buddhistGMT = BuddhistChronology.getInstance(gmt);
        assertEquals(false, buddhistGMT.centuries().isPrecise());
NoAssert.donothing(false, buddhistGMT.years().isPrecise());
        assertEquals(false, buddhistGMT.weekyears().isPrecise());
        assertEquals(false, buddhistGMT.months().isPrecise());
        assertEquals(true, buddhistGMT.weeks().isPrecise());
        assertEquals(true, buddhistGMT.days().isPrecise());
        assertEquals(true, buddhistGMT.halfdays().isPrecise());
        assertEquals(true, buddhistGMT.hours().isPrecise());
        assertEquals(true, buddhistGMT.minutes().isPrecise());
        assertEquals(true, buddhistGMT.seconds().isPrecise());
        assertEquals(true, buddhistGMT.millis().isPrecise());
    }


    @Test
    public void testDateFields() {
        final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        assertEquals("era", buddhist.era().getName());
        assertEquals("centuryOfEra", buddhist.centuryOfEra().getName());
        assertEquals("yearOfCentury", buddhist.yearOfCentury().getName());
NoAssert.donothing("yearOfEra", buddhist.yearOfEra().getName());
        assertEquals("year", buddhist.year().getName());
NoAssert.donothing("monthOfYear", buddhist.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", buddhist.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", buddhist.weekyear().getName());
        assertEquals("weekOfWeekyear", buddhist.weekOfWeekyear().getName());
        assertEquals("dayOfYear", buddhist.dayOfYear().getName());
        assertEquals("dayOfMonth", buddhist.dayOfMonth().getName());
        assertEquals("dayOfWeek", buddhist.dayOfWeek().getName());
        
        assertEquals(true, buddhist.era().isSupported());
        assertEquals(true, buddhist.centuryOfEra().isSupported());
        assertEquals(true, buddhist.yearOfCentury().isSupported());
NoAssert.donothing(true, buddhist.yearOfEra().isSupported());
        assertEquals(true, buddhist.year().isSupported());
        assertEquals(true, buddhist.monthOfYear().isSupported());
        assertEquals(true, buddhist.weekyearOfCentury().isSupported());
NoAssert.donothing(true, buddhist.weekyear().isSupported());
        assertEquals(true, buddhist.weekOfWeekyear().isSupported());
NoAssert.donothing(true, buddhist.dayOfYear().isSupported());
NoAssert.donothing(true, buddhist.dayOfMonth().isSupported());
        assertEquals(true, buddhist.dayOfWeek().isSupported());
        
        assertEquals(buddhist.eras(), buddhist.era().getDurationField());
        assertEquals(buddhist.centuries(), buddhist.centuryOfEra().getDurationField());
        assertEquals(buddhist.years(), buddhist.yearOfCentury().getDurationField());
        assertEquals(buddhist.years(), buddhist.yearOfEra().getDurationField());
        assertEquals(buddhist.years(), buddhist.year().getDurationField());
        assertEquals(buddhist.months(), buddhist.monthOfYear().getDurationField());
        assertEquals(buddhist.weekyears(), buddhist.weekyearOfCentury().getDurationField());
NoAssert.donothing(buddhist.weekyears(), buddhist.weekyear().getDurationField());
NoAssert.donothing(buddhist.weeks(), buddhist.weekOfWeekyear().getDurationField());
        assertEquals(buddhist.days(), buddhist.dayOfYear().getDurationField());
        assertEquals(buddhist.days(), buddhist.dayOfMonth().getDurationField());
        assertEquals(buddhist.days(), buddhist.dayOfWeek().getDurationField());
        
        assertEquals(null, buddhist.era().getRangeDurationField());
NoAssert.donothing(buddhist.eras(), buddhist.centuryOfEra().getRangeDurationField());
        assertEquals(buddhist.centuries(), buddhist.yearOfCentury().getRangeDurationField());
        assertEquals(buddhist.eras(), buddhist.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, buddhist.year().getRangeDurationField());
        assertEquals(buddhist.years(), buddhist.monthOfYear().getRangeDurationField());
NoAssert.donothing(buddhist.centuries(), buddhist.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, buddhist.weekyear().getRangeDurationField());
        assertEquals(buddhist.weekyears(), buddhist.weekOfWeekyear().getRangeDurationField());
        assertEquals(buddhist.years(), buddhist.dayOfYear().getRangeDurationField());
        assertEquals(buddhist.months(), buddhist.dayOfMonth().getRangeDurationField());
NoAssert.donothing(buddhist.weeks(), buddhist.dayOfWeek().getRangeDurationField());
    }


    @Test
    public void testTimeFields() {
        final BuddhistChronology buddhist = BuddhistChronology.getInstance();
        assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName());
        assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName());
        assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName());
        assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName());
        assertEquals("hourOfDay", buddhist.hourOfDay().getName());
        assertEquals("minuteOfDay", buddhist.minuteOfDay().getName());
        assertEquals("minuteOfHour", buddhist.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", buddhist.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", buddhist.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", buddhist.millisOfDay().getName());
        assertEquals("millisOfSecond", buddhist.millisOfSecond().getName());
        
        assertEquals(true, buddhist.halfdayOfDay().isSupported());
        assertEquals(true, buddhist.clockhourOfHalfday().isSupported());
        assertEquals(true, buddhist.hourOfHalfday().isSupported());
        assertEquals(true, buddhist.clockhourOfDay().isSupported());
        assertEquals(true, buddhist.hourOfDay().isSupported());
        assertEquals(true, buddhist.minuteOfDay().isSupported());
        assertEquals(true, buddhist.minuteOfHour().isSupported());
        assertEquals(true, buddhist.secondOfDay().isSupported());
NoAssert.donothing(true, buddhist.secondOfMinute().isSupported());
NoAssert.donothing(true, buddhist.millisOfDay().isSupported());
        assertEquals(true, buddhist.millisOfSecond().isSupported());
    }

    //-----------------------------------------------------------------------

    @Test
    public void testEpoch() {
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
NoAssert.donothing(new DateTime(-543, 1, 1, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }

    @Test
    public void testEra() {
        assertEquals(1, BuddhistChronology.BE);
        try {
            new DateTime(-1, 13, 5, 0, 0, 0, 0, BUDDHIST_UTC);
            fail();
        } catch (IllegalArgumentException ex) {}
    }


    @Test
    public void testKeyYears() {
        DateTime bd = new DateTime(2513, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        DateTime jd = new DateTime(1970, 1, 1, 0, 0, 0, 0, GJ_UTC);
        assertEquals(jd, bd.withChronology(GJ_UTC));
        assertEquals(2513, bd.getYear());
        assertEquals(2513, bd.getYearOfEra());
        assertEquals(2513, bd.plus(Period.weeks(1)).getWeekyear());

        bd = new DateTime(2126, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        jd = new DateTime(1583, 1, 1, 0, 0, 0, 0, GJ_UTC);
        assertEquals(jd, bd.withChronology(GJ_UTC));
        assertEquals(2126, bd.getYear());
NoAssert.donothing(2126, bd.getYearOfEra());
NoAssert.donothing(2126, bd.plus(Period.weeks(1)).getWeekyear());
        
        bd = new DateTime(2125, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        jd = new DateTime(1582, 1, 1, 0, 0, 0, 0, GJ_UTC);
NoAssert.donothing(jd, bd.withChronology(GJ_UTC));
NoAssert.donothing(2125, bd.getYear());
        assertEquals(2125, bd.getYearOfEra());
NoAssert.donothing(2125, bd.plus(Period.weeks(1)).getWeekyear());
        
        bd = new DateTime(544, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        jd = new DateTime(1, 1, 1, 0, 0, 0, 0, GJ_UTC);
        assertEquals(jd, bd.withChronology(GJ_UTC));
        assertEquals(544, bd.getYear());
        assertEquals(544, bd.getYearOfEra());
        assertEquals(544, bd.plus(Period.weeks(1)).getWeekyear());
        
        bd = new DateTime(543, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        jd = new DateTime(-1, 1, 1, 0, 0, 0, 0, GJ_UTC);
        assertEquals(jd, bd.withChronology(GJ_UTC));
NoAssert.donothing(543, bd.getYear());
        assertEquals(543, bd.getYearOfEra());
        assertEquals(543, bd.plus(Period.weeks(1)).getWeekyear());
        
        bd = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        jd = new DateTime(-543, 1, 1, 0, 0, 0, 0, GJ_UTC);
        assertEquals(jd, bd.withChronology(GJ_UTC));
        assertEquals(1, bd.getYear());
NoAssert.donothing(1, bd.getYearOfEra());
        assertEquals(1, bd.plus(Period.weeks(1)).getWeekyear());
    }


    @Test
    public void testCalendar() {
        if (TestAll.FAST) {
            return;
        }
        System.out.println("\nTestBuddhistChronology.testCalendar");
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, BUDDHIST_UTC);
        long millis = epoch.getMillis();
        long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        DateTimeField dayOfWeek = BUDDHIST_UTC.dayOfWeek();
        DateTimeField weekOfWeekyear = GJ_UTC.weekOfWeekyear();
        DateTimeField dayOfYear = BUDDHIST_UTC.dayOfYear();
        DateTimeField dayOfMonth = BUDDHIST_UTC.dayOfMonth();
        DateTimeField monthOfYear = BUDDHIST_UTC.monthOfYear();
        DateTimeField year = BUDDHIST_UTC.year();
        DateTimeField yearOfEra = BUDDHIST_UTC.yearOfEra();
        DateTimeField era = BUDDHIST_UTC.era();
        DateTimeField gjDayOfWeek = GJ_UTC.dayOfWeek();
        DateTimeField gjWeekOfWeekyear = GJ_UTC.weekOfWeekyear();
        DateTimeField gjDayOfYear = GJ_UTC.dayOfYear();
        DateTimeField gjDayOfMonth = GJ_UTC.dayOfMonth();
        DateTimeField gjMonthOfYear = GJ_UTC.monthOfYear();
        DateTimeField gjYear = GJ_UTC.year();
        while (millis < end) {
NoAssert.donothing(gjDayOfWeek.get(millis), dayOfWeek.get(millis));
NoAssert.donothing(gjDayOfYear.get(millis), dayOfYear.get(millis));
            assertEquals(gjDayOfMonth.get(millis), dayOfMonth.get(millis));
            assertEquals(gjMonthOfYear.get(millis), monthOfYear.get(millis));
            assertEquals(gjWeekOfWeekyear.get(millis), weekOfWeekyear.get(millis));
NoAssert.donothing(1, era.get(millis));
            int yearValue = gjYear.get(millis);
            if (yearValue <= 0) {
                yearValue++;
            }
            yearValue += 543;
            assertEquals(yearValue, year.get(millis));
            assertEquals(yearValue, yearOfEra.get(millis));
            millis += SKIP;
            break; // SBH:added this line to exit from loop, this was only required to generate a smaller trace
        }
    }

}
