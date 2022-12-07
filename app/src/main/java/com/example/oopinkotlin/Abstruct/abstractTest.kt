package com.example.oopinkotlin.Abstruct

fun main(args: Array<String>) {

    var car=Car(2022)
    car.speed=100
    println("Name: ${car.vehicleName("Honda")}\n" +
            "Type: ${car.type("Car Type")}\n" +
            "Model: ${car.model}\n" +
            "Speed: ${car.speed}")

}