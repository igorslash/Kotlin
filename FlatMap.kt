package Training

fun main() {
    val revenueByWeek = listOf(
        listOf(8, 6, 5, 1, 2),
        listOf(10, 9, 5, 78, 11),
        listOf(2, 6, 34, 4, 2))

    val average = revenueByWeek.flatten()//flatMap Возвращает
// единый список всех элементов из всех коллекций в данной коллекции.
    println(average)


    val data = mapOf("file1" to listOf(1, 4, 6, 7, 8),//Pair
        "file2" to listOf(5, 9, 10, 11))


    val averageValue = data.flatMap { it.value }.average()
    println(averageValue)



    val data1 = mapOf("file1" to listOf(1, 4, 6, 7, 8),//Pair
        "file2" to listOf(5, 9, -10, 11))



    val averageValue1 = data1.filter { it.value.all { it >= 0 } }
        //all = any
        //Возвращает true, если все элементы соответствуют заданному предикату.
        .flatMap { it.value }.average()
    println(averageValue1)

}