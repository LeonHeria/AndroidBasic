package com.example.android.unscramble

import kotlin.math.PI
import kotlin.math.sqrt

open class RoundHut(
    risidents: Int,
    val radius: Double
) : Dwelling(risidents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }
    fun calculateMaxCarpetLength(): Double {

        return sqrt(2.0) * radius
    }
}