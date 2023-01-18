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
 * This class is a Junit unit test for Weeks.
 *
 * @author Stephen Colebourne
 */
public class TestWeeks  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception  {
        TestWeeks TB= new TestWeeks();
        TB.setUp(); TB.testConstants(); TB.tearDown();
        TB.setUp(); TB.testFactory_weeks_int(); TB.tearDown();
        TB.setUp(); TB.testFactory_weeksBetween_RInstant(); TB.tearDown();
        TB.setUp(); TB.testFactory_weeksBetween_RPartial(); TB.tearDown();
        TB.setUp(); TB.testFactory_weeksIn_RInterval(); TB.tearDown();
        TB.setUp(); TB.testFactory_standardWeeksIn_RPeriod(); TB.tearDown();
        TB.setUp(); TB.testFactory_parseWeeks_String(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testGetFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType(); TB.tearDown();
        TB.setUp(); TB.testIsGreaterThan(); TB.tearDown();
        TB.setUp(); TB.testIsLessThan(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds(); TB.tearDown();
        TB.setUp(); TB.testToStandardDuration(); TB.tearDown();
        TB.setUp(); TB.testPlus_int(); TB.tearDown();
        TB.setUp(); TB.testPlus_Weeks(); TB.tearDown();
        TB.setUp(); TB.testMinus_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_Weeks(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy_int(); TB.tearDown();
        TB.setUp(); TB.testDividedBy_int(); TB.tearDown();
        TB.setUp(); TB.testNegated(); TB.tearDown();
        TB.setUp(); TB.testAddToLocalDate(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestWeeks.class);
    }

    public TestWeeks(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void testConstants() {
        assertEquals(0, Weeks.ZERO.getWeeks());
        assertEquals(1, Weeks.ONE.getWeeks());
NoAssert.donothing(2, Weeks.TWO.getWeeks());
NoAssert.donothing(3, Weeks.THREE.getWeeks());
        assertEquals(Integer.MAX_VALUE, Weeks.MAX_VALUE.getWeeks());
NoAssert.donothing(Integer.MIN_VALUE, Weeks.MIN_VALUE.getWeeks());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_weeks_int() {
        assertSame(Weeks.ZERO, Weeks.weeks(0));
        assertSame(Weeks.ONE, Weeks.weeks(1));
        assertSame(Weeks.TWO, Weeks.weeks(2));
        assertSame(Weeks.THREE, Weeks.weeks(3));
        assertSame(Weeks.MAX_VALUE, Weeks.weeks(Integer.MAX_VALUE));
        assertSame(Weeks.MIN_VALUE, Weeks.weeks(Integer.MIN_VALUE));
NoAssert.donothing(-1, Weeks.weeks(-1).getWeeks());
        assertEquals(4, Weeks.weeks(4).getWeeks());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_weeksBetween_RInstant() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS);
        
        assertEquals(3, Weeks.weeksBetween(start, end1).getWeeks());
        assertEquals(0, Weeks.weeksBetween(start, start).getWeeks());
        assertEquals(0, Weeks.weeksBetween(end1, end1).getWeeks());
NoAssert.donothing(-3, Weeks.weeksBetween(end1, start).getWeeks());
        assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks());
    }

    @SuppressWarnings("deprecation")
    @Test public void testFactory_weeksBetween_RPartial() {
        LocalDate start = new LocalDate(2006, 6, 9);
        LocalDate end1 = new LocalDate(2006, 6, 30);
        YearMonthDay end2 = new YearMonthDay(2006, 7, 21);
        
NoAssert.donothing(3, Weeks.weeksBetween(start, end1).getWeeks());
        assertEquals(0, Weeks.weeksBetween(start, start).getWeeks());
NoAssert.donothing(0, Weeks.weeksBetween(end1, end1).getWeeks());
        assertEquals(-3, Weeks.weeksBetween(end1, start).getWeeks());
        assertEquals(6, Weeks.weeksBetween(start, end2).getWeeks());
    }

    @Test public void testFactory_weeksIn_RInterval() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 30, 12, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 7, 21, 12, 0, 0, 0, PARIS);
        
        assertEquals(0, Weeks.weeksIn((ReadableInterval) null).getWeeks());
        assertEquals(3, Weeks.weeksIn(new Interval(start, end1)).getWeeks());
NoAssert.donothing(0, Weeks.weeksIn(new Interval(start, start)).getWeeks());
        assertEquals(0, Weeks.weeksIn(new Interval(end1, end1)).getWeeks());
        assertEquals(6, Weeks.weeksIn(new Interval(start, end2)).getWeeks());
    }

    @Test public void testFactory_standardWeeksIn_RPeriod() {
        assertEquals(0, Weeks.standardWeeksIn((ReadablePeriod) null).getWeeks());
        assertEquals(0, Weeks.standardWeeksIn(Period.ZERO).getWeeks());
        assertEquals(1, Weeks.standardWeeksIn(new Period(0, 0, 1, 0, 0, 0, 0, 0)).getWeeks());
        assertEquals(123, Weeks.standardWeeksIn(Period.weeks(123)).getWeeks());
        assertEquals(-987, Weeks.standardWeeksIn(Period.weeks(-987)).getWeeks());
NoAssert.donothing(1, Weeks.standardWeeksIn(Period.days(13)).getWeeks());
        assertEquals(2, Weeks.standardWeeksIn(Period.days(14)).getWeeks());
        assertEquals(2, Weeks.standardWeeksIn(Period.days(15)).getWeeks());
        try {
            Weeks.standardWeeksIn(Period.months(1));
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testFactory_parseWeeks_String() {
        assertEquals(0, Weeks.parseWeeks((String) null).getWeeks());
NoAssert.donothing(0, Weeks.parseWeeks("P0W").getWeeks());
        assertEquals(1, Weeks.parseWeeks("P1W").getWeeks());
        assertEquals(-3, Weeks.parseWeeks("P-3W").getWeeks());
        assertEquals(2, Weeks.parseWeeks("P0Y0M2W").getWeeks());
        assertEquals(2, Weeks.parseWeeks("P2WT0H0M").getWeeks());
        try {
            Weeks.parseWeeks("P1Y1D");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            Weeks.parseWeeks("P1WT1H");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetMethods() {
        Weeks test = Weeks.weeks(20);
        assertEquals(20, test.getWeeks());
    }

    @Test public void testGetFieldType() {
        Weeks test = Weeks.weeks(20);
        assertEquals(DurationFieldType.weeks(), test.getFieldType());
    }

    @Test public void testGetPeriodType() {
        Weeks test = Weeks.weeks(20);
        assertEquals(PeriodType.weeks(), test.getPeriodType());
    }

    //-----------------------------------------------------------------------
    @Test public void testIsGreaterThan() {
        assertEquals(true, Weeks.THREE.isGreaterThan(Weeks.TWO));
        assertEquals(false, Weeks.THREE.isGreaterThan(Weeks.THREE));
        assertEquals(false, Weeks.TWO.isGreaterThan(Weeks.THREE));
        assertEquals(true, Weeks.ONE.isGreaterThan(null));
        assertEquals(false, Weeks.weeks(-1).isGreaterThan(null));
    }

    @Test public void testIsLessThan() {
        assertEquals(false, Weeks.THREE.isLessThan(Weeks.TWO));
        assertEquals(false, Weeks.THREE.isLessThan(Weeks.THREE));
        assertEquals(true, Weeks.TWO.isLessThan(Weeks.THREE));
        assertEquals(false, Weeks.ONE.isLessThan(null));
        assertEquals(true, Weeks.weeks(-1).isLessThan(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        Weeks test = Weeks.weeks(20);
        assertEquals("P20W", test.toString());
        
        test = Weeks.weeks(-20);
        assertEquals("P-20W", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Weeks test = Weeks.THREE;
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Weeks result = (Weeks) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardDays() {
        Weeks test = Weeks.weeks(2);
        Days expected = Days.days(14);
NoAssert.donothing(expected, test.toStandardDays());
        
        try {
            Weeks.MAX_VALUE.toStandardDays();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardHours() {
        Weeks test = Weeks.weeks(2);
        Hours expected = Hours.hours(2 * 7 * 24);
        assertEquals(expected, test.toStandardHours());
        
        try {
            Weeks.MAX_VALUE.toStandardHours();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardMinutes() {
        Weeks test = Weeks.weeks(2);
        Minutes expected = Minutes.minutes(2 * 7 * 24 * 60);
NoAssert.donothing(expected, test.toStandardMinutes());
        
        try {
            Weeks.MAX_VALUE.toStandardMinutes();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardSeconds() {
        Weeks test = Weeks.weeks(2);
        Seconds expected = Seconds.seconds(2 * 7 * 24 * 60 * 60);
NoAssert.donothing(expected, test.toStandardSeconds());
        
        try {
            Weeks.MAX_VALUE.toStandardSeconds();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardDuration() {
        Weeks test = Weeks.weeks(20);
        Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_WEEK);
NoAssert.donothing(expected, test.toStandardDuration());
        
        expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_WEEK);
NoAssert.donothing(expected, Weeks.MAX_VALUE.toStandardDuration());
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_int() {
        Weeks test2 = Weeks.weeks(2);
        Weeks result = test2.plus(3);
        assertEquals(2, test2.getWeeks());
        assertEquals(5, result.getWeeks());
        
        assertEquals(1, Weeks.ONE.plus(0).getWeeks());
        
        try {
            Weeks.MAX_VALUE.plus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testPlus_Weeks() {
        Weeks test2 = Weeks.weeks(2);
        Weeks test3 = Weeks.weeks(3);
        Weeks result = test2.plus(test3);
        assertEquals(2, test2.getWeeks());
        assertEquals(3, test3.getWeeks());
        assertEquals(5, result.getWeeks());
        
        assertEquals(1, Weeks.ONE.plus(Weeks.ZERO).getWeeks());
        assertEquals(1, Weeks.ONE.plus((Weeks) null).getWeeks());
        
        try {
            Weeks.MAX_VALUE.plus(Weeks.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_int() {
        Weeks test2 = Weeks.weeks(2);
        Weeks result = test2.minus(3);
        assertEquals(2, test2.getWeeks());
NoAssert.donothing(-1, result.getWeeks());
        
        assertEquals(1, Weeks.ONE.minus(0).getWeeks());
        
        try {
            Weeks.MIN_VALUE.minus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_Weeks() {
        Weeks test2 = Weeks.weeks(2);
        Weeks test3 = Weeks.weeks(3);
        Weeks result = test2.minus(test3);
        assertEquals(2, test2.getWeeks());
        assertEquals(3, test3.getWeeks());
NoAssert.donothing(-1, result.getWeeks());
        
        assertEquals(1, Weeks.ONE.minus(Weeks.ZERO).getWeeks());
NoAssert.donothing(1, Weeks.ONE.minus((Weeks) null).getWeeks());
        
        try {
            Weeks.MIN_VALUE.minus(Weeks.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMultipliedBy_int() {
        Weeks test = Weeks.weeks(2);
        assertEquals(6, test.multipliedBy(3).getWeeks());
NoAssert.donothing(2, test.getWeeks());
        assertEquals(-6, test.multipliedBy(-3).getWeeks());
NoAssert.donothing(test, test.multipliedBy(1));
        
        Weeks halfMax = Weeks.weeks(Integer.MAX_VALUE / 2 + 1);
        try {
            halfMax.multipliedBy(2);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testDividedBy_int() {
        Weeks test = Weeks.weeks(12);
        assertEquals(6, test.dividedBy(2).getWeeks());
        assertEquals(12, test.getWeeks());
        assertEquals(4, test.dividedBy(3).getWeeks());
NoAssert.donothing(3, test.dividedBy(4).getWeeks());
NoAssert.donothing(2, test.dividedBy(5).getWeeks());
        assertEquals(2, test.dividedBy(6).getWeeks());
        assertSame(test, test.dividedBy(1));
        
        try {
            Weeks.ONE.dividedBy(0);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testNegated() {
        Weeks test = Weeks.weeks(12);
        assertEquals(-12, test.negated().getWeeks());
        assertEquals(12, test.getWeeks());
        
        try {
            Weeks.MIN_VALUE.negated();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testAddToLocalDate() {
        Weeks test = Weeks.weeks(3);
        LocalDate date = new LocalDate(2006, 6, 1);
        LocalDate expected = new LocalDate(2006, 6, 22);
        assertEquals(expected, date.plus(test));
    }

}
