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
NoAssert.donothing(DateTimeZone.UTC, ISOChronology.getInstanceUTC().getZone());
NoAssert.donothing(ISOChronology.class, ISOChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
NoAssert.donothing(LONDON, ISOChronology.getInstance().getZone());
NoAssert.donothing(ISOChronology.class, ISOChronology.getInstance().getClass());
    }
    @Test
    public void testFactory_Zone() {
NoAssert.donothing(TOKYO, ISOChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, ISOChronology.getInstance(PARIS).getZone());
NoAssert.donothing(LONDON, ISOChronology.getInstance(null).getZone());
NoAssert.donothing(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {
NoAssert.donothing(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO));
NoAssert.donothing(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(LONDON));
NoAssert.donothing(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(PARIS));
NoAssert.donothing(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC());
NoAssert.donothing(ISOChronology.getInstance(), ISOChronology.getInstance(LONDON));
    }
    @Test
    public void testWithUTC() {
NoAssert.donothing(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(LONDON).withUTC());
NoAssert.donothing(ISOChronology.getInstanceUTC(), ISOChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().withUTC());
NoAssert.donothing(ISOChronology.getInstanceUTC(), ISOChronology.getInstance().withUTC());
    }
    @Test
    public void testWithZone() {
NoAssert.donothing(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO));
NoAssert.donothing(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS));
NoAssert.donothing(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS));
    }
    @Test
    public void testToString() {
NoAssert.donothing("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString());
NoAssert.donothing("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString());
NoAssert.donothing("ISOChronology[Europe/London]", ISOChronology.getInstance().toString());
NoAssert.donothing("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {
        final ISOChronology iso = ISOChronology.getInstance();
NoAssert.donothing("eras", iso.eras().getName());
NoAssert.donothing("centuries", iso.centuries().getName());
NoAssert.donothing("years", iso.years().getName());
NoAssert.donothing("weekyears", iso.weekyears().getName());
NoAssert.donothing("months", iso.months().getName());
NoAssert.donothing("weeks", iso.weeks().getName());
NoAssert.donothing("days", iso.days().getName());
NoAssert.donothing("halfdays", iso.halfdays().getName());
NoAssert.donothing("hours", iso.hours().getName());
NoAssert.donothing("minutes", iso.minutes().getName());
NoAssert.donothing("seconds", iso.seconds().getName());
NoAssert.donothing("millis", iso.millis().getName());
        
NoAssert.donothing(false, iso.eras().isSupported());
NoAssert.donothing(true, iso.centuries().isSupported());
NoAssert.donothing(true, iso.years().isSupported());
NoAssert.donothing(true, iso.weekyears().isSupported());
NoAssert.donothing(true, iso.months().isSupported());
NoAssert.donothing(true, iso.weeks().isSupported());
NoAssert.donothing(true, iso.days().isSupported());
NoAssert.donothing(true, iso.halfdays().isSupported());
NoAssert.donothing(true, iso.hours().isSupported());
NoAssert.donothing(true, iso.minutes().isSupported());
NoAssert.donothing(true, iso.seconds().isSupported());
NoAssert.donothing(true, iso.millis().isSupported());
        
NoAssert.donothing(false, iso.centuries().isPrecise());
NoAssert.donothing(false, iso.years().isPrecise());
NoAssert.donothing(false, iso.weekyears().isPrecise());
NoAssert.donothing(false, iso.months().isPrecise());
NoAssert.donothing(false, iso.weeks().isPrecise());
NoAssert.donothing(false, iso.days().isPrecise());
NoAssert.donothing(false, iso.halfdays().isPrecise());
NoAssert.donothing(true, iso.hours().isPrecise());
NoAssert.donothing(true, iso.minutes().isPrecise());
NoAssert.donothing(true, iso.seconds().isPrecise());
NoAssert.donothing(true, iso.millis().isPrecise());
        
        final ISOChronology isoUTC = ISOChronology.getInstanceUTC();
NoAssert.donothing(false, isoUTC.centuries().isPrecise());
NoAssert.donothing(false, isoUTC.years().isPrecise());
NoAssert.donothing(false, isoUTC.weekyears().isPrecise());
NoAssert.donothing(false, isoUTC.months().isPrecise());
        assertEquals(true, isoUTC.weeks().isPrecise());
NoAssert.donothing(true, isoUTC.days().isPrecise());
NoAssert.donothing(true, isoUTC.halfdays().isPrecise());
NoAssert.donothing(true, isoUTC.hours().isPrecise());
NoAssert.donothing(true, isoUTC.minutes().isPrecise());
NoAssert.donothing(true, isoUTC.seconds().isPrecise());
NoAssert.donothing(true, isoUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final ISOChronology isoGMT = ISOChronology.getInstance(gmt);
NoAssert.donothing(false, isoGMT.centuries().isPrecise());
NoAssert.donothing(false, isoGMT.years().isPrecise());
NoAssert.donothing(false, isoGMT.weekyears().isPrecise());
NoAssert.donothing(false, isoGMT.months().isPrecise());
NoAssert.donothing(true, isoGMT.weeks().isPrecise());
NoAssert.donothing(true, isoGMT.days().isPrecise());
NoAssert.donothing(true, isoGMT.halfdays().isPrecise());
NoAssert.donothing(true, isoGMT.hours().isPrecise());
NoAssert.donothing(true, isoGMT.minutes().isPrecise());
NoAssert.donothing(true, isoGMT.seconds().isPrecise());
NoAssert.donothing(true, isoGMT.millis().isPrecise());
        
        final DateTimeZone offset = DateTimeZone.forOffsetHours(1);
        final ISOChronology isoOffset1 = ISOChronology.getInstance(offset);
NoAssert.donothing(false, isoOffset1.centuries().isPrecise());
NoAssert.donothing(false, isoOffset1.years().isPrecise());
NoAssert.donothing(false, isoOffset1.weekyears().isPrecise());
NoAssert.donothing(false, isoOffset1.months().isPrecise());
NoAssert.donothing(true, isoOffset1.weeks().isPrecise());
NoAssert.donothing(true, isoOffset1.days().isPrecise());
NoAssert.donothing(true, isoOffset1.halfdays().isPrecise());
NoAssert.donothing(true, isoOffset1.hours().isPrecise());
        assertEquals(true, isoOffset1.minutes().isPrecise());
NoAssert.donothing(true, isoOffset1.seconds().isPrecise());
NoAssert.donothing(true, isoOffset1.millis().isPrecise());
    }


    @Test
    public void testDateFields() {
        final ISOChronology iso = ISOChronology.getInstance();
NoAssert.donothing("era", iso.era().getName());
NoAssert.donothing("centuryOfEra", iso.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", iso.yearOfCentury().getName());
NoAssert.donothing("yearOfEra", iso.yearOfEra().getName());
NoAssert.donothing("year", iso.year().getName());
NoAssert.donothing("monthOfYear", iso.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", iso.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", iso.weekyear().getName());
NoAssert.donothing("weekOfWeekyear", iso.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", iso.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", iso.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", iso.dayOfWeek().getName());
        
NoAssert.donothing(true, iso.era().isSupported());
NoAssert.donothing(true, iso.centuryOfEra().isSupported());
NoAssert.donothing(true, iso.yearOfCentury().isSupported());
        assertEquals(true, iso.yearOfEra().isSupported());
NoAssert.donothing(true, iso.year().isSupported());
NoAssert.donothing(true, iso.monthOfYear().isSupported());
NoAssert.donothing(true, iso.weekyearOfCentury().isSupported());
NoAssert.donothing(true, iso.weekyear().isSupported());
NoAssert.donothing(true, iso.weekOfWeekyear().isSupported());
NoAssert.donothing(true, iso.dayOfYear().isSupported());
NoAssert.donothing(true, iso.dayOfMonth().isSupported());
NoAssert.donothing(true, iso.dayOfWeek().isSupported());
        
NoAssert.donothing(iso.eras(), iso.era().getDurationField());
NoAssert.donothing(iso.centuries(), iso.centuryOfEra().getDurationField());
NoAssert.donothing(iso.years(), iso.yearOfCentury().getDurationField());
NoAssert.donothing(iso.years(), iso.yearOfEra().getDurationField());
NoAssert.donothing(iso.years(), iso.year().getDurationField());
NoAssert.donothing(iso.months(), iso.monthOfYear().getDurationField());
NoAssert.donothing(iso.weekyears(), iso.weekyearOfCentury().getDurationField());
NoAssert.donothing(iso.weekyears(), iso.weekyear().getDurationField());
NoAssert.donothing(iso.weeks(), iso.weekOfWeekyear().getDurationField());
NoAssert.donothing(iso.days(), iso.dayOfYear().getDurationField());
NoAssert.donothing(iso.days(), iso.dayOfMonth().getDurationField());
NoAssert.donothing(iso.days(), iso.dayOfWeek().getDurationField());
        
NoAssert.donothing(null, iso.era().getRangeDurationField());
NoAssert.donothing(iso.eras(), iso.centuryOfEra().getRangeDurationField());
NoAssert.donothing(iso.centuries(), iso.yearOfCentury().getRangeDurationField());
NoAssert.donothing(iso.eras(), iso.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, iso.year().getRangeDurationField());
NoAssert.donothing(iso.years(), iso.monthOfYear().getRangeDurationField());
NoAssert.donothing(iso.centuries(), iso.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, iso.weekyear().getRangeDurationField());
NoAssert.donothing(iso.weekyears(), iso.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(iso.years(), iso.dayOfYear().getRangeDurationField());
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
NoAssert.donothing("hourOfDay", iso.hourOfDay().getName());
NoAssert.donothing("minuteOfDay", iso.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", iso.minuteOfHour().getName());
NoAssert.donothing("secondOfDay", iso.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", iso.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", iso.millisOfDay().getName());
NoAssert.donothing("millisOfSecond", iso.millisOfSecond().getName());
        
NoAssert.donothing(true, iso.halfdayOfDay().isSupported());
NoAssert.donothing(true, iso.clockhourOfHalfday().isSupported());
NoAssert.donothing(true, iso.hourOfHalfday().isSupported());
NoAssert.donothing(true, iso.clockhourOfDay().isSupported());
NoAssert.donothing(true, iso.hourOfDay().isSupported());
NoAssert.donothing(true, iso.minuteOfDay().isSupported());
NoAssert.donothing(true, iso.minuteOfHour().isSupported());
NoAssert.donothing(true, iso.secondOfDay().isSupported());
NoAssert.donothing(true, iso.secondOfMinute().isSupported());
NoAssert.donothing(true, iso.millisOfDay().isSupported());
NoAssert.donothing(true, iso.millisOfSecond().isSupported());
    }

    @Test
    public void testMaxYear() {
        final ISOChronology chrono = ISOChronology.getInstanceUTC();
        final int maxYear = chrono.year().getMaximumValue();

        DateTime start = new DateTime(maxYear, 1, 1, 0, 0, 0, 0, chrono);
        DateTime end = new DateTime(maxYear, 12, 31, 23, 59, 59, 999, chrono);
NoAssert.donothing(start.getMillis() > 0);
NoAssert.donothing(end.getMillis() > start.getMillis());
NoAssert.donothing(maxYear, start.getYear());
NoAssert.donothing(maxYear, end.getYear());
        long delta = end.getMillis() - start.getMillis();
        long expectedDelta = 
            (start.year().isLeap() ? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
NoAssert.donothing(expectedDelta, delta);

NoAssert.donothing(start, new DateTime(maxYear + "-01-01T00:00:00.000Z", chrono));
NoAssert.donothing(end, new DateTime(maxYear + "-12-31T23:59:59.999Z", chrono));

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

NoAssert.donothing(maxYear + 1, chrono.year().get(Long.MAX_VALUE));
    }


    @Test
    public void testMinYear() {
        final ISOChronology chrono = ISOChronology.getInstanceUTC();
        final int minYear = chrono.year().getMinimumValue();

        DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono);
        DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono);
NoAssert.donothing(start.getMillis() < 0);
NoAssert.donothing(end.getMillis() > start.getMillis());
NoAssert.donothing(minYear, start.getYear());
NoAssert.donothing(minYear, end.getYear());
        long delta = end.getMillis() - start.getMillis();
        long expectedDelta = 
            (start.year().isLeap() ? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1;
        assertEquals(expectedDelta, delta);

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
NoAssert.donothing(dtEnd, dtStart.withFieldAdded(type, amt));
NoAssert.donothing(dtStart, dtEnd.withFieldAdded(type, -amt));

        DurationField field = type.getField(ISOChronology.getInstanceUTC());
        int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
NoAssert.donothing(amt, diff);
        
        if (type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days()) {
            YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
NoAssert.donothing(ymdEnd, ymdStart.withFieldAdded(type, amt));
NoAssert.donothing(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }

    @Test
    public void testTimeOfDayAdd() {
        TimeOfDay start = new TimeOfDay(12, 30);
        TimeOfDay end = new TimeOfDay(10, 30);
NoAssert.donothing(end, start.plusHours(22));
NoAssert.donothing(start, end.minusHours(22));
NoAssert.donothing(end, start.plusMinutes(22 * 60));
NoAssert.donothing(start, end.minusMinutes(22 * 60));
    }


    @Test
    public void testPartialDayOfYearAdd() {
        Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366);
        Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366);
NoAssert.donothing(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366));
NoAssert.donothing(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366)));
    }

    @Test
    public void testMaximumValue() {
        DateMidnight dt = new DateMidnight(1570, 1, 1);
        while (dt.getYear() < 1590) {
            dt = dt.plusDays(1);
            YearMonthDay ymd = dt.toYearMonthDay();
NoAssert.donothing(dt.year().getMaximumValue(), ymd.year().getMaximumValue());
NoAssert.donothing(dt.monthOfYear().getMaximumValue(), ymd.monthOfYear().getMaximumValue());
NoAssert.donothing(dt.dayOfMonth().getMaximumValue(), ymd.dayOfMonth().getMaximumValue());
        }
    }


    @Test
    public void testLeap_28feb() {
        Chronology chrono = ISOChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(false, dt.dayOfMonth().isLeap());
NoAssert.donothing(false, dt.dayOfYear().isLeap());
    }


    @Test
    public void testLeap_29feb() {
        Chronology chrono = ISOChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }

}
