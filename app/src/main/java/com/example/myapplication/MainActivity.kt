package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize datasource...
        val myDataSet = Datasource().loadLogos()

        mostrarLogo(myDataSet)
    }

    fun mostrarLogo(myDataSet: List <Logo>){

        val imageView: ImageView = findViewById(R.id.imageView)
        val buttonSend: Button = findViewById(R.id.button_send)
        val textInput: EditText = findViewById(R.id.text_input)
        var cont = 0
        imageView.setImageResource(myDataSet[cont].imageResourceId)
        buttonSend.setOnClickListener {
            if (textInput.text.toString().toLowerCase() == myDataSet[cont].logoName){
                Toast.makeText(this, "Correcto!", Toast.LENGTH_SHORT).show()
                cont += 1
                imageView.setImageResource(myDataSet[cont].imageResourceId)
                textInput.text.clear()
            }
            else{
                Toast.makeText(this, "Incorrecto!", Toast.LENGTH_SHORT).show()
                textInput.text.clear()
            }
        }


    }

}


