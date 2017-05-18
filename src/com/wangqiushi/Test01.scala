package com.wangqiushi

/**
  * Created by mao on 2017/5/14.
  */
object Test01 {
  def main(args: Array[String]): Unit = {
      FileUtil.readFile("C:\\Users\\mao");
      FileUtil.outFile("C:\\Users\\mao","user.home=河南周口扶沟")
  }
}
