open class Animal2(val name:String) {;
    init {
        println("Hello, my name is $name")
    }
}
class Dog : Animal2("Dog") {
    fun barks(){
        println("Wuff!!")
    }
}
 // we use semicolon after that class name to inherits the class.
class Cat: Animal2("Cat"){

    fun Meow(){
        println("Moew")
    }
}

fun main(){
    val dog = Dog();
    dog.barks()
}