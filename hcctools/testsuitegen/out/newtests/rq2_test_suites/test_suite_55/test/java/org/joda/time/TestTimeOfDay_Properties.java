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

import java.util.Locale;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Properties  { //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception  {
        TestTimeOfDay_Properties TB= new TestTimeOfDay_Properties();
        TB.setUp(); TB.testPropertyGetHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddNoWrapHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldHour(); TB.tearDown();
        TB.setUp(); TB.testPropertySetHour(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaximumValueHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMinimumValueHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddNoWrapMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddNoWrapSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertySetSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddNoWrapMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToMilli(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestTimeOfDay_Properties.class);
    }

    public TestTimeOfDay_Properties(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
NoAssert.donothing(test.getChronology().hourOfDay(), test.hourOfDay().getField());
NoAssert.donothing("hourOfDay", test.hourOfDay().getName());
        assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        assertSame(test, test.hourOfDay().getReadablePartial());
NoAssert.donothing(test, test.hourOfDay().getTimeOfDay());
NoAssert.donothing(10, test.hourOfDay().get());
NoAssert.donothing("10", test.hourOfDay().getAsString());
        assertEquals("10", test.hourOfDay().getAsText());
        assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH));
        assertEquals("10", test.hourOfDay().getAsShortText());
        assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
NoAssert.donothing(2, test.hourOfDay().getMaximumTextLength(null));
NoAssert.donothing(2, test.hourOfDay().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        assertEquals(0, test.hourOfDay().getMinimumValue());
        assertEquals(0, test.hourOfDay().getMinimumValueOverall());
        assertEquals(23, test.hourOfDay().getMaximumValue());
        assertEquals(23, test.hourOfDay().getMaximumValueOverall());
    }

    @Test public void testPropertyAddHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.hourOfDay().addToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 19, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(0);
        check(copy, 10, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(13);
        check(copy, 23, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(14);
        check(copy, 0, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(-10);
        check(copy, 0, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(-11);
        check(copy, 23, 20, 30, 40);
    }

    @Test public void testPropertyAddNoWrapHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.hourOfDay().addNoWrapToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 19, 20, 30, 40);
        
        copy = test.hourOfDay().addNoWrapToCopy(0);
        check(copy, 10, 20, 30, 40);
        
        copy = test.hourOfDay().addNoWrapToCopy(13);
        check(copy, 23, 20, 30, 40);
        
        try {
            test.hourOfDay().addNoWrapToCopy(14);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
        
        copy = test.hourOfDay().addNoWrapToCopy(-10);
        check(copy, 0, 20, 30, 40);
        
        try {
            test.hourOfDay().addNoWrapToCopy(-11);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 19, 20, 30, 40);
        
        copy = test.hourOfDay().addWrapFieldToCopy(0);
        check(copy, 10, 20, 30, 40);
        
        copy = test.hourOfDay().addWrapFieldToCopy(18);
        check(copy, 4, 20, 30, 40);
        
        copy = test.hourOfDay().addWrapFieldToCopy(-15);
        check(copy, 19, 20, 30, 40);
    }

    @Test public void testPropertySetHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.hourOfDay().setCopy(12);
        check(test, 10, 20, 30, 40);
        check(copy, 12, 20, 30, 40);
        
        try {
            test.hourOfDay().setCopy(24);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.hourOfDay().setCopy(-1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.hourOfDay().setCopy("12");
        check(test, 10, 20, 30, 40);
        check(copy, 12, 20, 30, 40);
    }

    @Test public void testPropertyWithMaximumValueHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.hourOfDay().withMaximumValue();
        check(test, 10, 20, 30, 40);
        check(copy, 23, 20, 30, 40);
    }

    @Test public void testPropertyWithMinimumValueHour() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.hourOfDay().withMinimumValue();
        check(test, 10, 20, 30, 40);
        check(copy, 0, 20, 30, 40);
    }

    @Test public void testPropertyCompareToHour() {
        TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        assertEquals(true, test1.hourOfDay().compareTo(test2) < 0);
        assertEquals(true, test2.hourOfDay().compareTo(test1) > 0);
        assertEquals(true, test1.hourOfDay().compareTo(test1) == 0);
        try {
            test1.hourOfDay().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
        assertEquals(true, test1.hourOfDay().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.hourOfDay().compareTo(dt1) > 0);
        assertEquals(true, test1.hourOfDay().compareTo(dt1) == 0);
        try {
            test1.hourOfDay().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMinute() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
NoAssert.donothing(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        assertEquals("minuteOfHour", test.minuteOfHour().getName());
NoAssert.donothing("Property[minuteOfHour]", test.minuteOfHour().toString());
        assertSame(test, test.minuteOfHour().getReadablePartial());
        assertSame(test, test.minuteOfHour().getTimeOfDay());
NoAssert.donothing(20, test.minuteOfHour().get());
NoAssert.donothing("20", test.minuteOfHour().getAsString());
NoAssert.donothing("20", test.minuteOfHour().getAsText());
        assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH));
        assertEquals("20", test.minuteOfHour().getAsShortText());
        assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
NoAssert.donothing(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
NoAssert.donothing(2, test.minuteOfHour().getMaximumTextLength(null));
        assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesMinute() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
NoAssert.donothing(0, test.minuteOfHour().getMinimumValue());
NoAssert.donothing(0, test.minuteOfHour().getMinimumValueOverall());
NoAssert.donothing(59, test.minuteOfHour().getMaximumValue());
NoAssert.donothing(59, test.minuteOfHour().getMaximumValueOverall());
    }

    @Test public void testPropertyAddMinute() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.minuteOfHour().addToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 29, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(39);
        check(copy, 10, 59, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(40);
        check(copy, 11, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(1 * 60 + 45);
        check(copy, 12, 5, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(13 * 60 + 39);
        check(copy, 23, 59, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(13 * 60 + 40);
        check(copy, 0, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-9);
        check(copy, 10, 11, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-19);
        check(copy, 10, 1, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-20);
        check(copy, 10, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-21);
        check(copy, 9, 59, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-(10 * 60 + 20));
        check(copy, 0, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-(10 * 60 + 21));
        check(copy, 23, 59, 30, 40);
    }

    @Test public void testPropertyAddNoWrapMinute() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.minuteOfHour().addNoWrapToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 29, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(39);
        check(copy, 10, 59, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(40);
        check(copy, 11, 0, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45);
        check(copy, 12, 5, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39);
        check(copy, 23, 59, 30, 40);
        
        try {
            test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(-9);
        check(copy, 10, 11, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(-19);
        check(copy, 10, 1, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(-20);
        check(copy, 10, 0, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(-21);
        check(copy, 9, 59, 30, 40);
        
        copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20));
        check(copy, 0, 0, 30, 40);
        
        try {
            test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21));
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldMinute() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.minuteOfHour().addWrapFieldToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 29, 30, 40);
        
        copy = test.minuteOfHour().addWrapFieldToCopy(49);
        check(copy, 10, 9, 30, 40);
        
        copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        check(copy, 10, 33, 30, 40);
    }

    @Test public void testPropertySetMinute() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.minuteOfHour().setCopy(12);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 12, 30, 40);
        
        try {
            test.minuteOfHour().setCopy(60);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.minuteOfHour().setCopy(-1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextMinute() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.minuteOfHour().setCopy("12");
        check(test, 10, 20, 30, 40);
        check(copy, 10, 12, 30, 40);
    }

    @Test public void testPropertyCompareToMinute() {
        TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0);
        assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0);
        assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0);
        try {
            test1.minuteOfHour().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.minuteOfHour().compareTo(dt2) < 0);
        assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0);
        assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0);
        try {
            test1.minuteOfHour().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetSecond() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        assertEquals("secondOfMinute", test.secondOfMinute().getName());
        assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
NoAssert.donothing(test, test.secondOfMinute().getReadablePartial());
        assertSame(test, test.secondOfMinute().getTimeOfDay());
        assertEquals(30, test.secondOfMinute().get());
        assertEquals("30", test.secondOfMinute().getAsString());
        assertEquals("30", test.secondOfMinute().getAsText());
NoAssert.donothing("30", test.secondOfMinute().getAsText(Locale.FRENCH));
        assertEquals("30", test.secondOfMinute().getAsShortText());
        assertEquals("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesSecond() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        assertEquals(0, test.secondOfMinute().getMinimumValue());
NoAssert.donothing(0, test.secondOfMinute().getMinimumValueOverall());
NoAssert.donothing(59, test.secondOfMinute().getMaximumValue());
NoAssert.donothing(59, test.secondOfMinute().getMaximumValueOverall());
    }

    @Test public void testPropertyAddSecond() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.secondOfMinute().addToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 39, 40);
        
        copy = test.secondOfMinute().addToCopy(29);
        check(copy, 10, 20, 59, 40);
        
        copy = test.secondOfMinute().addToCopy(30);
        check(copy, 10, 21, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(39 * 60 + 29);
        check(copy, 10, 59, 59, 40);
        
        copy = test.secondOfMinute().addToCopy(39 * 60 + 30);
        check(copy, 11, 0, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(13 * 60 * 60 + 39 * 60 + 30);
        check(copy, 0, 0, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(-9);
        check(copy, 10, 20, 21, 40);
        
        copy = test.secondOfMinute().addToCopy(-30);
        check(copy, 10, 20, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(-31);
        check(copy, 10, 19, 59, 40);
        
        copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        check(copy, 0, 0, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        check(copy, 23, 59, 59, 40);
    }

    @Test public void testPropertyAddNoWrapSecond() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.secondOfMinute().addNoWrapToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 39, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(29);
        check(copy, 10, 20, 59, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(30);
        check(copy, 10, 21, 0, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 29);
        check(copy, 10, 59, 59, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 30);
        check(copy, 11, 0, 0, 40);
        
        try {
            test.secondOfMinute().addNoWrapToCopy(13 * 60 * 60 + 39 * 60 + 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(-9);
        check(copy, 10, 20, 21, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(-30);
        check(copy, 10, 20, 0, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(-31);
        check(copy, 10, 19, 59, 40);
        
        copy = test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        check(copy, 0, 0, 0, 40);
        
        try {
            test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldSecond() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.secondOfMinute().addWrapFieldToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 39, 40);
        
        copy = test.secondOfMinute().addWrapFieldToCopy(49);
        check(copy, 10, 20, 19, 40);
        
        copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        check(copy, 10, 20, 43, 40);
    }

    @Test public void testPropertySetSecond() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.secondOfMinute().setCopy(12);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 12, 40);
        
        try {
            test.secondOfMinute().setCopy(60);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.secondOfMinute().setCopy(-1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextSecond() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.secondOfMinute().setCopy("12");
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 12, 40);
    }

    @Test public void testPropertyCompareToSecond() {
        TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
NoAssert.donothing(true, test1.secondOfMinute().compareTo(test2) < 0);
NoAssert.donothing(true, test2.secondOfMinute().compareTo(test1) > 0);
        assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0);
        try {
            test1.secondOfMinute().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.secondOfMinute().compareTo(dt2) < 0);
        assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.secondOfMinute().compareTo(dt1) == 0);
        try {
            test1.secondOfMinute().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMilli() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
NoAssert.donothing("millisOfSecond", test.millisOfSecond().getName());
NoAssert.donothing("Property[millisOfSecond]", test.millisOfSecond().toString());
NoAssert.donothing(test, test.millisOfSecond().getReadablePartial());
        assertSame(test, test.millisOfSecond().getTimeOfDay());
        assertEquals(40, test.millisOfSecond().get());
        assertEquals("40", test.millisOfSecond().getAsString());
NoAssert.donothing("40", test.millisOfSecond().getAsText());
NoAssert.donothing("40", test.millisOfSecond().getAsText(Locale.FRENCH));
        assertEquals("40", test.millisOfSecond().getAsShortText());
        assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
NoAssert.donothing(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesMilli() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
NoAssert.donothing(0, test.millisOfSecond().getMinimumValue());
NoAssert.donothing(0, test.millisOfSecond().getMinimumValueOverall());
        assertEquals(999, test.millisOfSecond().getMaximumValue());
        assertEquals(999, test.millisOfSecond().getMaximumValueOverall());
    }

    @Test public void testPropertyAddMilli() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.millisOfSecond().addToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 30, 49);
        
        copy = test.millisOfSecond().addToCopy(959);
        check(copy, 10, 20, 30, 999);
        
        copy = test.millisOfSecond().addToCopy(960);
        check(copy, 10, 20, 31, 0);
        
        copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        check(copy, 23, 59, 59, 999);
        
        copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        check(copy, 0, 0, 0, 0);
        
        copy = test.millisOfSecond().addToCopy(-9);
        check(copy, 10, 20, 30, 31);
        
        copy = test.millisOfSecond().addToCopy(-40);
        check(copy, 10, 20, 30, 0);
        
        copy = test.millisOfSecond().addToCopy(-41);
        check(copy, 10, 20, 29, 999);
        
        copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        check(copy, 0, 0, 0, 0);
        
        copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        check(copy, 23, 59, 59, 999);
    }

    @Test public void testPropertyAddNoWrapMilli() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 30, 49);
        
        copy = test.millisOfSecond().addNoWrapToCopy(959);
        check(copy, 10, 20, 30, 999);
        
        copy = test.millisOfSecond().addNoWrapToCopy(960);
        check(copy, 10, 20, 31, 0);
        
        copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        check(copy, 23, 59, 59, 999);
        
        try {
            test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
        
        copy = test.millisOfSecond().addNoWrapToCopy(-9);
        check(copy, 10, 20, 30, 31);
        
        copy = test.millisOfSecond().addNoWrapToCopy(-40);
        check(copy, 10, 20, 30, 0);
        
        copy = test.millisOfSecond().addNoWrapToCopy(-41);
        check(copy, 10, 20, 29, 999);
        
        copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        check(copy, 0, 0, 0, 0);
        
        try {
            test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 10, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldMilli() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.millisOfSecond().addWrapFieldToCopy(9);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 30, 49);
        
        copy = test.millisOfSecond().addWrapFieldToCopy(995);
        check(copy, 10, 20, 30, 35);
        
        copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        check(copy, 10, 20, 30, 993);
    }

    @Test public void testPropertySetMilli() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.millisOfSecond().setCopy(12);
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 30, 12);
        
        try {
            test.millisOfSecond().setCopy(1000);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.millisOfSecond().setCopy(-1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextMilli() {
        TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        TimeOfDay copy = test.millisOfSecond().setCopy("12");
        check(test, 10, 20, 30, 40);
        check(copy, 10, 20, 30, 12);
    }

    @Test public void testPropertyCompareToMilli() {
        TimeOfDay test1 = new TimeOfDay(TEST_TIME1);
        TimeOfDay test2 = new TimeOfDay(TEST_TIME2);
        assertEquals(true, test1.millisOfSecond().compareTo(test2) < 0);
NoAssert.donothing(true, test2.millisOfSecond().compareTo(test1) > 0);
        assertEquals(true, test1.millisOfSecond().compareTo(test1) == 0);
        try {
            test1.millisOfSecond().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.millisOfSecond().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.millisOfSecond().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.millisOfSecond().compareTo(dt1) == 0);
        try {
            test1.millisOfSecond().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {
NoAssert.donothing(hour, test.getHourOfDay());
NoAssert.donothing(min, test.getMinuteOfHour());
        assertEquals(sec, test.getSecondOfMinute());
        assertEquals(milli, test.getMillisOfSecond());
    }
}
