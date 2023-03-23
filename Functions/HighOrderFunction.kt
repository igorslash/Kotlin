package Training.Functions

fun main() {
    fun displayMessage(mes: () -> Unit) {
        mes()
    }
    fun morning() {
        println("Good")
    }
    fun evening() {
        println("evening")
    }
    displayMessage(::morning)
    displayMessage(::evening)

    //---------------------------------------------------//
    val action1 = selectAction(1)
    println(action1(8,5))    // 13

    val action2 = selectAction(2)
    println(action2(8,5))    // 3
}
fun selectAction(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата
    when(key){
        1 -> return ::sum
        2 -> return ::subtract
        3 -> return ::multiply
        else -> return ::empty
    }
}
fun empty (a: Int, b: Int): Int{
    return 0
}
fun sum(a: Int, b: Int): Int{
    return a + b
}
fun subtract(a: Int, b: Int): Int{
    return a - b
}
fun multiply(a: Int, b: Int): Int{
    return a * b
}
