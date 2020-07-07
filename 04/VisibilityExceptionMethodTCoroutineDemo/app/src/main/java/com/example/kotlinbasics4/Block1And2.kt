package com.example.kotlinbasics4

import com.example.lib.HttpRequest
import com.example.lib.timeout
import java.lang.ArithmeticException
import java.lang.IllegalArgumentException

open class Calculator{

    public fun add(a: Int, b:Int): Int {
        return a + b
    }

    fun equals(a: Int, b:Int): Boolean {
        return a == b;
    }

    private fun multiply(a: Int, b:Int): Int {
        return a * b
    }

    protected fun min(a: Int, b:Int): Int {
        return if (a < b) a else b;
    }

    internal fun max(a: Int, b:Int): Int {
        return if (a > b) a else b;
    }

    fun divide(a: Int, b:Int): Int{
        try{
            return a/b;
        }catch (exception: ArithmeticException){
            throw DivisorZeroException()
        }

    }
}

class DivisorZeroException: Throwable("Please provide divisor other than zero!")


fun main() {
    println("Hello")
//    timeout = 30
    try {
        val result = Calculator().divide(1, 0)
        println(result)
    }catch (exception: DivisorZeroException){
//        exception.printStackTrace()
        //dialogus a hibauzenettel
        println(exception.message)
    }
    println("end")
}





