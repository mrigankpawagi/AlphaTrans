/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 14:13:16 GMT 2024
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnrecognizedOptionException_ESTest extends UnrecognizedOptionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnrecognizedOptionException unrecognizedOptionException0 = new UnrecognizedOptionException("org.apache.commons.cli.ParseException", "org.apache.commons.cli.ParseException");
      String string0 = unrecognizedOptionException0.getOption();
      assertEquals("org.apache.commons.cli.ParseException", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnrecognizedOptionException unrecognizedOptionException0 = new UnrecognizedOptionException("", "");
      String string0 = unrecognizedOptionException0.getOption();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnrecognizedOptionException unrecognizedOptionException0 = UnrecognizedOptionException.UnrecognizedOptionException1("");
      String string0 = unrecognizedOptionException0.getOption();
      assertNull(string0);
  }
}
