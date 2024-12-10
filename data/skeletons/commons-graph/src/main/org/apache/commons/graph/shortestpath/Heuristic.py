from __future__ import annotations

# Imports Begin
import typing
from typing import *
import io
from abc import ABC

# Imports End


class Heuristic(ABC):

    # Class Fields Begin
    # Class Fields End

    # Class Methods Begin
    def applyHeuristic(self, current: typing.Any, goal: typing.Any) -> typing.Any:
        pass

    # Class Methods End
