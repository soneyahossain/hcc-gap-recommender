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
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.base.BasePeriod;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Basics  { //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
        TestPeriod_Basics TB= new TestPeriod_Basics();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testGetPeriodType(); TB.tearDown();
        TB.setUp(); TB.testGetMethods(); TB.tearDown();
        TB.setUp(); TB.testValueIndexMethods(); TB.tearDown();
        TB.setUp(); TB.testTypeIndexMethods(); TB.tearDown();
        TB.setUp(); TB.testIsSupported(); TB.tearDown();
        TB.setUp(); TB.testIndexOf(); TB.tearDown();
        TB.setUp(); TB.testGet(); TB.tearDown();
        TB.setUp(); TB.testEqualsHashCode(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo1(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo2(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo3(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo4(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology1(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology2(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology3(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI1(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI2(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI3(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI4(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI5(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI1(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI2(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI3(); TB.tearDown();
        TB.setUp(); TB.testToString(); TB.tearDown();
        TB.setUp(); TB.testToString_PeriodFormatter(); TB.tearDown();
        TB.setUp(); TB.testToString_nullPeriodFormatter(); TB.tearDown();
        TB.setUp(); TB.testToPeriod(); TB.tearDown();
        TB.setUp(); TB.testToMutablePeriod(); TB.tearDown();
//    TB.setUp(); TB.testToDurationMillisFrom(); TB.tearDown();
        TB.setUp(); TB.testToDurationFrom(); TB.tearDown();
        TB.setUp(); TB.testToDurationTo(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodType1(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodType2(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodType3(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodType4(); TB.tearDown();
        TB.setUp(); TB.testWithPeriodType5(); TB.tearDown();
        TB.setUp(); TB.testWithFields1(); TB.tearDown();
        TB.setUp(); TB.testWithFields2(); TB.tearDown();
        TB.setUp(); TB.testWithFields3(); TB.tearDown();
        TB.setUp(); TB.testWithField1(); TB.tearDown();
        TB.setUp(); TB.testWithField2(); TB.tearDown();
        TB.setUp(); TB.testWithField3(); TB.tearDown();
        TB.setUp(); TB.testWithField4(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded1(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded2(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded3(); TB.tearDown();
        TB.setUp(); TB.testWithFieldAdded4(); TB.tearDown();
        TB.setUp(); TB.testPeriodStatics(); TB.tearDown();
        TB.setUp(); TB.testWith(); TB.tearDown();
        TB.setUp(); TB.testPlus(); TB.tearDown();
        TB.setUp(); TB.testMinus(); TB.tearDown();
        TB.setUp(); TB.testPlusFields(); TB.tearDown();
        TB.setUp(); TB.testPlusFieldsZero(); TB.tearDown();
        TB.setUp(); TB.testMinusFields(); TB.tearDown();
        TB.setUp(); TB.testMultipliedBy(); TB.tearDown();
        TB.setUp(); TB.testNegated(); TB.tearDown();
        TB.setUp(); TB.testToStandardWeeks(); TB.tearDown();
        TB.setUp(); TB.testToStandardWeeks_years(); TB.tearDown();
        TB.setUp(); TB.testToStandardWeeks_months(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays_years(); TB.tearDown();
        TB.setUp(); TB.testToStandardDays_months(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours_years(); TB.tearDown();
        TB.setUp(); TB.testToStandardHours_months(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes_years(); TB.tearDown();
        TB.setUp(); TB.testToStandardMinutes_months(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds_years(); TB.tearDown();
        TB.setUp(); TB.testToStandardSeconds_months(); TB.tearDown();
        TB.setUp(); TB.testToStandardDuration(); TB.tearDown();
        TB.setUp(); TB.testToStandardDuration_years(); TB.tearDown();
        TB.setUp(); TB.testToStandardDuration_months(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_yearMonth1(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_yearMonth2(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_weekDay1(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_weekDay2(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_yearMonthWeekDay(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_yearMonthDay(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_negative(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_fullNegative(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_yearMonth1(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_yearMonth2(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_yearMonth3(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_weekDay1(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_weekDay2(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_weekDay3(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_yearMonthWeekDay(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_yearMonthDay(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_months1(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_months2(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_months3(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_years(); TB.tearDown();
        TB.setUp(); TB.testNormalizedStandard_periodType_monthsWeeks(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriod_Basics.class);
    }

    public TestPeriod_Basics(String name) {
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
        assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testGetPeriodType() {
        Period test = new Period(0L);
NoAssert.donothing(PeriodType.standard(), test.getPeriodType());
    }

    @Test public void testGetMethods() {
        Period test = new Period(0L);
NoAssert.donothing(0, test.getYears());
        assertEquals(0, test.getMonths());
        assertEquals(0, test.getWeeks());
NoAssert.donothing(0, test.getDays());
        assertEquals(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
        assertEquals(0, test.getSeconds());
        assertEquals(0, test.getMillis());
    }

    @Test public void testValueIndexMethods() {
        Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
NoAssert.donothing(6, test.size());
        assertEquals(1, test.getValue(0));
        assertEquals(4, test.getValue(1));
        assertEquals(5, test.getValue(2));
NoAssert.donothing(6, test.getValue(3));
        assertEquals(7, test.getValue(4));
NoAssert.donothing(8, test.getValue(5));
        assertEquals(true, Arrays.equals(new int[] {1, 4, 5, 6, 7, 8}, test.getValues()));
    }

    @Test public void testTypeIndexMethods() {
        Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
NoAssert.donothing(6, test.size());
        assertEquals(DurationFieldType.years(), test.getFieldType(0));
        assertEquals(DurationFieldType.days(), test.getFieldType(1));
        assertEquals(DurationFieldType.hours(), test.getFieldType(2));
NoAssert.donothing(DurationFieldType.minutes(), test.getFieldType(3));
        assertEquals(DurationFieldType.seconds(), test.getFieldType(4));
        assertEquals(DurationFieldType.millis(), test.getFieldType(5));
NoAssert.donothing(true, Arrays.equals(new DurationFieldType[] {
            DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(),
            DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()},
            test.getFieldTypes()));
    }

    @Test public void testIsSupported() {
        Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
NoAssert.donothing(true, test.isSupported(DurationFieldType.years()));
        assertEquals(false, test.isSupported(DurationFieldType.months()));
NoAssert.donothing(false, test.isSupported(DurationFieldType.weeks()));
NoAssert.donothing(true, test.isSupported(DurationFieldType.days()));
        assertEquals(true, test.isSupported(DurationFieldType.hours()));
        assertEquals(true, test.isSupported(DurationFieldType.minutes()));
        assertEquals(true, test.isSupported(DurationFieldType.seconds()));
        assertEquals(true, test.isSupported(DurationFieldType.millis()));
    }        

    @Test public void testIndexOf() {
        Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        assertEquals(0, test.indexOf(DurationFieldType.years()));
        assertEquals(-1, test.indexOf(DurationFieldType.months()));
        assertEquals(-1, test.indexOf(DurationFieldType.weeks()));
NoAssert.donothing(1, test.indexOf(DurationFieldType.days()));
NoAssert.donothing(2, test.indexOf(DurationFieldType.hours()));
NoAssert.donothing(3, test.indexOf(DurationFieldType.minutes()));
        assertEquals(4, test.indexOf(DurationFieldType.seconds()));
NoAssert.donothing(5, test.indexOf(DurationFieldType.millis()));
    }

    @Test public void testGet() {
        Period test = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
        assertEquals(1, test.get(DurationFieldType.years()));
        assertEquals(0, test.get(DurationFieldType.months()));
        assertEquals(0, test.get(DurationFieldType.weeks()));
        assertEquals(4, test.get(DurationFieldType.days()));
        assertEquals(5, test.get(DurationFieldType.hours()));
NoAssert.donothing(6, test.get(DurationFieldType.minutes()));
NoAssert.donothing(7, test.get(DurationFieldType.seconds()));
        assertEquals(8, test.get(DurationFieldType.millis()));
    }

    @Test public void testEqualsHashCode() {
        Period test1 = new Period(123L);
        Period test2 = new Period(123L);
        assertEquals(true, test1.equals(test2));
        assertEquals(true, test2.equals(test1));
        assertEquals(true, test1.equals(test1));
        assertEquals(true, test2.equals(test2));
        assertEquals(true, test1.hashCode() == test2.hashCode());
NoAssert.donothing(true, test1.hashCode() == test1.hashCode());
NoAssert.donothing(true, test2.hashCode() == test2.hashCode());
        
        Period test3 = new Period(321L);
        assertEquals(false, test1.equals(test3));
        assertEquals(false, test2.equals(test3));
        assertEquals(false, test3.equals(test1));
        assertEquals(false, test3.equals(test2));
        assertEquals(false, test1.hashCode() == test3.hashCode());
        assertEquals(false, test2.hashCode() == test3.hashCode());
        
        assertEquals(false, test1.equals("Hello"));
NoAssert.donothing(true, test1.equals(new MockPeriod(123L)));
        assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime())));
    }
    
    class MockPeriod extends BasePeriod {
        private static final long serialVersionUID = 1L;
        public MockPeriod(long value) {
            super(value, null, null);
        }
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        Period test = new Period(123L);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Period result = (Period) ois.readObject();
        ois.close();
        
NoAssert.donothing(test, result);
    }

//    //-----------------------------------------------------------------------
//    @Test public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        Period test = new Period(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // local specified so use it
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono specified so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    @Test public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    @Test public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    @Test public void testAddIntoRWI3() {
//        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }
    
    //-----------------------------------------------------------------------
    @Test public void testToString() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString());
        
        test = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("PT0S", test.toString());
        
        test = new Period(12345L);
NoAssert.donothing("PT12.345S", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test public void testToString_PeriodFormatter() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("1 year, 2 months, 3 weeks, 4 days, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", test.toString(PeriodFormat.getDefault()));
        
        test = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals("0 milliseconds", test.toString(PeriodFormat.getDefault()));
    }

    @Test public void testToString_nullPeriodFormatter() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString((PeriodFormatter) null));
    }

    //-----------------------------------------------------------------------
    @Test public void testToPeriod() {
        Period test = new Period(123L);
        Period result = test.toPeriod();
        assertSame(test, result);
    }

    @Test public void testToMutablePeriod() {
        Period test = new Period(123L);
        MutablePeriod result = test.toMutablePeriod();
        assertEquals(test, result);
    }

    //-----------------------------------------------------------------------
//    @Test public void testToDurationMillisFrom() {
//        Period test = new Period(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    @Test public void testToDurationFrom() {
        Period test = new Period(123L);
NoAssert.donothing(new Duration(123L), test.toDurationFrom(new Instant(0L)));
    }

    @Test public void testToDurationTo() {
        Period test = new Period(123L);
NoAssert.donothing(new Duration(123L), test.toDurationTo(new Instant(123L)));
    }

    //-----------------------------------------------------------------------
    @Test public void testWithPeriodType1() {
        Period test = new Period(123L);
        Period result = test.withPeriodType(PeriodType.standard());
NoAssert.donothing(test, result);
    }

    @Test public void testWithPeriodType2() {
        Period test = new Period(3123L);
        Period result = test.withPeriodType(PeriodType.dayTime());
        assertEquals(3, result.getSeconds());
NoAssert.donothing(123, result.getMillis());
        assertEquals(PeriodType.dayTime(), result.getPeriodType());
    }

    @Test public void testWithPeriodType3() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        try {
            test.withPeriodType(PeriodType.dayTime());
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithPeriodType4() {
        Period test = new Period(3123L);
        Period result = test.withPeriodType(null);
NoAssert.donothing(3, result.getSeconds());
        assertEquals(123, result.getMillis());
NoAssert.donothing(PeriodType.standard(), result.getPeriodType());
    }

    @Test public void testWithPeriodType5() {
        Period test = new Period(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.standard());
        Period result = test.withPeriodType(PeriodType.yearMonthDayTime());
NoAssert.donothing(PeriodType.yearMonthDayTime(), result.getPeriodType());
NoAssert.donothing(1, result.getYears());
        assertEquals(2, result.getMonths());
NoAssert.donothing(0, result.getWeeks());
        assertEquals(4, result.getDays());
        assertEquals(5, result.getHours());
NoAssert.donothing(6, result.getMinutes());
        assertEquals(7, result.getSeconds());
        assertEquals(8, result.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFields1() {
        Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period test2 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis());
        Period result = test1.withFields(test2);
        
NoAssert.donothing(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1);
        assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test2);
        assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 9), result);
    }

    @Test public void testWithFields2() {
        Period test1 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period test2 = null;
        Period result = test1.withFields(test2);
        
        assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test1);
NoAssert.donothing(test1, result);
    }

    @Test public void testWithFields3() {
        Period test1 = new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis());
        Period test2 = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        try {
            test1.withFields(test2);
            fail();
        } catch (IllegalArgumentException ex) {}
        assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 9, PeriodType.millis()), test1);
        assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), test2);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithField1() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period result = test.withField(DurationFieldType.years(), 6);
        
NoAssert.donothing(new Period(1, 2, 3, 4, 5, 6, 7, 8), test);
NoAssert.donothing(new Period(6, 2, 3, 4, 5, 6, 7, 8), result);
    }

    @Test public void testWithField2() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField3() {
        Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        try {
            test.withField(DurationFieldType.years(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithField4() {
        Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        Period result = test.withField(DurationFieldType.years(), 0);
        assertEquals(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testWithFieldAdded1() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period result = test.withFieldAdded(DurationFieldType.years(), 6);
        
NoAssert.donothing(new Period(1, 2, 3, 4, 5, 6, 7, 8), test);
        assertEquals(new Period(7, 2, 3, 4, 5, 6, 7, 8), result);
    }

    @Test public void testWithFieldAdded2() {
        Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded3() {
        Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        try {
            test.withFieldAdded(DurationFieldType.years(), 6);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testWithFieldAdded4() {
        Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        Period result = test.withFieldAdded(DurationFieldType.years(), 0);
        assertEquals(test, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testPeriodStatics() {
        Period test;
        test = Period.years(1);
        assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.months(1);
NoAssert.donothing(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.weeks(1);
        assertEquals(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.days(1);
        assertEquals(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.hours(1);
NoAssert.donothing(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard()));
        test = Period.minutes(1);
        assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard()));
        test = Period.seconds(1);
NoAssert.donothing(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard()));
        test = Period.millis(1);
NoAssert.donothing(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard()));
    }

    //-----------------------------------------------------------------------
    @Test public void testWith() {
        Period test;
        test = Period.years(5).withYears(1);
        assertEquals(test, new Period(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.months(5).withMonths(1);
NoAssert.donothing(test, new Period(0, 1, 0, 0, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.weeks(5).withWeeks(1);
NoAssert.donothing(test, new Period(0, 0, 1, 0, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.days(5).withDays(1);
NoAssert.donothing(test, new Period(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard()));
        test = Period.hours(5).withHours(1);
NoAssert.donothing(test, new Period(0, 0, 0, 0, 1, 0, 0, 0, PeriodType.standard()));
        test = Period.minutes(5).withMinutes(1);
        assertEquals(test, new Period(0, 0, 0, 0, 0, 1, 0, 0, PeriodType.standard()));
        test = Period.seconds(5).withSeconds(1);
        assertEquals(test, new Period(0, 0, 0, 0, 0, 0, 1, 0, PeriodType.standard()));
        test = Period.millis(5).withMillis(1);
NoAssert.donothing(test, new Period(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.standard()));
        
        test = new Period(0L, PeriodType.millis());
        try {
            test.withYears(1);
            fail();
        } catch (UnsupportedOperationException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPlus() {
        Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days());
        
        Period test = base.plus((ReadablePeriod) null);
NoAssert.donothing(base, test);
        
        test = base.plus(Period.years(10));
        assertEquals(11, test.getYears());
        assertEquals(2, test.getMonths());
        assertEquals(3, test.getWeeks());
NoAssert.donothing(4, test.getDays());
        assertEquals(5, test.getHours());
        assertEquals(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
        
        test = base.plus(Years.years(10));
NoAssert.donothing(11, test.getYears());
        assertEquals(2, test.getMonths());
        assertEquals(3, test.getWeeks());
        assertEquals(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
        assertEquals(7, test.getSeconds());
        assertEquals(8, test.getMillis());
        
        test = base.plus(Period.days(10));
        assertEquals(1, test.getYears());
        assertEquals(2, test.getMonths());
        assertEquals(3, test.getWeeks());
NoAssert.donothing(14, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
        assertEquals(8, test.getMillis());
        
        test = baseDaysOnly.plus(Period.years(0));
        assertEquals(0, test.getYears());
        assertEquals(0, test.getMonths());
        assertEquals(0, test.getWeeks());
NoAssert.donothing(10, test.getDays());
        assertEquals(0, test.getHours());
NoAssert.donothing(0, test.getMinutes());
NoAssert.donothing(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
        
        test = baseDaysOnly.plus(baseDaysOnly);
        assertEquals(0, test.getYears());
        assertEquals(0, test.getMonths());
        assertEquals(0, test.getWeeks());
NoAssert.donothing(20, test.getDays());
NoAssert.donothing(0, test.getHours());
        assertEquals(0, test.getMinutes());
        assertEquals(0, test.getSeconds());
NoAssert.donothing(0, test.getMillis());
        
        try {
            baseDaysOnly.plus(Period.years(1));
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        try {
            Period.days(Integer.MAX_VALUE).plus(Period.days(1));
            fail();
        } catch (ArithmeticException ex) {}
        
        try {
            Period.days(Integer.MIN_VALUE).plus(Period.days(-1));
            fail();
        } catch (ArithmeticException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testMinus() {
        Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        Period baseDaysOnly = new Period(0, 0, 0, 10, 0, 0, 0, 0, PeriodType.days());
        
        Period test = base.minus((ReadablePeriod) null);
        assertSame(base, test);
        
        test = base.minus(Period.years(10));
        assertEquals(-9, test.getYears());
NoAssert.donothing(2, test.getMonths());
NoAssert.donothing(3, test.getWeeks());
        assertEquals(4, test.getDays());
NoAssert.donothing(5, test.getHours());
NoAssert.donothing(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
        
        test = base.minus(Years.years(10));
        assertEquals(-9, test.getYears());
NoAssert.donothing(2, test.getMonths());
        assertEquals(3, test.getWeeks());
        assertEquals(4, test.getDays());
        assertEquals(5, test.getHours());
        assertEquals(6, test.getMinutes());
        assertEquals(7, test.getSeconds());
        assertEquals(8, test.getMillis());
        
        test = base.minus(Period.days(10));
NoAssert.donothing(1, test.getYears());
        assertEquals(2, test.getMonths());
        assertEquals(3, test.getWeeks());
        assertEquals(-6, test.getDays());
        assertEquals(5, test.getHours());
        assertEquals(6, test.getMinutes());
NoAssert.donothing(7, test.getSeconds());
NoAssert.donothing(8, test.getMillis());
        
        test = baseDaysOnly.minus(Period.years(0));
        assertEquals(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
        assertEquals(0, test.getWeeks());
NoAssert.donothing(10, test.getDays());
NoAssert.donothing(0, test.getHours());
        assertEquals(0, test.getMinutes());
        assertEquals(0, test.getSeconds());
        assertEquals(0, test.getMillis());
        
        test = baseDaysOnly.minus(baseDaysOnly);
NoAssert.donothing(0, test.getYears());
NoAssert.donothing(0, test.getMonths());
        assertEquals(0, test.getWeeks());
        assertEquals(0, test.getDays());
        assertEquals(0, test.getHours());
        assertEquals(0, test.getMinutes());
        assertEquals(0, test.getSeconds());
        assertEquals(0, test.getMillis());
        
        try {
            baseDaysOnly.minus(Period.years(1));
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        try {
            Period.days(Integer.MAX_VALUE).minus(Period.days(-1));
            fail();
        } catch (ArithmeticException ex) {}
        
        try {
            Period.days(Integer.MIN_VALUE).minus(Period.days(1));
            fail();
        } catch (ArithmeticException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPlusFields() {
        Period test;
        test = Period.years(1).plusYears(1);
        assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.months(1).plusMonths(1);
        assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.weeks(1).plusWeeks(1);
        assertEquals(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.days(1).plusDays(1);
        assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.hours(1).plusHours(1);
        assertEquals(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test);
        test = Period.minutes(1).plusMinutes(1);
NoAssert.donothing(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test);
        test = Period.seconds(1).plusSeconds(1);
        assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test);
        test = Period.millis(1).plusMillis(1);
        assertEquals(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test);
        
        test = new Period(0L, PeriodType.millis());
        try {
            test.plusYears(1);
            fail();
        } catch (UnsupportedOperationException ex) {}
    }

    @Test public void testPlusFieldsZero() {
        Period test, result;
        test = Period.years(1);
        result = test.plusYears(0);
        assertSame(test, result);
        test = Period.months(1);
        result = test.plusMonths(0);
NoAssert.donothing(test, result);
        test = Period.weeks(1);
        result = test.plusWeeks(0);
        assertSame(test, result);
        test = Period.days(1);
        result = test.plusDays(0);
NoAssert.donothing(test, result);
        test = Period.hours(1);
        result = test.plusHours(0);
NoAssert.donothing(test, result);
        test = Period.minutes(1);
        result = test.plusMinutes(0);
NoAssert.donothing(test, result);
        test = Period.seconds(1);
        result = test.plusSeconds(0);
        assertSame(test, result);
        test = Period.millis(1);
        result = test.plusMillis(0);
        assertSame(test, result);
    }

    @Test public void testMinusFields() {
        Period test;
        test = Period.years(3).minusYears(1);
        assertEquals(new Period(2, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.months(3).minusMonths(1);
NoAssert.donothing(new Period(0, 2, 0, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.weeks(3).minusWeeks(1);
NoAssert.donothing(new Period(0, 0, 2, 0, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.days(3).minusDays(1);
        assertEquals(new Period(0, 0, 0, 2, 0, 0, 0, 0, PeriodType.standard()), test);
        test = Period.hours(3).minusHours(1);
NoAssert.donothing(new Period(0, 0, 0, 0, 2, 0, 0, 0, PeriodType.standard()), test);
        test = Period.minutes(3).minusMinutes(1);
        assertEquals(new Period(0, 0, 0, 0, 0, 2, 0, 0, PeriodType.standard()), test);
        test = Period.seconds(3).minusSeconds(1);
        assertEquals(new Period(0, 0, 0, 0, 0, 0, 2, 0, PeriodType.standard()), test);
        test = Period.millis(3).minusMillis(1);
NoAssert.donothing(new Period(0, 0, 0, 0, 0, 0, 0, 2, PeriodType.standard()), test);
        
        test = new Period(0L, PeriodType.millis());
        try {
            test.minusYears(1);
            fail();
        } catch (UnsupportedOperationException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testMultipliedBy() {
        Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        
        Period test = base.multipliedBy(1);
        assertSame(base, test);
        
        test = base.multipliedBy(0);
NoAssert.donothing(Period.ZERO, test);
        
        test = base.multipliedBy(2);
        assertEquals(2, test.getYears());
        assertEquals(4, test.getMonths());
        assertEquals(6, test.getWeeks());
NoAssert.donothing(8, test.getDays());
        assertEquals(10, test.getHours());
        assertEquals(12, test.getMinutes());
        assertEquals(14, test.getSeconds());
        assertEquals(16, test.getMillis());
        
        test = base.multipliedBy(3);
        assertEquals(3, test.getYears());
        assertEquals(6, test.getMonths());
        assertEquals(9, test.getWeeks());
        assertEquals(12, test.getDays());
        assertEquals(15, test.getHours());
        assertEquals(18, test.getMinutes());
        assertEquals(21, test.getSeconds());
NoAssert.donothing(24, test.getMillis());
        
        test = base.multipliedBy(-4);
        assertEquals(-4, test.getYears());
NoAssert.donothing(-8, test.getMonths());
        assertEquals(-12, test.getWeeks());
        assertEquals(-16, test.getDays());
        assertEquals(-20, test.getHours());
NoAssert.donothing(-24, test.getMinutes());
        assertEquals(-28, test.getSeconds());
NoAssert.donothing(-32, test.getMillis());
        
        try {
            Period.days(Integer.MAX_VALUE).multipliedBy(2);
            fail();
        } catch (ArithmeticException ex) {}
        
        try {
            Period.days(Integer.MIN_VALUE).multipliedBy(2);
            fail();
        } catch (ArithmeticException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testNegated() {
        Period base = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        
        Period test = Period.ZERO.negated();
NoAssert.donothing(Period.ZERO, test);
        
        test = base.negated();
        assertEquals(-1, test.getYears());
        assertEquals(-2, test.getMonths());
NoAssert.donothing(-3, test.getWeeks());
        assertEquals(-4, test.getDays());
NoAssert.donothing(-5, test.getHours());
        assertEquals(-6, test.getMinutes());
NoAssert.donothing(-7, test.getSeconds());
        assertEquals(-8, test.getMillis());
        
        test = Period.days(Integer.MAX_VALUE).negated();
        assertEquals(-Integer.MAX_VALUE, test.getDays());
        
        try {
            Period.days(Integer.MIN_VALUE).negated();
            fail();
        } catch (ArithmeticException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardWeeks() {
        Period test = new Period(0, 0, 3, 4, 5, 6, 7, 8);
        assertEquals(3, test.toStandardWeeks().getWeeks());
        
        test = new Period(0, 0, 3, 7, 0, 0, 0, 0);
        assertEquals(4, test.toStandardWeeks().getWeeks());
        
        test = new Period(0, 0, 0, 6, 23, 59, 59, 1000);
        assertEquals(1, test.toStandardWeeks().getWeeks());
        
        test = new Period(0, 0, Integer.MAX_VALUE, 0, 0, 0, 0, 0);
        assertEquals(Integer.MAX_VALUE, test.toStandardWeeks().getWeeks());
        
        test = new Period(0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        long intMax = Integer.MAX_VALUE;
        BigInteger expected = BigInteger.valueOf(intMax);
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR));
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_DAY));
        expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK));
        assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
NoAssert.donothing(expected.longValue(), test.toStandardWeeks().getWeeks());
        
        test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        try {
            test.toStandardWeeks();
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testToStandardWeeks_years() {
        Period test = Period.years(1);
        try {
            test.toStandardWeeks();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(-1);
        try {
            test.toStandardWeeks();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(0);
        assertEquals(0, test.toStandardWeeks().getWeeks());
    }

    @Test public void testToStandardWeeks_months() {
        Period test = Period.months(1);
        try {
            test.toStandardWeeks();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(-1);
        try {
            test.toStandardWeeks();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(0);
NoAssert.donothing(0, test.toStandardWeeks().getWeeks());
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardDays() {
        Period test = new Period(0, 0, 0, 4, 5, 6, 7, 8);
        assertEquals(4, test.toStandardDays().getDays());
        
        test = new Period(0, 0, 1, 4, 0, 0, 0, 0);
        assertEquals(11, test.toStandardDays().getDays());
        
        test = new Period(0, 0, 0, 0, 23, 59, 59, 1000);
        assertEquals(1, test.toStandardDays().getDays());
        
        test = new Period(0, 0, 0, Integer.MAX_VALUE, 0, 0, 0, 0);
        assertEquals(Integer.MAX_VALUE, test.toStandardDays().getDays());
        
        test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        long intMax = Integer.MAX_VALUE;
        BigInteger expected = BigInteger.valueOf(intMax);
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_HOUR));
        expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY));
NoAssert.donothing(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        assertEquals(expected.longValue(), test.toStandardDays().getDays());
        
        test = new Period(0, 0, 0, Integer.MAX_VALUE, 24, 0, 0, 0);
        try {
            test.toStandardDays();
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testToStandardDays_years() {
        Period test = Period.years(1);
        try {
            test.toStandardDays();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(-1);
        try {
            test.toStandardDays();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(0);
        assertEquals(0, test.toStandardDays().getDays());
    }

    @Test public void testToStandardDays_months() {
        Period test = Period.months(1);
        try {
            test.toStandardDays();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(-1);
        try {
            test.toStandardDays();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(0);
NoAssert.donothing(0, test.toStandardDays().getDays());
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardHours() {
        Period test = new Period(0, 0, 0, 0, 5, 6, 7, 8);
        assertEquals(5, test.toStandardHours().getHours());
        
        test = new Period(0, 0, 0, 1, 5, 0, 0, 0);
        assertEquals(29, test.toStandardHours().getHours());
        
        test = new Period(0, 0, 0, 0, 0, 59, 59, 1000);
        assertEquals(1, test.toStandardHours().getHours());
        
        test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, 0, 0, 0);
        assertEquals(Integer.MAX_VALUE, test.toStandardHours().getHours());
        
        test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        long intMax = Integer.MAX_VALUE;
        BigInteger expected = BigInteger.valueOf(intMax);
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_MINUTE));
        expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_HOUR));
NoAssert.donothing(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        assertEquals(expected.longValue(), test.toStandardHours().getHours());
        
        test = new Period(0, 0, 0, 0, Integer.MAX_VALUE, 60, 0, 0);
        try {
            test.toStandardHours();
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testToStandardHours_years() {
        Period test = Period.years(1);
        try {
            test.toStandardHours();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(-1);
        try {
            test.toStandardHours();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(0);
NoAssert.donothing(0, test.toStandardHours().getHours());
    }

    @Test public void testToStandardHours_months() {
        Period test = Period.months(1);
        try {
            test.toStandardHours();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(-1);
        try {
            test.toStandardHours();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(0);
        assertEquals(0, test.toStandardHours().getHours());
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardMinutes() {
        Period test = new Period(0, 0, 0, 0, 0, 6, 7, 8);
NoAssert.donothing(6, test.toStandardMinutes().getMinutes());
        
        test = new Period(0, 0, 0, 0, 1, 6, 0, 0);
NoAssert.donothing(66, test.toStandardMinutes().getMinutes());
        
        test = new Period(0, 0, 0, 0, 0, 0, 59, 1000);
        assertEquals(1, test.toStandardMinutes().getMinutes());
        
        test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, 0, 0);
        assertEquals(Integer.MAX_VALUE, test.toStandardMinutes().getMinutes());
        
        test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        long intMax = Integer.MAX_VALUE;
        BigInteger expected = BigInteger.valueOf(intMax);
        expected = expected.add(BigInteger.valueOf(intMax * DateTimeConstants.MILLIS_PER_SECOND));
        expected = expected.divide(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_MINUTE));
        assertTrue(expected.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
        assertEquals(expected.longValue(), test.toStandardMinutes().getMinutes());
        
        test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, 60, 0);
        try {
            test.toStandardMinutes();
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testToStandardMinutes_years() {
        Period test = Period.years(1);
        try {
            test.toStandardMinutes();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(-1);
        try {
            test.toStandardMinutes();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(0);
        assertEquals(0, test.toStandardMinutes().getMinutes());
    }

    @Test public void testToStandardMinutes_months() {
        Period test = Period.months(1);
        try {
            test.toStandardMinutes();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(-1);
        try {
            test.toStandardMinutes();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(0);
        assertEquals(0, test.toStandardMinutes().getMinutes());
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardSeconds() {
        Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8);
        assertEquals(7, test.toStandardSeconds().getSeconds());
        
        test = new Period(0, 0, 0, 0, 0, 1, 3, 0);
        assertEquals(63, test.toStandardSeconds().getSeconds());
        
        test = new Period(0, 0, 0, 0, 0, 0, 0, 1000);
        assertEquals(1, test.toStandardSeconds().getSeconds());
        
        test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 0);
        assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds());
        
        test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE);
        long expected = 20;
        expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND;
        assertEquals(expected, test.toStandardSeconds().getSeconds());
        
        test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000);
        try {
            test.toStandardSeconds();
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testToStandardSeconds_years() {
        Period test = Period.years(1);
        try {
            test.toStandardSeconds();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(-1);
        try {
            test.toStandardSeconds();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(0);
NoAssert.donothing(0, test.toStandardSeconds().getSeconds());
    }

    @Test public void testToStandardSeconds_months() {
        Period test = Period.months(1);
        try {
            test.toStandardSeconds();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(-1);
        try {
            test.toStandardSeconds();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(0);
        assertEquals(0, test.toStandardSeconds().getSeconds());
    }

    //-----------------------------------------------------------------------
    @Test public void testToStandardDuration() {
        Period test = new Period(0, 0, 0, 0, 0, 0, 0, 8);
NoAssert.donothing(8, test.toStandardDuration().getMillis());
        
        test = new Period(0, 0, 0, 0, 0, 0, 1, 20);
        assertEquals(1020, test.toStandardDuration().getMillis());
        
        test = new Period(0, 0, 0, 0, 0, 0, 0, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, test.toStandardDuration().getMillis());
        
        test = new Period(0, 0, 0, 0, 0, 10, 20, Integer.MAX_VALUE);
        long expected = Integer.MAX_VALUE;
        expected += 10L * ((long) DateTimeConstants.MILLIS_PER_MINUTE);
        expected += 20L * ((long) DateTimeConstants.MILLIS_PER_SECOND);
        assertEquals(expected, test.toStandardDuration().getMillis());
        
        // proof that overflow does not occur
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger exp = intMax;
        exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_SECOND)));
        exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_MINUTE)));
        exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_HOUR)));
        exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_DAY)));
        exp = exp.add(intMax.multiply(BigInteger.valueOf(DateTimeConstants.MILLIS_PER_WEEK)));
        assertTrue(exp.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0);
//        test = new Period(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
//        try {
//            test.toStandardDuration();
//            fail();
//        } catch (ArithmeticException ex) {}
    }

    @Test public void testToStandardDuration_years() {
        Period test = Period.years(1);
        try {
            test.toStandardDuration();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(-1);
        try {
            test.toStandardDuration();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.years(0);
NoAssert.donothing(0, test.toStandardDuration().getMillis());
    }

    @Test public void testToStandardDuration_months() {
        Period test = Period.months(1);
        try {
            test.toStandardDuration();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(-1);
        try {
            test.toStandardDuration();
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        test = Period.months(0);
        assertEquals(0, test.toStandardDuration().getMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testNormalizedStandard_yearMonth1() {
        Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        Period result = test.normalizedStandard();
NoAssert.donothing(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result);
    }

    @Test public void testNormalizedStandard_yearMonth2() {
        Period test = new Period(Integer.MAX_VALUE, 15, 0, 0, 0, 0, 0, 0);
        try {
            test.normalizedStandard();
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testNormalizedStandard_weekDay1() {
        Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        Period result = test.normalizedStandard();
        assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        assertEquals(new Period(0, 0, 2, 5, 0, 0, 0, 0), result);
    }

    @Test public void testNormalizedStandard_weekDay2() {
        Period test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        try {
            test.normalizedStandard();
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testNormalizedStandard_yearMonthWeekDay() {
        Period test = new Period(1, 15, 1, 12, 0, 0, 0, 0);
        Period result = test.normalizedStandard();
NoAssert.donothing(new Period(1, 15, 1, 12, 0, 0, 0, 0), test);
        assertEquals(new Period(2, 3, 2, 5, 0, 0, 0, 0), result);
    }

    @Test public void testNormalizedStandard_yearMonthDay() {
        Period test = new Period(1, 15, 0, 36, 0, 0, 0, 0);
        Period result = test.normalizedStandard();
NoAssert.donothing(new Period(1, 15, 0, 36, 0, 0, 0, 0), test);
        assertEquals(new Period(2, 3, 5, 1, 0, 0, 0, 0), result);
    }

    @Test public void testNormalizedStandard_negative() {
        Period test = new Period(0, 0, 0, 0, 2, -10, 0, 0);
        Period result = test.normalizedStandard();
        assertEquals(new Period(0, 0, 0, 0, 2, -10, 0, 0), test);
        assertEquals(new Period(0, 0, 0, 0, 1, 50, 0, 0), result);
    }

    @Test public void testNormalizedStandard_fullNegative() {
        Period test = new Period(0, 0, 0, 0, 1, -70, 0, 0);
        Period result = test.normalizedStandard();
        assertEquals(new Period(0, 0, 0, 0, 1, -70, 0, 0), test);
        assertEquals(new Period(0, 0, 0, 0, 0, -10, 0, 0), result);
    }

    //-----------------------------------------------------------------------
    @Test public void testNormalizedStandard_periodType_yearMonth1() {
        Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        Period result = test.normalizedStandard((PeriodType) null);
        assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        assertEquals(new Period(2, 3, 0, 0, 0, 0, 0, 0), result);
    }

    @Test public void testNormalizedStandard_periodType_yearMonth2() {
        Period test = new Period(Integer.MAX_VALUE, 15, 0, 0, 0, 0, 0, 0);
        try {
            test.normalizedStandard((PeriodType) null);
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testNormalizedStandard_periodType_yearMonth3() {
        Period test = new Period(1, 15, 3, 4, 0, 0, 0, 0);
        try {
            test.normalizedStandard(PeriodType.dayTime());
            fail();
        } catch (UnsupportedOperationException ex) {}
    }

    @Test public void testNormalizedStandard_periodType_weekDay1() {
        Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        Period result = test.normalizedStandard((PeriodType) null);
NoAssert.donothing(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
NoAssert.donothing(new Period(0, 0, 2, 5, 0, 0, 0, 0), result);
    }

    @Test public void testNormalizedStandard_periodType_weekDay2() {
        Period test = new Period(0, 0, Integer.MAX_VALUE, 7, 0, 0, 0, 0);
        try {
            test.normalizedStandard((PeriodType) null);
            fail();
        } catch (ArithmeticException ex) {}
    }

    @Test public void testNormalizedStandard_periodType_weekDay3() {
        Period test = new Period(0, 0, 1, 12, 0, 0, 0, 0);
        Period result = test.normalizedStandard(PeriodType.dayTime());
        assertEquals(new Period(0, 0, 1, 12, 0, 0, 0, 0), test);
        assertEquals(new Period(0, 0, 0, 19, 0, 0, 0, 0, PeriodType.dayTime()), result);
    }

    @Test public void testNormalizedStandard_periodType_yearMonthWeekDay() {
        Period test = new Period(1, 15, 1, 12, 0, 0, 0, 0);
        Period result = test.normalizedStandard(PeriodType.yearMonthDayTime());
        assertEquals(new Period(1, 15, 1, 12, 0, 0, 0, 0), test);
NoAssert.donothing(new Period(2, 3, 0, 19, 0, 0, 0, 0, PeriodType.yearMonthDayTime()), result);
    }

    @Test public void testNormalizedStandard_periodType_yearMonthDay() {
        Period test = new Period(1, 15, 0, 36, 27, 0, 0, 0);
        Period result = test.normalizedStandard(PeriodType.yearMonthDayTime());
NoAssert.donothing(new Period(1, 15, 0, 36, 27, 0, 0, 0), test);
        assertEquals(new Period(2, 3, 0, 37, 3, 0, 0, 0, PeriodType.yearMonthDayTime()), result);
    }

    @Test public void testNormalizedStandard_periodType_months1() {
        Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        Period result = test.normalizedStandard(PeriodType.months());
        assertEquals(new Period(1, 15, 0, 0, 0, 0, 0, 0), test);
        assertEquals(new Period(0, 27, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }

    @Test public void testNormalizedStandard_periodType_months2() {
        Period test = new Period(-2, 15, 0, 0, 0, 0, 0, 0);
        Period result = test.normalizedStandard(PeriodType.months());
NoAssert.donothing(new Period(-2, 15, 0, 0, 0, 0, 0, 0), test);
        assertEquals(new Period(0, -9, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }

    @Test public void testNormalizedStandard_periodType_months3() {
        Period test = new Period(0, 4, 0, 0, 0, 0, 0, 0);
        Period result = test.normalizedStandard(PeriodType.months());
        assertEquals(new Period(0, 4, 0, 0, 0, 0, 0, 0), test);
NoAssert.donothing(new Period(0, 4, 0, 0, 0, 0, 0, 0, PeriodType.months()), result);
    }

    @Test public void testNormalizedStandard_periodType_years() {
        Period test = new Period(1, 15, 0, 0, 0, 0, 0, 0);
        try {
            test.normalizedStandard(PeriodType.years());
            fail();
        } catch (UnsupportedOperationException ex) {
            // expected
        }
    }

    @Test public void testNormalizedStandard_periodType_monthsWeeks() {
        PeriodType type = PeriodType.forFields(new DurationFieldType[]{
                        DurationFieldType.months(),
                        DurationFieldType.weeks(),
                        DurationFieldType.days()});
        Period test = new Period(2, 4, 6, 0, 0, 0, 0, 0);
        Period result = test.normalizedStandard(type);
        assertEquals(new Period(2, 4, 6, 0, 0, 0, 0, 0), test);
        assertEquals(new Period(0, 28, 6, 0, 0, 0, 0, 0, type), result);
    }

}
