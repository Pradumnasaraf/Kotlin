fun printTenNumber(){
    for(i in 1..10){
        println(i)
    } }

fun isEven(int: Int):Boolean{
    return int % 2 == 0 }

fun getSquare(number: Int): Int{
    return (number* number) }

fun addTwoNumbers(number1: Int, number2: Int): Int {
    return number1+number2
}
 // When we don't give arguments the function will take 10(Default argument) by default;
fun defaultPara (number: Int = 10): Int{
    return number*number
}

// Extension Function
fun Int.isOdd(): Boolean{
    return this % 2==1
}
fun main() {
   // printTenNumber()
    println("Square = "+ getSquare(5))
    println(isEven(81))
    println(addTwoNumbers(1,5))
   // defaultPara(100)

    println(defaultPara(number = 5))
    println(defaultPara())

    // Calling Extension Function
    val gg = 3
    val aa :Int = 1
    println(gg.isOdd())

}



