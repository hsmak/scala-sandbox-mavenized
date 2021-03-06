package com.xyzcorp

import java.time.LocalDate

class Stamp protected[xyzcorp] (val name:String, val year:Int, currentYear:() => Int)
  extends Introspection {
  require(name.nonEmpty, "Name cannot be empty")
  def age = currentYear() - year
}

object Stamp {
  // static factories
  def apply(name:String, year:Int) = {
    new Stamp(name, year, () => LocalDate.now.getYear)
  }
}
