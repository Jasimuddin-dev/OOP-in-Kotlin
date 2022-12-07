package com.example.oopinkotlin.`interface`

class vehicle:CanGo,CanStop {
    override val name: String
        get() ="Ferrari"

    override fun stop() {
        println("Vehicle can stop")
    }
}