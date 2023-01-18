/*
 *  Copyright 2001-2011 Stephen Colebourne
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

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import junit.framework.AssertionFailedError;
import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/**
 * This class is a Junit unit test for DateTimeFormatterBuilder.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 */
public class TestDateTimeFormatterBuilder  { //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");
    private static final DateTimeZone OFFSET_0200 = DateTimeZone.forID("+02:00");
    private static final DateTimeZone OFFSET_023012 = DateTimeZone.forID("+02:30:12");

    public static void main(String[] args) throws Exception  {
        TestDateTimeFormatterBuilder TB= new TestDateTimeFormatterBuilder();
        TB.setUp(); TB.test_toFormatter(); TB.tearDown();
        TB.setUp(); TB.test_toPrinter(); TB.tearDown();
        TB.setUp(); TB.test_toParser(); TB.tearDown();
        TB.setUp(); TB.test_canBuildFormatter(); TB.tearDown();
        TB.setUp(); TB.test_canBuildPrinter(); TB.tearDown();
        TB.setUp(); TB.test_canBuildParser(); TB.tearDown();
        TB.setUp(); TB.test_append_Formatter(); TB.tearDown();
        TB.setUp(); TB.test_append_Printer(); TB.tearDown();
        TB.setUp(); TB.test_append_nullPrinter(); TB.tearDown();
        TB.setUp(); TB.test_append_Parser(); TB.tearDown();
        TB.setUp(); TB.test_append_nullParser(); TB.tearDown();
        TB.setUp(); TB.test_append_Printer_nullParser(); TB.tearDown();
        TB.setUp(); TB.test_append_nullPrinter_Parser(); TB.tearDown();
        TB.setUp(); TB.test_appendOptional_Parser(); TB.tearDown();
        TB.setUp(); TB.test_appendOptional_nullParser(); TB.tearDown();
        TB.setUp(); TB.test_appendFixedDecimal(); TB.tearDown();
        TB.setUp(); TB.test_appendFixedSignedDecimal(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_parse(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_print_min1max1(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_print_min1max2(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_print_min1max3(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_print_min2max2(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_print_min2max3(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_print_min3max3(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_invalidText(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneOffset_zeroMinInvalid(); TB.tearDown();
        TB.setUp(); TB.test_appendTimeZoneId(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneTokyo(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneParis(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneDawson(); TB.tearDown();  // clashes with shorter Dawson
        TB.setUp(); TB.test_printParseZoneDawson_suffix(); TB.tearDown();  // clashes with shorter Dawson
        TB.setUp(); TB.test_printParseZoneDawsonCreek(); TB.tearDown();  // clashes with shorter Dawson
        TB.setUp(); TB.test_printParseZoneDawsonCreek_suffix(); TB.tearDown();  // clashes with shorter Dawson
        TB.setUp(); TB.test_printParseZoneEtcGMT(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneEtcGMT_suffix(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneGMT(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneGMT_suffix(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneEtcGMT1(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneEtcGMT1_suffix(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneEtcGMT10(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneEtcGMT10_suffix(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneMET(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneMET_suffix(); TB.tearDown();
        TB.setUp(); TB.test_printParseZoneBahiaBanderas(); TB.tearDown();
        TB.setUp(); TB.test_printParseOffset(); TB.tearDown();
        TB.setUp(); TB.test_printParseOffsetAndZone(); TB.tearDown();
        TB.setUp(); TB.test_parseWrongOffset(); TB.tearDown();
        TB.setUp(); TB.test_parseWrongOffsetAndZone(); TB.tearDown();
        TB.setUp(); TB.test_localPrintParseZoneTokyo(); TB.tearDown();
        TB.setUp(); TB.test_localPrintParseOffset(); TB.tearDown();
        TB.setUp(); TB.test_localPrintParseOffsetAndZone(); TB.tearDown();
        TB.setUp(); TB.test_localParseWrongOffsetAndZone(); TB.tearDown();
        //TB.setUp(); TB.test_printParseShortName(); TB.tearDown();   //due to long method error
        //TB.setUp(); TB.test_printParseShortNameWithLookup(); TB.tearDown();  //due to long method error
        //TB.setUp(); TB.test_printParseShortNameWithAutoLookup(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.test_printParseLongName(); TB.tearDown();  //Method code too large!
        //TB.setUp(); TB.test_printParseLongNameWithLookup(); TB.tearDown(); //Method code too large!


    }
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFormatterBuilder.class);
    }

    public TestDateTimeFormatterBuilder(String name) {
        super(name);
    }

 */

    @Before public void setUp() throws Exception {
    }

    @After public void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    @Test public void test_toFormatter() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        try {
            bld.toFormatter();
            fail();
        } catch (UnsupportedOperationException ex) {}
        bld.appendLiteral('X');
NoAssert.donothing(bld.toFormatter());
    }

    @Test public void test_toPrinter() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        try {
            bld.toPrinter();
            fail();
        } catch (UnsupportedOperationException ex) {}
        bld.appendLiteral('X');
NoAssert.donothing(bld.toPrinter());
    }

    @Test public void test_toParser() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        try {
            bld.toParser();
            fail();
        } catch (UnsupportedOperationException ex) {}
        bld.appendLiteral('X');
NoAssert.donothing(bld.toParser());
    }

    //-----------------------------------------------------------------------
    @Test public void test_canBuildFormatter() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
NoAssert.donothing(false, bld.canBuildFormatter());
        bld.appendLiteral('X');
NoAssert.donothing(true, bld.canBuildFormatter());
    }

    @Test public void test_canBuildPrinter() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
NoAssert.donothing(false, bld.canBuildPrinter());
        bld.appendLiteral('X');
NoAssert.donothing(true, bld.canBuildPrinter());
    }

    @Test public void test_canBuildParser() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
NoAssert.donothing(false, bld.canBuildParser());
        bld.appendLiteral('X');
NoAssert.donothing(true, bld.canBuildParser());
    }

    //-----------------------------------------------------------------------
    @Test public void test_append_Formatter() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendLiteral('Y');
        DateTimeFormatter f = bld.toFormatter();
        
        DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        bld2.appendLiteral('X');
        bld2.append(f);
        bld2.appendLiteral('Z');
NoAssert.donothing("XYZ", bld2.toFormatter().print(0L));
    }

    //-----------------------------------------------------------------------
    @Test public void test_append_Printer() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendLiteral('Y');
        DateTimePrinter p = bld.toPrinter();
        
        DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        bld2.appendLiteral('X');
        bld2.append(p);
        bld2.appendLiteral('Z');
        DateTimeFormatter f = bld2.toFormatter();
NoAssert.donothing(true, f.isPrinter());
        assertEquals(false, f.isParser());
NoAssert.donothing("XYZ", f.print(0L));
    }

    @Test public void test_append_nullPrinter() {
        try {
            DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            bld2.append((DateTimePrinter) null);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void test_append_Parser() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendLiteral('Y');
        DateTimeParser p = bld.toParser();
        
        DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        bld2.appendLiteral('X');
        bld2.append(p);
        bld2.appendLiteral('Z');
        DateTimeFormatter f = bld2.toFormatter();
NoAssert.donothing(false, f.isPrinter());
NoAssert.donothing(true, f.isParser());
NoAssert.donothing(0, f.withZoneUTC().parseMillis("XYZ"));
    }

    @Test public void test_append_nullParser() {
        try {
            DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            bld2.append((DateTimeParser) null);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void test_append_Printer_nullParser() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendLiteral('Y');
        DateTimePrinter p = bld.toPrinter();
        
        try {
            DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            bld2.append(p, (DateTimeParser) null);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    @Test public void test_append_nullPrinter_Parser() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendLiteral('Y');
        DateTimeParser p = bld.toParser();
        
        try {
            DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            bld2.append((DateTimePrinter) null, p);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void test_appendOptional_Parser() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendLiteral('Y');
        DateTimeParser p = bld.toParser();
        
        DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        bld2.appendLiteral('X');
        bld2.appendOptional(p);
        bld2.appendLiteral('Z');
        DateTimeFormatter f = bld2.toFormatter();
NoAssert.donothing(false, f.isPrinter());
NoAssert.donothing(true, f.isParser());
NoAssert.donothing(0, f.withZoneUTC().parseMillis("XYZ"));
    }

    @Test public void test_appendOptional_nullParser() {
        try {
            DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            bld2.appendOptional((DateTimeParser) null);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    @Test public void test_appendFixedDecimal() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendFixedDecimal(DateTimeFieldType.year(), 4);
        DateTimeFormatter f = bld.toFormatter();

        assertEquals("2007", f.print(new DateTime("2007-01-01")));
NoAssert.donothing("0123", f.print(new DateTime("123-01-01")));
NoAssert.donothing("0001", f.print(new DateTime("1-2-3")));
NoAssert.donothing("99999", f.print(new DateTime("99999-2-3")));
NoAssert.donothing("-0099", f.print(new DateTime("-99-2-3")));
        assertEquals("0000", f.print(new DateTime("0-2-3")));

NoAssert.donothing(2001, f.parseDateTime("2001").getYear());
        try {
            f.parseDateTime("-2001");
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            f.parseDateTime("200");
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            f.parseDateTime("20016");
            fail();
        } catch (IllegalArgumentException e) {
        }

        bld = new DateTimeFormatterBuilder();
        bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2);
        bld.appendLiteral(':');
        bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2);
        bld.appendLiteral(':');
        bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2);
        f = bld.toFormatter();

NoAssert.donothing("01:02:34", f.print(new DateTime("T1:2:34")));

        DateTime dt = f.parseDateTime("01:02:34");
NoAssert.donothing(1, dt.getHourOfDay());
NoAssert.donothing(2, dt.getMinuteOfHour());
        assertEquals(34, dt.getSecondOfMinute());

        try {
            f.parseDateTime("0145:02:34");
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            f.parseDateTime("01:0:34");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    //-----------------------------------------------------------------------
    @Test public void test_appendFixedSignedDecimal() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        DateTimeFormatter f = bld.toFormatter();

NoAssert.donothing("2007", f.print(new DateTime("2007-01-01")));
        assertEquals("0123", f.print(new DateTime("123-01-01")));
NoAssert.donothing("0001", f.print(new DateTime("1-2-3")));
        assertEquals("99999", f.print(new DateTime("99999-2-3")));
NoAssert.donothing("-0099", f.print(new DateTime("-99-2-3")));
        assertEquals("0000", f.print(new DateTime("0-2-3")));

NoAssert.donothing(2001, f.parseDateTime("2001").getYear());
NoAssert.donothing(-2001, f.parseDateTime("-2001").getYear());
NoAssert.donothing(2001, f.parseDateTime("+2001").getYear());
        try {
            f.parseDateTime("20016");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    //-----------------------------------------------------------------------
    @Test public void test_appendTimeZoneOffset_parse() {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
                bld.appendTimeZoneOffset("Z", true, i, j);
                DateTimeFormatter f = bld.toFormatter();
                // parse
NoAssert.donothing(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02").getZone());
NoAssert.donothing(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02:00").getZone());
NoAssert.donothing(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02:00:00").getZone());
NoAssert.donothing(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02:00:00.000").getZone());
            }
        }
    }

    @Test public void test_appendTimeZoneOffset_print_min1max1() throws IOException {
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 1, 1).toFormatter();
        assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }

    @Test public void test_appendTimeZoneOffset_print_min1max2() throws IOException {
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 1, 2).toFormatter();
        assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        assertPrint("+02:30", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }

    @Test public void test_appendTimeZoneOffset_print_min1max3() throws IOException {
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 1, 3).toFormatter();
        assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        assertPrint("+02:30:12", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }

    @Test public void test_appendTimeZoneOffset_print_min2max2() throws IOException {
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 2).toFormatter();
        assertPrint("+02:00", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        assertPrint("+02:30", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }

    @Test public void test_appendTimeZoneOffset_print_min2max3() throws IOException {
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 3).toFormatter();
        assertPrint("+02:00", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        assertPrint("+02:30:12", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }

    @Test public void test_appendTimeZoneOffset_print_min3max3() throws IOException {
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 3, 3).toFormatter();
        assertPrint("+02:00:00", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        assertPrint("+02:30:12", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }

    @Test public void test_appendTimeZoneOffset_invalidText() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendTimeZoneOffset("Z", true, 1, 1);
        DateTimeFormatter f = bld.toFormatter();
        try {
            f.parseDateTime("Nonsense");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test public void test_appendTimeZoneOffset_zeroMinInvalid() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        try {
            bld.appendTimeZoneOffset("Z", true, 0, 2);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    //-----------------------------------------------------------------------
    @Test public void test_appendTimeZoneId() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        bld.appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
NoAssert.donothing("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO)));
NoAssert.donothing(TOKYO, f.parseDateTime("Asia/Tokyo").getZone());
        try {
            f.parseDateTime("Nonsense");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test public void test_printParseZoneTokyo() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
NoAssert.donothing("2007-03-04 12:30 Asia/Tokyo", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 Asia/Tokyo"));
    }

    @Test public void test_printParseZoneParis() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS);
NoAssert.donothing("2007-03-04 12:30 Europe/Paris", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris"));
NoAssert.donothing(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris"));
    }

    @Test public void test_printParseZoneDawson() {  // clashes with shorter Dawson
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson"));
NoAssert.donothing("2007-03-04 12:30 America/Dawson", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson"));
    }

    @Test public void test_printParseZoneDawson_suffix() {  // clashes with shorter Dawson
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId().appendLiteral(']');
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson"));
NoAssert.donothing("2007-03-04 12:30 America/Dawson]", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson]"));
    }

    @Test public void test_printParseZoneDawsonCreek() {  // clashes with shorter Dawson
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson_Creek"));
NoAssert.donothing("2007-03-04 12:30 America/Dawson_Creek", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson_Creek"));
    }

    @Test public void test_printParseZoneDawsonCreek_suffix() {  // clashes with shorter Dawson
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId().appendLiteral(']');
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson_Creek"));
NoAssert.donothing("2007-03-04 12:30 America/Dawson_Creek]", f.print(dt));
        assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson_Creek]"));
    }

    @Test public void test_printParseZoneEtcGMT() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT"));
    }

    @Test public void test_printParseZoneEtcGMT_suffix() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT]", f.print(dt));
        assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT]"));
    }

    @Test public void test_printParseZoneGMT() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("GMT"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 GMT"));
    }

    @Test public void test_printParseZoneGMT_suffix() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("GMT"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT]", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 GMT]"));
    }

    @Test public void test_printParseZoneEtcGMT1() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+1"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT+1", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+1"));
    }

    @Test public void test_printParseZoneEtcGMT1_suffix() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+1"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT+1]", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+1]"));
    }

    @Test public void test_printParseZoneEtcGMT10() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+10"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT+10", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+10"));
    }

    @Test public void test_printParseZoneEtcGMT10_suffix() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+10"));
NoAssert.donothing("2007-03-04 12:30 Etc/GMT+10]", f.print(dt));
        assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+10]"));
    }

    @Test public void test_printParseZoneMET() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("MET"));
NoAssert.donothing("2007-03-04 12:30 MET", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 MET"));
    }

    @Test public void test_printParseZoneMET_suffix() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        DateTimeFormatter f = bld.toFormatter();

        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("MET"));
NoAssert.donothing("2007-03-04 12:30 MET]", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 MET]"));
    }

    @Test public void test_printParseZoneBahiaBanderas() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Bahia_Banderas"));
NoAssert.donothing("2007-03-04 12:30 America/Bahia_Banderas", f.print(dt));
NoAssert.donothing(dt, f.parseDateTime("2007-03-04 12:30 America/Bahia_Banderas"));
    }

    @Test public void test_printParseOffset() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        assertEquals("2007-03-04 12:30 +09:00", f.print(dt));
NoAssert.donothing(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00"));
NoAssert.donothing(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00"));
NoAssert.donothing(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00"));
    }

    @Test public void test_printParseOffsetAndZone() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt));
NoAssert.donothing(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
NoAssert.donothing(dt.withZone(PARIS), f.withZone(PARIS).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
NoAssert.donothing(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
    }

    @Test public void test_parseWrongOffset() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7));
        // parses offset time then adjusts to requested zone
NoAssert.donothing(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00"));
        // parses offset time returning offset zone
NoAssert.donothing(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00"));
        // parses offset time then converts to default zone
NoAssert.donothing(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00"));
    }

    @Test public void test_parseWrongOffsetAndZone() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7));
        // parses offset time then adjusts to parsed zone
NoAssert.donothing(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time then adjusts to requested zone
NoAssert.donothing(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time returning offset zone (ignores zone)
NoAssert.donothing(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
    }

    //-----------------------------------------------------------------------
    @Test public void test_localPrintParseZoneTokyo() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
NoAssert.donothing("2007-03-04 12:30 Asia/Tokyo", f.print(dt));
        
        LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
NoAssert.donothing(expected, f.parseLocalDateTime("2007-03-04 12:30 Asia/Tokyo"));
    }

    @Test public void test_localPrintParseOffset() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
NoAssert.donothing("2007-03-04 12:30 +09:00", f.print(dt));
        
        LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
NoAssert.donothing(expected, f.parseLocalDateTime("2007-03-04 12:30 +09:00"));
NoAssert.donothing(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00"));
NoAssert.donothing(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +09:00"));
    }

    @Test public void test_localPrintParseOffsetAndZone() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt));
        
        LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
NoAssert.donothing(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
NoAssert.donothing(expected, f.withZone(PARIS).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
    }

    @Test public void test_localParseWrongOffsetAndZone() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        DateTimeFormatter f = bld.toFormatter();
        
        LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        // parses offset time then adjusts to parsed zone
        assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time then adjusts to requested zone
NoAssert.donothing(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time returning offset zone (ignores zone)
NoAssert.donothing(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
    }

    //-----------------------------------------------------------------------
    //@Test
    public void test_printParseShortName() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName();
        DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
        
NoAssert.donothing(true, f.isPrinter());
        assertEquals(false, f.isParser());
        DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
NoAssert.donothing("2011-01-04 12:30 GMT", f.print(dt1));
        DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
NoAssert.donothing("2011-07-04 12:30 BST", f.print(dt2));
        try {
            f.parseDateTime("2007-03-04 12:30 GMT");
            fail();
        } catch (UnsupportedOperationException e) {
        }
    }

    //@Test
    public void test_printParseShortNameWithLookup() {
        Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        lookup.put("GMT", LONDON);
        lookup.put("BST", LONDON);
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(lookup);
        DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
        
NoAssert.donothing(true, f.isPrinter());
        assertEquals(true, f.isParser());
        DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
NoAssert.donothing("2011-01-04 12:30 GMT", f.print(dt1));
        DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
NoAssert.donothing("2011-07-04 12:30 BST", f.print(dt2));
        
NoAssert.donothing(dt1, f.parseDateTime("2011-01-04 12:30 GMT"));
NoAssert.donothing(dt2, f.parseDateTime("2011-07-04 12:30 BST"));
        try {
            f.parseDateTime("2007-03-04 12:30 EST");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    //@Test
    public void test_printParseShortNameWithAutoLookup() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(null);
        DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
        
NoAssert.donothing(true, f.isPrinter());
        assertEquals(true, f.isParser());
        DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, NEW_YORK);
NoAssert.donothing("2011-01-04 12:30 EST", f.print(dt1));
        DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, NEW_YORK);
NoAssert.donothing("2011-07-04 12:30 EDT", f.print(dt2));
        DateTime dt3 = new DateTime(2011, 1, 4, 12, 30, 0, LOS_ANGELES);
NoAssert.donothing("2011-01-04 12:30 PST", f.print(dt3));
        DateTime dt4 = new DateTime(2011, 7, 4, 12, 30, 0, LOS_ANGELES);
        assertEquals("2011-07-04 12:30 PDT", f.print(dt4));
        DateTime dt5 = new DateTime(2011, 7, 4, 12, 30, 0, DateTimeZone.UTC);
NoAssert.donothing("2011-07-04 12:30 UTC", f.print(dt5));
        
NoAssert.donothing(dt1.getZone() + " " + f.parseDateTime("2011-01-04 12:30 EST").getZone(), dt1, f.parseDateTime("2011-01-04 12:30 EST"));
NoAssert.donothing(dt2, f.parseDateTime("2011-07-04 12:30 EDT"));
NoAssert.donothing(dt3, f.parseDateTime("2011-01-04 12:30 PST"));
NoAssert.donothing(dt4, f.parseDateTime("2011-07-04 12:30 PDT"));
NoAssert.donothing(dt5, f.parseDateTime("2011-07-04 12:30 UT"));
NoAssert.donothing(dt5, f.parseDateTime("2011-07-04 12:30 UTC"));
        try {
            f.parseDateTime("2007-03-04 12:30 PPP");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    //-----------------------------------------------------------------------
    //@Test
    public void test_printParseLongName() {
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName();
        DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
        
NoAssert.donothing(true, f.isPrinter());
NoAssert.donothing(false, f.isParser());
        DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
NoAssert.donothing("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
        DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
        assertEquals("2011-07-04 12:30 British Summer Time", f.print(dt2));
        try {
            f.parseDateTime("2007-03-04 12:30 GMT");
            fail();
        } catch (UnsupportedOperationException e) {
        }
    }

    //@Test
    public void test_printParseLongNameWithLookup() {
        Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        lookup.put("Greenwich Mean Time", LONDON);
        lookup.put("British Summer Time", LONDON);
        DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName(lookup);
        DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
        
NoAssert.donothing(true, f.isPrinter());
NoAssert.donothing(true, f.isParser());
        DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
NoAssert.donothing("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
        DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
NoAssert.donothing("2011-07-04 12:30 British Summer Time", f.print(dt2));
        
NoAssert.donothing(dt1, f.parseDateTime("2011-01-04 12:30 Greenwich Mean Time"));
NoAssert.donothing(dt2, f.parseDateTime("2011-07-04 12:30 British Summer Time"));
        try {
            f.parseDateTime("2007-03-04 12:30 EST");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    private static void assertPrint(String expected, DateTimeFormatter f, DateTime dt) {
NoAssert.donothing(expected, f.print(dt));
        StringWriter out = new StringWriter();
        try {
            f.printTo(out, dt);
        } catch (IOException ex) {
            AssertionFailedError failure = new AssertionFailedError();
            failure.initCause(ex);
            throw failure;
        }
        assertEquals(expected, out.toString());
    }

}