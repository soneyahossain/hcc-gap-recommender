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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Basics  { //extends TestCase {
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
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception  {
        TestMutableDateTime_Basics TB= new TestMutableDateTime_Basics();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testGet_DateTimeField(); TB.tearDown();
        TB.setUp(); TB.testGet_DateTimeFieldType(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testCompareTo(); TB.tearDown();
        TB.setUp(); TB.testIsEqual(); TB.tearDown();
        TB.setUp(); TB.testIsBefore(); TB.tearDown();
        TB.setUp(); TB.testIsAfter(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToString_String(); TB.tearDown();
        TB.setUp(); TB.testToString_String_String(); TB.tearDown();
        TB.setUp(); TB.testToString_DTFormatter(); TB.tearDown();
        TB.setUp(); TB.testToInstant(); TB.tearDown();
        TB.setUp(); TB.testToDateTime(); TB.tearDown();
        TB.setUp(); TB.testToDateTimeISO(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testToDateTime_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTimeISO(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime_DateTimeZone(); TB.tearDown();
        TB.setUp(); TB.testToMutableDateTime_Chronology(); TB.tearDown();
        TB.setUp(); TB.testToDate(); TB.tearDown();
        TB.setUp(); TB.testToCalendar_Locale(); TB.tearDown();
        TB.setUp(); TB.testToGregorianCalendar(); TB.tearDown();
        TB.setUp(); TB.testClone(); TB.tearDown();
        TB.setUp(); TB.testCopy(); TB.tearDown();
        TB.setUp(); TB.testRounding1(); TB.tearDown();
        TB.setUp(); TB.testRounding2(); TB.tearDown();
        TB.setUp(); TB.testRounding3(); TB.tearDown();
        TB.setUp(); TB.testRounding4(); TB.tearDown();
        TB.setUp(); TB.testRounding5(); TB.tearDown();
        TB.setUp(); TB.testRounding6(); TB.tearDown();
        TB.setUp(); TB.testRounding7(); TB.tearDown();
        TB.setUp(); TB.testRounding8(); TB.tearDown();
        TB.setUp(); TB.testProperty(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Basics.class);
    }

    public TestMutableDateTime_Basics(String name) {
        super(name);
    }

     */

    @Before public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testTest() {
NoAssert.donothing("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
NoAssert.donothing("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
NoAssert.donothing("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testGet_DateTimeField() {
        MutableDateTime test = new MutableDateTime();
NoAssert.donothing(1, test.get(ISOChronology.getInstance().era()));
        assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra()));
NoAssert.donothing(2, test.get(ISOChronology.getInstance().yearOfCentury()));
NoAssert.donothing(2002, test.get(ISOChronology.getInstance().yearOfEra()));
        assertEquals(2002, test.get(ISOChronology.getInstance().year()));
NoAssert.donothing(6, test.get(ISOChronology.getInstance().monthOfYear()));
NoAssert.donothing(9, test.get(ISOChronology.getInstance().dayOfMonth()));
NoAssert.donothing(2002, test.get(ISOChronology.getInstance().weekyear()));
NoAssert.donothing(23, test.get(ISOChronology.getInstance().weekOfWeekyear()));
NoAssert.donothing(7, test.get(ISOChronology.getInstance().dayOfWeek()));
NoAssert.donothing(160, test.get(ISOChronology.getInstance().dayOfYear()));
NoAssert.donothing(0, test.get(ISOChronology.getInstance().halfdayOfDay()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().hourOfHalfday()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().clockhourOfDay()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().clockhourOfHalfday()));
NoAssert.donothing(1, test.get(ISOChronology.getInstance().hourOfDay()));
NoAssert.donothing(0, test.get(ISOChronology.getInstance().minuteOfHour()));
NoAssert.donothing(60, test.get(ISOChronology.getInstance().minuteOfDay()));
        assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute()));
NoAssert.donothing(60 * 60, test.get(ISOChronology.getInstance().secondOfDay()));
NoAssert.donothing(0, test.get(ISOChronology.getInstance().millisOfSecond()));
NoAssert.donothing(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay()));
        try {
            test.get((DateTimeField) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testGet_DateTimeFieldType() {
        MutableDateTime test = new MutableDateTime();
NoAssert.donothing(1, test.get(DateTimeFieldType.era()));
NoAssert.donothing(20, test.get(DateTimeFieldType.centuryOfEra()));
NoAssert.donothing(2, test.get(DateTimeFieldType.yearOfCentury()));
NoAssert.donothing(2002, test.get(DateTimeFieldType.yearOfEra()));
NoAssert.donothing(2002, test.get(DateTimeFieldType.year()));
NoAssert.donothing(6, test.get(DateTimeFieldType.monthOfYear()));
NoAssert.donothing(9, test.get(DateTimeFieldType.dayOfMonth()));
NoAssert.donothing(2002, test.get(DateTimeFieldType.weekyear()));
        assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
NoAssert.donothing(7, test.get(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(160, test.get(DateTimeFieldType.dayOfYear()));
NoAssert.donothing(0, test.get(DateTimeFieldType.halfdayOfDay()));
NoAssert.donothing(1, test.get(DateTimeFieldType.hourOfHalfday()));
        assertEquals(1, test.get(DateTimeFieldType.clockhourOfDay()));
NoAssert.donothing(1, test.get(DateTimeFieldType.clockhourOfHalfday()));
NoAssert.donothing(1, test.get(DateTimeFieldType.hourOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.minuteOfHour()));
        assertEquals(60, test.get(DateTimeFieldType.minuteOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(60 * 60, test.get(DateTimeFieldType.secondOfDay()));
NoAssert.donothing(0, test.get(DateTimeFieldType.millisOfSecond()));
NoAssert.donothing(60 * 60 * 1000, test.get(DateTimeFieldType.millisOfDay()));
        try {
            test.get((DateTimeFieldType) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testGetMethods() {
        MutableDateTime test = new MutableDateTime();
        
NoAssert.donothing(ISOChronology.getInstance(), test.getChronology());
NoAssert.donothing(LONDON, test.getZone());
NoAssert.donothing(TEST_TIME_NOW, test.getMillis());
        
NoAssert.donothing(1, test.getEra());
NoAssert.donothing(20, test.getCenturyOfEra());
NoAssert.donothing(2, test.getYearOfCentury());
NoAssert.donothing(2002, test.getYearOfEra());
NoAssert.donothing(2002, test.getYear());
NoAssert.donothing(6, test.getMonthOfYear());
NoAssert.donothing(9, test.getDayOfMonth());
NoAssert.donothing(2002, test.getWeekyear());
NoAssert.donothing(23, test.getWeekOfWeekyear());
NoAssert.donothing(7, test.getDayOfWeek());
NoAssert.donothing(160, test.getDayOfYear());
NoAssert.donothing(1, test.getHourOfDay());
NoAssert.donothing(0, test.getMinuteOfHour());
NoAssert.donothing(60, test.getMinuteOfDay());
NoAssert.donothing(0, test.getSecondOfMinute());
        assertEquals(60 * 60, test.getSecondOfDay());
NoAssert.donothing(0, test.getMillisOfSecond());
NoAssert.donothing(60 * 60 * 1000, test.getMillisOfDay());
    }

    @Test public void testEqualsHashCode() {
        MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        MutableDateTime test2 = new MutableDateTime(TEST_TIME1);
NoAssert.donothing(true, test1.equals(test2));
NoAssert.donothing(true, test2.equals(test1));
NoAssert.donothing(true, test1.equals(test1));
NoAssert.donothing(true, test2.equals(test2));
NoAssert.donothing(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
        assertEquals(true, test2.hashCode() == test2.hashCode());
        
        MutableDateTime test3 = new MutableDateTime(TEST_TIME2);
NoAssert.donothing(false, test1.equals(test3));
NoAssert.donothing(false, test2.equals(test3));
NoAssert.donothing(false, test3.equals(test1));
NoAssert.donothing(false, test3.equals(test2));
NoAssert.donothing(false, test1.hashCode() == test3.hashCode());
NoAssert.donothing(false, test2.hashCode() == test3.hashCode());
        
        DateTime test4 = new DateTime(TEST_TIME2);
NoAssert.donothing(true, test4.equals(test3));
NoAssert.donothing(true, test3.equals(test4));
NoAssert.donothing(false, test4.equals(test1));
        assertEquals(false, test1.equals(test4));
NoAssert.donothing(true, test3.hashCode() == test4.hashCode());
NoAssert.donothing(false, test1.hashCode() == test4.hashCode());
        
        MutableDateTime test5 = new MutableDateTime(TEST_TIME2);
        test5.setRounding(ISOChronology.getInstance().millisOfSecond());
        assertEquals(true, test5.equals(test3));
NoAssert.donothing(true, test5.equals(test4));
        assertEquals(true, test3.equals(test5));
NoAssert.donothing(true, test4.equals(test5));
NoAssert.donothing(true, test3.hashCode() == test5.hashCode());
NoAssert.donothing(true, test4.hashCode() == test5.hashCode());
        
NoAssert.donothing(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockInstant()));
NoAssert.donothing(false, test1.equals(new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance())));
NoAssert.donothing(true, new MutableDateTime(TEST_TIME1, new MockEqualsChronology()).equals(new MutableDateTime(TEST_TIME1, new MockEqualsChronology())));
NoAssert.donothing(false, new MutableDateTime(TEST_TIME1, new MockEqualsChronology()).equals(new MutableDateTime(TEST_TIME1, ISOChronology.getInstance())));
    }
    
    class MockInstant extends AbstractInstant {
        public String toString() {
            return null;
        }
        public long getMillis() {
            return TEST_TIME1;
        }
        public Chronology getChronology() {
            return ISOChronology.getInstance();
        }
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {
            return obj instanceof MockEqualsChronology;
        }
        public DateTimeZone getZone() {
            return null;
        }
        public Chronology withUTC() {
            return this;
        }
        public Chronology withZone(DateTimeZone zone) {
            return this;
        }
        public String toString() {
            return "";
        }
    }

    @Test public void testCompareTo() {
        MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
NoAssert.donothing(0, test1.compareTo(test1a));
NoAssert.donothing(0, test1a.compareTo(test1));
NoAssert.donothing(0, test1.compareTo(test1));
NoAssert.donothing(0, test1a.compareTo(test1a));
        
        MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
NoAssert.donothing(-1, test1.compareTo(test2));
        assertEquals(+1, test2.compareTo(test1));
        
        MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
NoAssert.donothing(-1, test1.compareTo(test3));
NoAssert.donothing(+1, test3.compareTo(test1));
NoAssert.donothing(0, test3.compareTo(test2));
        
NoAssert.donothing(+1, test2.compareTo(new MockInstant()));
        assertEquals(0, test1.compareTo(new MockInstant()));
        
        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }
    
    @Test public void testIsEqual() {
        MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
NoAssert.donothing(true, test1.isEqual(test1a));
NoAssert.donothing(true, test1a.isEqual(test1));
NoAssert.donothing(true, test1.isEqual(test1));
NoAssert.donothing(true, test1a.isEqual(test1a));
        
        MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
NoAssert.donothing(false, test1.isEqual(test2));
NoAssert.donothing(false, test2.isEqual(test1));
        
        MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
NoAssert.donothing(false, test1.isEqual(test3));
NoAssert.donothing(false, test3.isEqual(test1));
NoAssert.donothing(true, test3.isEqual(test2));
        
NoAssert.donothing(false, test2.isEqual(new MockInstant()));
NoAssert.donothing(true, test1.isEqual(new MockInstant()));
        
NoAssert.donothing(false, new MutableDateTime(TEST_TIME_NOW + 1).isEqual(null));
NoAssert.donothing(true, new MutableDateTime(TEST_TIME_NOW).isEqual(null));
NoAssert.donothing(false, new MutableDateTime(TEST_TIME_NOW - 1).isEqual(null));
    }
    
    @Test public void testIsBefore() {
        MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
NoAssert.donothing(false, test1.isBefore(test1a));
NoAssert.donothing(false, test1a.isBefore(test1));
NoAssert.donothing(false, test1.isBefore(test1));
        assertEquals(false, test1a.isBefore(test1a));
        
        MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
NoAssert.donothing(true, test1.isBefore(test2));
NoAssert.donothing(false, test2.isBefore(test1));
        
        MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
NoAssert.donothing(true, test1.isBefore(test3));
NoAssert.donothing(false, test3.isBefore(test1));
NoAssert.donothing(false, test3.isBefore(test2));
        
NoAssert.donothing(false, test2.isBefore(new MockInstant()));
NoAssert.donothing(false, test1.isBefore(new MockInstant()));
        
NoAssert.donothing(false, new MutableDateTime(TEST_TIME_NOW + 1).isBefore(null));
        assertEquals(false, new MutableDateTime(TEST_TIME_NOW).isBefore(null));
        assertEquals(true, new MutableDateTime(TEST_TIME_NOW - 1).isBefore(null));
    }
    
    @Test public void testIsAfter() {
        MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
NoAssert.donothing(false, test1.isAfter(test1a));
NoAssert.donothing(false, test1a.isAfter(test1));
        assertEquals(false, test1.isAfter(test1));
NoAssert.donothing(false, test1a.isAfter(test1a));
        
        MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
NoAssert.donothing(false, test1.isAfter(test2));
NoAssert.donothing(true, test2.isAfter(test1));
        
        MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        assertEquals(false, test1.isAfter(test3));
NoAssert.donothing(true, test3.isAfter(test1));
NoAssert.donothing(false, test3.isAfter(test2));
        
NoAssert.donothing(true, test2.isAfter(new MockInstant()));
NoAssert.donothing(false, test1.isAfter(new MockInstant()));
        
NoAssert.donothing(true, new MutableDateTime(TEST_TIME_NOW + 1).isAfter(null));
NoAssert.donothing(false, new MutableDateTime(TEST_TIME_NOW).isAfter(null));
        assertEquals(false, new MutableDateTime(TEST_TIME_NOW - 1).isAfter(null));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        MutableDateTime result = (MutableDateTime) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testToString() {
        MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(TEST_TIME_NOW, PARIS);
NoAssert.donothing("2002-06-09T02:00:00.000+02:00", test.toString());
    }

    @Test public void testToString_String() {
        MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
NoAssert.donothing("2002 01", test.toString("yyyy HH"));
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString((String) null));
    }

    @Test public void testToString_String_String() {
        MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
NoAssert.donothing("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
NoAssert.donothing("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
NoAssert.donothing("Sun 9/6", test.toString("EEE d/M", null));
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString(null, null));
    }

    @Test public void testToString_DTFormatter() {
        MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
NoAssert.donothing("2002 01", test.toString(DateTimeFormat.forPattern("yyyy HH")));
NoAssert.donothing("2002-06-09T01:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToInstant() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        Instant result = test.toInstant();
NoAssert.donothing(TEST_TIME1, result.getMillis());
    }

    @Test public void testToDateTime() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        DateTime result = test.toDateTime();
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), result.getChronology());
    }

    @Test public void testToDateTimeISO() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        DateTime result = test.toDateTimeISO();
NoAssert.donothing(DateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
        assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
    }

    @Test public void testToDateTime_DateTimeZone() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(LONDON);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(test.getChronology(), result.getChronology());
NoAssert.donothing(LONDON, result.getZone());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime(PARIS);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(PARIS, result.getZone());

        test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
        assertEquals(GregorianChronology.getInstance(LONDON), result.getChronology());

        test = new MutableDateTime(TEST_TIME1, PARIS);
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(LONDON, result.getZone());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
        assertEquals(LONDON, result.getZone());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToDateTime_Chronology() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GregorianChronology.getInstance(PARIS), result.getChronology());

        test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        result = test.toMutableDateTime((Chronology) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
        assertEquals(ISOChronology.getInstance(), result.getChronology());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime((Chronology) null);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToMutableDateTime() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        MutableDateTime result = test.toMutableDateTime();
NoAssert.donothing(test != result);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), result.getChronology());
    }

    @Test public void testToMutableDateTimeISO() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        MutableDateTime result = test.toMutableDateTimeISO();
NoAssert.donothing(MutableDateTime.class, result.getClass());
NoAssert.donothing(ISOChronology.class, result.getChronology().getClass());
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), result.getChronology());
        assertNotSame(test, result);
    }

    @Test public void testToMutableDateTime_DateTimeZone() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(LONDON);
NoAssert.donothing(test != result);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(LONDON), result.getChronology());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime(PARIS);
NoAssert.donothing(test != result);
        assertEquals(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(PARIS), result.getChronology());

        test = new MutableDateTime(TEST_TIME1, PARIS);
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test != result);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime((DateTimeZone) null);
NoAssert.donothing(test != result);
        assertEquals(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToMutableDateTime_Chronology() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
NoAssert.donothing(test != result);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
NoAssert.donothing(test != result);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(GregorianChronology.getInstance(PARIS), result.getChronology());

        test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        result = test.toMutableDateTime((Chronology) null);
NoAssert.donothing(test != result);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());

        test = new MutableDateTime(TEST_TIME1);
        result = test.toMutableDateTime((Chronology) null);
NoAssert.donothing(test != result);
NoAssert.donothing(test.getMillis(), result.getMillis());
NoAssert.donothing(ISOChronology.getInstance(), result.getChronology());
    }

    @Test public void testToDate() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        Date result = test.toDate();
NoAssert.donothing(test.getMillis(), result.getTime());
    }

    @Test public void testToCalendar_Locale() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        Calendar result = test.toCalendar(null);
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        test = new MutableDateTime(TEST_TIME1, PARIS);
        result = test.toCalendar(null);
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        test = new MutableDateTime(TEST_TIME1, PARIS);
        result = test.toCalendar(Locale.UK);
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }

    @Test public void testToGregorianCalendar() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        GregorianCalendar result = test.toGregorianCalendar();
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        test = new MutableDateTime(TEST_TIME1, PARIS);
        result = test.toGregorianCalendar();
NoAssert.donothing(test.getMillis(), result.getTime().getTime());
NoAssert.donothing(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }

    @Test public void testClone() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        MutableDateTime result = (MutableDateTime) test.clone();
NoAssert.donothing(true, test.equals(result));
NoAssert.donothing(true, test != result);
    }

    @Test public void testCopy() {
        MutableDateTime test = new MutableDateTime(TEST_TIME1);
        MutableDateTime result = test.copy();
NoAssert.donothing(true, test.equals(result));
NoAssert.donothing(true, test != result);
    }

    @Test public void testRounding1() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setRounding(ISOChronology.getInstance().hourOfDay());
NoAssert.donothing("2002-06-09T05:00:00.000+01:00", test.toString());
NoAssert.donothing(MutableDateTime.ROUND_FLOOR, test.getRoundingMode());
NoAssert.donothing(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
    }

    @Test public void testRounding2() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING);
NoAssert.donothing("2002-06-09T06:00:00.000+01:00", test.toString());
NoAssert.donothing(MutableDateTime.ROUND_CEILING, test.getRoundingMode());
        assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
    }

    @Test public void testRounding3() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING);
NoAssert.donothing("2002-06-09T05:00:00.000+01:00", test.toString());
NoAssert.donothing(MutableDateTime.ROUND_HALF_CEILING, test.getRoundingMode());
NoAssert.donothing(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING);
NoAssert.donothing("2002-06-09T06:00:00.000+01:00", test.toString());
    }

    @Test public void testRounding4() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR);
NoAssert.donothing("2002-06-09T05:00:00.000+01:00", test.toString());
NoAssert.donothing(MutableDateTime.ROUND_HALF_FLOOR, test.getRoundingMode());
NoAssert.donothing(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR);
NoAssert.donothing("2002-06-09T05:00:00.000+01:00", test.toString());
    }

    @Test public void testRounding5() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
NoAssert.donothing("2002-06-09T05:00:00.000+01:00", test.toString());
        assertEquals(MutableDateTime.ROUND_HALF_EVEN, test.getRoundingMode());
        assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
NoAssert.donothing("2002-06-09T06:00:00.000+01:00", test.toString());
        
        test = new MutableDateTime(2002, 6, 9, 4, 30, 0, 0);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
NoAssert.donothing("2002-06-09T04:00:00.000+01:00", test.toString());
    }

    @Test public void testRounding6() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE);
NoAssert.donothing("2002-06-09T05:06:07.008+01:00", test.toString());
NoAssert.donothing(MutableDateTime.ROUND_NONE, test.getRoundingMode());
NoAssert.donothing(null, test.getRoundingField());
    }

    @Test public void testRounding7() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        try {
            test.setRounding(ISOChronology.getInstance().hourOfDay(), -1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testRounding8() {
        MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
NoAssert.donothing(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        assertEquals(null, test.getRoundingField());
        
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING);
NoAssert.donothing(MutableDateTime.ROUND_CEILING, test.getRoundingMode());
NoAssert.donothing(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE);
NoAssert.donothing(MutableDateTime.ROUND_NONE, test.getRoundingMode());
NoAssert.donothing(null, test.getRoundingField());
        
        test.setRounding(null, -1);
NoAssert.donothing(MutableDateTime.ROUND_NONE, test.getRoundingMode());
NoAssert.donothing(null, test.getRoundingField());
        
        test.setRounding(ISOChronology.getInstance().hourOfDay());
NoAssert.donothing(MutableDateTime.ROUND_FLOOR, test.getRoundingMode());
NoAssert.donothing(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
        
        test.setRounding(null);
NoAssert.donothing(MutableDateTime.ROUND_NONE, test.getRoundingMode());
NoAssert.donothing(null, test.getRoundingField());
    }

    //-----------------------------------------------------------------------
    @Test public void testProperty() {
        MutableDateTime test = new MutableDateTime();
NoAssert.donothing(test.year(), test.property(DateTimeFieldType.year()));
NoAssert.donothing(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
NoAssert.donothing(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
NoAssert.donothing(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;
            public DurationFieldType getDurationType() {
                return DurationFieldType.weeks();
            }
            public DurationFieldType getRangeDurationType() {
                return null;
            }
            public DateTimeField getField(Chronology chronology) {
                return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }
        };
        try {
            test.property(bad);
            fail();
        } catch (IllegalArgumentException ex) {}
        try {
            test.property(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

}
