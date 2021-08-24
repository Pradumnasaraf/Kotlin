fun main() {
    val x = 3

   // WHEN is similar to if & else statement or somewhere like switch statement.

    when(x){
        in 1..2 -> println("X is between 1 and 2")
        in 3..10 -> println("X is between 3 and 10")
        else ->{
            println("X is not in the range of")
        }
    }

}