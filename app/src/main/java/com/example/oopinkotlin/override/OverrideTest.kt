package com.example.oopinkotlin.override

fun main(args: Array<String>) {
    var vehicle=Vehicle()
    vehicle.start()
    vehicle.accelerate(100)
    vehicle.stop()
    println("-------------------------------")

    var car=Car()
    car.start()
    car.accelerate(150)
    car.stop()

    println("-------------------------------")
    car.superStart()
    car.superAccelerate()
    car.superStop()

}