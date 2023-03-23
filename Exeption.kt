package Training

fun main() {
    println(sum("4", "e"))
}
fun sum(x: String, y: String): Int {
    return try {
        val num1 = x.toInt()
        val  num2 = y.toInt();
        num1 + num2
    }catch (e: Exception) {
        0
    }
}