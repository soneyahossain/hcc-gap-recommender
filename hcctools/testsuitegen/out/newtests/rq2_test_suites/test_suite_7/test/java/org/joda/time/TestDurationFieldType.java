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
package org.joda.time;import org.joda.time.NoAssert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for DurationFieldType.
 *
 * @author Stephen Colebourne
 */
public class TestDurationFieldType  { //extends TestCase {

    public static void main(String[] args) throws Exception  {
        TestDurationFieldType TB= new TestDurationFieldType();
        TB.setUp(); TB.test_eras(); TB.tearDown();
        TB.setUp(); TB.test_centuries(); TB.tearDown();
        TB.setUp(); TB.test_years(); TB.tearDown();
        TB.setUp(); TB.test_months(); TB.tearDown();
        TB.setUp(); TB.test_weekyears(); TB.tearDown();
        TB.setUp(); TB.test_weeks(); TB.tearDown();
        TB.setUp(); TB.test_days(); TB.tearDown();
        TB.setUp(); TB.test_halfdays(); TB.tearDown();
        TB.setUp(); TB.test_hours(); TB.tearDown();
        TB.setUp(); TB.test_minutes(); TB.tearDown();
        TB.setUp(); TB.test_seconds(); TB.tearDown();
        TB.setUp(); TB.test_millis(); TB.tearDown();
        //TB.setUp(); TB.test_other(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDurationFieldType.class);
    }

    public TestDurationFieldType(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void test_eras() throws Exception {
NoAssert.donothing(DurationFieldType.eras(), DurationFieldType.eras());
NoAssert.donothing("eras", DurationFieldType.eras().getName());
        assertEquals(CopticChronology.getInstanceUTC().eras(), DurationFieldType.eras().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().eras().isSupported(), DurationFieldType.eras().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.eras());
    }

    @Test public void test_centuries() throws Exception {
NoAssert.donothing(DurationFieldType.centuries(), DurationFieldType.centuries());
NoAssert.donothing("centuries", DurationFieldType.centuries().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.centuries());
    }

    @Test public void test_years() throws Exception {
NoAssert.donothing(DurationFieldType.years(), DurationFieldType.years());
NoAssert.donothing("years", DurationFieldType.years().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().years(), DurationFieldType.years().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().years().isSupported(), DurationFieldType.years().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.years());
    }

    @Test public void test_months() throws Exception {
        assertEquals(DurationFieldType.months(), DurationFieldType.months());
NoAssert.donothing("months", DurationFieldType.months().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().months(), DurationFieldType.months().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().months().isSupported(), DurationFieldType.months().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.months());
    }

    @Test public void test_weekyears() throws Exception {
NoAssert.donothing(DurationFieldType.weekyears(), DurationFieldType.weekyears());
NoAssert.donothing("weekyears", DurationFieldType.weekyears().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().weekyears(), DurationFieldType.weekyears().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().weekyears().isSupported(), DurationFieldType.weekyears().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.weekyears());
    }

    @Test public void test_weeks() throws Exception {
NoAssert.donothing(DurationFieldType.weeks(), DurationFieldType.weeks());
NoAssert.donothing("weeks", DurationFieldType.weeks().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().weeks(), DurationFieldType.weeks().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().weeks().isSupported(), DurationFieldType.weeks().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.weeks());
    }

    @Test public void test_days() throws Exception {
NoAssert.donothing(DurationFieldType.days(), DurationFieldType.days());
NoAssert.donothing("days", DurationFieldType.days().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().days(), DurationFieldType.days().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().days().isSupported(), DurationFieldType.days().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.days());
    }

    @Test public void test_halfdays() throws Exception {
NoAssert.donothing(DurationFieldType.halfdays(), DurationFieldType.halfdays());
NoAssert.donothing("halfdays", DurationFieldType.halfdays().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().halfdays(), DurationFieldType.halfdays().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().halfdays().isSupported(), DurationFieldType.halfdays().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.halfdays());
    }

    @Test public void test_hours() throws Exception {
        assertEquals(DurationFieldType.hours(), DurationFieldType.hours());
NoAssert.donothing("hours", DurationFieldType.hours().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().hours(), DurationFieldType.hours().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().hours().isSupported(), DurationFieldType.hours().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.hours());
    }

    @Test public void test_minutes() throws Exception {
NoAssert.donothing(DurationFieldType.minutes(), DurationFieldType.minutes());
NoAssert.donothing("minutes", DurationFieldType.minutes().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().minutes(), DurationFieldType.minutes().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().minutes().isSupported(), DurationFieldType.minutes().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.minutes());
    }

    @Test public void test_seconds() throws Exception {
NoAssert.donothing(DurationFieldType.seconds(), DurationFieldType.seconds());
NoAssert.donothing("seconds", DurationFieldType.seconds().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().seconds(), DurationFieldType.seconds().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().seconds().isSupported(), DurationFieldType.seconds().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.seconds());
    }

    @Test public void test_millis() throws Exception {
NoAssert.donothing(DurationFieldType.millis(), DurationFieldType.millis());
NoAssert.donothing("millis", DurationFieldType.millis().getName());
NoAssert.donothing(CopticChronology.getInstanceUTC().millis(), DurationFieldType.millis().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().millis().isSupported(), DurationFieldType.millis().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DurationFieldType.millis());
    }
/*
    @Test public void test_other() throws Exception {
        assertEquals(1, DurationFieldType.class.getDeclaredClasses().length);
        Class cls = DurationFieldType.class.getDeclaredClasses()[0];
        assertEquals(1, cls.getDeclaredConstructors().length);
        Constructor con = cls.getDeclaredConstructors()[0];
        Object[] params = new Object[] {"other", new Byte((byte) 128)};
        DurationFieldType type = (DurationFieldType) con.newInstance(params);
        
        assertEquals("other", type.getName());
        try {
            type.getField(CopticChronology.getInstanceUTC());
            fail();
        } catch (InternalError ex) {}
        DurationFieldType result = doSerialization(type);
        assertEquals(type.getName(), result.getName());
        assertNotSame(type, result);
    }


 */
    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {
        DurationFieldType result = doSerialization(type);
NoAssert.donothing(type, result);
    }

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DurationFieldType result = (DurationFieldType) ois.readObject();
        ois.close();
        return result;
    }

}
