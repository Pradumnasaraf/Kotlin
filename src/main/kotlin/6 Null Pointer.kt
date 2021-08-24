fun main() {
    val number1 = readLine()
    val number2 = readLine()
    val result = number1!!.toInt() + number2!!.toInt() //we add !! to state that it will not throw a null point exception.
    println(result)

    val number3 = readLine() ?: "0" // ?: - if function will go null it will assign value "0"
    val number4 = readLine() ?: "0" // ?: - if function will go null it will assign value "0"
    val result1 = number3.toInt() + number4.toInt()
    println(result)

}