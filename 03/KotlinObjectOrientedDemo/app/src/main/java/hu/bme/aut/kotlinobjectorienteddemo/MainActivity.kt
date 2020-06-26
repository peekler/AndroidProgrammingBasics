package hu.bme.aut.kotlinobjectorienteddemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import hu.bme.aut.kotlinobjectorienteddemo.demo.Car
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myCar =
            Car("abc-123", 1213123)
        var myEngine = Car("a").Engine()
        myEngine.startEngine()


        println(myCar.showPlateAndEngine())

    }


}