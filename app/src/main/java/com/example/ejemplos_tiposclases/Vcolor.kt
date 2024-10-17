package com.example.ejemplos_tiposclases

import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi

enum class Vcolor(var num_color:Long,var nombre_color:String) {
    ROJO(0xFFEB3324,"RED"), AZUL(0x2D8DF5,"BLUE"),
    VERDE(0xFF75FA61,"GREEN"), NEGRO(0x000000,"BLACK");


    @RequiresApi(Build.VERSION_CODES.O)
    fun retornar_Color(): Color {
      return  when (this) {
            ROJO -> Color.valueOf(Color.RED)
            AZUL ->  Color.valueOf(Color.BLUE)
            VERDE ->  Color.valueOf(Color.GREEN)
           NEGRO ->  Color.valueOf(Color.BLACK)

        }


    }
}