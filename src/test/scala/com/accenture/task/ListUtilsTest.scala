package com.accenture.task

import org.scalatest.FlatSpec

class ListUtilsTest extends FlatSpec {

  "ListUtils" should "be able to flatten string lists" in {
    def result1 = ListUtils.flattenStrings(List(List("foo", "bar", null, SampleClass(), List("foo1")), "bar1", null, SampleClass()))
    assert(result1.equals(List("foo", "bar", "foo1", "bar1")))
  }

  "ListUtils" should "be able to remove consequent duplicates" in {
    def result1 = ListUtils.removeConsecutiveDuplicates(List("foo", "foo", "bar", "foo", "foo1", "foo1"))
    assert(result1.equals(List("foo", "bar", "foo", "foo1")))
  }
}

case class SampleClass()
