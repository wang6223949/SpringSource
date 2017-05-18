package com.wangqiushi

import java.util.Random


/**
  * Created by mao on 2017/4/17.
  */
class demo02 {

}

object TestFun{

  def creatArr(n : Int):Array[Int]={

    val arr=new Array[Int](n)
    val rand=new Random()
    for(ele<-arr)  yield rand.nextInt(n)


  }

}


object demo02{

  def main (args: Array[String] ): Unit = {

    TestFun.creatArr(10).foreach(print);

  }

}
