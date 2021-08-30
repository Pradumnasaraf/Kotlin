fun printTenNumber(){
    for(i in 1..10){
        println(i)
    } }

//TODO Return Function
fun isEven(int: Int):Boolean{ // Adding semicolon and data type indicates what's the function return data type
    return int % 2 == 0 }

fun getSquare(number: Int): Int{
    return (number* number) }

fun addTwoNumbers(number1: Int, number2: Int): Int {
    return number1+number2
}
 //TODO  DEFAULT ARGUMENT - When we don't give arguments the function will take 10(Default argument) by default;
fun defaultPara (number: Int = 10): Int{
    return number*number
}

//TODO Extension Function
fun Int.isOdd(): Boolean{
    return this % 2==1
}
fun main() {

    // Calling Extension Function
    val gg = 3
    println(gg.isOdd())

    // Named Arguments
    println(addTwoNumbers(number1 = 3,number2 = 4)) // function parameters can be named when calling functions

}



