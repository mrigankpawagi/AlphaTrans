from __future__ import annotations
import re
import os
from abc import ABC
import unittest
import pytest
import io
import typing
from typing import *
import unittest
from src.main.org.apache.commons.validator.routines.RegexValidator import *


class RegexValidatorTest(unittest.TestCase):

    __SEPARATOR_2: str = "(?:\\s)"
    __SEPARATOR_1: str = "(?:\\-)"
    __COMPONENT_3: str = "([123]{3})"
    __COMPONENT_2: str = "([DEF]{3})"
    __COMPONENT_1: str = "([abc]{3})"
    __REGEX: str = "^([abc]*)(?:\\-)([DEF]*)(?:\\-)([123]*)$"

    __REGEX_3: str = "^" + __COMPONENT_1 + __COMPONENT_2 + __COMPONENT_3 + "$"

    __REGEX_2: str = "^" + __COMPONENT_1 + __SEPARATOR_2 +\
        __COMPONENT_2 + __SEPARATOR_2 + __COMPONENT_3 + "$"

    __REGEX_1: str = "^" + __COMPONENT_1 + __SEPARATOR_1 +\
        __COMPONENT_2 + __SEPARATOR_1 + __COMPONENT_3 + "$"

    __MULTIPLE_REGEX: typing.List[str] = [__REGEX_1, __REGEX_2, __REGEX_3]

    def tearDown(self) -> None:
        super().tearDown()

    def setUp(self) -> None:
        super().setUp()

    def testToString(self) -> None:

        single = RegexValidator.RegexValidator3(self.__REGEX)
        self.assertEqual(
            "RegexValidator{" + self.__REGEX + "}", single.toString(), "Single"
        )

        multiple = RegexValidator.RegexValidator1([self.__REGEX, self.__REGEX])
        self.assertEqual(
            "RegexValidator{" + self.__REGEX + "," + self.__REGEX + "}",
            multiple.toString(),
            "Multiple"
        )

    def testExceptions(self) -> None:

        invalidRegex = "^([abCD12]*$"
        try:
            RegexValidator.RegexValidator3(invalidRegex)
        except re.error:
            pass

    def testMissingRegex(self) -> None:
        with self.assertRaises(ValueError) as context:
            RegexValidator.RegexValidator3(None)
        self.assertEqual(
            "Regular expression[0] is missing",
            str(context.exception),
            "Single Null"
        )

        with self.assertRaises(ValueError) as context:
            RegexValidator.RegexValidator3("")
        self.assertEqual(
            "Regular expression[0] is missing",
            str(context.exception),
            "Single Zero Length"
        )

        with self.assertRaises(ValueError) as context:
            RegexValidator.RegexValidator1(None)
        self.assertEqual(
            "Regular expressions are missing",
            str(context.exception),
            "Null Array"
        )

        with self.assertRaises(ValueError) as context:
            RegexValidator.RegexValidator1([])
        self.assertEqual(
            "Regular expressions are missing",
            str(context.exception),
            "Zero Length Array"
        )

        expressions = ["ABC", None]
        with self.assertRaises(ValueError) as context:
            RegexValidator.RegexValidator1(expressions)
        self.assertEqual(
            "Regular expression[1] is missing",
            str(context.exception),
            "Array has Null"
        )

        expressions = ["", "ABC"]
        with self.assertRaises(ValueError) as context:
            RegexValidator.RegexValidator1(expressions)
        self.assertEqual(
            "Regular expression[0] is missing",
            str(context.exception),
            "Array has Zero Length"
        )

    def testNullValue(self) -> None:

        validator = RegexValidator.RegexValidator3(self.__REGEX)
        self.assertEqual(validator.isValid(None), False)
        self.assertEqual(validator.validate(None), None)
        self.assertEqual(validator.match(None), None)

    def testMultipleInsensitive(self) -> None:

        multiple = RegexValidator(self.__MULTIPLE_REGEX, False)
        single1 = RegexValidator.RegexValidator2(self.__REGEX_1, False)
        single2 = RegexValidator.RegexValidator2(self.__REGEX_2, False)
        single3 = RegexValidator.RegexValidator2(self.__REGEX_3, False)

        value = "AAC FDE 321"
        expect = "AACFDE321"
        array = ["AAC", "FDE", "321"]

        self.assertEqual(True, multiple.isValid(value), "isValid() Multiple")
        self.assertEqual(False, single1.isValid(value), "isValid() 1st")
        self.assertEqual(True, single2.isValid(value), "isValid() 2nd")
        self.assertEqual(False, single3.isValid(value), "isValid() 3rd")

        self.assertEqual(expect, multiple.validate(value), "validate() Multiple")
        self.assertEqual(None, single1.validate(value), "validate() 1st")
        self.assertEqual(expect, single2.validate(value), "validate() 2nd")
        self.assertEqual(None, single3.validate(value), "validate() 3rd")

        self.__checkArray("match() Multiple", array, multiple.match(value))
        self.__checkArray("match() 1st", None, single1.match(value))
        self.__checkArray("match() 2nd", array, single2.match(value))
        self.__checkArray("match() 3rd", None, single3.match(value))

        value = "AAC*FDE*321"
        self.assertEqual(False, multiple.isValid(value), "isValid() Invalid")
        self.assertEqual(None, multiple.validate(value), "validate() Invalid")
        self.assertEqual(None, multiple.match(value), "match() Multiple")

    def testMultipleSensitive(self) -> None:

        multiple = RegexValidator.RegexValidator1(self.__MULTIPLE_REGEX)
        single1 = RegexValidator.RegexValidator3(self.__REGEX_1)
        single2 = RegexValidator.RegexValidator3(self.__REGEX_2)
        single3 = RegexValidator.RegexValidator3(self.__REGEX_3)

        value = "aac FDE 321"
        expect = "aacFDE321"
        array = ["aac", "FDE", "321"]

        self.assertEqual(True, multiple.isValid(value), "Sensitive isValid() Multiple")
        self.assertEqual(False, single1.isValid(value), "Sensitive isValid() 1st")
        self.assertEqual(True, single2.isValid(value), "Sensitive isValid() 2nd")
        self.assertEqual(False, single3.isValid(value), "Sensitive isValid() 3rd")

        self.assertEqual(
            expect, multiple.validate(value), "Sensitive validate() Multiple"
        )
        self.assertEqual(None, single1.validate(value), "Sensitive validate() 1st")
        self.assertEqual(expect, single2.validate(value), "Sensitive validate() 2nd")
        self.assertEqual(None, single3.validate(value), "Sensitive validate() 3rd")

        self.__checkArray("Sensitive match() Multiple", array, multiple.match(value))
        self.__checkArray("Sensitive match() 1st", None, single1.match(value))
        self.__checkArray("Sensitive match() 2nd", array, single2.match(value))
        self.__checkArray("Sensitive match() 3rd", None, single3.match(value))

        value = "AAC*FDE*321"
        self.assertEqual(False, multiple.isValid(value), "isValid() Invalid")
        self.assertEqual(None, multiple.validate(value), "validate() Invalid")
        self.assertEqual(None, multiple.match(value), "match() Multiple")

    def testSingle(self) -> None:

        sensitive = RegexValidator.RegexValidator3(self.__REGEX)
        insensitive = RegexValidator.RegexValidator2(self.__REGEX, False)

        self.assertEqual(True, sensitive.isValid("ac-DE-1"))
        self.assertEqual(False, sensitive.isValid("AB-de-1"))
        self.assertEqual(True, insensitive.isValid("AB-de-1"))
        self.assertEqual(False, insensitive.isValid("ABd-de-1"))

        self.assertEqual("acDE1", sensitive.validate("ac-DE-1"))
        self.assertEqual(None, sensitive.validate("AB-de-1"))
        self.assertEqual("ABde1", insensitive.validate("AB-de-1"))
        self.assertEqual(None, insensitive.validate("ABd-de-1"))

        self.__checkArray(
            "Sensitive match() valid", ["ac", "DE", "1"], sensitive.match("ac-DE-1")
        )
        self.__checkArray("Sensitive match() invalid", None, sensitive.match("AB-de-1"))
        self.__checkArray(
            "Insensitive match() valid", ["AB", "de", "1"], insensitive.match("AB-de-1")
        )
        self.__checkArray(
            "Insensitive match() invalid", None, insensitive.match("ABd-de-1")
        )
        self.assertEqual(
            "ABC", (RegexValidator.RegexValidator3("^([A-Z]*)$")).validate("ABC")
        )
        self.__checkArray(
            "match one",
            ["ABC"],
            (RegexValidator.RegexValidator3("^([A-Z]*)$")).match("ABC"),
        )

    def __init__(self, name: str) -> None:
        super().__init__(name)

    def __checkArray(
        self,
        label: str,
        expect: typing.List[typing.List[str]],
        result: typing.List[typing.List[str]],
    ) -> None:

        if expect is None or result is None:
            if expect is None and result is None:
                return  # valid, both null
            else:
                self.fail(f"{label} Null expect={expect} result={result}")
            return  # not strictly necessary, but prevents possible NPE below

        if len(expect) != len(result):
            self.fail(f"{label} Length expect={len(expect)} result={len(result)}")

        for i in range(len(expect)):
            self.assertEqual(expect[i], result[i], f"{label} value[{i}]")
