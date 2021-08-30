fun main() {
    //TODO For Simple String Input

    val userInput = readLine()
    println("Your Input is $userInput")

    //TODO For getting Int Input We use toInt() method.

    val userInputNum = readLine()!!.toInt() /** by adding !! it implies input cannot return null**/
    println("Your number input is $userInputNum")

    println("Doubling the Input ${userInputNum*userInputNum}")

    val userInputDouble = readLine()!!.toDouble();
    println(userInputDouble)
}