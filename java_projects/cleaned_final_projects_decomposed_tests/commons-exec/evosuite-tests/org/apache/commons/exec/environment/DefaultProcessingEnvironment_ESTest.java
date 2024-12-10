/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 12 04:15:56 GMT 2024
 */

package org.apache.commons.exec.environment;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.environment.DefaultProcessingEnvironment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultProcessingEnvironment_ESTest extends DefaultProcessingEnvironment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultProcessingEnvironment defaultProcessingEnvironment0 = new DefaultProcessingEnvironment();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      defaultProcessingEnvironment0.procEnvironment = (Map<String, String>) hashMap0;
      Map<String, String> map0 = defaultProcessingEnvironment0.getProcEnvironment();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultProcessingEnvironment defaultProcessingEnvironment0 = new DefaultProcessingEnvironment();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      defaultProcessingEnvironment0.procEnvironment = (Map<String, String>) hashMap0;
      Map<String, String> map0 = defaultProcessingEnvironment0.createProcEnvironment();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultProcessingEnvironment defaultProcessingEnvironment0 = new DefaultProcessingEnvironment();
      Map<String, String> map0 = defaultProcessingEnvironment0.getProcEnvironment();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultProcessingEnvironment defaultProcessingEnvironment0 = new DefaultProcessingEnvironment();
      Map<String, String> map0 = defaultProcessingEnvironment0.createProcEnvironment();
      assertNotNull(map0);
      
      Map<String, String> map1 = defaultProcessingEnvironment0.getProcEnvironment();
      assertFalse(map1.isEmpty());
      assertNotSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultProcessingEnvironment defaultProcessingEnvironment0 = new DefaultProcessingEnvironment();
      CommandLine commandLine0 = defaultProcessingEnvironment0.getProcEnvCommand();
      assertNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultProcessingEnvironment defaultProcessingEnvironment0 = new DefaultProcessingEnvironment();
      BufferedReader bufferedReader0 = defaultProcessingEnvironment0.runProcEnvCommand();
      assertNull(bufferedReader0);
  }
}
