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
        assertEquals(DateTimeZone.UTC, JulianChronology.getInstanceUTC().getZone());
NoAssert.donothing(JulianChronology.class, JulianChronology.getInstanceUTC().getClass());
    }
    @Test
    public void testFactory() {
NoAssert.donothing(LONDON, JulianChronology.getInstance().getZone());
NoAssert.donothing(JulianChronology.class, JulianChronology.getInstance().getClass());
    }
    @Test
    public void testFactory_Zone() {
        assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone());
        assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone());
        assertEquals(LONDON, JulianChronology.getInstance(null).getZone());
        assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass());
    }
    @Test
    public void testFactory_Zone_int() {
        JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2);
        assertEquals(TOKYO, chrono.getZone());
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
        assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO));
        assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(LONDON));
NoAssert.donothing(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(PARIS));
        assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC());
        assertSame(JulianChronology.getInstance(), JulianChronology.getInstance(LONDON));
    }
    @Test
    public void testWithUTC() {
NoAssert.donothing(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(LONDON).withUTC());
        assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance(TOKYO).withUTC());
NoAssert.donothing(JulianChronology.getInstanceUTC(), JulianChronology.getInstanceUTC().withUTC());
        assertSame(JulianChronology.getInstanceUTC(), JulianChronology.getInstance().withUTC());
    }

    @Test
    public void testWithZone() {
NoAssert.donothing(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO));
NoAssert.donothing(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON));
NoAssert.donothing(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS));
NoAssert.donothing(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null));
        assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS));
        assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS));
    }
    @Test
    public void testToString() {
NoAssert.donothing("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString());
NoAssert.donothing("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString());
NoAssert.donothing("JulianChronology[Europe/London]", JulianChronology.getInstance().toString());
        assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString());
        assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {
        final JulianChronology julian = JulianChronology.getInstance();
        assertEquals("eras", julian.eras().getName());
        assertEquals("centuries", julian.centuries().getName());
NoAssert.donothing("years", julian.years().getName());
        assertEquals("weekyears", julian.weekyears().getName());
NoAssert.donothing("months", julian.months().getName());
        assertEquals("weeks", julian.weeks().getName());
        assertEquals("days", julian.days().getName());
NoAssert.donothing("halfdays", julian.halfdays().getName());
NoAssert.donothing("hours", julian.hours().getName());
        assertEquals("minutes", julian.minutes().getName());
        assertEquals("seconds", julian.seconds().getName());
        assertEquals("millis", julian.millis().getName());
        
        assertEquals(false, julian.eras().isSupported());
NoAssert.donothing(true, julian.centuries().isSupported());
        assertEquals(true, julian.years().isSupported());
        assertEquals(true, julian.weekyears().isSupported());
        assertEquals(true, julian.months().isSupported());
        assertEquals(true, julian.weeks().isSupported());
        assertEquals(true, julian.days().isSupported());
        assertEquals(true, julian.halfdays().isSupported());
NoAssert.donothing(true, julian.hours().isSupported());
        assertEquals(true, julian.minutes().isSupported());
NoAssert.donothing(true, julian.seconds().isSupported());
        assertEquals(true, julian.millis().isSupported());
        
        assertEquals(false, julian.centuries().isPrecise());
        assertEquals(false, julian.years().isPrecise());
        assertEquals(false, julian.weekyears().isPrecise());
        assertEquals(false, julian.months().isPrecise());
        assertEquals(false, julian.weeks().isPrecise());
        assertEquals(false, julian.days().isPrecise());
        assertEquals(false, julian.halfdays().isPrecise());
        assertEquals(true, julian.hours().isPrecise());
        assertEquals(true, julian.minutes().isPrecise());
        assertEquals(true, julian.seconds().isPrecise());
NoAssert.donothing(true, julian.millis().isPrecise());
        
        final JulianChronology julianUTC = JulianChronology.getInstanceUTC();
NoAssert.donothing(false, julianUTC.centuries().isPrecise());
        assertEquals(false, julianUTC.years().isPrecise());
        assertEquals(false, julianUTC.weekyears().isPrecise());
        assertEquals(false, julianUTC.months().isPrecise());
        assertEquals(true, julianUTC.weeks().isPrecise());
        assertEquals(true, julianUTC.days().isPrecise());
NoAssert.donothing(true, julianUTC.halfdays().isPrecise());
NoAssert.donothing(true, julianUTC.hours().isPrecise());
NoAssert.donothing(true, julianUTC.minutes().isPrecise());
        assertEquals(true, julianUTC.seconds().isPrecise());
        assertEquals(true, julianUTC.millis().isPrecise());
        
        final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        final JulianChronology julianGMT = JulianChronology.getInstance(gmt);
        assertEquals(false, julianGMT.centuries().isPrecise());
        assertEquals(false, julianGMT.years().isPrecise());
        assertEquals(false, julianGMT.weekyears().isPrecise());
NoAssert.donothing(false, julianGMT.months().isPrecise());
        assertEquals(true, julianGMT.weeks().isPrecise());
NoAssert.donothing(true, julianGMT.days().isPrecise());
NoAssert.donothing(true, julianGMT.halfdays().isPrecise());
NoAssert.donothing(true, julianGMT.hours().isPrecise());
        assertEquals(true, julianGMT.minutes().isPrecise());
        assertEquals(true, julianGMT.seconds().isPrecise());
        assertEquals(true, julianGMT.millis().isPrecise());
    }
    @Test
    public void testDateFields() {
        final JulianChronology julian = JulianChronology.getInstance();
        assertEquals("era", julian.era().getName());
        assertEquals("centuryOfEra", julian.centuryOfEra().getName());
NoAssert.donothing("yearOfCentury", julian.yearOfCentury().getName());
        assertEquals("yearOfEra", julian.yearOfEra().getName());
        assertEquals("year", julian.year().getName());
        assertEquals("monthOfYear", julian.monthOfYear().getName());
        assertEquals("weekyearOfCentury", julian.weekyearOfCentury().getName());
        assertEquals("weekyear", julian.weekyear().getName());
        assertEquals("weekOfWeekyear", julian.weekOfWeekyear().getName());
NoAssert.donothing("dayOfYear", julian.dayOfYear().getName());
NoAssert.donothing("dayOfMonth", julian.dayOfMonth().getName());
NoAssert.donothing("dayOfWeek", julian.dayOfWeek().getName());
        
NoAssert.donothing(true, julian.era().isSupported());
NoAssert.donothing(true, julian.centuryOfEra().isSupported());
        assertEquals(true, julian.yearOfCentury().isSupported());
        assertEquals(true, julian.yearOfEra().isSupported());
NoAssert.donothing(true, julian.year().isSupported());
NoAssert.donothing(true, julian.monthOfYear().isSupported());
NoAssert.donothing(true, julian.weekyearOfCentury().isSupported());
        assertEquals(true, julian.weekyear().isSupported());
        assertEquals(true, julian.weekOfWeekyear().isSupported());
        assertEquals(true, julian.dayOfYear().isSupported());
NoAssert.donothing(true, julian.dayOfMonth().isSupported());
NoAssert.donothing(true, julian.dayOfWeek().isSupported());
        
        assertEquals(julian.eras(), julian.era().getDurationField());
        assertEquals(julian.centuries(), julian.centuryOfEra().getDurationField());
NoAssert.donothing(julian.years(), julian.yearOfCentury().getDurationField());
        assertEquals(julian.years(), julian.yearOfEra().getDurationField());
        assertEquals(julian.years(), julian.year().getDurationField());
        assertEquals(julian.months(), julian.monthOfYear().getDurationField());
        assertEquals(julian.weekyears(), julian.weekyearOfCentury().getDurationField());
        assertEquals(julian.weekyears(), julian.weekyear().getDurationField());
        assertEquals(julian.weeks(), julian.weekOfWeekyear().getDurationField());
NoAssert.donothing(julian.days(), julian.dayOfYear().getDurationField());
        assertEquals(julian.days(), julian.dayOfMonth().getDurationField());
        assertEquals(julian.days(), julian.dayOfWeek().getDurationField());
        
NoAssert.donothing(null, julian.era().getRangeDurationField());
        assertEquals(julian.eras(), julian.centuryOfEra().getRangeDurationField());
NoAssert.donothing(julian.centuries(), julian.yearOfCentury().getRangeDurationField());
        assertEquals(julian.eras(), julian.yearOfEra().getRangeDurationField());
        assertEquals(null, julian.year().getRangeDurationField());
        assertEquals(julian.years(), julian.monthOfYear().getRangeDurationField());
NoAssert.donothing(julian.centuries(), julian.weekyearOfCentury().getRangeDurationField());
        assertEquals(null, julian.weekyear().getRangeDurationField());
NoAssert.donothing(julian.weekyears(), julian.weekOfWeekyear().getRangeDurationField());
        assertEquals(julian.years(), julian.dayOfYear().getRangeDurationField());
        assertEquals(julian.months(), julian.dayOfMonth().getRangeDurationField());
        assertEquals(julian.weeks(), julian.dayOfWeek().getRangeDurationField());
    }

    @Test
    public void testTimeFields() {
        final JulianChronology julian = JulianChronology.getInstance();
NoAssert.donothing("halfdayOfDay", julian.halfdayOfDay().getName());
NoAssert.donothing("clockhourOfHalfday", julian.clockhourOfHalfday().getName());
NoAssert.donothing("hourOfHalfday", julian.hourOfHalfday().getName());
        assertEquals("clockhourOfDay", julian.clockhourOfDay().getName());
NoAssert.donothing("hourOfDay", julian.hourOfDay().getName());
        assertEquals("minuteOfDay", julian.minuteOfDay().getName());
NoAssert.donothing("minuteOfHour", julian.minuteOfHour().getName());
        assertEquals("secondOfDay", julian.secondOfDay().getName());
        assertEquals("secondOfMinute", julian.secondOfMinute().getName());
        assertEquals("millisOfDay", julian.millisOfDay().getName());
        assertEquals("millisOfSecond", julian.millisOfSecond().getName());
        
        assertEquals(true, julian.halfdayOfDay().isSupported());
NoAssert.donothing(true, julian.clockhourOfHalfday().isSupported());
        assertEquals(true, julian.hourOfHalfday().isSupported());
        assertEquals(true, julian.clockhourOfDay().isSupported());
        assertEquals(true, julian.hourOfDay().isSupported());
        assertEquals(true, julian.minuteOfDay().isSupported());
        assertEquals(true, julian.minuteOfHour().isSupported());
        assertEquals(true, julian.secondOfDay().isSupported());
        assertEquals(true, julian.secondOfMinute().isSupported());
        assertEquals(true, julian.millisOfDay().isSupported());
        assertEquals(true, julian.millisOfSecond().isSupported());
    }


    @Test
    public void testLeap_28feb() {
        Chronology chrono = JulianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
NoAssert.donothing(true, dt.year().isLeap());
NoAssert.donothing(true, dt.monthOfYear().isLeap());
        assertEquals(false, dt.dayOfMonth().isLeap());
        assertEquals(false, dt.dayOfYear().isLeap());
    }


    @Test
    public void testLeap_29feb() {
        Chronology chrono = JulianChronology.getInstance();
        DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        assertEquals(true, dt.year().isLeap());
        assertEquals(true, dt.monthOfYear().isLeap());
        assertEquals(true, dt.dayOfMonth().isLeap());
NoAssert.donothing(true, dt.dayOfYear().isLeap());
    }

}
