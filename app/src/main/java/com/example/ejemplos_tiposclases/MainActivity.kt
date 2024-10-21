package com.example.ejemplos_tiposclases

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //Obtener la referencia del RadioGroup
        var radiogrupo_colores=findViewById<RadioGroup>(R.id.radio_group_colores)
        //El Listener con un Lambda
        radiogrupo_colores.setOnCheckedChangeListener { group, checkedId ->
            var radioButton=findViewById<RadioButton>(checkedId)
            var milayout=findViewById<ConstraintLayout>(R.id.main)
            milayout.setBackgroundColor(Vcolor.valueOf(radioButton.text.toString()).retornar_Color(this))

        }


   /*     radiogrupo_colores.setOnCheckedChangeListener(object :RadioGroup.OnCheckedChangeListener{
         
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {


                var radio_azul= findViewById<RadioButton>(R.id.radioAzul)
                var radio_verde=findViewById<RadioButton>(R.id.radioVerde)
                var radio_rojo=findViewById<RadioButton>(R.id.radioRojo)
                var radio_negro=findViewById<RadioButton>(R.id.radioNegro)
                var milayout=findViewById<ConstraintLayout>(R.id.main)

                when(p1)
                {

                    radio_rojo.id-> //Cambio el color a rojo
                        milayout.setBackgroundColor(Vcolor.ROJO.retornar_Color(this@MainActivity))
                    radio_azul.id->
                        milayout.setBackgroundColor(Vcolor.AZUL.retornar_Color(this@MainActivity))
                    radio_verde.id->
                        milayout.setBackgroundColor(Vcolor.VERDE.retornar_Color(this@MainActivity))
                    radio_negro.id->
                        milayout.setBackgroundColor(Vcolor.NEGRO.retornar_Color(this@MainActivity))









                }

            }

        }


        )*/












    }
}

