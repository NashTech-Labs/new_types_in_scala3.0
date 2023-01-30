package com.knoldus.enumerations

import com.knoldus.enumerations.Enumerations.Shape.Circle

object Enumerations extends App {

  /**
   * example1
   */

  enum MyCustomEnumType {
    case Start, Stop, Continue
  }

  println(MyCustomEnumType.valueOf("Continue"))

  /**
   * example2
   */

  enum SomeParamType(val param: String) {
    case Message extends SomeParamType("Blocked")
  }

  println(SomeParamType.Message.param)

  /**
   * example3
   */

  enum Shape {
    case Circle(radius: Double)
    case Rectangle(width: Double, height: Double)
  }

  def area(shape: Shape): Double = shape match
    case Shape.Circle(radius) => math.Pi * radius * radius
    case Shape.Rectangle(width, h) => width * h

  val areaOfCircle = Shape.Circle(3.5)
  val areaOfRectangle = Shape.Rectangle(4, 9)

  println(area(areaOfCircle))
  println(area(areaOfRectangle))

  /**
   * example4
   */

  enum Status {
    case Approved, Pending, Declined

    def next: Status = this match
      case Pending => Approved
      case Approved => Declined
      case Declined => Pending
  }

  val status = Status.Pending
  println(status)
  println(status.next)
}
