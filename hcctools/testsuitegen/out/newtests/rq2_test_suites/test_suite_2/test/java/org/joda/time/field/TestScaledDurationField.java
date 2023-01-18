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
package org.joda.time.field;import org.joda.time.NoAssert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationField.
 *
 * @author Stephen Colebourne
 */
public class TestScaledDurationField  { //extends TestCase {
    
    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;
    
    private ScaledDurationField iField;

    public static void main(String[] args) throws Exception  {
        TestScaledDurationField TB= new TestScaledDurationField();
        TB.setUp(); TB.test_constructor(); TB.tearDown();
        TB.setUp(); TB.test_getScalar(); TB.tearDown();
        TB.setUp(); TB.test_getType(); TB.tearDown();
        TB.setUp(); TB.test_getName(); TB.tearDown();
        TB.setUp(); TB.test_isSupported(); TB.tearDown();
        TB.setUp(); TB.test_isPrecise(); TB.tearDown();
        TB.setUp(); TB.test_getUnitMillis(); TB.tearDown();
        TB.setUp(); TB.test_toString(); TB.tearDown();
        TB.setUp(); TB.test_getValue_long(); TB.tearDown();
        TB.setUp(); TB.test_getValueAsLong_long(); TB.tearDown();
        TB.setUp(); TB.test_getValue_long_long(); TB.tearDown();
        TB.setUp(); TB.test_getValueAsLong_long_long(); TB.tearDown();
        TB.setUp(); TB.test_getMillis_int(); TB.tearDown();
        TB.setUp(); TB.test_getMillis_long(); TB.tearDown();
        TB.setUp(); TB.test_getMillis_int_long(); TB.tearDown();
        TB.setUp(); TB.test_getMillis_long_long(); TB.tearDown();
        TB.setUp(); TB.test_add_long_int(); TB.tearDown();
        TB.setUp(); TB.test_add_long_long(); TB.tearDown();
        TB.setUp(); TB.test_getDifference_long_int(); TB.tearDown();
        TB.setUp(); TB.test_getDifferenceAsLong_long_long(); TB.tearDown();
        TB.setUp(); TB.test_equals(); TB.tearDown();
        TB.setUp(); TB.test_hashCode(); TB.tearDown();
        TB.setUp(); TB.test_compareTo(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestScaledDurationField.class);
    }

    public TestScaledDurationField(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
        DurationField base = MillisDurationField.INSTANCE;
        iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }

    @After public void tearDown() throws Exception {
        iField = null;
    }

    //-----------------------------------------------------------------------
    @Test public void test_constructor() {
        try {
            new ScaledDurationField(null, DurationFieldType.minutes(), 10);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new ScaledDurationField(MillisDurationField.INSTANCE, null, 10);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void test_getScalar() {
NoAssert.donothing(90, iField.getScalar());
    }

    //-----------------------------------------------------------------------
    @Test public void test_getType() {
NoAssert.donothing(DurationFieldType.minutes(), iField.getType());
    }

    @Test public void test_getName() {
NoAssert.donothing("minutes", iField.getName());
    }
    
    @Test public void test_isSupported() {
NoAssert.donothing(true, iField.isSupported());
    }

    @Test public void test_isPrecise() {
NoAssert.donothing(true, iField.isPrecise());
    }

    @Test public void test_getUnitMillis() {
NoAssert.donothing(90, iField.getUnitMillis());
    }

    @Test public void test_toString() {
NoAssert.donothing("DurationField[minutes]", iField.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void test_getValue_long() {
NoAssert.donothing(0, iField.getValue(0L));
NoAssert.donothing(12345678 / 90, iField.getValue(12345678L));
NoAssert.donothing(-1234 / 90, iField.getValue(-1234L));
NoAssert.donothing(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX));
        try {
            iField.getValue(LONG_INTEGER_MAX + 1L);
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void test_getValueAsLong_long() {
NoAssert.donothing(0L, iField.getValueAsLong(0L));
NoAssert.donothing(12345678L / 90, iField.getValueAsLong(12345678L));
NoAssert.donothing(-1234 / 90L, iField.getValueAsLong(-1234L));
NoAssert.donothing(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L));
    }

    @Test public void test_getValue_long_long() {
NoAssert.donothing(0, iField.getValue(0L, 567L));
NoAssert.donothing(12345678 / 90, iField.getValue(12345678L, 567L));
NoAssert.donothing(-1234 / 90, iField.getValue(-1234L, 567L));
NoAssert.donothing(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L));
        try {
            iField.getValue(LONG_INTEGER_MAX + 1L, 567L);
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void test_getValueAsLong_long_long() {
NoAssert.donothing(0L, iField.getValueAsLong(0L, 567L));
NoAssert.donothing(12345678 / 90L, iField.getValueAsLong(12345678L, 567L));
NoAssert.donothing(-1234 / 90L, iField.getValueAsLong(-1234L, 567L));
NoAssert.donothing(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L));
    }

    //-----------------------------------------------------------------------
    @Test public void test_getMillis_int() {
NoAssert.donothing(0, iField.getMillis(0));
NoAssert.donothing(1234L * 90L, iField.getMillis(1234));
NoAssert.donothing(-1234L * 90L, iField.getMillis(-1234));
NoAssert.donothing(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX));
    }

    @Test public void test_getMillis_long() {
NoAssert.donothing(0L, iField.getMillis(0L));
NoAssert.donothing(1234L * 90L, iField.getMillis(1234L));
NoAssert.donothing(-1234L * 90L, iField.getMillis(-1234L));
        try {
            iField.getMillis(LONG_MAX);
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void test_getMillis_int_long() {
NoAssert.donothing(0L, iField.getMillis(0, 567L));
NoAssert.donothing(1234L * 90L, iField.getMillis(1234, 567L));
NoAssert.donothing(-1234L * 90L, iField.getMillis(-1234, 567L));
NoAssert.donothing(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX, 567L));
    }

    @Test public void test_getMillis_long_long() {
NoAssert.donothing(0L, iField.getMillis(0L, 567L));
NoAssert.donothing(1234L * 90L, iField.getMillis(1234L, 567L));
NoAssert.donothing(-1234L * 90L, iField.getMillis(-1234L, 567L));
        try {
            iField.getMillis(LONG_MAX, 567L);
            fail();
        } catch (ArithmeticException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void test_add_long_int() {
NoAssert.donothing(567L, iField.add(567L, 0));
NoAssert.donothing(567L + 1234L * 90L, iField.add(567L, 1234));
NoAssert.donothing(567L - 1234L * 90L, iField.add(567L, -1234));
        try {
            iField.add(LONG_MAX, 1);
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void test_add_long_long() {
NoAssert.donothing(567L, iField.add(567L, 0L));
NoAssert.donothing(567L + 1234L * 90L, iField.add(567L, 1234L));
NoAssert.donothing(567L - 1234L * 90L, iField.add(567L, -1234L));
        try {
            iField.add(LONG_MAX, 1L);
            fail();
        } catch (ArithmeticException ex) {}
        try {
            iField.add(1L, LONG_MAX);
            fail();
        } catch (ArithmeticException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void test_getDifference_long_int() {
NoAssert.donothing(0, iField.getDifference(1L, 0L));
NoAssert.donothing(567, iField.getDifference(567L * 90L, 0L));
NoAssert.donothing(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L));
NoAssert.donothing(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L));
        try {
            iField.getDifference(LONG_MAX, -1L);
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void test_getDifferenceAsLong_long_long() {
NoAssert.donothing(0L, iField.getDifferenceAsLong(1L, 0L));
NoAssert.donothing(567L, iField.getDifferenceAsLong(567L * 90L, 0L));
NoAssert.donothing(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L));
NoAssert.donothing(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L));
        try {
            iField.getDifferenceAsLong(LONG_MAX, -1L);
            fail();
        } catch (ArithmeticException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void test_equals() {
NoAssert.donothing(true, iField.equals(iField));
NoAssert.donothing(false, iField.equals(ISOChronology.getInstance().minutes()));
        DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2);
        assertEquals(false, iField.equals(dummy));
        dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90);
NoAssert.donothing(true, iField.equals(dummy));
        dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90);
        assertEquals(false, iField.equals(dummy));
NoAssert.donothing(false, iField.equals(""));
NoAssert.donothing(false, iField.equals(null));
    }

    @Test public void test_hashCode() {
NoAssert.donothing(iField.hashCode(), iField.hashCode());
NoAssert.donothing(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode());
        DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2);
NoAssert.donothing(false, iField.hashCode() == dummy.hashCode());
        dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90);
NoAssert.donothing(true, iField.hashCode() == dummy.hashCode());
        dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90);
NoAssert.donothing(false, iField.hashCode() == dummy.hashCode());
    }

    //-----------------------------------------------------------------------
    @Test public void test_compareTo() {
NoAssert.donothing(0, iField.compareTo(iField));
NoAssert.donothing(-1, iField.compareTo(ISOChronology.getInstance().minutes()));
        DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0);
NoAssert.donothing(1, iField.compareTo(dummy));
//        try {
//            iField.compareTo("");
//            fail();
//        } catch (ClassCastException ex) {}
        try {
            iField.compareTo(null);
            fail();
        } catch (NullPointerException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        DurationField test = iField;
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DurationField result = (DurationField) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

}
