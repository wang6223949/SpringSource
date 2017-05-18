package com.wangqiushi

/**
  * Created by mao on 2017/5/14.
  */
object FileUtil {

  def readFile(path:String){
      println(s"从路径 $path 读取文件")
  }

  def outFile(path:String,content:String ): Unit ={
    println(s"从路径 $path 写入文件，文件内容是：$content")
  }

}
