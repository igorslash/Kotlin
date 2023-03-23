package Training.Functions

fun main() {

    //Run
    val tom = Person1("Tom", null)
    val emailOfTom = tom.run {
        if(email==null)
            email = "${name.lowercase()}@gmail.com"
        email
    }
    println(emailOfTom) // tom@gmail.com

    //Apply
    val bob = Employee()
    bob.name("Bob")
    bob.age(26)
    bob.company("JetBrains")
    println("${bob.name} (${bob.age}) - ${bob.company}") // Bob (26) - JetBrains


    //Also
    val man = Person2("Tom", null)
    man.also {
        if(it.email==null)
            it.email = "${it.name.lowercase()}@gmail.com"
    }
    println(man.email) // tom@gmail.com
}



data class Person1(val name: String, var email: String?)



//-----------------------------------------------------------------------------------------
data class Employee(var name: String = "", var age: Int = 0, var company: String = "") {
    fun age(_age: Int): Employee = apply { age = _age }
    fun name(_name: String): Employee = apply { name = _name }
    fun company(_company: String): Employee = apply { company = _company }
}

//Also------------------------------------------------------------------------------

data class Person2(val name: String, var email: String?)