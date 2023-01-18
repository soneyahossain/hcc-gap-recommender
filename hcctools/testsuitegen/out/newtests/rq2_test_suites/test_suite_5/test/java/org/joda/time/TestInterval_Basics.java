/*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.time;import org.joda.time.NoAssert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Basics  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private Interval interval37;
    private Interval interval33;

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Throwable {
        TestInterval_Basics TB= new TestInterval_Basics();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testGetMillis(); TB.tearDown();
        TB.setUp(); TB.testGetDuration1(); TB.tearDown();
        TB.setUp(); TB.testGetDuration2(); TB.tearDown();
        TB.setUp(); TB.testGetDuration3(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCodeLenient(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCodeStrict(); TB.tearDown();
        TB.setUp(); TB.test_useCase_ContainsOverlapAbutGap(); TB.tearDown();
        TB.setUp(); TB.test_useCase_ContainsOverlapAbutGap_zeroDuration(); TB.tearDown();
        TB.setUp(); TB.test_useCase_ContainsOverlapAbutGap_bothZeroDuration(); TB.tearDown();
        TB.setUp(); TB.testContains_long(); TB.tearDown();
        TB.setUp(); TB.testContains_long_zeroDuration(); TB.tearDown();
        TB.setUp(); TB.testContainsNow(); TB.tearDown();
        TB.setUp(); TB.testContains_RI(); TB.tearDown();
        TB.setUp(); TB.testContains_RI_null(); TB.tearDown();
        TB.setUp(); TB.testContains_RI_zeroDuration(); TB.tearDown();
        TB.setUp(); TB.testContains_RInterval(); TB.tearDown();
        TB.setUp(); TB.testContains_RInterval_null(); TB.tearDown();
        TB.setUp(); TB.testContains_RInterval_zeroDuration(); TB.tearDown();
        TB.setUp(); TB.testOverlaps_RInterval(); TB.tearDown();
        TB.setUp(); TB.testOverlaps_RInterval_null(); TB.tearDown();
        TB.setUp(); TB.testOverlaps_RInterval_zeroDuration(); TB.tearDown();
        TB.setUp(); TB.testOverlap_RInterval(); TB.tearDown();
        TB.setUp(); TB.testOverlap_RInterval_null(); TB.tearDown();
        TB.setUp(); TB.testOverlap_RInterval_zone(); TB.tearDown();
        TB.setUp(); TB.testOverlap_RInterval_zoneUTC(); TB.tearDown();
        TB.setUp(); TB.testGap_RInterval(); TB.tearDown();
        TB.setUp(); TB.testGap_RInterval_null(); TB.tearDown();
        TB.setUp(); TB.testGap_RInterval_zone(); TB.tearDown();
        TB.setUp(); TB.testGap_RInterval_zoneUTC(); TB.tearDown();
        TB.setUp(); TB.testAbuts_RInterval(); TB.tearDown();
        TB.setUp(); TB.testAbuts_RInterval_null(); TB.tearDown();
        TB.setUp(); TB.testIsEqual_RI(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_long(); TB.tearDown();
        TB.setUp(); TB.testIsBeforeNow(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_RI(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_RI_null(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_RInterval(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_RInterval_null(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_long(); TB.tearDown();
        TB.setUp(); TB.testIsAfterNow(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_RI(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_RI_null(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_RInterval(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_RInterval_null(); TB.tearDown();
        TB.setUp(); TB.testToInterval1(); TB.tearDown();
        TB.setUp(); TB.testToMutableInterval1(); TB.tearDown();
        TB.setUp(); TB.testToPeriod(); TB.tearDown();
        TB.setUp(); TB.testToPeriod_PeriodType1(); TB.tearDown();
        TB.setUp(); TB.testToPeriod_PeriodType2(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToString_reparse(); TB.tearDown();
        TB.setUp(); TB.testWithChronology1(); TB.tearDown();
        TB.setUp(); TB.testWithChronology2(); TB.tearDown();
        TB.setUp(); TB.testWithChronology3(); TB.tearDown();
        TB.setUp(); TB.testWithStartMillis_long1(); TB.tearDown();
        TB.setUp(); TB.testWithStartMillis_long2(); TB.tearDown();
        TB.setUp(); TB.testWithStartMillis_long3(); TB.tearDown();
        TB.setUp(); TB.testWithStartInstant_RI1(); TB.tearDown();
        TB.setUp(); TB.testWithStartInstant_RI2(); TB.tearDown();
        TB.setUp(); TB.testWithStartInstant_RI3(); TB.tearDown();
        TB.setUp(); TB.testWithEndMillis_long1(); TB.tearDown();
        TB.setUp(); TB.testWithEndMillis_long2(); TB.tearDown();
        TB.setUp(); TB.testWithEndMillis_long3(); TB.tearDown();
        TB.setUp(); TB.testWithEndInstant_RI1(); TB.tearDown();
        TB.setUp(); TB.testWithEndInstant_RI2(); TB.tearDown();
        TB.setUp(); TB.testWithEndInstant_RI3(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAfterStart1(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAfterStart2(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAfterStart3(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAfterStart4(); TB.tearDown();
        TB.setUp(); TB.testWithDurationBeforeEnd1(); TB.tearDown();
        TB.setUp(); TB.testWithDurationBeforeEnd2(); TB.tearDown();
        TB.setUp(); TB.testWithDurationBeforeEnd3(); TB.tearDown();
        TB.setUp(); TB.testWithDurationBeforeEnd4(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodAfterStart1(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodAfterStart2(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodAfterStart3(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodBeforeEnd1(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodBeforeEnd2(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodBeforeEnd3(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestInterval_Basics.class);
    }

    public TestInterval_Basics(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(PARIS);
        TimeZone.setDefault(PARIS.toTimeZone());
        Locale.setDefault(Locale.FRANCE);
        interval37 = new Interval(3, 7);
        interval33 = new Interval(3, 3);
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
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testGetMillis() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2);
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
        assertEquals(TEST_TIME1, test.getStart().getMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
NoAssert.donothing(TEST_TIME2, test.getEnd().getMillis());
NoAssert.donothing(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
NoAssert.donothing(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }

    @Test public void testGetDuration1() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2);
NoAssert.donothing(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
NoAssert.donothing(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }

    @Test public void testGetDuration2() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME1);
NoAssert.donothing(Duration.ZERO, test.toDuration());
    }

    @Test public void testGetDuration3() {
        Interval test = new Interval(Long.MIN_VALUE, -2);
NoAssert.donothing(-2L - Long.MIN_VALUE, test.toDurationMillis());
    }

    @Test public void testEqualsHashCode() {
        Interval test1 = new Interval(TEST_TIME1, TEST_TIME2);
        Interval test2 = new Interval(TEST_TIME1, TEST_TIME2);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        Interval test3 = new Interval(TEST_TIME_NOW, TEST_TIME2);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
        Interval test4 = new Interval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance());
NoAssert.donothing(true, test4.equals(test4));
NoAssert.donothing(false, test1.equals(test4));
NoAssert.donothing(false, test2.equals(test4));
NoAssert.donothing(false, test4.equals(test1));
NoAssert.donothing(false, test4.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test4.hashCode());
NoAssert.donothing(false, test2.hashCode() == test4.hashCode());
        
        MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2);
NoAssert.donothing(true, test1.equals(test5));
        assertEquals(true, test2.equals(test5));
NoAssert.donothing(false, test3.equals(test5));
NoAssert.donothing(true, test5.equals(test1));
NoAssert.donothing(true, test5.equals(test2));
NoAssert.donothing(false, test5.equals(test3));
NoAssert.donothing(true, test1.hashCode() == test5.hashCode());
NoAssert.donothing(true, test2.hashCode() == test5.hashCode());
NoAssert.donothing(false, test3.hashCode() == test5.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockInterval()));
NoAssert.donothing(false, test1.equals(new DateTime(TEST_TIME1)));
    }

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();
        }
        public Chronology getChronology() {
            return ISOChronology.getInstance();
        }
        public long getStartMillis() {
            return TEST_TIME1;
        }
        public long getEndMillis() {
            return TEST_TIME2;
        }
    }

    @Test public void testEqualsHashCodeLenient() {
        Interval test1 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        Interval test2 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        assertEquals(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
    }

    @Test public void testEqualsHashCodeStrict() {
        Interval test1 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        Interval test2 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
NoAssert.donothing(true, test1.equals(test2));
        assertEquals(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
    }

    //-----------------------------------------------------------------------
    @Test public void test_useCase_ContainsOverlapAbutGap() {
        // this is a simple test to ensure that the use case of these methods is OK
        // when comparing any two intervals they can be in one and only one of these states
        // (a) have a gap between them, (b) abut or (c) overlap
        // contains is a subset of overlap
        Interval test1020 = new Interval(10, 20);
        
        // [4,8) [10,20) - gap
        Interval interval = new Interval(4, 8);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
        assertEquals(false, interval.overlaps(test1020));
        assertEquals(false, interval.contains(test1020));
        
        // [6,10) [10,20) - abuts
        interval = new Interval(6, 10);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(true, test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
        assertEquals(true, interval.abuts(test1020));
NoAssert.donothing(false, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
        
        // [8,12) [10,20) - overlaps
        interval = new Interval(8, 12);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(true, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
        assertEquals(true, interval.overlaps(test1020));
        assertEquals(false, interval.contains(test1020));
        
        // [10,14) [10,20) - overlaps and contains-one-way
        interval = new Interval(10, 14);
NoAssert.donothing(test1020.gap(interval));
        assertEquals(false, test1020.abuts(interval));
NoAssert.donothing(true, test1020.overlaps(interval));
NoAssert.donothing(true, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
NoAssert.donothing(true, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
        
        // [10,20) [10,20) - overlaps and contains-both-ways
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(test1020));
NoAssert.donothing(true, test1020.overlaps(test1020));
        assertEquals(true, test1020.contains(test1020));
        
        // [10,20) [16,20) - overlaps and contains-one-way
        interval = new Interval(16, 20);
        assertNull(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(true, test1020.overlaps(interval));
NoAssert.donothing(true, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
NoAssert.donothing(true, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
        
        // [10,20) [18,22) - overlaps
        interval = new Interval(18, 22);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(true, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
NoAssert.donothing(true, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
        
        // [10,20) [20,24) - abuts
        interval = new Interval(20, 24);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(true, test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(true, interval.abuts(test1020));
NoAssert.donothing(false, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
        
        // [10,20) [22,26) - gap
        interval = new Interval(22, 26);
        assertNotNull(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
NoAssert.donothing(false, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
    }

    //-----------------------------------------------------------------------
    @Test public void test_useCase_ContainsOverlapAbutGap_zeroDuration() {
        // this is a simple test to ensure that the use case of these methods
        // is OK when considering a zero duration inerval
        // when comparing any two intervals they can be in one and only one of these states
        // (a) have a gap between them, (b) abut or (c) overlap
        // contains is a subset of overlap
        Interval test1020 = new Interval(10, 20);
        
        // [8,8) [10,20) - gap
        Interval interval = new Interval(8, 8);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
NoAssert.donothing(false, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
        
        // [10,10) [10,20) - abuts and contains-one-way
        interval = new Interval(10, 10);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(true,  test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));  // abuts, so can't overlap
NoAssert.donothing(true,  test1020.contains(interval));  // normal contains zero-duration
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(true,  interval.abuts(test1020));
NoAssert.donothing(false, interval.overlaps(test1020));  // abuts, so can't overlap
NoAssert.donothing(false, interval.contains(test1020));  // zero-duration does not contain normal
        
        // [12,12) [10,20) - contains-one-way and overlaps
        interval = new Interval(12, 12);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(true,  test1020.overlaps(interval));
NoAssert.donothing(true,  test1020.contains(interval));  // normal contains zero-duration
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
NoAssert.donothing(true,  interval.overlaps(test1020));
        assertEquals(false, interval.contains(test1020));  // zero-duration does not contain normal
        
        // [10,20) [20,20) - abuts
        interval = new Interval(20, 20);
        assertNull(test1020.gap(interval));
NoAssert.donothing(true,  test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(true,  interval.abuts(test1020));
NoAssert.donothing(false, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
        
        // [10,20) [22,22) - gap
        interval = new Interval(22, 22);
NoAssert.donothing(test1020.gap(interval));
NoAssert.donothing(false, test1020.abuts(interval));
NoAssert.donothing(false, test1020.overlaps(interval));
NoAssert.donothing(false, test1020.contains(interval));
NoAssert.donothing(interval.gap(test1020));
NoAssert.donothing(false, interval.abuts(test1020));
NoAssert.donothing(false, interval.overlaps(test1020));
NoAssert.donothing(false, interval.contains(test1020));
    }

    //-----------------------------------------------------------------------
    @Test public void test_useCase_ContainsOverlapAbutGap_bothZeroDuration() {
        // this is a simple test to ensure that the use case of these methods
        // is OK when considering two zero duration inervals
        // this is the simplest case, as the two intervals either have a gap or not
        // if not, then they are equal and abut
        Interval test0808 = new Interval(8, 8);
        Interval test1010 = new Interval(10, 10);
        
        // [8,8) [10,10) - gap
NoAssert.donothing(test1010.gap(test0808));
NoAssert.donothing(false, test1010.abuts(test0808));
NoAssert.donothing(false, test1010.overlaps(test0808));
NoAssert.donothing(false, test1010.contains(test0808));
NoAssert.donothing(test0808.gap(test1010));
NoAssert.donothing(false, test0808.abuts(test1010));
NoAssert.donothing(false, test0808.overlaps(test1010));
NoAssert.donothing(false, test0808.contains(test1010));
        
        // [10,10) [10,10) - abuts
        assertNull(test1010.gap(test1010));
NoAssert.donothing(true,  test1010.abuts(test1010));
NoAssert.donothing(false, test1010.overlaps(test1010));
NoAssert.donothing(false, test1010.contains(test1010));
    }

    //-----------------------------------------------------------------------
    @Test public void testContains_long() {
NoAssert.donothing(false, interval37.contains(2));  // value before
NoAssert.donothing(true,  interval37.contains(3));
NoAssert.donothing(true,  interval37.contains(4));
NoAssert.donothing(true,  interval37.contains(5));
NoAssert.donothing(true,  interval37.contains(6));
NoAssert.donothing(false, interval37.contains(7));  // value after
NoAssert.donothing(false, interval37.contains(8));  // value after
    }

    @Test public void testContains_long_zeroDuration() {
NoAssert.donothing(false, interval33.contains(2));  // value before
NoAssert.donothing(false, interval33.contains(3));  // zero length duration contains nothing
NoAssert.donothing(false, interval33.contains(4));  // value after
    }

    //-----------------------------------------------------------------------
    @Test public void testContainsNow() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval37.containsNow());  // value before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(true,  interval37.containsNow());
        DateTimeUtils.setCurrentMillisFixed(4);
        assertEquals(true,  interval37.containsNow());
        DateTimeUtils.setCurrentMillisFixed(6);
        assertEquals(true,  interval37.containsNow());
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(false, interval37.containsNow());  // value after
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false, interval37.containsNow());  // value after
        
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval33.containsNow());  // value before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval33.containsNow());  // zero length duration contains nothing
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval33.containsNow());  // value after
    }

    //-----------------------------------------------------------------------
    @Test public void testContains_RI() {
NoAssert.donothing(false, interval37.contains(new Instant(2)));  // value before
NoAssert.donothing(true,  interval37.contains(new Instant(3)));
NoAssert.donothing(true,  interval37.contains(new Instant(4)));
NoAssert.donothing(true,  interval37.contains(new Instant(5)));
        assertEquals(true,  interval37.contains(new Instant(6)));
NoAssert.donothing(false, interval37.contains(new Instant(7)));  // value after
NoAssert.donothing(false, interval37.contains(new Instant(8)));  // value after
    }

    @Test public void testContains_RI_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval37.contains((ReadableInstant) null));  // value before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(true,  interval37.contains((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(true,  interval37.contains((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(true,  interval37.contains((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(false, interval37.contains((ReadableInstant) null));  // value after
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false, interval37.contains((ReadableInstant) null));  // value after
    }

    @Test public void testContains_RI_zeroDuration() {
NoAssert.donothing(false, interval33.contains(new Instant(2)));  // value before
NoAssert.donothing(false, interval33.contains(new Instant(3)));  // zero length duration contains nothing
NoAssert.donothing(false, interval33.contains(new Instant(4)));  // value after
    }

    //-----------------------------------------------------------------------
    @Test public void testContains_RInterval() {
NoAssert.donothing(false, interval37.contains(new Interval(1, 2)));  // gap before
NoAssert.donothing(false, interval37.contains(new Interval(2, 2)));  // gap before
        
NoAssert.donothing(false, interval37.contains(new Interval(2, 3)));  // abuts before
NoAssert.donothing(true,  interval37.contains(new Interval(3, 3)));
        
NoAssert.donothing(false, interval37.contains(new Interval(2, 4)));  // starts before
NoAssert.donothing(true,  interval37.contains(new Interval(3, 4)));
NoAssert.donothing(true,  interval37.contains(new Interval(4, 4)));
        
NoAssert.donothing(false, interval37.contains(new Interval(2, 6)));  // starts before
NoAssert.donothing(true,  interval37.contains(new Interval(3, 6)));
NoAssert.donothing(true,  interval37.contains(new Interval(4, 6)));
NoAssert.donothing(true,  interval37.contains(new Interval(5, 6)));
NoAssert.donothing(true,  interval37.contains(new Interval(6, 6)));
        
NoAssert.donothing(false, interval37.contains(new Interval(2, 7)));  // starts before
NoAssert.donothing(true,  interval37.contains(new Interval(3, 7)));
NoAssert.donothing(true,  interval37.contains(new Interval(4, 7)));
NoAssert.donothing(true,  interval37.contains(new Interval(5, 7)));
        assertEquals(true,  interval37.contains(new Interval(6, 7)));
NoAssert.donothing(false, interval37.contains(new Interval(7, 7)));  // abuts after
        
NoAssert.donothing(false, interval37.contains(new Interval(2, 8)));  // ends after
        assertEquals(false, interval37.contains(new Interval(3, 8)));  // ends after
NoAssert.donothing(false, interval37.contains(new Interval(4, 8)));  // ends after
NoAssert.donothing(false, interval37.contains(new Interval(5, 8)));  // ends after
NoAssert.donothing(false, interval37.contains(new Interval(6, 8)));  // ends after
NoAssert.donothing(false, interval37.contains(new Interval(7, 8)));  // abuts after
NoAssert.donothing(false, interval37.contains(new Interval(8, 8)));  // gap after
        
NoAssert.donothing(false, interval37.contains(new Interval(8, 9)));  // gap after
NoAssert.donothing(false, interval37.contains(new Interval(9, 9)));  // gap after
    }

    @Test public void testContains_RInterval_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval37.contains((ReadableInterval) null));  // gap before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(true,  interval37.contains((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(true,  interval37.contains((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(true,  interval37.contains((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(false, interval37.contains((ReadableInterval) null));  // abuts after
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false, interval37.contains((ReadableInterval) null));  // gap after
    }

    @Test public void testContains_RInterval_zeroDuration() {
NoAssert.donothing(false, interval33.contains(interval33));  // zero length duration contains nothing
NoAssert.donothing(false, interval33.contains(interval37));  // zero-duration cannot contain anything
NoAssert.donothing(true,  interval37.contains(interval33));
        assertEquals(false, interval33.contains(new Interval(1, 2)));  // zero-duration cannot contain anything
NoAssert.donothing(false, interval33.contains(new Interval(8, 9)));  // zero-duration cannot contain anything
NoAssert.donothing(false, interval33.contains(new Interval(1, 9)));  // zero-duration cannot contain anything
        
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval33.contains((ReadableInterval) null));  // gap before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval33.contains((ReadableInterval) null));  // zero length duration contains nothing
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval33.contains((ReadableInterval) null));  // gap after
    }

    //-----------------------------------------------------------------------
    @Test public void testOverlaps_RInterval() {
NoAssert.donothing(false, interval37.overlaps(new Interval(1, 2)));  // gap before
NoAssert.donothing(false, interval37.overlaps(new Interval(2, 2)));  // gap before
        
NoAssert.donothing(false, interval37.overlaps(new Interval(2, 3)));  // abuts before
NoAssert.donothing(false, interval37.overlaps(new Interval(3, 3)));  // abuts before
        
NoAssert.donothing(true,  interval37.overlaps(new Interval(2, 4)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(3, 4)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(4, 4)));
        
NoAssert.donothing(true,  interval37.overlaps(new Interval(2, 6)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(3, 6)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(4, 6)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(5, 6)));
        assertEquals(true,  interval37.overlaps(new Interval(6, 6)));
        
NoAssert.donothing(true,  interval37.overlaps(new Interval(2, 7)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(3, 7)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(4, 7)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(5, 7)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(6, 7)));
NoAssert.donothing(false, interval37.overlaps(new Interval(7, 7)));  // abuts after
        
NoAssert.donothing(true,  interval37.overlaps(new Interval(2, 8)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(3, 8)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(4, 8)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(5, 8)));
NoAssert.donothing(true,  interval37.overlaps(new Interval(6, 8)));
NoAssert.donothing(false, interval37.overlaps(new Interval(7, 8)));  // abuts after
NoAssert.donothing(false, interval37.overlaps(new Interval(8, 8)));  // gap after
        
NoAssert.donothing(false, interval37.overlaps(new Interval(8, 9)));  // gap after
NoAssert.donothing(false, interval37.overlaps(new Interval(9, 9)));  // gap after
    }

    @Test public void testOverlaps_RInterval_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval37.overlaps((ReadableInterval) null));  // gap before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval37.overlaps((ReadableInterval) null));  // abuts before
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(true,  interval37.overlaps((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(true,  interval37.overlaps((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(false, interval37.overlaps((ReadableInterval) null));  // abuts after
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false, interval37.overlaps((ReadableInterval) null));  // gap after
        
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval33.overlaps((ReadableInterval) null));  // abuts before and after
    }

    @Test public void testOverlaps_RInterval_zeroDuration() {
NoAssert.donothing(false, interval33.overlaps(interval33));  // abuts before and after
NoAssert.donothing(false, interval33.overlaps(interval37));  // abuts before
NoAssert.donothing(false, interval37.overlaps(interval33));  // abuts before
NoAssert.donothing(false, interval33.overlaps(new Interval(1, 2)));
NoAssert.donothing(false, interval33.overlaps(new Interval(8, 9)));
NoAssert.donothing(true,  interval33.overlaps(new Interval(1, 9)));
    }

    //-----------------------------------------------------------------------
    @Test public void testOverlap_RInterval() {
NoAssert.donothing(null, interval37.overlap(new Interval(1, 2)));  // gap before
NoAssert.donothing(null, interval37.overlap(new Interval(2, 2)));  // gap before
        
NoAssert.donothing(null, interval37.overlap(new Interval(2, 3)));  // abuts before
NoAssert.donothing(null, interval37.overlap(new Interval(3, 3)));  // abuts before
        
NoAssert.donothing(new Interval(3, 4), interval37.overlap(new Interval(2, 4)));  // truncated start
NoAssert.donothing(new Interval(3, 4), interval37.overlap(new Interval(3, 4)));
NoAssert.donothing(new Interval(4, 4), interval37.overlap(new Interval(4, 4)));
        
NoAssert.donothing(new Interval(3, 7), interval37.overlap(new Interval(2, 7)));  // truncated start
NoAssert.donothing(new Interval(3, 7), interval37.overlap(new Interval(3, 7)));
NoAssert.donothing(new Interval(4, 7), interval37.overlap(new Interval(4, 7)));
NoAssert.donothing(new Interval(5, 7), interval37.overlap(new Interval(5, 7)));
NoAssert.donothing(new Interval(6, 7), interval37.overlap(new Interval(6, 7)));
NoAssert.donothing(null, interval37.overlap(new Interval(7, 7)));  // abuts after
        
NoAssert.donothing(new Interval(3, 7), interval37.overlap(new Interval(2, 8)));  // truncated start and end
NoAssert.donothing(new Interval(3, 7), interval37.overlap(new Interval(3, 8)));  // truncated end
        assertEquals(new Interval(4, 7), interval37.overlap(new Interval(4, 8)));  // truncated end
NoAssert.donothing(new Interval(5, 7), interval37.overlap(new Interval(5, 8)));  // truncated end
NoAssert.donothing(new Interval(6, 7), interval37.overlap(new Interval(6, 8)));  // truncated end
NoAssert.donothing(null, interval37.overlap(new Interval(7, 8)));  // abuts after
NoAssert.donothing(null, interval37.overlap(new Interval(8, 8)));  // gap after
    }

    @Test public void testOverlap_RInterval_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(null, interval37.overlap((ReadableInterval) null));  // gap before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(null, interval37.overlap((ReadableInterval) null));  // abuts before
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(new Interval(4, 4), interval37.overlap((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(new Interval(6, 6), interval37.overlap((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(null, interval37.overlap((ReadableInterval) null));  // abuts after
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(null, interval37.overlap((ReadableInterval) null));  // gap after
        
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(null, interval33.overlap((ReadableInterval) null));  // abuts before and after
    }

    @Test public void testOverlap_RInterval_zone() {
        Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON));
        assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology());
        
        Interval testB = new Interval(new DateTime(4, MOSCOW), new DateTime(8, MOSCOW));
        assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology());
        
        Interval resultAB = testA.overlap(testB);
NoAssert.donothing(ISOChronology.getInstance(LONDON), resultAB.getChronology());
        
        Interval resultBA = testB.overlap(testA);
NoAssert.donothing(ISOChronology.getInstance(MOSCOW), resultBA.getChronology());
    }

    @Test public void testOverlap_RInterval_zoneUTC() {
        Interval testA = new Interval(new Instant(3), new Instant(7));
NoAssert.donothing(ISOChronology.getInstanceUTC(), testA.getChronology());
        
        Interval testB = new Interval(new Instant(4), new Instant(8));
NoAssert.donothing(ISOChronology.getInstanceUTC(), testB.getChronology());
        
        Interval result = testA.overlap(testB);
NoAssert.donothing(ISOChronology.getInstanceUTC(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testGap_RInterval() {
NoAssert.donothing(new Interval(1, 3), interval37.gap(new Interval(0, 1)));
NoAssert.donothing(new Interval(1, 3), interval37.gap(new Interval(1, 1)));
        
NoAssert.donothing(null, interval37.gap(new Interval(2, 3)));  // abuts before
NoAssert.donothing(null, interval37.gap(new Interval(3, 3)));  // abuts before
        
NoAssert.donothing(null, interval37.gap(new Interval(4, 6)));  // overlaps
        
        assertEquals(null, interval37.gap(new Interval(3, 7)));  // overlaps
NoAssert.donothing(null, interval37.gap(new Interval(6, 7)));  // overlaps
NoAssert.donothing(null, interval37.gap(new Interval(7, 7)));  // abuts after
        
NoAssert.donothing(null, interval37.gap(new Interval(6, 8)));  // overlaps
NoAssert.donothing(null, interval37.gap(new Interval(7, 8)));  // abuts after
NoAssert.donothing(new Interval(7, 8), interval37.gap(new Interval(8, 8)));
        
NoAssert.donothing(null, interval37.gap(new Interval(6, 9)));  // overlaps
NoAssert.donothing(null, interval37.gap(new Interval(7, 9)));  // abuts after
NoAssert.donothing(new Interval(7, 8), interval37.gap(new Interval(8, 9)));
NoAssert.donothing(new Interval(7, 9), interval37.gap(new Interval(9, 9)));
    }

    @Test public void testGap_RInterval_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(new Interval(2, 3),  interval37.gap((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(null,  interval37.gap((ReadableInterval) null));  // abuts before
        DateTimeUtils.setCurrentMillisFixed(4);
        assertEquals(null,  interval37.gap((ReadableInterval) null));  // overlaps
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(null,  interval37.gap((ReadableInterval) null));  // overlaps
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(null,  interval37.gap((ReadableInterval) null));  // abuts after
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(new Interval(7, 8),  interval37.gap((ReadableInterval) null));
    }

    @Test public void testGap_RInterval_zone() {
        Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON));
NoAssert.donothing(ISOChronology.getInstance(LONDON), testA.getChronology());
        
        Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW));
NoAssert.donothing(ISOChronology.getInstance(MOSCOW), testB.getChronology());
        
        Interval resultAB = testA.gap(testB);
NoAssert.donothing(ISOChronology.getInstance(LONDON), resultAB.getChronology());
        
        Interval resultBA = testB.gap(testA);
NoAssert.donothing(ISOChronology.getInstance(MOSCOW), resultBA.getChronology());
    }

    @Test public void testGap_RInterval_zoneUTC() {
        Interval testA = new Interval(new Instant(3), new Instant(7));
NoAssert.donothing(ISOChronology.getInstanceUTC(), testA.getChronology());
        
        Interval testB = new Interval(new Instant(1), new Instant(2));
NoAssert.donothing(ISOChronology.getInstanceUTC(), testB.getChronology());
        
        Interval result = testA.gap(testB);
NoAssert.donothing(ISOChronology.getInstanceUTC(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testAbuts_RInterval() {
NoAssert.donothing(false, interval37.abuts(new Interval(1, 2)));  // gap before
NoAssert.donothing(false, interval37.abuts(new Interval(2, 2)));  // gap before
        
NoAssert.donothing(true,  interval37.abuts(new Interval(2, 3)));
NoAssert.donothing(true,  interval37.abuts(new Interval(3, 3)));
        
NoAssert.donothing(false, interval37.abuts(new Interval(2, 4)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(3, 4)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(4, 4)));  // overlaps
        
NoAssert.donothing(false, interval37.abuts(new Interval(2, 6)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(3, 6)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(4, 6)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(5, 6)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(6, 6)));  // overlaps
        
NoAssert.donothing(false, interval37.abuts(new Interval(2, 7)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(3, 7)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(4, 7)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(5, 7)));  // overlaps
        assertEquals(false, interval37.abuts(new Interval(6, 7)));  // overlaps
NoAssert.donothing(true,  interval37.abuts(new Interval(7, 7)));
        
NoAssert.donothing(false, interval37.abuts(new Interval(2, 8)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(3, 8)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(4, 8)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(5, 8)));  // overlaps
NoAssert.donothing(false, interval37.abuts(new Interval(6, 8)));  // overlaps
NoAssert.donothing(true,  interval37.abuts(new Interval(7, 8)));
NoAssert.donothing(false, interval37.abuts(new Interval(8, 8)));  // gap after
        
NoAssert.donothing(false, interval37.abuts(new Interval(8, 9)));  // gap after
NoAssert.donothing(false, interval37.abuts(new Interval(9, 9)));  // gap after
    }

    @Test public void testAbuts_RInterval_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false,  interval37.abuts((ReadableInterval) null));  // gap before
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(true,  interval37.abuts((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false,  interval37.abuts((ReadableInterval) null));  // overlaps
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(false,  interval37.abuts((ReadableInterval) null));  // overlaps
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(true,  interval37.abuts((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false,  interval37.abuts((ReadableInterval) null));  // gap after
    }

    //-----------------------------------------------------------------------
    @Test public void testIsEqual_RI() {
NoAssert.donothing(false, interval37.isEqual(interval33));
NoAssert.donothing(true, interval37.isEqual(interval37));
    }

    //-----------------------------------------------------------------------
    @Test public void testIsBefore_long() {
NoAssert.donothing(false, interval37.isBefore(2));
NoAssert.donothing(false, interval37.isBefore(3));
NoAssert.donothing(false, interval37.isBefore(4));
NoAssert.donothing(false, interval37.isBefore(5));
NoAssert.donothing(false, interval37.isBefore(6));
NoAssert.donothing(true,  interval37.isBefore(7));
NoAssert.donothing(true,  interval37.isBefore(8));
    }

    @Test public void testIsBeforeNow() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval37.isBeforeNow());
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval37.isBeforeNow());
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval37.isBeforeNow());
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(false, interval37.isBeforeNow());
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(true, interval37.isBeforeNow());
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(true, interval37.isBeforeNow());
    }

    @Test public void testIsBefore_RI() {
NoAssert.donothing(false, interval37.isBefore(new Instant(2)));
        assertEquals(false, interval37.isBefore(new Instant(3)));
NoAssert.donothing(false, interval37.isBefore(new Instant(4)));
NoAssert.donothing(false, interval37.isBefore(new Instant(5)));
NoAssert.donothing(false, interval37.isBefore(new Instant(6)));
NoAssert.donothing(true,  interval37.isBefore(new Instant(7)));
NoAssert.donothing(true,  interval37.isBefore(new Instant(8)));
    }

    @Test public void testIsBefore_RI_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
        assertEquals(false, interval37.isBefore((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval37.isBefore((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval37.isBefore((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(false, interval37.isBefore((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(true, interval37.isBefore((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(true, interval37.isBefore((ReadableInstant) null));
    }

    @Test public void testIsBefore_RInterval() {
NoAssert.donothing(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 2)));
NoAssert.donothing(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 3)));
NoAssert.donothing(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 4)));
        
NoAssert.donothing(false, interval37.isBefore(new Interval(6, Long.MAX_VALUE)));
NoAssert.donothing(true, interval37.isBefore(new Interval(7, Long.MAX_VALUE)));
NoAssert.donothing(true, interval37.isBefore(new Interval(8, Long.MAX_VALUE)));
    }

    @Test public void testIsBefore_RInterval_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(false, interval37.isBefore((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval37.isBefore((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval37.isBefore((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(false, interval37.isBefore((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(true, interval37.isBefore((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(true, interval37.isBefore((ReadableInterval) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testIsAfter_long() {
NoAssert.donothing(true,  interval37.isAfter(2));
NoAssert.donothing(false, interval37.isAfter(3));
NoAssert.donothing(false, interval37.isAfter(4));
NoAssert.donothing(false, interval37.isAfter(5));
NoAssert.donothing(false, interval37.isAfter(6));
        assertEquals(false, interval37.isAfter(7));
NoAssert.donothing(false, interval37.isAfter(8));
    }

    @Test public void testIsAfterNow() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(true, interval37.isAfterNow());
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval37.isAfterNow());
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval37.isAfterNow());
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(false, interval37.isAfterNow());
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(false, interval37.isAfterNow());
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false, interval37.isAfterNow());
    }

    @Test public void testIsAfter_RI() {
NoAssert.donothing(true,  interval37.isAfter(new Instant(2)));
NoAssert.donothing(false, interval37.isAfter(new Instant(3)));
NoAssert.donothing(false, interval37.isAfter(new Instant(4)));
NoAssert.donothing(false, interval37.isAfter(new Instant(5)));
NoAssert.donothing(false, interval37.isAfter(new Instant(6)));
NoAssert.donothing(false, interval37.isAfter(new Instant(7)));
NoAssert.donothing(false, interval37.isAfter(new Instant(8)));
    }

    @Test public void testIsAfter_RI_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
        assertEquals(true, interval37.isAfter((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(false, interval37.isAfter((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval37.isAfter((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(false, interval37.isAfter((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(false, interval37.isAfter((ReadableInstant) null));
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false, interval37.isAfter((ReadableInstant) null));
    }

    @Test public void testIsAfter_RInterval() {
NoAssert.donothing(true, interval37.isAfter(new Interval(Long.MIN_VALUE, 2)));
NoAssert.donothing(true, interval37.isAfter(new Interval(Long.MIN_VALUE, 3)));
NoAssert.donothing(false, interval37.isAfter(new Interval(Long.MIN_VALUE, 4)));
        
NoAssert.donothing(false, interval37.isAfter(new Interval(6, Long.MAX_VALUE)));
        assertEquals(false, interval37.isAfter(new Interval(7, Long.MAX_VALUE)));
NoAssert.donothing(false, interval37.isAfter(new Interval(8, Long.MAX_VALUE)));
    }

    @Test public void testIsAfter_RInterval_null() {
        DateTimeUtils.setCurrentMillisFixed(2);
NoAssert.donothing(true, interval37.isAfter((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(3);
NoAssert.donothing(true, interval37.isAfter((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(4);
NoAssert.donothing(false, interval37.isAfter((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(6);
NoAssert.donothing(false, interval37.isAfter((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(7);
NoAssert.donothing(false, interval37.isAfter((ReadableInterval) null));
        DateTimeUtils.setCurrentMillisFixed(8);
NoAssert.donothing(false, interval37.isAfter((ReadableInterval) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToInterval1() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval result = test.toInterval();
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToMutableInterval1() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        MutableInterval result = test.toMutableInterval();
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriod() {
        DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        Interval base = new Interval(dt1, dt2);
        
        Period test = base.toPeriod();
        Period expected = new Period(dt1, dt2, PeriodType.standard());
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriod_PeriodType1() {
        DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        Interval base = new Interval(dt1, dt2);
        
        Period test = base.toPeriod(null);
        Period expected = new Period(dt1, dt2, PeriodType.standard());
NoAssert.donothing(expected, test);
    }

    @Test public void testToPeriod_PeriodType2() {
        DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18);
        Interval base = new Interval(dt1, dt2);
        
        Period test = base.toPeriod(PeriodType.yearWeekDayTime());
        Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime());
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Interval result = (Interval) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC);
        DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC);
        Interval test = new Interval(dt1, dt2);
NoAssert.donothing("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString());
    }

    @Test public void testToString_reparse() {
        DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.getDefault());
        DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.getDefault());
        Interval test = new Interval(dt1, dt2);
NoAssert.donothing(test, new Interval(test.toString()));
    }

    //-----------------------------------------------------------------------
    @Test public void testWithChronology1() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withChronology(BuddhistChronology.getInstance());
NoAssert.donothing(new Interval(TEST_TIME1, TEST_TIME2, BuddhistChronology.getInstance()), test);
    }

    @Test public void testWithChronology2() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withChronology(null);
NoAssert.donothing(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test);
    }

    @Test public void testWithChronology3() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withChronology(COPTIC_PARIS);
NoAssert.donothing(base, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithStartMillis_long1() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withStartMillis(TEST_TIME1 - 1);
NoAssert.donothing(new Interval(TEST_TIME1 - 1, TEST_TIME2, COPTIC_PARIS), test);
    }

    @Test public void testWithStartMillis_long2() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        try {
            test.withStartMillis(TEST_TIME2 + 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithStartMillis_long3() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withStartMillis(TEST_TIME1);
NoAssert.donothing(base, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithStartInstant_RI1() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withStart(new Instant(TEST_TIME1 - 1));
NoAssert.donothing(new Interval(TEST_TIME1 - 1, TEST_TIME2, COPTIC_PARIS), test);
    }

    @Test public void testWithStartInstant_RI2() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        try {
            test.withStart(new Instant(TEST_TIME2 + 1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithStartInstant_RI3() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withStart(null);
NoAssert.donothing(new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithEndMillis_long1() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withEndMillis(TEST_TIME2 - 1);
NoAssert.donothing(new Interval(TEST_TIME1, TEST_TIME2 - 1, COPTIC_PARIS), test);
    }

    @Test public void testWithEndMillis_long2() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        try {
            test.withEndMillis(TEST_TIME1 - 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithEndMillis_long3() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withEndMillis(TEST_TIME2);
NoAssert.donothing(base, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithEndInstant_RI1() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withEnd(new Instant(TEST_TIME2 - 1));
NoAssert.donothing(new Interval(TEST_TIME1, TEST_TIME2 - 1, COPTIC_PARIS), test);
    }

    @Test public void testWithEndInstant_RI2() {
        Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        try {
            test.withEnd(new Instant(TEST_TIME1 - 1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithEndInstant_RI3() {
        Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withEnd(null);
NoAssert.donothing(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithDurationAfterStart1() throws Throwable {
        Duration dur = new Duration(TEST_TIME2 - TEST_TIME_NOW);
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS);
        Interval test = base.withDurationAfterStart(dur);
        
NoAssert.donothing(new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS), test);
    }

    @Test public void testWithDurationAfterStart2() throws Throwable {
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withDurationAfterStart(null);
        
NoAssert.donothing(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test);
    }

    @Test public void testWithDurationAfterStart3() throws Throwable {
        Duration dur = new Duration(-1);
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        try {
            base.withDurationAfterStart(dur);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithDurationAfterStart4() throws Throwable {
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withDurationAfterStart(base.toDuration());
        
NoAssert.donothing(base, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithDurationBeforeEnd1() throws Throwable {
        Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1);
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS);
        Interval test = base.withDurationBeforeEnd(dur);
        
NoAssert.donothing(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test);
    }

    @Test public void testWithDurationBeforeEnd2() throws Throwable {
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withDurationBeforeEnd(null);
        
NoAssert.donothing(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test);
    }

    @Test public void testWithDurationBeforeEnd3() throws Throwable {
        Duration dur = new Duration(-1);
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        try {
            base.withDurationBeforeEnd(dur);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithDurationBeforeEnd4() throws Throwable {
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withDurationBeforeEnd(base.toDuration());
        
NoAssert.donothing(base, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithPeriodAfterStart1() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS);
        Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        
        Interval base = new Interval(dt, dt);
        Interval test = base.withPeriodAfterStart(dur);
NoAssert.donothing(new Interval(dt, dur), test);
    }

    @Test public void testWithPeriodAfterStart2() throws Throwable {
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withPeriodAfterStart(null);
        
NoAssert.donothing(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test);
    }

    @Test public void testWithPeriodAfterStart3() throws Throwable {
        Period per = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        try {
            base.withPeriodAfterStart(per);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testWithPeriodBeforeEnd1() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS);
        Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        
        Interval base = new Interval(dt, dt);
        Interval test = base.withPeriodBeforeEnd(dur);
NoAssert.donothing(new Interval(dur, dt), test);
    }

    @Test public void testWithPeriodBeforeEnd2() throws Throwable {
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        Interval test = base.withPeriodBeforeEnd(null);
        
NoAssert.donothing(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test);
    }

    @Test public void testWithPeriodBeforeEnd3() throws Throwable {
        Period per = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        try {
            base.withPeriodBeforeEnd(per);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

}
