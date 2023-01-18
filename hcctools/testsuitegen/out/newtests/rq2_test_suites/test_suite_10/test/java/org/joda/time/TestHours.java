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
 * This class is a Junit unit test for Hours.
 *
 * @author Stephen Colebourne
 */
public class TestHours  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception  {
        TestHours TB= new TestHours();
        TB.setUp(); TB.testConstants(); TB.tearDown();
        TB.setUp(); TB.testFactory_hours_int(); TB.tearDown();
        TB.setUp(); TB.testFactory_hoursBetween_RInstant(); TB.tearDown();
        TB.setUp(); TB.testFactory_hoursBetween_RPartial(); TB.tearDown();
        TB.setUp(); TB.testFactory_hoursIn_RInterval(); TB.tearDown();
        TB.setUp(); TB.testFactory_standardHoursIn_RPeriod(); TB.tearDown();
        TB.setUp(); TB.testFactory_parseHours_String(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testGetFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType(); TB.tearDown();
        TB.setUp(); TB.testIsGreaterThan(); TB.tearDown();
        TB.setUp(); TB.testIsLessThan(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToStandardWeeks(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds(); TB.tearDown();
        TB.setUp(); TB.testToStandardDuration(); TB.tearDown();
        TB.setUp(); TB.testPlus_int(); TB.tearDown();
        TB.setUp(); TB.testPlus_Hours(); TB.tearDown();
        TB.setUp(); TB.testMinus_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_Hours(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy_int(); TB.tearDown();
        TB.setUp(); TB.testDividedBy_int(); TB.tearDown();
        TB.setUp(); TB.testNegated(); TB.tearDown();
        TB.setUp(); TB.testAddToLocalDate(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestHours.class);
    }

    public TestHours(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void testConstants() {
NoAssert.donothing(0, Hours.ZERO.getHours());
NoAssert.donothing(1, Hours.ONE.getHours());
        assertEquals(2, Hours.TWO.getHours());
        assertEquals(3, Hours.THREE.getHours());
NoAssert.donothing(4, Hours.FOUR.getHours());
NoAssert.donothing(5, Hours.FIVE.getHours());
NoAssert.donothing(6, Hours.SIX.getHours());
NoAssert.donothing(7, Hours.SEVEN.getHours());
NoAssert.donothing(8, Hours.EIGHT.getHours());
        assertEquals(Integer.MAX_VALUE, Hours.MAX_VALUE.getHours());
NoAssert.donothing(Integer.MIN_VALUE, Hours.MIN_VALUE.getHours());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_hours_int() {
        assertSame(Hours.ZERO, Hours.hours(0));
NoAssert.donothing(Hours.ONE, Hours.hours(1));
NoAssert.donothing(Hours.TWO, Hours.hours(2));
        assertSame(Hours.THREE, Hours.hours(3));
        assertSame(Hours.FOUR, Hours.hours(4));
NoAssert.donothing(Hours.FIVE, Hours.hours(5));
NoAssert.donothing(Hours.SIX, Hours.hours(6));
NoAssert.donothing(Hours.SEVEN, Hours.hours(7));
NoAssert.donothing(Hours.EIGHT, Hours.hours(8));
NoAssert.donothing(Hours.MAX_VALUE, Hours.hours(Integer.MAX_VALUE));
NoAssert.donothing(Hours.MIN_VALUE, Hours.hours(Integer.MIN_VALUE));
NoAssert.donothing(-1, Hours.hours(-1).getHours());
NoAssert.donothing(9, Hours.hours(9).getHours());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_hoursBetween_RInstant() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS);
        
NoAssert.donothing(3, Hours.hoursBetween(start, end1).getHours());
NoAssert.donothing(0, Hours.hoursBetween(start, start).getHours());
NoAssert.donothing(0, Hours.hoursBetween(end1, end1).getHours());
        assertEquals(-3, Hours.hoursBetween(end1, start).getHours());
NoAssert.donothing(6, Hours.hoursBetween(start, end2).getHours());
    }

    @Test public void testFactory_hoursBetween_RPartial() {
        LocalTime start = new LocalTime(12, 0);
        LocalTime end1 = new LocalTime(15, 0);
        @SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(18, 0);
        
        assertEquals(3, Hours.hoursBetween(start, end1).getHours());
NoAssert.donothing(0, Hours.hoursBetween(start, start).getHours());
        assertEquals(0, Hours.hoursBetween(end1, end1).getHours());
NoAssert.donothing(-3, Hours.hoursBetween(end1, start).getHours());
NoAssert.donothing(6, Hours.hoursBetween(start, end2).getHours());
    }

    @Test public void testFactory_hoursIn_RInterval() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 9, 15, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 6, 9, 18, 0, 0, 0, PARIS);
        
NoAssert.donothing(0, Hours.hoursIn((ReadableInterval) null).getHours());
NoAssert.donothing(3, Hours.hoursIn(new Interval(start, end1)).getHours());
NoAssert.donothing(0, Hours.hoursIn(new Interval(start, start)).getHours());
NoAssert.donothing(0, Hours.hoursIn(new Interval(end1, end1)).getHours());
NoAssert.donothing(6, Hours.hoursIn(new Interval(start, end2)).getHours());
    }

    @Test public void testFactory_standardHoursIn_RPeriod() {
NoAssert.donothing(0, Hours.standardHoursIn((ReadablePeriod) null).getHours());
NoAssert.donothing(0, Hours.standardHoursIn(Period.ZERO).getHours());
NoAssert.donothing(1, Hours.standardHoursIn(new Period(0, 0, 0, 0, 1, 0, 0, 0)).getHours());
NoAssert.donothing(123, Hours.standardHoursIn(Period.hours(123)).getHours());
NoAssert.donothing(-987, Hours.standardHoursIn(Period.hours(-987)).getHours());
NoAssert.donothing(1, Hours.standardHoursIn(Period.minutes(119)).getHours());
NoAssert.donothing(2, Hours.standardHoursIn(Period.minutes(120)).getHours());
NoAssert.donothing(2, Hours.standardHoursIn(Period.minutes(121)).getHours());
NoAssert.donothing(48, Hours.standardHoursIn(Period.days(2)).getHours());
        try {
            Hours.standardHoursIn(Period.months(1));
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testFactory_parseHours_String() {
NoAssert.donothing(0, Hours.parseHours((String) null).getHours());
NoAssert.donothing(0, Hours.parseHours("PT0H").getHours());
NoAssert.donothing(1, Hours.parseHours("PT1H").getHours());
NoAssert.donothing(-3, Hours.parseHours("PT-3H").getHours());
NoAssert.donothing(2, Hours.parseHours("P0Y0M0DT2H").getHours());
NoAssert.donothing(2, Hours.parseHours("PT2H0M").getHours());
        try {
            Hours.parseHours("P1Y1D");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            Hours.parseHours("P1DT1H");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetMethods() {
        Hours test = Hours.hours(20);
NoAssert.donothing(20, test.getHours());
    }

    @Test public void testGetFieldType() {
        Hours test = Hours.hours(20);
        assertEquals(DurationFieldType.hours(), test.getFieldType());
    }

    @Test public void testGetPeriodType() {
        Hours test = Hours.hours(20);
        assertEquals(PeriodType.hours(), test.getPeriodType());
    }

    //-----------------------------------------------------------------------
    @Test public void testIsGreaterThan() {
        assertEquals(true, Hours.THREE.isGreaterThan(Hours.TWO));
NoAssert.donothing(false, Hours.THREE.isGreaterThan(Hours.THREE));
NoAssert.donothing(false, Hours.TWO.isGreaterThan(Hours.THREE));
NoAssert.donothing(true, Hours.ONE.isGreaterThan(null));
NoAssert.donothing(false, Hours.hours(-1).isGreaterThan(null));
    }

    @Test public void testIsLessThan() {
        assertEquals(false, Hours.THREE.isLessThan(Hours.TWO));
NoAssert.donothing(false, Hours.THREE.isLessThan(Hours.THREE));
NoAssert.donothing(true, Hours.TWO.isLessThan(Hours.THREE));
NoAssert.donothing(false, Hours.ONE.isLessThan(null));
NoAssert.donothing(true, Hours.hours(-1).isLessThan(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        Hours test = Hours.hours(20);
NoAssert.donothing("PT20H", test.toString());
        
        test = Hours.hours(-20);
NoAssert.donothing("PT-20H", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Hours test = Hours.SEVEN;
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Hours result = (Hours) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardWeeks() {
        Hours test = Hours.hours(24 * 7 * 2);
        Weeks expected = Weeks.weeks(2);
NoAssert.donothing(expected, test.toStandardWeeks());
    }

    @Test public void testToStandardDays() {
        Hours test = Hours.hours(24 * 2);
        Days expected = Days.days(2);
NoAssert.donothing(expected, test.toStandardDays());
    }

    @Test public void testToStandardMinutes() {
        Hours test = Hours.hours(3);
        Minutes expected = Minutes.minutes(3 * 60);
NoAssert.donothing(expected, test.toStandardMinutes());
        
        try {
            Hours.MAX_VALUE.toStandardMinutes();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardSeconds() {
        Hours test = Hours.hours(3);
        Seconds expected = Seconds.seconds(3 * 60 * 60);
NoAssert.donothing(expected, test.toStandardSeconds());
        
        try {
            Hours.MAX_VALUE.toStandardSeconds();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardDuration() {
        Hours test = Hours.hours(20);
        Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_HOUR);
NoAssert.donothing(expected, test.toStandardDuration());
        
        expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_HOUR);
NoAssert.donothing(expected, Hours.MAX_VALUE.toStandardDuration());
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_int() {
        Hours test2 = Hours.hours(2);
        Hours result = test2.plus(3);
NoAssert.donothing(2, test2.getHours());
NoAssert.donothing(5, result.getHours());
        
NoAssert.donothing(1, Hours.ONE.plus(0).getHours());
        
        try {
            Hours.MAX_VALUE.plus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testPlus_Hours() {
        Hours test2 = Hours.hours(2);
        Hours test3 = Hours.hours(3);
        Hours result = test2.plus(test3);
NoAssert.donothing(2, test2.getHours());
NoAssert.donothing(3, test3.getHours());
NoAssert.donothing(5, result.getHours());
        
NoAssert.donothing(1, Hours.ONE.plus(Hours.ZERO).getHours());
        assertEquals(1, Hours.ONE.plus((Hours) null).getHours());
        
        try {
            Hours.MAX_VALUE.plus(Hours.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_int() {
        Hours test2 = Hours.hours(2);
        Hours result = test2.minus(3);
NoAssert.donothing(2, test2.getHours());
NoAssert.donothing(-1, result.getHours());
        
NoAssert.donothing(1, Hours.ONE.minus(0).getHours());
        
        try {
            Hours.MIN_VALUE.minus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_Hours() {
        Hours test2 = Hours.hours(2);
        Hours test3 = Hours.hours(3);
        Hours result = test2.minus(test3);
NoAssert.donothing(2, test2.getHours());
NoAssert.donothing(3, test3.getHours());
NoAssert.donothing(-1, result.getHours());
        
NoAssert.donothing(1, Hours.ONE.minus(Hours.ZERO).getHours());
NoAssert.donothing(1, Hours.ONE.minus((Hours) null).getHours());
        
        try {
            Hours.MIN_VALUE.minus(Hours.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMultipliedBy_int() {
        Hours test = Hours.hours(2);
NoAssert.donothing(6, test.multipliedBy(3).getHours());
NoAssert.donothing(2, test.getHours());
NoAssert.donothing(-6, test.multipliedBy(-3).getHours());
NoAssert.donothing(test, test.multipliedBy(1));
        
        Hours halfMax = Hours.hours(Integer.MAX_VALUE / 2 + 1);
        try {
            halfMax.multipliedBy(2);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testDividedBy_int() {
        Hours test = Hours.hours(12);
NoAssert.donothing(6, test.dividedBy(2).getHours());
NoAssert.donothing(12, test.getHours());
NoAssert.donothing(4, test.dividedBy(3).getHours());
NoAssert.donothing(3, test.dividedBy(4).getHours());
NoAssert.donothing(2, test.dividedBy(5).getHours());
NoAssert.donothing(2, test.dividedBy(6).getHours());
        assertSame(test, test.dividedBy(1));
        
        try {
            Hours.ONE.dividedBy(0);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testNegated() {
        Hours test = Hours.hours(12);
        assertEquals(-12, test.negated().getHours());
NoAssert.donothing(12, test.getHours());
        
        try {
            Hours.MIN_VALUE.negated();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testAddToLocalDate() {
        Hours test = Hours.hours(26);
        LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        LocalDateTime expected = new LocalDateTime(2006, 6, 2, 2, 0, 0, 0);
NoAssert.donothing(expected, date.plus(test));
    }

}
