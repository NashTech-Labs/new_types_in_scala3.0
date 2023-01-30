package com.knoldus.matchTypes

object MatchTypes extends App {
  
  /**
   * Scala 2 - approach
   *
   * Finding last digit, character, element of a list.
   */
    
  def getLastDigit(number: BigInt): Int = (number % 10).toInt
  
  def getLastChar(anyString: String): Char =
    if anyString.isEmpty then throw new NoSuchElementException
    else anyString.charAt(anyString.length - 1)
  
  def getLastElement[T](list: List[T]): T =
    if list.isEmpty then throw new NoSuchElementException
    else list.last
  
  /**
   * Scala 3 - approach
   *
   * Finding last digit, character, element of a list.
   */

  type ConstituentPartOf[T] = T match
    case BigInt => Int
    case String => Char
    case List[t] => t

  /**
   * some possible values of the new type
   */

  val aDigit: ConstituentPartOf[BigInt] = 2
  val aChar: ConstituentPartOf[String] = 'a'
  val anElement: ConstituentPartOf[List[Int]] = 15
  
  /**
   * function to find last digit, character, element of a list.
   */

  def getLastComponentOf[T](biggerValue: T): ConstituentPartOf[T] = biggerValue match
    case bigInt: BigInt => (bigInt % 10).toInt
    case string: String =>
      if string.isEmpty then throw new NoSuchElementException
      else string.charAt(string.length - 1)
    case list: List[_] =>
      if list.isEmpty then throw new NoSuchElementException
      else list.last

  println(s"last digit: ${getLastComponentOf(BigInt(2349838))}")
  println(s"last character: ${getLastComponentOf("knoldus")}")
  println(s"last element: ${getLastComponentOf(List(1,2,3))}")
}
