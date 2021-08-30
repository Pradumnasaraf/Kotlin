fun main() {

    var str : String? = ""
    str = null
    println(str)
   // println(str.length)

    val number1 = readLine()
    println(number1!!.toInt())

    val number3 = readLine() ?: "0" // ?: - if function will go null it will assign value "0"
    println(number3.toInt() )

}