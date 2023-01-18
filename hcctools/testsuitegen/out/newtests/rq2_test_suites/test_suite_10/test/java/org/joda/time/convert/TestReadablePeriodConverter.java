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

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePeriodConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadablePeriodConverter  { //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception  {
        //junit.textui.TestRunner.run(suite());

        TestReadablePeriodConverter TB = new TestReadablePeriodConverter();

        TB.setUp(); TB.testSingleton(); TB.tearDown();
        TB.setUp(); TB.testSupportedType(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType_Object(); TB.tearDown();
        TB.setUp(); TB.testSetInto_Object(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestReadablePeriodConverter.class);
    }

    public TestReadablePeriodConverter(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
        JULIAN = JulianChronology.getInstance();
        ISO = ISOChronology.getInstance();
    }

    @After public void tearDown() throws Exception {

    }

    //-----------------------------------------------------------------------
    @Test public void testSingleton() throws Exception {
        Class cls = ReadablePeriodConverter.class;
        assertEquals(false, Modifier.isPublic(cls.getModifiers()));
NoAssert.donothing(false, Modifier.isProtected(cls.getModifiers()));
NoAssert.donothing(false, Modifier.isPrivate(cls.getModifiers()));
        
        Constructor con = cls.getDeclaredConstructor((Class[]) null);
NoAssert.donothing(1, cls.getDeclaredConstructors().length);
NoAssert.donothing(true, Modifier.isProtected(con.getModifiers()));
        
        Field fld = cls.getDeclaredField("INSTANCE");
NoAssert.donothing(false, Modifier.isPublic(fld.getModifiers()));
NoAssert.donothing(false, Modifier.isProtected(fld.getModifiers()));
NoAssert.donothing(false, Modifier.isPrivate(fld.getModifiers()));
    }

    //-----------------------------------------------------------------------
    @Test public void testSupportedType() throws Exception {
NoAssert.donothing(ReadablePeriod.class, ReadablePeriodConverter.INSTANCE.getSupportedType());
    }

    //-----------------------------------------------------------------------
    @Test public void testGetPeriodType_Object() throws Exception {
NoAssert.donothing(PeriodType.standard(),
            ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.standard())));
NoAssert.donothing(PeriodType.yearMonthDayTime(),
            ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.yearMonthDayTime())));
    }

    @Test public void testSetInto_Object() throws Exception {
        MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime());
        ReadablePeriodConverter.INSTANCE.setInto(m, new Period(0, 0, 0, 3, 0, 4, 0, 5), null);
NoAssert.donothing(0, m.getYears());
NoAssert.donothing(0, m.getMonths());
NoAssert.donothing(0, m.getWeeks());
NoAssert.donothing(3, m.getDays());
NoAssert.donothing(0, m.getHours());
NoAssert.donothing(4, m.getMinutes());
NoAssert.donothing(0, m.getSeconds());
NoAssert.donothing(5, m.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
NoAssert.donothing("Converter[org.joda.time.ReadablePeriod]", ReadablePeriodConverter.INSTANCE.toString());
    }

}
