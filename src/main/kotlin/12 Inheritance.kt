class Dog : Animal("Dog") {
    fun barks(){
        println("Wuff!!")
    }
}
 // we use semicolon after that class name to inherits the class.
class Cat: Animal("Cat"){

    fun Meow(){
        println("Moew")
    }
}

fun main(){
    val dog = Dog();
    dog.barks()
}