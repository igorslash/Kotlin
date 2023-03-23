package Training.Generics

//Ограничения обобщений
fun main() {
    val result1 = getBiggest(1, 2)
    println(result1)
    val result2 = getBiggest("Tom", "Sam")
    println(result2)


    val email1 = EmailMessage("Hello Kotlin")
    val outlook = Messenger<EmailMessage>()
    outlook.send(email1)

    val skype = Messenger<SmsMessage>()
    val sms1 = SmsMessage("Привет, ты спишь?")
    skype.send(sms1)

    //------------------Ограничения в классах
    val result4 = getBiggest(1, 2)
    println(result1)    // 2

    val result = getBiggest(1.6, -2.8)
    println(result)

}
fun <T: Comparable<T>> getBiggest(a: T, b: T): T{//Ограничения
    return if(a > b) a
    else b
}
//Установка нескольких ограничений
fun <T> getBiggest(a: T, b: T): T where T: Comparable<T>,
                                        T: Number {
    return if(a > b) a
    else b
}

//Ограничения в классах
class Messenger<T>() where T: Message, T: Logger{
    fun send(mes: T){
        mes.log()
    }
}
interface Message{ val text: String }
interface Logger{ fun log() }

class EmailMessage(override val text: String): Message, Logger{
    override fun log() = println("Email: $text")
}
class SmsMessage(override val text: String): Message, Logger{
    override fun log() = println("SMS: $text")
}