package com.knoldus.syntaxModifications

object NewSyntax extends App {

  /***
   * Braces for the blocks are replaced with proper indentation.
   *
   * Condition braces replaced with 'then' keyword.
   *
   * We can also use 'end' keyword to end a particular block.
   */

  /***
   * If/else construct
   */

  def getIntegerType(num: Int) =
    if num < 0 then "negative"
    else if num == 0 then "zero"
    else "positive"
  end getIntegerType

  println(getIntegerType(5))

  /***
   * for expression
   */

  val numbers = List(1, 2, 3)
  val strings = List("A", "B", "C")

  val something = for {
    num <- numbers
    str <- strings
  } yield str + num

  println(something)

  /***
   * match expression
   */

  def numInWords(num: Int) = num match
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "the number is not between 1 to 3"

  println(numInWords(2))
}
