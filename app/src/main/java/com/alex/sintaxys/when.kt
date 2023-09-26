package com.alex.sintaxys

fun main(){
    getMonth(9)
    getTrimester(9)
    println(getSemester(10))
}

fun getMonth(month:Int){
    when (month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")

        else -> println("no es un mes valido")
    }

}

fun getTrimester(month: Int){
    when(month){
        1, 2, 3 -> println("primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer trimestre")
        10, 11, 12 -> println("cuarto trimestre")
    }
}

fun getSemester(month: Int) = when(month){
        in 1..6 -> "primer semestre"
        in 7..12 -> "segundo semestre"
        else -> "Semestre no valido"
}

fun result(value:Any){
    when(value){
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if(!value) print("holiwi")
    }
}