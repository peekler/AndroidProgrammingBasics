package hu.bme.aut.kotlinobjectorienteddemo.demo

abstract class Vehicle(var manufacturer: String) {

    abstract fun startVehicle()

    fun showManufacturer() {
        println("$manufacturer")
    }
}

interface Loadable {
    fun load()
}

class Ship(var shipManufacturer: String) : Vehicle(shipManufacturer), Loadable {
    override fun startVehicle() {
        println("Zászlót fel")
    }

    override fun load() {
        println("Feltöltve")
    }

}