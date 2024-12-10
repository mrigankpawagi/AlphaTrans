/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jun 22 14:59:56 GMT 2024
 */

package org.apache.commons.graph.flow;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DefaultToTailBuilder_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.graph.flow.DefaultToTailBuilder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/ali/Documents/AlphaTrans/java_projects/cleaned_final_projects/commons-graph"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultToTailBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.graph.flow.ToTailBuilder",
      "org.apache.commons.graph.builder.GraphConnection",
      "org.apache.commons.graph.MutableGraph",
      "org.apache.commons.graph.model.BaseGraph",
      "org.apache.commons.graph.Mapper",
      "org.apache.commons.graph.Graph",
      "org.apache.commons.graph.weight.OrderedMonoid",
      "org.apache.commons.graph.flow.DefaultToTailBuilder",
      "org.apache.commons.graph.flow.MaxFlowAlgorithmSelector",
      "org.apache.commons.graph.model.BaseMutableGraph",
      "org.apache.commons.graph.model.DirectedMutableGraph",
      "org.apache.commons.graph.model.RevertedGraph",
      "org.apache.commons.graph.VertexPair",
      "org.apache.commons.graph.utils.Assertions",
      "org.apache.commons.graph.GraphException",
      "org.apache.commons.graph.flow.DefaultMaxFlowAlgorithmSelector",
      "org.apache.commons.graph.visit.GraphVisitHandler",
      "org.apache.commons.graph.DirectedGraph",
      "org.apache.commons.graph.weight.Monoid"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.graph.Mapper", false, DefaultToTailBuilder_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultToTailBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.graph.flow.DefaultToTailBuilder",
      "org.apache.commons.graph.model.BaseGraph",
      "org.apache.commons.graph.model.BaseMutableGraph",
      "org.apache.commons.graph.model.DirectedMutableGraph",
      "org.apache.commons.graph.model.RevertedGraph",
      "org.apache.commons.graph.utils.Assertions",
      "org.apache.commons.graph.flow.DefaultMaxFlowAlgorithmSelector",
      "org.apache.commons.graph.GraphException",
      "org.apache.commons.graph.VertexPair",
      "org.apache.commons.graph.utils.Objects"
    );
  }
}
