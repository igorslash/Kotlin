package Training.Courutins

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope {
    val job = launch {
        for (i in 0..5) {
            println(i)
            delay(500)
        }
    }
    delay(1000)
    job.start()
    job.cancel()//отменяем корутину
    job.join() // ожидаем завершения корутины cancelAndJoin()
    println("End")
}
