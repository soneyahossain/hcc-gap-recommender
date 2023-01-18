/*
 *  Copyright 2001-2013 Stephen Colebourne
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

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for Seconds.
 *
 * @author Stephen Colebourne
 */
public class TestSeconds  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception  {
        TestSeconds TB= new TestSeconds();
        TB.setUp(); TB.testConstants(); TB.tearDown();
        TB.setUp(); TB.testFactory_seconds_int(); TB.tearDown();
        TB.setUp(); TB.testFactory_secondsBetween_RInstant(); TB.tearDown();
        TB.setUp(); TB.testFactory_secondsBetween_RPartial(); TB.tearDown();
        TB.setUp(); TB.testFactory_secondsIn_RInterval(); TB.tearDown();
        TB.setUp(); TB.testFactory_standardSecondsIn_RPeriod(); TB.tearDown();
        TB.setUp(); TB.testFactory_parseSeconds_String(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testGetFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType(); TB.tearDown();
        TB.setUp(); TB.testIsGreaterThan(); TB.tearDown();
        TB.setUp(); TB.testIsLessThan(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToStandardWeeks(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes(); TB.tearDown();
        TB.setUp(); TB.testToStandardDuration(); TB.tearDown();
        TB.setUp(); TB.testPlus_int(); TB.tearDown();
        TB.setUp(); TB.testPlus_Seconds(); TB.tearDown();
        TB.setUp(); TB.testMinus_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_Seconds(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy_int(); TB.tearDown();
        TB.setUp(); TB.testDividedBy_int(); TB.tearDown();
        TB.setUp(); TB.testNegated(); TB.tearDown();
        TB.setUp(); TB.testAddToLocalDate(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestSeconds.class);
    }

    public TestSeconds(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void testConstants() {
NoAssert.donothing(0, Seconds.ZERO.getSeconds());
NoAssert.donothing(1, Seconds.ONE.getSeconds());
NoAssert.donothing(2, Seconds.TWO.getSeconds());
NoAssert.donothing(3, Seconds.THREE.getSeconds());
NoAssert.donothing(Integer.MAX_VALUE, Seconds.MAX_VALUE.getSeconds());
NoAssert.donothing(Integer.MIN_VALUE, Seconds.MIN_VALUE.getSeconds());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_seconds_int() {
NoAssert.donothing(Seconds.ZERO, Seconds.seconds(0));
NoAssert.donothing(Seconds.ONE, Seconds.seconds(1));
NoAssert.donothing(Seconds.TWO, Seconds.seconds(2));
NoAssert.donothing(Seconds.THREE, Seconds.seconds(3));
NoAssert.donothing(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE));
NoAssert.donothing(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE));
NoAssert.donothing(-1, Seconds.seconds(-1).getSeconds());
NoAssert.donothing(4, Seconds.seconds(4).getSeconds());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_secondsBetween_RInstant() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS);
        DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS);
        
NoAssert.donothing(3, Seconds.secondsBetween(start, end1).getSeconds());
NoAssert.donothing(0, Seconds.secondsBetween(start, start).getSeconds());
NoAssert.donothing(0, Seconds.secondsBetween(end1, end1).getSeconds());
NoAssert.donothing(-3, Seconds.secondsBetween(end1, start).getSeconds());
NoAssert.donothing(6, Seconds.secondsBetween(start, end2).getSeconds());
    }

    @Test public void testFactory_secondsBetween_RPartial() {
        LocalTime start = new LocalTime(12, 0, 3);
        LocalTime end1 = new LocalTime(12, 0, 6);
        @SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(12, 0, 9);
        
NoAssert.donothing(3, Seconds.secondsBetween(start, end1).getSeconds());
NoAssert.donothing(0, Seconds.secondsBetween(start, start).getSeconds());
NoAssert.donothing(0, Seconds.secondsBetween(end1, end1).getSeconds());
NoAssert.donothing(-3, Seconds.secondsBetween(end1, start).getSeconds());
NoAssert.donothing(6, Seconds.secondsBetween(start, end2).getSeconds());
    }

    @Test public void testFactory_secondsIn_RInterval() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS);
        DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS);
        
NoAssert.donothing(0, Seconds.secondsIn((ReadableInterval) null).getSeconds());
NoAssert.donothing(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds());
NoAssert.donothing(0, Seconds.secondsIn(new Interval(start, start)).getSeconds());
NoAssert.donothing(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds());
NoAssert.donothing(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds());
    }

    @Test public void testFactory_standardSecondsIn_RPeriod() {
NoAssert.donothing(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds());
NoAssert.donothing(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds());
NoAssert.donothing(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds());
NoAssert.donothing(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds());
NoAssert.donothing(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds());
NoAssert.donothing(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds());
        try {
            Seconds.standardSecondsIn(Period.months(1));
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testFactory_parseSeconds_String() {
NoAssert.donothing(0, Seconds.parseSeconds((String) null).getSeconds());
NoAssert.donothing(0, Seconds.parseSeconds("PT0S").getSeconds());
NoAssert.donothing(1, Seconds.parseSeconds("PT1S").getSeconds());
NoAssert.donothing(-3, Seconds.parseSeconds("PT-3S").getSeconds());
NoAssert.donothing(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds());
NoAssert.donothing(2, Seconds.parseSeconds("PT0H2S").getSeconds());
        try {
            Seconds.parseSeconds("P1Y1D");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            Seconds.parseSeconds("P1DT1S");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetMethods() {
        Seconds test = Seconds.seconds(20);
NoAssert.donothing(20, test.getSeconds());
    }

    @Test public void testGetFieldType() {
        Seconds test = Seconds.seconds(20);
NoAssert.donothing(DurationFieldType.seconds(), test.getFieldType());
    }

    @Test public void testGetPeriodType() {
        Seconds test = Seconds.seconds(20);
NoAssert.donothing(PeriodType.seconds(), test.getPeriodType());
    }

    //-----------------------------------------------------------------------
    @Test public void testIsGreaterThan() {
NoAssert.donothing(true, Seconds.THREE.isGreaterThan(Seconds.TWO));
NoAssert.donothing(false, Seconds.THREE.isGreaterThan(Seconds.THREE));
NoAssert.donothing(false, Seconds.TWO.isGreaterThan(Seconds.THREE));
NoAssert.donothing(true, Seconds.ONE.isGreaterThan(null));
NoAssert.donothing(false, Seconds.seconds(-1).isGreaterThan(null));
    }

    @Test public void testIsLessThan() {
NoAssert.donothing(false, Seconds.THREE.isLessThan(Seconds.TWO));
NoAssert.donothing(false, Seconds.THREE.isLessThan(Seconds.THREE));
NoAssert.donothing(true, Seconds.TWO.isLessThan(Seconds.THREE));
NoAssert.donothing(false, Seconds.ONE.isLessThan(null));
NoAssert.donothing(true, Seconds.seconds(-1).isLessThan(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        Seconds test = Seconds.seconds(20);
NoAssert.donothing("PT20S", test.toString());
        
        test = Seconds.seconds(-20);
NoAssert.donothing("PT-20S", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Seconds test = Seconds.THREE;
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Seconds result = (Seconds) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardWeeks() {
        Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2);
        Weeks expected = Weeks.weeks(2);
NoAssert.donothing(expected, test.toStandardWeeks());
    }

    @Test public void testToStandardDays() {
        Seconds test = Seconds.seconds(60 * 60 * 24 * 2);
        Days expected = Days.days(2);
NoAssert.donothing(expected, test.toStandardDays());
    }

    @Test public void testToStandardHours() {
        Seconds test = Seconds.seconds(60 * 60 * 2);
        Hours expected = Hours.hours(2);
NoAssert.donothing(expected, test.toStandardHours());
    }

    @Test public void testToStandardMinutes() {
        Seconds test = Seconds.seconds(60 * 2);
        Minutes expected = Minutes.minutes(2);
NoAssert.donothing(expected, test.toStandardMinutes());
    }

    @Test public void testToStandardDuration() {
        Seconds test = Seconds.seconds(20);
        Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND);
NoAssert.donothing(expected, test.toStandardDuration());
        
        expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND);
NoAssert.donothing(expected, Seconds.MAX_VALUE.toStandardDuration());
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_int() {
        Seconds test2 = Seconds.seconds(2);
        Seconds result = test2.plus(3);
NoAssert.donothing(2, test2.getSeconds());
NoAssert.donothing(5, result.getSeconds());
        
NoAssert.donothing(1, Seconds.ONE.plus(0).getSeconds());
        
        try {
            Seconds.MAX_VALUE.plus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testPlus_Seconds() {
        Seconds test2 = Seconds.seconds(2);
        Seconds test3 = Seconds.seconds(3);
        Seconds result = test2.plus(test3);
NoAssert.donothing(2, test2.getSeconds());
NoAssert.donothing(3, test3.getSeconds());
NoAssert.donothing(5, result.getSeconds());
        
NoAssert.donothing(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds());
NoAssert.donothing(1, Seconds.ONE.plus((Seconds) null).getSeconds());
        
        try {
            Seconds.MAX_VALUE.plus(Seconds.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_int() {
        Seconds test2 = Seconds.seconds(2);
        Seconds result = test2.minus(3);
NoAssert.donothing(2, test2.getSeconds());
NoAssert.donothing(-1, result.getSeconds());
        
NoAssert.donothing(1, Seconds.ONE.minus(0).getSeconds());
        
        try {
            Seconds.MIN_VALUE.minus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_Seconds() {
        Seconds test2 = Seconds.seconds(2);
        Seconds test3 = Seconds.seconds(3);
        Seconds result = test2.minus(test3);
NoAssert.donothing(2, test2.getSeconds());
NoAssert.donothing(3, test3.getSeconds());
NoAssert.donothing(-1, result.getSeconds());
        
NoAssert.donothing(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds());
NoAssert.donothing(1, Seconds.ONE.minus((Seconds) null).getSeconds());
        
        try {
            Seconds.MIN_VALUE.minus(Seconds.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMultipliedBy_int() {
        Seconds test = Seconds.seconds(2);
NoAssert.donothing(6, test.multipliedBy(3).getSeconds());
NoAssert.donothing(2, test.getSeconds());
NoAssert.donothing(-6, test.multipliedBy(-3).getSeconds());
NoAssert.donothing(test, test.multipliedBy(1));
        
        Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1);
        try {
            halfMax.multipliedBy(2);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testDividedBy_int() {
        Seconds test = Seconds.seconds(12);
NoAssert.donothing(6, test.dividedBy(2).getSeconds());
NoAssert.donothing(12, test.getSeconds());
NoAssert.donothing(4, test.dividedBy(3).getSeconds());
NoAssert.donothing(3, test.dividedBy(4).getSeconds());
NoAssert.donothing(2, test.dividedBy(5).getSeconds());
NoAssert.donothing(2, test.dividedBy(6).getSeconds());
NoAssert.donothing(test, test.dividedBy(1));
        
        try {
            Seconds.ONE.dividedBy(0);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testNegated() {
        Seconds test = Seconds.seconds(12);
NoAssert.donothing(-12, test.negated().getSeconds());
NoAssert.donothing(12, test.getSeconds());
        
        try {
            Seconds.MIN_VALUE.negated();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testAddToLocalDate() {
        Seconds test = Seconds.seconds(26);
        LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0);
NoAssert.donothing(expected, date.plus(test));
    }

}
