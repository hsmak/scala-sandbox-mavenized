package org.hsmak

import scala.annotation.tailrec

object BasicMethods extends App {

  object BasicMethod {
    /**
      * '=' sign is very importatn. it states the method will return something
      *
      * @param x
      * @param y
      * @return
      */
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    println(add(6, 7))

    /**
      * Consequences of forgetting the "=" is it will always return Unit
      *
      * @param x
      * @param y
      */
    def badAdd(x: Int, y: Int) {
      x + y
    }

    println("------------ bad add --------------")
    println(badAdd(1, 5))

    def addUnit(x: Int, y: Int): Unit = x + y

    println("------------ Add Unit --------------")
    println(addUnit(1, 5))
  }

  BasicMethod
  println

  object MethodWithInference {

    def add(x: Int, y: Int) = x + y;

    println(add(6, 7))

    def numberStatus(a: Int) = {
      if (a < 10) "Less than 10"
      else if (a > 10) "Greater than 10"
      else "It is 10"
    }

    println(numberStatus(10))

    def numberStatusWithoutBraces(a: Int) =
      if (a < 10) "Less than 10"
      else if (a > 10) "Greater than 10"
      else "It is 10"


    println(numberStatusWithoutBraces(10))
  }

  MethodWithInference
  println

  println("--------------- SideEffect -----------------")

  object WithSideEffect {
    var a = 0

    def sideEffect() {
      a = a + 1
    }

    println(a)
  }

  WithSideEffect
  println

  println("################################### Methods Inside Methods ###################################")

  def factorial(n: BigInt): BigInt = {

    @tailrec //keeping the optimized version
    def fact(n: BigInt, accum: BigInt): BigInt = if (n == 0 || n == 1) accum else fact(n - 1, n * accum)

    fact(n, 1)
  }

  println(factorial(10000))


  println("################################### bending method names to your will ###################################")

  def `summation of`(x: Int, y: Int) = x + y

  println(`summation of`(4, 5))

  println("---------- a method that takes no param --------------")
  def willYouPrintMe_? = true// use '_' to use OpChar. It looks like a val but it's really a method.
  println(willYouPrintMe_?)

}

