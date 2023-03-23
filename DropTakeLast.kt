package Training

fun main() {
    val array = (0..10).toList()
    val res = array.map { e -> "e = $e" }
    val first = res.dropLast(4)//takeLast
    for (res in first)
        println(res)


}