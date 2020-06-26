package hu.bme.aut.kotlinobjectorienteddemo

import hu.bme.aut.kotlinobjectorienteddemo.demo.*

fun main(args: Array<String>) {

    var myCar = Car("abc-123", 1213123)
    //println(myCar.showPlateAndEngine())
    myCar.stopCar()


//
//    var myElectricCar = ElectricCar("zöld")
//    println(myElectricCar.showPlateAndEngine())
//
//    var myShip = Ship("VitorlásGyár")
//    myShip.showManufacturer()
//    myShip.startVehicle()
//    myShip.load()
//
//    var myProfile = Person("Péter", 1984)
//    var (name, year) = myProfile
//    //var name = myProfile.component1()
//    //var year = myProfile.component2()
//
//    println("$name, $year")
//
//    loadingDemo(object : Loadable {
//        override fun load() {
//            //..
//        }
//    })
//
//    var data = object  {
//        var a = 5
//        var b = 3
//
//        fun demo() {
//
//        }
//    }
//
//    data.demo()
//
//    ElectricCar.CHARGEABLE = false
//    ElectricCar.demo()

}

fun Car.stopCar() {
    println("Stopped")
    println(showPlateNumber())
}

fun loadingDemo(item: Loadable) {

}