/*
 *  Copyright 2001-2015 Stephen Colebourne
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

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone OFFSET_04_00 = DateTimeZone.forOffsetHours(4);
    
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
            
//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Throwable {
        TestInterval_Constructors TB= new TestInterval_Constructors();
        TB.setUp(); TB.testParse_noOffsetInString(); TB.tearDown();
        TB.setUp(); TB.testParse_offsetInString(); TB.tearDown();
        TB.setUp(); TB.testParseWithOffset_noOffsetInString(); TB.tearDown();
        TB.setUp(); TB.testParseWithOffset_offsetInString(); TB.tearDown();
        TB.setUp(); TB.testParseWithOffset_invalid(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_minMax(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_min(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_max(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_Zone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_nullZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_long_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI7(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_chronoStart(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_chronoEnd(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_zones(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RI_instant(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP7(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RP8(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI7(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RP_RI8(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RI_RD5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_RD_RI5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object3(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object4(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object5(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object6(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_Chronology1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_Chronology2(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestInterval_Constructors.class);
    }

    public TestInterval_Constructors(String name) {
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
    @Test public void testParse_noOffsetInString() throws Throwable {
        DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS));
        DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS));
NoAssert.donothing(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30"));
NoAssert.donothing(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H"));
NoAssert.donothing(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30"));
    }

    @Test public void testParse_offsetInString() throws Throwable {
        DateTime start = new DateTime(2010, 6, 30, 10, 30, ISOChronology.getInstance(PARIS));
        DateTime end = new DateTime(2010, 7, 1, 12, 30, ISOChronology.getInstance(PARIS));
NoAssert.donothing(new Interval(start, end), Interval.parse("2010-06-30T12:30+04:00/2010-07-01T14:30+04:00"));
NoAssert.donothing(new Interval(start, end), Interval.parse("2010-06-30T12:30+04:00/P1DT2H"));
NoAssert.donothing(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30+04:00"));
    }

    @Test public void testParseWithOffset_noOffsetInString() throws Throwable {
        DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS));
        DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS));
NoAssert.donothing(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30/2010-07-01T14:30"));
NoAssert.donothing(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30/P1DT2H"));
NoAssert.donothing(new Interval(start, end), Interval.parseWithOffset("P1DT2H/2010-07-01T14:30"));
    }

    @Test public void testParseWithOffset_offsetInString() throws Throwable {
        DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(OFFSET_04_00));
        DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(OFFSET_04_00));
NoAssert.donothing(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30+04:00/2010-07-01T14:30+04:00"));
NoAssert.donothing(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30+04:00/p1DT2H"));
NoAssert.donothing(new Interval(start, end), Interval.parseWithOffset("p1DT2H/2010-07-01T14:30+04:00"));
    }

    @Test public void testParseWithOffset_invalid() throws Throwable {
        try {
            Interval.parseWithOffset("2010-06-30T12:30");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            Interval.parseWithOffset("P1D/P1D");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_long1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1.getMillis(), dt2.getMillis());
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

    @Test public void testConstructor_long_long2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Interval test = new Interval(dt1.getMillis(), dt1.getMillis());
        assertEquals(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt1.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

    @Test public void testConstructor_long_long3() throws Throwable {
        DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        try {
            new Interval(dt1.getMillis(), dt2.getMillis());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_long_long_minMax() throws Throwable {
        Interval test = new Interval(Long.MIN_VALUE, Long.MAX_VALUE);
NoAssert.donothing(Long.MIN_VALUE, test.getStartMillis());
NoAssert.donothing(Long.MAX_VALUE, test.getEndMillis());
NoAssert.donothing(new DateTime(Long.MIN_VALUE), test.getStart());
NoAssert.donothing(new DateTime(Long.MAX_VALUE), test.getEnd());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(test, test.toInterval());
NoAssert.donothing("-292275055-05-16T16:56:25.192+00:09:21/292278994-08-17T07:12:55.807Z", test.toString());
        try {
            test.toDuration();
            fail();
        } catch (ArithmeticException ex) {}
        try {
            test.toDurationMillis();
            fail();
        } catch (ArithmeticException ex) {}
        try {
            test.toPeriod();
            fail();
        } catch (RuntimeException ex) {}
    }

    @Test public void testConstructor_long_long_min() throws Throwable {
        Interval test = new Interval(Long.MIN_VALUE, Long.MIN_VALUE + 9);
NoAssert.donothing(Long.MIN_VALUE, test.getStartMillis());
NoAssert.donothing(Long.MIN_VALUE + 9, test.getEndMillis());
NoAssert.donothing(new DateTime(Long.MIN_VALUE), test.getStart());
NoAssert.donothing(new DateTime(Long.MIN_VALUE + 9), test.getEnd());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(test, test.toInterval());
NoAssert.donothing("-292275055-05-16T16:56:25.192+00:09:21/-292275055-05-16T16:56:25.201+00:09:21", test.toString());
NoAssert.donothing(9, test.toDurationMillis());
        assertEquals(new Duration(9), test.toDuration());
NoAssert.donothing(new Period(9), test.toPeriod());
    }

    @Test public void testConstructor_long_long_max() throws Throwable {
        Interval test = new Interval(Long.MAX_VALUE - 9, Long.MAX_VALUE);
NoAssert.donothing(Long.MAX_VALUE - 9, test.getStartMillis());
NoAssert.donothing(Long.MAX_VALUE, test.getEndMillis());
NoAssert.donothing(new DateTime(Long.MAX_VALUE - 9), test.getStart());
NoAssert.donothing(new DateTime(Long.MAX_VALUE), test.getEnd());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(test, test.toInterval());
NoAssert.donothing("292278994-08-17T07:12:55.798Z/292278994-08-17T07:12:55.807Z", test.toString());
NoAssert.donothing(9, test.toDurationMillis());
NoAssert.donothing(new Duration(9), test.toDuration());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_long_Zone() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), LONDON);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(LONDON), test.getChronology());
    }

    @Test public void testConstructor_long_long_nullZone() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (DateTimeZone) null);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_long_long_Chronology() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), GJChronology.getInstance());
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(GJChronology.getInstance(), test.getChronology());
    }

    @Test public void testConstructor_long_long_nullChronology() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RI_RI1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1, dt2);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RI_RI2() throws Throwable {
        Instant dt1 = new Instant(new DateTime(2004, 6, 9, 0, 0, 0, 0));
        Instant dt2 = new Instant(new DateTime(2005, 7, 10, 1, 1, 1, 1));
        Interval test = new Interval(dt1, dt2);
        assertEquals(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RI_RI3() throws Throwable {
        Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RI4() throws Throwable {
        DateTime dt1 = new DateTime(2000, 6, 9, 0, 0, 0, 0);
        Interval test = new Interval(dt1, (ReadableInstant) null);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RI5() throws Throwable {
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval((ReadableInstant) null, dt2);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RI_RI6() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Interval test = new Interval(dt1, dt1);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt1.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RI_RI7() throws Throwable {
        DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        try {
            new Interval(dt1, dt2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testConstructor_RI_RI_chronoStart() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, GJChronology.getInstance());
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1, dt2);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(GJChronology.getInstance(), test.getChronology());
    }

    @Test public void testConstructor_RI_RI_chronoEnd() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, GJChronology.getInstance());
        Interval test = new Interval(dt1, dt2);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

    @Test public void testConstructor_RI_RI_zones() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, LONDON);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, PARIS);
        Interval test = new Interval(dt1, dt2);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(LONDON), test.getChronology());
    }

    @Test public void testConstructor_RI_RI_instant() throws Throwable {
        Instant dt1 = new Instant(12345678L);
        Instant dt2 = new Instant(22345678L);
        Interval test = new Interval(dt1, dt2);
NoAssert.donothing(12345678L, test.getStartMillis());
NoAssert.donothing(22345678L, test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstanceUTC(), test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RI_RP1() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().months().add(result, 6);
        result = ISOChronology.getInstance().hours().add(result, 1);
        
        Interval test = new Interval(dt, dur);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(result, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RP2() throws Throwable {
        Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstanceUTC().months().add(result, 6);
        result = ISOChronology.getInstanceUTC().days().add(result, 3);
        result = ISOChronology.getInstanceUTC().hours().add(result, 1);
        
        Interval test = new Interval(dt, dur);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(result, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RP3() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW, CopticChronology.getInstanceUTC());
        Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        long result = TEST_TIME_NOW;
        result = CopticChronology.getInstanceUTC().months().add(result, 6);
        result = CopticChronology.getInstanceUTC().days().add(result, 3);
        result = CopticChronology.getInstanceUTC().hours().add(result, 1);
        
        Interval test = new Interval(dt, dur);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(result, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RP4() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().hours().add(result, 1);
        result = ISOChronology.getInstance().millis().add(result, 23);
        
        Interval test = new Interval(dt, dur);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(result, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RP5() throws Throwable {
        Interval test = new Interval((ReadableInstant) null, (ReadablePeriod) null);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RP6() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Interval test = new Interval(dt, (ReadablePeriod) null);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RI_RP7() throws Throwable {
        Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        result = ISOChronology.getInstance().hourOfDay().add(result, 1);
        
        Interval test = new Interval((ReadableInstant) null, dur);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
        assertEquals(result, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RP8() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        try {
            new Interval(dt, dur);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RP_RI1() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().months().add(result, -6);
        result = ISOChronology.getInstance().hours().add(result, -1);
        
        Interval test = new Interval(dur, dt);
NoAssert.donothing(result, test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RP_RI2() throws Throwable {
        Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstanceUTC().months().add(result, -6);
        result = ISOChronology.getInstanceUTC().days().add(result, -3);
        result = ISOChronology.getInstanceUTC().hours().add(result, -1);
        
        Interval test = new Interval(dur, dt);
NoAssert.donothing(result, test.getStartMillis());
        assertEquals(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RP_RI3() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW, CopticChronology.getInstanceUTC());
        Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        long result = TEST_TIME_NOW;
        result = CopticChronology.getInstanceUTC().months().add(result, -6);
        result = CopticChronology.getInstanceUTC().days().add(result, -3);
        result = CopticChronology.getInstanceUTC().hours().add(result, -1);
        
        Interval test = new Interval(dur, dt);
NoAssert.donothing(result, test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RP_RI4() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().hours().add(result, -1);
        result = ISOChronology.getInstance().millis().add(result, -23);
        
        Interval test = new Interval(dur, dt);
NoAssert.donothing(result, test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RP_RI5() throws Throwable {
        Interval test = new Interval((ReadablePeriod) null, (ReadableInstant) null);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
        assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RP_RI6() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Interval test = new Interval((ReadablePeriod) null, dt);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RP_RI7() throws Throwable {
        Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        result = ISOChronology.getInstance().hourOfDay().add(result, -1);
        
        Interval test = new Interval(dur, (ReadableInstant) null);
NoAssert.donothing(result, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RP_RI8() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        try {
            new Interval(dur, dt);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RI_RD1() throws Throwable {
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().months().add(result, 6);
        result = ISOChronology.getInstance().hours().add(result, 1);
        
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Duration dur = new Duration(result - TEST_TIME_NOW);
        
        Interval test = new Interval(dt, dur);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(result, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RD2() throws Throwable {
        Interval test = new Interval((ReadableInstant) null, (ReadableDuration) null);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RD3() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Interval test = new Interval(dt, (ReadableDuration) null);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RI_RD4() throws Throwable {
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        result = ISOChronology.getInstance().hourOfDay().add(result, 1);
        
        Duration dur = new Duration(result - TEST_TIME_NOW);
        
        Interval test = new Interval((ReadableInstant) null, dur);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(result, test.getEndMillis());
    }

    @Test public void testConstructor_RI_RD5() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Duration dur = new Duration(-1);
        try {
            new Interval(dt, dur);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_RD_RI1() throws Throwable {
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().months().add(result, -6);
        result = ISOChronology.getInstance().hours().add(result, -1);
        
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Duration dur = new Duration(TEST_TIME_NOW - result);
        
        Interval test = new Interval(dur, dt);
NoAssert.donothing(result, test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RD_RI2() throws Throwable {
        Interval test = new Interval((ReadableDuration) null, (ReadableInstant) null);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RD_RI3() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Interval test = new Interval((ReadableDuration) null, dt);
NoAssert.donothing(dt.getMillis(), test.getStartMillis());
NoAssert.donothing(dt.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_RD_RI4() throws Throwable {
        long result = TEST_TIME_NOW;
        result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        result = ISOChronology.getInstance().hourOfDay().add(result, -1);
        
        Duration dur = new Duration(TEST_TIME_NOW - result);
        
        Interval test = new Interval(dur, (ReadableInstant) null);
NoAssert.donothing(result, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testConstructor_RD_RI5() throws Throwable {
        DateTime dt = new DateTime(TEST_TIME_NOW);
        Duration dur = new Duration(-1);
        try {
            new Interval(dur, dt);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval test = new Interval(dt1.toString() + '/' + dt2.toString());
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_Object2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval base = new Interval(dt1, dt2);
        
        Interval test = new Interval(base);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_Object3() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        MutableInterval base = new MutableInterval(dt1, dt2);
        
        Interval test = new Interval(base);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_Object4() throws Throwable {
        MockInterval base = new MockInterval();
        Interval test = new Interval(base);
NoAssert.donothing(base.getStartMillis(), test.getStartMillis());
NoAssert.donothing(base.getEndMillis(), test.getEndMillis());
    }

    @Test public void testConstructor_Object5() throws Throwable {
        IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter("");
        IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {
                return false;
            }
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {
                interval.setChronology(chrono);
                interval.setInterval(1234L, 5678L);
            }
            public Class<?> getSupportedType() {
                return String.class;
            }
        };
        try {
            ConverterManager.getInstance().addIntervalConverter(conv);
            DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
            DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
            Interval test = new Interval(dt1.toString() + '/' + dt2.toString());
            assertEquals(1234L, test.getStartMillis());
            assertEquals(5678L, test.getEndMillis());
        } finally {
            ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }

    @Test public void testConstructor_Object6() throws Throwable {
        IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 0L));
        IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {
                return false;
            }
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {
                interval.setChronology(chrono);
                interval.setInterval(1234L, 5678L);
            }
            public Class<?> getSupportedType() {
                return ReadableInterval.class;
            }
        };
        try {
            ConverterManager.getInstance().addIntervalConverter(conv);
            Interval base = new Interval(-1000L, 1000L);
            Interval test = new Interval(base);
            assertEquals(1234L, test.getStartMillis());
            assertEquals(5678L, test.getEndMillis());
        } finally {
            ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {
            return ISOChronology.getInstance();
        }
        public long getStartMillis() {
            return 1234L;
        }
        public DateTime getStart() {
            return new DateTime(1234L);
        }
        public long getEndMillis() {
            return 5678L;
        }
        public DateTime getEnd() {
            return new DateTime(5678L);
        }
        public long toDurationMillis() {
            return (5678L - 1234L);
        }
        public Duration toDuration() {
            return new Duration(5678L - 1234L);
        }
        public boolean contains(long millisInstant) {
            return false;
        }
        public boolean containsNow() {
            return false;
        }
        public boolean contains(ReadableInstant instant) {
            return false;
        }
        public boolean contains(ReadableInterval interval) {
            return false;
        }
        public boolean overlaps(ReadableInterval interval) {
            return false;
        }
        public boolean isBefore(ReadableInstant instant) {
            return false;
        }
        public boolean isBefore(ReadableInterval interval) {
            return false;
        }
        public boolean isAfter(ReadableInstant instant) {
            return false;
        }
        public boolean isAfter(ReadableInterval interval) {
            return false;
        }
        public Interval toInterval() {
            return null;
        }
        public MutableInterval toMutableInterval() {
            return null;
        }
        public Period toPeriod() {
            return null;
        }
        public Period toPeriod(PeriodType type) {
            return null;
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testConstructor_Object_Chronology1() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval base = new Interval(dt1, dt2);
        
        Interval test = new Interval(base, BuddhistChronology.getInstance());
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(BuddhistChronology.getInstance(), test.getChronology());
    }

    @Test public void testConstructor_Object_Chronology2() throws Throwable {
        DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        Interval base = new Interval(dt1, dt2);
        
        Interval test = new Interval(base, null);
NoAssert.donothing(dt1.getMillis(), test.getStartMillis());
NoAssert.donothing(dt2.getMillis(), test.getEndMillis());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
    }

}
