
import kotlin.Exception

fun main() {
    val number = readLine() ?:"0"
    val parse =try {
        number.toInt()
    }catch (e: Exception){
        "Exception"
    }
    println(parse)


}