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
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType  { //extends TestCase {
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
        TestPeriodType TB= new TestPeriodType();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testStandard(); TB.tearDown();
        TB.setUp(); TB.testYearMonthDayTime(); TB.tearDown();
        TB.setUp(); TB.testYearMonthDay(); TB.tearDown();
        TB.setUp(); TB.testYearWeekDayTime(); TB.tearDown();
        TB.setUp(); TB.testYearWeekDay(); TB.tearDown();
        TB.setUp(); TB.testYearDayTime(); TB.tearDown();
        TB.setUp(); TB.testYearDay(); TB.tearDown();
        TB.setUp(); TB.testDayTime(); TB.tearDown();
        TB.setUp(); TB.testTime(); TB.tearDown();
        TB.setUp(); TB.testYears(); TB.tearDown();
        TB.setUp(); TB.testMonths(); TB.tearDown();
        TB.setUp(); TB.testWeeks(); TB.tearDown();
        TB.setUp(); TB.testDays(); TB.tearDown();
        TB.setUp(); TB.testHours(); TB.tearDown();
        TB.setUp(); TB.testMinutes(); TB.tearDown();
        TB.setUp(); TB.testSeconds(); TB.tearDown();
        TB.setUp(); TB.testMillis(); TB.tearDown();
        TB.setUp(); TB.testForFields1(); TB.tearDown();
        TB.setUp(); TB.testForFields2(); TB.tearDown();
        TB.setUp(); TB.testForFields3(); TB.tearDown();
        TB.setUp(); TB.testForFields4(); TB.tearDown();
        TB.setUp(); TB.testForFields5(); TB.tearDown();
        TB.setUp(); TB.testForFields6(); TB.tearDown();
        TB.setUp(); TB.testForFields7(); TB.tearDown();
        TB.setUp(); TB.testMaskYears(); TB.tearDown();
        TB.setUp(); TB.testMaskMonths(); TB.tearDown();
        TB.setUp(); TB.testMaskWeeks(); TB.tearDown();
        TB.setUp(); TB.testMaskDays(); TB.tearDown();
        TB.setUp(); TB.testMaskHours(); TB.tearDown();
        TB.setUp(); TB.testMaskMinutes(); TB.tearDown();
        TB.setUp(); TB.testMaskSeconds(); TB.tearDown();
        TB.setUp(); TB.testMaskMillis(); TB.tearDown();
        TB.setUp(); TB.testMaskHoursMinutesSeconds(); TB.tearDown();
        TB.setUp(); TB.testMaskTwice1(); TB.tearDown();
        TB.setUp(); TB.testMaskTwice2(); TB.tearDown();
        TB.setUp(); TB.testEquals(); TB.tearDown();
        TB.setUp(); TB.testHashCode(); TB.tearDown();
        TB.setUp(); TB.testIsSupported(); TB.tearDown();
        TB.setUp(); TB.testIndexOf(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriodType.class);
    }

    public TestPeriodType(String name) {
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
        assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        PeriodType result = (PeriodType) ois.readObject();
        ois.close();
        
NoAssert.donothing(type, result);
    }

    private void assertSameAfterSerialization(PeriodType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        PeriodType result = (PeriodType) ois.readObject();
        ois.close();
        
NoAssert.donothing(type, result);
    }

    //-----------------------------------------------------------------------
    @Test public void testStandard() throws Exception {
        PeriodType type = PeriodType.standard();
NoAssert.donothing(8, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(6));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(7));
NoAssert.donothing("Standard", type.getName());
NoAssert.donothing("PeriodType[Standard]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.standard());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testYearMonthDayTime() throws Exception {
        PeriodType type = PeriodType.yearMonthDayTime();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing("YearMonthDayTime", type.getName());
        assertEquals("PeriodType[YearMonthDayTime]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.yearMonthDayTime());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.yearMonthDayTime().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testYearMonthDay() throws Exception {
        PeriodType type = PeriodType.yearMonthDay();
NoAssert.donothing(3, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
        assertEquals(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(2));
NoAssert.donothing("YearMonthDay", type.getName());
NoAssert.donothing("PeriodType[YearMonthDay]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.yearMonthDay());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.yearMonthDay().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testYearWeekDayTime() throws Exception {
        PeriodType type = PeriodType.yearWeekDayTime();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(5));
        assertEquals(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing("YearWeekDayTime", type.getName());
NoAssert.donothing("PeriodType[YearWeekDayTime]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.yearWeekDayTime());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testYearWeekDay() throws Exception {
        PeriodType type = PeriodType.yearWeekDay();
NoAssert.donothing(3, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(1));
        assertEquals(DurationFieldType.days(), type.getFieldType(2));
NoAssert.donothing("YearWeekDay", type.getName());
NoAssert.donothing("PeriodType[YearWeekDay]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.yearWeekDay());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.yearWeekDay().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testYearDayTime() throws Exception {
        PeriodType type = PeriodType.yearDayTime();
NoAssert.donothing(6, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(5));
NoAssert.donothing("YearDayTime", type.getName());
NoAssert.donothing("PeriodType[YearDayTime]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.yearDayTime());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.yearDayTime().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
        assertSameAfterSerialization(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testYearDay() throws Exception {
        PeriodType type = PeriodType.yearDay();
NoAssert.donothing(2, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(1));
NoAssert.donothing("YearDay", type.getName());
NoAssert.donothing("PeriodType[YearDay]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.yearDay());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.yearDay().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testDayTime() throws Exception {
        PeriodType type = PeriodType.dayTime();
NoAssert.donothing(5, type.size());
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(4));
NoAssert.donothing("DayTime", type.getName());
NoAssert.donothing("PeriodType[DayTime]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.dayTime());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.dayTime().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testTime() throws Exception {
        PeriodType type = PeriodType.time();
NoAssert.donothing(4, type.size());
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(3));
NoAssert.donothing("Time", type.getName());
        assertEquals("PeriodType[Time]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.time());
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.time().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testYears() throws Exception {
        PeriodType type = PeriodType.years();
NoAssert.donothing(1, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing("Years", type.getName());
NoAssert.donothing("PeriodType[Years]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.years());
NoAssert.donothing(false, type.equals(PeriodType.standard()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.years().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMonths() throws Exception {
        PeriodType type = PeriodType.months();
NoAssert.donothing(1, type.size());
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(0));
NoAssert.donothing("Months", type.getName());
NoAssert.donothing("PeriodType[Months]", type.toString());
NoAssert.donothing(true, type.equals(type));
        assertEquals(true, type == PeriodType.months());
NoAssert.donothing(false, type.equals(PeriodType.standard()));
        assertEquals(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.months().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testWeeks() throws Exception {
        PeriodType type = PeriodType.weeks();
NoAssert.donothing(1, type.size());
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(0));
NoAssert.donothing("Weeks", type.getName());
NoAssert.donothing("PeriodType[Weeks]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.weeks());
NoAssert.donothing(false, type.equals(PeriodType.standard()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.weeks().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testDays() throws Exception {
        PeriodType type = PeriodType.days();
NoAssert.donothing(1, type.size());
        assertEquals(DurationFieldType.days(), type.getFieldType(0));
NoAssert.donothing("Days", type.getName());
NoAssert.donothing("PeriodType[Days]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.days());
        assertEquals(false, type.equals(PeriodType.standard()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.days().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testHours() throws Exception {
        PeriodType type = PeriodType.hours();
NoAssert.donothing(1, type.size());
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(0));
NoAssert.donothing("Hours", type.getName());
NoAssert.donothing("PeriodType[Hours]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.hours());
NoAssert.donothing(false, type.equals(PeriodType.standard()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
        assertEquals(true, type.hashCode() == PeriodType.hours().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMinutes() throws Exception {
        PeriodType type = PeriodType.minutes();
NoAssert.donothing(1, type.size());
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(0));
NoAssert.donothing("Minutes", type.getName());
NoAssert.donothing("PeriodType[Minutes]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.minutes());
NoAssert.donothing(false, type.equals(PeriodType.standard()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.minutes().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testSeconds() throws Exception {
        PeriodType type = PeriodType.seconds();
NoAssert.donothing(1, type.size());
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(0));
NoAssert.donothing("Seconds", type.getName());
NoAssert.donothing("PeriodType[Seconds]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.seconds());
NoAssert.donothing(false, type.equals(PeriodType.standard()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.seconds().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMillis() throws Exception {
        PeriodType type = PeriodType.millis();
NoAssert.donothing(1, type.size());
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(0));
NoAssert.donothing("Millis", type.getName());
NoAssert.donothing("PeriodType[Millis]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.millis());
NoAssert.donothing(false, type.equals(PeriodType.standard()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.standard().hashCode());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testForFields1() throws Exception {
        PeriodType type = PeriodType.forFields(new DurationFieldType[] {
            DurationFieldType.years(),
        });
NoAssert.donothing(PeriodType.years(), type);
        type = PeriodType.forFields(new DurationFieldType[] {
            DurationFieldType.months(),
        });
NoAssert.donothing(PeriodType.months(), type);
        type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.weeks(),
        });
NoAssert.donothing(PeriodType.weeks(), type);
        type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.days(),
        });
NoAssert.donothing(PeriodType.days(), type);
        type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.hours(),
        });
NoAssert.donothing(PeriodType.hours(), type);
        type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.minutes(),
        });
NoAssert.donothing(PeriodType.minutes(), type);
        type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.seconds(),
        });
NoAssert.donothing(PeriodType.seconds(), type);
        type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.millis(),
        });
NoAssert.donothing(PeriodType.millis(), type);
    }

    @Test public void testForFields2() throws Exception {
        DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.years(),
            DurationFieldType.hours(),
        };
        PeriodType type = PeriodType.forFields(types);
NoAssert.donothing(2, type.size());
        assertEquals(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(1));
NoAssert.donothing("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName());
NoAssert.donothing("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.forFields(types));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.forFields(types).hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing(type);
    }

    @Test public void testForFields3() throws Exception {
        DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.months(),
            DurationFieldType.weeks(),
        };
        PeriodType type = PeriodType.forFields(types);
NoAssert.donothing(2, type.size());
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(1));
NoAssert.donothing("StandardNoYearsNoDaysNoHoursNoMinutesNoSecondsNoMillis", type.getName());
NoAssert.donothing("PeriodType[StandardNoYearsNoDaysNoHoursNoMinutesNoSecondsNoMillis]", type.toString());
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type == PeriodType.forFields(types));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.forFields(types).hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
        assertSameAfterSerialization(type);
    }

    @Test public void testForFields4() throws Exception {
        DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.weeks(),
            DurationFieldType.days(),  // adding this makes this test unique, so cache is not pre-populated
            DurationFieldType.months(),
        };
        DurationFieldType[] types2 = new DurationFieldType[] {
            DurationFieldType.months(),
            DurationFieldType.days(),
            DurationFieldType.weeks(),
        };
        PeriodType type = PeriodType.forFields(types);
        PeriodType type2 = PeriodType.forFields(types2);
NoAssert.donothing(true, type == type2);
    }

    @Test public void testForFields5() throws Exception {
        DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.centuries(),
            DurationFieldType.months(),
        };
        try {
            PeriodType.forFields(types);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            PeriodType.forFields(types);  // repeated for test coverage of cache
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void testForFields6() throws Exception {
        DurationFieldType[] types = null;
        try {
            PeriodType.forFields(types);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        
        types = new DurationFieldType[0];
        try {
            PeriodType.forFields(types);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        
        types = new DurationFieldType[] {
            null,
            DurationFieldType.months(),
        };
        try {
            PeriodType.forFields(types);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        
        types = new DurationFieldType[] {
            DurationFieldType.months(),
            null,
        };
        try {
            PeriodType.forFields(types);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    // ensure hash key distribution
    @Test public void testForFields7() throws Exception {
        DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.weeks(),
            DurationFieldType.months(),
        };
        DurationFieldType[] types2 = new DurationFieldType[] {
            DurationFieldType.seconds(),
        };
        PeriodType type = PeriodType.forFields(types);
        PeriodType type2 = PeriodType.forFields(types2);
NoAssert.donothing(false, type == type2);
NoAssert.donothing(false, type.equals(type2));
NoAssert.donothing(false, type.hashCode() == type2.hashCode());
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskYears() throws Exception {
        PeriodType type = PeriodType.standard().withYearsRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing(true, type.equals(type));
        assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoYears", type.getName());
NoAssert.donothing("PeriodType[StandardNoYears]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskMonths() throws Exception {
        PeriodType type = PeriodType.standard().withMonthsRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withMonthsRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withMonthsRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoMonths", type.getName());
NoAssert.donothing("PeriodType[StandardNoMonths]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskWeeks() throws Exception {
        PeriodType type = PeriodType.standard().withWeeksRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(4));
        assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withWeeksRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withWeeksRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoWeeks", type.getName());
NoAssert.donothing("PeriodType[StandardNoWeeks]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskDays() throws Exception {
        PeriodType type = PeriodType.standard().withDaysRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(3));
        assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withDaysRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withDaysRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoDays", type.getName());
NoAssert.donothing("PeriodType[StandardNoDays]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskHours() throws Exception {
        PeriodType type = PeriodType.standard().withHoursRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withHoursRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withHoursRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoHours", type.getName());
NoAssert.donothing("PeriodType[StandardNoHours]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskMinutes() throws Exception {
        PeriodType type = PeriodType.standard().withMinutesRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withMinutesRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoMinutes", type.getName());
NoAssert.donothing("PeriodType[StandardNoMinutes]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskSeconds() throws Exception {
        PeriodType type = PeriodType.standard().withSecondsRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(6));
        assertEquals(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withSecondsRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withSecondsRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoSeconds", type.getName());
NoAssert.donothing("PeriodType[StandardNoSeconds]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskMillis() throws Exception {
        PeriodType type = PeriodType.standard().withMillisRemoved();
NoAssert.donothing(7, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.hours(), type.getFieldType(4));
NoAssert.donothing(DurationFieldType.minutes(), type.getFieldType(5));
NoAssert.donothing(DurationFieldType.seconds(), type.getFieldType(6));
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withMillisRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
        assertEquals(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoMillis", type.getName());
NoAssert.donothing("PeriodType[StandardNoMillis]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskHoursMinutesSeconds() throws Exception {
        PeriodType type = PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved();
NoAssert.donothing(5, type.size());
NoAssert.donothing(DurationFieldType.years(), type.getFieldType(0));
NoAssert.donothing(DurationFieldType.months(), type.getFieldType(1));
NoAssert.donothing(DurationFieldType.weeks(), type.getFieldType(2));
NoAssert.donothing(DurationFieldType.days(), type.getFieldType(3));
NoAssert.donothing(DurationFieldType.millis(), type.getFieldType(4));
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved()));
NoAssert.donothing(false, type.equals(PeriodType.millis()));
NoAssert.donothing(true, type.hashCode() == type.hashCode());
NoAssert.donothing(true, type.hashCode() == PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved().hashCode());
NoAssert.donothing(false, type.hashCode() == PeriodType.millis().hashCode());
NoAssert.donothing("StandardNoHoursNoMinutesNoSeconds", type.getName());
        assertEquals("PeriodType[StandardNoHoursNoMinutesNoSeconds]", type.toString());
NoAssert.donothing(type);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskTwice1() throws Exception {
        PeriodType type = PeriodType.standard().withYearsRemoved();
        PeriodType type2 = type.withYearsRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.standard().withMonthsRemoved();
        type2 = type.withMonthsRemoved();
        assertEquals(true, type == type2);
        
        type = PeriodType.standard().withWeeksRemoved();
        type2 = type.withWeeksRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.standard().withDaysRemoved();
        type2 = type.withDaysRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.standard().withHoursRemoved();
        type2 = type.withHoursRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.standard().withMinutesRemoved();
        type2 = type.withMinutesRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.standard().withSecondsRemoved();
        type2 = type.withSecondsRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.standard().withMillisRemoved();
        type2 = type.withMillisRemoved();
NoAssert.donothing(true, type == type2);
    }

    //-----------------------------------------------------------------------
    @Test public void testMaskTwice2() throws Exception {
        PeriodType type = PeriodType.dayTime();
        PeriodType type2 = type.withYearsRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.dayTime();
        type2 = type.withMonthsRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.dayTime();
        type2 = type.withWeeksRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.millis();
        type2 = type.withDaysRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.millis();
        type2 = type.withHoursRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.millis();
        type2 = type.withMinutesRemoved();
NoAssert.donothing(true, type == type2);
        
        type = PeriodType.millis();
        type2 = type.withSecondsRemoved();
NoAssert.donothing(true, type == type2);
    }

    //-----------------------------------------------------------------------
    @Test public void testEquals() throws Exception {
        PeriodType type = PeriodType.dayTime().withMillisRemoved();
NoAssert.donothing(true, type.equals(type));
NoAssert.donothing(true, type.equals(PeriodType.dayTime().withMillisRemoved()));
NoAssert.donothing(false, type.equals(null));
NoAssert.donothing(false, type.equals(""));
    }

    @Test public void testHashCode() throws Exception {
        PeriodType type = PeriodType.dayTime().withMillisRemoved();
NoAssert.donothing(type.hashCode(), type.hashCode());
    }

    //-----------------------------------------------------------------------
    @Test public void testIsSupported() throws Exception {
        PeriodType type = PeriodType.dayTime().withMillisRemoved();
NoAssert.donothing(false, type.isSupported(DurationFieldType.years()));
NoAssert.donothing(false, type.isSupported(DurationFieldType.months()));
NoAssert.donothing(false, type.isSupported(DurationFieldType.weeks()));
NoAssert.donothing(true, type.isSupported(DurationFieldType.days()));
        assertEquals(true, type.isSupported(DurationFieldType.hours()));
NoAssert.donothing(true, type.isSupported(DurationFieldType.minutes()));
NoAssert.donothing(true, type.isSupported(DurationFieldType.seconds()));
NoAssert.donothing(false, type.isSupported(DurationFieldType.millis()));
    }

    //-----------------------------------------------------------------------
    @Test public void testIndexOf() throws Exception {
        PeriodType type = PeriodType.dayTime().withMillisRemoved();
        assertEquals(-1, type.indexOf(DurationFieldType.years()));
NoAssert.donothing(-1, type.indexOf(DurationFieldType.months()));
NoAssert.donothing(-1, type.indexOf(DurationFieldType.weeks()));
NoAssert.donothing(0, type.indexOf(DurationFieldType.days()));
NoAssert.donothing(1, type.indexOf(DurationFieldType.hours()));
NoAssert.donothing(2, type.indexOf(DurationFieldType.minutes()));
NoAssert.donothing(3, type.indexOf(DurationFieldType.seconds()));
NoAssert.donothing(-1, type.indexOf(DurationFieldType.millis()));
    }

}
