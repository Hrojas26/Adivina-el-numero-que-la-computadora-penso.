package com.example.numeros_2

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.text.FieldPosition
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var imageButtonReset: ImageButton
    lateinit var imageButtonCheck: ImageButton


    var random: Int = nextInt(1,100)




    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        imageButtonReset = findViewById(R.id.imageButtonReset)
        imageButtonCheck = findViewById(R.id.imageButtonCheck)


        textView.text = "welcome"
        imageButtonCheck.setOnClickListener {

            val number: Int = editText.text.toString().toInt()

            if (number < random){


                textView.text = "Tu numero es menor "
                editText.text.clear()


            } else if (number>random){

                textView.text = "Tu numero es mayor"
                editText.text.clear()

            }else {

                textView.text= "Excelente encontraste el numero"
                editText.text.clear()

            }

        }
        imageButtonReset.setOnClickListener {
                    reset()
        }
    }

    fun reset(){
        random = nextInt(1,100)
        textView.text = "welcome"
        editText.text.clear()
    }
}
