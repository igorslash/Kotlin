package src

fun main() {
    val number = (0..10).toList()
    val r = number.map { e -> e * 2 }
    for (i in r)
        println(i)

    val x = listOf(1, 2, 3, 4)
    x.forEach {e -> e * 2}
    x.filter{e -> e % 2 == 0}
    x.reduce{sum, e -> sum + e}
    x.sortedDescending()
   // x.any(it > 10)
   // x.all { it < 10 }

    val num = listOf(1, -2, 3, -4)
    val(positive, negative) = num.partition { it > 0 }
    
    val res = listOf("a", "v", "c").groupBy { it.length }

    val sum = {x: Int, y: Int ->
        val res = if (x > y)
            x
        else
            y
        res
    }
    val result = sum(4, 3);
    println(result)

    val perim: (Int, Int) -> Int = {z,y ->(z + y) * 2}
    println(perim(2, 4))

    val s: (String) -> Unit = { println("Hello, $it")}//unit = void
    s("igor")

    //пузырьковая сортировка

    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0)
            for(j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        it
    }

    val sortArray = sort(arrayOf(1, 4, 5, 8))
    for (i in sortArray)
        println(i)

//-----------------------------------------------------------------------------------
    val action1 = selectAction1(1)
    val result1 = action1(4, 5)
    println(result1)        // 9

    val action2 = selectAction1(3)
    val result2 = action2(4, 5)
    println(result2)        // 20

    val action3 = selectAction1(9)
    val result3 = action3(4, 5)
    println(result3)        // 0
}
fun selectAction1(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата
    when(key){
        1 -> return {x, y -> x + y }
        2 -> return {x, y -> x - y }
        3 -> return {x, y -> x * y }
        else -> return { _, _ -> 0 }//_, _ -> Неиспользуемые параметры
    }
}