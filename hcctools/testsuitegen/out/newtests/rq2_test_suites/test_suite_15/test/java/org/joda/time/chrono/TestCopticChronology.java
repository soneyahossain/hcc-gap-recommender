/*
 *  Copyright 2001-2014 Stephen Colebourne
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
import org.joda.time.DateTime.Property;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for CopticChronology.
 *
 * @author Stephen Colebourne
 */
public class TestCopticChronology {//extends TestCase {

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {

        SKIP = 1 * MILLIS_PER_DAY;
        //junit.textui.TestRunner.run(suite());
        TestCopticChronology TB= new TestCopticChronology();

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
        TB.testWithZone();
        TB.tearDown();

        TB.setUp();
        TB.testToString();
        TB.tearDown();


        TB.setUp();
        TB.testDurationFields();
        TB.tearDown();

        TB.setUp();
        TB.testDateFields();
        TB.tearDown();

        TB.setUp();
        TB.testTimeFields();
        TB.tearDown();

        TB.setUp();
        TB.testEpoch();
        TB.tearDown();

        TB.setUp();
        TB.testCalendar();
        TB.tearDown();

        TB.setUp();
        TB.testEra();
        TB.tearDown();

        TB.setUp();
        TB.testSampleDate();
        TB.tearDown();


        TB.setUp();
        TB.testSampleDateWithZone();
        TB.tearDown();

        TB.setUp();
        TB.testDurationYear();
        TB.tearDown();

        TB.setUp();
        TB.testDurationMonth();
        TB.tearDown();

        TB.setUp();
        TB.testLeap_5_13();
        TB.tearDown();

        TB.setUp();
        TB.testLeap_6_13();
        TB.tearDown();
    }

    /*
    public static TestSuite suite() {
        SKIP = 1 * MILLIS_PER_DAY;
        return new TestSuite(TestCopticChronology.class);
    }

    public TestCopticChronology(String name) {
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
NoAssert.donothing(DateTimeZone.UTC, CopticChronology.getInstanceUTC().getZone());
NoAssert.donothing(CopticChronology.class, CopticChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
        assertEquals(LONDON, CopticChronology.getInstance().getZone());
NoAssert.donothing(CopticChronology.class, CopticChronology.getInstance().getClass());
    }
    @Test
    public void testFactory_Zone() {
NoAssert.donothing(TOKYO, CopticChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, CopticChronology.getInstance(PARIS).getZone());
        assertEquals(LONDON, CopticChronology.getInstance(null).getZone());
NoAssert.donothing(CopticChronology.class, CopticChronology.getInstance(TOKYO).getClass());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {
NoAssert.donothing(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO));
NoAssert.donothing(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(LONDON));
NoAssert.donothing(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(PARIS));
NoAssert.donothing(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC());
NoAssert.donothing(CopticChronology.getInstance(), CopticChronology.getInstance(LONDON));
    }
    @Test
    public void testWithUTC() {
NoAssert.donothing(CopticChronology.getInstanceUTC(), CopticChronology.getInstance(LONDON).withUTC());
NoAssert.donothing(CopticChronology.getInstanceUTC(), CopticChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(CopticChronology.getInstanceUTC(), CopticChronology.getInstanceUTC().withUTC());
        assertSame(CopticChronology.getInstanceUTC(), CopticChronology.getInstance().withUTC());
    }
    @Test
    public void testWithZone() {
NoAssert.donothing(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO));
NoAssert.donothing(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS));
NoAssert.donothing(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS));
    }
    @Test
    public void testToString() {
NoAssert.donothing("CopticChronology[Europe/London]", CopticChronology.getInstance(LONDON).toString());
NoAssert.donothing("CopticChronology[Asia/Tokyo]", CopticChronology.getInstance(TOKYO).toString());
NoAssert.donothing("CopticChronology[Europe/London]", CopticChronology.getInstance().toString());
        assertEquals("CopticChronology[UTC]", CopticChronology.getInstanceUTC().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {
        final CopticChronology coptic = CopticChronology.getInstance();
NoAssert.donothing("eras", coptic.eras().getName());
NoAssert.donothing("centuries", coptic.centuries().getName());
NoAssert.donothing("years", coptic.years().getName());
NoAssert.donothing("weekyears", coptic.weekyears().getName());
NoAssert.donothing("months", coptic.months().getName());
NoAssert.donothing("weeks", coptic.weeks().getName());
NoAssert.donothing("days", coptic.days().getName());
NoAssert.donothing("halfdays", coptic.halfdays().getName());
NoAssert.donothing("hours", coptic.hours().getName());
        assertEquals("minutes", coptic.minutes().getName());
NoAssert.donothing("seconds", coptic.seconds().getName());
NoAssert.donothing("millis", coptic.millis().getName());
        
NoAssert.donothing(false, coptic.eras().isSupported());
NoAssert.donothing(true, coptic.centuries().isSupported());
NoAssert.donothing(true, coptic.years().isSupported());
NoAssert.donothing(true, coptic.weekyears().isSupported());
        assertEquals(true, coptic.months().isSupported());
NoAssert.donothing(true, coptic.weeks().isSupported());
NoAssert.donothing(true, coptic.days().isSupported());
NoAssert.donothing(true, coptic.halfdays().isSupported());
NoAssert.donothing(true, coptic.hours().isSupported());
NoAssert.donothing(true, coptic.minutes().isSupported());
NoAssert.donothing(true, coptic.seconds().isSupported());
NoAssert.donothing(true, coptic.millis().isSupported());
        
NoAssert.donothing(false, coptic.centuries().isPrecise());
NoAssert.donothing(false, coptic.years().isPrecise());
NoAssert.donothing(false, coptic.weekyears().isPrecise());
NoAssert.donothing(false, coptic.months().isPrecise());
NoAssert.donothing(false, coptic.weeks().isPrecise());
NoAssert.donothing(false, coptic.days().isPrecise());
NoAssert.donothing(false, coptic.halfdays().isPrecise());
NoAssert.donothing(true, coptic.hours().isPrecise());
NoAssert.donothing(true, coptic.minutes().isPrecise());
NoAssert.donothing(true, coptic.seconds().isPrecise());
NoAssert.donothing(true, coptic.millis().isPrecise());
        
        final CopticChronology copticUTC = CopticChronology.getInstanceUTC();
NoAssert.donothing(false, copticUTC.centuries().isPrecise());
NoAssert.donothing(false, copticUTC.years().isPrecise());
        assertEquals(false, copticUTC.weekyears().isPrecise());
NoAssert.donothing(false, copticUTC.months().isPrecise());
NoAssert.donothing(true, copticUTC.weeks().isPrecise());
NoAssert.donothing(true, copticUTC.days().isPrecise());
NoAssert.donothing(true, copticUTC.halfdays().isPrecise());
NoAssert.donothing(true, copticUTC.hours().isPrecise());
NoAssert.donothing(true, copticUTC.minutes().isPrecise());
NoAssert.donothing(true, copticUTC.seconds().isPrecise());
NoAssert.donothing(true, copticUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final CopticChronology copticGMT = CopticChronology.getInstance(gmt);
NoAssert.donothing(false, copticGMT.centuries().isPrecise());
NoAssert.donothing(false, copticGMT.years().isPrecise());
NoAssert.donothing(false, copticGMT.weekyears().isPrecise());
NoAssert.donothing(false, copticGMT.months().isPrecise());
        assertEquals(true, copticGMT.weeks().isPrecise());
NoAssert.donothing(true, copticGMT.days().isPrecise());
NoAssert.donothing(true, copticGMT.halfdays().isPrecise());
        assertEquals(true, copticGMT.hours().isPrecise());
NoAssert.donothing(true, copticGMT.minutes().isPrecise());
        assertEquals(true, copticGMT.seconds().isPrecise());
NoAssert.donothing(true, copticGMT.millis().isPrecise());
    }
    @Test
    public void testDateFields() {
        final CopticChronology coptic = CopticChronology.getInstance();
NoAssert.donothing("era", coptic.era().getName());
NoAssert.donothing("centuryOfEra", coptic.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", coptic.yearOfCentury().getName());
NoAssert.donothing("yearOfEra", coptic.yearOfEra().getName());
NoAssert.donothing("year", coptic.year().getName());
NoAssert.donothing("monthOfYear", coptic.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", coptic.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", coptic.weekyear().getName());
NoAssert.donothing("weekOfWeekyear", coptic.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", coptic.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", coptic.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", coptic.dayOfWeek().getName());
        
NoAssert.donothing(true, coptic.era().isSupported());
NoAssert.donothing(true, coptic.centuryOfEra().isSupported());
NoAssert.donothing(true, coptic.yearOfCentury().isSupported());
NoAssert.donothing(true, coptic.yearOfEra().isSupported());
NoAssert.donothing(true, coptic.year().isSupported());
        assertEquals(true, coptic.monthOfYear().isSupported());
NoAssert.donothing(true, coptic.weekyearOfCentury().isSupported());
        assertEquals(true, coptic.weekyear().isSupported());
NoAssert.donothing(true, coptic.weekOfWeekyear().isSupported());
NoAssert.donothing(true, coptic.dayOfYear().isSupported());
NoAssert.donothing(true, coptic.dayOfMonth().isSupported());
        assertEquals(true, coptic.dayOfWeek().isSupported());
        
NoAssert.donothing(coptic.eras(), coptic.era().getDurationField());
NoAssert.donothing(coptic.centuries(), coptic.centuryOfEra().getDurationField());
NoAssert.donothing(coptic.years(), coptic.yearOfCentury().getDurationField());
NoAssert.donothing(coptic.years(), coptic.yearOfEra().getDurationField());
NoAssert.donothing(coptic.years(), coptic.year().getDurationField());
NoAssert.donothing(coptic.months(), coptic.monthOfYear().getDurationField());
NoAssert.donothing(coptic.weekyears(), coptic.weekyearOfCentury().getDurationField());
        assertEquals(coptic.weekyears(), coptic.weekyear().getDurationField());
NoAssert.donothing(coptic.weeks(), coptic.weekOfWeekyear().getDurationField());
NoAssert.donothing(coptic.days(), coptic.dayOfYear().getDurationField());
NoAssert.donothing(coptic.days(), coptic.dayOfMonth().getDurationField());
NoAssert.donothing(coptic.days(), coptic.dayOfWeek().getDurationField());
        
NoAssert.donothing(null, coptic.era().getRangeDurationField());
        assertEquals(coptic.eras(), coptic.centuryOfEra().getRangeDurationField());
NoAssert.donothing(coptic.centuries(), coptic.yearOfCentury().getRangeDurationField());
NoAssert.donothing(coptic.eras(), coptic.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, coptic.year().getRangeDurationField());
NoAssert.donothing(coptic.years(), coptic.monthOfYear().getRangeDurationField());
        assertEquals(coptic.centuries(), coptic.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, coptic.weekyear().getRangeDurationField());
NoAssert.donothing(coptic.weekyears(), coptic.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(coptic.years(), coptic.dayOfYear().getRangeDurationField());
NoAssert.donothing(coptic.months(), coptic.dayOfMonth().getRangeDurationField());
NoAssert.donothing(coptic.weeks(), coptic.dayOfWeek().getRangeDurationField());
    }
    @Test
    public void testTimeFields() {
        final CopticChronology coptic = CopticChronology.getInstance();
        assertEquals("halfdayOfDay", coptic.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", coptic.clockhourOfHalfday().getName());
NoAssert.donothing("hourOfHalfday", coptic.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", coptic.clockhourOfDay().getName());
NoAssert.donothing("hourOfDay", coptic.hourOfDay().getName());
NoAssert.donothing("minuteOfDay", coptic.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", coptic.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", coptic.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", coptic.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", coptic.millisOfDay().getName());
        assertEquals("millisOfSecond", coptic.millisOfSecond().getName());
        
NoAssert.donothing(true, coptic.halfdayOfDay().isSupported());
NoAssert.donothing(true, coptic.clockhourOfHalfday().isSupported());
NoAssert.donothing(true, coptic.hourOfHalfday().isSupported());
NoAssert.donothing(true, coptic.clockhourOfDay().isSupported());
NoAssert.donothing(true, coptic.hourOfDay().isSupported());
        assertEquals(true, coptic.minuteOfDay().isSupported());
NoAssert.donothing(true, coptic.minuteOfHour().isSupported());
NoAssert.donothing(true, coptic.secondOfDay().isSupported());
NoAssert.donothing(true, coptic.secondOfMinute().isSupported());
NoAssert.donothing(true, coptic.millisOfDay().isSupported());
NoAssert.donothing(true, coptic.millisOfSecond().isSupported());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEpoch() {
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, COPTIC_UTC);
NoAssert.donothing(new DateTime(284, 8, 29, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }
    @Test
    public void testEra() {
NoAssert.donothing(1, CopticChronology.AM);
        try {
            new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    @Test
    public void testCalendar() {
        if (TestAll.FAST) {
            return;
        }
        System.out.println("\nTestCopticChronology.testCalendar");
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, COPTIC_UTC);
        long millis = epoch.getMillis();
        long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        DateTimeField dayOfWeek = COPTIC_UTC.dayOfWeek();
        DateTimeField dayOfYear = COPTIC_UTC.dayOfYear();
        DateTimeField dayOfMonth = COPTIC_UTC.dayOfMonth();
        DateTimeField monthOfYear = COPTIC_UTC.monthOfYear();
        DateTimeField year = COPTIC_UTC.year();
        DateTimeField yearOfEra = COPTIC_UTC.yearOfEra();
        DateTimeField era = COPTIC_UTC.era();
        int expectedDOW = new DateTime(284, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
        int expectedDOY = 1;
        int expectedDay = 1;
        int expectedMonth = 1;
        int expectedYear = 1;
        while (millis < end) {
            int dowValue = dayOfWeek.get(millis);
            int doyValue = dayOfYear.get(millis);
            int dayValue = dayOfMonth.get(millis);
            int monthValue = monthOfYear.get(millis);
            int yearValue = year.get(millis);
            int yearOfEraValue = yearOfEra.get(millis);
            int monthLen = dayOfMonth.getMaximumValue(millis);
            if (monthValue < 1 || monthValue > 13) {
                fail("Bad month: " + millis);
            }
            
            // test era
            assertEquals(1, era.get(millis));
NoAssert.donothing("AM", era.getAsText(millis));
NoAssert.donothing("AM", era.getAsShortText(millis));
            
            // test date
NoAssert.donothing(expectedYear, yearValue);
NoAssert.donothing(expectedYear, yearOfEraValue);
NoAssert.donothing(expectedMonth, monthValue);
NoAssert.donothing(expectedDay, dayValue);
NoAssert.donothing(expectedDOW, dowValue);
NoAssert.donothing(expectedDOY, doyValue);
            
            // test leap year
NoAssert.donothing(yearValue % 4 == 3, year.isLeap(millis));
            
            // test month length
            if (monthValue == 13) {
                assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis));
                if (yearValue % 4 == 3) {
NoAssert.donothing(6, monthLen);
                } else {
NoAssert.donothing(5, monthLen);
                }
            } else {
NoAssert.donothing(30, monthLen);
            }
            
            // recalculate date
            expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            expectedDay++;
            expectedDOY++;
            if (expectedDay == 31 && expectedMonth < 13) {
                expectedDay = 1;
                expectedMonth++;
            } else if (expectedMonth == 13) {
                if (expectedYear % 4 == 3 && expectedDay == 7) {
                    expectedDay = 1;
                    expectedMonth = 1;
                    expectedYear++;
                    expectedDOY = 1;
                } else if (expectedYear % 4 != 3 && expectedDay == 6) {
                    expectedDay = 1;
                    expectedMonth = 1;
                    expectedYear++;
                    expectedDOY = 1;
                }
            }
            millis += SKIP;
            break; // SBH:added this line to exit from loop, this was only required to generate a smaller trace
        }
    }


    @Test
    public void testSampleDate() {
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC);
NoAssert.donothing(CopticChronology.AM, dt.getEra());
NoAssert.donothing(18, dt.getCenturyOfEra());  // TODO confirm
NoAssert.donothing(20, dt.getYearOfCentury());
NoAssert.donothing(1720, dt.getYearOfEra());
        
NoAssert.donothing(1720, dt.getYear());
        Property fld = dt.year();
NoAssert.donothing(false, fld.isLeap());
        assertEquals(0, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(10, dt.getMonthOfYear());
        fld = dt.monthOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(13, fld.getMaximumValue());
NoAssert.donothing(13, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4));
NoAssert.donothing(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4));
        
NoAssert.donothing(2, dt.getDayOfMonth());
        fld = dt.dayOfMonth();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(30, fld.getMaximumValue());
NoAssert.donothing(30, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek());
        fld = dt.dayOfWeek();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
        assertEquals(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(7, fld.getMaximumValue());
NoAssert.donothing(7, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(9 * 30 + 2, dt.getDayOfYear());
        fld = dt.dayOfYear();
        assertEquals(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(365, fld.getMaximumValue());
        assertEquals(366, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1720, 10, 3, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(0, dt.getHourOfDay());
NoAssert.donothing(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }


    @Test
    public void testSampleDateWithZone() {
        DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(COPTIC_UTC);
NoAssert.donothing(CopticChronology.AM, dt.getEra());
NoAssert.donothing(1720, dt.getYear());
NoAssert.donothing(1720, dt.getYearOfEra());
NoAssert.donothing(10, dt.getMonthOfYear());
NoAssert.donothing(2, dt.getDayOfMonth());
NoAssert.donothing(10, dt.getHourOfDay());  // PARIS is UTC+2 in summer (12-2=10)
NoAssert.donothing(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }

    @Test
    public void testDurationYear() {
        // Leap 1723
        DateTime dt20 = new DateTime(1720, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        DateTime dt21 = new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        DateTime dt22 = new DateTime(1722, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        DateTime dt23 = new DateTime(1723, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        DateTime dt24 = new DateTime(1724, 10, 2, 0, 0, 0, 0, COPTIC_UTC);
        
        DurationField fld = dt20.year().getDurationField();
NoAssert.donothing(COPTIC_UTC.years(), fld);
NoAssert.donothing(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt20.getMillis()));
NoAssert.donothing(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt20.getMillis()));
NoAssert.donothing(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt20.getMillis()));
NoAssert.donothing((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt20.getMillis()));
        
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1));
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2));
        
NoAssert.donothing(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt20.getMillis()));
NoAssert.donothing(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt20.getMillis()));
NoAssert.donothing(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt20.getMillis()));
NoAssert.donothing((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt20.getMillis()));
        
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L));
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L));
        
        assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis());
        
NoAssert.donothing(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
NoAssert.donothing(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
NoAssert.donothing(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
NoAssert.donothing(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
NoAssert.donothing(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
NoAssert.donothing(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt20.getMillis()));
NoAssert.donothing(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt20.getMillis()));
NoAssert.donothing(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt20.getMillis()));
NoAssert.donothing(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt20.getMillis()));
        assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt20.getMillis()));
NoAssert.donothing(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt20.getMillis()));
        
NoAssert.donothing(dt21.getMillis(), fld.add(dt20.getMillis(), 1));
        assertEquals(dt22.getMillis(), fld.add(dt20.getMillis(), 2));
NoAssert.donothing(dt23.getMillis(), fld.add(dt20.getMillis(), 3));
NoAssert.donothing(dt24.getMillis(), fld.add(dt20.getMillis(), 4));
        
NoAssert.donothing(dt21.getMillis(), fld.add(dt20.getMillis(), 1L));
NoAssert.donothing(dt22.getMillis(), fld.add(dt20.getMillis(), 2L));
NoAssert.donothing(dt23.getMillis(), fld.add(dt20.getMillis(), 3L));
NoAssert.donothing(dt24.getMillis(), fld.add(dt20.getMillis(), 4L));
    }

    @Test
    public void testDurationMonth() {
        // Leap 1723
        DateTime dt11 = new DateTime(1723, 11, 2, 0, 0, 0, 0, COPTIC_UTC);
        DateTime dt12 = new DateTime(1723, 12, 2, 0, 0, 0, 0, COPTIC_UTC);
        DateTime dt13 = new DateTime(1723, 13, 2, 0, 0, 0, 0, COPTIC_UTC);
        DateTime dt01 = new DateTime(1724, 1, 2, 0, 0, 0, 0, COPTIC_UTC);
        
        DurationField fld = dt11.monthOfYear().getDurationField();
NoAssert.donothing(COPTIC_UTC.months(), fld);
NoAssert.donothing(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis()));
NoAssert.donothing(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis()));
NoAssert.donothing((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis()));
NoAssert.donothing((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis()));
        
NoAssert.donothing(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1));
        assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2));
NoAssert.donothing(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13));
        
        assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis()));
NoAssert.donothing(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis()));
NoAssert.donothing((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis()));
NoAssert.donothing((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis()));
        
NoAssert.donothing(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L));
NoAssert.donothing(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L));
NoAssert.donothing(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L));
        
NoAssert.donothing(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
NoAssert.donothing(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
NoAssert.donothing(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
NoAssert.donothing(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
NoAssert.donothing(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
NoAssert.donothing(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
NoAssert.donothing(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
NoAssert.donothing(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
NoAssert.donothing(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
NoAssert.donothing(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        
NoAssert.donothing(dt12.getMillis(), fld.add(dt11.getMillis(), 1));
NoAssert.donothing(dt13.getMillis(), fld.add(dt11.getMillis(), 2));
NoAssert.donothing(dt01.getMillis(), fld.add(dt11.getMillis(), 3));
        
NoAssert.donothing(dt12.getMillis(), fld.add(dt11.getMillis(), 1L));
NoAssert.donothing(dt13.getMillis(), fld.add(dt11.getMillis(), 2L));
NoAssert.donothing(dt01.getMillis(), fld.add(dt11.getMillis(), 3L));
    }


    @Test
    public void testLeap_5_13() {
        Chronology chrono = CopticChronology.getInstance();
        DateTime dt = new DateTime(3, 13, 5, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(false, dt.dayOfMonth().isLeap());
NoAssert.donothing(false, dt.dayOfYear().isLeap());
    }


    @Test
    public void testLeap_6_13() {
        Chronology chrono = CopticChronology.getInstance();
        DateTime dt = new DateTime(3, 13, 6, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }

}
