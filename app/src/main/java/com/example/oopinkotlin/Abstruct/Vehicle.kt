package com.example.oopinkotlin.Abstruct

abstract class Vehicle {

    abstract fun vehicleName(name:String):String
    fun type(type:String):String{
        return type
    }
    abstract var model:Int
    var speed:Int?=null

}
