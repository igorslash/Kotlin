package Training

var name: String? = "4"

val list: MutableList<Int>? = mutableListOf()

fun main() {
    name?.let {
        if (it.length > 5) {
            println(it)
        }
    }
    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0 until 10) {
            add((Math.random() * 20).toInt())
        }
        println(sum())
        println(average())
    }
    with(list) {
        for (i in 0 until 20) {
            add((Math.random() * 10).toInt())
        }
        val res = filter { it % 2 == 0 }.take(10)
        for (i in res) {
            println(i)
        }
    }

    val tom = Person("Tom", null)
    val emailOfTom = with(tom) {
        if(email==null)
            email = "${name.lowercase()}@gmail.com"
        email
    }
    println(emailOfTom) // tom@gmail.com
}
data class Person(val name: String, var email: String?)

