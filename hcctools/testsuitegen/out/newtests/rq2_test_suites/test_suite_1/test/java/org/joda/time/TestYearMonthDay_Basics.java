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
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics  { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception  {
        TestYearMonthDay_Basics TB= new TestYearMonthDay_Basics();
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
        TB.setUp(); TB.testIsEqual_YMD(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_YMD(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_YMD(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_Chrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_sameChrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_nullChrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_invalidInNewChrono(); TB.tearDown();
        TB.setUp(); TB.testWithField1(); TB.tearDown();
        TB.setUp(); TB.testWithField2(); TB.tearDown();
        TB.setUp(); TB.testWithField3(); TB.tearDown();
        TB.setUp(); TB.testWithField4(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded1(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded2(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded3(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded4(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded5(); TB.tearDown();
        TB.setUp(); TB.testPlus_RP(); TB.tearDown();
        TB.setUp(); TB.testPlusYears_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testPlusDays_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_RP(); TB.tearDown();
        TB.setUp(); TB.testMinusYears_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testMinusDays_int(); TB.tearDown();
        TB.setUp(); TB.testToLocalDate(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeAtMidnight(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeAtMidnight_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeAtMidnight_nullZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeAtCurrentTime(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeAtCurrentTime_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeAtCurrentTime_nullZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_TOD(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_nullTOD(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_TOD_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_TOD_nullZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_nullTOD_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDateMidnight(); TB.tearDown();
        TB.setUp(); TB.testToDateMidnight_Zone(); TB.tearDown();
        TB.setUp(); TB.testToDateMidnight_nullZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_RI(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_nullRI(); TB.tearDown();
        TB.setUp(); TB.testToInterval(); TB.tearDown();
        TB.setUp(); TB.testToInterval_Zone(); TB.tearDown();
        TB.setUp(); TB.testToInterval_nullZone(); TB.tearDown();
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
        return new TestSuite(TestYearMonthDay_Basics.class);
    }

    public TestYearMonthDay_Basics(String name) {
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
        YearMonthDay test = new YearMonthDay();
NoAssert.donothing(1970, test.get(DateTimeFieldType.year()));
NoAssert.donothing(6, test.get(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(9, test.get(DateTimeFieldType.dayOfMonth()));
        try {
            test.get(null);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.get(DateTimeFieldType.hourOfDay());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSize() {
        YearMonthDay test = new YearMonthDay();
NoAssert.donothing(3, test.size());
    }

    @Test public void testGetFieldType() {
        YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
NoAssert.donothing(DateTimeFieldType.year(), test.getFieldType(0));
NoAssert.donothing(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        try {
            test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFieldTypes() {
        YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        DateTimeFieldType[] fields = test.getFieldTypes();
NoAssert.donothing(DateTimeFieldType.year(), fields[0]);
NoAssert.donothing(DateTimeFieldType.monthOfYear(), fields[1]);
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), fields[2]);
NoAssert.donothing(test.getFieldTypes(), test.getFieldTypes());
    }

    @Test public void testGetField() {
        YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
NoAssert.donothing(COPTIC_UTC.year(), test.getField(0));
NoAssert.donothing(COPTIC_UTC.monthOfYear(), test.getField(1));
NoAssert.donothing(COPTIC_UTC.dayOfMonth(), test.getField(2));
        try {
            test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getField(3);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFields() {
        YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        DateTimeField[] fields = test.getFields();
NoAssert.donothing(COPTIC_UTC.year(), fields[0]);
NoAssert.donothing(COPTIC_UTC.monthOfYear(), fields[1]);
NoAssert.donothing(COPTIC_UTC.dayOfMonth(), fields[2]);
NoAssert.donothing(test.getFields(), test.getFields());
    }

    @Test public void testGetValue() {
        YearMonthDay test = new YearMonthDay();
NoAssert.donothing(1970, test.getValue(0));
NoAssert.donothing(6, test.getValue(1));
NoAssert.donothing(9, test.getValue(2));
        try {
            test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetValues() {
        YearMonthDay test = new YearMonthDay();
        int[] values = test.getValues();
NoAssert.donothing(1970, values[0]);
NoAssert.donothing(6, values[1]);
NoAssert.donothing(9, values[2]);
NoAssert.donothing(test.getValues(), test.getValues());
    }

    @Test public void testIsSupported() {
        YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.year()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }

    @Test public void testEqualsHashCode() {
        YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS);
        YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        YearMonthDay test3 = new YearMonthDay(1971, 6, 9);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockInstant()));
NoAssert.donothing(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }
        public int[] getValues() {
            return new int[] {1970, 6, 9};
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testCompareTo() {
        YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
        YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
NoAssert.donothing(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
NoAssert.donothing(0, test3.compareTo(test2));
        
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
        };
        int[] values = new int[] {2005, 6, 2};
        Partial p = new Partial(types, values);
NoAssert.donothing(0, test1.compareTo(p));
        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        try {
            test1.compareTo(new TimeOfDay());
            fail();
        } catch (ClassCastException ex) {}
        Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        try {
            new YearMonthDay(1970, 6, 9).compareTo(partial);
            fail();
        } catch (ClassCastException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsEqual_YMD() {
        YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
        YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
        try {
            new YearMonthDay(2005, 7, 2).isEqual(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsBefore_YMD() {
        YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
NoAssert.donothing(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
NoAssert.donothing(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));
        
        YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
        try {
            new YearMonthDay(2005, 7, 2).isBefore(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsAfter_YMD() {
        YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
NoAssert.donothing(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
NoAssert.donothing(false, test1.isAfter(test2));
NoAssert.donothing(true, test2.isAfter(test1));
        
        YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isAfter(test3));
NoAssert.donothing(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
        try {
            new YearMonthDay(2005, 7, 2).isAfter(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithChronologyRetainFields_Chrono() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        YearMonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        check(base, 2005, 6, 9);
NoAssert.donothing(COPTIC_UTC, base.getChronology());
        check(test, 2005, 6, 9);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
    }

    @Test public void testWithChronologyRetainFields_sameChrono() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
NoAssert.donothing(base, test);
    }

    @Test public void testWithChronologyRetainFields_nullChrono() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        YearMonthDay test = base.withChronologyRetainFields(null);
        check(base, 2005, 6, 9);
NoAssert.donothing(COPTIC_UTC, base.getChronology());
        check(test, 2005, 6, 9);
NoAssert.donothing(ISO_UTC, test.getChronology());
    }

    @Test public void testWithChronologyRetainFields_invalidInNewChrono() {
        YearMonthDay base = new YearMonthDay(2005, 1, 31, ISO_UTC);
        try {
            base.withChronologyRetainFields(COPTIC_UTC);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testWithField1() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        YearMonthDay result = test.withField(DateTimeFieldType.year(), 2006);
        
NoAssert.donothing(new YearMonthDay(2004, 6, 9), test);
NoAssert.donothing(new YearMonthDay(2006, 6, 9), result);
    }

    @Test public void testWithField2() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField3() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        try {
            test.withField(DateTimeFieldType.hourOfDay(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField4() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004);
NoAssert.donothing(new YearMonthDay(2004, 6, 9), test);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFieldAdded1() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        YearMonthDay result = test.withFieldAdded(DurationFieldType.years(), 6);
        
NoAssert.donothing(new YearMonthDay(2004, 6, 9), test);
NoAssert.donothing(new YearMonthDay(2010, 6, 9), result);
    }

    @Test public void testWithFieldAdded2() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded3() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded4() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        YearMonthDay result = test.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(test, result);
    }

    @Test public void testWithFieldAdded5() {
        YearMonthDay test = new YearMonthDay(2004, 6, 9);
        try {
            test.withFieldAdded(DurationFieldType.hours(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_RP() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        YearMonthDay expected = new YearMonthDay(2003, 7, 7, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusYears_int() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.plusYears(1);
        YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plusYears(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMonths_int() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.plusMonths(1);
        YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plusMonths(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusDays_int() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.plusDays(1);
        YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plusDays(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMinus_RP() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        YearMonthDay expected = new YearMonthDay(2001, 4, 2, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusYears_int() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.minusYears(1);
        YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minusYears(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMonths_int() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.minusMonths(1);
        YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minusMonths(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusDays_int() {
        YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        YearMonthDay result = test.minusDays(1);
        YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minusDays(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToLocalDate() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_UTC);
        LocalDate test = base.toLocalDate();
NoAssert.donothing(new LocalDate(2005, 6, 9, COPTIC_UTC), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTimeAtMidnight() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        DateTime test = base.toDateTimeAtMidnight();
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTimeAtMidnight_Zone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        DateTime test = base.toDateTimeAtMidnight(TOKYO);
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }

    @Test public void testToDateTimeAtMidnight_nullZone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null);
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTimeAtCurrentTime() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTimeAtCurrentTime();
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTimeAtCurrentTime_Zone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTimeAtCurrentTime(TOKYO);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTimeAtCurrentTime_nullZone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTimeAtCurrentTime((DateTimeZone) null);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_TOD() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);
        
        DateTime test = base.toDateTime(tod);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_nullTOD() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_LONDON).getMillis();
        DateTimeUtils.setCurrentMillisFixed(now);
        
        DateTime test = base.toDateTime((TimeOfDay) null);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_TOD_Zone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);
        
        DateTime test = base.toDateTime(tod, TOKYO);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_TOD_nullZone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);
        
        DateTime test = base.toDateTime(tod, null);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_nullTOD_Zone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_TOKYO).getMillis();
        DateTimeUtils.setCurrentMillisFixed(now);
        
        DateTime test = base.toDateTime((TimeOfDay) null, TOKYO);
        check(base, 2005, 6, 9);
        DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateMidnight() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        DateMidnight test = base.toDateMidnight();
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateMidnight_Zone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        DateMidnight test = base.toDateMidnight(TOKYO);
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateMidnight(2005, 6, 9, COPTIC_TOKYO), test);
    }

    @Test public void testToDateMidnight_nullZone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        DateMidnight test = base.toDateMidnight((DateTimeZone) null);
        check(base, 2005, 6, 9);
NoAssert.donothing(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_RI() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        
        DateTime test = base.toDateTime(dt);
        check(base, 2005, 6, 9);
        DateTime expected = dt;
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_nullRI() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTime((ReadableInstant) null);
        check(base, 2005, 6, 9);
        DateTime expected = dt;
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
        expected = expected.dayOfMonth().setCopy(9);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToInterval() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval();
        check(base, 2005, 6, 9);
        DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT);
        DateTime end = start.plus(Period.days(1));
        Interval expected = new Interval(start, end);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToInterval_Zone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval(TOKYO);
        check(base, 2005, 6, 9);
        DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT, TOKYO);
        DateTime end = start.plus(Period.days(1));
        Interval expected = new Interval(start, end);
NoAssert.donothing(expected, test);
    }

    @Test public void testToInterval_nullZone() {
        YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval(null);
        check(base, 2005, 6, 9);
        DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT, LONDON);
        DateTime end = start.plus(Period.days(1));
        Interval expected = new Interval(start, end);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithers() {
        YearMonthDay test = new YearMonthDay(1970, 6, 9);
        check(test.withYear(2000), 2000, 6, 9);
        check(test.withMonthOfYear(2), 1970, 2, 9);
        check(test.withDayOfMonth(2), 1970, 6, 2);
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
        YearMonthDay test = new YearMonthDay(2005, 6, 9);
NoAssert.donothing(test.year(), test.property(DateTimeFieldType.year()));
NoAssert.donothing(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
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
        YearMonthDay test = new YearMonthDay(1972, 6, 9, COPTIC_PARIS);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        YearMonthDay result = (YearMonthDay) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
NoAssert.donothing(Arrays.equals(test.getValues(), result.getValues()));
NoAssert.donothing(Arrays.equals(test.getFields(), result.getFields()));
NoAssert.donothing(test.getChronology(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        YearMonthDay test = new YearMonthDay(2002, 6, 9);
NoAssert.donothing("2002-06-09", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String() {
        YearMonthDay test = new YearMonthDay(2002, 6, 9);
NoAssert.donothing("2002 \ufffd\ufffd", test.toString("yyyy HH"));
NoAssert.donothing("2002-06-09", test.toString((String) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String_Locale() {
        YearMonthDay test = new YearMonthDay(2002, 6, 9);
NoAssert.donothing("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH));
NoAssert.donothing("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH));
NoAssert.donothing("2002-06-09", test.toString(null, Locale.ENGLISH));
NoAssert.donothing("\ufffd 9/6", test.toString("EEE d/M", null));
NoAssert.donothing("2002-06-09", test.toString(null, null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_DTFormatter() {
        YearMonthDay test = new YearMonthDay(2002, 6, 9);
NoAssert.donothing("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
NoAssert.donothing("2002-06-09", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int hour, int min, int sec) {
NoAssert.donothing(hour, test.getYear());
NoAssert.donothing(min, test.getMonthOfYear());
NoAssert.donothing(sec, test.getDayOfMonth());
    }
}
