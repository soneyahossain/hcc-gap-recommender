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
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception  {
        TestMonths TB= new TestMonths();
        TB.setUp(); TB.testConstants(); TB.tearDown();
        TB.setUp(); TB.testFactory_months_int(); TB.tearDown();
        TB.setUp(); TB.testFactory_monthsBetween_RInstant(); TB.tearDown();
        TB.setUp(); TB.testFactory_monthsBetween_RInstant_LocalDate_EndMonth(); TB.tearDown();
        TB.setUp(); TB.testFactory_monthsBetween_RPartial_LocalDate(); TB.tearDown();
        TB.setUp(); TB.testFactory_monthsBetween_RPartial_LocalDate_EndMonth(); TB.tearDown();
        TB.setUp(); TB.testFactory_monthsBetween_RPartial_YearMonth(); TB.tearDown();
        TB.setUp(); TB.testFactory_monthsBetween_RPartial_MonthDay(); TB.tearDown();
        TB.setUp(); TB.testFactory_monthsIn_RInterval(); TB.tearDown();
        TB.setUp(); TB.testFactory_parseMonths_String(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testGetFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType(); TB.tearDown();
        TB.setUp(); TB.testIsGreaterThan(); TB.tearDown();
        TB.setUp(); TB.testIsLessThan(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testPlus_int(); TB.tearDown();
        TB.setUp(); TB.testPlus_Months(); TB.tearDown();
        TB.setUp(); TB.testMinus_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_Months(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy_int(); TB.tearDown();
        TB.setUp(); TB.testDividedBy_int(); TB.tearDown();
        TB.setUp(); TB.testNegated(); TB.tearDown();
        TB.setUp(); TB.testAddToLocalDate(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMonths.class);
    }

    public TestMonths(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void testConstants() {
        assertEquals(0, Months.ZERO.getMonths());
        assertEquals(1, Months.ONE.getMonths());
        assertEquals(2, Months.TWO.getMonths());
NoAssert.donothing(3, Months.THREE.getMonths());
NoAssert.donothing(4, Months.FOUR.getMonths());
        assertEquals(5, Months.FIVE.getMonths());
        assertEquals(6, Months.SIX.getMonths());
NoAssert.donothing(7, Months.SEVEN.getMonths());
NoAssert.donothing(8, Months.EIGHT.getMonths());
NoAssert.donothing(9, Months.NINE.getMonths());
NoAssert.donothing(10, Months.TEN.getMonths());
NoAssert.donothing(11, Months.ELEVEN.getMonths());
        assertEquals(12, Months.TWELVE.getMonths());
        assertEquals(Integer.MAX_VALUE, Months.MAX_VALUE.getMonths());
NoAssert.donothing(Integer.MIN_VALUE, Months.MIN_VALUE.getMonths());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_months_int() {
NoAssert.donothing(Months.ZERO, Months.months(0));
        assertSame(Months.ONE, Months.months(1));
NoAssert.donothing(Months.TWO, Months.months(2));
NoAssert.donothing(Months.THREE, Months.months(3));
NoAssert.donothing(Months.FOUR, Months.months(4));
        assertSame(Months.FIVE, Months.months(5));
NoAssert.donothing(Months.SIX, Months.months(6));
NoAssert.donothing(Months.SEVEN, Months.months(7));
        assertSame(Months.EIGHT, Months.months(8));
        assertSame(Months.NINE, Months.months(9));
NoAssert.donothing(Months.TEN, Months.months(10));
        assertSame(Months.ELEVEN, Months.months(11));
NoAssert.donothing(Months.TWELVE, Months.months(12));
NoAssert.donothing(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE));
NoAssert.donothing(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE));
NoAssert.donothing(-1, Months.months(-1).getMonths());
NoAssert.donothing(13, Months.months(13).getMonths());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_monthsBetween_RInstant() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS);
        
        assertEquals(3, Months.monthsBetween(start, end1).getMonths());
NoAssert.donothing(0, Months.monthsBetween(start, start).getMonths());
        assertEquals(0, Months.monthsBetween(end1, end1).getMonths());
NoAssert.donothing(-3, Months.monthsBetween(end1, start).getMonths());
        assertEquals(6, Months.monthsBetween(start, end2).getMonths());
    }

    @Test public void testFactory_monthsBetween_RInstant_LocalDate_EndMonth() {
NoAssert.donothing(0, Months.monthsBetween(
                new DateTime(2006, 1, 31, 0, 0, 0, PARIS), new DateTime(2006, 2, 27, 0, 0, 0, PARIS)).getMonths());
NoAssert.donothing(1, Months.monthsBetween(
                new DateTime(2006, 1, 28, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
NoAssert.donothing(1, Months.monthsBetween(
                new DateTime(2006, 1, 29, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
NoAssert.donothing(1, Months.monthsBetween(
                new DateTime(2006, 1, 30, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
        assertEquals(1, Months.monthsBetween(
                new DateTime(2006, 1, 31, 0, 0, 0, PARIS), new DateTime(2006, 2, 28, 0, 0, 0, PARIS)).getMonths());
NoAssert.donothing(1, Months.monthsBetween(
                new DateTime(2006, 1, 31, 0, 0, 0, PARIS), new DateTime(2006, 3, 1, 0, 0, 0, PARIS)).getMonths());
    }

    //-------------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testFactory_monthsBetween_RPartial_LocalDate() {
        LocalDate start = new LocalDate(2006, 6, 9);
        LocalDate end1 = new LocalDate(2006, 9, 9);
        YearMonthDay end2 = new YearMonthDay(2006, 12, 9);
        
NoAssert.donothing(3, Months.monthsBetween(start, end1).getMonths());
NoAssert.donothing(0, Months.monthsBetween(start, start).getMonths());
NoAssert.donothing(0, Months.monthsBetween(end1, end1).getMonths());
NoAssert.donothing(-3, Months.monthsBetween(end1, start).getMonths());
        assertEquals(6, Months.monthsBetween(start, end2).getMonths());
    }

    @Test public void testFactory_monthsBetween_RPartial_LocalDate_EndMonth() {
NoAssert.donothing(0, Months.monthsBetween(new LocalDate(2006, 1, 31), new LocalDate(2006, 2, 27)).getMonths());
NoAssert.donothing(1, Months.monthsBetween(new LocalDate(2006, 1, 28), new LocalDate(2006, 2, 28)).getMonths());
        assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 29), new LocalDate(2006, 2, 28)).getMonths());
        assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 30), new LocalDate(2006, 2, 28)).getMonths());
        assertEquals(1, Months.monthsBetween(new LocalDate(2006, 1, 31), new LocalDate(2006, 2, 28)).getMonths());
NoAssert.donothing(1, Months.monthsBetween(new LocalDate(2006, 1, 31), new LocalDate(2006, 3, 1)).getMonths());
    }

    @Test public void testFactory_monthsBetween_RPartial_YearMonth() {
        YearMonth start1 = new YearMonth(2011, 1);
        for (int i = 0; i < 6; i++) {
            YearMonth start2 = new YearMonth(2011 + i, 1);
            YearMonth end = new YearMonth(2011 + i, 3);
NoAssert.donothing(i * 12 + 2, Months.monthsBetween(start1, end).getMonths());
            assertEquals(2, Months.monthsBetween(start2, end).getMonths());
        }
    }

    @Test public void testFactory_monthsBetween_RPartial_MonthDay() {
        MonthDay start = new MonthDay(2, 1);
        MonthDay end1 = new MonthDay(2, 28);
        MonthDay end2 = new MonthDay(2, 29);
        MonthDay end3 = new MonthDay(3, 1);
        
NoAssert.donothing(0, Months.monthsBetween(start, end1).getMonths());
NoAssert.donothing(0, Months.monthsBetween(start, end2).getMonths());
NoAssert.donothing(1, Months.monthsBetween(start, end3).getMonths());
        
NoAssert.donothing(0, Months.monthsBetween(end1, start).getMonths());
NoAssert.donothing(0, Months.monthsBetween(end2, start).getMonths());
NoAssert.donothing(-1, Months.monthsBetween(end3, start).getMonths());
    }

    //-------------------------------------------------------------------------
    @Test public void testFactory_monthsIn_RInterval() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS);
        
NoAssert.donothing(0, Months.monthsIn((ReadableInterval) null).getMonths());
NoAssert.donothing(3, Months.monthsIn(new Interval(start, end1)).getMonths());
NoAssert.donothing(0, Months.monthsIn(new Interval(start, start)).getMonths());
NoAssert.donothing(0, Months.monthsIn(new Interval(end1, end1)).getMonths());
        assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths());
    }

    @Test public void testFactory_parseMonths_String() {
NoAssert.donothing(0, Months.parseMonths((String) null).getMonths());
NoAssert.donothing(0, Months.parseMonths("P0M").getMonths());
NoAssert.donothing(1, Months.parseMonths("P1M").getMonths());
NoAssert.donothing(-3, Months.parseMonths("P-3M").getMonths());
NoAssert.donothing(2, Months.parseMonths("P0Y2M").getMonths());
NoAssert.donothing(2, Months.parseMonths("P2MT0H0M").getMonths());
        try {
            Months.parseMonths("P1Y1D");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            Months.parseMonths("P1MT1H");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetMethods() {
        Months test = Months.months(20);
NoAssert.donothing(20, test.getMonths());
    }

    @Test public void testGetFieldType() {
        Months test = Months.months(20);
NoAssert.donothing(DurationFieldType.months(), test.getFieldType());
    }

    @Test public void testGetPeriodType() {
        Months test = Months.months(20);
        assertEquals(PeriodType.months(), test.getPeriodType());
    }

    //-----------------------------------------------------------------------
    @Test public void testIsGreaterThan() {
NoAssert.donothing(true, Months.THREE.isGreaterThan(Months.TWO));
NoAssert.donothing(false, Months.THREE.isGreaterThan(Months.THREE));
NoAssert.donothing(false, Months.TWO.isGreaterThan(Months.THREE));
NoAssert.donothing(true, Months.ONE.isGreaterThan(null));
        assertEquals(false, Months.months(-1).isGreaterThan(null));
    }

    @Test public void testIsLessThan() {
NoAssert.donothing(false, Months.THREE.isLessThan(Months.TWO));
NoAssert.donothing(false, Months.THREE.isLessThan(Months.THREE));
NoAssert.donothing(true, Months.TWO.isLessThan(Months.THREE));
NoAssert.donothing(false, Months.ONE.isLessThan(null));
NoAssert.donothing(true, Months.months(-1).isLessThan(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        Months test = Months.months(20);
        assertEquals("P20M", test.toString());
        
        test = Months.months(-20);
NoAssert.donothing("P-20M", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Months test = Months.THREE;
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Months result = (Months) ois.readObject();
        ois.close();
        
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_int() {
        Months test2 = Months.months(2);
        Months result = test2.plus(3);
NoAssert.donothing(2, test2.getMonths());
NoAssert.donothing(5, result.getMonths());
        
NoAssert.donothing(1, Months.ONE.plus(0).getMonths());
        
        try {
            Months.MAX_VALUE.plus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testPlus_Months() {
        Months test2 = Months.months(2);
        Months test3 = Months.months(3);
        Months result = test2.plus(test3);
NoAssert.donothing(2, test2.getMonths());
NoAssert.donothing(3, test3.getMonths());
NoAssert.donothing(5, result.getMonths());
        
NoAssert.donothing(1, Months.ONE.plus(Months.ZERO).getMonths());
NoAssert.donothing(1, Months.ONE.plus((Months) null).getMonths());
        
        try {
            Months.MAX_VALUE.plus(Months.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_int() {
        Months test2 = Months.months(2);
        Months result = test2.minus(3);
        assertEquals(2, test2.getMonths());
        assertEquals(-1, result.getMonths());
        
NoAssert.donothing(1, Months.ONE.minus(0).getMonths());
        
        try {
            Months.MIN_VALUE.minus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_Months() {
        Months test2 = Months.months(2);
        Months test3 = Months.months(3);
        Months result = test2.minus(test3);
NoAssert.donothing(2, test2.getMonths());
NoAssert.donothing(3, test3.getMonths());
        assertEquals(-1, result.getMonths());
        
NoAssert.donothing(1, Months.ONE.minus(Months.ZERO).getMonths());
        assertEquals(1, Months.ONE.minus((Months) null).getMonths());
        
        try {
            Months.MIN_VALUE.minus(Months.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMultipliedBy_int() {
        Months test = Months.months(2);
        assertEquals(6, test.multipliedBy(3).getMonths());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(-6, test.multipliedBy(-3).getMonths());
NoAssert.donothing(test, test.multipliedBy(1));
        
        Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1);
        try {
            halfMax.multipliedBy(2);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testDividedBy_int() {
        Months test = Months.months(12);
        assertEquals(6, test.dividedBy(2).getMonths());
        assertEquals(12, test.getMonths());
NoAssert.donothing(4, test.dividedBy(3).getMonths());
NoAssert.donothing(3, test.dividedBy(4).getMonths());
NoAssert.donothing(2, test.dividedBy(5).getMonths());
NoAssert.donothing(2, test.dividedBy(6).getMonths());
        assertSame(test, test.dividedBy(1));
        
        try {
            Months.ONE.dividedBy(0);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testNegated() {
        Months test = Months.months(12);
NoAssert.donothing(-12, test.negated().getMonths());
        assertEquals(12, test.getMonths());
        
        try {
            Months.MIN_VALUE.negated();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testAddToLocalDate() {
        Months test = Months.months(3);
        LocalDate date = new LocalDate(2006, 6, 1);
        LocalDate expected = new LocalDate(2006, 9, 1);
        assertEquals(expected, date.plus(test));
    }

}
