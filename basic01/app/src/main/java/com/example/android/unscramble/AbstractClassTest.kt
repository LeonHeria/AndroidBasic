package com.example.android.unscramble

abstract class Dwelling(private var risidents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom() = risidents < capacity

    abstract fun floorArea(): Double

    fun getRoom() {
        if (capacity > risidents) {
            risidents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }

}