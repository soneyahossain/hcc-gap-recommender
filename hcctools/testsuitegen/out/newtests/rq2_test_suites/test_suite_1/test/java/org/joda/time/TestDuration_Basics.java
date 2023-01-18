/*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.math.RoundingMode;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
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
        TestDuration_Basics TB= new TestDuration_Basics();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testGetMillis(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testCompareTo(); TB.tearDown();
        TB.setUp(); TB.testIsEqual(); TB.tearDown();
        TB.setUp(); TB.testIsBefore(); TB.tearDown();
        TB.setUp(); TB.testIsAfter(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testGetStandardSeconds(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToDuration1(); TB.tearDown();
        TB.setUp(); TB.testToDuration2(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays_overflow(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours_overflow(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes_overflow(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds_overflow(); TB.tearDown();
        TB.setUp(); TB.testToPeriod(); TB.tearDown();
        TB.setUp(); TB.testToPeriod_fixedZone(); TB.tearDown();
        TB.setUp(); TB.testToPeriod_PeriodType(); TB.tearDown();
        TB.setUp(); TB.testToPeriod_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToPeriod_PeriodType_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToPeriodFrom(); TB.tearDown();
        TB.setUp(); TB.testToPeriodFrom_PeriodType(); TB.tearDown();
        TB.setUp(); TB.testToPeriodTo(); TB.tearDown();
        TB.setUp(); TB.testToPeriodTo_PeriodType(); TB.tearDown();
        TB.setUp(); TB.testToIntervalFrom(); TB.tearDown();
        TB.setUp(); TB.testToIntervalTo(); TB.tearDown();
        TB.setUp(); TB.testWithMillis1(); TB.tearDown();
        TB.setUp(); TB.testWithMillis2(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_long_int1(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_long_int2(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_long_int3(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_long_int4(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_long_int5(); TB.tearDown();
        TB.setUp(); TB.testPlus_long1(); TB.tearDown();
        TB.setUp(); TB.testPlus_long2(); TB.tearDown();
        TB.setUp(); TB.testMinus_long1(); TB.tearDown();
        TB.setUp(); TB.testMinus_long2(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy_long1(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy_long2(); TB.tearDown();
        TB.setUp(); TB.testDividedBy_long1(); TB.tearDown();
        TB.setUp(); TB.testDividedBy_long2(); TB.tearDown();
        TB.setUp(); TB.testDividedByRoundingMode_long1(); TB.tearDown();
        TB.setUp(); TB.testDividedByRoundingMode_long2(); TB.tearDown();
        TB.setUp(); TB.testDividedByRoundingMode_long3(); TB.tearDown();
        TB.setUp(); TB.testDividedByRoundingMode_long4(); TB.tearDown();
        TB.setUp(); TB.testNegated_long1(); TB.tearDown();
        TB.setUp(); TB.testNegated_long2(); TB.tearDown();
        TB.setUp(); TB.testNegated_long3(); TB.tearDown();
        TB.setUp(); TB.testAbs(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int1(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int2(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int3(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int4(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int5(); TB.tearDown();
        TB.setUp(); TB.testWithDurationAdded_RD_int6(); TB.tearDown();
        TB.setUp(); TB.testPlus_RD1(); TB.tearDown();
        TB.setUp(); TB.testPlus_RD2(); TB.tearDown();
        TB.setUp(); TB.testPlus_RD3(); TB.tearDown();
        TB.setUp(); TB.testMinus_RD1(); TB.tearDown();
        TB.setUp(); TB.testMinus_RD2(); TB.tearDown();
        TB.setUp(); TB.testMinus_RD3(); TB.tearDown();
        TB.setUp(); TB.testMutableDuration(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDuration_Basics.class);
    }

    public TestDuration_Basics(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
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
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testGetMillis() {
        Duration test = new Duration(0L);
NoAssert.donothing(0, test.getMillis());
        
        test = new Duration(1234567890L);
NoAssert.donothing(1234567890L, test.getMillis());
    }

    @Test public void testEqualsHashCode() {
        Duration test1 = new Duration(123L);
        Duration test2 = new Duration(123L);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        Duration test3 = new Duration(321L);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockDuration(123L)));
    }
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();
            iValue = value;
        }
        public long getMillis() {
            return iValue;
        }
    }

    @Test public void testCompareTo() {
        Duration test1 = new Duration(123L);
        Duration test1a = new Duration(123L);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        Duration test2 = new Duration(321L);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
NoAssert.donothing(+1, test2.compareTo(new MockDuration(123L)));
NoAssert.donothing(0, test1.compareTo(new MockDuration(123L)));
        
        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Long(123L));
//            fail();
//        } catch (ClassCastException ex) {}
    }

    @Test public void testIsEqual() {
        Duration test1 = new Duration(123L);
        Duration test1a = new Duration(123L);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        Duration test2 = new Duration(321L);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
NoAssert.donothing(false, test2.isEqual(new MockDuration(123L)));
NoAssert.donothing(true, test1.isEqual(new MockDuration(123L)));
NoAssert.donothing(false, test1.isEqual(null));
NoAssert.donothing(true, new Duration(0L).isEqual(null));
    }
    
    @Test public void testIsBefore() {
        Duration test1 = new Duration(123L);
        Duration test1a = new Duration(123L);
NoAssert.donothing(false, test1.isShorterThan(test1a));
NoAssert.donothing(false, test1a.isShorterThan(test1));
NoAssert.donothing(false, test1.isShorterThan(test1));
NoAssert.donothing(false, test1a.isShorterThan(test1a));
        
        Duration test2 = new Duration(321L);
NoAssert.donothing(true, test1.isShorterThan(test2));
NoAssert.donothing(false, test2.isShorterThan(test1));
        
NoAssert.donothing(false, test2.isShorterThan(new MockDuration(123L)));
NoAssert.donothing(false, test1.isShorterThan(new MockDuration(123L)));
NoAssert.donothing(false, test1.isShorterThan(null));
NoAssert.donothing(false, new Duration(0L).isShorterThan(null));
    }
    
    @Test public void testIsAfter() {
        Duration test1 = new Duration(123L);
        Duration test1a = new Duration(123L);
NoAssert.donothing(false, test1.isLongerThan(test1a));
NoAssert.donothing(false, test1a.isLongerThan(test1));
NoAssert.donothing(false, test1.isLongerThan(test1));
NoAssert.donothing(false, test1a.isLongerThan(test1a));
        
        Duration test2 = new Duration(321L);
NoAssert.donothing(false, test1.isLongerThan(test2));
NoAssert.donothing(true, test2.isLongerThan(test1));
        
NoAssert.donothing(true, test2.isLongerThan(new MockDuration(123L)));
NoAssert.donothing(false, test1.isLongerThan(new MockDuration(123L)));
NoAssert.donothing(true, test1.isLongerThan(null));
NoAssert.donothing(false, new Duration(0L).isLongerThan(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Duration test = new Duration(123L);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Duration result = (Duration) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testGetStandardSeconds() {
        Duration test = new Duration(0L);
NoAssert.donothing(0, test.getStandardSeconds());
        test = new Duration(1L);
NoAssert.donothing(0, test.getStandardSeconds());
        test = new Duration(999L);
NoAssert.donothing(0, test.getStandardSeconds());
        test = new Duration(1000L);
NoAssert.donothing(1, test.getStandardSeconds());
        test = new Duration(1001L);
NoAssert.donothing(1, test.getStandardSeconds());
        test = new Duration(1999L);
NoAssert.donothing(1, test.getStandardSeconds());
        test = new Duration(2000L);
NoAssert.donothing(2, test.getStandardSeconds());
        test = new Duration(-1L);
NoAssert.donothing(0, test.getStandardSeconds());
        test = new Duration(-999L);
NoAssert.donothing(0, test.getStandardSeconds());
        test = new Duration(-1000L);
NoAssert.donothing(-1, test.getStandardSeconds());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 845L;
        Duration test = new Duration(length);
NoAssert.donothing("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString());
        
NoAssert.donothing("PT0S", new Duration(0L).toString());
NoAssert.donothing("PT10S", new Duration(10000L).toString());
NoAssert.donothing("PT1S", new Duration(1000L).toString());
NoAssert.donothing("PT12.345S", new Duration(12345L).toString());
NoAssert.donothing("PT-12.345S", new Duration(-12345L).toString());
NoAssert.donothing("PT-1.123S", new Duration(-1123L).toString());
NoAssert.donothing("PT-0.123S", new Duration(-123L).toString());
NoAssert.donothing("PT-0.012S", new Duration(-12L).toString());
NoAssert.donothing("PT-0.001S", new Duration(-1L).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToDuration1() {
        Duration test = new Duration(123L);
        Duration result = test.toDuration();
NoAssert.donothing(test, result);
    }
    
    @Test public void testToDuration2() {
        MockDuration test = new MockDuration(123L);
        Duration result = test.toDuration();
NoAssert.donothing(test, result);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardDays() {
        Duration test = new Duration(0L);
NoAssert.donothing(Days.days(0), test.toStandardDays());
        test = new Duration(1L);
NoAssert.donothing(Days.days(0), test.toStandardDays());
        test = new Duration(24 * 60 * 60000L - 1);
NoAssert.donothing(Days.days(0), test.toStandardDays());
        test = new Duration(24 * 60 * 60000L);
NoAssert.donothing(Days.days(1), test.toStandardDays());
        test = new Duration(24 * 60 * 60000L + 1);
NoAssert.donothing(Days.days(1), test.toStandardDays());
        test = new Duration(2 * 24 * 60 * 60000L - 1);
NoAssert.donothing(Days.days(1), test.toStandardDays());
        test = new Duration(2 * 24 * 60 * 60000L);
NoAssert.donothing(Days.days(2), test.toStandardDays());
        test = new Duration(-1L);
NoAssert.donothing(Days.days(0), test.toStandardDays());
        test = new Duration(-24 * 60 * 60000L + 1);
NoAssert.donothing(Days.days(0), test.toStandardDays());
        test = new Duration(-24 * 60 * 60000L);
NoAssert.donothing(Days.days(-1), test.toStandardDays());
    }

    @Test public void testToStandardDays_overflow() {
        Duration test = new Duration((((long) Integer.MAX_VALUE) + 1) * 24L * 60L * 60000L);
        try {
            test.toStandardDays();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardHours() {
        Duration test = new Duration(0L);
NoAssert.donothing(Hours.hours(0), test.toStandardHours());
        test = new Duration(1L);
NoAssert.donothing(Hours.hours(0), test.toStandardHours());
        test = new Duration(3600000L - 1);
NoAssert.donothing(Hours.hours(0), test.toStandardHours());
        test = new Duration(3600000L);
NoAssert.donothing(Hours.hours(1), test.toStandardHours());
        test = new Duration(3600000L + 1);
NoAssert.donothing(Hours.hours(1), test.toStandardHours());
        test = new Duration(2 * 3600000L - 1);
NoAssert.donothing(Hours.hours(1), test.toStandardHours());
        test = new Duration(2 * 3600000L);
NoAssert.donothing(Hours.hours(2), test.toStandardHours());
        test = new Duration(-1L);
NoAssert.donothing(Hours.hours(0), test.toStandardHours());
        test = new Duration(-3600000L + 1);
NoAssert.donothing(Hours.hours(0), test.toStandardHours());
        test = new Duration(-3600000L);
        assertEquals(Hours.hours(-1), test.toStandardHours());
    }

    @Test public void testToStandardHours_overflow() {
        Duration test = new Duration(((long) Integer.MAX_VALUE) * 3600000L + 3600000L);
        try {
            test.toStandardHours();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardMinutes() {
        Duration test = new Duration(0L);
NoAssert.donothing(Minutes.minutes(0), test.toStandardMinutes());
        test = new Duration(1L);
NoAssert.donothing(Minutes.minutes(0), test.toStandardMinutes());
        test = new Duration(60000L - 1);
NoAssert.donothing(Minutes.minutes(0), test.toStandardMinutes());
        test = new Duration(60000L);
NoAssert.donothing(Minutes.minutes(1), test.toStandardMinutes());
        test = new Duration(60000L + 1);
NoAssert.donothing(Minutes.minutes(1), test.toStandardMinutes());
        test = new Duration(2 * 60000L - 1);
NoAssert.donothing(Minutes.minutes(1), test.toStandardMinutes());
        test = new Duration(2 * 60000L);
NoAssert.donothing(Minutes.minutes(2), test.toStandardMinutes());
        test = new Duration(-1L);
NoAssert.donothing(Minutes.minutes(0), test.toStandardMinutes());
        test = new Duration(-60000L + 1);
NoAssert.donothing(Minutes.minutes(0), test.toStandardMinutes());
        test = new Duration(-60000L);
NoAssert.donothing(Minutes.minutes(-1), test.toStandardMinutes());
    }

    @Test public void testToStandardMinutes_overflow() {
        Duration test = new Duration(((long) Integer.MAX_VALUE) * 60000L + 60000L);
        try {
            test.toStandardMinutes();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardSeconds() {
        Duration test = new Duration(0L);
NoAssert.donothing(Seconds.seconds(0), test.toStandardSeconds());
        test = new Duration(1L);
NoAssert.donothing(Seconds.seconds(0), test.toStandardSeconds());
        test = new Duration(999L);
NoAssert.donothing(Seconds.seconds(0), test.toStandardSeconds());
        test = new Duration(1000L);
NoAssert.donothing(Seconds.seconds(1), test.toStandardSeconds());
        test = new Duration(1001L);
NoAssert.donothing(Seconds.seconds(1), test.toStandardSeconds());
        test = new Duration(1999L);
NoAssert.donothing(Seconds.seconds(1), test.toStandardSeconds());
        test = new Duration(2000L);
NoAssert.donothing(Seconds.seconds(2), test.toStandardSeconds());
        test = new Duration(-1L);
NoAssert.donothing(Seconds.seconds(0), test.toStandardSeconds());
        test = new Duration(-999L);
NoAssert.donothing(Seconds.seconds(0), test.toStandardSeconds());
        test = new Duration(-1000L);
NoAssert.donothing(Seconds.seconds(-1), test.toStandardSeconds());
    }

    @Test public void testToStandardSeconds_overflow() {
        Duration test = new Duration(((long) Integer.MAX_VALUE) * 1000L + 1000L);
        try {
            test.toStandardSeconds();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriod() {
        DateTimeZone zone = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris"));
            long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                5L * DateTimeConstants.MILLIS_PER_HOUR +
                6L * DateTimeConstants.MILLIS_PER_MINUTE +
                7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            Duration dur = new Duration(length);
            Period test = dur.toPeriod();
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((450 * 24) + 5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
        } finally {
            DateTimeZone.setDefault(zone);
        }
    }

    @Test public void testToPeriod_fixedZone() throws Throwable {
        DateTimeZone zone = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.forOffsetHours(2));
            long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                5L * DateTimeConstants.MILLIS_PER_HOUR +
                6L * DateTimeConstants.MILLIS_PER_MINUTE +
                7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            Duration dur = new Duration(length);
            Period test = dur.toPeriod();
NoAssert.donothing(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
NoAssert.donothing(0, test.getMonths());
NoAssert.donothing(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
NoAssert.donothing((450 * 24) + 5, test.getHours());
            assertEquals(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
        } finally {
            DateTimeZone.setDefault(zone);
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriod_PeriodType() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        Period result = test.toPeriod(PeriodType.standard().withMillisRemoved());
NoAssert.donothing(new Period(test, PeriodType.standard().withMillisRemoved()), result);
NoAssert.donothing(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriod_Chronology() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        Period result = test.toPeriod(ISOChronology.getInstanceUTC());
NoAssert.donothing(new Period(test, ISOChronology.getInstanceUTC()), result);
NoAssert.donothing(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriod_PeriodType_Chronology() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC());
NoAssert.donothing(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result);
NoAssert.donothing(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriodFrom() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Period result = test.toPeriodFrom(dt);
NoAssert.donothing(new Period(dt, test), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriodFrom_PeriodType() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved());
NoAssert.donothing(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriodTo() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Period result = test.toPeriodTo(dt);
NoAssert.donothing(new Period(test, dt), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriodTo_PeriodType() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved());
NoAssert.donothing(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToIntervalFrom() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Interval result = test.toIntervalFrom(dt);
NoAssert.donothing(new Interval(dt, test), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToIntervalTo() {
        long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        Duration test = new Duration(length);
        DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        Interval result = test.toIntervalTo(dt);
NoAssert.donothing(new Interval(test, dt), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithMillis1() {
        Duration test = new Duration(123L);
        Duration result = test.withMillis(123L);
NoAssert.donothing(test, result);
    }

    @Test public void testWithMillis2() {
        Duration test = new Duration(123L);
        Duration result = test.withMillis(1234567890L);
NoAssert.donothing(1234567890L, result.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testWithDurationAdded_long_int1() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(8000L, 1);
NoAssert.donothing(8123L, result.getMillis());
    }

    @Test public void testWithDurationAdded_long_int2() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(8000L, 2);
NoAssert.donothing(16123L, result.getMillis());
    }

    @Test public void testWithDurationAdded_long_int3() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(8000L, -1);
NoAssert.donothing((123L - 8000L), result.getMillis());
    }

    @Test public void testWithDurationAdded_long_int4() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(0L, 1);
NoAssert.donothing(test, result);
    }

    @Test public void testWithDurationAdded_long_int5() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(8000L, 0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_long1() {
        Duration test = new Duration(123L);
        Duration result = test.plus(8000L);
NoAssert.donothing(8123L, result.getMillis());
    }

    @Test public void testPlus_long2() {
        Duration test = new Duration(123L);
        Duration result = test.plus(0L);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMinus_long1() {
        Duration test = new Duration(123L);
        Duration result = test.minus(8000L);
NoAssert.donothing(123L - 8000L, result.getMillis());
    }

    @Test public void testMinus_long2() {
        Duration test = new Duration(123L);
        Duration result = test.minus(0L);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMultipliedBy_long1() {
        Duration test = new Duration(123L);
        Duration result = test.multipliedBy(2L);
NoAssert.donothing(246L, result.getMillis());
    }

    @Test public void testMultipliedBy_long2() {
        Duration test = new Duration(123L);
        Duration result = test.multipliedBy(1L);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testDividedBy_long1() {
        Duration test = new Duration(246L);
        Duration result = test.dividedBy(2L);
NoAssert.donothing(123L, result.getMillis());
    }

    @Test public void testDividedBy_long2() {
        Duration test = new Duration(123L);
        Duration result = test.dividedBy(1L);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testDividedByRoundingMode_long1() {
        Duration test = new Duration(246L);
        Duration result = test.dividedBy(2L, RoundingMode.UNNECESSARY);
NoAssert.donothing(123L, result.getMillis());
    }

    @Test public void testDividedByRoundingMode_long2() {
        Duration test = new Duration(123L);
        Duration result = test.dividedBy(2L, RoundingMode.FLOOR);
NoAssert.donothing(61L, result.getMillis());
    }

    @Test public void testDividedByRoundingMode_long3() {
        Duration test = new Duration(123L);
        Duration result = test.dividedBy(7L, RoundingMode.CEILING);
NoAssert.donothing(18L, result.getMillis());
    }

    @Test public void testDividedByRoundingMode_long4() {
        Duration test = new Duration(33L);
        Duration result = test.dividedBy(1L, RoundingMode.FLOOR);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testNegated_long1() {
        Duration test = new Duration(246L);
        Duration result = test.negated();
NoAssert.donothing(-246L, result.getMillis());
    }

    @Test public void testNegated_long2() {
        Duration test = new Duration(-246L);
        Duration result = test.negated();
NoAssert.donothing(246L, result.getMillis());
    }

    @Test public void testNegated_long3() {
        Duration test = new Duration(Long.MIN_VALUE);
        try {
            test.negated();
            fail();
        } catch(ArithmeticException e) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testAbs() {
NoAssert.donothing(246L, new Duration(246L).abs().getMillis());
NoAssert.donothing(0L, new Duration(0L).abs().getMillis());
NoAssert.donothing(246L, new Duration(-246L).abs().getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testWithDurationAdded_RD_int1() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(new Duration(8000L), 1);
NoAssert.donothing(8123L, result.getMillis());
    }

    @Test public void testWithDurationAdded_RD_int2() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(new Duration(8000L), 2);
NoAssert.donothing(16123L, result.getMillis());
    }

    @Test public void testWithDurationAdded_RD_int3() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(new Duration(8000L), -1);
NoAssert.donothing((123L - 8000L), result.getMillis());
    }

    @Test public void testWithDurationAdded_RD_int4() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(new Duration(0L), 1);
NoAssert.donothing(test, result);
    }

    @Test public void testWithDurationAdded_RD_int5() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(new Duration(8000L), 0);
NoAssert.donothing(test, result);
    }

    @Test public void testWithDurationAdded_RD_int6() {
        Duration test = new Duration(123L);
        Duration result = test.withDurationAdded(null, 0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_RD1() {
        Duration test = new Duration(123L);
        Duration result = test.plus(new Duration(8000L));
NoAssert.donothing(8123L, result.getMillis());
    }

    @Test public void testPlus_RD2() {
        Duration test = new Duration(123L);
        Duration result = test.plus(new Duration(0L));
NoAssert.donothing(test, result);
    }

    @Test public void testPlus_RD3() {
        Duration test = new Duration(123L);
        Duration result = test.plus(null);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMinus_RD1() {
        Duration test = new Duration(123L);
        Duration result = test.minus(new Duration(8000L));
NoAssert.donothing(123L - 8000L, result.getMillis());
    }

    @Test public void testMinus_RD2() {
        Duration test = new Duration(123L);
        Duration result = test.minus(new Duration(0L));
NoAssert.donothing(test, result);
    }

    @Test public void testMinus_RD3() {
        Duration test = new Duration(123L);
        Duration result = test.minus(null);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMutableDuration() {
        // no MutableDuration, so...
        MockMutableDuration test = new MockMutableDuration(123L);
NoAssert.donothing(123L, test.getMillis());
        
        test.setMillis(2345L);
NoAssert.donothing(2345L, test.getMillis());
    }

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);
        }
        public void setMillis(long duration) {
            super.setMillis(duration);
        }
    }

}
