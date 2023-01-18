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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Properties  { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception  {
        TestYearMonthDay_Properties TB= new TestYearMonthDay_Properties();
        TB.setUp(); TB.testPropertyGetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldDay(); TB.tearDown();
        TB.setUp(); TB.testPropertySetDay(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaximumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMinimumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyEquals(); TB.tearDown();
        TB.setUp(); TB.testPropertyHashCode(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeLenient(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeStrict(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonthDay_Properties.class);
    }

    public TestYearMonthDay_Properties(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        systemDefaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(systemDefaultLocale);
        systemDefaultLocale = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetYear() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        assertSame(test.getChronology().year(), test.year().getField());
        assertEquals("year", test.year().getName());
        assertEquals("Property[year]", test.year().toString());
NoAssert.donothing(test, test.year().getReadablePartial());
        assertSame(test, test.year().getYearMonthDay());
        assertEquals(1972, test.year().get());
        assertEquals("1972", test.year().getAsString());
        assertEquals("1972", test.year().getAsText());
        assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        assertEquals("1972", test.year().getAsShortText());
        assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().years(), test.year().getDurationField());
        assertEquals(null, test.year().getRangeDurationField());
        assertEquals(9, test.year().getMaximumTextLength(null));
        assertEquals(9, test.year().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesYear() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
NoAssert.donothing(-292275054, test.year().getMinimumValue());
        assertEquals(-292275054, test.year().getMinimumValueOverall());
        assertEquals(292278993, test.year().getMaximumValue());
        assertEquals(292278993, test.year().getMaximumValueOverall());
    }

    @Test public void testPropertyAddYear() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.year().addToCopy(9);
        check(test, 1972, 6, 9);
        check(copy, 1981, 6, 9);
        
        copy = test.year().addToCopy(0);
        check(copy, 1972, 6, 9);
        
        copy = test.year().addToCopy(292277023 - 1972);
        check(copy, 292277023, 6, 9);
        
        try {
            test.year().addToCopy(292278993 - 1972 + 1);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 1972, 6, 9);
        
        copy = test.year().addToCopy(-1972);
        check(copy, 0, 6, 9);
        
        copy = test.year().addToCopy(-1973);
        check(copy, -1, 6, 9);
        
        try {
            test.year().addToCopy(-292275054 - 1972 - 1);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 1972, 6, 9);
    }

    @Test public void testPropertyAddWrapFieldYear() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.year().addWrapFieldToCopy(9);
        check(test, 1972, 6, 9);
        check(copy, 1981, 6, 9);
        
        copy = test.year().addWrapFieldToCopy(0);
        check(copy, 1972, 6, 9);
        
        copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        check(copy, -292275054, 6, 9);
        
        copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        check(copy, 292278993, 6, 9);
    }

    @Test public void testPropertySetYear() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.year().setCopy(12);
        check(test, 1972, 6, 9);
        check(copy, 12, 6, 9);
    }

    @Test public void testPropertySetTextYear() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.year().setCopy("12");
        check(test, 1972, 6, 9);
        check(copy, 12, 6, 9);
    }

    @Test public void testPropertyCompareToYear() {
        YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        assertEquals(true, test1.year().compareTo(test2) < 0);
NoAssert.donothing(true, test2.year().compareTo(test1) > 0);
NoAssert.donothing(true, test1.year().compareTo(test1) == 0);
        try {
            test1.year().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
        assertEquals(true, test1.year().compareTo(dt2) < 0);
        assertEquals(true, test2.year().compareTo(dt1) > 0);
        assertEquals(true, test1.year().compareTo(dt1) == 0);
        try {
            test1.year().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        assertEquals("monthOfYear", test.monthOfYear().getName());
        assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        assertSame(test, test.monthOfYear().getReadablePartial());
        assertSame(test, test.monthOfYear().getYearMonthDay());
        assertEquals(6, test.monthOfYear().get());
NoAssert.donothing("6", test.monthOfYear().getAsString());
        assertEquals("June", test.monthOfYear().getAsText());
NoAssert.donothing("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        assertEquals("Jun", test.monthOfYear().getAsShortText());
        assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().months(), test.monthOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        test = new YearMonthDay(1972, 7, 9);
NoAssert.donothing("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }

    @Test public void testPropertyGetMaxMinValuesMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        assertEquals(1, test.monthOfYear().getMinimumValue());
        assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        assertEquals(12, test.monthOfYear().getMaximumValue());
        assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }

    @Test public void testPropertyAddMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.monthOfYear().addToCopy(6);
        check(test, 1972, 6, 9);
        check(copy, 1972, 12, 9);
        
        copy = test.monthOfYear().addToCopy(7);
        check(copy, 1973, 1, 9);
        
        copy = test.monthOfYear().addToCopy(-5);
        check(copy, 1972, 1, 9);
        
        copy = test.monthOfYear().addToCopy(-6);
        check(copy, 1971, 12, 9);
        
        test = new YearMonthDay(1972, 1, 31);
        copy = test.monthOfYear().addToCopy(1);
        check(copy, 1972, 2, 29);
        
        copy = test.monthOfYear().addToCopy(2);
        check(copy, 1972, 3, 31);
        
        copy = test.monthOfYear().addToCopy(3);
        check(copy, 1972, 4, 30);
        
        test = new YearMonthDay(1971, 1, 31);
        copy = test.monthOfYear().addToCopy(1);
        check(copy, 1971, 2, 28);
    }

    @Test public void testPropertyAddWrapFieldMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.monthOfYear().addWrapFieldToCopy(4);
        check(test, 1972, 6, 9);
        check(copy, 1972, 10, 9);
        
        copy = test.monthOfYear().addWrapFieldToCopy(8);
        check(copy, 1972, 2, 9);
        
        copy = test.monthOfYear().addWrapFieldToCopy(-8);
        check(copy, 1972, 10, 9);
        
        test = new YearMonthDay(1972, 1, 31);
        copy = test.monthOfYear().addWrapFieldToCopy(1);
        check(copy, 1972, 2, 29);
        
        copy = test.monthOfYear().addWrapFieldToCopy(2);
        check(copy, 1972, 3, 31);
        
        copy = test.monthOfYear().addWrapFieldToCopy(3);
        check(copy, 1972, 4, 30);
        
        test = new YearMonthDay(1971, 1, 31);
        copy = test.monthOfYear().addWrapFieldToCopy(1);
        check(copy, 1971, 2, 28);
    }

    @Test public void testPropertySetMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.monthOfYear().setCopy(12);
        check(test, 1972, 6, 9);
        check(copy, 1972, 12, 9);
        
        test = new YearMonthDay(1972, 1, 31);
        copy = test.monthOfYear().setCopy(2);
        check(copy, 1972, 2, 29);
        
        try {
            test.monthOfYear().setCopy(13);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.monthOfYear().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.monthOfYear().setCopy("12");
        check(test, 1972, 6, 9);
        check(copy, 1972, 12, 9);
        
        copy = test.monthOfYear().setCopy("December");
        check(test, 1972, 6, 9);
        check(copy, 1972, 12, 9);
        
        copy = test.monthOfYear().setCopy("Dec");
        check(test, 1972, 6, 9);
        check(copy, 1972, 12, 9);
    }

    @Test public void testPropertyCompareToMonth() {
        YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
        assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.monthOfYear().compareTo(dt1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDay() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        assertEquals("dayOfMonth", test.dayOfMonth().getName());
        assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
NoAssert.donothing(test, test.dayOfMonth().getReadablePartial());
NoAssert.donothing(test, test.dayOfMonth().getYearMonthDay());
        assertEquals(9, test.dayOfMonth().get());
        assertEquals("9", test.dayOfMonth().getAsString());
        assertEquals("9", test.dayOfMonth().getAsText());
        assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        assertEquals("9", test.dayOfMonth().getAsShortText());
NoAssert.donothing("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesDay() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        assertEquals(1, test.dayOfMonth().getMinimumValue());
NoAssert.donothing(1, test.dayOfMonth().getMinimumValueOverall());
        assertEquals(30, test.dayOfMonth().getMaximumValue());
        assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        test = new YearMonthDay(1972, 7, 9);
NoAssert.donothing(31, test.dayOfMonth().getMaximumValue());
        test = new YearMonthDay(1972, 2, 9);
        assertEquals(29, test.dayOfMonth().getMaximumValue());
        test = new YearMonthDay(1971, 2, 9);
        assertEquals(28, test.dayOfMonth().getMaximumValue());
    }

    @Test public void testPropertyAddDay() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.dayOfMonth().addToCopy(9);
        check(test, 1972, 6, 9);
        check(copy, 1972, 6, 18);
        
        copy = test.dayOfMonth().addToCopy(21);
        check(copy, 1972, 6, 30);
        
        copy = test.dayOfMonth().addToCopy(22);
        check(copy, 1972, 7, 1);
        
        copy = test.dayOfMonth().addToCopy(22 + 30);
        check(copy, 1972, 7, 31);
        
        copy = test.dayOfMonth().addToCopy(22 + 31);
        check(copy, 1972, 8, 1);

        copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        check(copy, 1972, 12, 31);
        
        copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        check(copy, 1973, 1, 1);
        
        copy = test.dayOfMonth().addToCopy(-8);
        check(copy, 1972, 6, 1);
        
        copy = test.dayOfMonth().addToCopy(-9);
        check(copy, 1972, 5, 31);
        
        copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        check(copy, 1972, 1, 1);
        
        copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        check(copy, 1971, 12, 31);
    }

    @Test public void testPropertyAddWrapFieldDay() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.dayOfMonth().addWrapFieldToCopy(21);
        check(test, 1972, 6, 9);
        check(copy, 1972, 6, 30);
        
        copy = test.dayOfMonth().addWrapFieldToCopy(22);
        check(copy, 1972, 6, 1);
        
        copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        check(copy, 1972, 6, 27);
        
        test = new YearMonthDay(1972, 7, 9);
        copy = test.dayOfMonth().addWrapFieldToCopy(21);
        check(copy, 1972, 7, 30);
    
        copy = test.dayOfMonth().addWrapFieldToCopy(22);
        check(copy, 1972, 7, 31);
    
        copy = test.dayOfMonth().addWrapFieldToCopy(23);
        check(copy, 1972, 7, 1);
    
        copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        check(copy, 1972, 7, 28);
    }

    @Test public void testPropertySetDay() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.dayOfMonth().setCopy(12);
        check(test, 1972, 6, 9);
        check(copy, 1972, 6, 12);
        
        try {
            test.dayOfMonth().setCopy(31);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.dayOfMonth().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetTextDay() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.dayOfMonth().setCopy("12");
        check(test, 1972, 6, 9);
        check(copy, 1972, 6, 12);
    }

    @Test public void testPropertyWithMaximumValueDayOfMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.dayOfMonth().withMaximumValue();
        check(test, 1972, 6, 9);
        check(copy, 1972, 6, 30);
    }

    @Test public void testPropertyWithMinimumValueDayOfMonth() {
        YearMonthDay test = new YearMonthDay(1972, 6, 9);
        YearMonthDay copy = test.dayOfMonth().withMinimumValue();
        check(test, 1972, 6, 9);
        check(copy, 1972, 6, 1);
    }

    @Test public void testPropertyCompareToDay() {
        YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(test1) == 0);
        try {
            test1.dayOfMonth().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
        assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        try {
            test1.dayOfMonth().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertyEquals() {
        YearMonthDay test1 = new YearMonthDay(2005, 11, 8);
        YearMonthDay test2 = new YearMonthDay(2005, 11, 9);
        YearMonthDay test3 = new YearMonthDay(2005, 11, 8, CopticChronology.getInstanceUTC());
NoAssert.donothing(false, test1.dayOfMonth().equals(test1.year()));
        assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(false, test1.dayOfMonth().equals(test2.year()));
        assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));
        
NoAssert.donothing(false, test1.monthOfYear().equals(test1.year()));
        assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        assertEquals(false, test1.monthOfYear().equals(test2.year()));
        assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));
        
        assertEquals(false, test1.dayOfMonth().equals(null));
        assertEquals(false, test1.dayOfMonth().equals("any"));
        
        // chrono
        assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }

    @Test public void testPropertyHashCode() {
        YearMonthDay test1 = new YearMonthDay(2005, 11, 8);
        YearMonthDay test2 = new YearMonthDay(2005, 11, 9);
        assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
NoAssert.donothing(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }

    @Test public void testPropertyEqualsHashCodeLenient() {
        YearMonthDay test1 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        YearMonthDay test2 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }

    @Test public void testPropertyEqualsHashCodeStrict() {
        YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {
        assertEquals(year, test.getYear());
NoAssert.donothing(month, test.getMonthOfYear());
NoAssert.donothing(day, test.getDayOfMonth());
    }
}
