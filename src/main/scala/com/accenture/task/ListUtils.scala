package com.accenture.task

object ListUtils {

  /**
   * Flattens lists, filtering non-null string values
   *
   * @param list list of AnyRef
   * @return flattened String list
   */
  def flattenStrings(list: List[AnyRef]): List[String] = {
    list.flatMap {
      case nestedList: List[AnyRef @unchecked] => flattenStrings(nestedList)
      case string: String if string != null => List(string)
      case _ => List()
    }
  }

  /**
   * Remove consecutive duplicates out of list
   *
   * @param list list of strings
   * @return list w/o consecutive duplicates
   */
  def removeConsecutiveDuplicates(list: List[String]): List[String] = {
    list match {
      case Nil => Nil
      case h :: t =>
        val remainedList = list.dropWhile {h ==}
        h :: removeConsecutiveDuplicates(remainedList)
    }
  }
}
