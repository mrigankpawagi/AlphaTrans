/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 14:33:13 GMT 2024
 */

package org.apache.commons.fileupload.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import org.apache.commons.fileupload.util.FileItemHeadersImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileItemHeadersImpl_ESTest extends FileItemHeadersImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      fileItemHeadersImpl0.addHeader("", "");
      String string0 = fileItemHeadersImpl0.getHeader("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      // Undeclared exception!
      try { 
        fileItemHeadersImpl0.getHeaders((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.fileupload.util.FileItemHeadersImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      // Undeclared exception!
      try { 
        fileItemHeadersImpl0.getHeader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.fileupload.util.FileItemHeadersImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      // Undeclared exception!
      try { 
        fileItemHeadersImpl0.addHeader((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.fileupload.util.FileItemHeadersImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      fileItemHeadersImpl0.addHeader("", "");
      fileItemHeadersImpl0.addHeader("", "");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      Iterator<String> iterator0 = fileItemHeadersImpl0.getHeaders("cLk0cv4BCDd4'V1g>");
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      fileItemHeadersImpl0.addHeader("", "cLk0cv4BCDd4'V1g>");
      Iterator<String> iterator0 = fileItemHeadersImpl0.getHeaders("");
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      String string0 = fileItemHeadersImpl0.getHeader("cLk0cv4BCDd4'V1g>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      fileItemHeadersImpl0.addHeader("ytU(", "ytU(");
      String string0 = fileItemHeadersImpl0.getHeader("ytU(");
      assertNotNull(string0);
      assertEquals("ytU(", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FileItemHeadersImpl fileItemHeadersImpl0 = new FileItemHeadersImpl();
      Iterator<String> iterator0 = fileItemHeadersImpl0.getHeaderNames();
      assertNotNull(iterator0);
  }
}