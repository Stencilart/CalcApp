package jp.techacademy.wenglon.leong.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.google.android.material.snackbar.Snackbar;

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(editText1.length() != 0 && editText2.length() != 0) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", editText1.getText().toString().toDouble())
            intent.putExtra("VALUE2", editText2.getText().toString().toDouble())
            if (v.id == R.id.button1) {
                intent.putExtra("OPERATOR", "+")
            } else if (v.id == R.id.button2) {
                intent.putExtra("OPERATOR", "-")
            } else if (v.id == R.id.button3) {
                intent.putExtra("OPERATOR", "*")
            } else if (v.id == R.id.button4) {
                intent.putExtra("OPERATOR", "/")
            }
            startActivity(intent)
        } else {
            Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_SHORT)
                    .show()
        }
    }
}