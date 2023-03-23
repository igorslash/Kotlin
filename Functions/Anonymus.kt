package Training.Functions

fun main() {

    val action1 = selectAction(1)
    val result1 = action1(4, 5)
    println(result1)        // 9

    val action2 = selectAction(3)
    val result2 = action2(4, 5)
    println(result2)        // 20

    val action3 = selectAction(9)
    val result3 = action3(4, 5)
    println(result3)        // 0
    fun selectAction(key: Int): (Int, Int) -> Int{
        // определение возвращаемого результата
        when(key){
            1 -> return fun(x: Int, y: Int): Int = x + y
            2 -> return fun(x: Int, y: Int): Int = x - y
            3 -> return fun(x: Int, y: Int): Int = x * y
            else -> return fun(x: Int, y: Int): Int = 0
        }
    }

    val sum = fun(x: Int, y: Int): Int = x + y
    val result = sum(5, 4)
    println(result)
}