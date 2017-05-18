package com.wangqiushi

/**
  * Created by mao on 2017/4/5.
  */
object demo {

  def main(args: Array[String]): Unit = {

      println("hello word");
  }


}

object demo2{
  def main(args: Array[String]): Unit = {

    var increase=(x:Int)=>x+1
    val someNumbers = List ( -11, -10, - 5, 0, 5, 10)
    var b = someNumbers.foreach(increase)
    println(b.getClass)
    var c = someNumbers.map(increase)
    println(c.getClass)

    c.foreach((x:Int)=>print(x+" "))
    println()
    c.map((x:Int)=>print(x+" "))







  }
}