/*
 *  Copyright 2001-2012 Stephen Colebourne
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
package org.joda.time.tz;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.After;import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;

import org.joda.time.DateTimeZone;

/**
 * Test cases for FixedDateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestCachedDateTimeZone  { //extends TestCase {

    public static void main(String[] args) throws Exception  {
        TestCachedDateTimeZone TB= new TestCachedDateTimeZone();
        TB.setUp(); TB.test_caching(); TB.tearDown();
        TB.setUp(); TB.testSerialization(); TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestCachedDateTimeZone.class);
    }

    public TestCachedDateTimeZone(String name) {
        super(name);
    }

     */

    private DateTimeZone originalDateTimeZone = null;


    @Before public void setUp() throws Exception {
        originalDateTimeZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @After public void tearDown() throws Exception {
        DateTimeZone.setDefault(originalDateTimeZone);
    }

    @Test public void test_caching() throws Exception {
        CachedDateTimeZone zone1 = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        CachedDateTimeZone zone2 = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        assertSame(zone1, zone2);
    }

    //-----------------------------------------------------------------------
    @Test public void testSerialization() throws Exception {
        CachedDateTimeZone test = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        CachedDateTimeZone result = (CachedDateTimeZone) ois.readObject();
        ois.close();
        
        assertEquals(test, result);
    }

}
