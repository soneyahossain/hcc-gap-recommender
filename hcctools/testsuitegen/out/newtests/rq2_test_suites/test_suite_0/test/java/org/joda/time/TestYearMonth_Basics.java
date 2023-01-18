/*
 *  Copyright 2001-2009 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics  { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
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
        TestYearMonth_Basics TB= new TestYearMonth_Basics();
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
        TB.setUp(); TB.testIsEqual_YM(); TB.tearDown();
        TB.setUp(); TB.testIsBefore_YM(); TB.tearDown();
        TB.setUp(); TB.testIsAfter_YM(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_Chrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_sameChrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_nullChrono(); TB.tearDown();
        TB.setUp(); TB.testWithChronologyRetainFields_invalidInNewChrono(); TB.tearDown();
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
        TB.setUp(); TB.testPlusYears_int(); TB.tearDown();
        TB.setUp(); TB.testPlusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testMinus_RP(); TB.tearDown();
        TB.setUp(); TB.testMinusYears_int(); TB.tearDown();
        TB.setUp(); TB.testMinusMonths_int(); TB.tearDown();
        TB.setUp(); TB.testToLocalDate(); TB.tearDown();
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
        return new TestSuite(TestYearMonth_Basics.class);
    }

    public TestYearMonth_Basics(String name) {
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
        YearMonth test = new YearMonth();
NoAssert.donothing(1970, test.get(DateTimeFieldType.year()));
NoAssert.donothing(6, test.get(DateTimeFieldType.monthOfYear()));
        try {
            test.get(null);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.get(DateTimeFieldType.dayOfMonth());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSize() {
        YearMonth test = new YearMonth();
NoAssert.donothing(2, test.size());
    }

    @Test public void testGetFieldType() {
        YearMonth test = new YearMonth(COPTIC_PARIS);
NoAssert.donothing(DateTimeFieldType.year(), test.getFieldType(0));
NoAssert.donothing(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        try {
            test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFieldTypes() {
        YearMonth test = new YearMonth(COPTIC_PARIS);
        DateTimeFieldType[] fields = test.getFieldTypes();
NoAssert.donothing(2, fields.length);
NoAssert.donothing(DateTimeFieldType.year(), fields[0]);
NoAssert.donothing(DateTimeFieldType.monthOfYear(), fields[1]);
NoAssert.donothing(test.getFieldTypes(), test.getFieldTypes());
    }

    @Test public void testGetField() {
        YearMonth test = new YearMonth(COPTIC_PARIS);
NoAssert.donothing(COPTIC_UTC.year(), test.getField(0));
NoAssert.donothing(COPTIC_UTC.monthOfYear(), test.getField(1));
        try {
            test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getField(2);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetFields() {
        YearMonth test = new YearMonth(COPTIC_PARIS);
        DateTimeField[] fields = test.getFields();
NoAssert.donothing(2, fields.length);
NoAssert.donothing(COPTIC_UTC.year(), fields[0]);
NoAssert.donothing(COPTIC_UTC.monthOfYear(), fields[1]);
NoAssert.donothing(test.getFields(), test.getFields());
    }

    @Test public void testGetValue() {
        YearMonth test = new YearMonth();
NoAssert.donothing(1970, test.getValue(0));
NoAssert.donothing(6, test.getValue(1));
        try {
            test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        try {
            test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {}
    }

    @Test public void testGetValues() {
        YearMonth test = new YearMonth();
        int[] values = test.getValues();
NoAssert.donothing(2, values.length);
NoAssert.donothing(1970, values[0]);
NoAssert.donothing(6, values[1]);
NoAssert.donothing(test.getValues(), test.getValues());
    }

    @Test public void testIsSupported() {
        YearMonth test = new YearMonth(COPTIC_PARIS);
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.year()));
NoAssert.donothing(true, test.isSupported(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }

    @Test public void testEqualsHashCode() {
        YearMonth test1 = new YearMonth(1970, 6, COPTIC_PARIS);
        YearMonth test2 = new YearMonth(1970, 6, COPTIC_PARIS);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        YearMonth test3 = new YearMonth(1971, 6);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockYM()));
NoAssert.donothing(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }
        public int[] getValues() {
            return new int[] {1970, 6};
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testCompareTo() {
        YearMonth test1 = new YearMonth(2005, 6);
        YearMonth test1a = new YearMonth(2005, 6);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        YearMonth test2 = new YearMonth(2005, 7);
NoAssert.donothing(-1, test1.compareTo(test2));
NoAssert.donothing(+1, test2.compareTo(test1));
        
        YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
NoAssert.donothing(0, test3.compareTo(test2));
        
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
        };
        int[] values = new int[] {2005, 6};
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
            new YearMonth(1970, 6).compareTo(partial);
            fail();
        } catch (ClassCastException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsEqual_YM() {
        YearMonth test1 = new YearMonth(2005, 6);
        YearMonth test1a = new YearMonth(2005, 6);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        YearMonth test2 = new YearMonth(2005, 7);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
        YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
        try {
            new YearMonth(2005, 7).isEqual(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsBefore_YM() {
        YearMonth test1 = new YearMonth(2005, 6);
        YearMonth test1a = new YearMonth(2005, 6);
NoAssert.donothing(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
NoAssert.donothing(false, test1.isBefore(test1));
NoAssert.donothing(false, test1a.isBefore(test1a));
        
        YearMonth test2 = new YearMonth(2005, 7);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
        try {
            new YearMonth(2005, 7).isBefore(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testIsAfter_YM() {
        YearMonth test1 = new YearMonth(2005, 6);
        YearMonth test1a = new YearMonth(2005, 6);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
NoAssert.donothing(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        YearMonth test2 = new YearMonth(2005, 7);
NoAssert.donothing(false, test1.isAfter(test2));
NoAssert.donothing(true, test2.isAfter(test1));
        
        YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
NoAssert.donothing(false, test1.isAfter(test3));
NoAssert.donothing(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
        try {
            new YearMonth(2005, 7).isAfter(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testWithChronologyRetainFields_Chrono() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        YearMonth test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        check(base, 2005, 6);
NoAssert.donothing(COPTIC_UTC, base.getChronology());
        check(test, 2005, 6);
NoAssert.donothing(BUDDHIST_UTC, test.getChronology());
    }

    @Test public void testWithChronologyRetainFields_sameChrono() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO);
NoAssert.donothing(base, test);
    }

    @Test public void testWithChronologyRetainFields_nullChrono() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        YearMonth test = base.withChronologyRetainFields(null);
        check(base, 2005, 6);
NoAssert.donothing(COPTIC_UTC, base.getChronology());
        check(test, 2005, 6);
NoAssert.donothing(ISO_UTC, test.getChronology());
    }

    @Test public void testWithChronologyRetainFields_invalidInNewChrono() {
        YearMonth base = new YearMonth(2005, 13, COPTIC_UTC);
        try {
            base.withChronologyRetainFields(ISO_UTC);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testWithField() {
        YearMonth test = new YearMonth(2004, 6);
        YearMonth result = test.withField(DateTimeFieldType.year(), 2006);
        
NoAssert.donothing(new YearMonth(2004, 6), test);
NoAssert.donothing(new YearMonth(2006, 6), result);
    }

    @Test public void testWithField_nullField() {
        YearMonth test = new YearMonth(2004, 6);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField_unknownField() {
        YearMonth test = new YearMonth(2004, 6);
        try {
            test.withField(DateTimeFieldType.hourOfDay(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField_same() {
        YearMonth test = new YearMonth(2004, 6);
        YearMonth result = test.withField(DateTimeFieldType.year(), 2004);
NoAssert.donothing(new YearMonth(2004, 6), test);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFieldAdded() {
        YearMonth test = new YearMonth(2004, 6);
        YearMonth result = test.withFieldAdded(DurationFieldType.years(), 6);
        
NoAssert.donothing(new YearMonth(2004, 6), test);
NoAssert.donothing(new YearMonth(2010, 6), result);
    }

    @Test public void testWithFieldAdded_nullField_zero() {
        YearMonth test = new YearMonth(2004, 6);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_nullField_nonZero() {
        YearMonth test = new YearMonth(2004, 6);
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded_zero() {
        YearMonth test = new YearMonth(2004, 6);
        YearMonth result = test.withFieldAdded(DurationFieldType.years(), 0);
NoAssert.donothing(test, result);
    }

    @Test public void testWithFieldAdded_unknownField() {
        YearMonth test = new YearMonth(2004, 6);
        try {
            test.withFieldAdded(DurationFieldType.hours(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus_RP() {
        YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusYears_int() {
        YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        YearMonth result = test.plusYears(1);
        YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plusYears(0);
NoAssert.donothing(test, result);
    }

    @Test public void testPlusMonths_int() {
        YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        YearMonth result = test.plusMonths(1);
        YearMonth expected = new YearMonth(2002, 6, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.plusMonths(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testMinus_RP() {
        YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minus((ReadablePeriod) null);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusYears_int() {
        YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        YearMonth result = test.minusYears(1);
        YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minusYears(0);
NoAssert.donothing(test, result);
    }

    @Test public void testMinusMonths_int() {
        YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        YearMonth result = test.minusMonths(1);
        YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance());
NoAssert.donothing(expected, result);
        
        result = test.minusMonths(0);
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToLocalDate() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_UTC);
        LocalDate test = base.toLocalDate(9);
NoAssert.donothing(new LocalDate(2005, 6, 9, COPTIC_UTC), test);
        try {
            base.toLocalDate(0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testToDateTime_RI() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        
        DateTime test = base.toDateTime(dt);
        check(base, 2005, 6);
        DateTime expected = dt;
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
NoAssert.donothing(expected, test);
    }

    @Test public void testToDateTime_nullRI() {
        YearMonth base = new YearMonth(2005, 6);
        DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        DateTime test = base.toDateTime((ReadableInstant) null);
        check(base, 2005, 6);
        DateTime expected = dt;
        expected = expected.year().setCopy(2005);
        expected = expected.monthOfYear().setCopy(6);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToInterval() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval();
        check(base, 2005, 6);
        DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON);
        DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON);
        Interval expected = new Interval(start, end);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testToInterval_Zone() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval(TOKYO);
        check(base, 2005, 6);
        DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_TOKYO);
        DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_TOKYO);
        Interval expected = new Interval(start, end);
NoAssert.donothing(expected, test);
    }

    @Test public void testToInterval_nullZone() {
        YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        Interval test = base.toInterval(null);
        check(base, 2005, 6);
        DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON);
        DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON);
        Interval expected = new Interval(start, end);
NoAssert.donothing(expected, test);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithers() {
        YearMonth test = new YearMonth(1970, 6);
        check(test.withYear(2000), 2000, 6);
        check(test.withMonthOfYear(2), 1970, 2);
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
        YearMonth test = new YearMonth(2005, 6);
NoAssert.donothing(test.year(), test.property(DateTimeFieldType.year()));
NoAssert.donothing(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
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
        YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        YearMonth result = (YearMonth) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
NoAssert.donothing(Arrays.equals(test.getValues(), result.getValues()));
NoAssert.donothing(Arrays.equals(test.getFields(), result.getFields()));
NoAssert.donothing(test.getChronology(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        YearMonth test = new YearMonth(2002, 6);
NoAssert.donothing("2002-06", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String() {
        YearMonth test = new YearMonth(2002, 6);
NoAssert.donothing("2002 \ufffd\ufffd", test.toString("yyyy HH"));
NoAssert.donothing("2002-06", test.toString((String) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_String_Locale() {
        YearMonth test = new YearMonth(2002, 6);
NoAssert.donothing("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH));
NoAssert.donothing("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH));
NoAssert.donothing("2002-06", test.toString(null, Locale.ENGLISH));
NoAssert.donothing("\ufffd \ufffd/6", test.toString("EEE d/M", null));
NoAssert.donothing("2002-06", test.toString(null, null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_DTFormatter() {
        YearMonth test = new YearMonth(2002, 6);
NoAssert.donothing("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
NoAssert.donothing("2002-06", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {
NoAssert.donothing(year, test.getYear());
NoAssert.donothing(month, test.getMonthOfYear());
    }
}
