package com.wangqiushi

/**
  * Created by mao on 2017/5/14.
  */
class DaBing(var size:Int,var kind:String) {

  def this(size:Int){
    this(size,DaBing.DEF_KIND)
  }

  def this(kind:String){
    this(DaBing.DEF_SIZE,kind)
  }

  def this(){
    this(DaBing.DEF_SIZE,DaBing.DEF_KIND)
  }

  override def toString=s"大小：$size 种类$kind"
}

object DaBing{
  def DEF_SIZE=12
  def DEF_KIND="pizza"
}


object  testDaBing{
  def main(args: Array[String]): Unit = {
      val d=new DaBing(13);
        println(d.toString)
      val d2=new DaBing;
        println(d2.toString)
  }
}