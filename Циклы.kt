package main.kotlin

fun main(){
    val items = listOf(1, 2, 3, 4)//не изменяемые списки mutableListOf
    val items1 = mutableListOf(1, 2, 3, 4)
    for((index, i) in items.withIndex())
        items1[index] = i.times(2)
    for (item in items) {
        println(item)
    }
    val array = arrayOfNulls<Int?>(301)
    for ((index, i) in(300..600).withIndex())
        array[index] = i
    for (i in array.size - 1 downTo 0 step 5)
        println(i)

    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    //Диапозоны
    for (i in 0..2) {
        println(i)
    }
    println(2 in 0..3)

    for (i in 1 until 10) {//1 - 9
        println(i)
    }
    for (i in 1..9) {

    }
    for (i in (0..10) step 4) {
        println(i)
    }
    for (i in 100 downTo 0){//идёт вниз по массиву

    }
}