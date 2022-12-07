package com.example.oopinkotlin.override

class Car:Vehicle() {

    fun superStart(){
        super.start()

    }

    fun superAccelerate(){
        super.accelerate(200)

    }

    fun superStop(){
        super.stop()

    }


    override fun start(){
        println("Car has started")
    }
    override fun accelerate(speed:Int){
        println("Car accelerated with $speed")
    }
    override fun stop(){
        println("Car has stopped")
    }
}