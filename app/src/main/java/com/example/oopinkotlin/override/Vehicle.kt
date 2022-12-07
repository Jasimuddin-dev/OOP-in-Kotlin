package com.example.oopinkotlin.override

open class Vehicle {
    open fun start(){
        println("Vehicle has started")
    }
    open fun accelerate(speed:Int){
        println("Vehicle accelerated with $speed")
    }
    open fun stop(){
        println("Vehicle has stopped")
    }
}