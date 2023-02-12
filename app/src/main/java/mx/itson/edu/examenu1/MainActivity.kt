package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var c:Double = 0.0
    var f:Double = 0.0
    var k:Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)
        val btnGK: Button = findViewById(R.id.btnGK)
        val etC: EditText = findViewById(R.id.etC)
        val etF: EditText = findViewById(R.id.etF)
        val etK: EditText = findViewById(R.id.etK)

        btnGC.setOnClickListener(){
            f = etF.text.toString().toDouble()
            c = (f-32)/1.8
            etC.setText(c.toString())
        }

        btnGF.setOnClickListener(){
            c = etC.text.toString().toDouble()
            f = c*1.8+32
            etF.setText(f.toString())
        }

        btnGK.setOnClickListener(){
            c = etC.text.toString().toDouble()
            k = c+273.15
            etK.setText(k.toString())
        }

    }
}