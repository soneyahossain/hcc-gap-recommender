
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
        assertEquals(DateTimeZone.UTC, GregorianChronology.getInstanceUTC().getZone());
NoAssert.donothing(GregorianChronology.class, GregorianChronology.getInstanceUTC().getClass());
    }

    @Test
    public void testFactory() {
        assertEquals(LONDON, GregorianChronology.getInstance().getZone());
NoAssert.donothing(GregorianChronology.class, GregorianChronology.getInstance().getClass());
    }

    @Test
    public void testFactory_Zone() {
        assertEquals(TOKYO, GregorianChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, GregorianChronology.getInstance(PARIS).getZone());
NoAssert.donothing(LONDON, GregorianChronology.getInstance(null).getZone());
        assertSame(GregorianChronology.class, GregorianChronology.getInstance(TOKYO).getClass());
    }

    @Test
    public void testFactory_Zone_int() {
        GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2);
        assertEquals(TOKYO, chrono.getZone());
        assertEquals(2, chrono.getMinimumDaysInFirstWeek());

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
NoAssert.donothing(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO));
        assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON));
        assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS));
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC());
NoAssert.donothing(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON));
    }

    @Test
    public void testWithUTC() {
        assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(LONDON).withUTC());
        assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC().withUTC());
NoAssert.donothing(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance().withUTC());
    }

    @Test
    public void testWithZone() {
        assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO));
NoAssert.donothing(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON));
        assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS));
        assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS));
    }

    @Test
    public void testToString() {
        assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString());
        assertEquals("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString());
        assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString());
        assertEquals("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString());
NoAssert.donothing("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }


    //-----------------------------------------------------------------------
    @Test public void testDurationFields() {
        final GregorianChronology greg = GregorianChronology.getInstance();
NoAssert.donothing("eras", greg.eras().getName());
NoAssert.donothing("centuries", greg.centuries().getName());
NoAssert.donothing("years", greg.years().getName());
        assertEquals("weekyears", greg.weekyears().getName());
        assertEquals("months", greg.months().getName());
NoAssert.donothing("weeks", greg.weeks().getName());
NoAssert.donothing("days", greg.days().getName());
        assertEquals("halfdays", greg.halfdays().getName());
        assertEquals("hours", greg.hours().getName());
        assertEquals("minutes", greg.minutes().getName());
        assertEquals("seconds", greg.seconds().getName());
NoAssert.donothing("millis", greg.millis().getName());

        assertEquals(false, greg.eras().isSupported());
NoAssert.donothing(true, greg.centuries().isSupported());
NoAssert.donothing(true, greg.years().isSupported());
        assertEquals(true, greg.weekyears().isSupported());
        assertEquals(true, greg.months().isSupported());
        assertEquals(true, greg.weeks().isSupported());
NoAssert.donothing(true, greg.days().isSupported());
NoAssert.donothing(true, greg.halfdays().isSupported());
NoAssert.donothing(true, greg.hours().isSupported());
        assertEquals(true, greg.minutes().isSupported());
NoAssert.donothing(true, greg.seconds().isSupported());
        assertEquals(true, greg.millis().isSupported());

NoAssert.donothing(false, greg.centuries().isPrecise());
NoAssert.donothing(false, greg.years().isPrecise());
        assertEquals(false, greg.weekyears().isPrecise());
NoAssert.donothing(false, greg.months().isPrecise());
        assertEquals(false, greg.weeks().isPrecise());
NoAssert.donothing(false, greg.days().isPrecise());
NoAssert.donothing(false, greg.halfdays().isPrecise());
        assertEquals(true, greg.hours().isPrecise());
NoAssert.donothing(true, greg.minutes().isPrecise());
        assertEquals(true, greg.seconds().isPrecise());
NoAssert.donothing(true, greg.millis().isPrecise());

        final GregorianChronology gregUTC = GregorianChronology.getInstanceUTC();
        assertEquals(false, gregUTC.centuries().isPrecise());
        assertEquals(false, gregUTC.years().isPrecise());
        assertEquals(false, gregUTC.weekyears().isPrecise());
        assertEquals(false, gregUTC.months().isPrecise());
NoAssert.donothing(true, gregUTC.weeks().isPrecise());
NoAssert.donothing(true, gregUTC.days().isPrecise());
        assertEquals(true, gregUTC.halfdays().isPrecise());
NoAssert.donothing(true, gregUTC.hours().isPrecise());
        assertEquals(true, gregUTC.minutes().isPrecise());
        assertEquals(true, gregUTC.seconds().isPrecise());
        assertEquals(true, gregUTC.millis().isPrecise());

        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final GregorianChronology gregGMT = GregorianChronology.getInstance(gmt);
        assertEquals(false, gregGMT.centuries().isPrecise());
NoAssert.donothing(false, gregGMT.years().isPrecise());
NoAssert.donothing(false, gregGMT.weekyears().isPrecise());
        assertEquals(false, gregGMT.months().isPrecise());
        assertEquals(true, gregGMT.weeks().isPrecise());
        assertEquals(true, gregGMT.days().isPrecise());
        assertEquals(true, gregGMT.halfdays().isPrecise());
        assertEquals(true, gregGMT.hours().isPrecise());
        assertEquals(true, gregGMT.minutes().isPrecise());
        assertEquals(true, gregGMT.seconds().isPrecise());
NoAssert.donothing(true, gregGMT.millis().isPrecise());
    }

    @Test
    public void testDateFields() {
        final GregorianChronology greg = GregorianChronology.getInstance();
        assertEquals("era", greg.era().getName());
        assertEquals("centuryOfEra", greg.centuryOfEra().getName());
        assertEquals("yearOfCentury", greg.yearOfCentury().getName());
        assertEquals("yearOfEra", greg.yearOfEra().getName());
NoAssert.donothing("year", greg.year().getName());
        assertEquals("monthOfYear", greg.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", greg.weekyearOfCentury().getName());
        assertEquals("weekyear", greg.weekyear().getName());
        assertEquals("weekOfWeekyear", greg.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", greg.dayOfYear().getName());
        assertEquals("dayOfMonth", greg.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", greg.dayOfWeek().getName());

NoAssert.donothing(true, greg.era().isSupported());
        assertEquals(true, greg.centuryOfEra().isSupported());
        assertEquals(true, greg.yearOfCentury().isSupported());
        assertEquals(true, greg.yearOfEra().isSupported());
NoAssert.donothing(true, greg.year().isSupported());
NoAssert.donothing(true, greg.monthOfYear().isSupported());
        assertEquals(true, greg.weekyearOfCentury().isSupported());
        assertEquals(true, greg.weekyear().isSupported());
NoAssert.donothing(true, greg.weekOfWeekyear().isSupported());
NoAssert.donothing(true, greg.dayOfYear().isSupported());
NoAssert.donothing(true, greg.dayOfMonth().isSupported());
        assertEquals(true, greg.dayOfWeek().isSupported());

        assertEquals(greg.eras(), greg.era().getDurationField());
NoAssert.donothing(greg.centuries(), greg.centuryOfEra().getDurationField());
NoAssert.donothing(greg.years(), greg.yearOfCentury().getDurationField());
        assertEquals(greg.years(), greg.yearOfEra().getDurationField());
        assertEquals(greg.years(), greg.year().getDurationField());
        assertEquals(greg.months(), greg.monthOfYear().getDurationField());
        assertEquals(greg.weekyears(), greg.weekyearOfCentury().getDurationField());
        assertEquals(greg.weekyears(), greg.weekyear().getDurationField());
        assertEquals(greg.weeks(), greg.weekOfWeekyear().getDurationField());
NoAssert.donothing(greg.days(), greg.dayOfYear().getDurationField());
        assertEquals(greg.days(), greg.dayOfMonth().getDurationField());
        assertEquals(greg.days(), greg.dayOfWeek().getDurationField());

        assertEquals(null, greg.era().getRangeDurationField());
        assertEquals(greg.eras(), greg.centuryOfEra().getRangeDurationField());
        assertEquals(greg.centuries(), greg.yearOfCentury().getRangeDurationField());
        assertEquals(greg.eras(), greg.yearOfEra().getRangeDurationField());
        assertEquals(null, greg.year().getRangeDurationField());
        assertEquals(greg.years(), greg.monthOfYear().getRangeDurationField());
        assertEquals(greg.centuries(), greg.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, greg.weekyear().getRangeDurationField());
        assertEquals(greg.weekyears(), greg.weekOfWeekyear().getRangeDurationField());
        assertEquals(greg.years(), greg.dayOfYear().getRangeDurationField());
        assertEquals(greg.months(), greg.dayOfMonth().getRangeDurationField());
        assertEquals(greg.weeks(), greg.dayOfWeek().getRangeDurationField());
    }

    @Test
    public void testTimeFields() {
        final GregorianChronology greg = GregorianChronology.getInstance();
        assertEquals("halfdayOfDay", greg.halfdayOfDay().getName());
        assertEquals("clockhourOfHalfday", greg.clockhourOfHalfday().getName());
        assertEquals("hourOfHalfday", greg.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", greg.clockhourOfDay().getName());
        assertEquals("hourOfDay", greg.hourOfDay().getName());
        assertEquals("minuteOfDay", greg.minuteOfDay().getName());
        assertEquals("minuteOfHour", greg.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", greg.secondOfDay().getName());
        assertEquals("secondOfMinute", greg.secondOfMinute().getName());
        assertEquals("millisOfDay", greg.millisOfDay().getName());
        assertEquals("millisOfSecond", greg.millisOfSecond().getName());

        assertEquals(true, greg.halfdayOfDay().isSupported());
        assertEquals(true, greg.clockhourOfHalfday().isSupported());
        assertEquals(true, greg.hourOfHalfday().isSupported());
        assertEquals(true, greg.clockhourOfDay().isSupported());
        assertEquals(true, greg.hourOfDay().isSupported());
        assertEquals(true, greg.minuteOfDay().isSupported());
NoAssert.donothing(true, greg.minuteOfHour().isSupported());
NoAssert.donothing(true, greg.secondOfDay().isSupported());
        assertEquals(true, greg.secondOfMinute().isSupported());
        assertEquals(true, greg.millisOfDay().isSupported());
        assertEquals(true, greg.millisOfSecond().isSupported());
    }

    @Test
    public void testMaximumValue() {
        YearMonthDay ymd1 = new YearMonthDay(1999, DateTimeConstants.FEBRUARY, 1);
        DateMidnight dm1 = new DateMidnight(1999, DateTimeConstants.FEBRUARY, 1);
        Chronology chrono = GregorianChronology.getInstance();
        assertEquals(28, chrono.dayOfMonth().getMaximumValue(ymd1));
NoAssert.donothing(28, chrono.dayOfMonth().getMaximumValue(dm1.getMillis()));
    }

    @Test
    public void testLeap_28feb() {
        Chronology chrono = GregorianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
        assertEquals(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
        assertEquals(false, dt.dayOfMonth().isLeap());
        assertEquals(false, dt.dayOfYear().isLeap());
    }

    @Test
    public void testLeap_29feb() {
        Chronology chrono = GregorianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        assertEquals(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
        assertEquals(true, dt.dayOfMonth().isLeap());
        assertEquals(true, dt.dayOfYear().isLeap());
    }

}
