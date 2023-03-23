package Training

fun main() {
    val age = 5
    if (age.isAgeValid()) {
        println(false)
    }
    println(age.isPositive())
}
fun Int.isAgeValid() = this in 12..100

fun Int.isPositive() = this >= 0

