/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 14:39:55 GMT 2024
 */

package org.apache.commons.graph.elo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.graph.elo.DefaultRankingSelector;
import org.apache.commons.graph.elo.GameResult;
import org.apache.commons.graph.elo.KFactorBuilder;
import org.apache.commons.graph.elo.PlayersRank;
import org.apache.commons.graph.model.DirectedMutableGraph;
import org.apache.commons.graph.model.RevertedGraph;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultRankingSelector_ESTest extends DefaultRankingSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DirectedMutableGraph<Object, GameResult> directedMutableGraph0 = new DirectedMutableGraph<Object, GameResult>();
      RevertedGraph<Object, GameResult> revertedGraph0 = new RevertedGraph<Object, GameResult>(directedMutableGraph0);
      DefaultRankingSelector<Object> defaultRankingSelector0 = new DefaultRankingSelector<Object>(revertedGraph0);
      PlayersRank<Object> playersRank0 = (PlayersRank<Object>) mock(PlayersRank.class, new ViolatedAssumptionAnswer());
      KFactorBuilder<Object> kFactorBuilder0 = defaultRankingSelector0.wherePlayersAreRankedIn(playersRank0);
      assertNotNull(kFactorBuilder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DirectedMutableGraph<GameResult, GameResult> directedMutableGraph0 = new DirectedMutableGraph<GameResult, GameResult>();
      DefaultRankingSelector<GameResult> defaultRankingSelector0 = new DefaultRankingSelector<GameResult>(directedMutableGraph0);
      // Undeclared exception!
      try { 
        defaultRankingSelector0.wherePlayersAreRankedIn((PlayersRank<GameResult>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // ELO ranking can not be applied if players can not be ranked!
         //
         verifyException("org.apache.commons.graph.utils.Assertions", e);
      }
  }
}