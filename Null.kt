package main.kotlin

fun main(){
    var x = "hi"
    // x = null // error

    var y: String? = "hi"//? если налл знак вопроса
    y = null//?

    //savecall если используется налл вернёт длинну х
    x.length
    println(x)

    //elvis
    x.length ?: 0

    //!! - выбрывает в случае если в переменной налл
    val res = x!!.length//danger
}