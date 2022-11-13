package com.example.android.unscramble

class SquareCabin(
    risidents: Int, val length: Double
) : Dwelling(risidents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
        return length * length
    }
}