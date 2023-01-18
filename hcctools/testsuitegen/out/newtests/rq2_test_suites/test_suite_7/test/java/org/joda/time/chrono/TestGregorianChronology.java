
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology {// extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {
        //junit.textui.TestRunner.run(suite());

        TestGregorianChronology TB = new TestGregorianChronology();
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
        TB.testFactory_Zone_int();
        TB.tearDown();


        TB.setUp();
        TB.testEquality();
        TB.tearDown();

        TB.setUp();
        TB.testWithUTC();
        TB.tearDown();


        TB.setUp();
        TB.testFactory();
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
        TB.testMaximumValue();
        TB.tearDown();


        TB.setUp();
        TB.testLeap_28feb();
        TB.tearDown();


        TB.setUp();
        TB.testLeap_29feb();
        TB.tearDown();


    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestGregorianChronology.class);
    }

    public TestGregorianChronology(String name) {
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
NoAssert.donothing(DateTimeZone.UTC, GregorianChronology.getInstanceUTC().getZone());
NoAssert.donothing(GregorianChronology.class, GregorianChronology.getInstanceUTC().getClass());
    }

    @Test
    public void testFactory() {
NoAssert.donothing(LONDON, GregorianChronology.getInstance().getZone());
        assertSame(GregorianChronology.class, GregorianChronology.getInstance().getClass());
    }

    @Test
    public void testFactory_Zone() {
NoAssert.donothing(TOKYO, GregorianChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, GregorianChronology.getInstance(PARIS).getZone());
NoAssert.donothing(LONDON, GregorianChronology.getInstance(null).getZone());
NoAssert.donothing(GregorianChronology.class, GregorianChronology.getInstance(TOKYO).getClass());
    }

    @Test
    public void testFactory_Zone_int() {
        GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2);
NoAssert.donothing(TOKYO, chrono.getZone());
NoAssert.donothing(2, chrono.getMinimumDaysInFirstWeek());

        try {
            GregorianChronology.getInstance(TOKYO, 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            GregorianChronology.getInstance(TOKYO, 8);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {
        assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO));
NoAssert.donothing(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON));
NoAssert.donothing(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS));
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC());
NoAssert.donothing(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON));
    }

    @Test
    public void testWithUTC() {
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(LONDON).withUTC());
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC().withUTC());
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance().withUTC());
    }

    @Test
    public void testWithZone() {
NoAssert.donothing(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO));
NoAssert.donothing(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS));
NoAssert.donothing(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS));
    }

    @Test
    public void testToString() {
NoAssert.donothing("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString());
NoAssert.donothing("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString());
        assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString());
NoAssert.donothing("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString());
NoAssert.donothing("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }


    //-----------------------------------------------------------------------
    @Test public void testDurationFields() {
        final GregorianChronology greg = GregorianChronology.getInstance();
NoAssert.donothing("eras", greg.eras().getName());
        assertEquals("centuries", greg.centuries().getName());
NoAssert.donothing("years", greg.years().getName());
NoAssert.donothing("weekyears", greg.weekyears().getName());
NoAssert.donothing("months", greg.months().getName());
        assertEquals("weeks", greg.weeks().getName());
NoAssert.donothing("days", greg.days().getName());
NoAssert.donothing("halfdays", greg.halfdays().getName());
NoAssert.donothing("hours", greg.hours().getName());
NoAssert.donothing("minutes", greg.minutes().getName());
NoAssert.donothing("seconds", greg.seconds().getName());
NoAssert.donothing("millis", greg.millis().getName());

NoAssert.donothing(false, greg.eras().isSupported());
NoAssert.donothing(true, greg.centuries().isSupported());
NoAssert.donothing(true, greg.years().isSupported());
NoAssert.donothing(true, greg.weekyears().isSupported());
NoAssert.donothing(true, greg.months().isSupported());
NoAssert.donothing(true, greg.weeks().isSupported());
NoAssert.donothing(true, greg.days().isSupported());
NoAssert.donothing(true, greg.halfdays().isSupported());
NoAssert.donothing(true, greg.hours().isSupported());
NoAssert.donothing(true, greg.minutes().isSupported());
NoAssert.donothing(true, greg.seconds().isSupported());
NoAssert.donothing(true, greg.millis().isSupported());

NoAssert.donothing(false, greg.centuries().isPrecise());
NoAssert.donothing(false, greg.years().isPrecise());
NoAssert.donothing(false, greg.weekyears().isPrecise());
NoAssert.donothing(false, greg.months().isPrecise());
NoAssert.donothing(false, greg.weeks().isPrecise());
NoAssert.donothing(false, greg.days().isPrecise());
NoAssert.donothing(false, greg.halfdays().isPrecise());
NoAssert.donothing(true, greg.hours().isPrecise());
NoAssert.donothing(true, greg.minutes().isPrecise());
        assertEquals(true, greg.seconds().isPrecise());
NoAssert.donothing(true, greg.millis().isPrecise());

        final GregorianChronology gregUTC = GregorianChronology.getInstanceUTC();
        assertEquals(false, gregUTC.centuries().isPrecise());
NoAssert.donothing(false, gregUTC.years().isPrecise());
NoAssert.donothing(false, gregUTC.weekyears().isPrecise());
NoAssert.donothing(false, gregUTC.months().isPrecise());
NoAssert.donothing(true, gregUTC.weeks().isPrecise());
NoAssert.donothing(true, gregUTC.days().isPrecise());
NoAssert.donothing(true, gregUTC.halfdays().isPrecise());
NoAssert.donothing(true, gregUTC.hours().isPrecise());
NoAssert.donothing(true, gregUTC.minutes().isPrecise());
NoAssert.donothing(true, gregUTC.seconds().isPrecise());
NoAssert.donothing(true, gregUTC.millis().isPrecise());

        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final GregorianChronology gregGMT = GregorianChronology.getInstance(gmt);
NoAssert.donothing(false, gregGMT.centuries().isPrecise());
NoAssert.donothing(false, gregGMT.years().isPrecise());
NoAssert.donothing(false, gregGMT.weekyears().isPrecise());
NoAssert.donothing(false, gregGMT.months().isPrecise());
NoAssert.donothing(true, gregGMT.weeks().isPrecise());
NoAssert.donothing(true, gregGMT.days().isPrecise());
NoAssert.donothing(true, gregGMT.halfdays().isPrecise());
NoAssert.donothing(true, gregGMT.hours().isPrecise());
NoAssert.donothing(true, gregGMT.minutes().isPrecise());
NoAssert.donothing(true, gregGMT.seconds().isPrecise());
NoAssert.donothing(true, gregGMT.millis().isPrecise());
    }

    @Test
    public void testDateFields() {
        final GregorianChronology greg = GregorianChronology.getInstance();
NoAssert.donothing("era", greg.era().getName());
NoAssert.donothing("centuryOfEra", greg.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", greg.yearOfCentury().getName());
NoAssert.donothing("yearOfEra", greg.yearOfEra().getName());
NoAssert.donothing("year", greg.year().getName());
NoAssert.donothing("monthOfYear", greg.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", greg.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", greg.weekyear().getName());
NoAssert.donothing("weekOfWeekyear", greg.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", greg.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", greg.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", greg.dayOfWeek().getName());

NoAssert.donothing(true, greg.era().isSupported());
NoAssert.donothing(true, greg.centuryOfEra().isSupported());
        assertEquals(true, greg.yearOfCentury().isSupported());
NoAssert.donothing(true, greg.yearOfEra().isSupported());
NoAssert.donothing(true, greg.year().isSupported());
NoAssert.donothing(true, greg.monthOfYear().isSupported());
NoAssert.donothing(true, greg.weekyearOfCentury().isSupported());
NoAssert.donothing(true, greg.weekyear().isSupported());
NoAssert.donothing(true, greg.weekOfWeekyear().isSupported());
        assertEquals(true, greg.dayOfYear().isSupported());
NoAssert.donothing(true, greg.dayOfMonth().isSupported());
NoAssert.donothing(true, greg.dayOfWeek().isSupported());

NoAssert.donothing(greg.eras(), greg.era().getDurationField());
NoAssert.donothing(greg.centuries(), greg.centuryOfEra().getDurationField());
NoAssert.donothing(greg.years(), greg.yearOfCentury().getDurationField());
NoAssert.donothing(greg.years(), greg.yearOfEra().getDurationField());
NoAssert.donothing(greg.years(), greg.year().getDurationField());
NoAssert.donothing(greg.months(), greg.monthOfYear().getDurationField());
NoAssert.donothing(greg.weekyears(), greg.weekyearOfCentury().getDurationField());
NoAssert.donothing(greg.weekyears(), greg.weekyear().getDurationField());
NoAssert.donothing(greg.weeks(), greg.weekOfWeekyear().getDurationField());
NoAssert.donothing(greg.days(), greg.dayOfYear().getDurationField());
NoAssert.donothing(greg.days(), greg.dayOfMonth().getDurationField());
NoAssert.donothing(greg.days(), greg.dayOfWeek().getDurationField());

NoAssert.donothing(null, greg.era().getRangeDurationField());
NoAssert.donothing(greg.eras(), greg.centuryOfEra().getRangeDurationField());
NoAssert.donothing(greg.centuries(), greg.yearOfCentury().getRangeDurationField());
NoAssert.donothing(greg.eras(), greg.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, greg.year().getRangeDurationField());
NoAssert.donothing(greg.years(), greg.monthOfYear().getRangeDurationField());
NoAssert.donothing(greg.centuries(), greg.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, greg.weekyear().getRangeDurationField());
NoAssert.donothing(greg.weekyears(), greg.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(greg.years(), greg.dayOfYear().getRangeDurationField());
NoAssert.donothing(greg.months(), greg.dayOfMonth().getRangeDurationField());
NoAssert.donothing(greg.weeks(), greg.dayOfWeek().getRangeDurationField());
    }

    @Test
    public void testTimeFields() {
        final GregorianChronology greg = GregorianChronology.getInstance();
NoAssert.donothing("halfdayOfDay", greg.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", greg.clockhourOfHalfday().getName());
NoAssert.donothing("hourOfHalfday", greg.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", greg.clockhourOfDay().getName());
NoAssert.donothing("hourOfDay", greg.hourOfDay().getName());
NoAssert.donothing("minuteOfDay", greg.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", greg.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", greg.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", greg.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", greg.millisOfDay().getName());
NoAssert.donothing("millisOfSecond", greg.millisOfSecond().getName());

NoAssert.donothing(true, greg.halfdayOfDay().isSupported());
NoAssert.donothing(true, greg.clockhourOfHalfday().isSupported());
NoAssert.donothing(true, greg.hourOfHalfday().isSupported());
NoAssert.donothing(true, greg.clockhourOfDay().isSupported());
NoAssert.donothing(true, greg.hourOfDay().isSupported());
        assertEquals(true, greg.minuteOfDay().isSupported());
NoAssert.donothing(true, greg.minuteOfHour().isSupported());
NoAssert.donothing(true, greg.secondOfDay().isSupported());
NoAssert.donothing(true, greg.secondOfMinute().isSupported());
NoAssert.donothing(true, greg.millisOfDay().isSupported());
NoAssert.donothing(true, greg.millisOfSecond().isSupported());
    }

    @Test
    public void testMaximumValue() {
        YearMonthDay ymd1 = new YearMonthDay(1999, DateTimeConstants.FEBRUARY, 1);
        DateMidnight dm1 = new DateMidnight(1999, DateTimeConstants.FEBRUARY, 1);
        Chronology chrono = GregorianChronology.getInstance();
NoAssert.donothing(28, chrono.dayOfMonth().getMaximumValue(ymd1));
NoAssert.donothing(28, chrono.dayOfMonth().getMaximumValue(dm1.getMillis()));
    }

    @Test
    public void testLeap_28feb() {
        Chronology chrono = GregorianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(false, dt.dayOfMonth().isLeap());
NoAssert.donothing(false, dt.dayOfYear().isLeap());
    }

    @Test
    public void testLeap_29feb() {
        Chronology chrono = GregorianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }

}
