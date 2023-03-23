package Training.Последовательность

fun main() {
    val people = sequenceOf("Tom", "Sam", "Bob")    //тип Sequence<String>
    println(people.joinToString())  // Tom, Sam, Bob

    var number = 0
    val numbers = generateSequence{ number += 2; if(number > 8) null else number}
    println(numbers.joinToString())    // 2, 4, 6, 8

    val numbers1 = generateSequence(5){ if(it == 25) null else it + 5}
    println(numbers1.joinToString())

    val numbers2 = sequence {
        yield(1)
        yield(4)
        yield(7)
    }
    println(numbers2.joinToString())

    val book = sequence {
        val data = listOf("1", "2", "3")
        yieldAll(data)
    }
    println(book.joinToString())
}