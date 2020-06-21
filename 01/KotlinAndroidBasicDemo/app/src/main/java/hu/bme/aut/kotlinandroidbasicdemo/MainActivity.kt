package hu.bme.aut.kotlinandroidbasicdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDemo.setOnClickListener(::demoClick)
    }

    fun demoClick(view: View) {
        // tvData.text = "HAHO Működik: ${Date(System.currentTimeMillis()).toString()}"
        //demoArrays()

        demoStrings()
    }

    fun demoMethod() {
        val first = 10
        val second = 20
        println("Enter two numbers: $first $second")
        val sum = first + second
        println("The sum is: $sum")
    }

    fun demoVariables() {
        var a = 1_100_000
        var b = 1_100

        var result = a+b

        println("Sum: $result")
    }

    fun demoArrays() {
        var myNums = intArrayOf(2,3,4,5,6)
        var myMixedArray = arrayOf(2, "demo", true)
        tvData.text = myMixedArray[1].toString()
    }

    fun demoStrings() {
        var num1 = 5
        var num2 = 7
        //tvData.text = "Num1: $num1\nNum2: $num2\nSum is:\n${num1+num2}"
        tvData.text = """
            Num1: $num1
            Num2: $num2
            Sum: ${num1+num2}
        """.trimIndent()
    }

    fun arraysDemo1() {
        val numbers: ArrayList<Int> = ArrayList()
        // Add elements
        numbers.add(4)
        numbers.add(2)
        numbers.add(3)
        println("Unsorted ArrayList: $numbers")
        numbers.sort()
        println("Sorted ArrayList: $numbers")
        numbers.shuffle()
        println("Shuffled ArrayList: $numbers")
        numbers.reverse()
        println("Reversed ArrayList: $numbers")

        //Collections.swap(numbers, 0, 1)
        val newNumbers: ArrayList<Int?> = ArrayList()
        newNumbers.addAll(numbers)
        newNumbers.fill(1)

        numbers.sort()
        Collections.binarySearch(numbers, 3) // csak rendezett tömbön megy

        val count = Collections.frequency(numbers, 2)

        val numbers2: ArrayList<Int> = ArrayList()
        // Add elements
        numbers2.add(444)
        numbers2.add(22)
        
        val value = Collections.disjoint(numbers, numbers2)
        println("Two lists are disjoint: $value")
    }


}