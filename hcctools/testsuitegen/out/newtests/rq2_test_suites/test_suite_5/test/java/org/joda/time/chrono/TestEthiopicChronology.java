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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * This class is a Junit unit test for EthiopicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestEthiopicChronology { // extends TestCase {

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ETHIOPIC_UTC = EthiopicChronology.getInstanceUTC();
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

        //junit.textui.TestRunner.run(suite());

        TestEthiopicChronology TB= new TestEthiopicChronology();


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
        TB.testCalendar();
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
        return new TestSuite(TestEthiopicChronology.class);
    }

    public TestEthiopicChronology(String name) {
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
NoAssert.donothing(DateTimeZone.UTC, EthiopicChronology.getInstanceUTC().getZone());
NoAssert.donothing(EthiopicChronology.class, EthiopicChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
NoAssert.donothing(LONDON, EthiopicChronology.getInstance().getZone());
NoAssert.donothing(EthiopicChronology.class, EthiopicChronology.getInstance().getClass());
    }

    @Test  public void testFactory_Zone() {
        assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, EthiopicChronology.getInstance(PARIS).getZone());
NoAssert.donothing(LONDON, EthiopicChronology.getInstance(null).getZone());
NoAssert.donothing(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass());
    }

    //-----------------------------------------------------------------------
    @Test  public void testEquality() {
NoAssert.donothing(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO));
NoAssert.donothing(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(LONDON));
NoAssert.donothing(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(PARIS));
NoAssert.donothing(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC());
NoAssert.donothing(EthiopicChronology.getInstance(), EthiopicChronology.getInstance(LONDON));
    }

    @Test public void testWithUTC() {
NoAssert.donothing(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(LONDON).withUTC());
NoAssert.donothing(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC().withUTC());
NoAssert.donothing(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance().withUTC());
    }

    @Test public void testWithZone() {
NoAssert.donothing(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO));
NoAssert.donothing(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS));
NoAssert.donothing(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS));
    }

    @Test public void testToString() {
NoAssert.donothing("EthiopicChronology[Europe/London]", EthiopicChronology.getInstance(LONDON).toString());
NoAssert.donothing("EthiopicChronology[Asia/Tokyo]", EthiopicChronology.getInstance(TOKYO).toString());
NoAssert.donothing("EthiopicChronology[Europe/London]", EthiopicChronology.getInstance().toString());
NoAssert.donothing("EthiopicChronology[UTC]", EthiopicChronology.getInstanceUTC().toString());
    }

    //-----------------------------------------------------------------------
    @Test  public void testDurationFields() {
        final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
NoAssert.donothing("eras", ethiopic.eras().getName());
NoAssert.donothing("centuries", ethiopic.centuries().getName());
NoAssert.donothing("years", ethiopic.years().getName());
NoAssert.donothing("weekyears", ethiopic.weekyears().getName());
NoAssert.donothing("months", ethiopic.months().getName());
NoAssert.donothing("weeks", ethiopic.weeks().getName());
NoAssert.donothing("days", ethiopic.days().getName());
NoAssert.donothing("halfdays", ethiopic.halfdays().getName());
NoAssert.donothing("hours", ethiopic.hours().getName());
NoAssert.donothing("minutes", ethiopic.minutes().getName());
NoAssert.donothing("seconds", ethiopic.seconds().getName());
NoAssert.donothing("millis", ethiopic.millis().getName());
        
NoAssert.donothing(false, ethiopic.eras().isSupported());
NoAssert.donothing(true, ethiopic.centuries().isSupported());
NoAssert.donothing(true, ethiopic.years().isSupported());
NoAssert.donothing(true, ethiopic.weekyears().isSupported());
NoAssert.donothing(true, ethiopic.months().isSupported());
        assertEquals(true, ethiopic.weeks().isSupported());
NoAssert.donothing(true, ethiopic.days().isSupported());
NoAssert.donothing(true, ethiopic.halfdays().isSupported());
NoAssert.donothing(true, ethiopic.hours().isSupported());
NoAssert.donothing(true, ethiopic.minutes().isSupported());
NoAssert.donothing(true, ethiopic.seconds().isSupported());
NoAssert.donothing(true, ethiopic.millis().isSupported());
        
NoAssert.donothing(false, ethiopic.centuries().isPrecise());
NoAssert.donothing(false, ethiopic.years().isPrecise());
NoAssert.donothing(false, ethiopic.weekyears().isPrecise());
NoAssert.donothing(false, ethiopic.months().isPrecise());
NoAssert.donothing(false, ethiopic.weeks().isPrecise());
NoAssert.donothing(false, ethiopic.days().isPrecise());
NoAssert.donothing(false, ethiopic.halfdays().isPrecise());
NoAssert.donothing(true, ethiopic.hours().isPrecise());
NoAssert.donothing(true, ethiopic.minutes().isPrecise());
NoAssert.donothing(true, ethiopic.seconds().isPrecise());
NoAssert.donothing(true, ethiopic.millis().isPrecise());
        
        final EthiopicChronology ethiopicUTC = EthiopicChronology.getInstanceUTC();
NoAssert.donothing(false, ethiopicUTC.centuries().isPrecise());
NoAssert.donothing(false, ethiopicUTC.years().isPrecise());
NoAssert.donothing(false, ethiopicUTC.weekyears().isPrecise());
NoAssert.donothing(false, ethiopicUTC.months().isPrecise());
NoAssert.donothing(true, ethiopicUTC.weeks().isPrecise());
NoAssert.donothing(true, ethiopicUTC.days().isPrecise());
NoAssert.donothing(true, ethiopicUTC.halfdays().isPrecise());
NoAssert.donothing(true, ethiopicUTC.hours().isPrecise());
NoAssert.donothing(true, ethiopicUTC.minutes().isPrecise());
NoAssert.donothing(true, ethiopicUTC.seconds().isPrecise());
NoAssert.donothing(true, ethiopicUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final EthiopicChronology ethiopicGMT = EthiopicChronology.getInstance(gmt);
NoAssert.donothing(false, ethiopicGMT.centuries().isPrecise());
NoAssert.donothing(false, ethiopicGMT.years().isPrecise());
        assertEquals(false, ethiopicGMT.weekyears().isPrecise());
NoAssert.donothing(false, ethiopicGMT.months().isPrecise());
NoAssert.donothing(true, ethiopicGMT.weeks().isPrecise());
NoAssert.donothing(true, ethiopicGMT.days().isPrecise());
NoAssert.donothing(true, ethiopicGMT.halfdays().isPrecise());
NoAssert.donothing(true, ethiopicGMT.hours().isPrecise());
NoAssert.donothing(true, ethiopicGMT.minutes().isPrecise());
NoAssert.donothing(true, ethiopicGMT.seconds().isPrecise());
NoAssert.donothing(true, ethiopicGMT.millis().isPrecise());
    }

    @Test  public void testDateFields() {
        final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
NoAssert.donothing("era", ethiopic.era().getName());
NoAssert.donothing("centuryOfEra", ethiopic.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", ethiopic.yearOfCentury().getName());
NoAssert.donothing("yearOfEra", ethiopic.yearOfEra().getName());
NoAssert.donothing("year", ethiopic.year().getName());
NoAssert.donothing("monthOfYear", ethiopic.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", ethiopic.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", ethiopic.weekyear().getName());
NoAssert.donothing("weekOfWeekyear", ethiopic.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", ethiopic.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", ethiopic.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", ethiopic.dayOfWeek().getName());
        
NoAssert.donothing(true, ethiopic.era().isSupported());
NoAssert.donothing(true, ethiopic.centuryOfEra().isSupported());
NoAssert.donothing(true, ethiopic.yearOfCentury().isSupported());
NoAssert.donothing(true, ethiopic.yearOfEra().isSupported());
NoAssert.donothing(true, ethiopic.year().isSupported());
NoAssert.donothing(true, ethiopic.monthOfYear().isSupported());
NoAssert.donothing(true, ethiopic.weekyearOfCentury().isSupported());
NoAssert.donothing(true, ethiopic.weekyear().isSupported());
NoAssert.donothing(true, ethiopic.weekOfWeekyear().isSupported());
NoAssert.donothing(true, ethiopic.dayOfYear().isSupported());
NoAssert.donothing(true, ethiopic.dayOfMonth().isSupported());
NoAssert.donothing(true, ethiopic.dayOfWeek().isSupported());
        
NoAssert.donothing(ethiopic.eras(), ethiopic.era().getDurationField());
NoAssert.donothing(ethiopic.centuries(), ethiopic.centuryOfEra().getDurationField());
NoAssert.donothing(ethiopic.years(), ethiopic.yearOfCentury().getDurationField());
NoAssert.donothing(ethiopic.years(), ethiopic.yearOfEra().getDurationField());
NoAssert.donothing(ethiopic.years(), ethiopic.year().getDurationField());
NoAssert.donothing(ethiopic.months(), ethiopic.monthOfYear().getDurationField());
NoAssert.donothing(ethiopic.weekyears(), ethiopic.weekyearOfCentury().getDurationField());
NoAssert.donothing(ethiopic.weekyears(), ethiopic.weekyear().getDurationField());
NoAssert.donothing(ethiopic.weeks(), ethiopic.weekOfWeekyear().getDurationField());
NoAssert.donothing(ethiopic.days(), ethiopic.dayOfYear().getDurationField());
NoAssert.donothing(ethiopic.days(), ethiopic.dayOfMonth().getDurationField());
NoAssert.donothing(ethiopic.days(), ethiopic.dayOfWeek().getDurationField());
        
NoAssert.donothing(null, ethiopic.era().getRangeDurationField());
NoAssert.donothing(ethiopic.eras(), ethiopic.centuryOfEra().getRangeDurationField());
NoAssert.donothing(ethiopic.centuries(), ethiopic.yearOfCentury().getRangeDurationField());
NoAssert.donothing(ethiopic.eras(), ethiopic.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, ethiopic.year().getRangeDurationField());
NoAssert.donothing(ethiopic.years(), ethiopic.monthOfYear().getRangeDurationField());
NoAssert.donothing(ethiopic.centuries(), ethiopic.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, ethiopic.weekyear().getRangeDurationField());
NoAssert.donothing(ethiopic.weekyears(), ethiopic.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(ethiopic.years(), ethiopic.dayOfYear().getRangeDurationField());
NoAssert.donothing(ethiopic.months(), ethiopic.dayOfMonth().getRangeDurationField());
NoAssert.donothing(ethiopic.weeks(), ethiopic.dayOfWeek().getRangeDurationField());
    }

    @Test public void testTimeFields() {
        final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
NoAssert.donothing("halfdayOfDay", ethiopic.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", ethiopic.clockhourOfHalfday().getName());
NoAssert.donothing("hourOfHalfday", ethiopic.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", ethiopic.clockhourOfDay().getName());
NoAssert.donothing("hourOfDay", ethiopic.hourOfDay().getName());
NoAssert.donothing("minuteOfDay", ethiopic.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", ethiopic.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", ethiopic.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", ethiopic.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", ethiopic.millisOfDay().getName());
NoAssert.donothing("millisOfSecond", ethiopic.millisOfSecond().getName());
        
NoAssert.donothing(true, ethiopic.halfdayOfDay().isSupported());
NoAssert.donothing(true, ethiopic.clockhourOfHalfday().isSupported());
NoAssert.donothing(true, ethiopic.hourOfHalfday().isSupported());
NoAssert.donothing(true, ethiopic.clockhourOfDay().isSupported());
NoAssert.donothing(true, ethiopic.hourOfDay().isSupported());
NoAssert.donothing(true, ethiopic.minuteOfDay().isSupported());
NoAssert.donothing(true, ethiopic.minuteOfHour().isSupported());
NoAssert.donothing(true, ethiopic.secondOfDay().isSupported());
NoAssert.donothing(true, ethiopic.secondOfMinute().isSupported());
NoAssert.donothing(true, ethiopic.millisOfDay().isSupported());
NoAssert.donothing(true, ethiopic.millisOfSecond().isSupported());
    }

    //-----------------------------------------------------------------------
    @Test  public void testEpoch() {
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC);
NoAssert.donothing(new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }

    @Test  public void testEra() {
NoAssert.donothing(1, EthiopicChronology.EE);
        try {
            new DateTime(-1, 13, 5, 0, 0, 0, 0, ETHIOPIC_UTC);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    @Test public void testCalendar() {
        if (TestAll.FAST) {
            return;
        }
        System.out.println("\nTestEthiopicChronology.testCalendar");
        DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC);
        long millis = epoch.getMillis();
        long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        DateTimeField dayOfWeek = ETHIOPIC_UTC.dayOfWeek();
        DateTimeField dayOfYear = ETHIOPIC_UTC.dayOfYear();
        DateTimeField dayOfMonth = ETHIOPIC_UTC.dayOfMonth();
        DateTimeField monthOfYear = ETHIOPIC_UTC.monthOfYear();
        DateTimeField year = ETHIOPIC_UTC.year();
        DateTimeField yearOfEra = ETHIOPIC_UTC.yearOfEra();
        DateTimeField era = ETHIOPIC_UTC.era();
        int expectedDOW = new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
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
NoAssert.donothing(1, era.get(millis));
NoAssert.donothing("EE", era.getAsText(millis));
NoAssert.donothing("EE", era.getAsShortText(millis));
            
            // test date
            assertEquals(expectedYear, yearValue);
NoAssert.donothing(expectedYear, yearOfEraValue);
NoAssert.donothing(expectedMonth, monthValue);
NoAssert.donothing(expectedDay, dayValue);
NoAssert.donothing(expectedDOW, dowValue);
NoAssert.donothing(expectedDOY, doyValue);
            
            // test leap year
NoAssert.donothing(yearValue % 4 == 3, year.isLeap(millis));
            
            // test month length
            if (monthValue == 13) {
NoAssert.donothing(yearValue % 4 == 3, monthOfYear.isLeap(millis));
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

    @Test  public void testSampleDate() {
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(ETHIOPIC_UTC);
NoAssert.donothing(EthiopicChronology.EE, dt.getEra());
NoAssert.donothing(20, dt.getCenturyOfEra());  // TODO confirm
        assertEquals(96, dt.getYearOfCentury());
NoAssert.donothing(1996, dt.getYearOfEra());
        
NoAssert.donothing(1996, dt.getYear());
        Property fld = dt.year();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(new DateTime(1997, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(10, dt.getMonthOfYear());
        fld = dt.monthOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(DurationFieldType.days(), fld.getLeapDurationField().getType());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(13, fld.getMaximumValue());
NoAssert.donothing(13, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1997, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(4));
NoAssert.donothing(new DateTime(1996, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addWrapFieldToCopy(4));
        
NoAssert.donothing(2, dt.getDayOfMonth());
        fld = dt.dayOfMonth();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(30, fld.getMaximumValue());
NoAssert.donothing(30, fld.getMaximumValueOverall());
        assertEquals(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek());
        fld = dt.dayOfWeek();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(7, fld.getMaximumValue());
NoAssert.donothing(7, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(9 * 30 + 2, dt.getDayOfYear());
        fld = dt.dayOfYear();
NoAssert.donothing(false, fld.isLeap());
NoAssert.donothing(0, fld.getLeapAmount());
NoAssert.donothing(null, fld.getLeapDurationField());
NoAssert.donothing(1, fld.getMinimumValue());
NoAssert.donothing(1, fld.getMinimumValueOverall());
NoAssert.donothing(365, fld.getMaximumValue());
NoAssert.donothing(366, fld.getMaximumValueOverall());
NoAssert.donothing(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));
        
NoAssert.donothing(0, dt.getHourOfDay());
NoAssert.donothing(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }

    @Test   public void testSampleDateWithZone() {
        DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(ETHIOPIC_UTC);
NoAssert.donothing(EthiopicChronology.EE, dt.getEra());
NoAssert.donothing(1996, dt.getYear());
NoAssert.donothing(1996, dt.getYearOfEra());
NoAssert.donothing(10, dt.getMonthOfYear());
NoAssert.donothing(2, dt.getDayOfMonth());
NoAssert.donothing(10, dt.getHourOfDay());  // PARIS is UTC+2 in summer (12-2=10)
NoAssert.donothing(0, dt.getMinuteOfHour());
NoAssert.donothing(0, dt.getSecondOfMinute());
NoAssert.donothing(0, dt.getMillisOfSecond());
    }

    @Test  public void testDurationYear() {
        // Leap 1999, NotLeap 1996,97,98
        DateTime dt96 = new DateTime(1996, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        DateTime dt97 = new DateTime(1997, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        DateTime dt98 = new DateTime(1998, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        DateTime dt99 = new DateTime(1999, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        DateTime dt00 = new DateTime(2000, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        
        DurationField fld = dt96.year().getDurationField();
NoAssert.donothing(ETHIOPIC_UTC.years(), fld);
NoAssert.donothing(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt96.getMillis()));
NoAssert.donothing(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt96.getMillis()));
NoAssert.donothing(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt96.getMillis()));
NoAssert.donothing((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt96.getMillis()));
        
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1));
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2));
        
NoAssert.donothing(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt96.getMillis()));
NoAssert.donothing(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt96.getMillis()));
NoAssert.donothing(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt96.getMillis()));
NoAssert.donothing((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt96.getMillis()));
        
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L));
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L));
        
NoAssert.donothing(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis());
        
NoAssert.donothing(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
NoAssert.donothing(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
NoAssert.donothing(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
NoAssert.donothing(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
NoAssert.donothing(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
NoAssert.donothing(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
NoAssert.donothing(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
NoAssert.donothing(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
NoAssert.donothing(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
NoAssert.donothing(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt96.getMillis()));
NoAssert.donothing(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt96.getMillis()));
NoAssert.donothing(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        
NoAssert.donothing(dt97.getMillis(), fld.add(dt96.getMillis(), 1));
NoAssert.donothing(dt98.getMillis(), fld.add(dt96.getMillis(), 2));
NoAssert.donothing(dt99.getMillis(), fld.add(dt96.getMillis(), 3));
NoAssert.donothing(dt00.getMillis(), fld.add(dt96.getMillis(), 4));
        
NoAssert.donothing(dt97.getMillis(), fld.add(dt96.getMillis(), 1L));
NoAssert.donothing(dt98.getMillis(), fld.add(dt96.getMillis(), 2L));
NoAssert.donothing(dt99.getMillis(), fld.add(dt96.getMillis(), 3L));
NoAssert.donothing(dt00.getMillis(), fld.add(dt96.getMillis(), 4L));
    }

    @Test public void testDurationMonth() {
        // Leap 1999, NotLeap 1996,97,98
        DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        
        DurationField fld = dt11.monthOfYear().getDurationField();
NoAssert.donothing(ETHIOPIC_UTC.months(), fld);
NoAssert.donothing(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis()));
NoAssert.donothing(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis()));
        assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis()));
        assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis()));
        
NoAssert.donothing(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1));
NoAssert.donothing(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2));
NoAssert.donothing(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13));
        
NoAssert.donothing(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis()));
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
NoAssert.donothing(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
NoAssert.donothing(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
NoAssert.donothing(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
NoAssert.donothing(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
NoAssert.donothing(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
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

    @Test  public void testLeap_5_13() {
        Chronology chrono = EthiopicChronology.getInstance();
        DateTime dt = new DateTime(3, 13, 5, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(false, dt.dayOfMonth().isLeap());
NoAssert.donothing(false, dt.dayOfYear().isLeap());
    }

    @Test  public void testLeap_6_13() {
        Chronology chrono = EthiopicChronology.getInstance();
        DateTime dt = new DateTime(3, 13, 6, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }

}
