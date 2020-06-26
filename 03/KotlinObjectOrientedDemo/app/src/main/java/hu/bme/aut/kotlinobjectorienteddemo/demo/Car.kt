package hu.bme.aut.kotlinobjectorienteddemo.demo

open class Car(var plateNumber: String) {

    var upperPlateNumber: String = ""
        get() {
            return "$field hello"
        }
        set(value: String) {
            field = "DEMO $value"
        }


    var engineNum = 0

    init {
        upperPlateNumber = plateNumber.toUpperCase()
    }

    inner class Engine {
        fun startEngine() {
            //..
            engineNum++
            showPlateNumber()
            this@Car.showPlateNumber()
        }
    }

    constructor(aPlate: String, engineNum: Int) : this(aPlate) {
        this.engineNum = engineNum
    }

    fun showPlateNumber(): String {
        return upperPlateNumber
    }

    open fun showPlateAndEngine(): String {
        return "$upperPlateNumber, $engineNum"
    }

}