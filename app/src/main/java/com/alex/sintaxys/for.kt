package com.alex.sintaxys

fun main(){
    ejemploFor()
}

fun ejemploFor(){
    var array = arrayOf(111, 222, 333)

    //defino una lista mutable
    var arregloAgregado:MutableList<String> = mutableListOf("Uno", "Dos", "Tres")
    //agrego un elemento a la lista mutable
    arregloAgregado.add(1, "agregado")

    //en el for voy a imprimir el valor en cada iteracion del array
    for (valor:Int in array){
        println(valor)
    }

    println()

    var lista = arrayOf("hola", 111, 222, 33)

    //en el for voy a imprimir el valor en cada iteracion del array
    //en este caso no especifíco el tipo esperado del valor ya que puede ser de cualquier tipo


    for (valor2 in lista){
        println(valor2)
    }

    println()

    //es otra forma de recorrer una lista con un for
    arregloAgregado.forEach { println(it) }
}