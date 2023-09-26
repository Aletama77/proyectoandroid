package com.alex.sintaxys

//Las listas las voy a usar mucho. Puedo agregar o quitar a diferencia de un array que tengo q saber el tanmaño

fun main(){
    mutableList()
}

//son las listas a las que se le pueden agregar o sacar elementos
fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo")

    //el add lo uso para agregar elementos a las listas, el índice para la posicion que quiero que se agregue
    weekDays.add(1,"Alex")
    println(weekDays)

    if(weekDays.isEmpty()){
        //no voy a pintar nada porque está vacía
    } else {
        weekDays.forEach { println(it) }
    }

    println()

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    println()
    //imprimir el último valor
    println(weekDays.last())
    //imprimir el valor del primer índice
    println(weekDays.first())
}


//listas de solo lectura o filtrado
fun inmutableList(){
    val readOnly:List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo")
    println(readOnly)
    println(readOnly.size)
    println(readOnly[2])
    println(readOnly.last())
    println(readOnly.first())

    //it es iteracion. en cada iteracion hace algo
    //en el ejemplo de abajo filtra los strings q contengan una "a"
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //es para iterar una lista
    readOnly.forEach {weekDay -> println(weekDay) }
}
