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

import java.util.Date;
import java.util.Locale;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Constructors  { //extends TestCase {
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
                     366 + 365 + 365 + 0;
    
    // 2002-06-09
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME_NOW_PARIS =
            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {
        TestDateMidnight_Constructors TB= new TestDateMidnight_Constructors();
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
        TB.setUp(); TB.testConstructor_int_int_int(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_nullDateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_Chronology(); TB.tearDown();
        TB.setUp(); TB.testConstructor_int_int_int_nullChronology(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateMidnight_Constructors.class);
    }

    public TestDateMidnight_Constructors(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW_UTC).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1_UTC).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2_UTC).toString());
    }

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    @Test public void test_now() throws Throwable {
        DateMidnight test = DateMidnight.now();
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
    }

    /**
     * Test now (DateTimeZone)
     */
    @Test public void test_now_DateTimeZone() throws Throwable {
        DateMidnight test = DateMidnight.now(PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_PARIS, test.getMillis());
    }

    /**
     * Test now (DateTimeZone=null)
     */
    @Test public void test_now_nullDateTimeZone() throws Throwable {
        try {
            DateMidnight.now((DateTimeZone) null);
            fail();
        } catch (NullPointerException ex) {}
    }

    /**
     * Test now (Chronology)
     */
    @Test public void test_now_Chronology() throws Throwable {
        DateMidnight test = DateMidnight.now(GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    /**
     * Test now (Chronology=null)
     */
    @Test public void test_now_nullChronology() throws Throwable {
        try {
            DateMidnight.now((Chronology) null);
            fail();
        } catch (NullPointerException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testParse_noFormatter() throws Throwable {
NoAssert.donothing(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-06-30"));
NoAssert.donothing(new DateMidnight(2010, 1, 2, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-002"));
    }

    @Test public void testParse_formatter() throws Throwable {
NoAssert.donothing(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM")));
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    @Test public void testConstructor() throws Throwable {
        DateMidnight test = new DateMidnight();
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
    }

    /**
     * Test constructor (DateTimeZone)
     */
    @Test public void testConstructor_DateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight(PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_PARIS, test.getMillis());
    }

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test public void testConstructor_nullDateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight((DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Chronology)
     */
    @Test public void testConstructor_Chronology() throws Throwable {
        DateMidnight test = new DateMidnight(GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Chronology=null)
     */
    @Test public void testConstructor_nullChronology() throws Throwable {
        DateMidnight test = new DateMidnight((Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long1() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    /**
     * Test constructor (long)
     */
    @Test public void testConstructor_long2() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME2_UTC);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME2_LONDON, test.getMillis());
    }

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test public void testConstructor_long1_DateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME1_PARIS, test.getMillis());
    }

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test public void testConstructor_long2_DateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME2_UTC, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME2_PARIS, test.getMillis());
    }

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    @Test public void testConstructor_long_nullDateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long1_Chronology() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME1_UTC, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    /**
     * Test constructor (long, Chronology)
     */
    @Test public void testConstructor_long2_Chronology() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME2_UTC, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME2_LONDON, test.getMillis());
    }

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test public void testConstructor_long_nullChronology() throws Throwable {
        DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_Object() throws Throwable {
        Date date = new Date(TEST_TIME1_UTC);
        DateMidnight test = new DateMidnight(date);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object)
     */
    @Test public void testConstructor_invalidObject() throws Throwable {
        try {
            new DateMidnight(new Object());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (Object=null)
     */
    @Test public void testConstructor_nullObject() throws Throwable {
        DateMidnight test = new DateMidnight((Object) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object=null)
     */
    @Test public void testConstructor_badconverterObject() throws Throwable {
        try {
            ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            DateMidnight test = new DateMidnight(new Integer(0));
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test public void testConstructor_Object_DateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1_UTC);
        DateMidnight test = new DateMidnight(date, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME1_PARIS, test.getMillis());
    }

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test public void testConstructor_invalidObject_DateTimeZone() throws Throwable {
        try {
            new DateMidnight(new Object(), PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    @Test public void testConstructor_nullObject_DateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight((Object) null, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_PARIS, test.getMillis());
    }

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    @Test public void testConstructor_Object_nullDateTimeZone() throws Throwable {
        Date date = new Date(TEST_TIME1_UTC);
        DateMidnight test = new DateMidnight(date, (DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    @Test public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight((Object) null, (DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {
        try {
            ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }

    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_Object_Chronology() throws Throwable {
        Date date = new Date(TEST_TIME1_UTC);
        DateMidnight test = new DateMidnight(date, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_invalidObject_Chronology() throws Throwable {
        try {
            new DateMidnight(new Object(), GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test public void testConstructor_nullObject_Chronology() throws Throwable {
        DateMidnight test = new DateMidnight((Object) null, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test public void testConstructor_Object_nullChronology() throws Throwable {
        Date date = new Date(TEST_TIME1_UTC);
        DateMidnight test = new DateMidnight(date, (Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME1_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test public void testConstructor_nullObject_nullChronology() throws Throwable {
        DateMidnight test = new DateMidnight((Object) null, (Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
    }

    /**
     * Test constructor (Object, Chronology)
     */
    @Test public void testConstructor_badconverterObject_Chronology() throws Throwable {
        try {
            ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance());
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    @Test public void testConstructor_int_int_int() throws Throwable {
        DateMidnight test = new DateMidnight(2002, 6, 9);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(LONDON, test.getZone());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
        try {
            new DateMidnight(Integer.MIN_VALUE, 6, 9);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(Integer.MAX_VALUE, 6, 9);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 0, 9);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 13, 9);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 6, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 6, 31);
            fail();
        } catch (IllegalArgumentException ex) {}
        new DateMidnight(2002, 7, 31);
        try {
            new DateMidnight(2002, 7, 32);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    @Test public void testConstructor_int_int_int_DateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight(2002, 6, 9, PARIS);
NoAssert.donothing(ISOChronology.getInstance(PARIS), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_PARIS, test.getMillis());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
        try {
            new DateMidnight(Integer.MIN_VALUE, 6, 9, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(Integer.MAX_VALUE, 6, 9, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 0, 9, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 13, 9, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 6, 0, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 6, 31, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
        new DateMidnight(2002, 7, 31, PARIS);
        try {
            new DateMidnight(2002, 7, 32, PARIS);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    @Test public void testConstructor_int_int_int_nullDateTimeZone() throws Throwable {
        DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
    }

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test public void testConstructor_int_int_int_Chronology() throws Throwable {
        DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance());
NoAssert.donothing(GregorianChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
        try {
            new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 0, 9, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 13, 9, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 6, 0, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            new DateMidnight(2002, 6, 31, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
        new DateMidnight(2002, 7, 31, GregorianChronology.getInstance());
        try {
            new DateMidnight(2002, 7, 32, GregorianChronology.getInstance());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test public void testConstructor_int_int_int_nullChronology() throws Throwable {
        DateMidnight test = new DateMidnight(2002, 6, 9, (Chronology) null);
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(TEST_TIME_NOW_LONDON, test.getMillis());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
    }

}
