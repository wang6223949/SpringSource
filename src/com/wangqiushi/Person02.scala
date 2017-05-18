package com.wangqiushi

/**
  * Created by mao on 2017/5/14.
  */
class Person02 (var name:String="wangqiushi",var age:String="24",var sex:String,var _heigth:String){

//  重写heigth构造setter，getter方法
  def heigth=_heigth
  def heigth_=(aheigth:String): Unit ={
    _heigth=aheigth+"cm"
  }


  override  def toString={
    println(s"$name,$age,$sex,$heigth")
    s"$name,$age,$sex,$heigth"
  }
}
object Person02{
  def main(args: Array[String]): Unit = {
    var p=new Person02(sex="男",_heigth = "178")
    p.toString
    p.heigth="175"
    println(p.heigth)
  }
}