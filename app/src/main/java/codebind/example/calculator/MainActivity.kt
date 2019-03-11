package codebind.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var a= findViewById<EditText>(R.id.editText)
        var b= findViewById<EditText>(R.id.textView2)
        var c=findViewById<EditText>(R.id.textView3)
        var btn=findViewById<Button>(R.id.button)
        a.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                if (a.text.toString().isNotEmpty())
                {

                }

            }

        })


        btn.setOnClickListener{
            var a1=a.text.toString().toInt()
            var b1=b.text.toString().toInt()
            var test = Test1()
            c.setText(test.add(a1,b1).toString())
        }

    }
}
