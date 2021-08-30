import java.lang.reflect.Array.get

class User{

    var age :Int =0
        //TODO Set () Method
    set(value){ // Use to define the behaviour when a value is assign to a property
        if (value>0){ // Value is inputted value by user
       field = value // Here field is age
    }
}
    // TODO get() method
    get(){
        return field+2
    }
    fun printInfo(){
        println("Age is $age")

    }
}

fun main() {
    val obj = User()
    obj.age = -22
    obj.printInfo()
    obj.age = 12
    obj.printInfo()


}