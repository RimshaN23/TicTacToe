package com.urb.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.urb.tictactoe.databinding.ActivityMainBinding
import java.util.logging.XMLFormatter

class MainActivity : AppCompatActivity() {

    var flag=0
    var count=0
    lateinit var btnCurrent: Button
    lateinit var playAgain: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        playAgain= binding.playAgain

        playAgain.setOnClickListener {

            newGame()
        }

    }

    fun check(view: View){


         btnCurrent = view as Button

        if (btnCurrent.text == "") {

            count++

            Log.e("counter", count.toString())
            if (flag == 0) {
                btnCurrent.text = "X"
                btnCurrent.setBackgroundResource(R.drawable.background_x)
                flag = 1
            }
            else if (flag == 3) {
                btnCurrent.text = ""
                btnCurrent.setBackgroundResource(R.color.grey)
                flag = 1
            } else {
                btnCurrent.text = "O"
                btnCurrent.setBackgroundResource(R.drawable.background_o)

                flag = 0
            }

            val b1 = binding.btn1.text.toString()
            val b2 = binding.btn2.text.toString()
            val b3 = binding.btn3.text.toString()
            val b4 = binding.btn4.text.toString()
            val b5 = binding.btn5.text.toString()
            val b6 = binding.btn6.text.toString()
            val b7 = binding.btn7.text.toString()
            val b8 = binding.btn8.text.toString()
            val b9 = binding.btn9.text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this, "Winner is: $b1", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3
            } else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this, "Winner is: $b4", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is: $b7", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this, "Winner is: $b1", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this, "Winner is: $b2", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is: $b3", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this, "Winner is: $b1", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this, "Winner is: $b3", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3

            }else if (count ==9) {
                Toast.makeText(this, "Match Drawn", Toast.LENGTH_SHORT).show()
                playAgain.visibility= View.VISIBLE
                flag=3

            }
        }

    }

    fun newGame(){

        binding.btn1.text= ""
        binding.btn2.text= ""
        binding.btn3.text= ""
        binding.btn4.text= ""
        binding.btn5.text= ""
        binding.btn6.text= ""
        binding.btn7.text= ""
        binding.btn8.text= ""
        binding.btn9.text= ""
        flag=0
        count=0
        binding.btn1.setBackgroundResource(R.drawable.background)
        binding.btn2.setBackgroundResource(R.drawable.background)
        binding.btn3.setBackgroundResource(R.drawable.background)
        binding.btn4.setBackgroundResource(R.drawable.background)
        binding.btn5.setBackgroundResource(R.drawable.background)
        binding.btn6.setBackgroundResource(R.drawable.background)
        binding.btn7.setBackgroundResource(R.drawable.background)
        binding.btn8.setBackgroundResource(R.drawable.background)
        binding.btn9.setBackgroundResource(R.drawable.background)
        playAgain.visibility= View.GONE


    }

}