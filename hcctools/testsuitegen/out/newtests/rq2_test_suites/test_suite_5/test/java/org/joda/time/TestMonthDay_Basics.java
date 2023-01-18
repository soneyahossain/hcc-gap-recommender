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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Basics} 
 */
public class TestMonthDay_Basics  { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
//    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception  {
        TestMonthDay_Basics TB= new TestMonthDay_Basics();
        TB.setUp(); TB.testGet(); TB.tearDown();
        TB.setUp(); TB.testSize(); TB.tearDown();
        TB.setUp(); TB.testGetFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetFieldTypes(); TB.tearDown();
        TB.setUp(); TB.testGetField(); TB.tearDown();
        TB.setUp(); TB.testGetFields(); TB.tearDown();
        TB.setUp(); TB.testGetValue(); TB.tearDown();
        TB.setUp(); TB.testGetValues(); TB.tearDown();
        TB.setUp(); TB.testIsSupported(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testCompareTo(); TB.tearDown();
        TB.setUp(); TB.testIsEqual_MD(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_MD(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_MD(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_Chrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_sameChrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_nullChrono(); TB.tearDown();
        TB.setUp(); TB.testWithField(); TB.tearDown();
        TB.setUp(); TB.testWithField_nullField(); TB.tearDown();
        TB.setUp(); TB.testWithField_unknownField(); TB.tearDown();
        TB.setUp(); TB.testWithField_same(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_nullField_zero(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_nullField_nonZero(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_zero(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded_unknownField(); TB.tearDown();
        TB.setUp(); TB.testPlus_RP(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int_fromLeap(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int_negativeFromLeap(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int_endOfMonthAdjust(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int_negativeEndOfMonthAdjust(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int_same(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int_wrap(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int_adjust(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_wrapMonth(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_wrapMonthTwice(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_wrapMonthIntoNextYear(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_wrapMonthTwiceIntoNextYear(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_wrap50(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_toLeap(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_fromLeap(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int_negativeFromLeap(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_same(); TB.tearDown();
        TB.setUp(); TB.testMinus_RP(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int_fromLeap(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int_negativeFromLeap(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int_endOfMonthAdjust(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int_negativeEndOfMonthAdjust(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int_same(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int_wrap(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int_adjust(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int_wrapMonth(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int_wrapMonthTwice(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int_wrapMonthIntoLastYear(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int_wrapMonthTwiceIntoLastYear(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int_toLeap(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int_fromLeap(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int_negativeFromLeap(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_same(); TB.tearDown();
        TB.setUp(); TB.testToLocalDate(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_RI(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_nullRI(); TB.tearDown();
        TB.setUp(); TB.testWithers(); TB.tearDown();
        TB.setUp(); TB.testProperty(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToString_String(); TB.tearDown();
        TB.setUp(); TB.testToString_String_Locale(); TB.tearDown();
        TB.setUp(); TB.testToString_DTFormatter(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestMonthDay_Basics.class);
    }

    public TestMonthDay_Basics(String name) {
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
    @Test public void testGet() {
        MonthDay test = new MonthDay();
NoAssert.donothing(6, test.get(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(9, test.get(DateTimeFieldType.dayOfMonth()));
        try {
            test.get(null);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.get(DateTimeFieldType.year());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSize() {
        MonthDay test = new MonthDay();
NoAssert.donothing(2, test.size());
    }

    @Test public void testGetFieldType() {
        MonthDay test = new MonthDay(COPTIC_PARIS);
NoAssert.donothing(DateTimeFieldType.monthOfYear(), test.getFieldType(0));
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), test.getFieldType(1));

        try {
            test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFieldTypes() {
        MonthDay test = new MonthDay(COPTIC_PARIS);
        DateTimeFieldType[] fields = test.getFieldTypes();
NoAssert.donothing(2, fields.length);
NoAssert.donothing(DateTimeFieldType.monthOfYear(), fields[0]);
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), fields[1]);
NoAssert.donothing(test.getFieldTypes(), test.getFieldTypes());
    }

    @Test public void testGetField() {
        MonthDay test = new MonthDay(COPTIC_PARIS);
NoAssert.donothing(COPTIC_UTC.monthOfYear(), test.getField(0));
NoAssert.donothing(COPTIC_UTC.dayOfMonth(), test.getField(1));
        try {
            test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getField(2);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFields() {
        MonthDay test = new MonthDay(COPTIC_PARIS);
        DateTimeField[] fields = test.getFields();
        assertEquals(2, fields.length);
NoAssert.donothing(COPTIC_UTC.monthOfYear(), fields[0]);
NoAssert.donothing(COPTIC_UTC.dayOfMonth(), fields[1]);
NoAssert.donothing(test.getFields(), test.getFields());
    }

    @Test public void testGetValue() {
        MonthDay test = new MonthDay();
NoAssert.donothing(6, test.getValue(0));
NoAssert.donothing(9, test.getValue(1));
        try {
            test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetValues() {
        MonthDay test = new MonthDay();
        int[] values = test.getValues();
NoAssert.donothing(2, values.length);
NoAssert.donothing(6, values[0]);
NoAssert.donothing(9, values[1]);
NoAssert.donothing(test.getValues(), test.getValues());
    }

    @Test public void testIsSupported() {
        MonthDay test = new MonthDay(COPTIC_PARIS);
NoAssert.donothing(false, test.isSupported(DateTimeFieldType.year()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }

    @Test public void testEqualsHashCode() {
        MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS);
        MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        MonthDay test3 = new MonthDay(10, 6);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockMD()));
NoAssert.donothing(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        
        @Override
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }
        
        @Override
        public int[] getValues() {
            return new int[] {10, 6};
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testCompareTo() {
        MonthDay test1 = new MonthDay(6, 6);
        MonthDay test1a = new MonthDay(6, 6);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        MonthDay test2 = new MonthDay(6, 7);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
        MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
NoAssert.donothing(0, test3.compareTo(test2));
        
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        int[] values = new int[] {6, 6};
        Partial p = new Partial(types, values);
NoAssert.donothing(0, test1.compareTo(p));
        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {}
        try {
            test1.compareTo(new LocalTime());
            fail();
        } catch (ClassCastException ex) {}
        Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        try {
            new MonthDay(10, 6).compareTo(partial);
            fail();
        } catch (ClassCastException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsEqual_MD() {
        MonthDay test1 = new MonthDay(6, 6);
        MonthDay test1a = new MonthDay(6, 6);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        MonthDay test2 = new MonthDay(6, 7);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
        MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
        try {
            new MonthDay(6, 7).isEqual(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsBefore_MD() {
        MonthDay test1 = new MonthDay(6, 6);
        MonthDay test1a = new MonthDay(6, 6);
NoAssert.donothing(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
        assertEquals(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));
        
        MonthDay test2 = new MonthDay(6, 7);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
        try {
            new MonthDay(6, 7).isBefore(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsAfter_MD() {
        MonthDay test1 = new MonthDay(6, 6);
        MonthDay test1a = new MonthDay(6, 6);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
NoAssert.donothing(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        MonthDay test2 = new MonthDay(6, 7);
NoAssert.donothing(false, test1.isAfter(test2));
NoAssert.donothing(true, test2.isAfter(test1));
        
        MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isAfter(test3));
NoAssert.donothing(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
        try {
            new MonthDay(6, 7).isAfter(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithChronologyRetainFields_Chrono() {
        MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        MonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        check(base, 6, 6);
NoAssert.donothing(COPTIC_UTC, base.getChronology());
        check(test, 6, 6);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
    }

    @Test public void testWithChronologyRetainFields_sameChrono() {
        MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
NoAssert.donothing(base, test);
    }

    @Test public void testWithChronologyRetainFields_nullChrono() {
        MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        MonthDay test = base.withChronologyRetainFields(null);
        check(base, 6, 6);
NoAssert.donothing(COPTIC_UTC, base.getChronology());
        check(test, 6, 6);
NoAssert.donothing(ISO_UTC, test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testWithField() {
        MonthDay test = new MonthDay(9, 6);
        MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10);
        
NoAssert.donothing(new MonthDay(9, 6), test);
NoAssert.donothing(new MonthDay(10, 6), result);
    }

    @Test public void testWithField_nullField() {
        MonthDay test = new MonthDay(9, 6);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField_unknownField() {
        MonthDay test = new MonthDay(9, 6);
        try {
            test.withField(DateTimeFieldType.hourOfDay(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField_same() {
        MonthDay test = new MonthDay(9, 6);
        MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9);
NoAssert.donothing(new MonthDay(9, 6), test);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFieldAdded() {
        MonthDay test = new MonthDay(9, 6);
        MonthDay result = test.withFieldAdded(DurationFieldType.months(), 1);
        
NoAssert.donothing(new MonthDay(9, 6), test);
NoAssert.donothing(new MonthDay(10, 6), result);
    }

    @Test public void testWithFieldAdded_nullField_zero() {
        MonthDay test = new MonthDay(9, 6);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_nullField_nonZero() {
        MonthDay test = new MonthDay(9, 6);
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_zero() {
        MonthDay test = new MonthDay(9, 6);
        MonthDay result = test.withFieldAdded(DurationFieldType.months(), 0);
NoAssert.donothing(test, result);
    }

    @Test public void testWithFieldAdded_unknownField() {
        MonthDay test = new MonthDay(9, 6);
        try {
            test.withFieldAdded(DurationFieldType.hours(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_RP() {
        MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMonths_int() {
        MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        MonthDay result = test.plusMonths(1);
        MonthDay expected = new MonthDay(7, 5, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusMonths_int_fromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusMonths(1);
        MonthDay expected = new MonthDay(3, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusMonths_int_negativeFromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusMonths(-1);
        MonthDay expected = new MonthDay(1, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusMonths_int_endOfMonthAdjust() {
        MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusMonths(1);
        MonthDay expected = new MonthDay(4, 30, ISOChronology.getInstance());
        assertEquals(expected, result);
    }

    @Test public void testPlusMonths_int_negativeEndOfMonthAdjust() {
        MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusMonths(-1);
        MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusMonths_int_same() {
        MonthDay test = new MonthDay(6, 5, ISO_UTC);
        MonthDay result = test.plusMonths(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMonths_int_wrap() {
        MonthDay test = new MonthDay(6, 5, ISO_UTC);
        MonthDay result = test.plusMonths(10);
        MonthDay expected = new MonthDay(4, 5, ISO_UTC);
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusMonths_int_adjust() {
        MonthDay test = new MonthDay(7, 31, ISO_UTC);
        MonthDay result = test.plusMonths(2);
        MonthDay expected = new MonthDay(9, 30, ISO_UTC);
NoAssert.donothing(expected, result);
    }

    //-------------------------------------------------------------------------
    @Test public void testPlusDays_int() {
        MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance());
        MonthDay result = test.plusDays(1);
        MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_wrapMonth() {
        MonthDay test = new MonthDay(11, 1, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(31);
        MonthDay expected = new MonthDay(12, 2, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_wrapMonthTwice() {
        MonthDay test = new MonthDay(10, 31, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(32);
        MonthDay expected = new MonthDay(12, 2, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_wrapMonthIntoNextYear() {
        MonthDay test = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(31);
        MonthDay expected = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_wrapMonthTwiceIntoNextYear() {
        MonthDay test = new MonthDay(11, 30, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(32);
        MonthDay expected = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_wrap50() {
        MonthDay test = new MonthDay(5, 15, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(50);
        MonthDay expected = new MonthDay(7, 4, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_toLeap() {
        MonthDay test = new MonthDay(2, 28, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(1);
        MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_fromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(1);
        MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_int_negativeFromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.plusDays(-1);
        MonthDay expected = new MonthDay(2, 28, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testPlusDays_same() {
        MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance());
        MonthDay result = test.plusDays(0);
NoAssert.donothing(test, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testMinus_RP() {
        MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        MonthDay expected = new MonthDay(5, 4, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMonths_int() {
        MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        MonthDay result = test.minusMonths(1);
        MonthDay expected = new MonthDay(5, 5, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusMonths_int_fromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusMonths(1);
        MonthDay expected = new MonthDay(1, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusMonths_int_negativeFromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusMonths(-1);
        MonthDay expected = new MonthDay(3, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusMonths_int_endOfMonthAdjust() {
        MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusMonths(1);
        MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusMonths_int_negativeEndOfMonthAdjust() {
        MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusMonths(-1);
        MonthDay expected = new MonthDay(4, 30, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusMonths_int_same() {
        MonthDay test = new MonthDay(6, 5, ISO_UTC);
        MonthDay result = test.minusMonths(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMonths_int_wrap() {
        MonthDay test = new MonthDay(6, 5, ISO_UTC);
        MonthDay result = test.minusMonths(10);
        MonthDay expected = new MonthDay(8, 5, ISO_UTC);
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusMonths_int_adjust() {
        MonthDay test = new MonthDay(7, 31, ISO_UTC);
        MonthDay result = test.minusMonths(3);
        MonthDay expected = new MonthDay(4, 30, ISO_UTC);
NoAssert.donothing(expected, result);
    }

    //-------------------------------------------------------------------------
    @Test public void testMinusDays_int() {
        MonthDay test = new MonthDay(5, 11, BuddhistChronology.getInstance());
        MonthDay result = test.minusDays(1);
        MonthDay expected = new MonthDay(5, 10, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_int_wrapMonth() {
        MonthDay test = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusDays(30);
        MonthDay expected = new MonthDay(11, 1, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_int_wrapMonthTwice() {
        MonthDay test = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusDays(31);
        MonthDay expected = new MonthDay(10, 31, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_int_wrapMonthIntoLastYear() {
        MonthDay test = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusDays(31);
        MonthDay expected = new MonthDay(12, 1, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_int_wrapMonthTwiceIntoLastYear() {
        MonthDay test = new MonthDay(1, 1, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusDays(32);
        MonthDay expected = new MonthDay(11, 30, ISOChronology.getInstanceUTC());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_int_toLeap() {
        MonthDay test = new MonthDay(3, 1, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusDays(1);
        MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_int_fromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusDays(1);
        MonthDay expected = new MonthDay(2, 28, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_int_negativeFromLeap() {
        MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        MonthDay result = test.minusDays(-1);
        MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance());
NoAssert.donothing(expected, result);
    }

    @Test public void testMinusDays_same() {
        MonthDay test = new MonthDay(5, 11, BuddhistChronology.getInstance());
        MonthDay result = test.minusDays(0);
NoAssert.donothing(test, result);
    }
    
    //-----------------------------------------------------------------------
    @Test public void testToLocalDate() {
        MonthDay base = new MonthDay(6, 6, COPTIC_UTC);
        LocalDate test = base.toLocalDate(2009);
NoAssert.donothing(new LocalDate(2009, 6, 6, COPTIC_UTC), test);
        try {
            base.toLocalDate(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_RI() {
        MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        
        DateTime test = base.toDateTime(dt);
        check(base, 6, 6);
        DateTime expected = dt;
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(6);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_nullRI() {
        MonthDay base = new MonthDay(6, 6);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTime((ReadableInstant) null);
        check(base, 6, 6);
        DateTime expected = dt;
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(6);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithers() {
        MonthDay test = new MonthDay(10, 6);
        check(test.withMonthOfYear(5), 5, 6);
        check(test.withDayOfMonth(2), 10, 2);
        try {
            test.withMonthOfYear(0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.withMonthOfYear(13);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testProperty() {
        MonthDay test = new MonthDay(6, 6);
NoAssert.donothing(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        try {
            test.property(DateTimeFieldType.millisOfDay());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.property(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        MonthDay test = new MonthDay(5, 6, COPTIC_PARIS);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        MonthDay result = (MonthDay) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
NoAssert.donothing(Arrays.equals(test.getValues(), result.getValues()));
NoAssert.donothing(Arrays.equals(test.getFields(), result.getFields()));
NoAssert.donothing(test.getChronology(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        MonthDay test = new MonthDay(5, 6);
NoAssert.donothing("--05-06", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String() {
        MonthDay test = new MonthDay(5, 6);
NoAssert.donothing("05 \ufffd\ufffd", test.toString("MM HH"));
NoAssert.donothing("--05-06", test.toString((String) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String_Locale() {
        MonthDay test = new MonthDay(5, 6);
NoAssert.donothing("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH));
NoAssert.donothing("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH));
NoAssert.donothing("--05-06", test.toString(null, Locale.ENGLISH));
        assertEquals("\ufffd 6/5", test.toString("EEE d/M", null));
NoAssert.donothing("--05-06", test.toString(null, null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_DTFormatter() {
        MonthDay test = new MonthDay(5, 6);
NoAssert.donothing("05 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("MM HH")));
NoAssert.donothing("--05-06", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int month, int day) {
NoAssert.donothing(month, test.getMonthOfYear());
NoAssert.donothing(day, test.getDayOfMonth());
    }
}
