package hu.bme.aut.kotlindemosnull

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity() {

    var num: Int? = null
    var name: String? = null
    var numList: List<String>? = null
    var point: Point? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvData.setOnClickListener {
            //num = 10
            //var b = num ?: throw IllegalArgumentException("Az érték null")
            //point = Point(2,3)
            //tvData.text = "${point!!.x}"
            //tvData.text = "${point?.x}"

            //ifDemo()

            //whenDemo(2014)

            //forLoopDemo2()

            //whileLoopDemo()

            //demoMethod()

            var result = myCalculatorAdd(num1=1, num2=4)
            println("SUM: $result")
        }
    }

    fun ifDemo() {
        val score = 10
        var enoughScore = score>80
        //println("The score is ${if (enoughScore) "" else "not"} enough")

        if (score in 10..40) {
            println("The score is between 10 and 40")
        } else {
            println("The score is not in range")
        }
    }

    fun whenDemo(birthYear: Int) {

        /*var text = when(birthYear) {
            1990 -> "1990 egy jó év"
            1984 -> "Hajrá"
            in 2000..2010 -> "2000 felett"
            else -> "Egyéb"
        }
        println(text)*/

        var text = when {
            birthYear<2000 -> "2000 alatti"
            else -> "2000 feletti"
        }
        println(text)
    }

    fun forLoopDemo1() {
        var namesArray = arrayOf("Dénes", "Andrea", "Péter", "Éva")
        for ((index, name) in namesArray.withIndex()) {
            println("$index. $name")
        }
    }

    fun forLoopDemo2() {
        for (i in 10 downTo  1) {
            println("$i ")
        }
    }

    fun whileLoopDemo() {
        var score = 0
        while(score<10) {
            println("Score: $score")
            score++
        }

        var num=10
        do {
            println("Num: $num")
            num--
        } while(num>0)
    }

    fun demoMethod() {
        fun internalDemo(){
            println("hahooo")
        }

        internalDemo()
    }

    fun myCalculatorAdd(num1: Int = 0, num2: Int = 0): Int {
        return num1+num2
    }

}