package com.wangqiushi

/**
  * Created by mao on 2017/5/14.
  */
class Person(var firstname:String,var lastName:String ) {

  println("构造函数开始")

  private val Home=System.getProperty("user.home")
  val age=0
  override def toString =s"$firstname $lastName is $age years old"
  def printHome: Unit ={
        println(s"home is $Home")
  }

  def fullName: Unit ={
      println(this)
  }
  printHome;
  fullName


}


object  Person{
  def main(args: Array[String]): Unit = {
      val p=new Person("wang","qiushi")


  }
}
