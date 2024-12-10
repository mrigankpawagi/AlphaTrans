/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 14:20:56 GMT 2024
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.net.Utils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char char0 = Utils.hexDigit((-1));
      assertEquals('F', char0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Utils.digit16((byte)66);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      try { 
        Utils.digit16((byte)77);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 77
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Utils.digit16((byte)48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char char0 = Utils.hexDigit((byte)48);
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Utils utils0 = new Utils();
  }
}