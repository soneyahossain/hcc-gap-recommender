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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology { // extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

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

        TestISOChronology TB = new TestISOChronology();


        TB.setUp(); TB.testFactoryUTC(); TB.tearDown();
        TB.setUp(); TB.testFactory(); TB.tearDown();
        TB.setUp(); TB.testFactory_Zone(); TB.tearDown();
        TB.setUp(); TB.testEquality(); TB.tearDown();
        TB.setUp(); TB.testWithUTC(); TB.tearDown();
        TB.setUp(); TB.testWithZone(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testDurationFields(); TB.tearDown();
        TB.setUp(); TB.testDateFields(); TB.tearDown();
        TB.setUp(); TB.testTimeFields(); TB.tearDown();
        TB.setUp(); TB.testMaxYear(); TB.tearDown();
        TB.setUp(); TB.testMinYear(); TB.tearDown();
        TB.setUp(); TB.testCutoverAddYears(); TB.tearDown();
        TB.setUp(); TB.testAddMonths(); TB.tearDown();
        TB.setUp(); TB.testTimeOfDayAdd(); TB.tearDown();
        TB.setUp(); TB.testPartialDayOfYearAdd(); TB.tearDown();
        TB.setUp(); TB.testMaximumValue(); TB.tearDown();
        TB.setUp(); TB.testLeap_28feb(); TB.tearDown();
        TB.setUp(); TB.testLeap_29feb(); TB.tearDown();
    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestISOChronology.class);
    }

    public TestISOChronology(String name) {
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

   @After public void tearDown() throws Exception {
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
        assertEquals(DateTimeZone.UTC, ISOChronology.getInstanceUTC().getZone());
        assertSame(ISOChronology.class, ISOChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
        assertEquals(LONDON, ISOChronology.getInstance().getZone());
NoAssert.donothing(ISOChronology.class, ISOChronology.getInstance().getClass());
    }
    @Test
    public void testFactory_Zone() {
        assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone());
        assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone());
NoAssert.donothing(LONDON, ISOChronology.getInstance(null).getZone());
        assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {
NoAssert.donothing(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO));
NoAssert.donothing(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(LONDON));
        assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(PARIS));
        assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC());
NoAssert.donothing(ISOChronology.getInstance(), ISOChronology.getInstance(LONDON));
    }
    @Test
    public void testWithUTC() {
        assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(LONDON).withUTC());
        assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(TOKYO).withUTC());
        assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().withUTC());
        assertSame(ISOChronology.getInstanceUTC(), ISOChronology.getInstance().withUTC());
    }
    @Test
    public void testWithZone() {
        assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO));
        assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON));
        assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS));
        assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null));
        assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS));
        assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS));
    }
    @Test
    public void testToString() {
        assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString());
        assertEquals("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString());
        assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance().toString());
        assertEquals("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {
        final ISOChronology iso = ISOChronology.getInstance();
NoAssert.donothing("eras", iso.eras().getName());
        assertEquals("centuries", iso.centuries().getName());
NoAssert.donothing("years", iso.years().getName());
NoAssert.donothing("weekyears", iso.weekyears().getName());
NoAssert.donothing("months", iso.months().getName());
        assertEquals("weeks", iso.weeks().getName());
        assertEquals("days", iso.days().getName());
        assertEquals("halfdays", iso.halfdays().getName());
        assertEquals("hours", iso.hours().getName());
        assertEquals("minutes", iso.minutes().getName());
NoAssert.donothing("seconds", iso.seconds().getName());
NoAssert.donothing("millis", iso.millis().getName());
        
        assertEquals(false, iso.eras().isSupported());
        assertEquals(true, iso.centuries().isSupported());
NoAssert.donothing(true, iso.years().isSupported());
        assertEquals(true, iso.weekyears().isSupported());
        assertEquals(true, iso.months().isSupported());
NoAssert.donothing(true, iso.weeks().isSupported());
NoAssert.donothing(true, iso.days().isSupported());
NoAssert.donothing(true, iso.halfdays().isSupported());
        assertEquals(true, iso.hours().isSupported());
NoAssert.donothing(true, iso.minutes().isSupported());
        assertEquals(true, iso.seconds().isSupported());
NoAssert.donothing(true, iso.millis().isSupported());
        
        assertEquals(false, iso.centuries().isPrecise());
        assertEquals(false, iso.years().isPrecise());
        assertEquals(false, iso.weekyears().isPrecise());
        assertEquals(false, iso.months().isPrecise());
        assertEquals(false, iso.weeks().isPrecise());
NoAssert.donothing(false, iso.days().isPrecise());
        assertEquals(false, iso.halfdays().isPrecise());
NoAssert.donothing(true, iso.hours().isPrecise());
        assertEquals(true, iso.minutes().isPrecise());
NoAssert.donothing(true, iso.seconds().isPrecise());
        assertEquals(true, iso.millis().isPrecise());
        
        final ISOChronology isoUTC = ISOChronology.getInstanceUTC();
NoAssert.donothing(false, isoUTC.centuries().isPrecise());
        assertEquals(false, isoUTC.years().isPrecise());
        assertEquals(false, isoUTC.weekyears().isPrecise());
        assertEquals(false, isoUTC.months().isPrecise());
        assertEquals(true, isoUTC.weeks().isPrecise());
        assertEquals(true, isoUTC.days().isPrecise());
NoAssert.donothing(true, isoUTC.halfdays().isPrecise());
        assertEquals(true, isoUTC.hours().isPrecise());
NoAssert.donothing(true, isoUTC.minutes().isPrecise());
        assertEquals(true, isoUTC.seconds().isPrecise());
NoAssert.donothing(true, isoUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final ISOChronology isoGMT = ISOChronology.getInstance(gmt);
        assertEquals(false, isoGMT.centuries().isPrecise());
        assertEquals(false, isoGMT.years().isPrecise());
        assertEquals(false, isoGMT.weekyears().isPrecise());
        assertEquals(false, isoGMT.months().isPrecise());
NoAssert.donothing(true, isoGMT.weeks().isPrecise());
NoAssert.donothing(true, isoGMT.days().isPrecise());
        assertEquals(true, isoGMT.halfdays().isPrecise());
        assertEquals(true, isoGMT.hours().isPrecise());
        assertEquals(true, isoGMT.minutes().isPrecise());
        assertEquals(true, isoGMT.seconds().isPrecise());
        assertEquals(true, isoGMT.millis().isPrecise());
        
        final DateTimeZone offset = DateTimeZone.forOffsetHours(1);
        final ISOChronology isoOffset1 = ISOChronology.getInstance(offset);
        assertEquals(false, isoOffset1.centuries().isPrecise());
        assertEquals(false, isoOffset1.years().isPrecise());
        assertEquals(false, isoOffset1.weekyears().isPrecise());
NoAssert.donothing(false, isoOffset1.months().isPrecise());
        assertEquals(true, isoOffset1.weeks().isPrecise());
        assertEquals(true, isoOffset1.days().isPrecise());
        assertEquals(true, isoOffset1.halfdays().isPrecise());
        assertEquals(true, isoOffset1.hours().isPrecise());
        assertEquals(true, isoOffset1.minutes().isPrecise());
        assertEquals(true, isoOffset1.seconds().isPrecise());
        assertEquals(true, isoOffset1.millis().isPrecise());
    }


    @Test
    public void testDateFields() {
        final ISOChronology iso = ISOChronology.getInstance();
NoAssert.donothing("era", iso.era().getName());
        assertEquals("centuryOfEra", iso.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", iso.yearOfCentury().getName());
        assertEquals("yearOfEra", iso.yearOfEra().getName());
        assertEquals("year", iso.year().getName());
NoAssert.donothing("monthOfYear", iso.monthOfYear().getName());
        assertEquals("weekyearOfCentury", iso.weekyearOfCentury().getName());
        assertEquals("weekyear", iso.weekyear().getName());
NoAssert.donothing("weekOfWeekyear", iso.weekOfWeekyear().getName());
        assertEquals("dayOfYear", iso.dayOfYear().getName());
        assertEquals("dayOfMonth", iso.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", iso.dayOfWeek().getName());
        
        assertEquals(true, iso.era().isSupported());
NoAssert.donothing(true, iso.centuryOfEra().isSupported());
NoAssert.donothing(true, iso.yearOfCentury().isSupported());
        assertEquals(true, iso.yearOfEra().isSupported());
        assertEquals(true, iso.year().isSupported());
        assertEquals(true, iso.monthOfYear().isSupported());
NoAssert.donothing(true, iso.weekyearOfCentury().isSupported());
        assertEquals(true, iso.weekyear().isSupported());
NoAssert.donothing(true, iso.weekOfWeekyear().isSupported());
        assertEquals(true, iso.dayOfYear().isSupported());
        assertEquals(true, iso.dayOfMonth().isSupported());
        assertEquals(true, iso.dayOfWeek().isSupported());
        
NoAssert.donothing(iso.eras(), iso.era().getDurationField());
        assertEquals(iso.centuries(), iso.centuryOfEra().getDurationField());
        assertEquals(iso.years(), iso.yearOfCentury().getDurationField());
        assertEquals(iso.years(), iso.yearOfEra().getDurationField());
        assertEquals(iso.years(), iso.year().getDurationField());
NoAssert.donothing(iso.months(), iso.monthOfYear().getDurationField());
NoAssert.donothing(iso.weekyears(), iso.weekyearOfCentury().getDurationField());
        assertEquals(iso.weekyears(), iso.weekyear().getDurationField());
        assertEquals(iso.weeks(), iso.weekOfWeekyear().getDurationField());
NoAssert.donothing(iso.days(), iso.dayOfYear().getDurationField());
NoAssert.donothing(iso.days(), iso.dayOfMonth().getDurationField());
        assertEquals(iso.days(), iso.dayOfWeek().getDurationField());
        
NoAssert.donothing(null, iso.era().getRangeDurationField());
        assertEquals(iso.eras(), iso.centuryOfEra().getRangeDurationField());
        assertEquals(iso.centuries(), iso.yearOfCentury().getRangeDurationField());
        assertEquals(iso.eras(), iso.yearOfEra().getRangeDurationField());
        assertEquals(null, iso.year().getRangeDurationField());
        assertEquals(iso.years(), iso.monthOfYear().getRangeDurationField());
NoAssert.donothing(iso.centuries(), iso.weekyearOfCentury().getRangeDurationField());
        assertEquals(null, iso.weekyear().getRangeDurationField());
        assertEquals(iso.weekyears(), iso.weekOfWeekyear().getRangeDurationField());
        assertEquals(iso.years(), iso.dayOfYear().getRangeDurationField());
NoAssert.donothing(iso.months(), iso.dayOfMonth().getRangeDurationField());
NoAssert.donothing(iso.weeks(), iso.dayOfWeek().getRangeDurationField());
    }


    @Test
    public void testTimeFields() {
        final ISOChronology iso = ISOChronology.getInstance();
NoAssert.donothing("halfdayOfDay", iso.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", iso.clockhourOfHalfday().getName());
NoAssert.donothing("hourOfHalfday", iso.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", iso.clockhourOfDay().getName());
        assertEquals("hourOfDay", iso.hourOfDay().getName());
        assertEquals("minuteOfDay", iso.minuteOfDay().getName());
        assertEquals("minuteOfHour", iso.minuteOfHour().getName());
        assertEquals("secondOfDay", iso.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", iso.secondOfMinute().getName());
        assertEquals("millisOfDay", iso.millisOfDay().getName());
        assertEquals("millisOfSecond", iso.millisOfSecond().getName());
        
        assertEquals(true, iso.halfdayOfDay().isSupported());
        assertEquals(true, iso.clockhourOfHalfday().isSupported());
        assertEquals(true, iso.hourOfHalfday().isSupported());
NoAssert.donothing(true, iso.clockhourOfDay().isSupported());
        assertEquals(true, iso.hourOfDay().isSupported());
        assertEquals(true, iso.minuteOfDay().isSupported());
NoAssert.donothing(true, iso.minuteOfHour().isSupported());
        assertEquals(true, iso.secondOfDay().isSupported());
        assertEquals(true, iso.secondOfMinute().isSupported());
        assertEquals(true, iso.millisOfDay().isSupported());
        assertEquals(true, iso.millisOfSecond().isSupported());
    }

    @Test
    public void testMaxYear() {
        final ISOChronology chrono = ISOChronology.getInstanceUTC();
        final int maxYear = chrono.year().getMaximumValue();

        DateTime start = new DateTime(maxYear, 1, 1, 0, 0, 0, 0, chrono);
        DateTime end = new DateTime(maxYear, 12, 31, 23, 59, 59, 999, chrono);
        assertTrue(start.getMillis() > 0);
        assertTrue(end.getMillis() > start.getMillis());
NoAssert.donothing(maxYear, start.getYear());
NoAssert.donothing(maxYear, end.getYear());
        long delta = end.getMillis() - start.getMillis();
        long expectedDelta = 
            (start.year().isLeap() ? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
NoAssert.donothing(expectedDelta, delta);

        assertEquals(start, new DateTime(maxYear + "-01-01T00:00:00.000Z", chrono));
        assertEquals(end, new DateTime(maxYear + "-12-31T23:59:59.999Z", chrono));

        try {
            start.plusYears(1);
            fail();
        } catch (IllegalFieldValueException e) {
        }

        try {
            end.plusYears(1);
            fail();
        } catch (IllegalFieldValueException e) {
        }

        assertEquals(maxYear + 1, chrono.year().get(Long.MAX_VALUE));
    }


    @Test
    public void testMinYear() {
        final ISOChronology chrono = ISOChronology.getInstanceUTC();
        final int minYear = chrono.year().getMinimumValue();

        DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono);
        DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono);
        assertTrue(start.getMillis() < 0);
        assertTrue(end.getMillis() > start.getMillis());
        assertEquals(minYear, start.getYear());
        assertEquals(minYear, end.getYear());
        long delta = end.getMillis() - start.getMillis();
        long expectedDelta = 
            (start.year().isLeap() ? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
NoAssert.donothing(expectedDelta, delta);

NoAssert.donothing(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono));
NoAssert.donothing(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono));

        try {
            start.minusYears(1);
            fail();
        } catch (IllegalFieldValueException e) {
        }

        try {
            end.minusYears(1);
            fail();
        } catch (IllegalFieldValueException e) {
        }

NoAssert.donothing(minYear - 1, chrono.year().get(Long.MIN_VALUE));
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
        testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01");
        testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29");
        testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01");
        testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10");
        testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15");
        testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31");
    }


    @Test
    public void testAddMonths() {
        testAdd("1582-01-01", DurationFieldType.months(), 1, "1582-02-01");
        testAdd("1582-01-01", DurationFieldType.months(), 6, "1582-07-01");
        testAdd("1582-01-01", DurationFieldType.months(), 12, "1583-01-01");
        testAdd("1582-11-15", DurationFieldType.months(), 1, "1582-12-15");
        testAdd("1582-09-04", DurationFieldType.months(), 2, "1582-11-04");
        testAdd("1582-09-05", DurationFieldType.months(), 2, "1582-11-05");
        testAdd("1582-09-10", DurationFieldType.months(), 2, "1582-11-10");
        testAdd("1582-09-15", DurationFieldType.months(), 2, "1582-11-15");
        testAdd("1580-01-01", DurationFieldType.months(), 48, "1584-01-01");
        testAdd("1580-02-29", DurationFieldType.months(), 48, "1584-02-29");
        testAdd("1580-10-01", DurationFieldType.months(), 48, "1584-10-01");
        testAdd("1580-10-10", DurationFieldType.months(), 48, "1584-10-10");
        testAdd("1580-10-15", DurationFieldType.months(), 48, "1584-10-15");
        testAdd("1580-12-31", DurationFieldType.months(), 48, "1584-12-31");
    }

    private void testAdd(String start, DurationFieldType type, int amt, String end) {
        DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        DurationField field = type.getField(ISOChronology.getInstanceUTC());
        int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        assertEquals(amt, diff);
        
        if (type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days()) {
            YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
NoAssert.donothing(ymdEnd, ymdStart.withFieldAdded(type, amt));
            assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }

    @Test
    public void testTimeOfDayAdd() {
        TimeOfDay start = new TimeOfDay(12, 30);
        TimeOfDay end = new TimeOfDay(10, 30);
NoAssert.donothing(end, start.plusHours(22));
        assertEquals(start, end.minusHours(22));
        assertEquals(end, start.plusMinutes(22 * 60));
        assertEquals(start, end.minusMinutes(22 * 60));
    }


    @Test
    public void testPartialDayOfYearAdd() {
        Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366);
        Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366);
        assertEquals(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366));
        assertEquals(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366)));
    }

    @Test
    public void testMaximumValue() {
        DateMidnight dt = new DateMidnight(1570, 1, 1);
        while (dt.getYear() < 1590) {
            dt = dt.plusDays(1);
            YearMonthDay ymd = dt.toYearMonthDay();
NoAssert.donothing(dt.year().getMaximumValue(), ymd.year().getMaximumValue());
            assertEquals(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue());
            assertEquals(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue());
        }
    }


    @Test
    public void testLeap_28feb() {
        Chronology chrono = ISOChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
        assertEquals(true, dt.year().isLeap());
        assertEquals(true, dt.monthOfYear().isLeap());
        assertEquals(false, dt.dayOfMonth().isLeap());
        assertEquals(false, dt.dayOfYear().isLeap());
    }


    @Test
    public void testLeap_29feb() {
        Chronology chrono = ISOChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        assertEquals(true, dt.year().isLeap());
        assertEquals(true, dt.monthOfYear().isLeap());
NoAssert.donothing(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }

}
