/*
 *  Copyright 2017 Stephen Colebourne
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
package org.joda.time.tz;import org.joda.time.NoAssert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for class {@link ZoneInfoCompiler}.
 *
 * @date 2017-07-31
 * @see ZoneInfoCompiler
 **/
public class TestZoneInfoCompiler {//extends TestCase {


    public static void main(String[] args) throws Exception {
        TestZoneInfoCompiler TB = new TestZoneInfoCompiler();
        TB.testParseDataFileWithTrue();
        TB.testParseDataFileWithFalse();
        TB.testTestOne();

        TB.testTestTwo();
        TB.testParseZoneCharFive();
        TB.testParseYearAndParseYearReturningPositiveAndParseYearWithNegative();
        TB.testParseYearAndParseYearReturningNegativeOne();
        TB.testParseYearAndParseYearReturningNegativeTwo();
        TB.testWriteZoneInfoMapThrowsIllegalArgumentException();
    }

    @Test
    public void testParseDataFileWithTrue() throws IOException {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        StringReader stringReader = new StringReader(" I  ;>- ");
        BufferedReader bufferedReader = new BufferedReader(stringReader, 2014);
        zoneInfoCompiler.parseDataFile(bufferedReader, true);
    }

    @Test
    public void testParseDataFileWithFalse() throws IOException {
        ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        StringReader stringReader = new StringReader("XYC5w.9eA}*U#A;mu");
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        zoneInfoCompiler.parseDataFile(bufferedReader, false);
    }

    @Test
    public void testTestOne() {
        DateTimeZone dateTimeZone = DateTimeZone.forOffsetMillis(8);

NoAssert.donothing(ZoneInfoCompiler.test("+02:15", dateTimeZone));
    }

    @Test
    public void testTestTwo() {
        DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
        DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone("7M6 _n'63", true);

NoAssert.donothing(ZoneInfoCompiler.test("7M6 _n'63", dateTimeZone));
    }

    @Test
    public void testParseZoneCharFive() {
NoAssert.donothing('s', ZoneInfoCompiler.parseZoneChar('s'));
    }

    @Test
    public void testParseYearAndParseYearReturningPositiveAndParseYearWithNegative() {
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", (-2512)));
    }

    @Test
    public void testParseYearAndParseYearReturningNegativeOne() {
NoAssert.donothing(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", (-1881443201)));
    }

    @Test
    public void testParseYearAndParseYearReturningNegativeTwo() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", (-1971487955)));
    }

    @Test
    public void testWriteZoneInfoMapThrowsIllegalArgumentException() throws IOException {
        Map<String, MockZone> hashMap = new HashMap<String, MockZone>();
        MockZone mockZone = new MockZone(0L, 3022, 90);
        hashMap.put("     - ", mockZone);
        Map<String, DateTimeZone> hashMapTwo = new HashMap<String, DateTimeZone>(hashMap);
        hashMapTwo.put("H)m^v1(", mockZone);

        try {
            ZoneInfoCompiler.writeZoneInfoMap(null, hashMapTwo);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
NoAssert.donothing(ZoneInfoCompiler.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }

}
