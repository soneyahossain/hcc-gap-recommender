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
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties  { //extends TestCase {

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
        TestYearMonth_Properties TB= new TestYearMonth_Properties();
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
        TB.setUp(); TB.testPropertyEquals(); TB.tearDown();
        TB.setUp(); TB.testPropertyHashCode(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeLenient(); TB.tearDown();
        TB.setUp(); TB.testPropertyEqualsHashCodeStrict(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonth_Properties.class);
    }

    public TestYearMonth_Properties(String name) {
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
        YearMonth test = new YearMonth(1972, 6);
NoAssert.donothing(test.getChronology().year(), test.year().getField());
NoAssert.donothing("year", test.year().getName());
NoAssert.donothing("Property[year]", test.year().toString());
NoAssert.donothing(test, test.year().getReadablePartial());
NoAssert.donothing(test, test.year().getYearMonth());
NoAssert.donothing(1972, test.year().get());
        assertEquals("1972", test.year().getAsString());
NoAssert.donothing("1972", test.year().getAsText());
NoAssert.donothing("1972", test.year().getAsText(Locale.FRENCH));
NoAssert.donothing("1972", test.year().getAsShortText());
NoAssert.donothing("1972", test.year().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().years(), test.year().getDurationField());
        assertEquals(null, test.year().getRangeDurationField());
NoAssert.donothing(9, test.year().getMaximumTextLength(null));
NoAssert.donothing(9, test.year().getMaximumShortTextLength(null));
    }

    @Test public void testPropertyGetMaxMinValuesYear() {
        YearMonth test = new YearMonth(1972, 6);
NoAssert.donothing(-292275054, test.year().getMinimumValue());
NoAssert.donothing(-292275054, test.year().getMinimumValueOverall());
NoAssert.donothing(292278993, test.year().getMaximumValue());
NoAssert.donothing(292278993, test.year().getMaximumValueOverall());
    }

    @Test public void testPropertyAddYear() {
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.year().addToCopy(9);
        check(test, 1972, 6);
        check(copy, 1981, 6);
        
        copy = test.year().addToCopy(0);
        check(copy, 1972, 6);
        
        copy = test.year().addToCopy(292277023 - 1972);
        check(copy, 292277023, 6);
        
        try {
            test.year().addToCopy(292278993 - 1972 + 1);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 1972, 6);
        
        copy = test.year().addToCopy(-1972);
        check(copy, 0, 6);
        
        copy = test.year().addToCopy(-1973);
        check(copy, -1, 6);
        
        try {
            test.year().addToCopy(-292275054 - 1972 - 1);
            fail();
        } catch (IllegalArgumentException ex) {}
        check(test, 1972, 6);
    }

    @Test public void testPropertyAddWrapFieldYear() {
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.year().addWrapFieldToCopy(9);
        check(test, 1972, 6);
        check(copy, 1981, 6);
        
        copy = test.year().addWrapFieldToCopy(0);
        check(copy, 1972, 6);
        
        copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        check(copy, -292275054, 6);
        
        copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        check(copy, 292278993, 6);
    }

    @Test public void testPropertySetYear() {
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.year().setCopy(12);
        check(test, 1972, 6);
        check(copy, 12, 6);
    }

    @Test public void testPropertySetTextYear() {
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.year().setCopy("12");
        check(test, 1972, 6);
        check(copy, 12, 6);
    }

    @Test public void testPropertyCompareToYear() {
        YearMonth test1 = new YearMonth(TEST_TIME1);
        YearMonth test2 = new YearMonth(TEST_TIME2);
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
        YearMonth test = new YearMonth(1972, 6);
NoAssert.donothing(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        assertEquals("monthOfYear", test.monthOfYear().getName());
NoAssert.donothing("Property[monthOfYear]", test.monthOfYear().toString());
NoAssert.donothing(test, test.monthOfYear().getReadablePartial());
        assertSame(test, test.monthOfYear().getYearMonth());
NoAssert.donothing(6, test.monthOfYear().get());
NoAssert.donothing("6", test.monthOfYear().getAsString());
NoAssert.donothing("June", test.monthOfYear().getAsText());
        assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("Jun", test.monthOfYear().getAsShortText());
NoAssert.donothing("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
NoAssert.donothing(test.getChronology().months(), test.monthOfYear().getDurationField());
NoAssert.donothing(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
NoAssert.donothing(9, test.monthOfYear().getMaximumTextLength(null));
NoAssert.donothing(3, test.monthOfYear().getMaximumShortTextLength(null));
        test = new YearMonth(1972, 7);
NoAssert.donothing("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
NoAssert.donothing("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }

    @Test public void testPropertyGetMaxMinValuesMonth() {
        YearMonth test = new YearMonth(1972, 6);
NoAssert.donothing(1, test.monthOfYear().getMinimumValue());
NoAssert.donothing(1, test.monthOfYear().getMinimumValueOverall());
NoAssert.donothing(12, test.monthOfYear().getMaximumValue());
NoAssert.donothing(12, test.monthOfYear().getMaximumValueOverall());
    }

    @Test public void testPropertyAddMonth() {
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.monthOfYear().addToCopy(6);
        check(test, 1972, 6);
        check(copy, 1972, 12);
        
        copy = test.monthOfYear().addToCopy(7);
        check(copy, 1973, 1);
        
        copy = test.monthOfYear().addToCopy(-5);
        check(copy, 1972, 1);
        
        copy = test.monthOfYear().addToCopy(-6);
        check(copy, 1971, 12);
    }

    @Test public void testPropertyAddWrapFieldMonth() {
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.monthOfYear().addWrapFieldToCopy(4);
        check(test, 1972, 6);
        check(copy, 1972, 10);
        
        copy = test.monthOfYear().addWrapFieldToCopy(8);
        check(copy, 1972, 2);
        
        copy = test.monthOfYear().addWrapFieldToCopy(-8);
        check(copy, 1972, 10);
    }

    @Test public void testPropertySetMonth() {
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.monthOfYear().setCopy(12);
        check(test, 1972, 6);
        check(copy, 1972, 12);
        
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
        YearMonth test = new YearMonth(1972, 6);
        YearMonth copy = test.monthOfYear().setCopy("12");
        check(test, 1972, 6);
        check(copy, 1972, 12);
        
        copy = test.monthOfYear().setCopy("December");
        check(test, 1972, 6);
        check(copy, 1972, 12);
        
        copy = test.monthOfYear().setCopy("Dec");
        check(test, 1972, 6);
        check(copy, 1972, 12);
    }

    @Test public void testPropertyCompareToMonth() {
        YearMonth test1 = new YearMonth(TEST_TIME1);
        YearMonth test2 = new YearMonth(TEST_TIME2);
NoAssert.donothing(true, test1.monthOfYear().compareTo(test2) < 0);
NoAssert.donothing(true, test2.monthOfYear().compareTo(test1) > 0);
        assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        DateTime dt1 = new DateTime(TEST_TIME1);
        DateTime dt2 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test1.monthOfYear().compareTo(dt2) < 0);
        assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
NoAssert.donothing(true, test1.monthOfYear().compareTo(dt1) == 0);
        try {
            test1.monthOfYear().compareTo((ReadableInstant) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPropertyEquals() {
        YearMonth test1 = new YearMonth(11, 11);
        YearMonth test2 = new YearMonth(11, 12);
        YearMonth test3 = new YearMonth(11, 11, CopticChronology.getInstanceUTC());
NoAssert.donothing(true, test1.monthOfYear().equals(test1.monthOfYear()));
NoAssert.donothing(false, test1.monthOfYear().equals(test1.year()));
NoAssert.donothing(false, test1.monthOfYear().equals(test2.monthOfYear()));
NoAssert.donothing(false, test1.monthOfYear().equals(test2.year()));
        
NoAssert.donothing(false, test1.year().equals(test1.monthOfYear()));
NoAssert.donothing(true, test1.year().equals(test1.year()));
NoAssert.donothing(false, test1.year().equals(test2.monthOfYear()));
NoAssert.donothing(true, test1.year().equals(test2.year()));
        
NoAssert.donothing(false, test1.monthOfYear().equals(null));
NoAssert.donothing(false, test1.monthOfYear().equals("any"));
        
        // chrono
NoAssert.donothing(false, test1.monthOfYear().equals(test3.monthOfYear()));
    }

    @Test public void testPropertyHashCode() {
        YearMonth test1 = new YearMonth(2005, 11);
        YearMonth test2 = new YearMonth(2005, 12);
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
NoAssert.donothing(false, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
NoAssert.donothing(true, test1.year().hashCode() == test1.year().hashCode());
NoAssert.donothing(true, test1.year().hashCode() == test2.year().hashCode());
    }

    @Test public void testPropertyEqualsHashCodeLenient() {
        YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS));
        YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS));
NoAssert.donothing(true, test1.monthOfYear().equals(test2.monthOfYear()));
NoAssert.donothing(true, test2.monthOfYear().equals(test1.monthOfYear()));
NoAssert.donothing(true, test1.monthOfYear().equals(test1.monthOfYear()));
NoAssert.donothing(true, test2.monthOfYear().equals(test2.monthOfYear()));
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
NoAssert.donothing(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }

    @Test public void testPropertyEqualsHashCodeStrict() {
        YearMonth test1 = new YearMonth(1970, 6, StrictChronology.getInstance(COPTIC_PARIS));
        YearMonth test2 = new YearMonth(1970, 6, StrictChronology.getInstance(COPTIC_PARIS));
NoAssert.donothing(true, test1.monthOfYear().equals(test2.monthOfYear()));
NoAssert.donothing(true, test2.monthOfYear().equals(test1.monthOfYear()));
NoAssert.donothing(true, test1.monthOfYear().equals(test1.monthOfYear()));
NoAssert.donothing(true, test2.monthOfYear().equals(test2.monthOfYear()));
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
NoAssert.donothing(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {
NoAssert.donothing(year, test.getYear());
NoAssert.donothing(month, test.getMonthOfYear());
    }
}
