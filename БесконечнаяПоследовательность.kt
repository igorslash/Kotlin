package Training

fun main() {
    val array = generateSequence(0) { it + 2 }
    val event = array.take(10)
    for (i in event) {
        println(i)
    }
    val array1 = generateSequence ("array #1") {
        val index = it.substring(10).toInt()
        "array #${index + 1}"
    }
    val listFirst = array1.take(10)
    for (i in listFirst) {
        println(i)
    }
}