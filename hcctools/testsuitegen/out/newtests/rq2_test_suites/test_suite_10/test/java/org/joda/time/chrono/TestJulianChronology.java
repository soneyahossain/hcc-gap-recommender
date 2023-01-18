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
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology { //extends TestCase {

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
        TestJulianChronology TB = new TestJulianChronology();
        TB.setUp(); TB.testFactoryUTC(); TB.tearDown();
        TB.setUp(); TB.testFactory(); TB.tearDown();
        TB.setUp(); TB.testFactory_Zone(); TB.tearDown();
        TB.setUp(); TB.testFactory_Zone_int(); TB.tearDown();
        TB.setUp(); TB.testEquality(); TB.tearDown();
        TB.setUp(); TB.testWithUTC(); TB.tearDown();
        TB.setUp(); TB.testWithZone(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testDurationFields(); TB.tearDown();
        TB.setUp(); TB.testDateFields(); TB.tearDown();
        TB.setUp(); TB.testTimeFields(); TB.tearDown();
        TB.setUp(); TB.testLeap_28feb(); TB.tearDown();
        TB.setUp(); TB.testLeap_29feb(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestJulianChronology.class);
    }

    public TestJulianChronology(String name) {
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
NoAssert.donothing(DateTimeZone.UTC, JulianChronology.getInstanceUTC().getZone());
NoAssert.donothing(JulianChronology.class, JulianChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
NoAssert.donothing(LONDON, JulianChronology.getInstance().getZone());
NoAssert.donothing(JulianChronology.class, JulianChronology.getInstance().getClass());
    }
    @Test
    public void testFactory_Zone() {
NoAssert.donothing(TOKYO, JulianChronology.getInstance(TOKYO).getZone());
NoAssert.donothing(PARIS, JulianChronology.getInstance(PARIS).getZone());
NoAssert.donothing(LONDON, JulianChronology.getInstance(null).getZone());
NoAssert.donothing(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass());
    }
    @Test
    public void testFactory_Zone_int() {
        JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2);
NoAssert.donothing(TOKYO, chrono.getZone());
NoAssert.donothing(2, chrono.getMinimumDaysInFirstWeek());
        
        try {
            JulianChronology.getInstance(TOKYO, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            JulianChronology.getInstance(TOKYO, 8);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {
NoAssert.donothing(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO));
NoAssert.donothing(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(LONDON));
NoAssert.donothing(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(PARIS));
NoAssert.donothing(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC());
NoAssert.donothing(JulianChronology.getInstance(), JulianChronology.getInstance(LONDON));
    }
    @Test
    public void testWithUTC() {
        assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(LONDON).withUTC());
NoAssert.donothing(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC().withUTC());
NoAssert.donothing(JulianChronology.getInstanceUTC(), JulianChronology.getInstance().withUTC());
    }

    @Test
    public void testWithZone() {
NoAssert.donothing(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO));
        assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null));
NoAssert.donothing(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS));
NoAssert.donothing(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS));
    }
    @Test
    public void testToString() {
NoAssert.donothing("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString());
NoAssert.donothing("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString());
NoAssert.donothing("JulianChronology[Europe/London]", JulianChronology.getInstance().toString());
NoAssert.donothing("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString());
NoAssert.donothing("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {
        final JulianChronology julian = JulianChronology.getInstance();
NoAssert.donothing("eras", julian.eras().getName());
NoAssert.donothing("centuries", julian.centuries().getName());
NoAssert.donothing("years", julian.years().getName());
NoAssert.donothing("weekyears", julian.weekyears().getName());
NoAssert.donothing("months", julian.months().getName());
NoAssert.donothing("weeks", julian.weeks().getName());
NoAssert.donothing("days", julian.days().getName());
        assertEquals("halfdays", julian.halfdays().getName());
NoAssert.donothing("hours", julian.hours().getName());
NoAssert.donothing("minutes", julian.minutes().getName());
NoAssert.donothing("seconds", julian.seconds().getName());
NoAssert.donothing("millis", julian.millis().getName());
        
NoAssert.donothing(false, julian.eras().isSupported());
NoAssert.donothing(true, julian.centuries().isSupported());
NoAssert.donothing(true, julian.years().isSupported());
NoAssert.donothing(true, julian.weekyears().isSupported());
NoAssert.donothing(true, julian.months().isSupported());
NoAssert.donothing(true, julian.weeks().isSupported());
        assertEquals(true, julian.days().isSupported());
        assertEquals(true, julian.halfdays().isSupported());
NoAssert.donothing(true, julian.hours().isSupported());
NoAssert.donothing(true, julian.minutes().isSupported());
NoAssert.donothing(true, julian.seconds().isSupported());
NoAssert.donothing(true, julian.millis().isSupported());
        
NoAssert.donothing(false, julian.centuries().isPrecise());
NoAssert.donothing(false, julian.years().isPrecise());
NoAssert.donothing(false, julian.weekyears().isPrecise());
NoAssert.donothing(false, julian.months().isPrecise());
NoAssert.donothing(false, julian.weeks().isPrecise());
NoAssert.donothing(false, julian.days().isPrecise());
NoAssert.donothing(false, julian.halfdays().isPrecise());
NoAssert.donothing(true, julian.hours().isPrecise());
NoAssert.donothing(true, julian.minutes().isPrecise());
NoAssert.donothing(true, julian.seconds().isPrecise());
NoAssert.donothing(true, julian.millis().isPrecise());
        
        final JulianChronology julianUTC = JulianChronology.getInstanceUTC();
        assertEquals(false, julianUTC.centuries().isPrecise());
NoAssert.donothing(false, julianUTC.years().isPrecise());
NoAssert.donothing(false, julianUTC.weekyears().isPrecise());
NoAssert.donothing(false, julianUTC.months().isPrecise());
NoAssert.donothing(true, julianUTC.weeks().isPrecise());
NoAssert.donothing(true, julianUTC.days().isPrecise());
NoAssert.donothing(true, julianUTC.halfdays().isPrecise());
NoAssert.donothing(true, julianUTC.hours().isPrecise());
NoAssert.donothing(true, julianUTC.minutes().isPrecise());
NoAssert.donothing(true, julianUTC.seconds().isPrecise());
NoAssert.donothing(true, julianUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final JulianChronology julianGMT = JulianChronology.getInstance(gmt);
NoAssert.donothing(false, julianGMT.centuries().isPrecise());
NoAssert.donothing(false, julianGMT.years().isPrecise());
NoAssert.donothing(false, julianGMT.weekyears().isPrecise());
        assertEquals(false, julianGMT.months().isPrecise());
NoAssert.donothing(true, julianGMT.weeks().isPrecise());
NoAssert.donothing(true, julianGMT.days().isPrecise());
NoAssert.donothing(true, julianGMT.halfdays().isPrecise());
NoAssert.donothing(true, julianGMT.hours().isPrecise());
NoAssert.donothing(true, julianGMT.minutes().isPrecise());
NoAssert.donothing(true, julianGMT.seconds().isPrecise());
NoAssert.donothing(true, julianGMT.millis().isPrecise());
    }
    @Test
    public void testDateFields() {
        final JulianChronology julian = JulianChronology.getInstance();
        assertEquals("era", julian.era().getName());
NoAssert.donothing("centuryOfEra", julian.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", julian.yearOfCentury().getName());
NoAssert.donothing("yearOfEra", julian.yearOfEra().getName());
NoAssert.donothing("year", julian.year().getName());
NoAssert.donothing("monthOfYear", julian.monthOfYear().getName());
NoAssert.donothing("weekyearOfCentury", julian.weekyearOfCentury().getName());
NoAssert.donothing("weekyear", julian.weekyear().getName());
NoAssert.donothing("weekOfWeekyear", julian.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", julian.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", julian.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", julian.dayOfWeek().getName());
        
NoAssert.donothing(true, julian.era().isSupported());
NoAssert.donothing(true, julian.centuryOfEra().isSupported());
        assertEquals(true, julian.yearOfCentury().isSupported());
NoAssert.donothing(true, julian.yearOfEra().isSupported());
NoAssert.donothing(true, julian.year().isSupported());
NoAssert.donothing(true, julian.monthOfYear().isSupported());
NoAssert.donothing(true, julian.weekyearOfCentury().isSupported());
NoAssert.donothing(true, julian.weekyear().isSupported());
        assertEquals(true, julian.weekOfWeekyear().isSupported());
NoAssert.donothing(true, julian.dayOfYear().isSupported());
NoAssert.donothing(true, julian.dayOfMonth().isSupported());
NoAssert.donothing(true, julian.dayOfWeek().isSupported());
        
NoAssert.donothing(julian.eras(), julian.era().getDurationField());
NoAssert.donothing(julian.centuries(), julian.centuryOfEra().getDurationField());
        assertEquals(julian.years(), julian.yearOfCentury().getDurationField());
NoAssert.donothing(julian.years(), julian.yearOfEra().getDurationField());
NoAssert.donothing(julian.years(), julian.year().getDurationField());
NoAssert.donothing(julian.months(), julian.monthOfYear().getDurationField());
NoAssert.donothing(julian.weekyears(), julian.weekyearOfCentury().getDurationField());
NoAssert.donothing(julian.weekyears(), julian.weekyear().getDurationField());
NoAssert.donothing(julian.weeks(), julian.weekOfWeekyear().getDurationField());
        assertEquals(julian.days(), julian.dayOfYear().getDurationField());
NoAssert.donothing(julian.days(), julian.dayOfMonth().getDurationField());
NoAssert.donothing(julian.days(), julian.dayOfWeek().getDurationField());
        
NoAssert.donothing(null, julian.era().getRangeDurationField());
NoAssert.donothing(julian.eras(), julian.centuryOfEra().getRangeDurationField());
NoAssert.donothing(julian.centuries(), julian.yearOfCentury().getRangeDurationField());
NoAssert.donothing(julian.eras(), julian.yearOfEra().getRangeDurationField());
NoAssert.donothing(null, julian.year().getRangeDurationField());
NoAssert.donothing(julian.years(), julian.monthOfYear().getRangeDurationField());
NoAssert.donothing(julian.centuries(), julian.weekyearOfCentury().getRangeDurationField());
NoAssert.donothing(null, julian.weekyear().getRangeDurationField());
NoAssert.donothing(julian.weekyears(), julian.weekOfWeekyear().getRangeDurationField());
NoAssert.donothing(julian.years(), julian.dayOfYear().getRangeDurationField());
NoAssert.donothing(julian.months(), julian.dayOfMonth().getRangeDurationField());
NoAssert.donothing(julian.weeks(), julian.dayOfWeek().getRangeDurationField());
    }

    @Test
    public void testTimeFields() {
        final JulianChronology julian = JulianChronology.getInstance();
NoAssert.donothing("halfdayOfDay", julian.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", julian.clockhourOfHalfday().getName());
NoAssert.donothing("hourOfHalfday", julian.hourOfHalfday().getName());
NoAssert.donothing("clockhourOfDay", julian.clockhourOfDay().getName());
NoAssert.donothing("hourOfDay", julian.hourOfDay().getName());
NoAssert.donothing("minuteOfDay", julian.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", julian.minuteOfHour().getName());
        assertEquals("secondOfDay", julian.secondOfDay().getName());
NoAssert.donothing("secondOfMinute", julian.secondOfMinute().getName());
NoAssert.donothing("millisOfDay", julian.millisOfDay().getName());
NoAssert.donothing("millisOfSecond", julian.millisOfSecond().getName());
        
NoAssert.donothing(true, julian.halfdayOfDay().isSupported());
NoAssert.donothing(true, julian.clockhourOfHalfday().isSupported());
NoAssert.donothing(true, julian.hourOfHalfday().isSupported());
NoAssert.donothing(true, julian.clockhourOfDay().isSupported());
NoAssert.donothing(true, julian.hourOfDay().isSupported());
NoAssert.donothing(true, julian.minuteOfDay().isSupported());
NoAssert.donothing(true, julian.minuteOfHour().isSupported());
NoAssert.donothing(true, julian.secondOfDay().isSupported());
NoAssert.donothing(true, julian.secondOfMinute().isSupported());
NoAssert.donothing(true, julian.millisOfDay().isSupported());
NoAssert.donothing(true, julian.millisOfSecond().isSupported());
    }


    @Test
    public void testLeap_28feb() {
        Chronology chrono = JulianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(false, dt.dayOfMonth().isLeap());
NoAssert.donothing(false, dt.dayOfYear().isLeap());
    }


    @Test
    public void testLeap_29feb() {
        Chronology chrono = JulianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        assertEquals(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
NoAssert.donothing(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }

}
