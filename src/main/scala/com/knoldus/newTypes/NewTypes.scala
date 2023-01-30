package com.knoldus.newTypes

object NewTypes extends App {

  /**
   * Literal Types - also present in scala 2
   */

  val five: 5 = 5
  val someMsg:"hello" = "hello"
  val trueValue: true = true

  def convertToString(number: Int) = number.toString //usual way

  def convertNumToString(number: 5) = number.toString

  println(convertToString(9))
  println(convertNumToString(5))

  /**
   * Union Types
   */

  def squareNum(someValue: String | Int | Boolean): String | Int =
    someValue match
      case str: String => s"Found a string: $str"
      case num: Int => num * num
      case bool: Boolean => s"Found a boolean value: ${bool.toString}"

  println(squareNum(6))
  println(squareNum("Hello from Scala 3"))
  println(squareNum(false))
}
