/*
 * This file was automatically generated by EvoSuite
 * Wed May 18 15:56:37 GMT 2022
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.joda.time.chrono.GJLocaleSymbols;
import org.junit.runner.RunWith;


public class TestGJLocaleSymbols {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = new Locale("ju$HuTd4d`Ot1S2aoT", "ju$HuTd4d`Ot1S2aoT", "");
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      assertEquals(3, gJLocaleSymbols0.getMonthMaxShortTextLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.monthOfYearValueToText(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.UK;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.monthOfYearValueToShortText(8);
      assertEquals("Aug", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.halfdayValueToText(0);
      assertEquals("AM", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.US;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.halfdayTextToValue("am");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.eraTextToValue("BCE");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToText(2);
      assertEquals("Tuesday", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToShortText(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearValueToText(748);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 748
         //
         //verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearValueToShortText((-30561911));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -30561911
         //
        // verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearTextToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.eraValueToText(2789);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2789
         //
        // verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.eraTextToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.US;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekValueToText(3043);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3043
         //
        // verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekValueToShortText((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
        // verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekTextToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.halfdayTextToValue("\uC624\uD6C4");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.halfdayTextToValue("4;K(V;e$wa");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"4;K(V;e$wa\" for halfdayOfDay is not supported
         //
         //verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.UK;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.dayOfWeekTextToValue("6");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekTextToValue("15v6@''FCh]c");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"15v6@''FCh]c\" for dayOfWeek is not supported
         //
        // verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.monthOfYearTextToValue("mars");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearTextToValue("nZnQZLeS[wWV]0F^8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"nZnQZLeS[wWV]0F^8\" for monthOfYear is not supported
         //
        // verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.eraTextToValue("CE");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.eraTextToValue("^M_?HG(toqja$F");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"^M_?HG(toqja$F\" for era is not supported
         //
       //  verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale((Locale) null);
      assertEquals(2, gJLocaleSymbols0.getEraMaxTextLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.US;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getHalfdayMaxTextLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.US;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getMonthMaxShortTextLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToText(0);
      assertNull(string0);
      assertEquals(4, gJLocaleSymbols0.getDayOfWeekMaxShortTextLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.halfdayValueToText((-2353));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2353
         //
        // verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getDayOfWeekMaxShortTextLength();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.eraValueToText(1);
      assertEquals("ap. J.-C.", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.US;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getEraMaxTextLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToShortText(2);
      assertEquals("\u706B", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getDayOfWeekMaxTextLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getMonthMaxTextLength();
      assertEquals(9, int0);
      //assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.monthOfYearValueToText(3);
      assertEquals("mars", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.monthOfYearValueToShortText(0);
      assertNull(string0);
  }
}
