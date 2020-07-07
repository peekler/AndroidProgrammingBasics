package hu.bme.aut.collectionsdemo

fun main() {
    val list = mutableListOf(2, 3, 5, 6, 7)
    list[2] = 700

    list.removeAt(1)
    list.remove(6)

    println(list.toString())


}