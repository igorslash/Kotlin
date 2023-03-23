package main.kotlin

fun main(){
    val num = mutableListOf(1, 6, 9, 11, 34)
    val res = sort(num)
    for (i in res)
        println(i)
    println(testSimple(45, 6))
    println(testNameArguments(x = "hi", y = 4))
    testDefault()
    printEven(1, 3, 6, 8, 9)//vararg
    printEven(*intArrayOf(12, 5, 6, 7), 4, 7)
}
fun testSimple(x: Int, y: Int): Int = x + y

fun testSimple(x: Int): String {
    return "Str is $x"
}
fun testNameArguments(x: String, y: Int): List<String> {
    return listOf(x + y)
}
//void
fun testDefault(x: Int = 3, y: Int = 4) {
    println(x + y)
}
//vararg любое количество значений
fun printEven(vararg num: Int) {
    num.forEach { e -> if (e % 2 == 0) println(e)}
}

//пузырьковая сортировка
fun sort(num: MutableList<Int>): List<Int> {
    for (i in 0 until num.size) {
        for (j in num.size - 1 downTo i) {
            if (num[j] < num[j - i]) {
                val temp = num[j]
                num[j] = num[j - i]
                num[j - i] = temp
            }
        }
    }
    return num

}

val  res = modify("Hello ") { it.plus("world") }

inline fun modify(string: String, modify: (String) -> String): String {
//Инлайн нужно ставить
// чтобы не создавался  анонимный  объект который влияет на производительность
    return modify(string)
}