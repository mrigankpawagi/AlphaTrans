/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 12 04:23:56 GMT 2024
 */

package org.apache.commons.exec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.exec.StreamPumper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StreamPumper_ESTest extends StreamPumper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamPumper streamPumper0 = StreamPumper.StreamPumper0(bufferedInputStream0, pipedOutputStream0);
      streamPumper0.run();
      boolean boolean0 = streamPumper0.isFinished();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamPumper streamPumper0 = StreamPumper.StreamPumper0(pushbackInputStream0, pipedOutputStream0);
      streamPumper0.run();
      assertTrue(streamPumper0.isFinished());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamPumper streamPumper0 = new StreamPumper(sequenceInputStream0, pipedOutputStream0, true, (byte)0);
      streamPumper0.run();
      assertTrue(streamPumper0.isFinished());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamPumper streamPumper0 = StreamPumper.StreamPumper0(sequenceInputStream0, pipedOutputStream0);
      streamPumper0.run();
      streamPumper0.waitFor();
      assertTrue(streamPumper0.isFinished());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      StreamPumper streamPumper0 = new StreamPumper(sequenceInputStream0, byteArrayOutputStream0, true, 1);
      assertFalse(streamPumper0.isFinished());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamPumper streamPumper0 = StreamPumper.StreamPumper0(sequenceInputStream0, pipedOutputStream0);
      boolean boolean0 = streamPumper0.isFinished();
      assertFalse(boolean0);
  }
}