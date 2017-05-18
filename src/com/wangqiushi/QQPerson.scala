package com.wangqiushi

/**
  * Created by mao on 2017/5/14.
  */
class QQPerson(var username:String,var password:String) {
    var realName=""
    var  address=None:Option[Address]
}


case class Address(var city:String,var state:String,var code:String)

object  QQPerson extends  App{
    val p=new QQPerson("wang6223949","wang6223949")
    p.realName="王秋实"
    p.address=Some(Address("郑州","扶沟","461300"))
    p.address.foreach(a=>println(p.realName+" address:"+a.city+" "+a.state+" "+a.code))
}