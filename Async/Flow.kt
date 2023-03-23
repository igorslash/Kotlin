package Training.Async

import kotlinx.coroutines.flow.*

suspend fun main() {

    val numberFlow = getNumbers() // поток создан, но не запущен
    println("numberFlow has created")
    println("launch collect function")
    numberFlow.collect { number -> println(number) }   // запуск потока


    //flowof
    val numberFlow1 : Flow<Int> = flowOf(1, 2, 3, 5, 8)
    numberFlow.collect{n -> println(n)}


    //asflow
    // преобразование последовательности в поток
    val numberFlow2 : Flow<Int> = (1..5).asFlow()
    numberFlow.collect{n -> println(n)}

    // преобразование коллекции List<String> в поток
    val userFlow = listOf("Tom", "Sam", "Bob").asFlow()
    userFlow.collect({user -> println(user)})

}
fun getNumbers() = flow{
    println("numberFlow has started")
    for(item in 1..5){
        emit(item * item)
    }
}
