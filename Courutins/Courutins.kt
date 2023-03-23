package Training.Courutins

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() = coroutineScope {
    launch{ doWork() }
    launch { block() }

    println("Hello Coroutines")
}

suspend fun doWork(){
    for(i in 0..5){
        println(i)
        delay(400L)
    }
}
suspend fun block() = runBlocking {
    for(i in 0..5){
        println(i)
        delay(400L)
    }
}