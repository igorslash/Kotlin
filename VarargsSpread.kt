package Training

fun main() {
    fun nums(vararg number: Int, n: Int) {
        for (num in number) {
            println(num * n)
        }
    }
    val res = intArrayOf(1, 2, 3, 4)
    nums(*res, n = 1)//Spread

    fun printStrings(vararg strings: String){
        for(str in strings)
            println(str)
    }
    printStrings("Tom", "Bob", "Sam")
    printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")
}