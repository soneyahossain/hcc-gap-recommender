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

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Updates  { //extends TestCase {
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
        TestMutableInterval_Updates TB= new TestMutableInterval_Updates();
        TB.setUp(); TB.testTest(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_long_long1(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_long_long2(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RI_RI1(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RI_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RI_RI3(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RI_RI4(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RI_RI5(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RInterval1(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RInterval2(); TB.tearDown();
        TB.setUp(); TB.testSetInterval_RInterval3(); TB.tearDown();
        TB.setUp(); TB.testSetStartMillis_long1(); TB.tearDown();
        TB.setUp(); TB.testSetStartMillis_long2(); TB.tearDown();
        TB.setUp(); TB.testSetStart_RI1(); TB.tearDown();
        TB.setUp(); TB.testSetStart_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetStart_RI3(); TB.tearDown();
        TB.setUp(); TB.testSetEndMillis_long1(); TB.tearDown();
        TB.setUp(); TB.testSetEndMillis_long2(); TB.tearDown();
        TB.setUp(); TB.testSetEnd_RI1(); TB.tearDown();
        TB.setUp(); TB.testSetEnd_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetEnd_RI3(); TB.tearDown();
        TB.setUp(); TB.testSetDurationAfterStart_long1(); TB.tearDown();
        TB.setUp(); TB.testSeDurationAfterStart_long2(); TB.tearDown();
        TB.setUp(); TB.testSetDurationAfterStart_RI1(); TB.tearDown();
        TB.setUp(); TB.testSeDurationAfterStart_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetDurationAfterStart_RI3(); TB.tearDown();
        TB.setUp(); TB.testSetDurationBeforeEnd_long1(); TB.tearDown();
        TB.setUp(); TB.testSeDurationBeforeEnd_long2(); TB.tearDown();
        TB.setUp(); TB.testSetDurationBeforeEnd_RI1(); TB.tearDown();
        TB.setUp(); TB.testSeDurationBeforeEnd_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetDurationBeforeEnd_RI3(); TB.tearDown();
        TB.setUp(); TB.testSetPeriodAfterStart_RI1(); TB.tearDown();
        TB.setUp(); TB.testSePeriodAfterStart_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriodAfterStart_RI3(); TB.tearDown();
        TB.setUp(); TB.testSetPeriodBeforeEnd_RI1(); TB.tearDown();
        TB.setUp(); TB.testSePeriodBeforeEnd_RI2(); TB.tearDown();
        TB.setUp(); TB.testSetPeriodBeforeEnd_RI3(); TB.tearDown();

    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestMutableInterval_Updates.class);
    }

    public TestMutableInterval_Updates(String name) {
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
    @Test public void testSetInterval_long_long1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setInterval(TEST_TIME1 - 1, TEST_TIME2 + 1);
NoAssert.donothing(TEST_TIME1 - 1, test.getStartMillis());
NoAssert.donothing(TEST_TIME2 + 1, test.getEndMillis());
    }

    @Test public void testSetInterval_long_long2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setInterval(TEST_TIME1 - 1, TEST_TIME1 - 2);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSetInterval_RI_RI1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME2 + 1));
NoAssert.donothing(TEST_TIME1 - 1, test.getStartMillis());
NoAssert.donothing(TEST_TIME2 + 1, test.getEndMillis());
    }

    @Test public void testSetInterval_RI_RI2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME1 - 2));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSetInterval_RI_RI3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setInterval(null, new Instant(TEST_TIME2 + 1));
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(TEST_TIME2 + 1, test.getEndMillis());
    }

    @Test public void testSetInterval_RI_RI4() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setInterval(new Instant(TEST_TIME1 - 1), null);
NoAssert.donothing(TEST_TIME1 - 1, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    @Test public void testSetInterval_RI_RI5() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setInterval(null, null);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetInterval_RInterval1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setInterval(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1));
NoAssert.donothing(TEST_TIME1 - 1, test.getStartMillis());
NoAssert.donothing(TEST_TIME2 + 1, test.getEndMillis());
    }

    @Test public void testSetInterval_RInterval2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setInterval(new MockBadInterval());
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    class MockBadInterval extends AbstractInterval {
        public Chronology getChronology() {
            return ISOChronology.getInstance();
        }
        public long getStartMillis() {
            return TEST_TIME1 - 1;
        }
        public long getEndMillis() {
            return TEST_TIME1 - 2;
        }
    }

    @Test public void testSetInterval_RInterval3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setInterval(null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }
    
    //-----------------------------------------------------------------------
    @Test public void testSetStartMillis_long1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setStartMillis(TEST_TIME1 - 1);
NoAssert.donothing(TEST_TIME1 - 1, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

    @Test public void testSetStartMillis_long2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setStartMillis(TEST_TIME2 + 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSetStart_RI1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setStart(new Instant(TEST_TIME1 - 1));
NoAssert.donothing(TEST_TIME1 - 1, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

    @Test public void testSetStart_RI2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setStart(new Instant(TEST_TIME2 + 1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSetStart_RI3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setStart(null);
NoAssert.donothing(TEST_TIME_NOW, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetEndMillis_long1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setEndMillis(TEST_TIME2 + 1);
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME2 + 1, test.getEndMillis());
    }

    @Test public void testSetEndMillis_long2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setEndMillis(TEST_TIME1 - 1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSetEnd_RI1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setEnd(new Instant(TEST_TIME2 + 1));
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME2 + 1, test.getEndMillis());
    }

    @Test public void testSetEnd_RI2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setEnd(new Instant(TEST_TIME1 - 1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSetEnd_RI3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setEnd(null);
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME_NOW, test.getEndMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDurationAfterStart_long1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setDurationAfterStart(123L);
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME1 + 123L, test.getEndMillis());
    }

    @Test public void testSeDurationAfterStart_long2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setDurationAfterStart(-1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDurationAfterStart_RI1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setDurationAfterStart(new Duration(123L));
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME1 + 123L, test.getEndMillis());
    }

    @Test public void testSeDurationAfterStart_RI2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setDurationAfterStart(new Duration(-1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSetDurationAfterStart_RI3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setDurationAfterStart(null);
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME1, test.getEndMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDurationBeforeEnd_long1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setDurationBeforeEnd(123L);
NoAssert.donothing(TEST_TIME2 - 123L, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

    @Test public void testSeDurationBeforeEnd_long2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setDurationBeforeEnd(-1);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testSetDurationBeforeEnd_RI1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setDurationBeforeEnd(new Duration(123L));
NoAssert.donothing(TEST_TIME2 - 123L, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

    @Test public void testSeDurationBeforeEnd_RI2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setDurationBeforeEnd(new Duration(-1));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSetDurationBeforeEnd_RI3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setDurationBeforeEnd(null);
NoAssert.donothing(TEST_TIME2, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriodAfterStart_RI1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setPeriodAfterStart(new Period(123L));
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME1 + 123L, test.getEndMillis());
    }

    @Test public void testSePeriodAfterStart_RI2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setPeriodAfterStart(new Period(-1L));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSetPeriodAfterStart_RI3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setPeriodAfterStart(null);
NoAssert.donothing(TEST_TIME1, test.getStartMillis());
NoAssert.donothing(TEST_TIME1, test.getEndMillis());
    }

    //-----------------------------------------------------------------------
    @Test public void testSetPeriodBeforeEnd_RI1() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setPeriodBeforeEnd(new Period(123L));
NoAssert.donothing(TEST_TIME2 - 123L, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

    @Test public void testSePeriodBeforeEnd_RI2() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        try {
            test.setPeriodBeforeEnd(new Period(-1L));
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testSetPeriodBeforeEnd_RI3() {
        MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        test.setPeriodBeforeEnd(null);
NoAssert.donothing(TEST_TIME2, test.getStartMillis());
NoAssert.donothing(TEST_TIME2, test.getEndMillis());
    }

}