from __future__ import annotations

# Imports Begin
from src.main.org.apache.commons.pool2.impl.DefaultPooledObjectInfo import *
import os
import typing
from typing import *
import io
from abc import ABC

# Imports End


class GenericKeyedObjectPoolMXBean(ABC):

    # Class Fields Begin
    # Class Fields End

    # Class Methods Begin
    def listAllObjects(self) -> typing.Dict[str, typing.List[DefaultPooledObjectInfo]]:
        pass

    def isClosed(self) -> bool:
        pass

    def getTimeBetweenEvictionRunsMillis(self) -> int:
        pass

    def getTestWhileIdle(self) -> bool:
        pass

    def getTestOnReturn(self) -> bool:
        pass

    def getTestOnCreate(self) -> bool:
        pass

    def getTestOnBorrow(self) -> bool:
        pass

    def getReturnedCount(self) -> int:
        pass

    def getNumWaitersByKey(self) -> typing.Dict[str, int]:
        pass

    def getNumWaiters(self) -> int:
        pass

    def getNumTestsPerEvictionRun(self) -> int:
        pass

    def getNumIdle(self) -> int:
        pass

    def getNumActivePerKey(self) -> typing.Dict[str, int]:
        pass

    def getNumActive(self) -> int:
        pass

    def getMinIdlePerKey(self) -> int:
        pass

    def getMinEvictableIdleTimeMillis(self) -> int:
        pass

    def getMeanIdleTimeMillis(self) -> int:
        pass

    def getMeanBorrowWaitTimeMillis(self) -> int:
        pass

    def getMeanActiveTimeMillis(self) -> int:
        pass

    def getMaxWaitMillis(self) -> int:
        pass

    def getMaxTotalPerKey(self) -> int:
        pass

    def getMaxTotal(self) -> int:
        pass

    def getMaxIdlePerKey(self) -> int:
        pass

    def getMaxBorrowWaitTimeMillis(self) -> int:
        pass

    def getLifo(self) -> bool:
        pass

    def getFairness(self) -> bool:
        pass

    def getDestroyedCount(self) -> int:
        pass

    def getDestroyedByEvictorCount(self) -> int:
        pass

    def getDestroyedByBorrowValidationCount(self) -> int:
        pass

    def getCreationStackTrace(self) -> str:
        pass

    def getCreatedCount(self) -> int:
        pass

    def getBorrowedCount(self) -> int:
        pass

    def getBlockWhenExhausted(self) -> bool:
        pass

    def isAbandonedConfig(self) -> bool:
        pass

    def getRemoveAbandonedTimeout(self) -> int:
        pass

    def getRemoveAbandonedOnMaintenance(self) -> bool:
        pass

    def getRemoveAbandonedOnBorrow(self) -> bool:
        pass

    def getLogAbandoned(self) -> bool:
        pass

    # Class Methods End
