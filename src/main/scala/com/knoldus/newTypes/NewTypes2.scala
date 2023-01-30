package com.knoldus.newTypes

/***
 * Intersection Types
 */

trait Strings {
  def someString: String = "Scala"
}

trait Numbers {
  def someNumber: Int = 3
}

def getResult(data: Strings & Numbers): String = {
  s"${data.someString} ${data.someNumber}"
}

class StringsAndNumbers extends Strings with Numbers
val alphaNumeric = new StringsAndNumbers

/***
* getResult function will take a type that contains both Strings and Numbers
*/
