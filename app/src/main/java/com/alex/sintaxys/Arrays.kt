package com.alex.sintaxys

fun main(){
    val weekDays = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo")

    //Tamaño
    println(weekDays.size)

    //Tamaños
    if(weekDays.size >=8){
        println(weekDays[7])
    } else {
        println("no hay mas valores en el array")
    }
    //Modificar valor
    weekDays[0] = "Hoy es lunes!"
    println(weekDays[0])

    //Bucles para arrays

    //en donde puse position puedo poner cualquier nombre, va a marcar el indice, weekdays es el array
    for(position in weekDays.indices){
        println("He pasado por aqui $position")
    }

    for (position in weekDays.indices){
        println(weekDays[position])
    }

    //posicion y el valor
    for((position, value) in weekDays.withIndex()){
        println("la posición $position, contiene $value")
    }

    //solo el valor
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }

}