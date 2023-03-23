package Training

fun main() {
    fun sum(x:Int, y:Int): Int {
        return x + y
    }
    //Переменные-функции
    var operation: (Int, Int) -> Int = ::sum
    val result1 = operation(14, 5)
    println(result1)

    fun subtract(x:Int, y:Int): Int {
        return x - y
    }
    operation = ::subtract
    val res2 = operation(23, 67)
    println(res2)

//------------------------------------------------------------------------------------------------------------

    val obj = mutableMapOf<String, String>()
    myWith(obj) {
        keys
        values
    }
}
inline fun<T, R>myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}
