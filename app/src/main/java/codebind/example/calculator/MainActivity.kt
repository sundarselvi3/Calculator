package codebind.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var a= findViewById<EditText>(R.id.textView)
        var b= findViewById<EditText>(R.id.textView2)
        var c=findViewById<EditText>(R.id.textView3)
        var btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            var a1=a.text.toString().toInt()
            var b1=b.text.toString().toInt()
            var test = Test1()
            c.setText(test.add(a1,b1).toString())
        }
    }
}
