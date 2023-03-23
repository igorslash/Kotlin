package Training.Courutins

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main() = coroutineScope{

    async{ printHello()}
    println("Program has finished")


    val message: Deferred<String> = async{ getMessage()}
    println("message: ${message.await()}")
    println("Program has finished")
}
suspend fun printHello(){
    delay(500L)  // имитация продолжительной работы
    println("Hello work!")
}
suspend fun getMessage() : String{
    delay(500L)  // имитация продолжительной работы
    return "Hello"
}