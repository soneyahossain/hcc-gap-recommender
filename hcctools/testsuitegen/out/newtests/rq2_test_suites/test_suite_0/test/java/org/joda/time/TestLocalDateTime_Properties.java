/*
 *  Copyright 2001-2010 Stephen Colebourne
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

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties  { //extends TestCase {

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 4L * DateTimeConstants.MILLIS_PER_HOUR
        + 5L * DateTimeConstants.MILLIS_PER_MINUTE
        + 6L * DateTimeConstants.MILLIS_PER_SECOND
        + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception  {
        TestLocalDateTime_Properties TB= new TestLocalDateTime_Properties();
        TB.setUp(); TB.testPropertyGetYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddToCopyYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldToCopyYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetCopyYear(); TB.tearDown();
        TB.setUp(); TB.testPropertySetCopyTextYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToYear(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddToCopyMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldToCopyMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetCopyMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertySetCopyTextMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddToCopyDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldToCopyDay(); TB.tearDown();
        TB.setUp(); TB.testPropertySetCopyDay(); TB.tearDown();
        TB.setUp(); TB.testPropertySetCopyTextDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaximumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMinimumValueDayOfMonth(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToDay(); TB.tearDown();
        TB.setUp(); TB.testPropertyEquals(); TB.tearDown();
        TB.setUp(); TB.testPropertyHashCode(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyRoundHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaxMinValueHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddToCopyHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldToCopyHour(); TB.tearDown();
        TB.setUp(); TB.testPropertySetHour(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaximumValueHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMinimumValueHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToHour(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaxMinValueMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddToCopyMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldToCopyMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToMinute(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaxMinValueSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddToCopySecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldToCopySecond(); TB.tearDown();
        TB.setUp(); TB.testPropertySetSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToSecond(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyGetMaxMinValuesMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyWithMaxMinValueMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddToCopyMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyAddWrapFieldToCopyMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertySetMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertySetTextMilli(); TB.tearDown();
        TB.setUp(); TB.testPropertyCompareToMilli(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Properties.class);
    }

    public TestLocalDateTime_Properties(String name) {
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
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(test.getChronology().year(), test.year().getField());
NoAssert.donothing("year", test.year().getName());
NoAssert.donothing("Property[year]", test.year().toString());
NoAssert.donothing(test, test.year().getLocalDateTime());
NoAssert.donothing(1972, test.year().get());
NoAssert.donothing("1972", test.year().getAsString());
NoAssert.donothing("1972", test.year().getAsText());
NoAssert.donothing("1972", test.year().getAsText(Locale.FRENCH));
NoAssert.donothing("1972", test.year().getAsShortText());
NoAssert.donothing("1972", test.year().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.year().getDurationField());
NoAssert.donothing(null, test.year().getRangeDurationField());
NoAssert.donothing(9, test.year().getMaximumTextLength(null));
NoAssert.donothing(9, test.year().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesYear() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(-292275054, test.year().getMinimumValue());
NoAssert.donothing(-292275054, test.year().getMinimumValueOverall());
NoAssert.donothing(292278993, test.year().getMaximumValue());
NoAssert.donothing(292278993, test.year().getMaximumValueOverall());
    }

    @Test public void testPropertyAddToCopyYear() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.year().addToCopy(9);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1981, 6, 9, 10, 20, 30, 40);
        
        copy = test.year().addToCopy(0);
        check(copy, 1972, 6, 9, 10, 20, 30, 40);
        
        copy = test.year().addToCopy(292278993 - 1972);
        check(copy, 292278993, 6, 9, 10, 20, 30, 40);
        
        try {
            test.year().addToCopy(292278993 - 1972 + 1);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        
        copy = test.year().addToCopy(-1972);
        check(copy, 0, 6, 9, 10, 20, 30, 40);
        
        copy = test.year().addToCopy(-1973);
        check(copy, -1, 6, 9, 10, 20, 30, 40);
        
        try {
            test.year().addToCopy(-292275054 - 1972 - 1);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 1972, 6, 9, 10, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldToCopyYear() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.year().addWrapFieldToCopy(9);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1981, 6, 9, 10, 20, 30, 40);
        
        copy = test.year().addWrapFieldToCopy(0);
        check(copy, 1972, 6, 9, 10, 20, 30, 40);
        
        copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        check(copy, -292275054, 6, 9, 10, 20, 30, 40);
        
        copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        check(copy, 292278993, 6, 9, 10, 20, 30, 40);
    }

    @Test public void testPropertySetCopyYear() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.year().setCopy(12);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 12, 6, 9, 10, 20, 30, 40);
    }

    @Test public void testPropertySetCopyTextYear() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.year().setCopy("12");
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 12, 6, 9, 10, 20, 30, 40);
    }

    @Test public void testPropertyCompareToYear() {
        LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.year().compareTo(test2) < 0);
NoAssert.donothing(true, test2.year().compareTo(test1) > 0);
NoAssert.donothing(true, test1.year().compareTo(test1) == 0);
        try {
            test1.year().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.year().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.year().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.year().compareTo(dt1) == 0);
        try {
            test1.year().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(test.getChronology().monthOfYear(), test.monthOfYear().getField());
NoAssert.donothing("monthOfYear", test.monthOfYear().getName());
NoAssert.donothing("Property[monthOfYear]", test.monthOfYear().toString());
NoAssert.donothing(test, test.monthOfYear().getLocalDateTime());
NoAssert.donothing(6, test.monthOfYear().get());
NoAssert.donothing("6", test.monthOfYear().getAsString());
NoAssert.donothing("June", test.monthOfYear().getAsText());
NoAssert.donothing("juin", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("Jun", test.monthOfYear().getAsShortText());
NoAssert.donothing("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().months(), test.monthOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
NoAssert.donothing(9, test.monthOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.monthOfYear().getMaximumShortTextLength(null));
        test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
NoAssert.donothing("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }

    @Test public void testPropertyGetMaxMinValuesMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
NoAssert.donothing(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
    }

    @Test public void testPropertyAddToCopyMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.monthOfYear().addToCopy(6);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addToCopy(7);
        check(copy, 1973, 1, 9, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addToCopy(-5);
        check(copy, 1972, 1, 9, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addToCopy(-6);
        check(copy, 1971, 12, 9, 10, 20, 30, 40);
        
        test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        copy = test.monthOfYear().addToCopy(1);
        check(copy, 1972, 2, 29, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addToCopy(2);
        check(copy, 1972, 3, 31, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addToCopy(3);
        check(copy, 1972, 4, 30, 10, 20, 30, 40);
        
        test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40);
        copy = test.monthOfYear().addToCopy(1);
        check(copy, 1971, 2, 28, 10, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldToCopyMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.monthOfYear().addWrapFieldToCopy(4);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 10, 9, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addWrapFieldToCopy(8);
        check(copy, 1972, 2, 9, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addWrapFieldToCopy(-8);
        check(copy, 1972, 10, 9, 10, 20, 30, 40);
        
        test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        copy = test.monthOfYear().addWrapFieldToCopy(1);
        check(copy, 1972, 2, 29, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addWrapFieldToCopy(2);
        check(copy, 1972, 3, 31, 10, 20, 30, 40);
        
        copy = test.monthOfYear().addWrapFieldToCopy(3);
        check(copy, 1972, 4, 30, 10, 20, 30, 40);
        
        test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40);
        copy = test.monthOfYear().addWrapFieldToCopy(1);
        check(copy, 1971, 2, 28, 10, 20, 30, 40);
    }

    @Test public void testPropertySetCopyMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.monthOfYear().setCopy(12);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        copy = test.monthOfYear().setCopy(2);
        check(copy, 1972, 2, 29, 10, 20, 30, 40);
        
        try {
            test.monthOfYear().setCopy(13);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.monthOfYear().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetCopyTextMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.monthOfYear().setCopy("12");
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        copy = test.monthOfYear().setCopy("December");
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        copy = test.monthOfYear().setCopy("Dec");
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 12, 9, 10, 20, 30, 40);
    }

    @Test public void testPropertyCompareToMonth() {
        LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.monthOfYear().compareTo(test2) < 0);
NoAssert.donothing(true, test2.monthOfYear().compareTo(test1) > 0);
NoAssert.donothing(true, test1.monthOfYear().compareTo(test1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.monthOfYear().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.monthOfYear().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.monthOfYear().compareTo(dt1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetDay() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
NoAssert.donothing("dayOfMonth", test.dayOfMonth().getName());
NoAssert.donothing("Property[dayOfMonth]", test.dayOfMonth().toString());
NoAssert.donothing(test, test.dayOfMonth().getLocalDateTime());
NoAssert.donothing(9, test.dayOfMonth().get());
NoAssert.donothing("9", test.dayOfMonth().getAsString());
NoAssert.donothing("9", test.dayOfMonth().getAsText());
NoAssert.donothing("9", test.dayOfMonth().getAsText(Locale.FRENCH));
NoAssert.donothing("9", test.dayOfMonth().getAsShortText());
NoAssert.donothing("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().days(), test.dayOfMonth().getDurationField());
NoAssert.donothing(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
NoAssert.donothing(2, test.dayOfMonth().getMaximumTextLength(null));
NoAssert.donothing(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesDay() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(1, test.dayOfMonth().getMinimumValue());
NoAssert.donothing(1, test.dayOfMonth().getMinimumValueOverall());
NoAssert.donothing(30, test.dayOfMonth().getMaximumValue());
NoAssert.donothing(31, test.dayOfMonth().getMaximumValueOverall());
        test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
NoAssert.donothing(31, test.dayOfMonth().getMaximumValue());
        test = new LocalDateTime(1972, 2, 9, 10, 20, 30, 40);
NoAssert.donothing(29, test.dayOfMonth().getMaximumValue());
        test = new LocalDateTime(1971, 2, 9, 10, 20, 30, 40);
NoAssert.donothing(28, test.dayOfMonth().getMaximumValue());
    }

    @Test public void testPropertyAddToCopyDay() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.dayOfMonth().addToCopy(9);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 6, 18, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(21);
        check(copy, 1972, 6, 30, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(22);
        check(copy, 1972, 7, 1, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(22 + 30);
        check(copy, 1972, 7, 31, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(22 + 31);
        check(copy, 1972, 8, 1, 10, 20, 30, 40);

        copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        check(copy, 1972, 12, 31, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        check(copy, 1973, 1, 1, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(-8);
        check(copy, 1972, 6, 1, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(-9);
        check(copy, 1972, 5, 31, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        check(copy, 1972, 1, 1, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        check(copy, 1971, 12, 31, 10, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldToCopyDay() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.dayOfMonth().addWrapFieldToCopy(21);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 6, 30, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addWrapFieldToCopy(22);
        check(copy, 1972, 6, 1, 10, 20, 30, 40);
        
        copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        check(copy, 1972, 6, 27, 10, 20, 30, 40);
        
        test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
        copy = test.dayOfMonth().addWrapFieldToCopy(21);
        check(copy, 1972, 7, 30, 10, 20, 30, 40);
    
        copy = test.dayOfMonth().addWrapFieldToCopy(22);
        check(copy, 1972, 7, 31, 10, 20, 30, 40);
    
        copy = test.dayOfMonth().addWrapFieldToCopy(23);
        check(copy, 1972, 7, 1, 10, 20, 30, 40);
    
        copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        check(copy, 1972, 7, 28, 10, 20, 30, 40);
    }

    @Test public void testPropertySetCopyDay() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.dayOfMonth().setCopy(12);
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 6, 12, 10, 20, 30, 40);
        
        try {
            test.dayOfMonth().setCopy(31);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.dayOfMonth().setCopy(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertySetCopyTextDay() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.dayOfMonth().setCopy("12");
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 6, 12, 10, 20, 30, 40);
    }

    @Test public void testPropertyWithMaximumValueDayOfMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.dayOfMonth().withMaximumValue();
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 6, 30, 10, 20, 30, 40);
    }

    @Test public void testPropertyWithMinimumValueDayOfMonth() {
        LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.dayOfMonth().withMinimumValue();
        check(test, 1972, 6, 9, 10, 20, 30, 40);
        check(copy, 1972, 6, 1, 10, 20, 30, 40);
    }

    @Test public void testPropertyCompareToDay() {
        LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(test2) < 0);
NoAssert.donothing(true, test2.dayOfMonth().compareTo(test1) > 0);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(test1) == 0);
        try {
            test1.dayOfMonth().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.dayOfMonth().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.dayOfMonth().compareTo(dt1) == 0);
        try {
            test1.dayOfMonth().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testPropertyEquals() {
        LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40);
        LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40);
        LocalDateTime test3 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40, COPTIC_UTC);
NoAssert.donothing(false, test1.dayOfMonth().equals(test1.year()));
NoAssert.donothing(false, test1.dayOfMonth().equals(test1.monthOfYear()));
NoAssert.donothing(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
NoAssert.donothing(false, test1.dayOfMonth().equals(test2.year()));
NoAssert.donothing(false, test1.dayOfMonth().equals(test2.monthOfYear()));
NoAssert.donothing(false, test1.dayOfMonth().equals(test2.dayOfMonth()));
        
NoAssert.donothing(false, test1.monthOfYear().equals(test1.year()));
NoAssert.donothing(true, test1.monthOfYear().equals(test1.monthOfYear()));
NoAssert.donothing(false, test1.monthOfYear().equals(test1.dayOfMonth()));
NoAssert.donothing(false, test1.monthOfYear().equals(test2.year()));
NoAssert.donothing(true, test1.monthOfYear().equals(test2.monthOfYear()));
NoAssert.donothing(false, test1.monthOfYear().equals(test2.dayOfMonth()));
        
NoAssert.donothing(false, test1.dayOfMonth().equals(null));
NoAssert.donothing(false, test1.dayOfMonth().equals("any"));
        
        // chrono
NoAssert.donothing(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }

    @Test public void testPropertyHashCode() {
        LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40);
        LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40);
NoAssert.donothing(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
NoAssert.donothing(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(test.getChronology().hourOfDay(), test.hourOfDay().getField());
NoAssert.donothing("hourOfDay", test.hourOfDay().getName());
NoAssert.donothing("Property[hourOfDay]", test.hourOfDay().toString());
NoAssert.donothing(test, test.hourOfDay().getLocalDateTime());
NoAssert.donothing(10, test.hourOfDay().get());
NoAssert.donothing("10", test.hourOfDay().getAsString());
NoAssert.donothing("10", test.hourOfDay().getAsText());
NoAssert.donothing("10", test.hourOfDay().getAsText(Locale.FRENCH));
NoAssert.donothing("10", test.hourOfDay().getAsShortText());
NoAssert.donothing("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().hours(), test.hourOfDay().getDurationField());
NoAssert.donothing(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
NoAssert.donothing(2, test.hourOfDay().getMaximumTextLength(null));
NoAssert.donothing(2, test.hourOfDay().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyRoundHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20);
        check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0);
        check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0);
        
        test = new LocalDateTime(2005, 6, 9, 10, 40);
        check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0);
        
        test = new LocalDateTime(2005, 6, 9, 10, 30);
        check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0);
        
        test = new LocalDateTime(2005, 6, 9, 11, 30);
        check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0);
        check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0);
        check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0);
    }

    @Test public void testPropertyGetMaxMinValuesHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(0, test.hourOfDay().getMinimumValue());
NoAssert.donothing(0, test.hourOfDay().getMinimumValueOverall());
NoAssert.donothing(23, test.hourOfDay().getMaximumValue());
NoAssert.donothing(23, test.hourOfDay().getMaximumValueOverall());
    }

    @Test public void testPropertyWithMaxMinValueHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40);
        check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40);
        check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40);
    }

    @Test public void testPropertyAddToCopyHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.hourOfDay().addToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 19, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(0);
        check(copy, 2005, 6, 9, 10, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(13);
        check(copy, 2005, 6, 9, 23, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(14);
        check(copy, 2005, 6, 10, 0, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(-10);
        check(copy, 2005, 6, 9, 0, 20, 30, 40);
        
        copy = test.hourOfDay().addToCopy(-11);
        check(copy, 2005, 6, 8, 23, 20, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldToCopyHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.hourOfDay().addWrapFieldToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 19, 20, 30, 40);
        
        copy = test.hourOfDay().addWrapFieldToCopy(0);
        check(copy, 2005, 6, 9, 10, 20, 30, 40);
        
        copy = test.hourOfDay().addWrapFieldToCopy(18);
        check(copy, 2005, 6, 9, 4, 20, 30, 40);
        
        copy = test.hourOfDay().addWrapFieldToCopy(-15);
        check(copy, 2005, 6, 9, 19, 20, 30, 40);
    }

    @Test public void testPropertySetHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.hourOfDay().setCopy(12);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 12, 20, 30, 40);
        
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
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.hourOfDay().setCopy("12");
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 12, 20, 30, 40);
    }

    @Test public void testPropertyWithMaximumValueHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.hourOfDay().withMaximumValue();
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 23, 20, 30, 40);
    }

    @Test public void testPropertyWithMinimumValueHour() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.hourOfDay().withMinimumValue();
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 0, 20, 30, 40);
    }

    @Test public void testPropertyCompareToHour() {
        LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.hourOfDay().compareTo(test2) < 0);
NoAssert.donothing(true, test2.hourOfDay().compareTo(test1) > 0);
NoAssert.donothing(true, test1.hourOfDay().compareTo(test1) == 0);
        try {
            test1.hourOfDay().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.hourOfDay().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.hourOfDay().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.hourOfDay().compareTo(dt1) == 0);
        try {
            test1.hourOfDay().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMinute() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
NoAssert.donothing("minuteOfHour", test.minuteOfHour().getName());
NoAssert.donothing("Property[minuteOfHour]", test.minuteOfHour().toString());
NoAssert.donothing(test, test.minuteOfHour().getLocalDateTime());
NoAssert.donothing(20, test.minuteOfHour().get());
NoAssert.donothing("20", test.minuteOfHour().getAsString());
NoAssert.donothing("20", test.minuteOfHour().getAsText());
NoAssert.donothing("20", test.minuteOfHour().getAsText(Locale.FRENCH));
NoAssert.donothing("20", test.minuteOfHour().getAsShortText());
NoAssert.donothing("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
NoAssert.donothing(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
NoAssert.donothing(2, test.minuteOfHour().getMaximumTextLength(null));
NoAssert.donothing(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesMinute() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(0, test.minuteOfHour().getMinimumValue());
NoAssert.donothing(0, test.minuteOfHour().getMinimumValueOverall());
NoAssert.donothing(59, test.minuteOfHour().getMaximumValue());
NoAssert.donothing(59, test.minuteOfHour().getMaximumValueOverall());
    }

    @Test public void testPropertyWithMaxMinValueMinute() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        check(test.minuteOfHour().withMaximumValue(), 2005, 6, 9, 10, 59, 30, 40);
        check(test.minuteOfHour().withMinimumValue(), 2005, 6, 9, 10, 0, 30, 40);
    }

    @Test public void testPropertyAddToCopyMinute() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.minuteOfHour().addToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 29, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(39);
        check(copy, 2005, 6, 9, 10, 59, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(40);
        check(copy, 2005, 6, 9, 11, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(1 * 60 + 45);
        check(copy, 2005, 6, 9, 12, 5, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(13 * 60 + 39);
        check(copy, 2005, 6, 9, 23, 59, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(13 * 60 + 40);
        check(copy, 2005, 6, 10, 0, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-9);
        check(copy, 2005, 6, 9, 10, 11, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-19);
        check(copy, 2005, 6, 9, 10, 1, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-20);
        check(copy, 2005, 6, 9, 10, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-21);
        check(copy, 2005, 6, 9, 9, 59, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-(10 * 60 + 20));
        check(copy, 2005, 6, 9, 0, 0, 30, 40);
        
        copy = test.minuteOfHour().addToCopy(-(10 * 60 + 21));
        check(copy, 2005, 6, 8, 23, 59, 30, 40);
    }

    @Test public void testPropertyAddWrapFieldToCopyMinute() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.minuteOfHour().addWrapFieldToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 29, 30, 40);
        
        copy = test.minuteOfHour().addWrapFieldToCopy(49);
        check(copy, 2005, 6, 9, 10, 9, 30, 40);
        
        copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        check(copy, 2005, 6, 9, 10, 33, 30, 40);
    }

    @Test public void testPropertySetMinute() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.minuteOfHour().setCopy(12);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 12, 30, 40);
        
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
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.minuteOfHour().setCopy("12");
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 12, 30, 40);
    }

    @Test public void testPropertyCompareToMinute() {
        LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.minuteOfHour().compareTo(test2) < 0);
NoAssert.donothing(true, test2.minuteOfHour().compareTo(test1) > 0);
NoAssert.donothing(true, test1.minuteOfHour().compareTo(test1) == 0);
        try {
            test1.minuteOfHour().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.minuteOfHour().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.minuteOfHour().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.minuteOfHour().compareTo(dt1) == 0);
        try {
            test1.minuteOfHour().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetSecond() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
NoAssert.donothing("secondOfMinute", test.secondOfMinute().getName());
NoAssert.donothing("Property[secondOfMinute]", test.secondOfMinute().toString());
NoAssert.donothing(test, test.secondOfMinute().getLocalDateTime());
NoAssert.donothing(30, test.secondOfMinute().get());
NoAssert.donothing("30", test.secondOfMinute().getAsString());
NoAssert.donothing("30", test.secondOfMinute().getAsText());
NoAssert.donothing("30", test.secondOfMinute().getAsText(Locale.FRENCH));
NoAssert.donothing("30", test.secondOfMinute().getAsShortText());
NoAssert.donothing("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
NoAssert.donothing(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
NoAssert.donothing(2, test.secondOfMinute().getMaximumTextLength(null));
NoAssert.donothing(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesSecond() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(0, test.secondOfMinute().getMinimumValue());
NoAssert.donothing(0, test.secondOfMinute().getMinimumValueOverall());
NoAssert.donothing(59, test.secondOfMinute().getMaximumValue());
NoAssert.donothing(59, test.secondOfMinute().getMaximumValueOverall());
    }

    @Test public void testPropertyWithMaxMinValueSecond() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        check(test.secondOfMinute().withMaximumValue(), 2005, 6, 9, 10, 20, 59, 40);
        check(test.secondOfMinute().withMinimumValue(), 2005, 6, 9, 10, 20, 0, 40);
    }

    @Test public void testPropertyAddToCopySecond() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.secondOfMinute().addToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 39, 40);
        
        copy = test.secondOfMinute().addToCopy(29);
        check(copy, 2005, 6, 9, 10, 20, 59, 40);
        
        copy = test.secondOfMinute().addToCopy(30);
        check(copy, 2005, 6, 9, 10, 21, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(39 * 60 + 29);
        check(copy, 2005, 6, 9, 10, 59, 59, 40);
        
        copy = test.secondOfMinute().addToCopy(39 * 60 + 30);
        check(copy, 2005, 6, 9, 11, 0, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(13 * 60 * 60 + 39 * 60 + 30);
        check(copy, 2005, 6, 10, 0, 0, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(-9);
        check(copy, 2005, 6, 9, 10, 20, 21, 40);
        
        copy = test.secondOfMinute().addToCopy(-30);
        check(copy, 2005, 6, 9, 10, 20, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(-31);
        check(copy, 2005, 6, 9, 10, 19, 59, 40);
        
        copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        check(copy, 2005, 6, 9, 0, 0, 0, 40);
        
        copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        check(copy, 2005, 6, 8, 23, 59, 59, 40);
    }

    @Test public void testPropertyAddWrapFieldToCopySecond() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.secondOfMinute().addWrapFieldToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 39, 40);
        
        copy = test.secondOfMinute().addWrapFieldToCopy(49);
        check(copy, 2005, 6, 9, 10, 20, 19, 40);
        
        copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        check(copy, 2005, 6, 9, 10, 20, 43, 40);
    }

    @Test public void testPropertySetSecond() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.secondOfMinute().setCopy(12);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 12, 40);
        
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
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.secondOfMinute().setCopy("12");
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 12, 40);
    }

    @Test public void testPropertyCompareToSecond() {
        LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.secondOfMinute().compareTo(test2) < 0);
NoAssert.donothing(true, test2.secondOfMinute().compareTo(test1) > 0);
NoAssert.donothing(true, test1.secondOfMinute().compareTo(test1) == 0);
        try {
            test1.secondOfMinute().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.secondOfMinute().compareTo(dt2) < 0);
NoAssert.donothing(true, test2.secondOfMinute().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.secondOfMinute().compareTo(dt1) == 0);
        try {
            test1.secondOfMinute().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyGetMilli() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
NoAssert.donothing("millisOfSecond", test.millisOfSecond().getName());
NoAssert.donothing("Property[millisOfSecond]", test.millisOfSecond().toString());
NoAssert.donothing(test, test.millisOfSecond().getLocalDateTime());
NoAssert.donothing(40, test.millisOfSecond().get());
NoAssert.donothing("40", test.millisOfSecond().getAsString());
NoAssert.donothing("40", test.millisOfSecond().getAsText());
NoAssert.donothing("40", test.millisOfSecond().getAsText(Locale.FRENCH));
NoAssert.donothing("40", test.millisOfSecond().getAsShortText());
NoAssert.donothing("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().millis(), test.millisOfSecond().getDurationField());
NoAssert.donothing(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
NoAssert.donothing(3, test.millisOfSecond().getMaximumTextLength(null));
NoAssert.donothing(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesMilli() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
NoAssert.donothing(0, test.millisOfSecond().getMinimumValue());
NoAssert.donothing(0, test.millisOfSecond().getMinimumValueOverall());
NoAssert.donothing(999, test.millisOfSecond().getMaximumValue());
NoAssert.donothing(999, test.millisOfSecond().getMaximumValueOverall());
    }

    @Test public void testPropertyWithMaxMinValueMilli() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        check(test.millisOfSecond().withMaximumValue(), 2005, 6, 9, 10, 20, 30, 999);
        check(test.millisOfSecond().withMinimumValue(), 2005, 6, 9, 10, 20, 30, 0);
    }

    @Test public void testPropertyAddToCopyMilli() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.millisOfSecond().addToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 30, 49);
        
        copy = test.millisOfSecond().addToCopy(959);
        check(copy, 2005, 6, 9, 10, 20, 30, 999);
        
        copy = test.millisOfSecond().addToCopy(960);
        check(copy, 2005, 6, 9, 10, 20, 31, 0);
        
        copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        check(copy, 2005, 6, 9, 23, 59, 59, 999);
        
        copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        check(copy, 2005, 6, 10, 0, 0, 0, 0);
        
        copy = test.millisOfSecond().addToCopy(-9);
        check(copy, 2005, 6, 9, 10, 20, 30, 31);
        
        copy = test.millisOfSecond().addToCopy(-40);
        check(copy, 2005, 6, 9, 10, 20, 30, 0);
        
        copy = test.millisOfSecond().addToCopy(-41);
        check(copy, 2005, 6, 9, 10, 20, 29, 999);
        
        copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        check(copy, 2005, 6, 9, 0, 0, 0, 0);
        
        copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        check(copy, 2005, 6, 8, 23, 59, 59, 999);
    }

    @Test public void testPropertyAddWrapFieldToCopyMilli() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 30, 49);
        
        copy = test.millisOfSecond().addWrapFieldToCopy(995);
        check(copy, 2005, 6, 9, 10, 20, 30, 35);
        
        copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        check(copy, 2005, 6, 9, 10, 20, 30, 993);
    }

    @Test public void testPropertySetMilli() {
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.millisOfSecond().setCopy(12);
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 30, 12);
        
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
        LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        LocalDateTime copy = test.millisOfSecond().setCopy("12");
        check(test, 2005, 6, 9, 10, 20, 30, 40);
        check(copy, 2005, 6, 9, 10, 20, 30, 12);
    }

    @Test public void testPropertyCompareToMilli() {
        LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.millisOfSecond().compareTo(test2) < 0);
NoAssert.donothing(true, test2.millisOfSecond().compareTo(test1) > 0);
NoAssert.donothing(true, test1.millisOfSecond().compareTo(test1) == 0);
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
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {
NoAssert.donothing(year, test.getYear());
NoAssert.donothing(month, test.getMonthOfYear());
NoAssert.donothing(day, test.getDayOfMonth());
NoAssert.donothing(hour, test.getHourOfDay());
NoAssert.donothing(min, test.getMinuteOfHour());
NoAssert.donothing(sec, test.getSecondOfMinute());
NoAssert.donothing(mil, test.getMillisOfSecond());
    }
}
