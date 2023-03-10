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
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.chrono.ISOChronology;
/**
 * This class is a Junit unit test for the
 * org.joda.time.DateTimeComparator class.
 *
 * @author Guy Allard
 */
public class TestDateTimeComparator  { //extends TestCase {

    private static final Chronology ISO = ISOChronology.getInstance();
    
    public static void main(String[] args) throws Exception  {
        TestDateTimeComparator TB= new TestDateTimeComparator();
        TB.setUp(); TB.testClass(); TB.tearDown();
        TB.setUp(); TB.testStaticGetInstance(); TB.tearDown();
        TB.setUp(); TB.testStaticGetDateOnlyInstance(); TB.tearDown();
        TB.setUp(); TB.testStaticGetTimeOnlyInstance(); TB.tearDown();
        TB.setUp(); TB.testStaticGetInstanceLower(); TB.tearDown();
        TB.setUp(); TB.testStaticGetInstanceLowerUpper(); TB.tearDown();
        TB.setUp(); TB.testNullNowCheckedOnce(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testSerialization1(); TB.tearDown();
        TB.setUp(); TB.testSerialization2(); TB.tearDown();
        TB.setUp(); TB.testBasicComps1(); TB.tearDown();
        TB.setUp(); TB.testBasicComps2(); TB.tearDown();
        TB.setUp(); TB.testBasicComps3(); TB.tearDown();
        TB.setUp(); TB.testBasicComps4(); TB.tearDown();
        TB.setUp(); TB.testBasicComps5(); TB.tearDown();
        TB.setUp(); TB.testMillis(); TB.tearDown();
        TB.setUp(); TB.testSecond(); TB.tearDown();
        TB.setUp(); TB.testMinute(); TB.tearDown();
        TB.setUp(); TB.testHour(); TB.tearDown();
        TB.setUp(); TB.testDOW(); TB.tearDown();
        TB.setUp(); TB.testDOM(); TB.tearDown();
        TB.setUp(); TB.testDOY(); TB.tearDown();
        TB.setUp(); TB.testWOW(); TB.tearDown();
        TB.setUp(); TB.testWOYY(); TB.tearDown();
        TB.setUp(); TB.testMonth(); TB.tearDown();
        TB.setUp(); TB.testYear(); TB.tearDown();
        TB.setUp(); TB.testListBasic(); TB.tearDown();
        TB.setUp(); TB.testListMillis(); TB.tearDown();
        TB.setUp(); TB.testListSecond(); TB.tearDown();
        TB.setUp(); TB.testListMinute(); TB.tearDown();
        TB.setUp(); TB.testListHour(); TB.tearDown();
        TB.setUp(); TB.testListDOW(); TB.tearDown();
        TB.setUp(); TB.testListDOM(); TB.tearDown();
        TB.setUp(); TB.testListDOY(); TB.tearDown();
        TB.setUp(); TB.testListWOW(); TB.tearDown();
        TB.setUp(); TB.testListYOYY(); TB.tearDown();
        TB.setUp(); TB.testListMonth(); TB.tearDown();
        TB.setUp(); TB.testListYear(); TB.tearDown();
        TB.setUp(); TB.testListDate(); TB.tearDown();
        TB.setUp(); TB.testListTime(); TB.tearDown();
        TB.setUp(); TB.testNullDT(); TB.tearDown();
        TB.setUp(); TB.testInvalidObj(); TB.tearDown();

    }

    /*

    public static TestSuite suite() {
        return new TestSuite(TestDateTimeComparator.class);
    }

    public TestDateTimeComparator(String name) {
        super(name);
    }

     */

    /**
     * A reference to a DateTime object.
     */
    DateTime aDateTime = null;
    /**
     * A reference to a DateTime object.
     */
    DateTime bDateTime = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for millis of seconds.
     */
    Comparator cMillis = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for seconds.
     */
    Comparator cSecond = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for minutes.
     */
    Comparator cMinute = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for hours.
     */
    Comparator cHour = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the week.
     */
    Comparator cDayOfWeek = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the month.
     */
    Comparator cDayOfMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the year.
     */
    Comparator cDayOfYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for week of the weekyear.
     */
    Comparator cWeekOfWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year given a week of the year.
     */
    Comparator cWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for months.
     */
    Comparator cMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year.
     */
    Comparator cYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the date portion of an
     * object.
     */
    Comparator cDate = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the time portion of an
     * object.
     */
    Comparator cTime = null;
    /**
     * Junit <code>setUp()</code> method.
     */
    @Before
    public void setUp() /* throws Exception */ {
        Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        cDate = DateTimeComparator.getDateOnlyInstance();
        cTime = DateTimeComparator.getTimeOnlyInstance();
    }

    /**
     * Junit <code>tearDown()</code> method.
     */
    @After public void tearDown() /* throws Exception */ {
        // super.tearDown();
        aDateTime = null;
        bDateTime = null;
        //
        cMillis = null;
        cSecond = null;
        cMinute = null;
        cHour = null;
        cDayOfWeek = null;
        cDayOfMonth = null;
        cDayOfYear = null;
        cWeekOfWeekyear = null;
        cWeekyear = null;
        cMonth = null;
        cYear = null;
        cDate = null;
        cTime = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testClass() {
NoAssert.donothing(true, Modifier.isPublic(DateTimeComparator.class.getModifiers()));
NoAssert.donothing(false, Modifier.isFinal(DateTimeComparator.class.getModifiers()));
NoAssert.donothing(1, DateTimeComparator.class.getDeclaredConstructors().length);
NoAssert.donothing(true, Modifier.isProtected(DateTimeComparator.class.getDeclaredConstructors()[0].getModifiers()));
    }
    
    //-----------------------------------------------------------------------
    @Test public void testStaticGetInstance() {
        DateTimeComparator c = DateTimeComparator.getInstance();
NoAssert.donothing(null, c.getLowerLimit());
NoAssert.donothing(null, c.getUpperLimit());
NoAssert.donothing("DateTimeComparator[]", c.toString());
    }        
    @Test public void testStaticGetDateOnlyInstance() {
        DateTimeComparator c = DateTimeComparator.getDateOnlyInstance();
NoAssert.donothing(DateTimeFieldType.dayOfYear(), c.getLowerLimit());
NoAssert.donothing(null, c.getUpperLimit());
NoAssert.donothing("DateTimeComparator[dayOfYear-]", c.toString());
        
NoAssert.donothing(DateTimeComparator.getDateOnlyInstance(), DateTimeComparator.getDateOnlyInstance());
    }
    @Test public void testStaticGetTimeOnlyInstance() {
        DateTimeComparator c = DateTimeComparator.getTimeOnlyInstance();
NoAssert.donothing(null, c.getLowerLimit());
NoAssert.donothing(DateTimeFieldType.dayOfYear(), c.getUpperLimit());
NoAssert.donothing("DateTimeComparator[-dayOfYear]", c.toString());
        
NoAssert.donothing(DateTimeComparator.getTimeOnlyInstance(), DateTimeComparator.getTimeOnlyInstance());
    }
    @Test public void testStaticGetInstanceLower() {
        DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay());
NoAssert.donothing(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
NoAssert.donothing(null, c.getUpperLimit());
NoAssert.donothing("DateTimeComparator[hourOfDay-]", c.toString());
        
        c = DateTimeComparator.getInstance(null);
NoAssert.donothing(DateTimeComparator.getInstance(), c);
    }

    @Test public void testStaticGetInstanceLowerUpper() {
        DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
NoAssert.donothing(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
NoAssert.donothing(DateTimeFieldType.dayOfYear(), c.getUpperLimit());
NoAssert.donothing("DateTimeComparator[hourOfDay-dayOfYear]", c.toString());
        
        c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay());
NoAssert.donothing(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
NoAssert.donothing(DateTimeFieldType.hourOfDay(), c.getUpperLimit());
NoAssert.donothing("DateTimeComparator[hourOfDay]", c.toString());
        
        c = DateTimeComparator.getInstance(null, null);
NoAssert.donothing(DateTimeComparator.getInstance(), c);
        
        c = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null);
NoAssert.donothing(DateTimeComparator.getDateOnlyInstance(), c);
        
        c = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear());
NoAssert.donothing(DateTimeComparator.getTimeOnlyInstance(), c);
    }
    
    @Test public void testNullNowCheckedOnce() {
        // checks a race condition against the system clock, issue #404
        for (int i = 0; i < 10000; i++) {
            if (DateTimeComparator.getInstance().compare(null, null) != 0) {
                fail("Comparing (null, null) should always return 0");
            }
        }
    }
    
    //-----------------------------------------------------------------------
    @Test public void testEqualsHashCode() {
        DateTimeComparator c1 = DateTimeComparator.getInstance();
NoAssert.donothing(true, c1.equals(c1));
NoAssert.donothing(false, c1.equals(null));
NoAssert.donothing(true, c1.hashCode() == c1.hashCode());
        
        DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance();
NoAssert.donothing(true, c2.equals(c2));
NoAssert.donothing(false, c2.equals(c1));
NoAssert.donothing(false, c1.equals(c2));
NoAssert.donothing(false, c2.equals(null));
NoAssert.donothing(false, c1.hashCode() == c2.hashCode());
        
        DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance();
NoAssert.donothing(true, c3.equals(c3));
NoAssert.donothing(false, c3.equals(c1));
NoAssert.donothing(true, c3.equals(c2));
NoAssert.donothing(false, c1.equals(c3));
NoAssert.donothing(true, c2.equals(c3));
NoAssert.donothing(false, c1.hashCode() == c3.hashCode());
NoAssert.donothing(true, c2.hashCode() == c3.hashCode());
        
        DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance();
NoAssert.donothing(false, c4.hashCode() == c3.hashCode());
    }
    
    //-----------------------------------------------------------------------
    @Test public void testSerialization1() throws Exception {
        DateTimeField f = ISO.dayOfYear();
        f.toString();
        DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(c);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeComparator result = (DateTimeComparator) ois.readObject();
        ois.close();
        
NoAssert.donothing(c, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization2() throws Exception {
        DateTimeComparator c = DateTimeComparator.getInstance();
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(c);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeComparator result = (DateTimeComparator) ois.readObject();
        ois.close();
        
NoAssert.donothing(c, result);
    }

    //-----------------------------------------------------------------------
    /**
     * Test all basic comparator operation with DateTime objects.
     */
    @Test public void testBasicComps1() {
        aDateTime = new DateTime( System.currentTimeMillis(), DateTimeZone.UTC );
        bDateTime = new DateTime( aDateTime.getMillis(), DateTimeZone.UTC );
NoAssert.donothing( "getMillis", aDateTime.getMillis(),
            bDateTime.getMillis() );
NoAssert.donothing( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }   // end of testBasicComps


    /**
     * Test all basic comparator operation with ReadableInstant objects.
     */
    @Test public void testBasicComps2() {
        ReadableInstant aDateTime = new DateTime( System.currentTimeMillis(), DateTimeZone.UTC );
        ReadableInstant bDateTime = new DateTime( aDateTime.getMillis(), DateTimeZone.UTC );
NoAssert.donothing( "getMillis", aDateTime.getMillis(),
            bDateTime.getMillis() );
NoAssert.donothing( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }   // end of testBasicComps

    /**
     * Test all basic comparator operation with java Date objects.
     */
    @Test public void testBasicComps3() {
        Date aDateTime
            = new Date( System.currentTimeMillis() );
        Date bDateTime
            = new Date( aDateTime.getTime() );
NoAssert.donothing( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }   // end of testBasicComps

    /**
     * Test all basic comparator operation with Long objects.
     */
    @Test public void testBasicComps4() {
        Long aDateTime
            = new Long( System.currentTimeMillis() );
        Long bDateTime
            = new Long( aDateTime.longValue() );
NoAssert.donothing( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }   // end of testBasicComps

    /**
     * Test all basic comparator operation with Calendar objects.
     */
    @Test public void testBasicComps5() {
        Calendar aDateTime
            = Calendar.getInstance();   // right now
        Calendar bDateTime = aDateTime;
NoAssert.donothing( "MILLIS", 0, cMillis.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "SECOND", 0, cSecond.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MINUTE", 0, cMinute.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HOUR", 0, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOW", 0, cDayOfWeek.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOM", 0, cDayOfMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOY", 0, cDayOfYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WOW", 0, cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WY", 0, cWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MONTH", 0, cMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEAR", 0, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DATE", 0, cDate.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "TIME", 0, cTime.compare( aDateTime, bDateTime ) );
    }   // end of testBasicComps


    /**
     * Test unequal comparisons with millis of second comparators.
     */
    @Test public void testMillis() {
        aDateTime = new DateTime( System.currentTimeMillis(), DateTimeZone.UTC );
        bDateTime = new DateTime( aDateTime.getMillis() + 1, DateTimeZone.UTC );
NoAssert.donothing( "MillisM1", -1, cMillis.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MillisP1", 1, cMillis.compare( bDateTime, aDateTime ) );
    }   // end of testMillis

    /**
     * Test unequal comparisons with second comparators.
     */
    @Test public void testSecond() {
        aDateTime = getADate( "1969-12-31T23:59:58" );
        bDateTime = getADate( "1969-12-31T23:50:59" );
NoAssert.donothing( "SecondM1a", -1, cSecond.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "SecondP1a", 1, cSecond.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "1970-01-01T00:00:00" );
        bDateTime = getADate( "1970-01-01T00:00:01" );
NoAssert.donothing( "SecondM1b", -1, cSecond.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "SecondP1b", 1, cSecond.compare( bDateTime, aDateTime ) );
    }   // end of testSecond

    /**
     * Test unequal comparisons with minute comparators.
     */
    @Test public void testMinute() {
        aDateTime = getADate( "1969-12-31T23:58:00" );
        bDateTime = getADate( "1969-12-31T23:59:00" );
NoAssert.donothing( "MinuteM1a", -1, cMinute.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MinuteP1a", 1, cMinute.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "1970-01-01T00:00:00" );
        bDateTime = getADate( "1970-01-01T00:01:00" );
NoAssert.donothing( "MinuteM1b", -1, cMinute.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MinuteP1b", 1, cMinute.compare( bDateTime, aDateTime ) );
    }   // end of testMinute

    /**
     * Test unequal comparisons with hour comparators.
     */
    @Test public void testHour() {
        aDateTime = getADate( "1969-12-31T22:00:00" );
        bDateTime = getADate( "1969-12-31T23:00:00" );
NoAssert.donothing( "HourM1a", -1, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HourP1a", 1, cHour.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "1970-01-01T00:00:00" );
        bDateTime = getADate( "1970-01-01T01:00:00" );
NoAssert.donothing( "HourM1b", -1, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HourP1b", 1, cHour.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "1969-12-31T23:59:59" );
        bDateTime = getADate( "1970-01-01T00:00:00" );
NoAssert.donothing( "HourP1c", 1, cHour.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "HourM1c", -1, cHour.compare( bDateTime, aDateTime ) );
    }   // end of testHour

    /**
     * Test unequal comparisons with day of week comparators.
     */
    @Test public void testDOW() {
        /*
         * Dates chosen when I wrote the code, so I know what day of
         * the week it is.
         */
        aDateTime = getADate( "2002-04-12T00:00:00" );
        bDateTime = getADate( "2002-04-13T00:00:00" );
NoAssert.donothing( "DOWM1a", -1, cDayOfWeek.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOWP1a", 1, cDayOfWeek.compare( bDateTime, aDateTime ) );
    }   // end of testDOW

    /**
     * Test unequal comparisons with day of month comparators.
     */
    @Test public void testDOM() {
        aDateTime = getADate( "2002-04-12T00:00:00" );
        bDateTime = getADate( "2002-04-13T00:00:00" );
NoAssert.donothing( "DOMM1a", -1, cDayOfMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOMP1a", 1, cDayOfMonth.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "2000-12-01T00:00:00" );
        bDateTime = getADate( "1814-04-30T00:00:00" );
NoAssert.donothing( "DOMM1b", -1, cDayOfMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOMP1b", 1, cDayOfMonth.compare( bDateTime, aDateTime ) );
    }   // end of testDOM

    /**
     * Test unequal comparisons with day of year comparators.
     */
    @Test public void testDOY() {
        aDateTime = getADate( "2002-04-12T00:00:00" );
        bDateTime = getADate( "2002-04-13T00:00:00" );
NoAssert.donothing( "DOYM1a", -1, cDayOfYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOYP1a", 1, cDayOfYear.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "2000-02-29T00:00:00" );
        bDateTime = getADate( "1814-11-30T00:00:00" );
NoAssert.donothing( "DOYM1b", -1, cDayOfYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "DOYP1b", 1, cDayOfYear.compare( bDateTime, aDateTime ) );
    }   // end of testDOY

    /**
     * Test unequal comparisons with week of weekyear comparators.
     */
    @Test public void testWOW() {
        // 1st week of year contains Jan 04.
        aDateTime = getADate( "2000-01-04T00:00:00" );
        bDateTime = getADate( "2000-01-11T00:00:00" );
NoAssert.donothing( "WOWM1a", -1,
            cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WOWP1a", 1,
            cWeekOfWeekyear.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "2000-01-04T00:00:00" );
        bDateTime = getADate( "1999-12-31T00:00:00" );
NoAssert.donothing( "WOWM1b", -1,
            cWeekOfWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "WOWP1b", 1,
            cWeekOfWeekyear.compare( bDateTime, aDateTime ) );
    }   // end of testMillis

    /**
     * Test unequal comparisons with year given the week comparators.
     */
    @Test public void testWOYY() {
        // How do I test the end conditions of this?
        // Don't understand ......
        aDateTime = getADate( "1998-12-31T23:59:59" );
        bDateTime = getADate( "1999-01-01T00:00:00" );
NoAssert.donothing( "YOYYZ", 0, cWeekyear.compare( aDateTime, bDateTime ) );
        bDateTime = getADate( "1999-01-04T00:00:00" );
NoAssert.donothing( "YOYYM1", -1, cWeekyear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YOYYP1", 1, cWeekyear.compare( bDateTime, aDateTime ) );
    }   // end of testWOYY

    /**
     * Test unequal comparisons with month comparators.
     */
    @Test public void testMonth() {
        aDateTime = getADate( "2002-04-30T00:00:00" );
        bDateTime = getADate( "2002-05-01T00:00:00" );
NoAssert.donothing( "MONTHM1a", -1, cMonth.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "MONTHP1a", 1, cMonth.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "1900-01-01T00:00:00" );
        bDateTime = getADate( "1899-12-31T00:00:00" );
NoAssert.donothing( "MONTHM1b", -1, cMonth.compare( aDateTime, bDateTime ) );
        assertEquals( "MONTHP1b", 1, cMonth.compare( bDateTime, aDateTime ) );
    }   // end of testMonth

    /**
     * Test unequal comparisons with year comparators.
     */
    @Test public void testYear() {
        aDateTime = getADate( "2000-01-01T00:00:00" );
        bDateTime = getADate( "2001-01-01T00:00:00" );
NoAssert.donothing( "YEARM1a", -1, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEARP1a", 1, cYear.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "1968-12-31T23:59:59" );
        bDateTime = getADate( "1970-01-01T00:00:00" );
NoAssert.donothing( "YEARM1b", -1, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEARP1b", 1, cYear.compare( bDateTime, aDateTime ) );
        aDateTime = getADate( "1969-12-31T23:59:59" );
        bDateTime = getADate( "1970-01-01T00:00:00" );
NoAssert.donothing( "YEARM1c", -1, cYear.compare( aDateTime, bDateTime ) );
NoAssert.donothing( "YEARP1c", 1, cYear.compare( bDateTime, aDateTime ) );
    }   // end of testYear

    /*
     * 'List' processing tests follow.
     */

     /**
      * Test sorting with full default comparator.
      */
     @Test public void testListBasic() {
        String[] dtStrs = {
            "1999-02-01T00:00:00",
            "1998-01-20T00:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListBasic", !isSorted1, isSorted2);
     } // end of testListBasic

     /**
      * Test sorting with millis of second comparator.
      */
    @Test public void testListMillis() {
        //
        List sl = new ArrayList();
        long base = 12345L * 1000L;
        sl.add( new DateTime( base + 999L, DateTimeZone.UTC ) );
        sl.add( new DateTime( base + 222L, DateTimeZone.UTC ) );
        sl.add( new DateTime( base + 456L, DateTimeZone.UTC ) );
        sl.add( new DateTime( base + 888L, DateTimeZone.UTC ) );
        sl.add( new DateTime( base + 123L, DateTimeZone.UTC ) );
        sl.add( new DateTime( base + 000L, DateTimeZone.UTC ) );
        //
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cMillis );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListLillis", !isSorted1, isSorted2);
    } // end of testListSecond


     /**
      * Test sorting with second comparator.
      */
    @Test public void testListSecond() {
        String[] dtStrs = {
            "1999-02-01T00:00:10",
            "1999-02-01T00:00:30",
            "1999-02-01T00:00:25",
            "1999-02-01T00:00:18",
            "1999-02-01T00:00:01",
            "1999-02-01T00:00:59",
            "1999-02-01T00:00:22"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cSecond );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListSecond", !isSorted1, isSorted2);
    } // end of testListSecond

     /**
      * Test sorting with minute comparator.
      */
    @Test public void testListMinute() {
        String[] dtStrs = {
            "1999-02-01T00:10:00",
            "1999-02-01T00:30:00",
            "1999-02-01T00:25:00",
            "1999-02-01T00:18:00",
            "1999-02-01T00:01:00",
            "1999-02-01T00:59:00",
            "1999-02-01T00:22:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cMinute );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListMinute", !isSorted1, isSorted2);
    } // end of testListMinute

     /**
      * Test sorting with hour comparator.
      */
    @Test public void testListHour() {
        String[] dtStrs = {
            "1999-02-01T10:00:00",
            "1999-02-01T23:00:00",
            "1999-02-01T01:00:00",
            "1999-02-01T15:00:00",
            "1999-02-01T05:00:00",
            "1999-02-01T20:00:00",
            "1999-02-01T17:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cHour );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListHour", !isSorted1, isSorted2);
    } // end of testListHour


     /**
      * Test sorting with day of week comparator.
      */
    @Test public void testListDOW() {
        String[] dtStrs = {
            /* 2002-04-15 = Monday */
            "2002-04-21T10:00:00",
            "2002-04-16T10:00:00",
            "2002-04-15T10:00:00",
            "2002-04-17T10:00:00",
            "2002-04-19T10:00:00",
            "2002-04-18T10:00:00",
            "2002-04-20T10:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cDayOfWeek );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListDOW", !isSorted1, isSorted2);
    } // end of testListDOW

     /**
      * Test sorting with day of month comparator.
      */
    @Test public void testListDOM() {
        String[] dtStrs = {
            /* 2002-04-14 = Sunday */
            "2002-04-20T10:00:00",
            "2002-04-16T10:00:00",
            "2002-04-15T10:00:00",
            "2002-04-17T10:00:00",
            "2002-04-19T10:00:00",
            "2002-04-18T10:00:00",
            "2002-04-14T10:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cDayOfMonth );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListDOM", !isSorted1, isSorted2);
    } // end of testListDOM

     /**
      * Test sorting with day of year comparator.
      */
    @Test public void testListDOY() {
        String[] dtStrs = {
            "2002-04-20T10:00:00",
            "2002-01-16T10:00:00",
            "2002-12-31T10:00:00",
            "2002-09-14T10:00:00",
            "2002-09-19T10:00:00",
            "2002-02-14T10:00:00",
            "2002-10-30T10:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cDayOfYear );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListDOY", !isSorted1, isSorted2);
    } // end of testListDOY

     /**
      * Test sorting with week of weekyear comparator.
      */
    @Test public void testListWOW() {
        String[] dtStrs = {
            "2002-04-01T10:00:00",
            "2002-01-01T10:00:00",
            "2002-12-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-02-01T10:00:00",
            "2002-10-01T10:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cWeekOfWeekyear );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListWOW", !isSorted1, isSorted2);
    } // end of testListWOW

     /**
      * Test sorting with year (given week) comparator.
      */
    @Test public void testListYOYY() {
        // ?? How to catch end conditions ??
        String[] dtStrs = {
            "2010-04-01T10:00:00",
            "2002-01-01T10:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cWeekyear );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListYOYY", !isSorted1, isSorted2);
    } // end of testListYOYY


     /**
      * Test sorting with month comparator.
      */
    @Test public void testListMonth() {
        String[] dtStrs = {
            "2002-04-01T10:00:00",
            "2002-01-01T10:00:00",
            "2002-12-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-09-01T10:00:00",
            "2002-02-01T10:00:00",
            "2002-10-01T10:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cMonth );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListMonth", !isSorted1, isSorted2);
    } // end of testListMonth

     /**
      * Test sorting with year comparator.
      */
     @Test public void testListYear() {
        String[] dtStrs = {
            "1999-02-01T00:00:00",
            "1998-02-01T00:00:00",
            "2525-02-01T00:00:00",
            "1776-02-01T00:00:00",
            "1863-02-01T00:00:00",
            "1066-02-01T00:00:00",
            "2100-02-01T00:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cYear );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListYear", !isSorted1, isSorted2);
     } // end of testListYear

     /**
      * Test sorting with date only comparator.
      */
    @Test public void testListDate() {
        String[] dtStrs = {
            "1999-02-01T00:00:00",
            "1998-10-03T00:00:00",
            "2525-05-20T00:00:00",
            "1776-12-25T00:00:00",
            "1863-01-31T00:00:00",
            "1066-09-22T00:00:00",
            "2100-07-04T00:00:00"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cDate );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListDate", !isSorted1, isSorted2);
    } // end of testListDate

     /**
      * Test sorting with time only comparator.
      */
    @Test public void testListTime() {
        String[] dtStrs = {
            "1999-02-01T01:02:05",
            "1999-02-01T22:22:22",
            "1999-02-01T05:30:45",
            "1999-02-01T09:17:59",
            "1999-02-01T09:17:58",
            "1999-02-01T15:30:00",
            "1999-02-01T17:00:44"
        };
        //
        List sl = loadAList( dtStrs );
        boolean isSorted1 = isListSorted( sl );
        Collections.sort( sl, cTime );
        boolean isSorted2 = isListSorted( sl );
NoAssert.donothing("ListTime", !isSorted1, isSorted2);
    } // end of testListTime


    /**
     * Test comparator operation with null object(s).
     */
    @Test public void testNullDT() {
        // null means now
        aDateTime = getADate("2000-01-01T00:00:00");
NoAssert.donothing(cYear.compare(null, aDateTime) > 0);
NoAssert.donothing(cYear.compare(aDateTime, null) < 0);
    }

    /**
     * Test comparator operation with an invalid object type.
     */
    @Test public void testInvalidObj() {
        aDateTime = getADate("2000-01-01T00:00:00");
        try {
            cYear.compare("FreeBird", aDateTime);
            fail("Invalid object failed");
        } catch (IllegalArgumentException cce) {}
    }

    // private convenience methods
    //-----------------------------------------------------------------------
    /**
     * Creates a date to test with.
     */
    private DateTime getADate(String s) {
        DateTime retDT = null;
        try {
            retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            pe.printStackTrace();
        }
        return retDT;
    }

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {
        List newList = new ArrayList();
        try {
            for (int i = 0; i < someStrs.length; ++i) {
                newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        } catch (IllegalArgumentException pe) {
            pe.printStackTrace();
        }
        return newList;
    }

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {
        // tl must be populated with DateTime objects.
        DateTime lhDT = (DateTime)tl.get(0);
        DateTime rhDT = null;
        Long lhVal = new Long( lhDT.getMillis() );
        Long rhVal = null;
        for (int i = 1; i < tl.size(); ++i) {
            rhDT = (DateTime)tl.get(i);
            rhVal = new Long( rhDT.getMillis() );
            if ( lhVal.compareTo( rhVal) > 0 ) return false;
            //
            lhVal = rhVal;  // swap for next iteration
            lhDT = rhDT;    // swap for next iteration
        }
        return true;
    }

}
