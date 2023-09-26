package com.alex.sintaxys

/*fun main(){
    var name:String? = "Alex"
    println(name!![2])//estoy seguro q el valor no debe ser un null
}*/

fun main(){ //para saber si lo que devuelve es nulo
    var name:String? = null
    println(name?.get(3) ?: "Es nulo")
}