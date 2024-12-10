from __future__ import annotations

# Imports Begin
from src.main.org.apache.commons.graph.builder.GraphConnector import *
import typing
from typing import *
import io
from abc import ABC

# Imports End


class GraphConnection(ABC):

    # Class Fields Begin
    # Class Fields End

    # Class Methods Begin
    def connect(self, grapher: GraphConnector[typing.Any, typing.Any]) -> None:
        pass

    # Class Methods End
