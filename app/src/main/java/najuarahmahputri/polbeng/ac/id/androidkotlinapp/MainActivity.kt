package najuarahmahputri.polbeng.ac.id.androidkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnSubractNumber: Button
    private lateinit var btnResetNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        tvCounter.text = "1"

        tvCounter = findViewById(R.id.tvCounter)
        btnSubractNumber = findViewById(R.id.btnSubtractNumber)
        tvCounter.text = "1"

        tvCounter = findViewById(R.id.tvCounter)
        btnResetNumber = findViewById(R.id.btnResetNumber)
        tvCounter.text = "1"
    }
    fun addNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }
    fun subtractNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        tvCounter.text = nextVal.toString()
    }
    fun resetNumber(v: View) {
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = '0'
        tvCounter.text = nextVal.toString()
    }
}