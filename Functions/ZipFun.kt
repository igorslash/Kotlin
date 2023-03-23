package Training

fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..100) {
        names.add("Names$i")
        phones.add(79_00_00_00 + (Math.random() * 1_00_00_00).toLong())
    }
    val users = names.zip(phones)
    for (user in users) {
        println("Name: ${user.first} phone: ${user.second}")
    }
}
