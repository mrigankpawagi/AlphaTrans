/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 14:15:44 GMT 2024
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AlreadySelectedException_ESTest extends AlreadySelectedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException0("");
      OptionGroup optionGroup0 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option.Builder option_Builder0 = Option.builder0();
      Option option0 = new Option((-1013), "f", "N)N", "0!", false, option_Builder0);
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup1.getSelected());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder1("");
      Option option0 = new Option(61, "'", "'", (String) null, false, option_Builder0);
      option0.setRequired(true);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("'", optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertSame(option0, option1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder0();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator1('\'');
      Option option0 = new Option(2131, (String) null, (String) null, (String) null, false, option_Builder1);
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder0();
      Option option0 = new Option((-1013), "f", "N)N", "0!", false, option_Builder0);
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      option0.setOptionalArg(true);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder0();
      Option option0 = new Option(0, "", "", "`C%|.x0SIuAvS10", false, option_Builder0);
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = Option.Option2((String) null, true, " [ARG]");
      option0.setArgs(2131);
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder0();
      option_Builder0.argName("IEz_7");
      Option option0 = new Option(2131, (String) null, (String) null, (String) null, false, option_Builder0);
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getOpt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder1("");
      Option.Builder option_Builder1 = option_Builder0.option("r");
      Option option0 = option_Builder1.build();
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getValue0());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder1("");
      option_Builder0.numberOfArgs(0);
      Option option0 = option_Builder0.build();
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      // Undeclared exception!
      try { 
        AlreadySelectedException.AlreadySelectedException1(optionGroup0, (Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.AlreadySelectedException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option.Builder option_Builder0 = Option.builder0();
      Option option0 = new Option((-1013), "f", "N)N", "0!", false, option_Builder0);
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException1(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup1.getSelected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = AlreadySelectedException.AlreadySelectedException0("");
      Option option0 = alreadySelectedException0.getOption();
      assertNull(option0);
  }
}