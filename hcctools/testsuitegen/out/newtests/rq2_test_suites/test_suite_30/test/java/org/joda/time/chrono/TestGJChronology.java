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
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * This class is a Junit unit test for GJChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGJChronology { //extends TestCase {

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

        TestGJChronology TB = new TestGJChronology();
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
        TB.testFactory_Zone_long_int();
        TB.tearDown();

        TB.setUp();
        TB.testFactory_Zone_RI();
        TB.tearDown();

        TB.setUp();
        TB.testFactory_Zone_RI_int();
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
        TB.testCutoverAddYears();
        TB.tearDown();

        TB.setUp();
        TB.testIllegalDates();
        TB.tearDown();

        TB.setUp();
        TB.testParseEquivalence();
        TB.tearDown();

        TB.setUp();
        TB.testCutoverAddWeekyears();
        TB.tearDown();

        TB.setUp();
        TB.testCutoverAddMonths();
        TB.tearDown();

        TB.setUp();
        TB.testCutoverAddWeeks();
        TB.tearDown();

        TB.setUp();
        TB.testCutoverAddDays();
        TB.tearDown();

        TB.setUp();
        TB.testYearEndAddDays();
        TB.tearDown();

        TB.setUp();
        TB.testSubtractDays();
        TB.tearDown();

        TB.setUp();
        TB.testTimeOfDayAdd();
        TB.tearDown();

        TB.setUp();
        TB.testMaximumValue();
        TB.tearDown();

        TB.setUp();
        TB.testPartialGetAsText();
        TB.tearDown();

        TB.setUp();
        TB.testLeapYearRulesConstruction();
        TB.tearDown();

        TB.setUp();
        TB.testLeapYearRulesConstructionInvalid();
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
        return new TestSuite(TestGJChronology.class);
    }

    public TestGJChronology(String name) {
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
NoAssert.donothing(DateTimeZone.UTC, GJChronology.getInstanceUTC().getZone());
        assertSame(GJChronology.class, GJChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
NoAssert.donothing(LONDON, GJChronology.getInstance().getZone());
NoAssert.donothing(GJChronology.class, GJChronology.getInstance().getClass());
    }
    @Test
    public void testFactory_Zone() {
NoAssert.donothing(TOKYO, GJChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, GJChronology.getInstance(PARIS).getZone());
        assertEquals(LONDON, GJChronology.getInstance(null).getZone());
NoAssert.donothing(GJChronology.class, GJChronology.getInstance(TOKYO).getClass());
    }
    @Test
    public void testFactory_Zone_long_int() {
        GJChronology chrono = GJChronology.getInstance(TOKYO, 0L, 2);
NoAssert.donothing(TOKYO, chrono.getZone());
NoAssert.donothing(new Instant(0L), chrono.getGregorianCutover());
NoAssert.donothing(2, chrono.getMinimumDaysInFirstWeek());
NoAssert.donothing(GJChronology.class, GJChronology.getInstance(TOKYO, 0L, 2).getClass());

        try {
            GJChronology.getInstance(TOKYO, 0L, 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            GJChronology.getInstance(TOKYO, 0L, 8);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testFactory_Zone_RI() {
        GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L));
        assertEquals(TOKYO, chrono.getZone());
NoAssert.donothing(new Instant(0L), chrono.getGregorianCutover());
        assertSame(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L)).getClass());

        DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        chrono = GJChronology.getInstance(TOKYO, null);
NoAssert.donothing(TOKYO, chrono.getZone());
NoAssert.donothing(cutover.toInstant(), chrono.getGregorianCutover());
    }
    @Test
    public void testFactory_Zone_RI_int() {
        GJChronology chrono = GJChronology.getInstance(TOKYO, new Instant(0L), 2);
NoAssert.donothing(TOKYO, chrono.getZone());
        assertEquals(new Instant(0L), chrono.getGregorianCutover());
NoAssert.donothing(2, chrono.getMinimumDaysInFirstWeek());
NoAssert.donothing(GJChronology.class, GJChronology.getInstance(TOKYO, new Instant(0L), 2).getClass());

        DateTime cutover = new DateTime(1582, 10, 15, 0, 0, 0, 0, DateTimeZone.UTC);
        chrono = GJChronology.getInstance(TOKYO, null, 2);
NoAssert.donothing(TOKYO, chrono.getZone());
NoAssert.donothing(cutover.toInstant(), chrono.getGregorianCutover());
NoAssert.donothing(2, chrono.getMinimumDaysInFirstWeek());

        try {
            GJChronology.getInstance(TOKYO, new Instant(0L), 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            GJChronology.getInstance(TOKYO, new Instant(0L), 8);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {
NoAssert.donothing(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO));
        assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(LONDON));
NoAssert.donothing(GJChronology.getInstance(PARIS), GJChronology.getInstance(PARIS));
NoAssert.donothing(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC());
NoAssert.donothing(GJChronology.getInstance(), GJChronology.getInstance(LONDON));
    }
    @Test
    public void testWithUTC() {
NoAssert.donothing(GJChronology.getInstanceUTC(), GJChronology.getInstance(LONDON).withUTC());
NoAssert.donothing(GJChronology.getInstanceUTC(), GJChronology.getInstance(TOKYO).withUTC());
        assertSame(GJChronology.getInstanceUTC(), GJChronology.getInstanceUTC().withUTC());
NoAssert.donothing(GJChronology.getInstanceUTC(), GJChronology.getInstance().withUTC());
    }
    @Test
    public void testWithZone() {
        assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO).withZone(TOKYO));
        assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(GJChronology.getInstance(PARIS), GJChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(GJChronology.getInstance(PARIS), GJChronology.getInstance().withZone(PARIS));
NoAssert.donothing(GJChronology.getInstance(PARIS), GJChronology.getInstanceUTC().withZone(PARIS));
    }
    @Test
    public void testToString() {
        assertEquals("GJChronology[Europe/London]", GJChronology.getInstance(LONDON).toString());
NoAssert.donothing("GJChronology[Asia/Tokyo]", GJChronology.getInstance(TOKYO).toString());
NoAssert.donothing("GJChronology[Europe/London]", GJChronology.getInstance().toString());
NoAssert.donothing("GJChronology[UTC]", GJChronology.getInstanceUTC().toString());
        assertEquals("GJChronology[UTC,cutover=1970-01-01]", GJChronology.getInstance(DateTimeZone.UTC, 0L, 4).toString());
NoAssert.donothing("GJChronology[UTC,cutover=1970-01-01T00:00:00.001Z,mdfw=2]", GJChronology.getInstance(DateTimeZone.UTC, 1L, 2).toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {
        final GJChronology gj = GJChronology.getInstance();
NoAssert.donothing("eras", gj.eras().getName());
NoAssert.donothing("centuries", gj.centuries().getName());
NoAssert.donothing("years", gj.years().getName());
NoAssert.donothing("weekyears", gj.weekyears().getName());
NoAssert.donothing("months", gj.months().getName());
NoAssert.donothing("weeks", gj.weeks().getName());
NoAssert.donothing("halfdays", gj.halfdays().getName());
NoAssert.donothing("days", gj.days().getName());
NoAssert.donothing("hours", gj.hours().getName());
NoAssert.donothing("minutes", gj.minutes().getName());
NoAssert.donothing("seconds", gj.seconds().getName());
NoAssert.donothing("millis", gj.millis().getName());

NoAssert.donothing(false, gj.eras().isSupported());
NoAssert.donothing(true, gj.centuries().isSupported());
        assertEquals(true, gj.years().isSupported());
        assertEquals(true, gj.weekyears().isSupported());
NoAssert.donothing(true, gj.months().isSupported());
NoAssert.donothing(true, gj.weeks().isSupported());
        assertEquals(true, gj.days().isSupported());
        assertEquals(true, gj.halfdays().isSupported());
NoAssert.donothing(true, gj.hours().isSupported());
NoAssert.donothing(true, gj.minutes().isSupported());
NoAssert.donothing(true, gj.seconds().isSupported());
NoAssert.donothing(true, gj.millis().isSupported());

NoAssert.donothing(false, gj.centuries().isPrecise());
        assertEquals(false, gj.years().isPrecise());
NoAssert.donothing(false, gj.weekyears().isPrecise());
NoAssert.donothing(false, gj.months().isPrecise());
        assertEquals(false, gj.weeks().isPrecise());
NoAssert.donothing(false, gj.days().isPrecise());
        assertEquals(false, gj.halfdays().isPrecise());
NoAssert.donothing(true, gj.hours().isPrecise());
        assertEquals(true, gj.minutes().isPrecise());
        assertEquals(true, gj.seconds().isPrecise());
        assertEquals(true, gj.millis().isPrecise());

        final GJChronology gjUTC = GJChronology.getInstanceUTC();
NoAssert.donothing(false, gjUTC.centuries().isPrecise());
        assertEquals(false, gjUTC.years().isPrecise());
        assertEquals(false, gjUTC.weekyears().isPrecise());
NoAssert.donothing(false, gjUTC.months().isPrecise());
        assertEquals(true, gjUTC.weeks().isPrecise());
        assertEquals(true, gjUTC.days().isPrecise());
NoAssert.donothing(true, gjUTC.halfdays().isPrecise());
NoAssert.donothing(true, gjUTC.hours().isPrecise());
        assertEquals(true, gjUTC.minutes().isPrecise());
NoAssert.donothing(true, gjUTC.seconds().isPrecise());
        assertEquals(true, gjUTC.millis().isPrecise());

        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final GJChronology gjGMT = GJChronology.getInstance(gmt);
NoAssert.donothing(false, gjGMT.centuries().isPrecise());
NoAssert.donothing(false, gjGMT.years().isPrecise());
NoAssert.donothing(false, gjGMT.weekyears().isPrecise());
NoAssert.donothing(false, gjGMT.months().isPrecise());
NoAssert.donothing(true, gjGMT.weeks().isPrecise());
NoAssert.donothing(true, gjGMT.days().isPrecise());
        assertEquals(true, gjGMT.halfdays().isPrecise());
NoAssert.donothing(true, gjGMT.hours().isPrecise());
NoAssert.donothing(true, gjGMT.minutes().isPrecise());
NoAssert.donothing(true, gjGMT.seconds().isPrecise());
        assertEquals(true, gjGMT.millis().isPrecise());
    }

    @Test
    public void testDateFields() {
        final GJChronology gj = GJChronology.getInstance();
NoAssert.donothing("era", gj.era().getName());
NoAssert.donothing("centuryOfEra", gj.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", gj.yearOfCentury().getName());
        assertEquals("yearOfEra", gj.yearOfEra().getName());
NoAssert.donothing("year", gj.year().getName());
        assertEquals("monthOfYear", gj.monthOfYear().getName());
        assertEquals("weekyearOfCentury", gj.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", gj.weekyear().getName());
NoAssert.donothing("weekOfWeekyear", gj.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", gj.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", gj.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", gj.dayOfWeek().getName());

NoAssert.donothing(true, gj.era().isSupported());
NoAssert.donothing(true, gj.centuryOfEra().isSupported());
        assertEquals(true, gj.yearOfCentury().isSupported());
NoAssert.donothing(true, gj.yearOfEra().isSupported());
NoAssert.donothing(true, gj.year().isSupported());
NoAssert.donothing(true, gj.monthOfYear().isSupported());
NoAssert.donothing(true, gj.weekyearOfCentury().isSupported());
NoAssert.donothing(true, gj.weekyear().isSupported());
        assertEquals(true, gj.weekOfWeekyear().isSupported());
        assertEquals(true, gj.dayOfYear().isSupported());
NoAssert.donothing(true, gj.dayOfMonth().isSupported());
NoAssert.donothing(true, gj.dayOfWeek().isSupported());

NoAssert.donothing(gj.eras(), gj.era().getDurationField());
NoAssert.donothing(gj.centuries(), gj.centuryOfEra().getDurationField());
NoAssert.donothing(gj.years(), gj.yearOfCentury().getDurationField());
        assertEquals(gj.years(), gj.yearOfEra().getDurationField());
        assertEquals(gj.years(), gj.year().getDurationField());
NoAssert.donothing(gj.months(), gj.monthOfYear().getDurationField());
NoAssert.donothing(gj.weekyears(), gj.weekyearOfCentury().getDurationField());
        assertEquals(gj.weekyears(), gj.weekyear().getDurationField());
NoAssert.donothing(gj.weeks(), gj.weekOfWeekyear().getDurationField());
NoAssert.donothing(gj.days(), gj.dayOfYear().getDurationField());
NoAssert.donothing(gj.days(), gj.dayOfMonth().getDurationField());
NoAssert.donothing(gj.days(), gj.dayOfWeek().getDurationField());

NoAssert.donothing(null, gj.era().getRangeDurationField());
NoAssert.donothing(gj.eras(), gj.centuryOfEra().getRangeDurationField());
NoAssert.donothing(gj.centuries(), gj.yearOfCentury().getRangeDurationField());
NoAssert.donothing(gj.eras(), gj.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, gj.year().getRangeDurationField());
NoAssert.donothing(gj.years(), gj.monthOfYear().getRangeDurationField());
NoAssert.donothing(gj.centuries(), gj.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, gj.weekyear().getRangeDurationField());
NoAssert.donothing(gj.weekyears(), gj.weekOfWeekyear().getRangeDurationField());
        assertEquals(gj.years(), gj.dayOfYear().getRangeDurationField());
NoAssert.donothing(gj.months(), gj.dayOfMonth().getRangeDurationField());
NoAssert.donothing(gj.weeks(), gj.dayOfWeek().getRangeDurationField());
    }

    @Test
    public void testTimeFields() {
        final GJChronology gj = GJChronology.getInstance();
NoAssert.donothing("halfdayOfDay", gj.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", gj.clockhourOfHalfday().getName());
NoAssert.donothing("hourOfHalfday", gj.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", gj.clockhourOfDay().getName());
NoAssert.donothing("hourOfDay", gj.hourOfDay().getName());
NoAssert.donothing("minuteOfDay", gj.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", gj.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", gj.secondOfDay().getName());
        assertEquals("secondOfMinute", gj.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", gj.millisOfDay().getName());
NoAssert.donothing("millisOfSecond", gj.millisOfSecond().getName());

NoAssert.donothing(true, gj.halfdayOfDay().isSupported());
NoAssert.donothing(true, gj.clockhourOfHalfday().isSupported());
NoAssert.donothing(true, gj.hourOfHalfday().isSupported());
NoAssert.donothing(true, gj.clockhourOfDay().isSupported());
        assertEquals(true, gj.hourOfDay().isSupported());
NoAssert.donothing(true, gj.minuteOfDay().isSupported());
        assertEquals(true, gj.minuteOfHour().isSupported());
        assertEquals(true, gj.secondOfDay().isSupported());
NoAssert.donothing(true, gj.secondOfMinute().isSupported());
NoAssert.donothing(true, gj.millisOfDay().isSupported());
NoAssert.donothing(true, gj.millisOfSecond().isSupported());
    }

    @Test
    public void testIllegalDates() {
        try {
            new DateTime(1582, 10, 5, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC));
            fail("Constructed illegal date");
        } catch (IllegalArgumentException e) { /* good */ }

        try {
            new DateTime(1582, 10, 14, 0, 0, 0, 0, GJChronology.getInstance(DateTimeZone.UTC));
            fail("Constructed illegal date");
        } catch (IllegalArgumentException e) { /* good */ }
    }

    @Test
    public void testParseEquivalence() {
        testParse("1581-01-01T01:23:45.678", 1581, 1, 1, 1, 23, 45, 678);
        testParse("1581-06-30", 1581, 6, 30, 0, 0, 0, 0);
        testParse("1582-01-01T01:23:45.678", 1582, 1, 1, 1, 23, 45, 678);
        testParse("1582-06-30T01:23:45.678", 1582, 6, 30, 1, 23, 45, 678);
        testParse("1582-10-04", 1582, 10, 4, 0, 0, 0, 0);
        testParse("1582-10-15", 1582, 10, 15, 0, 0, 0, 0);
        testParse("1582-12-31", 1582, 12, 31, 0, 0, 0, 0);
        testParse("1583-12-31", 1583, 12, 31, 0, 0, 0, 0);
    }


    private void testParse(String str,
                           int year, int month, int day,
                           int hour, int minute, int second, int millis) {
NoAssert.donothing(new DateTime(str, GJChronology.getInstance(DateTimeZone.UTC)),
                new DateTime(year, month, day, hour, minute, second, millis,
                        GJChronology.getInstance(DateTimeZone.UTC)));
    }

    @Test
    public void testCutoverAddYears() {
        testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01");
        testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15");
        testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28");
        testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01");
        testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30");
        testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01");
        testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04");
        testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15");
        testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16");

        // Leap years...
        testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01");
        testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29");
        testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01");
        testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10");
        testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15");
        testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31");
    }

    @Test
    public void testCutoverAddWeekyears() {
        testAdd("1582-W01-1", DurationFieldType.weekyears(), 1, "1583-W01-1");
        testAdd("1582-W39-1", DurationFieldType.weekyears(), 1, "1583-W39-1");
        testAdd("1583-W45-1", DurationFieldType.weekyears(), 1, "1584-W45-1");

        // This test fails, but I'm not sure if its worth fixing. The date
        // falls after the cutover, but in the cutover year. The add operation
        // is performed completely within the gregorian calendar, with no
        // crossing of the cutover. As a result, no special correction is
        // applied. Since the full gregorian year of 1582 has a different week
        // numbers than the full julian year of 1582, the week number is off by
        // one after the addition.
        //
        //testAdd("1582-W42-1", DurationFieldType.weekyears(), 1, "1583-W42-1");

        // Leap years...
        testAdd("1580-W01-1", DurationFieldType.weekyears(), 4, "1584-W01-1");
        testAdd("1580-W30-7", DurationFieldType.weekyears(), 4, "1584-W30-7");
        testAdd("1580-W50-7", DurationFieldType.weekyears(), 4, "1584-W50-7");
    }

    @Test
    public void testCutoverAddMonths() {
        testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01");
        testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01");
        testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01");
        testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15");

        testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04");
        testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05");
        testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10");
        testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15");


        // Leap years...
        testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01");
        testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29");
        testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01");
        testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10");
        testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15");
        testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31");
    }


    @Test
    public void testCutoverAddWeeks() {
        testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08");
        testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08");

        // Weeks are precise, and so cutover is not ignored.
        testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25");
        testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1");
    }


    @Test
    public void testCutoverAddDays() {
        testAdd("1582-10-03", DurationFieldType.days(), 1, "1582-10-04");
        testAdd("1582-10-04", DurationFieldType.days(), 1, "1582-10-15");
        testAdd("1582-10-15", DurationFieldType.days(), 1, "1582-10-16");

        testAdd("1582-09-30", DurationFieldType.days(), 10, "1582-10-20");
        testAdd("1582-10-04", DurationFieldType.days(), 10, "1582-10-24");
        testAdd("1582-10-15", DurationFieldType.days(), 10, "1582-10-25");
    }


    @Test
    public void testYearEndAddDays() {
        testAdd("1582-11-05", DurationFieldType.days(), 28, "1582-12-03");
        testAdd("1582-12-05", DurationFieldType.days(), 28, "1583-01-02");

        testAdd("2005-11-05", DurationFieldType.days(), 28, "2005-12-03");
        testAdd("2005-12-05", DurationFieldType.days(), 28, "2006-01-02");
    }


    @Test
    public void testSubtractDays() {
        // This is a test for a bug in version 1.0. The dayOfMonth range
        // duration field did not match the monthOfYear duration field. This
        // caused an exception to be thrown when subtracting days.
        DateTime dt = new DateTime
                (1112306400000L, GJChronology.getInstance(DateTimeZone.forID("Europe/Berlin")));
        YearMonthDay ymd = dt.toYearMonthDay();
        while (ymd.toDateTimeAtMidnight().getDayOfWeek() != DateTimeConstants.MONDAY) {
            ymd = ymd.minus(Period.days(1));
        }
    }



    private void testAdd(String start, DurationFieldType type, int amt, String end) {
        DateTime dtStart = new DateTime(start, GJChronology.getInstance(DateTimeZone.UTC));
        DateTime dtEnd = new DateTime(end, GJChronology.getInstance(DateTimeZone.UTC));
NoAssert.donothing(dtEnd, dtStart.withFieldAdded(type, amt));
        assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        DurationField field = type.getField(GJChronology.getInstance(DateTimeZone.UTC));
        int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
NoAssert.donothing(amt, diff);

        if (type == DurationFieldType.years() ||
                type == DurationFieldType.months() ||
                type == DurationFieldType.days()) {
            YearMonthDay ymdStart = new YearMonthDay(start, GJChronology.getInstance(DateTimeZone.UTC));
            YearMonthDay ymdEnd = new YearMonthDay(end, GJChronology.getInstance(DateTimeZone.UTC));
            assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }

    @Test
    public void testTimeOfDayAdd() {
        TimeOfDay start = new TimeOfDay(12, 30, GJChronology.getInstance());
        TimeOfDay end = new TimeOfDay(10, 30, GJChronology.getInstance());
NoAssert.donothing(end, start.plusHours(22));
        assertEquals(start, end.minusHours(22));
NoAssert.donothing(end, start.plusMinutes(22 * 60));
NoAssert.donothing(start, end.minusMinutes(22 * 60));
    }

    @Test
    public void testMaximumValue() {
        DateMidnight dt = new DateMidnight(1570, 1, 1, GJChronology.getInstance());
        while (dt.getYear() < 1590) {
            dt = dt.plusDays(1);
            YearMonthDay ymd = dt.toYearMonthDay();
NoAssert.donothing(dt.year().getMaximumValue(), ymd.year().getMaximumValue());
NoAssert.donothing(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue());
            assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue());
        }
    }
    @Test
    public void testPartialGetAsText() {
        GJChronology chrono = GJChronology.getInstance(TOKYO);
NoAssert.donothing("January", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsText());
        assertEquals("Jan", new YearMonthDay("2005-01-01", chrono).monthOfYear().getAsShortText());
    }
    @Test
    public void testLeapYearRulesConstruction() {
        // 1500 not leap in Gregorian, but is leap in Julian
        DateMidnight dt = new DateMidnight(1500, 2, 29, GJChronology.getInstanceUTC());
NoAssert.donothing(dt.getYear(), 1500);
NoAssert.donothing(dt.getMonthOfYear(), 2);
NoAssert.donothing(dt.getDayOfMonth(), 29);
    }
    @Test
    public void testLeapYearRulesConstructionInvalid() {
        // 1500 not leap in Gregorian, but is leap in Julian
        try {
            new DateMidnight(1500, 2, 30, GJChronology.getInstanceUTC());
            fail();
        } catch (IllegalFieldValueException ex) {
            // good
        }
    }
    @Test
    public void testLeap_28feb() {
        Chronology chrono = GJChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
        assertEquals(true, dt.monthOfYear().isLeap());
NoAssert.donothing(false, dt.dayOfMonth().isLeap());
NoAssert.donothing(false, dt.dayOfYear().isLeap());
    }
    @Test
    public void testLeap_29feb() {
        Chronology chrono = GJChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }


}
