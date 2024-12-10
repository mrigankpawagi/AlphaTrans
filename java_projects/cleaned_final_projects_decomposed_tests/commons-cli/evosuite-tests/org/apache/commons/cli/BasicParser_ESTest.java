/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 14:14:33 GMT 2024
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BasicParser_ESTest extends BasicParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicParser basicParser0 = new BasicParser();
      String[] stringArray0 = basicParser0.flatten((Options) null, (String[]) null, false);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicParser basicParser0 = new BasicParser();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = basicParser0.flatten((Options) null, stringArray0, true);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicParser basicParser0 = new BasicParser();
      String[] stringArray0 = new String[8];
      String[] stringArray1 = basicParser0.flatten((Options) null, stringArray0, false);
      assertSame(stringArray0, stringArray1);
  }
}
