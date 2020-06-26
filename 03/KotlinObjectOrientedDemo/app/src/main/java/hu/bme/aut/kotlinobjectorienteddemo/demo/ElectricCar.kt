package hu.bme.aut.kotlinobjectorienteddemo.demo

class ElectricCar(plateNum: String) : Car(plateNum) {

    companion object {
        var CHARGEABLE = true

        fun demo() {

        }
    }

    fun charge() {

    }

    override fun showPlateAndEngine(): String {

        return "zöld  - elektromotor"
    }

}