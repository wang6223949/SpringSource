package com.wangqiushi

import scala.io.Source

/**
  * Created by mao on 2017/5/14.
  */
class LazyTest {
  val text=Source.fromFile("C:\\Users\\mao\\home")
    .getLines
    .foreach(println)
  //延迟加载
  lazy val content=Source.fromFile("C:\\Users\\mao\\home")
    .getLines
    .foreach(println)
}


object LazyTest{
  def main(args: Array[String]): Unit = {
    val lazyTest=new LazyTest;
    lazyTest.content
  }
}