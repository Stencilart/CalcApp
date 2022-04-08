package jp.techacademy.wenglon.leong.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var answer = 0.0
        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val operator = intent.getStringExtra("OPERATOR")

        if(operator.equals("+")){
            answer = value1 + value2
        } else if (operator.equals("-")) {
            answer = value1 - value2
        } else if (operator.equals("*")) {
            answer = value1 * value2
        } else if (operator.equals("/")) {
            if (value2 == 0.0){
                answer1.text = "0 で割ることはできません"
                return
            } else {
                answer = value1 / value2
            }
        }

        answer1.text = "$answer"
    }
}
