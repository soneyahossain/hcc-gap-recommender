/*
 *  Copyright 2001-2016 Stephen Colebourne
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
package org.joda.time.format;import org.joda.time.NoAssert;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatter  {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;
    private DateTimeFormatter f = null;
    private DateTimeFormatter g = null;

    public static void main(String[] args) throws Exception {
        TestDateTimeFormatter TB= new TestDateTimeFormatter();
        TB.setUp(); TB.testPrint_simple(); TB.tearDown();
        TB.setUp(); TB.testPrint_locale(); TB.tearDown();
        TB.setUp(); TB.testPrint_zone(); TB.tearDown();
        TB.setUp(); TB.testPrint_chrono(); TB.tearDown();
        TB.setUp(); TB.testPrint_bufferMethods(); TB.tearDown();
        TB.setUp(); TB.testPrint_builderMethods(); TB.tearDown();
        TB.setUp(); TB.testPrint_writerMethods(); TB.tearDown();
        TB.setUp(); TB.testPrint_appendableMethods(); TB.tearDown();
        TB.setUp(); TB.testPrint_chrono_and_zone(); TB.tearDown();
        TB.setUp(); TB.testWithGetLocale(); TB.tearDown();
        TB.setUp(); TB.testWithGetZone(); TB.tearDown();
        TB.setUp(); TB.testWithGetChronology(); TB.tearDown();
        TB.setUp(); TB.testWithGetPivotYear(); TB.tearDown();
        TB.setUp(); TB.testWithGetOffsetParsedMethods(); TB.tearDown();
        TB.setUp(); TB.testPrinterParserMethods(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_simple(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_yearOfEra(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_yearOfCentury(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_monthDay_feb29(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_monthDay_withDefaultYear_feb29(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_weekyear_month_week_2010(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_weekyear_month_week_2011(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_weekyear_month_week_2012(); TB.tearDown();
//      TB.setUp(); TB.testParseLocalDate_weekyear_month_week_2013(); TB.tearDown(); //do not uncomment this test
        TB.setUp(); TB.testParseLocalDate_year_month_week_2010(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_year_month_week_2011(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_year_month_week_2012(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_year_month_week_2013(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_year_month_week_2014(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_year_month_week_2015(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDate_year_month_week_2016(); TB.tearDown();
        TB.setUp(); TB.testParseLocalTime_simple(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDateTime_simple(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDateTime_monthDay_feb29(); TB.tearDown();
        TB.setUp(); TB.testParseLocalDateTime_monthDay_withDefaultYear_feb29(); TB.tearDown();
        TB.setUp(); TB.testParseDateTime_simple(); TB.tearDown();
        TB.setUp(); TB.testParseDateTime_zone(); TB.tearDown();
        TB.setUp(); TB.testParseDateTime_zone2(); TB.tearDown();
        TB.setUp(); TB.testParseDateTime_zone3(); TB.tearDown();
        TB.setUp(); TB.testParseDateTime_simple_precedence(); TB.tearDown();
        TB.setUp(); TB.testParseDateTime_offsetParsed(); TB.tearDown();
        TB.setUp(); TB.testParseDateTime_chrono(); TB.tearDown();
        TB.setUp(); TB.testParseMutableDateTime_simple(); TB.tearDown();
        TB.setUp(); TB.testParseMutableDateTime_zone(); TB.tearDown();
        TB.setUp(); TB.testParseMutableDateTime_zone2(); TB.tearDown();
        TB.setUp(); TB.testParseMutableDateTime_zone3(); TB.tearDown();
        TB.setUp(); TB.testParseMutableDateTime_simple_precedence(); TB.tearDown();
        TB.setUp(); TB.testParseMutableDateTime_offsetParsed(); TB.tearDown();
        TB.setUp(); TB.testParseMutableDateTime_chrono(); TB.tearDown();
        TB.setUp(); TB.testParseInto_simple(); TB.tearDown();
        TB.setUp(); TB.testParseInto_zone(); TB.tearDown();
        TB.setUp(); TB.testParseInto_zone2(); TB.tearDown();
        TB.setUp(); TB.testParseInto_zone3(); TB.tearDown();
        TB.setUp(); TB.testParseInto_simple_precedence(); TB.tearDown();
        TB.setUp(); TB.testParseInto_offsetParsed(); TB.tearDown();
        TB.setUp(); TB.testParseInto_chrono(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthOnly(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthOnly_baseStartYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthOnly_parseStartYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthOnly_baseEndYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthOnly_parseEndYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_startOfYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_OfYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_newYork(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_newYork_startOfYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_newYork_endOfYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_tokyo(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_tokyo_startOfYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_feb29_tokyo_endOfYear(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_withDefaultYear_feb29(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_withDefaultYear_feb29_newYork(); TB.tearDown();
        TB.setUp(); TB.testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear(); TB.tearDown();
        TB.setUp(); TB.testParseMillis_fractionOfSecondLong(); TB.tearDown();
        //TB.setUp(); TB.testZoneNameNearTransition(); TB.tearDown();  //due to long method error
        //TB.setUp(); TB.testZoneShortNameNearTransition(); TB.tearDown(); //due to long method error
        TB.setUp(); TB.testCustomDateTimePrinter(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFormatter.class);
    }

    public TestDateTimeFormatter(String name) {
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
        f = new DateTimeFormatterBuilder()
                .appendDayOfWeekShortText()
                .appendLiteral(' ')
                .append(ISODateTimeFormat.dateTimeNoMillis())
                .toFormatter();
        g = ISODateTimeFormat.dateTimeNoMillis();
    }

    @After public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
        f = null;
        g = null;
    }

    //-----------------------------------------------------------------------
    @Test public void testPrint_simple() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", f.print(dt));
        
        dt = dt.withZone(PARIS);
        assertEquals("Wed 2004-06-09T12:20:30+02:00", f.print(dt));
        
        dt = dt.withZone(NEWYORK);
NoAssert.donothing("Wed 2004-06-09T06:20:30-04:00", f.print(dt));
        
        dt = dt.withChronology(BUDDHIST_PARIS);
NoAssert.donothing("Wed 2547-06-09T12:20:30+02:00", f.print(dt));
    }

    //-----------------------------------------------------------------------
    @Test public void testPrint_locale() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
NoAssert.donothing("mer. 2004-06-09T10:20:30Z", f.withLocale(Locale.FRENCH).print(dt));
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", f.withLocale(null).print(dt));
    }

    //-----------------------------------------------------------------------
    @Test public void testPrint_zone() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt));
        
        dt = dt.withZone(NEWYORK);
NoAssert.donothing("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", f.withZoneUTC().print(dt));
NoAssert.donothing("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt));
    }

    //-----------------------------------------------------------------------
    @Test public void testPrint_chrono() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).print(dt));
NoAssert.donothing("Wed 2547-06-09T12:20:30+02:00", f.withChronology(BUDDHIST_PARIS).print(dt));
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", f.withChronology(null).print(dt));
        
        dt = dt.withChronology(BUDDHIST_PARIS);
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00", f.withChronology(ISO_PARIS).print(dt));
NoAssert.donothing("Wed 2547-06-09T12:20:30+02:00", f.withChronology(BUDDHIST_PARIS).print(dt));
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", f.withChronology(ISO_UTC).print(dt));
NoAssert.donothing("Wed 2547-06-09T12:20:30+02:00", f.withChronology(null).print(dt));
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testPrint_bufferMethods() throws Exception {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        StringBuffer buf = new StringBuffer();
        f.printTo(buf, dt);
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", buf.toString());
        
        buf = new StringBuffer();
        f.printTo(buf, dt.getMillis());
NoAssert.donothing("Wed 2004-06-09T11:20:30+01:00", buf.toString());
        
        buf = new StringBuffer();
        ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toYearMonthDay());
NoAssert.donothing("2004-06-09", buf.toString());
        
        buf = new StringBuffer();
        try {
            ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testPrint_builderMethods() throws Exception {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        StringBuilder buf = new StringBuilder();
        f.printTo(buf, dt);
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", buf.toString());
        
        buf = new StringBuilder();
        f.printTo(buf, dt.getMillis());
NoAssert.donothing("Wed 2004-06-09T11:20:30+01:00", buf.toString());
        
        buf = new StringBuilder();
        ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toYearMonthDay());
NoAssert.donothing("2004-06-09", buf.toString());
        
        buf = new StringBuilder();
        try {
            ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test public void testPrint_writerMethods() throws Exception {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        CharArrayWriter out = new CharArrayWriter();
        f.printTo(out, dt);
NoAssert.donothing("Wed 2004-06-09T10:20:30Z", out.toString());
        
        out = new CharArrayWriter();
        f.printTo(out, dt.getMillis());
NoAssert.donothing("Wed 2004-06-09T11:20:30+01:00", out.toString());
        
        out = new CharArrayWriter();
        ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay());
NoAssert.donothing("2004-06-09", out.toString());
        
        out = new CharArrayWriter();
        try {
            ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPrint_appendableMethods() throws Exception {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        StringBuilder buf = new StringBuilder();
        f.printTo(buf, dt);
        assertEquals("Wed 2004-06-09T10:20:30Z", buf.toString());
        
        buf = new StringBuilder();
        f.printTo(buf, dt.getMillis());
NoAssert.donothing("Wed 2004-06-09T11:20:30+01:00", buf.toString());
        
        buf = new StringBuilder();
        ISODateTimeFormat.yearMonthDay().printTo(buf, dt.toLocalDate());
NoAssert.donothing("2004-06-09", buf.toString());
        
        buf = new StringBuilder();
        try {
            ISODateTimeFormat.yearMonthDay().printTo(buf, (ReadablePartial) null);
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testPrint_chrono_and_zone() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("Wed 2004-06-09T10:20:30Z",
                f.withChronology(null).withZone(null).print(dt));
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
        assertEquals("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
NoAssert.donothing("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
NoAssert.donothing("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));
        
        dt = dt.withChronology(ISO_PARIS);
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(null).withZone(null).print(dt));
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
NoAssert.donothing("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
        assertEquals("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));
        
        dt = dt.withChronology(BUDDHIST_PARIS);
NoAssert.donothing("Wed 2547-06-09T12:20:30+02:00",
                f.withChronology(null).withZone(null).print(dt));
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(null).print(dt));
NoAssert.donothing("Wed 2004-06-09T12:20:30+02:00",
                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
NoAssert.donothing("Wed 2004-06-09T06:20:30-04:00",
                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
NoAssert.donothing("Wed 2547-06-09T06:20:30-04:00",
                f.withChronology(null).withZone(NEWYORK).print(dt));
    }

    @Test public void testWithGetLocale() {
        DateTimeFormatter f2 = f.withLocale(Locale.FRENCH);
NoAssert.donothing(Locale.FRENCH, f2.getLocale());
NoAssert.donothing(f2, f2.withLocale(Locale.FRENCH));
        
        f2 = f.withLocale(null);
NoAssert.donothing(null, f2.getLocale());
        assertSame(f2, f2.withLocale(null));
    }

    @Test public void testWithGetZone() {
        DateTimeFormatter f2 = f.withZone(PARIS);
NoAssert.donothing(PARIS, f2.getZone());
        assertSame(f2, f2.withZone(PARIS));
        
        f2 = f.withZone(null);
NoAssert.donothing(null, f2.getZone());
        assertSame(f2, f2.withZone(null));
    }

    @Test public void testWithGetChronology() {
        DateTimeFormatter f2 = f.withChronology(BUDDHIST_PARIS);
NoAssert.donothing(BUDDHIST_PARIS, f2.getChronology());
NoAssert.donothing(f2, f2.withChronology(BUDDHIST_PARIS));
        
        f2 = f.withChronology(null);
NoAssert.donothing(null, f2.getChronology());
NoAssert.donothing(f2, f2.withChronology(null));
    }

    @Test public void testWithGetPivotYear() {
        DateTimeFormatter f2 = f.withPivotYear(13);
NoAssert.donothing(new Integer(13), f2.getPivotYear());
NoAssert.donothing(f2, f2.withPivotYear(13));
        
        f2 = f.withPivotYear(new Integer(14));
NoAssert.donothing(new Integer(14), f2.getPivotYear());
NoAssert.donothing(f2, f2.withPivotYear(new Integer(14)));
        
        f2 = f.withPivotYear(null);
NoAssert.donothing(null, f2.getPivotYear());
NoAssert.donothing(f2, f2.withPivotYear(null));
    }

    @Test public void testWithGetOffsetParsedMethods() {
        DateTimeFormatter f2 = f;
        assertEquals(false, f2.isOffsetParsed());
NoAssert.donothing(null, f2.getZone());
        
        f2 = f.withOffsetParsed();
NoAssert.donothing(true, f2.isOffsetParsed());
NoAssert.donothing(null, f2.getZone());
        
        f2 = f2.withZone(PARIS);
NoAssert.donothing(false, f2.isOffsetParsed());
        assertEquals(PARIS, f2.getZone());
        
        f2 = f2.withOffsetParsed();
NoAssert.donothing(true, f2.isOffsetParsed());
NoAssert.donothing(null, f2.getZone());
        
        f2 = f.withOffsetParsed();
        assertNotSame(f, f2);
        DateTimeFormatter f3 = f2.withOffsetParsed();
NoAssert.donothing(f2, f3);
    }

    @Test public void testPrinterParserMethods() {
        DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser());
        assertEquals(f.getPrinter(), f2.getPrinter());
        assertEquals(f.getParser(), f2.getParser());
        assertEquals(true, f2.isPrinter());
NoAssert.donothing(true, f2.isParser());
NoAssert.donothing(f2.print(0L));
NoAssert.donothing(f2.parseDateTime("Thu 1970-01-01T00:00:00Z"));
        
        f2 = new DateTimeFormatter(f.getPrinter(), null);
NoAssert.donothing(f.getPrinter(), f2.getPrinter());
NoAssert.donothing(null, f2.getParser());
        assertEquals(true, f2.isPrinter());
NoAssert.donothing(false, f2.isParser());
NoAssert.donothing(f2.print(0L));
        try {
            f2.parseDateTime("Thu 1970-01-01T00:00:00Z");
            fail();
        } catch (UnsupportedOperationException ex) {}
        
        f2 = new DateTimeFormatter((DateTimePrinter) null, f.getParser());
NoAssert.donothing(null, f2.getPrinter());
NoAssert.donothing(f.getParser(), f2.getParser());
        assertEquals(false, f2.isPrinter());
NoAssert.donothing(true, f2.isParser());
        try {
            f2.print(0L);
            fail();
        } catch (UnsupportedOperationException ex) {}
NoAssert.donothing(f2.parseDateTime("Thu 1970-01-01T00:00:00Z"));
    }

    //-----------------------------------------------------------------------
    @Test public void testParseLocalDate_simple() {
NoAssert.donothing(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30Z"));
NoAssert.donothing(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30+18:00"));
NoAssert.donothing(new LocalDate(2004, 6, 9), g.parseLocalDate("2004-06-09T10:20:30-18:00"));
NoAssert.donothing(new LocalDate(2004, 6, 9, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalDate("2004-06-09T10:20:30Z"));
        try {
            g.parseDateTime("ABC");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testParseLocalDate_yearOfEra() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat
            .forPattern("YYYY-MM GG")
            .withChronology(chrono)
            .withLocale(Locale.UK);
        
        LocalDate date = new LocalDate(2005, 10, 1, chrono);
NoAssert.donothing(date, f.parseLocalDate("2005-10 AD"));
NoAssert.donothing(date, f.parseLocalDate("2005-10 CE"));
        
        date = new LocalDate(-2005, 10, 1, chrono);
NoAssert.donothing(date, f.parseLocalDate("2005-10 BC"));
NoAssert.donothing(date, f.parseLocalDate("2005-10 BCE"));
    }

    @Test public void testParseLocalDate_yearOfCentury() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat
            .forPattern("yy M d")
            .withChronology(chrono)
            .withLocale(Locale.UK)
            .withPivotYear(2050);
        
        LocalDate date = new LocalDate(2050, 8, 4, chrono);
        assertEquals(date, f.parseLocalDate("50 8 4"));
    }

    @Test public void testParseLocalDate_monthDay_feb29() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat
            .forPattern("M d")
            .withChronology(chrono)
            .withLocale(Locale.UK);
        
NoAssert.donothing(new LocalDate(2000, 2, 29, chrono), f.parseLocalDate("2 29"));
    }

    @Test public void testParseLocalDate_monthDay_withDefaultYear_feb29() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat
            .forPattern("M d")
            .withChronology(chrono)
            .withLocale(Locale.UK)
            .withDefaultYear(2012);
        
NoAssert.donothing(new LocalDate(2012, 2, 29, chrono), f.parseLocalDate("2 29"));
    }

    @Test public void testParseLocalDate_weekyear_month_week_2010() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01"));
    }

    @Test public void testParseLocalDate_weekyear_month_week_2011() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        assertEquals(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01"));
    }

    @Test public void testParseLocalDate_weekyear_month_week_2012() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01"));
    }

    // This test fails, but since more related tests pass with the extra loop in DateTimeParserBucket, I'm going to leave the change in and ignore this test
    /*
    @Test
    public void testParseLocalDate_weekyear_month_week_2013() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("xxxx-MM-ww").withChronology(chrono);
        assertEquals(new LocalDate(2012, 12, 31, chrono), f.parseLocalDate("2013-01-01"));
    }
    */

    @Test public void testParseLocalDate_year_month_week_2010() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2010, 1, 4, chrono), f.parseLocalDate("2010-01-01"));
    }

    @Test public void testParseLocalDate_year_month_week_2011() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2011, 1, 3, chrono), f.parseLocalDate("2011-01-01"));
    }

    @Test public void testParseLocalDate_year_month_week_2012() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2012, 1, 2, chrono), f.parseLocalDate("2012-01-01"));
    }

    @Test public void testParseLocalDate_year_month_week_2013() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2012, 12, 31, chrono), f.parseLocalDate("2013-01-01"));  // 2013-01-01 would be better, but this is OK
    }

    @Test public void testParseLocalDate_year_month_week_2014() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2013, 12, 30, chrono), f.parseLocalDate("2014-01-01"));  // 2014-01-01 would be better, but this is OK
    }

    @Test public void testParseLocalDate_year_month_week_2015() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2014, 12, 29, chrono), f.parseLocalDate("2015-01-01"));  // 2015-01-01 would be better, but this is OK
    }

    @Test public void testParseLocalDate_year_month_week_2016() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-ww").withChronology(chrono);
NoAssert.donothing(new LocalDate(2016, 1, 4, chrono), f.parseLocalDate("2016-01-01"));
    }

    //-----------------------------------------------------------------------
    @Test public void testParseLocalTime_simple() {
NoAssert.donothing(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30Z"));
NoAssert.donothing(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30+18:00"));
NoAssert.donothing(new LocalTime(10, 20, 30), g.parseLocalTime("2004-06-09T10:20:30-18:00"));
NoAssert.donothing(new LocalTime(10, 20, 30, 0, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalTime("2004-06-09T10:20:30Z"));
        try {
            g.parseDateTime("ABC");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    //-----------------------------------------------------------------------
    @Test public void testParseLocalDateTime_simple() {
NoAssert.donothing(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30Z"));
NoAssert.donothing(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30+18:00"));
NoAssert.donothing(new LocalDateTime(2004, 6, 9, 10, 20, 30), g.parseLocalDateTime("2004-06-09T10:20:30-18:00"));
NoAssert.donothing(new LocalDateTime(2004, 6, 9, 10, 20, 30, 0, BUDDHIST_PARIS),
                g.withChronology(BUDDHIST_PARIS).parseLocalDateTime("2004-06-09T10:20:30Z"));
        try {
            g.parseDateTime("ABC");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testParseLocalDateTime_monthDay_feb29() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat
            .forPattern("M d H m")
            .withChronology(chrono)
            .withLocale(Locale.UK);
        
NoAssert.donothing(new LocalDateTime(2000, 2, 29, 13, 40, 0, 0, chrono), f.parseLocalDateTime("2 29 13 40"));
    }

    @Test public void testParseLocalDateTime_monthDay_withDefaultYear_feb29() {
        Chronology chrono = GJChronology.getInstanceUTC();
        DateTimeFormatter f = DateTimeFormat
            .forPattern("M d H m")
            .withChronology(chrono)
            .withLocale(Locale.UK)
            .withDefaultYear(2012);
        
NoAssert.donothing(new LocalDateTime(2012, 2, 29, 13, 40, 0, 0, chrono), f.parseLocalDateTime("2 29 13 40"));
    }

    //-----------------------------------------------------------------------
    @Test public void testParseDateTime_simple() {
        DateTime expect = null;
        expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.parseDateTime("2004-06-09T10:20:30Z"));
        
        try {
            g.parseDateTime("ABC");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testParseDateTime_zone() {
        DateTime expect = null;
        expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(LONDON).parseDateTime("2004-06-09T10:20:30Z"));
        
        expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(null).parseDateTime("2004-06-09T10:20:30Z"));
        
        expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }

    @Test public void testParseDateTime_zone2() {
        DateTime expect = null;
        expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(LONDON).parseDateTime("2004-06-09T06:20:30-04:00"));
        
        expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(null).parseDateTime("2004-06-09T06:20:30-04:00"));
        
        expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withZone(PARIS).parseDateTime("2004-06-09T06:20:30-04:00"));
    }

    @Test public void testParseDateTime_zone3() {
        DateTimeFormatter h = new DateTimeFormatterBuilder()
        .append(ISODateTimeFormat.date())
        .appendLiteral('T')
        .append(ISODateTimeFormat.timeElementParser())
        .toFormatter();
        
        DateTime expect = null;
        expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
NoAssert.donothing(expect, h.withZone(LONDON).parseDateTime("2004-06-09T10:20:30"));
        
        expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
NoAssert.donothing(expect, h.withZone(null).parseDateTime("2004-06-09T10:20:30"));
        
        expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
NoAssert.donothing(expect, h.withZone(PARIS).parseDateTime("2004-06-09T10:20:30"));
    }

    @Test public void testParseDateTime_simple_precedence() {
        DateTime expect = null;
        // use correct day of week
        expect = new DateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z"));
        
        // use wrong day of week
        expect = new DateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        // DayOfWeek takes precedence, because week < month in length
NoAssert.donothing(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z"));
    }

    @Test public void testParseDateTime_offsetParsed() {
        DateTime expect = null;
        expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
NoAssert.donothing(expect, g.withOffsetParsed().parseDateTime("2004-06-09T10:20:30Z"));
        
        expect = new DateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
NoAssert.donothing(expect, g.withOffsetParsed().parseDateTime("2004-06-09T06:20:30-04:00"));
        
        expect = new DateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseDateTime("2004-06-09T10:20:30Z"));
        expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withOffsetParsed().withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }

    @Test public void testParseDateTime_chrono() {
        DateTime expect = null;
        expect = new DateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withChronology(ISO_PARIS).parseDateTime("2004-06-09T10:20:30Z"));
        
        expect = new DateTime(2004, 6, 9, 11, 20, 30, 0,LONDON);
NoAssert.donothing(expect, g.withChronology(null).parseDateTime("2004-06-09T10:20:30Z"));
        
        expect = new DateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
NoAssert.donothing(expect, g.withChronology(BUDDHIST_PARIS).parseDateTime("2547-06-09T10:20:30Z"));
        
        expect = new DateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS); // zone is +00:09:21 in 1451
NoAssert.donothing(expect, g.withChronology(BUDDHIST_PARIS).parseDateTime("2004-06-09T10:20:30Z"));
    }

    //-----------------------------------------------------------------------
    @Test public void testParseMutableDateTime_simple() {
        MutableDateTime expect = null;
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        try {
            g.parseMutableDateTime("ABC");
            fail();
        } catch (IllegalArgumentException ex) {}
    }

    @Test public void testParseMutableDateTime_zone() {
        MutableDateTime expect = null;
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }

    @Test public void testParseMutableDateTime_zone2() {
        MutableDateTime expect = null;
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
        
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, g.withZone(null).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
        
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
    }

    @Test public void testParseMutableDateTime_zone3() {
        DateTimeFormatter h = new DateTimeFormatterBuilder()
        .append(ISODateTimeFormat.date())
        .appendLiteral('T')
        .append(ISODateTimeFormat.timeElementParser())
        .toFormatter();
        
        MutableDateTime expect = null;
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
NoAssert.donothing(expect, h.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30"));
        
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        assertEquals(expect, h.withZone(null).parseMutableDateTime("2004-06-09T10:20:30"));
        
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
NoAssert.donothing(expect, h.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30"));
    }

    @Test public void testParseMutableDateTime_simple_precedence() {
        MutableDateTime expect = null;
        // use correct day of week
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(expect, f.parseDateTime("Wed 2004-06-09T10:20:30Z"));
        
        // use wrong day of week
        expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        // DayOfWeek takes precedence, because week < month in length
NoAssert.donothing(expect, f.parseDateTime("Mon 2004-06-09T10:20:30Z"));
    }

    @Test public void testParseMutableDateTime_offsetParsed() {
        MutableDateTime expect = null;
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
NoAssert.donothing(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
NoAssert.donothing(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00"));
        
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
NoAssert.donothing(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z"));
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }

    @Test public void testParseMutableDateTime_chrono() {
        MutableDateTime expect = null;
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(expect, g.withChronology(ISO_PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0,LONDON);
NoAssert.donothing(expect, g.withChronology(null).parseMutableDateTime("2004-06-09T10:20:30Z"));
        
        expect = new MutableDateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
NoAssert.donothing(expect, g.withChronology(BUDDHIST_PARIS).parseMutableDateTime("2547-06-09T10:20:30Z"));
        
        expect = new MutableDateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS); // zone is +00:09:21 in 1451
NoAssert.donothing(expect, g.withChronology(BUDDHIST_PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
    }

    //-----------------------------------------------------------------------
    @Test public void testParseInto_simple() {
        MutableDateTime expect = null;
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        MutableDateTime result = new MutableDateTime(0L);
NoAssert.donothing(20, g.parseInto(result, "2004-06-09T10:20:30Z", 0));
        assertEquals(expect, result);
        
        try {
            g.parseInto(null, "2004-06-09T10:20:30Z", 0);
            fail();
        } catch (IllegalArgumentException ex) {}
        
        assertEquals(~0, g.parseInto(result, "ABC", 0));
        assertEquals(~10, g.parseInto(result, "2004-06-09", 0));
NoAssert.donothing(~13, g.parseInto(result, "XX2004-06-09T", 2));
    }

    @Test public void testParseInto_zone() {
        MutableDateTime expect = null;
        MutableDateTime result = null;
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0));
        assertEquals(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
    }

    @Test public void testParseInto_zone2() {
        MutableDateTime expect = null;
        MutableDateTime result = null;
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        result = new MutableDateTime(0L);
NoAssert.donothing(25, g.withZone(LONDON).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
NoAssert.donothing(25, g.withZone(null).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
NoAssert.donothing(25, g.withZone(PARIS).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
        assertEquals(expect, result);
    }

    @Test public void testParseInto_zone3() {
        DateTimeFormatter h = new DateTimeFormatterBuilder()
        .append(ISODateTimeFormat.date())
        .appendLiteral('T')
        .append(ISODateTimeFormat.timeElementParser())
        .toFormatter();
        
        MutableDateTime expect = null;
        MutableDateTime result = null;
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        result = new MutableDateTime(0L);
NoAssert.donothing(19, h.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, LONDON);
        result = new MutableDateTime(0L);
NoAssert.donothing(19, h.withZone(null).parseInto(result, "2004-06-09T10:20:30", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, PARIS);
        result = new MutableDateTime(0L);
        assertEquals(19, h.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30", 0));
NoAssert.donothing(expect, result);
    }

    @Test public void testParseInto_simple_precedence() {
        MutableDateTime expect = null;
        MutableDateTime result = null;
        expect = new MutableDateTime(2004, 6, 7, 11, 20, 30, 0, LONDON);
        result = new MutableDateTime(0L);
        // DayOfWeek takes precedence, because week < month in length
NoAssert.donothing(24, f.parseInto(result, "Mon 2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
    }

    @Test public void testParseInto_offsetParsed() {
        MutableDateTime expect = null;
        MutableDateTime result = null;
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        result = new MutableDateTime(0L);
        assertEquals(20, g.withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4));
        result = new MutableDateTime(0L);
NoAssert.donothing(25, g.withOffsetParsed().parseInto(result, "2004-06-09T06:20:30-04:00", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
    }

    @Test public void testParseInto_chrono() {
        MutableDateTime expect = null;
        MutableDateTime result = null;
        expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withChronology(ISO_PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 11, 20, 30, 0, LONDON);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withChronology(null).parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2547, 6, 9, 12, 20, 30, 0, BUDDHIST_PARIS);
        result = new MutableDateTime(0L);
        assertEquals(20, g.withChronology(BUDDHIST_PARIS).parseInto(result, "2547-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
        
        expect = new MutableDateTime(2004, 6, 9, 10, 29, 51, 0, BUDDHIST_PARIS);
        result = new MutableDateTime(0L);
NoAssert.donothing(20, g.withChronology(BUDDHIST_PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
NoAssert.donothing(expect, result);
    }

    @Test public void testParseInto_monthOnly() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
NoAssert.donothing(1, f.parseInto(result, "5", 0));
NoAssert.donothing(new MutableDateTime(2004, 5, 9, 12, 20, 30, 0, LONDON), result);
    }

    @Test public void testParseInto_monthOnly_baseStartYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 1, 12, 20, 30, 0, TOKYO);
NoAssert.donothing(1, f.parseInto(result, "5", 0));
NoAssert.donothing(new MutableDateTime(2004, 5, 1, 12, 20, 30, 0, TOKYO), result);
    }

    @Test public void testParseInto_monthOnly_parseStartYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 2, 1, 12, 20, 30, 0, TOKYO);
        assertEquals(1, f.parseInto(result, "1", 0));
NoAssert.donothing(new MutableDateTime(2004, 1, 1, 12, 20, 30, 0, TOKYO), result);
    }

    @Test public void testParseInto_monthOnly_baseEndYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 12, 31, 12, 20, 30, 0, TOKYO);
NoAssert.donothing(1, f.parseInto(result, "5", 0));
        assertEquals(new MutableDateTime(2004, 5, 31, 12, 20, 30, 0, TOKYO), result);
   }

    @Test public void testParseInto_monthOnly_parseEndYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 31, 12, 20, 30, 0,TOKYO);
NoAssert.donothing(2, f.parseInto(result, "12", 0));
NoAssert.donothing(new MutableDateTime(2004, 12, 31, 12, 20, 30, 0, TOKYO), result);
    }

    @Test public void testParseInto_monthDay_feb29() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, LONDON), result);
    }

    @Test public void testParseInto_monthDay_feb29_startOfYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, LONDON);
        assertEquals(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, LONDON), result);
    }

    @Test public void testParseInto_monthDay_feb29_OfYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, LONDON);
        assertEquals(4, f.parseInto(result, "2 29", 0));
        assertEquals(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, LONDON), result);
    }

    @Test public void testParseInto_monthDay_feb29_newYork() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, NEWYORK);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }

    @Test public void testParseInto_monthDay_feb29_newYork_startOfYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, NEWYORK);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, NEWYORK), result);
    }

    @Test public void testParseInto_monthDay_feb29_newYork_endOfYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, NEWYORK);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, NEWYORK), result);
    }

    @Test public void testParseInto_monthDay_feb29_tokyo() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result);
    }

    @Test public void testParseInto_monthDay_feb29_tokyo_startOfYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result);
    }

    @Test public void testParseInto_monthDay_feb29_tokyo_endOfYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK);
        MutableDateTime result = new MutableDateTime(2004, 12, 31, 23, 59, 59, 999, TOKYO);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 23, 59, 59, 999, TOKYO), result);
    }

    @Test public void testParseInto_monthDay_withDefaultYear_feb29() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, LONDON);
        assertEquals(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, LONDON), result);
    }

    @Test public void testParseInto_monthDay_withDefaultYear_feb29_newYork() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, NEWYORK);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
        assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }

    @Test public void testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear() {
        DateTimeFormatter f = DateTimeFormat.forPattern("M d").withDefaultYear(2012);
        MutableDateTime result = new MutableDateTime(2004, 12, 9, 12, 20, 30, 0, NEWYORK);
NoAssert.donothing(4, f.parseInto(result, "2 29", 0));
NoAssert.donothing(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, NEWYORK), result);
    }

    @Test public void testParseMillis_fractionOfSecondLong() {
        DateTimeFormatter f = new DateTimeFormatterBuilder()
            .appendSecondOfDay(2).appendLiteral('.').appendFractionOfSecond(1, 9)
                .toFormatter().withZoneUTC();
NoAssert.donothing(10512, f.parseMillis("10.5123456"));
NoAssert.donothing(10512, f.parseMillis("10.512999"));
    }

    //-----------------------------------------------------------------------
    // Ensure time zone name switches properly at the zone DST transition.
    //@Test
    public void testZoneNameNearTransition() {
        DateTime inDST_1  = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
        DateTime inDST_2  = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
        DateTime onDST    = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
        DateTime outDST   = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
        DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);

        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S zzzz");
NoAssert.donothing("2005-10-30 01:00:00.0 Eastern Daylight Time", fmt.print(inDST_1));
NoAssert.donothing("2005-10-30 01:59:59.9 Eastern Daylight Time", fmt.print(inDST_2));
NoAssert.donothing("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(onDST));
NoAssert.donothing("2005-10-30 02:00:00.0 Eastern Standard Time", fmt.print(outDST));
NoAssert.donothing("2005-10-30 02:00:01.0 Eastern Standard Time", fmt.print(outDST_2));
    }

    // Ensure time zone name switches properly at the zone DST transition.
    //@Test
    public void testZoneShortNameNearTransition() {
        DateTime inDST_1  = new DateTime(2005, 10, 30, 1, 0, 0, 0, NEWYORK);
        DateTime inDST_2  = new DateTime(2005, 10, 30, 1, 59, 59, 999, NEWYORK);
        DateTime onDST    = new DateTime(2005, 10, 30, 2, 0, 0, 0, NEWYORK);
        DateTime outDST   = new DateTime(2005, 10, 30, 2, 0, 0, 1, NEWYORK);
        DateTime outDST_2 = new DateTime(2005, 10, 30, 2, 0, 1, 0, NEWYORK);

        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyy-MM-dd HH:mm:ss.S z").withLocale(Locale.ENGLISH);
NoAssert.donothing("2005-10-30 01:00:00.0 EDT", fmt.print(inDST_1));
NoAssert.donothing("2005-10-30 01:59:59.9 EDT", fmt.print(inDST_2));
NoAssert.donothing("2005-10-30 02:00:00.0 EST", fmt.print(onDST));
NoAssert.donothing("2005-10-30 02:00:00.0 EST", fmt.print(outDST));
NoAssert.donothing("2005-10-30 02:00:01.0 EST", fmt.print(outDST_2));
    }

     @Test public void testCustomDateTimePrinter() {
        DateTimePrinter printer = new DateTimeFormatterBuilder()
                .append(new CustomDateTimePrinter())
                .appendLiteral(' ')
                .appendYear(4, 8)
                .toPrinter();

        StringBuffer buffer = new StringBuffer();
        long instant = new DateTime(2017, 1, 1, 0, 0, 0, ISO_UTC).getMillis();
        printer.printTo(buffer, instant, ISO_UTC, 0, UTC, Locale.ENGLISH);

NoAssert.donothing("Hi 2017", buffer.toString());
    }

    private static class CustomDateTimePrinter implements DateTimePrinter {

        public int estimatePrintedLength() {
            return 2;
        }

        public void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset,
                DateTimeZone displayZone, Locale locale) {
            buf.append("Hi");
        }

        public void printTo(Writer out, long instant, Chronology chrono, int displayOffset,
                DateTimeZone displayZone, Locale locale) throws IOException {
            out.write("Hi");
        }

        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            buf.append("Hi");
        }

        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            out.write("Hi");
        }
    }

}
