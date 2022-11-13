package com.example.android.unscramble

class RoundTower(
    residents: Int,
    val floors: Int = 2, radius: Double
) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}