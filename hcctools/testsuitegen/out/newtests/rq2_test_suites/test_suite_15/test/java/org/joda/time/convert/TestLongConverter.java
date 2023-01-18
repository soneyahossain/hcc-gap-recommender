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
package org.joda.time.convert;import org.joda.time.NoAssert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for LongConverter.
 *
 * @author Stephen Colebourne
 */
public class TestLongConverter  { //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {
          //junit.textui.TestRunner.run(suite());


        TestLongConverter TB = new TestLongConverter();

        TB.setUp(); TB.testSingleton(); TB.tearDown();
        TB.setUp(); TB.testSupportedType(); TB.tearDown();
        TB.setUp(); TB.testGetInstantMillis_Object_Chronology(); TB.tearDown();
        TB.setUp(); TB.testGetChronology_Object_Zone(); TB.tearDown();
        TB.setUp(); TB.testGetChronology_Object_Chronology(); TB.tearDown();
        TB.setUp(); TB.testGetPartialValues(); TB.tearDown();
        TB.setUp(); TB.testGetDurationMillis_Object(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();

    }


    /*
    public static TestSuite suite() {
        return new TestSuite(TestLongConverter.class);
    }

    public TestLongConverter(String name) {
        super(name);
    }
     */


    @Before
    public void setUp() throws Exception {
        JULIAN = JulianChronology.getInstance();
        ISO = ISOChronology.getInstance();
    }

    @After
    public void tearDown() throws Exception {

    }

    //-----------------------------------------------------------------------
    @Test public void testSingleton() throws Exception {
        Class cls = LongConverter.class;
        assertEquals(false, Modifier.isPublic(cls.getModifiers()));
NoAssert.donothing(false, Modifier.isProtected(cls.getModifiers()));
NoAssert.donothing(false, Modifier.isPrivate(cls.getModifiers()));
        
        Constructor con = cls.getDeclaredConstructor((Class[]) null);
NoAssert.donothing(1, cls.getDeclaredConstructors().length);
        assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        Field fld = cls.getDeclaredField("INSTANCE");
NoAssert.donothing(false, Modifier.isPublic(fld.getModifiers()));
NoAssert.donothing(false, Modifier.isProtected(fld.getModifiers()));
NoAssert.donothing(false, Modifier.isPrivate(fld.getModifiers()));
    }

    //-----------------------------------------------------------------------
    @Test public void testSupportedType() throws Exception {
NoAssert.donothing(Long.class, LongConverter.INSTANCE.getSupportedType());
    }

    //-----------------------------------------------------------------------
    @Test public void testGetInstantMillis_Object_Chronology() throws Exception {
NoAssert.donothing(123L, LongConverter.INSTANCE.getInstantMillis(new Long(123L), JULIAN));
NoAssert.donothing(123L, LongConverter.INSTANCE.getInstantMillis(new Long(123L), (Chronology) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetChronology_Object_Zone() throws Exception {
NoAssert.donothing(ISO_PARIS, LongConverter.INSTANCE.getChronology(new Long(123L), PARIS));
NoAssert.donothing(ISO, LongConverter.INSTANCE.getChronology(new Long(123L), (DateTimeZone) null));
    }

    @Test public void testGetChronology_Object_Chronology() throws Exception {
NoAssert.donothing(JULIAN, LongConverter.INSTANCE.getChronology(new Long(123L), JULIAN));
NoAssert.donothing(ISO, LongConverter.INSTANCE.getChronology(new Long(123L), (Chronology) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetPartialValues() throws Exception {
        TimeOfDay tod = new TimeOfDay();
        int[] expected = ISOChronology.getInstance().get(tod, 12345678L);
        int[] actual = LongConverter.INSTANCE.getPartialValues(tod, new Long(12345678L), ISOChronology.getInstance());
NoAssert.donothing(true, Arrays.equals(expected, actual));
    }

    //-----------------------------------------------------------------------
    @Test public void testGetDurationMillis_Object() throws Exception {
NoAssert.donothing(123L, LongConverter.INSTANCE.getDurationMillis(new Long(123L)));
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
NoAssert.donothing("Converter[java.lang.Long]", LongConverter.INSTANCE.toString());
    }

}
