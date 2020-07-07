package com.example.kotlinbasics4

fun main() {
    fun repeatTask(times: Int, task: () -> Unit){
        for (index in 1..times)
            task()
    }

    fun foo(bar: () -> Unit){
        bar()
    }

    var list = mutableListOf(1, 2, 4, 5)
    val convertedList = convertListItems(list) { item: Int -> item.toString() + " Ft" }
    println(convertedList)

}

fun convertListItems(list: List<Int>, converter: (Int) -> String): List<String>{
    var result: MutableList<String> = mutableListOf()
    for (index in 0..list.size - 1){
        result.add(converter(list.get(index)))
    }
    return result
}