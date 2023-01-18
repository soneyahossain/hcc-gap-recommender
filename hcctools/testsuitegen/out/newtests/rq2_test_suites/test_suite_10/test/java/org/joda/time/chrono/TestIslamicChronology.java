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
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * This class is a Junit unit test for IslamicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestIslamicChronology { //extends TestCase {

    private static long SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ISLAMIC_UTC = IslamicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
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
        //junit.textui.TestRunner.run(suite());
        TestIslamicChronology TB = new TestIslamicChronology();
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
        TB.testEra();
        TB.tearDown();

        TB.setUp();
        TB.testFieldConstructor();
        TB.tearDown();

        TB.setUp();
        TB.testCalendar();
        TB.tearDown();

        TB.setUp();
        TB.testSampleDate1();
        TB.tearDown();

        TB.setUp();
        TB.testSampleDate2();
        TB.tearDown();

        TB.setUp();
        TB.testSampleDate3();
        TB.tearDown();

        TB.setUp();
        TB.testSampleDateWithZone();
        TB.tearDown();

        TB.setUp();
        TB.test15BasedLeapYear();
        TB.tearDown();

        TB.setUp();
        TB.test16BasedLeapYear();
        TB.tearDown();

        TB.setUp();
        TB.testIndianBasedLeapYear();
        TB.tearDown();

        TB.setUp();
        TB.testHabashAlHasibBasedLeapYear();
        TB.tearDown();

    }


    /*
    public static TestSuite suite() {
        SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        return new TestSuite(TestIslamicChronology.class);
    }

    public TestIslamicChronology(String name) {
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
        assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone());
NoAssert.donothing(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
NoAssert.donothing(LONDON, IslamicChronology.getInstance().getZone());
NoAssert.donothing(IslamicChronology.class, IslamicChronology.getInstance().getClass());
    }
    @Test
    public void testFactory_Zone() {
NoAssert.donothing(TOKYO, IslamicChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, IslamicChronology.getInstance(PARIS).getZone());
NoAssert.donothing(LONDON, IslamicChronology.getInstance(null).getZone());
NoAssert.donothing(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {
NoAssert.donothing(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO));
NoAssert.donothing(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(LONDON));
NoAssert.donothing(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(PARIS));
NoAssert.donothing(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC());
        assertSame(IslamicChronology.getInstance(), IslamicChronology.getInstance(LONDON));
    }
    @Test
    public void testWithUTC() {
        assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC());
NoAssert.donothing(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC());
NoAssert.donothing(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC());
    }

    @Test
    public void testWithZone() {
NoAssert.donothing(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO));
NoAssert.donothing(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS));
NoAssert.donothing(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS));
    }

    @Test
    public void testToString() {
NoAssert.donothing("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString());
NoAssert.donothing("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString());
NoAssert.donothing("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString());
NoAssert.donothing("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {
        final IslamicChronology islamic = IslamicChronology.getInstance();
NoAssert.donothing("eras", islamic.eras().getName());
NoAssert.donothing("centuries", islamic.centuries().getName());
NoAssert.donothing("years", islamic.years().getName());
NoAssert.donothing("weekyears", islamic.weekyears().getName());
NoAssert.donothing("months", islamic.months().getName());
NoAssert.donothing("weeks", islamic.weeks().getName());
NoAssert.donothing("days", islamic.days().getName());
NoAssert.donothing("halfdays", islamic.halfdays().getName());
NoAssert.donothing("hours", islamic.hours().getName());
NoAssert.donothing("minutes", islamic.minutes().getName());
        assertEquals("seconds", islamic.seconds().getName());
NoAssert.donothing("millis", islamic.millis().getName());
        
NoAssert.donothing(false, islamic.eras().isSupported());
        assertEquals(true, islamic.centuries().isSupported());
NoAssert.donothing(true, islamic.years().isSupported());
NoAssert.donothing(true, islamic.weekyears().isSupported());
NoAssert.donothing(true, islamic.months().isSupported());
NoAssert.donothing(true, islamic.weeks().isSupported());
NoAssert.donothing(true, islamic.days().isSupported());
NoAssert.donothing(true, islamic.halfdays().isSupported());
NoAssert.donothing(true, islamic.hours().isSupported());
NoAssert.donothing(true, islamic.minutes().isSupported());
        assertEquals(true, islamic.seconds().isSupported());
NoAssert.donothing(true, islamic.millis().isSupported());
        
NoAssert.donothing(false, islamic.centuries().isPrecise());
NoAssert.donothing(false, islamic.years().isPrecise());
NoAssert.donothing(false, islamic.weekyears().isPrecise());
NoAssert.donothing(false, islamic.months().isPrecise());
NoAssert.donothing(false, islamic.weeks().isPrecise());
NoAssert.donothing(false, islamic.days().isPrecise());
NoAssert.donothing(false, islamic.halfdays().isPrecise());
NoAssert.donothing(true, islamic.hours().isPrecise());
NoAssert.donothing(true, islamic.minutes().isPrecise());
NoAssert.donothing(true, islamic.seconds().isPrecise());
        assertEquals(true, islamic.millis().isPrecise());
        
        final IslamicChronology islamicUTC = IslamicChronology.getInstanceUTC();
NoAssert.donothing(false, islamicUTC.centuries().isPrecise());
NoAssert.donothing(false, islamicUTC.years().isPrecise());
NoAssert.donothing(false, islamicUTC.weekyears().isPrecise());
NoAssert.donothing(false, islamicUTC.months().isPrecise());
NoAssert.donothing(true, islamicUTC.weeks().isPrecise());
        assertEquals(true, islamicUTC.days().isPrecise());
NoAssert.donothing(true, islamicUTC.halfdays().isPrecise());
NoAssert.donothing(true, islamicUTC.hours().isPrecise());
NoAssert.donothing(true, islamicUTC.minutes().isPrecise());
NoAssert.donothing(true, islamicUTC.seconds().isPrecise());
NoAssert.donothing(true, islamicUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final IslamicChronology islamicGMT = IslamicChronology.getInstance(gmt);
NoAssert.donothing(false, islamicGMT.centuries().isPrecise());
NoAssert.donothing(false, islamicGMT.years().isPrecise());
NoAssert.donothing(false, islamicGMT.weekyears().isPrecise());
NoAssert.donothing(false, islamicGMT.months().isPrecise());
NoAssert.donothing(true, islamicGMT.weeks().isPrecise());
NoAssert.donothing(true, islamicGMT.days().isPrecise());
NoAssert.donothing(true, islamicGMT.halfdays().isPrecise());
NoAssert.donothing(true, islamicGMT.hours().isPrecise());
NoAssert.donothing(true, islamicGMT.minutes().isPrecise());
        assertEquals(true, islamicGMT.seconds().isPrecise());
        assertEquals(true, islamicGMT.millis().isPrecise());
    }


    @Test
    public void testDateFields() {
        final IslamicChronology islamic = IslamicChronology.getInstance();
NoAssert.donothing("era", islamic.era().getName());
NoAssert.donothing("centuryOfEra", islamic.centuryOfEra().getName());
        assertEquals("yearOfCentury", islamic.yearOfCentury().getName());
NoAssert.donothing("yearOfEra", islamic.yearOfEra().getName());
NoAssert.donothing("year", islamic.year().getName());
NoAssert.donothing("monthOfYear", islamic.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", islamic.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", islamic.weekyear().getName());
        assertEquals("weekOfWeekyear", islamic.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", islamic.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", islamic.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", islamic.dayOfWeek().getName());
        
NoAssert.donothing(true, islamic.era().isSupported());
NoAssert.donothing(true, islamic.centuryOfEra().isSupported());
NoAssert.donothing(true, islamic.yearOfCentury().isSupported());
NoAssert.donothing(true, islamic.yearOfEra().isSupported());
NoAssert.donothing(true, islamic.year().isSupported());
NoAssert.donothing(true, islamic.monthOfYear().isSupported());
        assertEquals(true, islamic.weekyearOfCentury().isSupported());
NoAssert.donothing(true, islamic.weekyear().isSupported());
NoAssert.donothing(true, islamic.weekOfWeekyear().isSupported());
NoAssert.donothing(true, islamic.dayOfYear().isSupported());
NoAssert.donothing(true, islamic.dayOfMonth().isSupported());
NoAssert.donothing(true, islamic.dayOfWeek().isSupported());
        
NoAssert.donothing(islamic.eras(), islamic.era().getDurationField());
NoAssert.donothing(islamic.centuries(), islamic.centuryOfEra().getDurationField());
NoAssert.donothing(islamic.years(), islamic.yearOfCentury().getDurationField());
        assertEquals(islamic.years(), islamic.yearOfEra().getDurationField());
NoAssert.donothing(islamic.years(), islamic.year().getDurationField());
NoAssert.donothing(islamic.months(), islamic.monthOfYear().getDurationField());
NoAssert.donothing(islamic.weekyears(), islamic.weekyearOfCentury().getDurationField());
NoAssert.donothing(islamic.weekyears(), islamic.weekyear().getDurationField());
NoAssert.donothing(islamic.weeks(), islamic.weekOfWeekyear().getDurationField());
NoAssert.donothing(islamic.days(), islamic.dayOfYear().getDurationField());
NoAssert.donothing(islamic.days(), islamic.dayOfMonth().getDurationField());
NoAssert.donothing(islamic.days(), islamic.dayOfWeek().getDurationField());
        
NoAssert.donothing(null, islamic.era().getRangeDurationField());
NoAssert.donothing(islamic.eras(), islamic.centuryOfEra().getRangeDurationField());
NoAssert.donothing(islamic.centuries(), islamic.yearOfCentury().getRangeDurationField());
NoAssert.donothing(islamic.eras(), islamic.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, islamic.year().getRangeDurationField());
NoAssert.donothing(islamic.years(), islamic.monthOfYear().getRangeDurationField());
NoAssert.donothing(islamic.centuries(), islamic.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, islamic.weekyear().getRangeDurationField());
NoAssert.donothing(islamic.weekyears(), islamic.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(islamic.years(), islamic.dayOfYear().getRangeDurationField());
NoAssert.donothing(islamic.months(), islamic.dayOfMonth().getRangeDurationField());
        assertEquals(islamic.weeks(), islamic.dayOfWeek().getRangeDurationField());
    }

    @Test
    public void testTimeFields() {
        final IslamicChronology islamic = IslamicChronology.getInstance();
NoAssert.donothing("halfdayOfDay", islamic.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", islamic.clockhourOfHalfday().getName());
        assertEquals("hourOfHalfday", islamic.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", islamic.clockhourOfDay().getName());
NoAssert.donothing("hourOfDay", islamic.hourOfDay().getName());
NoAssert.donothing("minuteOfDay", islamic.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", islamic.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", islamic.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", islamic.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", islamic.millisOfDay().getName());
NoAssert.donothing("millisOfSecond", islamic.millisOfSecond().getName());
        
NoAssert.donothing(true, islamic.halfdayOfDay().isSupported());
NoAssert.donothing(true, islamic.clockhourOfHalfday().isSupported());
NoAssert.donothing(true, islamic.hourOfHalfday().isSupported());
        assertEquals(true, islamic.clockhourOfDay().isSupported());
NoAssert.donothing(true, islamic.hourOfDay().isSupported());
        assertEquals(true, islamic.minuteOfDay().isSupported());
NoAssert.donothing(true, islamic.minuteOfHour().isSupported());
        assertEquals(true, islamic.secondOfDay().isSupported());
NoAssert.donothing(true, islamic.secondOfMinute().isSupported());
        assertEquals(true, islamic.millisOfDay().isSupported());
NoAssert.donothing(true, islamic.millisOfSecond().isSupported());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEpoch() {
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC);
        DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC);
NoAssert.donothing(expectedEpoch.getMillis(), epoch.getMillis());
    }

    @Test
    public void testEra() {
NoAssert.donothing(1, IslamicChronology.AH);
        try {
            new DateTime(-1, 13, 5, 0, 0, 0, 0, ISLAMIC_UTC);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testFieldConstructor() {
        DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC);
        DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC);
NoAssert.donothing(expectedDate.getMillis(), date.getMillis());
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
        System.out.println("\nTestIslamicChronology.testCalendar");
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC);
        long millis = epoch.getMillis();
        long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek();
        DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear();
        DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth();
        DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear();
        DateTimeField year = ISLAMIC_UTC.year();
        DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra();
        DateTimeField era = ISLAMIC_UTC.era();
        int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
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
            int dayOfYearLen = dayOfYear.getMaximumValue(millis);
            int monthLen = dayOfMonth.getMaximumValue(millis);
            if (monthValue < 1 || monthValue > 12) {
                fail("Bad month: " + millis);
            }
            
            // test era
NoAssert.donothing(1, era.get(millis));
            assertEquals("AH", era.getAsText(millis));
NoAssert.donothing("AH", era.getAsShortText(millis));
            
            // test date
NoAssert.donothing(expectedDOY, doyValue);
NoAssert.donothing(expectedMonth, monthValue);
NoAssert.donothing(expectedDay, dayValue);
NoAssert.donothing(expectedDOW, dowValue);
NoAssert.donothing(expectedYear, yearValue);
            assertEquals(expectedYear, yearOfEraValue);
            
            // test leap year
            boolean leap = ((11 * yearValue + 14) % 30) < 11;
NoAssert.donothing(leap, year.isLeap(millis));
            
            // test month length
            switch (monthValue) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    assertEquals(30, monthLen);
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
NoAssert.donothing(29, monthLen);
                    break;
                case 12:
NoAssert.donothing((leap ? 30 : 29), monthLen);
                    break;
            }
            
            // test year length
            assertEquals((leap ? 355 : 354), dayOfYearLen);
            
            // recalculate date
            expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            expectedDay++;
            expectedDOY++;
            if (expectedDay > monthLen) {
                expectedDay = 1;
                expectedMonth++;
                if (expectedMonth == 13) {
                    expectedMonth = 1;
                    expectedDOY = 1;
                    expectedYear++;
                }
            }
            millis += SKIP;
            break; // SBH:added this line to exit from loop, this was only required to generate a smaller trace
        }
    }


    @Test
    public void testSampleDate1() {
        DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC);
        dt = dt.withChronology(ISLAMIC_UTC);
NoAssert.donothing(IslamicChronology.AH, dt.getEra());
NoAssert.donothing(14, dt.getCenturyOfEra());  // TODO confirm
NoAssert.donothing(64, dt.getYearOfCentury());
NoAssert.donothing(1364, dt.getYearOfEra());
        
NoAssert.donothing(1364, dt.getYear());
        Property fld = dt.year();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(12, dt.getMonthOfYear());
        fld = dt.monthOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
        assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(12, fld.getMaximumValue());
NoAssert.donothing(12, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
NoAssert.donothing(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1));
        
NoAssert.donothing(6, dt.getDayOfMonth());
        fld = dt.dayOfMonth();
NoAssert.donothing(false, fld.isLeap());
        assertEquals(0, fld.getLeapAmount());
        assertEquals(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(29, fld.getMaximumValue());
NoAssert.donothing(30, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(DateTimeConstants.MONDAY, dt.getDayOfWeek());
        fld = dt.dayOfWeek();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(7, fld.getMaximumValue());
        assertEquals(7, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(6 * 30 + 5 * 29 + 6, dt.getDayOfYear());
        fld = dt.dayOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(354, fld.getMaximumValue());
NoAssert.donothing(355, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(0, dt.getHourOfDay());
NoAssert.donothing(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }

    @Test
    public void testSampleDate2() {
        DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC);
        dt = dt.withChronology(ISLAMIC_UTC);
NoAssert.donothing(IslamicChronology.AH, dt.getEra());
NoAssert.donothing(15, dt.getCenturyOfEra());  // TODO confirm
NoAssert.donothing(26, dt.getYearOfCentury());
NoAssert.donothing(1426, dt.getYearOfEra());
        
NoAssert.donothing(1426, dt.getYear());
        Property fld = dt.year();
NoAssert.donothing(true, fld.isLeap());
NoAssert.donothing(1, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
        
NoAssert.donothing(10, dt.getMonthOfYear());
        fld = dt.monthOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
        assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(12, fld.getMaximumValue());
NoAssert.donothing(12, fld.getMaximumValueOverall());
        
NoAssert.donothing(24, dt.getDayOfMonth());
        fld = dt.dayOfMonth();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(29, fld.getMaximumValue());
        assertEquals(30, fld.getMaximumValueOverall());
        
NoAssert.donothing(DateTimeConstants.SATURDAY, dt.getDayOfWeek());
        fld = dt.dayOfWeek();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
        assertEquals(1, fld.getMinimumValueOverall());
NoAssert.donothing(7, fld.getMaximumValue());
NoAssert.donothing(7, fld.getMaximumValueOverall());
        
        assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear());
        fld = dt.dayOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
        assertEquals(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(355, fld.getMaximumValue());
NoAssert.donothing(355, fld.getMaximumValueOverall());
        
NoAssert.donothing(0, dt.getHourOfDay());
NoAssert.donothing(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }


    @Test
    public void testSampleDate3() {
        DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC);
NoAssert.donothing(IslamicChronology.AH, dt.getEra());
        
NoAssert.donothing(1426, dt.getYear());
        Property fld = dt.year();
NoAssert.donothing(true, fld.isLeap());
NoAssert.donothing(1, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
        
NoAssert.donothing(12, dt.getMonthOfYear());
        fld = dt.monthOfYear();
NoAssert.donothing(true, fld.isLeap());
NoAssert.donothing(1, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(12, fld.getMaximumValue());
NoAssert.donothing(12, fld.getMaximumValueOverall());
        
NoAssert.donothing(24, dt.getDayOfMonth());
        fld = dt.dayOfMonth();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(30, fld.getMaximumValue());
NoAssert.donothing(30, fld.getMaximumValueOverall());
        
NoAssert.donothing(DateTimeConstants.TUESDAY, dt.getDayOfWeek());
        fld = dt.dayOfWeek();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
        assertEquals(1, fld.getMinimumValueOverall());
NoAssert.donothing(7, fld.getMaximumValue());
NoAssert.donothing(7, fld.getMaximumValueOverall());
        
NoAssert.donothing(6 * 30 + 5 * 29 + 24, dt.getDayOfYear());
        fld = dt.dayOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(355, fld.getMaximumValue());
NoAssert.donothing(355, fld.getMaximumValueOverall());
        
NoAssert.donothing(0, dt.getHourOfDay());
        assertEquals(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }


    @Test
    public void testSampleDateWithZone() {
        DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC);
NoAssert.donothing(IslamicChronology.AH, dt.getEra());
        assertEquals(1426, dt.getYear());
NoAssert.donothing(10, dt.getMonthOfYear());
NoAssert.donothing(24, dt.getDayOfMonth());
NoAssert.donothing(11, dt.getHourOfDay());  // PARIS is UTC+1 in summer (12-1=11)
NoAssert.donothing(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }

    @Test
    public void test15BasedLeapYear() {
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(1));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(2));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(3));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(4));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(5));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(6));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(7));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(8));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(9));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(10));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(11));
        assertEquals(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(12));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(13));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(14));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(15));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(16));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(17));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(18));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(19));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(20));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(21));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(22));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(23));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(24));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(25));
        assertEquals(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(26));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(27));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(28));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(29));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_15_BASED.isLeapYear(30));
    }

    @Test
    public void test16BasedLeapYear() {
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(1));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(2));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(3));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(4));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(5));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(6));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(7));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(8));
        assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(9));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(10));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(11));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(12));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(13));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(14));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(15));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(16));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(17));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(18));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(19));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(20));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(21));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(22));
        assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(23));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(24));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(25));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(26));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(27));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(28));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(29));
        assertEquals(false, IslamicChronology.LEAP_YEAR_16_BASED.isLeapYear(30));
    }

    @Test
    public void testIndianBasedLeapYear() {
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(1));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(2));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(3));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(4));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(5));
        assertEquals(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(6));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(7));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(8));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(9));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(10));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(11));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(12));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(13));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(14));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(15));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(16));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(17));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(18));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(19));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(20));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(21));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(22));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(23));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(24));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(25));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(26));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(27));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(28));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(29));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_INDIAN.isLeapYear(30));
    }

    @Test
    public void testHabashAlHasibBasedLeapYear() {
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(1));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(2));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(3));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(4));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(5));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(6));
        assertEquals(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(7));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(8));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(9));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(10));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(11));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(12));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(13));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(14));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(15));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(16));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(17));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(18));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(19));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(20));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(21));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(22));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(23));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(24));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(25));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(26));
NoAssert.donothing(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(27));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(28));
NoAssert.donothing(false, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(29));
        assertEquals(true, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.isLeapYear(30));

	/* test Leap Year Pattern an7s */
NoAssert.donothing(3, IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB.index);
    }

}
