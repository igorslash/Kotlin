package Training.Courutins

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce

suspend fun main() = coroutineScope{

    val channel = Channel<Int>()
    launch {
        for (n in 1..5) {
            // отправляем данные через канал
            channel.send(n)
        }
        channel.close()  // Закрытие канала
    }

    // получаем данные из канала
    repeat(5) {
        val number = channel.receive()
        println(number)
    }
    println("End")



    val users = getUsers()
    users.consumeEach { user -> println(user) }//consumeEach по сути заменяет цикл for
    println("End")
}

fun CoroutineScope.getUsers(): ReceiveChannel<String> = produce{// по сути является
// распростаненным
// способом передачи данных от одной корутины к другой
    val users = listOf("Tom", "Bob", "Sam")
    for (user in users) {
        send(user)
    }
}