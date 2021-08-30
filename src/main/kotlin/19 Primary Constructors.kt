//TODO Primary Constructor

// Adding constructor keyword after class name is optional.
class MyUser constructor(var name:String){
    fun sayHI(){
        println("Hello i am $name")

    }
}


//TODO Initializer Blocks
//When even object is created it get automatically executed.
class Saraf (){
    init {
        println("Hey It Pradumna")
    }
    init {
        println("Second INIT block") //we can have more than one init block
    }
}

fun main() {
    val myObj = MyUser("Prdaumna Saraf")
    myObj.sayHI()
    val saraf = Saraf()
}




