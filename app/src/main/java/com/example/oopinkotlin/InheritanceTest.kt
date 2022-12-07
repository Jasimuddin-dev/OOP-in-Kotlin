package com.example.oopinkotlin

fun main(args: Array<String>) {

    var myCar=Car()
    myCar.type="Cars"
    myCar.model="Honda"
    myCar.maxSpeed=200

    myCar.show()

    println("..............................")

    var motorBike=Motobyke()
    motorBike.type="Motorbike"
    motorBike.model="Yahama"
    motorBike.maxSpeed=150

    motorBike.show()

}