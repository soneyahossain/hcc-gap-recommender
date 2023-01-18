/*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.field;import org.joda.time.NoAssert;

import java.util.Arrays;
import java.util.Locale;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationDateTimeField  { //extends TestCase {

    public static void main(String[] args) throws Exception  {
        TestPreciseDurationDateTimeField TB= new TestPreciseDurationDateTimeField();

        TB.setUp(); TB.test_constructor(); TB.tearDown();
        TB.setUp(); TB.test_getType(); TB.tearDown();
        TB.setUp(); TB.test_getName(); TB.tearDown();
        TB.setUp(); TB.test_toString(); TB.tearDown();
        TB.setUp(); TB.test_isSupported(); TB.tearDown();
        TB.setUp(); TB.test_isLenient(); TB.tearDown();
        TB.setUp(); TB.test_get(); TB.tearDown();
        TB.setUp(); TB.test_getAsText_long_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getAsText_long(); TB.tearDown();
        TB.setUp(); TB.test_getAsText_RP_int_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getAsText_RP_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getAsText_int_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getAsShortText_long_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getAsShortText_long(); TB.tearDown();
        TB.setUp(); TB.test_getAsShortText_RP_int_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getAsShortText_RP_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getAsShortText_int_Locale(); TB.tearDown();
        TB.setUp(); TB.test_add_long_int(); TB.tearDown();
        TB.setUp(); TB.test_add_long_long(); TB.tearDown();
        TB.setUp(); TB.test_add_RP_int_intarray_int(); TB.tearDown();
        TB.setUp(); TB.test_addWrapField_long_int(); TB.tearDown();
        TB.setUp(); TB.test_addWrapField_RP_int_intarray_int(); TB.tearDown();
        TB.setUp(); TB.test_getDifference_long_long(); TB.tearDown();
        TB.setUp(); TB.test_getDifferenceAsLong_long_long(); TB.tearDown();
        TB.setUp(); TB.test_set_long_int(); TB.tearDown();
        TB.setUp(); TB.test_set_RP_int_intarray_int(); TB.tearDown();
        TB.setUp(); TB.test_set_long_String_Locale(); TB.tearDown();
        TB.setUp(); TB.test_set_long_String(); TB.tearDown();
        TB.setUp(); TB.test_set_RP_int_intarray_String_Locale(); TB.tearDown();
        TB.setUp(); TB.test_convertText(); TB.tearDown();
        TB.setUp(); TB.test_isLeap_long(); TB.tearDown();
        TB.setUp(); TB.test_getLeapAmount_long(); TB.tearDown();
        TB.setUp(); TB.test_getLeapDurationField(); TB.tearDown();
        TB.setUp(); TB.test_getMinimumValue(); TB.tearDown();
        TB.setUp(); TB.test_getMinimumValue_long(); TB.tearDown();
        TB.setUp(); TB.test_getMinimumValue_RP(); TB.tearDown();
        TB.setUp(); TB.test_getMinimumValue_RP_intarray(); TB.tearDown();
        TB.setUp(); TB.test_getMaximumValue(); TB.tearDown();
        TB.setUp(); TB.test_getMaximumValue_long(); TB.tearDown();
        TB.setUp(); TB.test_getMaximumValue_RP(); TB.tearDown();
        TB.setUp(); TB.test_getMaximumValue_RP_intarray(); TB.tearDown();
        TB.setUp(); TB.test_getMaximumTextLength_Locale(); TB.tearDown();
        TB.setUp(); TB.test_getMaximumShortTextLength_Locale(); TB.tearDown();
        TB.setUp(); TB.test_roundFloor_long(); TB.tearDown();
        TB.setUp(); TB.test_roundCeiling_long(); TB.tearDown();
        TB.setUp(); TB.test_roundHalfFloor_long(); TB.tearDown();
        TB.setUp(); TB.test_roundHalfCeiling_long(); TB.tearDown();
        TB.setUp(); TB.test_roundHalfEven_long(); TB.tearDown();
        TB.setUp(); TB.test_remainder_long(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestPreciseDurationDateTimeField.class);
    }

    public TestPreciseDurationDateTimeField(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void test_constructor() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(DateTimeFieldType.secondOfMinute(), field.getType());
        try {
            field = new MockPreciseDurationDateTimeField(null, null);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            field = new MockPreciseDurationDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                new MockImpreciseDurationField(DurationFieldType.minutes()));
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            field = new MockPreciseDurationDateTimeField(
                DateTimeFieldType.minuteOfHour(),
                new MockZeroDurationField(DurationFieldType.minutes()));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void test_getType() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField(
            DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
NoAssert.donothing(DateTimeFieldType.secondOfDay(), field.getType());
    }

    @Test public void test_getName() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField(
            DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
NoAssert.donothing("secondOfDay", field.getName());
    }

    @Test public void test_toString() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField(
            DateTimeFieldType.secondOfDay(), new MockCountingDurationField(DurationFieldType.minutes()));
NoAssert.donothing("DateTimeField[secondOfDay]", field.toString());
    }

    @Test public void test_isSupported() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        assertEquals(true, field.isSupported());
    }

    @Test public void test_isLenient() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(false, field.isLenient());
    }

    @Test public void test_get() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.get(0));
NoAssert.donothing(1, field.get(60));
NoAssert.donothing(2, field.get(123));
    }

    //-----------------------------------------------------------------------
    @Test public void test_getAsText_long_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("29", field.getAsText(60L * 29, Locale.ENGLISH));
        assertEquals("29", field.getAsText(60L * 29, null));
    }

    @Test public void test_getAsText_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("29", field.getAsText(60L * 29));
    }

    @Test public void test_getAsText_RP_int_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
NoAssert.donothing("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }

    @Test public void test_getAsText_RP_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
NoAssert.donothing("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }

    @Test public void test_getAsText_int_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("80", field.getAsText(80, Locale.ENGLISH));
NoAssert.donothing("80", field.getAsText(80, null));
    }

    //-----------------------------------------------------------------------
    @Test public void test_getAsShortText_long_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("29", field.getAsShortText(60L * 29, Locale.ENGLISH));
NoAssert.donothing("29", field.getAsShortText(60L * 29, null));
    }

    @Test public void test_getAsShortText_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("29", field.getAsShortText(60L * 29));
    }

    @Test public void test_getAsShortText_RP_int_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
NoAssert.donothing("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }

    @Test public void test_getAsShortText_RP_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
NoAssert.donothing("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }

    @Test public void test_getAsShortText_int_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing("80", field.getAsShortText(80, Locale.ENGLISH));
NoAssert.donothing("80", field.getAsShortText(80, null));
    }

    //-----------------------------------------------------------------------
    @Test public void test_add_long_int() {
        MockCountingDurationField.add_int = 0;
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(61, field.add(1L, 1));
NoAssert.donothing(1, MockCountingDurationField.add_int);
    }

    @Test public void test_add_long_long() {
        MockCountingDurationField.add_long = 0;
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(61, field.add(1L, 1L));
NoAssert.donothing(1, MockCountingDurationField.add_long);
    }

    @Test public void test_add_RP_int_intarray_int() {
        int[] values = new int[] {10, 20, 30, 40};
        int[] expected = new int[] {10, 20, 30, 40};
        BaseDateTimeField field = new MockStandardBaseDateTimeField();
        int[] result = field.add(new TimeOfDay(), 2, values, 0);
NoAssert.donothing(true, Arrays.equals(expected, result));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 31, 40};
        result = field.add(new TimeOfDay(), 2, values, 1);
NoAssert.donothing(true, Arrays.equals(expected, result));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 21, 0, 40};
        result = field.add(new TimeOfDay(), 2, values, 30);
NoAssert.donothing(true, Arrays.equals(expected, result));
        
        values = new int[] {23, 59, 30, 40};
        try {
            field.add(new TimeOfDay(), 2, values, 30);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 29, 40};
        result = field.add(new TimeOfDay(), 2, values, -1);
NoAssert.donothing(true, Arrays.equals(expected, result));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 19, 59, 40};
        result = field.add(new TimeOfDay(), 2, values, -31);
NoAssert.donothing(true, Arrays.equals(expected, result));
        
        values = new int[] {0, 0, 30, 40};
        try {
            field.add(new TimeOfDay(), 2, values, -31);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void test_addWrapField_long_int() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(29 * 60L, field.addWrapField(60L * 29, 0));
NoAssert.donothing(59 * 60L, field.addWrapField(60L * 29, 30));
NoAssert.donothing(0 * 60L, field.addWrapField(60L * 29, 31));
    }

    @Test public void test_addWrapField_RP_int_intarray_int() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        int[] values = new int[] {10, 20, 30, 40};
        int[] expected = new int[] {10, 20, 30, 40};
        int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
NoAssert.donothing(true, Arrays.equals(result, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 59, 40};
        result = field.addWrapField(new TimeOfDay(), 2, values, 29);
NoAssert.donothing(true, Arrays.equals(result, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 0, 40};
        result = field.addWrapField(new TimeOfDay(), 2, values, 30);
NoAssert.donothing(true, Arrays.equals(result, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 1, 40};
        result = field.addWrapField(new TimeOfDay(), 2, values, 31);
NoAssert.donothing(true, Arrays.equals(result, expected));
    }

    //-----------------------------------------------------------------------
    @Test public void test_getDifference_long_long() {
        MockCountingDurationField.difference_long = 0;
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(30, field.getDifference(0L, 0L));
NoAssert.donothing(1, MockCountingDurationField.difference_long);
    }

    @Test public void test_getDifferenceAsLong_long_long() {
        MockCountingDurationField.difference_long = 0;
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(30, field.getDifferenceAsLong(0L, 0L));
        assertEquals(1, MockCountingDurationField.difference_long);
    }

    //-----------------------------------------------------------------------
    @Test public void test_set_long_int() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.set(120L, 0));
NoAssert.donothing(29 * 60, field.set(120L, 29));
    }

    @Test public void test_set_RP_int_intarray_int() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        int[] values = new int[] {10, 20, 30, 40};
        int[] expected = new int[] {10, 20, 30, 40};
        int[] result = field.set(new TimeOfDay(), 2, values, 30);
NoAssert.donothing(true, Arrays.equals(result, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 29, 40};
        result = field.set(new TimeOfDay(), 2, values, 29);
NoAssert.donothing(true, Arrays.equals(result, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 30, 40};
        try {
            field.set(new TimeOfDay(), 2, values, 60);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(true, Arrays.equals(values, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 30, 40};
        try {
            field.set(new TimeOfDay(), 2, values, -1);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(true, Arrays.equals(values, expected));
    }

    @Test public void test_set_long_String_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.set(0L, "0", null));
        assertEquals(29 * 60, field.set(0L, "29", Locale.ENGLISH));
    }

    @Test public void test_set_long_String() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.set(0L, "0"));
NoAssert.donothing(29 * 60, field.set(0L, "29"));
    }

    @Test public void test_set_RP_int_intarray_String_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        int[] values = new int[] {10, 20, 30, 40};
        int[] expected = new int[] {10, 20, 30, 40};
        int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
NoAssert.donothing(true, Arrays.equals(result, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 29, 40};
        result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
NoAssert.donothing(true, Arrays.equals(result, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 30, 40};
        try {
            field.set(new TimeOfDay(), 2, values, "60", null);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(true, Arrays.equals(values, expected));
        
        values = new int[] {10, 20, 30, 40};
        expected = new int[] {10, 20, 30, 40};
        try {
            field.set(new TimeOfDay(), 2, values, "-1", null);
            fail();
        } catch (IllegalArgumentException ex) {}
NoAssert.donothing(true, Arrays.equals(values, expected));
    }

    @Test public void test_convertText() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.convertText("0", null));
        assertEquals(29, field.convertText("29", null));
        try {
            field.convertText("2A", null);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            field.convertText(null, null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    @Test public void test_isLeap_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(false, field.isLeap(0L));
    }

    @Test public void test_getLeapAmount_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.getLeapAmount(0L));
    }

    @Test public void test_getLeapDurationField() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        assertEquals(null, field.getLeapDurationField());
    }

    //-----------------------------------------------------------------------
    @Test public void test_getMinimumValue() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.getMinimumValue());
    }

    @Test public void test_getMinimumValue_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.getMinimumValue(0L));
    }

    @Test public void test_getMinimumValue_RP() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.getMinimumValue(new TimeOfDay()));
    }

    @Test public void test_getMinimumValue_RP_intarray() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }

    @Test public void test_getMaximumValue() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(59, field.getMaximumValue());
    }

    @Test public void test_getMaximumValue_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(59, field.getMaximumValue(0L));
    }

    @Test public void test_getMaximumValue_RP() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(59, field.getMaximumValue(new TimeOfDay()));
    }

    @Test public void test_getMaximumValue_RP_intarray() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }

    //-----------------------------------------------------------------------
    @Test public void test_getMaximumTextLength_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(2, field.getMaximumTextLength(Locale.ENGLISH));

        field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {
                return 5;
            }
        };
        assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));
        
        field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {
                return 555;
            }
        };
        assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));
        
        field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {
                return 5555;
            }
        };
        assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));
        
        field = new MockPreciseDurationDateTimeField() {
            public int getMaximumValue() {
                return -1;
            }
        };
        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test public void test_getMaximumShortTextLength_Locale() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
        assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }

    //------------------------------------------------------------------------
    @Test public void test_roundFloor_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(-120L, field.roundFloor(-61L));
        assertEquals(-60L, field.roundFloor(-60L));
NoAssert.donothing(-60L, field.roundFloor(-59L));
NoAssert.donothing(-60L, field.roundFloor(-1L));
NoAssert.donothing(0L, field.roundFloor(0L));
NoAssert.donothing(0L, field.roundFloor(1L));
NoAssert.donothing(0L, field.roundFloor(29L));
NoAssert.donothing(0L, field.roundFloor(30L));
NoAssert.donothing(0L, field.roundFloor(31L));
NoAssert.donothing(60L, field.roundFloor(60L));
    }

    @Test public void test_roundCeiling_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(-60L, field.roundCeiling(-61L));
NoAssert.donothing(-60L, field.roundCeiling(-60L));
NoAssert.donothing(0L, field.roundCeiling(-59L));
NoAssert.donothing(0L, field.roundCeiling(-1L));
NoAssert.donothing(0L, field.roundCeiling(0L));
NoAssert.donothing(60L, field.roundCeiling(1L));
        assertEquals(60L, field.roundCeiling(29L));
NoAssert.donothing(60L, field.roundCeiling(30L));
NoAssert.donothing(60L, field.roundCeiling(31L));
NoAssert.donothing(60L, field.roundCeiling(60L));
    }

    @Test public void test_roundHalfFloor_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0L, field.roundHalfFloor(0L));
NoAssert.donothing(0L, field.roundHalfFloor(29L));
NoAssert.donothing(0L, field.roundHalfFloor(30L));
NoAssert.donothing(60L, field.roundHalfFloor(31L));
NoAssert.donothing(60L, field.roundHalfFloor(60L));
    }

    @Test public void test_roundHalfCeiling_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0L, field.roundHalfCeiling(0L));
NoAssert.donothing(0L, field.roundHalfCeiling(29L));
NoAssert.donothing(60L, field.roundHalfCeiling(30L));
NoAssert.donothing(60L, field.roundHalfCeiling(31L));
NoAssert.donothing(60L, field.roundHalfCeiling(60L));
    }

    @Test public void test_roundHalfEven_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0L, field.roundHalfEven(0L));
NoAssert.donothing(0L, field.roundHalfEven(29L));
NoAssert.donothing(0L, field.roundHalfEven(30L));
NoAssert.donothing(60L, field.roundHalfEven(31L));
NoAssert.donothing(60L, field.roundHalfEven(60L));
NoAssert.donothing(60L, field.roundHalfEven(89L));
NoAssert.donothing(120L, field.roundHalfEven(90L));
NoAssert.donothing(120L, field.roundHalfEven(91L));
    }

    @Test public void test_remainder_long() {
        BaseDateTimeField field = new MockPreciseDurationDateTimeField();
NoAssert.donothing(0L, field.remainder(0L));
NoAssert.donothing(29L, field.remainder(29L));
NoAssert.donothing(30L, field.remainder(30L));
NoAssert.donothing(31L, field.remainder(31L));
NoAssert.donothing(0L, field.remainder(60L));
    }

    //-----------------------------------------------------------------------
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds()));
        }
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);
        }
        public int get(long instant) {
            return (int) (instant / 60L);
        }
        public DurationField getRangeDurationField() {
            return new MockCountingDurationField(DurationFieldType.minutes());
        }
        public int getMaximumValue() {
            return 59;
        }
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();
        }
        public DurationField getDurationField() {
            return ISOChronology.getInstanceUTC().seconds();
        }
        public DurationField getRangeDurationField() {
            return ISOChronology.getInstanceUTC().minutes();
        }
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);
        }
        public boolean isPrecise() {
            return true;
        }
        public long getUnitMillis() {
            return 60;
        }
        public long getValueAsLong(long duration, long instant) {
            return 0;
        }
        public long getMillis(int value, long instant) {
            return 0;
        }
        public long getMillis(long value, long instant) {
            return 0;
        }
        public long add(long instant, int value) {
            add_int++;
            return instant + (value * 60L);
        }
        public long add(long instant, long value) {
            add_long++;
            return instant + (value * 60L);
        }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            difference_long++;
            return 30;
        }
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);
        }
        public boolean isPrecise() {
            return true;
        }
        public long getUnitMillis() {
            return 0;  // this is zero
        }
        public long getValueAsLong(long duration, long instant) {
            return 0;
        }
        public long getMillis(int value, long instant) {
            return 0;
        }
        public long getMillis(long value, long instant) {
            return 0;
        }
        public long add(long instant, int value) {
            return 0;
        }
        public long add(long instant, long value) {
            return 0;
        }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return 0;
        }
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);
        }
        public boolean isPrecise() {
            return false;  // this is false
        }
        public long getUnitMillis() {
            return 0;
        }
        public long getValueAsLong(long duration, long instant) {
            return 0;
        }
        public long getMillis(int value, long instant) {
            return 0;
        }
        public long getMillis(long value, long instant) {
            return 0;
        }
        public long add(long instant, int value) {
            return 0;
        }
        public long add(long instant, long value) {
            return 0;
        }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return 0;
        }
    }

}
