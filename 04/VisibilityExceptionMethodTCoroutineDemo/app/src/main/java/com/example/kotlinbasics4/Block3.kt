package com.example.kotlinbasics4

data class Book(val title: String, val price: Int){
//    operator fun plus(other: Book): Int{
//        return price + other.price
//    }
}

operator fun Book.plus(other: Book): Int{
    return price + other.price - 10
}

fun main() {
    val effectiveJava = Book("Effective Java", 200)
    val cleanCoders = Book("Clean Coders", 300)
    print(effectiveJava + cleanCoders)
}
