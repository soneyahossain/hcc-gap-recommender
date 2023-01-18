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

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.SkipDateTimeField;

/**
 * Tests IllegalFieldValueException by triggering it from other methods.
 *
 * @author Brian S O'Neill
 */
public class TestIllegalFieldValueException  { //extends TestCase {
    public static void main(String[] args) throws Exception  {
        TestIllegalFieldValueException TB= new TestIllegalFieldValueException();
        TB.testVerifyValueBounds();
        TB.testSkipDateTimeField();
        TB.testSetText();
        TB.testZoneTransition();
        TB.testJulianYearZero();
        TB.testGJCutover();
        TB.testReadablePartialValidate();
        TB.testOtherConstructors();


    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestIllegalFieldValueException.class);
    }

    public TestIllegalFieldValueException(String name) {
        super(name);
    }

     */

    @Test public void testVerifyValueBounds() {
        try {
            FieldUtils.verifyValueBounds(ISOChronology.getInstance().monthOfYear(), -5, 1, 31);
            fail();
        } catch (IllegalFieldValueException e) {
            assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("monthOfYear", e.getFieldName());
NoAssert.donothing(new Integer(-5), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
            assertEquals("-5", e.getIllegalValueAsString());
            assertEquals(new Integer(1), e.getLowerBound());
NoAssert.donothing(new Integer(31), e.getUpperBound());
        }

        try {
            FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), 27, 0, 23);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("hourOfDay", e.getFieldName());
NoAssert.donothing(new Integer(27), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("27", e.getIllegalValueAsString());
NoAssert.donothing(new Integer(0), e.getLowerBound());
NoAssert.donothing(new Integer(23), e.getUpperBound());
        }

        try {
            FieldUtils.verifyValueBounds("foo", 1, 2, 3);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(null, e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("foo", e.getFieldName());
            assertEquals(new Integer(1), e.getIllegalNumberValue());
            assertEquals(null, e.getIllegalStringValue());
NoAssert.donothing("1", e.getIllegalValueAsString());
NoAssert.donothing(new Integer(2), e.getLowerBound());
            assertEquals(new Integer(3), e.getUpperBound());
        }
    }

    @Test public void testSkipDateTimeField() {
        DateTimeField field = new SkipDateTimeField
            (ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().year(), 1970);
        try {
            field.set(0, 1970);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.year(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("year", e.getFieldName());
NoAssert.donothing(new Integer(1970), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("1970", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }
    }

    @Test public void testSetText() {
        try {
            ISOChronology.getInstanceUTC().year().set(0, null, java.util.Locale.US);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.year(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
            assertEquals("year", e.getFieldName());
            assertEquals(null, e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("null", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }

        try {
            ISOChronology.getInstanceUTC().year().set(0, "nineteen seventy", java.util.Locale.US);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.year(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
            assertEquals("year", e.getFieldName());
NoAssert.donothing(null, e.getIllegalNumberValue());
NoAssert.donothing("nineteen seventy", e.getIllegalStringValue());
NoAssert.donothing("nineteen seventy", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }

        try {
            ISOChronology.getInstanceUTC().era().set(0, "long ago", java.util.Locale.US);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.era(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("era", e.getFieldName());
            assertEquals(null, e.getIllegalNumberValue());
NoAssert.donothing("long ago", e.getIllegalStringValue());
NoAssert.donothing("long ago", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }

        try {
            ISOChronology.getInstanceUTC().monthOfYear().set(0, "spring", java.util.Locale.US);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("monthOfYear", e.getFieldName());
NoAssert.donothing(null, e.getIllegalNumberValue());
NoAssert.donothing("spring", e.getIllegalStringValue());
NoAssert.donothing("spring", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }

        try {
            ISOChronology.getInstanceUTC().dayOfWeek().set(0, "yesterday", java.util.Locale.US);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.dayOfWeek(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("dayOfWeek", e.getFieldName());
NoAssert.donothing(null, e.getIllegalNumberValue());
NoAssert.donothing("yesterday", e.getIllegalStringValue());
            assertEquals("yesterday", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
            assertEquals(null, e.getUpperBound());
        }

        try {
            ISOChronology.getInstanceUTC().halfdayOfDay().set(0, "morning", java.util.Locale.US);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.halfdayOfDay(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("halfdayOfDay", e.getFieldName());
NoAssert.donothing(null, e.getIllegalNumberValue());
NoAssert.donothing("morning", e.getIllegalStringValue());
NoAssert.donothing("morning", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
            assertEquals(null, e.getUpperBound());
        }
    }

    @Test public void testZoneTransition() {
        DateTime dt = new DateTime
            (2005, 4, 3, 1, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles"));
        try {
            dt.hourOfDay().setCopy(2);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("hourOfDay", e.getFieldName());
NoAssert.donothing(new Integer(2), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("2", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }
    }

    @Test public void testJulianYearZero() {
        DateTime dt = new DateTime(JulianChronology.getInstanceUTC());
        try {
            dt.year().setCopy(0);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.year(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("year", e.getFieldName());
            assertEquals(new Integer(0), e.getIllegalNumberValue());
            assertEquals(null, e.getIllegalStringValue());
NoAssert.donothing("0", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }
    }

    @Test public void testGJCutover() {
        DateTime dt = new DateTime("1582-10-04", GJChronology.getInstanceUTC());
        try {
            dt.dayOfMonth().setCopy(5);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("dayOfMonth", e.getFieldName());
            assertEquals(new Integer(5), e.getIllegalNumberValue());
            assertEquals(null, e.getIllegalStringValue());
NoAssert.donothing("5", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
            assertEquals(null, e.getUpperBound());
        }

        dt = new DateTime("1582-10-15", GJChronology.getInstanceUTC());
        try {
            dt.dayOfMonth().setCopy(14);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("dayOfMonth", e.getFieldName());
NoAssert.donothing(new Integer(14), e.getIllegalNumberValue());
            assertEquals(null, e.getIllegalStringValue());
NoAssert.donothing("14", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
        }
    }

    @SuppressWarnings("deprecation")
    @Test public void testReadablePartialValidate() {
        try {
            new YearMonthDay(1970, -5, 1);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("monthOfYear", e.getFieldName());
NoAssert.donothing(new Integer(-5), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("-5", e.getIllegalValueAsString());
NoAssert.donothing(new Integer(1), e.getLowerBound());
            assertEquals(null, e.getUpperBound());
        }

        try {
            new YearMonthDay(1970, 500, 1);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("monthOfYear", e.getFieldName());
NoAssert.donothing(new Integer(500), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("500", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(new Integer(12), e.getUpperBound());
        }

        try {
            new YearMonthDay(1970, 2, 30);
            fail();
        } catch (IllegalFieldValueException e) {
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
NoAssert.donothing("dayOfMonth", e.getFieldName());
            assertEquals(new Integer(30), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("30", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(new Integer(28), e.getUpperBound());
        }
    }

    // Test extra constructors not currently called by anything
    @Test public void testOtherConstructors() {
        IllegalFieldValueException e = new IllegalFieldValueException
            (DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3));
NoAssert.donothing(null, e.getDateTimeFieldType());
NoAssert.donothing(DurationFieldType.days(), e.getDurationFieldType());
NoAssert.donothing("days", e.getFieldName());
NoAssert.donothing(new Integer(1), e.getIllegalNumberValue());
NoAssert.donothing(null, e.getIllegalStringValue());
NoAssert.donothing("1", e.getIllegalValueAsString());
NoAssert.donothing(new Integer(2), e.getLowerBound());
NoAssert.donothing(new Integer(3), e.getUpperBound());

        e = new IllegalFieldValueException(DurationFieldType.months(), "five");
NoAssert.donothing(null, e.getDateTimeFieldType());
NoAssert.donothing(DurationFieldType.months(), e.getDurationFieldType());
NoAssert.donothing("months", e.getFieldName());
NoAssert.donothing(null, e.getIllegalNumberValue());
NoAssert.donothing("five", e.getIllegalStringValue());
NoAssert.donothing("five", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());

        e = new IllegalFieldValueException("months", "five");
NoAssert.donothing(null, e.getDateTimeFieldType());
NoAssert.donothing(null, e.getDurationFieldType());
        assertEquals("months", e.getFieldName());
NoAssert.donothing(null, e.getIllegalNumberValue());
        assertEquals("five", e.getIllegalStringValue());
NoAssert.donothing("five", e.getIllegalValueAsString());
NoAssert.donothing(null, e.getLowerBound());
NoAssert.donothing(null, e.getUpperBound());
    }
}
