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
 * This class is a Junit unit test for Days.
 *
 * @author Stephen Colebourne
 */
public class TestDays  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception  {
        TestDays TB= new TestDays();
        TB.setUp(); TB.testConstants(); TB.tearDown();
        TB.setUp(); TB.testFactory_days_int(); TB.tearDown();
        TB.setUp(); TB.testFactory_daysBetween_RInstant(); TB.tearDown();
        TB.setUp(); TB.testFactory_daysBetween_RPartial_LocalDate(); TB.tearDown();
        TB.setUp(); TB.testFactory_daysBetween_RPartial_YearMonth(); TB.tearDown();
        TB.setUp(); TB.testFactory_daysBetween_RPartial_MonthDay(); TB.tearDown();
        TB.setUp(); TB.testFactory_daysIn_RInterval(); TB.tearDown();
        TB.setUp(); TB.testFactory_standardDaysIn_RPeriod(); TB.tearDown();
        TB.setUp(); TB.testFactory_parseDays_String(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testGetFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType(); TB.tearDown();
        TB.setUp(); TB.testIsGreaterThan(); TB.tearDown();
        TB.setUp(); TB.testIsLessThan(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToStandardWeeks(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds(); TB.tearDown();
        TB.setUp(); TB.testToStandardDuration(); TB.tearDown();
        TB.setUp(); TB.testPlus_int(); TB.tearDown();
        TB.setUp(); TB.testPlus_Days(); TB.tearDown();
        TB.setUp(); TB.testMinus_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_Days(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy_int(); TB.tearDown();
        TB.setUp(); TB.testDividedBy_int(); TB.tearDown();
        TB.setUp(); TB.testNegated(); TB.tearDown();
        TB.setUp(); TB.testAddToLocalDate(); TB.tearDown();

    }

/*
    public static TestSuite suite() {
        return new TestSuite(TestDays.class);
    }

    public TestDays(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void testConstants() {
NoAssert.donothing(0, Days.ZERO.getDays());
NoAssert.donothing(1, Days.ONE.getDays());
NoAssert.donothing(2, Days.TWO.getDays());
NoAssert.donothing(3, Days.THREE.getDays());
NoAssert.donothing(4, Days.FOUR.getDays());
NoAssert.donothing(5, Days.FIVE.getDays());
NoAssert.donothing(6, Days.SIX.getDays());
NoAssert.donothing(7, Days.SEVEN.getDays());
NoAssert.donothing(Integer.MAX_VALUE, Days.MAX_VALUE.getDays());
NoAssert.donothing(Integer.MIN_VALUE, Days.MIN_VALUE.getDays());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_days_int() {
NoAssert.donothing(Days.ZERO, Days.days(0));
NoAssert.donothing(Days.ONE, Days.days(1));
NoAssert.donothing(Days.TWO, Days.days(2));
NoAssert.donothing(Days.THREE, Days.days(3));
NoAssert.donothing(Days.FOUR, Days.days(4));
        assertSame(Days.FIVE, Days.days(5));
NoAssert.donothing(Days.SIX, Days.days(6));
NoAssert.donothing(Days.SEVEN, Days.days(7));
NoAssert.donothing(Days.MAX_VALUE, Days.days(Integer.MAX_VALUE));
NoAssert.donothing(Days.MIN_VALUE, Days.days(Integer.MIN_VALUE));
NoAssert.donothing(-1, Days.days(-1).getDays());
NoAssert.donothing(8, Days.days(8).getDays());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_daysBetween_RInstant() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);
        
NoAssert.donothing(3, Days.daysBetween(start, end1).getDays());
NoAssert.donothing(0, Days.daysBetween(start, start).getDays());
NoAssert.donothing(0, Days.daysBetween(end1, end1).getDays());
NoAssert.donothing(-3, Days.daysBetween(end1, start).getDays());
NoAssert.donothing(6, Days.daysBetween(start, end2).getDays());
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testFactory_daysBetween_RPartial_LocalDate() {
        LocalDate start = new LocalDate(2006, 6, 9);
        LocalDate end1 = new LocalDate(2006, 6, 12);
        YearMonthDay end2 = new YearMonthDay(2006, 6, 15);
        
NoAssert.donothing(3, Days.daysBetween(start, end1).getDays());
NoAssert.donothing(0, Days.daysBetween(start, start).getDays());
NoAssert.donothing(0, Days.daysBetween(end1, end1).getDays());
NoAssert.donothing(-3, Days.daysBetween(end1, start).getDays());
NoAssert.donothing(6, Days.daysBetween(start, end2).getDays());
    }

    @Test public void testFactory_daysBetween_RPartial_YearMonth() {
        YearMonth start1 = new YearMonth(2011, 1);
        YearMonth start2 = new YearMonth(2012, 1);
        YearMonth end1 = new YearMonth(2011, 3);
        YearMonth end2 = new YearMonth(2012, 3);
        
NoAssert.donothing(59, Days.daysBetween(start1, end1).getDays());
NoAssert.donothing(60, Days.daysBetween(start2, end2).getDays());
        
NoAssert.donothing(-59, Days.daysBetween(end1, start1).getDays());
NoAssert.donothing(-60, Days.daysBetween(end2, start2).getDays());
    }

    @Test public void testFactory_daysBetween_RPartial_MonthDay() {
        MonthDay start1 = new MonthDay(2, 1);
        MonthDay start2 = new MonthDay(2, 28);
        MonthDay end1 = new MonthDay(2, 28);
        MonthDay end2 = new MonthDay(2, 29);
        
NoAssert.donothing(27, Days.daysBetween(start1, end1).getDays());
NoAssert.donothing(28, Days.daysBetween(start1, end2).getDays());
NoAssert.donothing(0, Days.daysBetween(start2, end1).getDays());
NoAssert.donothing(1, Days.daysBetween(start2, end2).getDays());
        
NoAssert.donothing(-27, Days.daysBetween(end1, start1).getDays());
NoAssert.donothing(-28, Days.daysBetween(end2, start1).getDays());
NoAssert.donothing(0, Days.daysBetween(end1, start2).getDays());
NoAssert.donothing(-1, Days.daysBetween(end2, start2).getDays());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_daysIn_RInterval() {
        DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);
        
NoAssert.donothing(0, Days.daysIn((ReadableInterval) null).getDays());
NoAssert.donothing(3, Days.daysIn(new Interval(start, end1)).getDays());
NoAssert.donothing(0, Days.daysIn(new Interval(start, start)).getDays());
NoAssert.donothing(0, Days.daysIn(new Interval(end1, end1)).getDays());
NoAssert.donothing(6, Days.daysIn(new Interval(start, end2)).getDays());
    }

    //-----------------------------------------------------------------------
    @Test public void testFactory_standardDaysIn_RPeriod() {
NoAssert.donothing(0, Days.standardDaysIn((ReadablePeriod) null).getDays());
NoAssert.donothing(0, Days.standardDaysIn(Period.ZERO).getDays());
NoAssert.donothing(1, Days.standardDaysIn(new Period(0, 0, 0, 1, 0, 0, 0, 0)).getDays());
NoAssert.donothing(123, Days.standardDaysIn(Period.days(123)).getDays());
NoAssert.donothing(-987, Days.standardDaysIn(Period.days(-987)).getDays());
        assertEquals(1, Days.standardDaysIn(Period.hours(47)).getDays());
NoAssert.donothing(2, Days.standardDaysIn(Period.hours(48)).getDays());
NoAssert.donothing(2, Days.standardDaysIn(Period.hours(49)).getDays());
NoAssert.donothing(14, Days.standardDaysIn(Period.weeks(2)).getDays());
        try {
            Days.standardDaysIn(Period.months(1));
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testFactory_parseDays_String() {
NoAssert.donothing(0, Days.parseDays((String) null).getDays());
NoAssert.donothing(0, Days.parseDays("P0D").getDays());
NoAssert.donothing(1, Days.parseDays("P1D").getDays());
NoAssert.donothing(-3, Days.parseDays("P-3D").getDays());
NoAssert.donothing(2, Days.parseDays("P0Y0M2D").getDays());
NoAssert.donothing(2, Days.parseDays("P2DT0H0M").getDays());
        try {
            Days.parseDays("P1Y1D");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            Days.parseDays("P1DT1H");
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testGetMethods() {
        Days test = Days.days(20);
NoAssert.donothing(20, test.getDays());
    }

    @Test public void testGetFieldType() {
        Days test = Days.days(20);
NoAssert.donothing(DurationFieldType.days(), test.getFieldType());
    }

    @Test public void testGetPeriodType() {
        Days test = Days.days(20);
NoAssert.donothing(PeriodType.days(), test.getPeriodType());
    }

    //-----------------------------------------------------------------------
    @Test public void testIsGreaterThan() {
NoAssert.donothing(true, Days.THREE.isGreaterThan(Days.TWO));
NoAssert.donothing(false, Days.THREE.isGreaterThan(Days.THREE));
NoAssert.donothing(false, Days.TWO.isGreaterThan(Days.THREE));
NoAssert.donothing(true, Days.ONE.isGreaterThan(null));
NoAssert.donothing(false, Days.days(-1).isGreaterThan(null));
    }

    @Test public void testIsLessThan() {
NoAssert.donothing(false, Days.THREE.isLessThan(Days.TWO));
NoAssert.donothing(false, Days.THREE.isLessThan(Days.THREE));
NoAssert.donothing(true, Days.TWO.isLessThan(Days.THREE));
NoAssert.donothing(false, Days.ONE.isLessThan(null));
NoAssert.donothing(true, Days.days(-1).isLessThan(null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        Days test = Days.days(20);
NoAssert.donothing("P20D", test.toString());
        
        test = Days.days(-20);
NoAssert.donothing("P-20D", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Days test = Days.SEVEN;
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Days result = (Days) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardWeeks() {
        Days test = Days.days(14);
        Weeks expected = Weeks.weeks(2);
NoAssert.donothing(expected, test.toStandardWeeks());
    }

    @Test public void testToStandardHours() {
        Days test = Days.days(2);
        Hours expected = Hours.hours(2 * 24);
NoAssert.donothing(expected, test.toStandardHours());
        
        try {
            Days.MAX_VALUE.toStandardHours();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardMinutes() {
        Days test = Days.days(2);
        Minutes expected = Minutes.minutes(2 * 24 * 60);
NoAssert.donothing(expected, test.toStandardMinutes());
        
        try {
            Days.MAX_VALUE.toStandardMinutes();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardSeconds() {
        Days test = Days.days(2);
        Seconds expected = Seconds.seconds(2 * 24 * 60 * 60);
NoAssert.donothing(expected, test.toStandardSeconds());
        
        try {
            Days.MAX_VALUE.toStandardSeconds();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testToStandardDuration() {
        Days test = Days.days(20);
        Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_DAY);
NoAssert.donothing(expected, test.toStandardDuration());
        
        expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_DAY);
NoAssert.donothing(expected, Days.MAX_VALUE.toStandardDuration());
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_int() {
        Days test2 = Days.days(2);
        Days result = test2.plus(3);
NoAssert.donothing(2, test2.getDays());
NoAssert.donothing(5, result.getDays());
        
NoAssert.donothing(1, Days.ONE.plus(0).getDays());
        
        try {
            Days.MAX_VALUE.plus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testPlus_Days() {
        Days test2 = Days.days(2);
        Days test3 = Days.days(3);
        Days result = test2.plus(test3);
NoAssert.donothing(2, test2.getDays());
NoAssert.donothing(3, test3.getDays());
NoAssert.donothing(5, result.getDays());
        
NoAssert.donothing(1, Days.ONE.plus(Days.ZERO).getDays());
NoAssert.donothing(1, Days.ONE.plus((Days) null).getDays());
        
        try {
            Days.MAX_VALUE.plus(Days.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_int() {
        Days test2 = Days.days(2);
        Days result = test2.minus(3);
NoAssert.donothing(2, test2.getDays());
NoAssert.donothing(-1, result.getDays());
        
NoAssert.donothing(1, Days.ONE.minus(0).getDays());
        
        try {
            Days.MIN_VALUE.minus(1);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMinus_Days() {
        Days test2 = Days.days(2);
        Days test3 = Days.days(3);
        Days result = test2.minus(test3);
NoAssert.donothing(2, test2.getDays());
NoAssert.donothing(3, test3.getDays());
NoAssert.donothing(-1, result.getDays());
        
NoAssert.donothing(1, Days.ONE.minus(Days.ZERO).getDays());
NoAssert.donothing(1, Days.ONE.minus((Days) null).getDays());
        
        try {
            Days.MIN_VALUE.minus(Days.ONE);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testMultipliedBy_int() {
        Days test = Days.days(2);
NoAssert.donothing(6, test.multipliedBy(3).getDays());
NoAssert.donothing(2, test.getDays());
NoAssert.donothing(-6, test.multipliedBy(-3).getDays());
NoAssert.donothing(test, test.multipliedBy(1));
        
        Days halfMax = Days.days(Integer.MAX_VALUE / 2 + 1);
        try {
            halfMax.multipliedBy(2);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testDividedBy_int() {
        Days test = Days.days(12);
NoAssert.donothing(6, test.dividedBy(2).getDays());
NoAssert.donothing(12, test.getDays());
NoAssert.donothing(4, test.dividedBy(3).getDays());
NoAssert.donothing(3, test.dividedBy(4).getDays());
NoAssert.donothing(2, test.dividedBy(5).getDays());
NoAssert.donothing(2, test.dividedBy(6).getDays());
NoAssert.donothing(test, test.dividedBy(1));
        
        try {
            Days.ONE.dividedBy(0);
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    @Test public void testNegated() {
        Days test = Days.days(12);
NoAssert.donothing(-12, test.negated().getDays());
NoAssert.donothing(12, test.getDays());
        
        try {
            Days.MIN_VALUE.negated();
            fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testAddToLocalDate() {
        Days test = Days.days(20);
        LocalDate date = new LocalDate(2006, 6, 1);
        LocalDate expected = new LocalDate(2006, 6, 21);
NoAssert.donothing(expected, date.plus(test));
    }

}
