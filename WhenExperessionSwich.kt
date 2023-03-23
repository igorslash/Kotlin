package main.kotlin

fun main(){

}
fun testWhen(input: Any) {
    when(input) {
        1 -> println("one")
        2 -> println("two")
        in 10..20 -> println("0 - 20")
        is String -> println("String")
        else -> println("what")
    }
}


