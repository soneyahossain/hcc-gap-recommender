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
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFieldType  { //extends TestCase {

    public static void main(String[] args) throws Exception  {
        TestDateTimeFieldType TB= new TestDateTimeFieldType();
        TB.setUp(); TB.test_era(); TB.tearDown();
        TB.setUp(); TB.test_centuryOfEra(); TB.tearDown();
        TB.setUp(); TB.test_yearOfCentury(); TB.tearDown();
        TB.setUp(); TB.test_yearOfEra(); TB.tearDown();
        TB.setUp(); TB.test_year(); TB.tearDown();
        TB.setUp(); TB.test_monthOfYear(); TB.tearDown();
        TB.setUp(); TB.test_weekyearOfCentury(); TB.tearDown();
        TB.setUp(); TB.test_weekyear(); TB.tearDown();
        TB.setUp(); TB.test_weekOfWeekyear(); TB.tearDown();
        TB.setUp(); TB.test_dayOfYear(); TB.tearDown();
        TB.setUp(); TB.test_dayOfMonth(); TB.tearDown();
        TB.setUp(); TB.test_dayOfWeek(); TB.tearDown();
        TB.setUp(); TB.test_halfdayOfDay(); TB.tearDown();
        TB.setUp(); TB.test_clockhourOfDay(); TB.tearDown();
        TB.setUp(); TB.test_clockhourOfHalfday(); TB.tearDown();
        TB.setUp(); TB.test_hourOfHalfday(); TB.tearDown();
        TB.setUp(); TB.test_hourOfDay(); TB.tearDown();
        TB.setUp(); TB.test_minuteOfDay(); TB.tearDown();
        TB.setUp(); TB.test_minuteOfHour(); TB.tearDown();
        TB.setUp(); TB.test_secondOfDay(); TB.tearDown();
        TB.setUp(); TB.test_secondOfMinute(); TB.tearDown();
        TB.setUp(); TB.test_millisOfDay(); TB.tearDown();
        TB.setUp(); TB.test_millisOfSecond(); TB.tearDown();
        //TB.setUp(); TB.test_other(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFieldType.class);
    }

    public TestDateTimeFieldType(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void test_era() throws Exception {
NoAssert.donothing(DateTimeFieldType.era(), DateTimeFieldType.era());
NoAssert.donothing("era", DateTimeFieldType.era().getName());
NoAssert.donothing(DurationFieldType.eras(), DateTimeFieldType.era().getDurationType());
NoAssert.donothing(null, DateTimeFieldType.era().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().era(), DateTimeFieldType.era().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().era().isSupported(), DateTimeFieldType.era().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.era());
    }

    @Test public void test_centuryOfEra() throws Exception {
NoAssert.donothing(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra());
NoAssert.donothing("centuryOfEra", DateTimeFieldType.centuryOfEra().getName());
NoAssert.donothing(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType());
NoAssert.donothing(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.centuryOfEra());
    }

    @Test public void test_yearOfCentury() throws Exception {
        assertEquals(DateTimeFieldType.yearOfCentury(), DateTimeFieldType.yearOfCentury());
NoAssert.donothing("yearOfCentury", DateTimeFieldType.yearOfCentury().getName());
NoAssert.donothing(DurationFieldType.years(), DateTimeFieldType.yearOfCentury().getDurationType());
NoAssert.donothing(DurationFieldType.centuries(), DateTimeFieldType.yearOfCentury().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().yearOfCentury(), DateTimeFieldType.yearOfCentury().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().yearOfCentury().isSupported(), DateTimeFieldType.yearOfCentury().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.yearOfCentury());
    }

    @Test public void test_yearOfEra() throws Exception {
NoAssert.donothing(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra());
        assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName());
NoAssert.donothing(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType());
        assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.yearOfEra());
    }

    @Test public void test_year() throws Exception {
NoAssert.donothing(DateTimeFieldType.year(), DateTimeFieldType.year());
        assertEquals("year", DateTimeFieldType.year().getName());
NoAssert.donothing(DurationFieldType.years(), DateTimeFieldType.year().getDurationType());
        assertEquals(null, DateTimeFieldType.year().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.year());
    }

    @Test public void test_monthOfYear() throws Exception {
NoAssert.donothing(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear());
NoAssert.donothing("monthOfYear", DateTimeFieldType.monthOfYear().getName());
NoAssert.donothing(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType());
NoAssert.donothing(DurationFieldType.years(), DateTimeFieldType.monthOfYear().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC()));
        assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.monthOfYear());
    }

    @Test public void test_weekyearOfCentury() throws Exception {
NoAssert.donothing(DateTimeFieldType.weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury());
NoAssert.donothing("weekyearOfCentury", DateTimeFieldType.weekyearOfCentury().getName());
NoAssert.donothing(DurationFieldType.weekyears(), DateTimeFieldType.weekyearOfCentury().getDurationType());
NoAssert.donothing(DurationFieldType.centuries(), DateTimeFieldType.weekyearOfCentury().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().weekyearOfCentury().isSupported(), DateTimeFieldType.weekyearOfCentury().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.weekyearOfCentury());
    }

    @Test public void test_weekyear() throws Exception {
NoAssert.donothing(DateTimeFieldType.weekyear(), DateTimeFieldType.weekyear());
NoAssert.donothing("weekyear", DateTimeFieldType.weekyear().getName());
        assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyear().getDurationType());
NoAssert.donothing(null, DateTimeFieldType.weekyear().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().weekyear(), DateTimeFieldType.weekyear().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().weekyear().isSupported(), DateTimeFieldType.weekyear().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.weekyear());
    }

    @Test public void test_weekOfWeekyear() throws Exception {
        assertEquals(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear());
        assertEquals("weekOfWeekyear", DateTimeFieldType.weekOfWeekyear().getName());
NoAssert.donothing(DurationFieldType.weeks(), DateTimeFieldType.weekOfWeekyear().getDurationType());
NoAssert.donothing(DurationFieldType.weekyears(), DateTimeFieldType.weekOfWeekyear().getRangeDurationType());
        assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear().getField(CopticChronology.getInstanceUTC()));
        assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear().isSupported(), DateTimeFieldType.weekOfWeekyear().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.weekOfWeekyear());
    }

    @Test public void test_dayOfYear() throws Exception {
NoAssert.donothing(DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfYear());
NoAssert.donothing("dayOfYear", DateTimeFieldType.dayOfYear().getName());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.dayOfYear().getDurationType());
NoAssert.donothing(DurationFieldType.years(), DateTimeFieldType.dayOfYear().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().dayOfYear(), DateTimeFieldType.dayOfYear().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().dayOfYear().isSupported(), DateTimeFieldType.dayOfYear().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.dayOfYear());
    }

    @Test public void test_dayOfMonth() throws Exception {
NoAssert.donothing(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth());
NoAssert.donothing("dayOfMonth", DateTimeFieldType.dayOfMonth().getName());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType());
        assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.dayOfMonth());
    }

    @Test public void test_dayOfWeek() throws Exception {
        assertEquals(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfWeek());
NoAssert.donothing("dayOfWeek", DateTimeFieldType.dayOfWeek().getName());
        assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfWeek().getDurationType());
NoAssert.donothing(DurationFieldType.weeks(), DateTimeFieldType.dayOfWeek().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().dayOfWeek(), DateTimeFieldType.dayOfWeek().getField(CopticChronology.getInstanceUTC()));
        assertEquals(CopticChronology.getInstanceUTC().dayOfWeek().isSupported(), DateTimeFieldType.dayOfWeek().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.dayOfWeek());
    }

    @Test public void test_halfdayOfDay() throws Exception {
        assertEquals(DateTimeFieldType.halfdayOfDay(), DateTimeFieldType.halfdayOfDay());
NoAssert.donothing("halfdayOfDay", DateTimeFieldType.halfdayOfDay().getName());
NoAssert.donothing(DurationFieldType.halfdays(), DateTimeFieldType.halfdayOfDay().getDurationType());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.halfdayOfDay().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().halfdayOfDay(), DateTimeFieldType.halfdayOfDay().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().halfdayOfDay().isSupported(), DateTimeFieldType.halfdayOfDay().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.halfdayOfDay());
    }

    @Test public void test_clockhourOfDay() throws Exception {
NoAssert.donothing(DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.clockhourOfDay());
NoAssert.donothing("clockhourOfDay", DateTimeFieldType.clockhourOfDay().getName());
NoAssert.donothing(DurationFieldType.hours(), DateTimeFieldType.clockhourOfDay().getDurationType());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.clockhourOfDay().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().clockhourOfDay(), DateTimeFieldType.clockhourOfDay().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().clockhourOfDay().isSupported(), DateTimeFieldType.clockhourOfDay().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.clockhourOfDay());
    }

    @Test public void test_clockhourOfHalfday() throws Exception {
        assertEquals(DateTimeFieldType.clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday());
NoAssert.donothing("clockhourOfHalfday", DateTimeFieldType.clockhourOfHalfday().getName());
NoAssert.donothing(DurationFieldType.hours(), DateTimeFieldType.clockhourOfHalfday().getDurationType());
NoAssert.donothing(DurationFieldType.halfdays(), DateTimeFieldType.clockhourOfHalfday().getRangeDurationType());
        assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().clockhourOfHalfday().isSupported(), DateTimeFieldType.clockhourOfHalfday().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.clockhourOfHalfday());
    }

    @Test public void test_hourOfHalfday() throws Exception {
NoAssert.donothing(DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfHalfday());
NoAssert.donothing("hourOfHalfday", DateTimeFieldType.hourOfHalfday().getName());
NoAssert.donothing(DurationFieldType.hours(), DateTimeFieldType.hourOfHalfday().getDurationType());
NoAssert.donothing(DurationFieldType.halfdays(), DateTimeFieldType.hourOfHalfday().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().hourOfHalfday(), DateTimeFieldType.hourOfHalfday().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().hourOfHalfday().isSupported(), DateTimeFieldType.hourOfHalfday().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.hourOfHalfday());
    }

    @Test public void test_hourOfDay() throws Exception {
NoAssert.donothing(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay());
NoAssert.donothing("hourOfDay", DateTimeFieldType.hourOfDay().getName());
NoAssert.donothing(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.hourOfDay());
    }

    @Test public void test_minuteOfDay() throws Exception {
NoAssert.donothing(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay());
NoAssert.donothing("minuteOfDay", DateTimeFieldType.minuteOfDay().getName());
        assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType());
        assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.minuteOfDay());
    }

    @Test public void test_minuteOfHour() throws Exception {
NoAssert.donothing(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour());
NoAssert.donothing("minuteOfHour", DateTimeFieldType.minuteOfHour().getName());
NoAssert.donothing(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType());
NoAssert.donothing(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.minuteOfHour());
    }

    @Test public void test_secondOfDay() throws Exception {
NoAssert.donothing(DateTimeFieldType.secondOfDay(), DateTimeFieldType.secondOfDay());
        assertEquals("secondOfDay", DateTimeFieldType.secondOfDay().getName());
        assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfDay().getDurationType());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.secondOfDay().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().secondOfDay(), DateTimeFieldType.secondOfDay().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().secondOfDay().isSupported(), DateTimeFieldType.secondOfDay().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.secondOfDay());
    }

    @Test public void test_secondOfMinute() throws Exception {
NoAssert.donothing(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.secondOfMinute());
NoAssert.donothing("secondOfMinute", DateTimeFieldType.secondOfMinute().getName());
NoAssert.donothing(DurationFieldType.seconds(), DateTimeFieldType.secondOfMinute().getDurationType());
NoAssert.donothing(DurationFieldType.minutes(), DateTimeFieldType.secondOfMinute().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().secondOfMinute(), DateTimeFieldType.secondOfMinute().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().secondOfMinute().isSupported(), DateTimeFieldType.secondOfMinute().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.secondOfMinute());
    }

    @Test public void test_millisOfDay() throws Exception {
NoAssert.donothing(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay());
NoAssert.donothing("millisOfDay", DateTimeFieldType.millisOfDay().getName());
NoAssert.donothing(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType());
NoAssert.donothing(DurationFieldType.days(), DateTimeFieldType.millisOfDay().getRangeDurationType());
NoAssert.donothing(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.millisOfDay());
    }

    @Test public void test_millisOfSecond() throws Exception {
NoAssert.donothing(DateTimeFieldType.millisOfSecond(), DateTimeFieldType.millisOfSecond());
NoAssert.donothing("millisOfSecond", DateTimeFieldType.millisOfSecond().getName());
NoAssert.donothing(DurationFieldType.millis(), DateTimeFieldType.millisOfSecond().getDurationType());
NoAssert.donothing(DurationFieldType.seconds(), DateTimeFieldType.millisOfSecond().getRangeDurationType());
        assertEquals(CopticChronology.getInstanceUTC().millisOfSecond(), DateTimeFieldType.millisOfSecond().getField(CopticChronology.getInstanceUTC()));
NoAssert.donothing(CopticChronology.getInstanceUTC().millisOfSecond().isSupported(), DateTimeFieldType.millisOfSecond().isSupported(CopticChronology.getInstanceUTC()));
        assertSerialization(DateTimeFieldType.millisOfSecond());
    }
/*
    @Test public void test_other() throws Exception {
        assertEquals(1, DateTimeFieldType.class.getDeclaredClasses().length);
        Class cls = DateTimeFieldType.class.getDeclaredClasses()[0];
        assertEquals(1, cls.getDeclaredConstructors().length);
        Constructor con = cls.getDeclaredConstructors()[0];
        Object[] params = new Object[] {
            "other", new Byte((byte) 128), DurationFieldType.hours(), DurationFieldType.months()};
        con.setAccessible(true);  // for Apache Harmony JVM
        DateTimeFieldType type = (DateTimeFieldType) con.newInstance(params);
        
        assertEquals("other", type.getName());
        assertSame(DurationFieldType.hours(), type.getDurationType());
        assertSame(DurationFieldType.months(), type.getRangeDurationType());
        try {
            type.getField(CopticChronology.getInstanceUTC());
            fail();
        } catch (InternalError ex) {}
        DateTimeFieldType result = doSerialization(type);
        assertEquals(type.getName(), result.getName());
        assertNotSame(type, result);
    }

    */

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {
        DateTimeFieldType result = doSerialization(type);
NoAssert.donothing(type, result);
    }

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        ois.close();
        return result;
    }

}
