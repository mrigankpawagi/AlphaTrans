from __future__ import annotations

# Imports Begin
from src.main.org.apache.commons.graph.weight.primitive.DoubleWeightBaseOperations import *
from src.main.org.apache.commons.graph.weight.OrderedMonoid import *
from src.main.org.apache.commons.graph.weight.Monoid import *
from src.main.org.apache.commons.graph.spanning.SpanningWeightedEdgeMapperBuilder import *
from src.main.org.apache.commons.graph.spanning.SpanningTreeSourceSelector import *
from src.main.org.apache.commons.graph.spanning.SpanningTreeAlgorithmSelector import *
from src.main.org.apache.commons.graph.model.UndirectedMutableGraph import *
from src.main.org.apache.commons.graph.model.MutableSpanningTree import *
from src.test.org.apache.commons.graph.model.BaseWeightedEdge import *
from src.test.org.apache.commons.graph.model.BaseLabeledWeightedEdge import *
from src.test.org.apache.commons.graph.model.BaseLabeledVertex import *
from src.main.org.apache.commons.graph.SpanningTree import *
from src.main.org.apache.commons.graph.Mapper import *
from src.main.org.apache.commons.graph.Graph import *
from src.main.org.apache.commons.graph.CommonsGraph import *
import unittest
import os
import io

# Imports End


class PrimTestCase(unittest.TestCase):

    # Class Fields Begin
    # Class Fields End

    # Class Methods Begin
    def testVerifyWikipediaMinimumSpanningTree_test11_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test10_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test9_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test8_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test7_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test6_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test5_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test4_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test3_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test2_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test1_decomposed(self) -> None:
        pass

    def testVerifyWikipediaMinimumSpanningTree_test0_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test11_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test10_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test9_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test8_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test7_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test6_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test5_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test4_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test3_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test2_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test1_decomposed(self) -> None:
        pass

    def testVerifyMinimumSpanningTree2_test0_decomposed(self) -> None:
        pass

    def testNullVertex_test3_decomposed(self) -> None:
        pass

    def testNullVertex_test2_decomposed(self) -> None:
        pass

    def testNullVertex_test1_decomposed(self) -> None:
        pass

    def testNullVertex_test0_decomposed(self) -> None:
        pass

    def testNullMonoid_test4_decomposed(self) -> None:
        pass

    def testNullMonoid_test3_decomposed(self) -> None:
        pass

    def testNullMonoid_test2_decomposed(self) -> None:
        pass

    def testNullMonoid_test1_decomposed(self) -> None:
        pass

    def testNullMonoid_test0_decomposed(self) -> None:
        pass

    def testNullGraph_test3_decomposed(self) -> None:
        pass

    def testNullGraph_test2_decomposed(self) -> None:
        pass

    def testNullGraph_test1_decomposed(self) -> None:
        pass

    def testNullGraph_test0_decomposed(self) -> None:
        pass

    def testNotExistVertex_test2_decomposed(self) -> None:
        pass

    def testNotExistVertex_test1_decomposed(self) -> None:
        pass

    def testNotExistVertex_test0_decomposed(self) -> None:
        pass

    def testEmptyGraph_test3_decomposed(self) -> None:
        pass

    def testEmptyGraph_test2_decomposed(self) -> None:
        pass

    def testEmptyGraph_test1_decomposed(self) -> None:
        pass

    def testEmptyGraph_test0_decomposed(self) -> None:
        pass

    @staticmethod
    def __internalPrimAssertion(
        input_: UndirectedMutableGraph[
            BaseLabeledVertex, BaseLabeledWeightedEdge[float]
        ],
        source: BaseLabeledVertex,
        expected: MutableSpanningTree[
            BaseLabeledVertex, BaseLabeledWeightedEdge[float], float
        ],
    ) -> None:
        pass

    # Class Methods End