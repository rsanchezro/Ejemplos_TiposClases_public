package com.example.ejemplos_tiposclases

import android.content.Context
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat


enum class Vcolor(var num_color:Int) {
    ROJO(R.color.red), AZUL(R.color.blue),
    VERDE(R.color.green), NEGRO(R.color.black);




    fun retornar_Color(contexto: Context):Int {
      return ContextCompat.getColor(contexto,this.num_color)


    }
}