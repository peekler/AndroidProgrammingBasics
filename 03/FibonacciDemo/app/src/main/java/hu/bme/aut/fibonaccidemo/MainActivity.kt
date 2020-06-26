package hu.bme.aut.fibonaccidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShow.setOnClickListener {
            if (!etLength.text.isEmpty()) {
                var n = etLength.text.toString().toInt()
                fibonacci(n)
            } else {
                etLength.error = "Ez a mező nem lehet üres"
            }
        }

    }

    fun fibonacci(n: Int = 10) {
        var t1 = 0
        var t2 = 1
        var i = 1

        tvResult.text = ""

        while (i <= n) {
            tvResult.append("$t1 ")

            val sum = t1 + t2
            t1 = t2
            t2 = sum

            i++
        }
    }
}