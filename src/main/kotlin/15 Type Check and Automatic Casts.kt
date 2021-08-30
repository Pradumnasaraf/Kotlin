
// TODO Proving Any Class we can give any type of argument like String Int
//TODO  we don't need to specify the parameter type in the function.

fun printIt (arg:Any){
    println(arg)
}
//TODO is operator to entered argument data type
fun printOut(arg :Any){
    if(arg is String)
        println("Its a String Argument")
}
fun main() {

    printIt(0)
    println("Hey Yo!")
    printOut(2)
    printOut("hey")
}