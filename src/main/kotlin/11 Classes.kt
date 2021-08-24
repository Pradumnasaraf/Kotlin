
open class Animal(val name:String, val legsCount :Int = 4) {;
    init {
        println("Hello, my name is $name")
    }
}

fun main() {

    // creating instance for as class.
    val dog = Animal("Lmao")
}