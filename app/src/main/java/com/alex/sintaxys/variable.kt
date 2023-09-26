package com.alex.sintaxys

/** se usa para probar que corra el fichero creado
 fun main(){
print("Me llamo Alex!")
}
 */

//Variables Numéricas(Cuanto más decimales usa más espacio en la memoria ocupa)
//Int -147483647 a 2147483647
//Long
//Float
//Double (14 decimales)

//Variables alfanuméricas
//Char (solo un caracter q puede ser numero o letra en caracter)
//String
//Boolean (Si o NO, true o false)


fun main(){

    mostrarNombre("Alex")
    mostrarEdad(36)

    sumar(30, 29)
    dividir(11, 2)
    multiplicar(6, 5)

    println(restar(23,20))

    ifMultipleOR()
}

fun ifMultipleOR (){
    var pet = "cat"
    var isHappy = true

    if(pet=="cat" || pet=="cat" && isHappy){
        print("Es un gato o un perro")
    }
}

fun sumar (num1:Int, num2:Int){
    println(num1 + num2)
}

fun restar (num1:Int, num2:Int):Int{
    return num1-num2
}

fun multiplicar (num1:Int, num2:Int){
    println(num1 * num2)
}

fun dividir (num1:Int, num2:Int){
    println(num1.toFloat() / num2)
}

fun mostrarNombre(nombre:String){
    println("Me llamo $nombre")
}

fun mostrarEdad(edad:Int){
    println("Tengo $edad años")
}