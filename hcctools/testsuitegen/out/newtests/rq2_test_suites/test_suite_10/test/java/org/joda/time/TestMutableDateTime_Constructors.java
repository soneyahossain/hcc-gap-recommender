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

import java.util.Date;
import java.util.Locale;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Constructors  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {
        TestMutableDateTime_Constructors TB= new TestMutableDateTime_Constructors();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.test_now(); TB.tearDown();
        TB.setUp(); TB.test_now_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.test_now_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.test_now_Chronology(); TB.tearDown();
        TB.setUp(); TB.test_now_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testParse_noFormatter(); TB.tearDown();
        TB.setUp(); TB.testParse_formatter(); TB.tearDown();
        TB.setUp(); TB.testConstructor(); TB.tearDown();
        TB.setUp(); TB.testConstructor_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long1_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long2_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_long_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object(); TB.tearDown();
        TB.setUp(); TB.testConstructor_invalidObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_badconverterObject(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_invalidObject_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_badconverterObject_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_invalidObject_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_Object_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_nullObject_nullChronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_badconverterObject_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int_int_int_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int_int_int_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_int_int_int_int_nullChronology(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Constructors.class);
    }

    public TestMutableDateTime_Constructors(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        java.util.TimeZone.setDefault(LONDON.toTimeZone());
        Locale.setDefault(Locale.UK);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        java.util.TimeZone.setDefault(zone.toTimeZone());
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    @Test public void test_now() throws Throwable {
        MutableDateTime test = MutableDateTime.now();
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test now (DateTimeZone)
     */
    @Test public void test_now_DateTimeZone() throws Throwable {
        MutableDateTime test = MutableDateTime.now(PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test now (DateTimeZone=null)
     */
    @Test public void test_now_nullDateTimeZone() throws Throwable {
        try {
            MutableDateTime.now((DateTimeZone) null);
            fail();
        } catch (NullPointerException ex) {}
    }

    /**
     * Test now (Chronology)
     */
    @Test public void test_now_Chronology() throws Throwable {
        MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test now (Chronology=null)
     */
    @Test public void test_now_nullChronology() throws Throwable {
        try {
            MutableDateTime.now((Chronology) null);
            fail();
        } catch (NullPointerException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testParse_noFormatter() throws Throwable {
NoAssert.donothing(new MutableDateTime(2010, 6, 30, 1, 20, 0, 0, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), MutableDateTime.parse("2010-06-30T01:20+02:00"));
NoAssert.donothing(new MutableDateTime(2010, 1, 2, 14, 50, 0, 0, ISOChronology.getInstance(LONDON)), MutableDateTime.parse("2010-002T14:50"));
    }

    @Test public void testParse_formatter() throws Throwable {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
NoAssert.donothing(new MutableDateTime(2010, 6, 30, 13, 0, 0, 0, ISOChronology.getInstance(PARIS)), MutableDateTime.parse("2010--30 06 13", f));
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    @Test public void testConstructor() throws Throwable {
        MutableDateTime test = new MutableDateTime();
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (DateTimeZone)
     */
    @Test public void testConstructor_DateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime(PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test public void testConstructor_nullDateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime((DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Chronology)
     */
    @Test public void testConstructor_Chronology() throws Throwable {
        MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Chronology=null)
     */
    @Test public void testConstructor_nullChronology() throws Throwable {
        MutableDateTime test = new MutableDateTime((Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long1() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long2() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME2);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME2, test.getMillis());
    }

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test public void testConstructor_long1_DateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test public void testConstructor_long2_DateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME2, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME2, test.getMillis());
    }

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    @Test public void testConstructor_long_nullDateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, (DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long1_Chronology() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long2_Chronology() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME2, test.getMillis());
    }

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test public void testConstructor_long_nullChronology() throws Throwable {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, (Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_Object() throws Throwable {
        Date date = new Date(TEST_TIME1);
        MutableDateTime test = new MutableDateTime(date);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_invalidObject() throws Throwable {
        try {
            new MutableDateTime(new Object());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (Object=null)
     */
    @Test public void testConstructor_nullObject() throws Throwable {
        MutableDateTime test = new MutableDateTime((Object) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Object=null)
     */
    @Test public void testConstructor_badconverterObject() throws Throwable {
        try {
            ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            MutableDateTime test = new MutableDateTime(new Integer(0));
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(0L, test.getMillis());
        } finally {
            ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test public void testConstructor_Object_DateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1);
        MutableDateTime test = new MutableDateTime(date, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test public void testConstructor_invalidObject_DateTimeZone() throws Throwable {
        try {
            new MutableDateTime(new Object(), PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    @Test public void testConstructor_nullObject_DateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime((Object) null, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    @Test public void testConstructor_Object_nullDateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1);
        MutableDateTime test = new MutableDateTime(date, (DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    @Test public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {
        try {
            ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance());
            assertEquals(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(0L, test.getMillis());
        } finally {
            ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }

    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_Object_Chronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        MutableDateTime test = new MutableDateTime(date, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_invalidObject_Chronology() throws Throwable {
        try {
            new MutableDateTime(new Object(), GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test public void testConstructor_nullObject_Chronology() throws Throwable {
        MutableDateTime test = new MutableDateTime((Object) null, GregorianChronology.getInstance());
        assertEquals(GregorianChronology.getInstance(), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test public void testConstructor_Object_nullChronology() throws Throwable {
        Date date = new Date(TEST_TIME1);
        MutableDateTime test = new MutableDateTime(date, (Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test public void testConstructor_nullObject_nullChronology() throws Throwable {
        MutableDateTime test = new MutableDateTime((Object) null, (Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_badconverterObject_Chronology() throws Throwable {
        try {
            ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(0L, test.getMillis());
        } finally {
            ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    @Test public void testConstructor_int_int_int_int_int_int_int() throws Throwable {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0);  // +01:00
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(LONDON, test.getZone());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
        try {
            new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 0, 9, 0, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 13, 9, 0, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 6, 0, 0, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 6, 31, 0, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        new MutableDateTime(2002, 7, 31, 0, 0, 0, 0);
        try {
            new MutableDateTime(2002, 7, 32, 0, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    @Test public void testConstructor_int_int_int_int_int_int_int_DateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 2, 0, 0, 0, PARIS);  // +02:00
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
        try {
            new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, PARIS);
        try {
            new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    @Test public void testConstructor_int_int_int_int_int_int_int_nullDateTimeZone() throws Throwable {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (DateTimeZone) null);  // +01:00
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test public void testConstructor_int_int_int_int_int_int_int_Chronology() throws Throwable {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, GregorianChronology.getInstance());  // +01:00
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
        try {
            new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
        try {
            new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test public void testConstructor_int_int_int_int_int_int_int_nullChronology() throws Throwable {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (Chronology) null);  // +01:00
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
    }

}
