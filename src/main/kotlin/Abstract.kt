// abstract class
abstract class A(){
    val StringA =""
}

class B(){
    val StringB =""
}
class C(){
    val StringC =""
}

abstract class D (){
    val StringD =""

    // This method need to be implemented in Sub Class
    abstract fun anaimalsound()}

open class E:D (){
    val StringE =""

    // It's Compulsory to implements the abstract method.
    override fun anaimalsound() {
        TODO("Not yet implemented")
    }
}

fun main() {
    //var myA =A() // Here this is not possible we can't create instance of an abstract class.

    val myE = E()

    //
    myE.StringE
    myE.StringD // here abstract classes methods and attribute can be called.


}
