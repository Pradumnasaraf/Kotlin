fun main() {

    // TODO: We can assign some values like 1,2,3,4
    val x = 4
    when(x){
        1 -> println("One") //called branch - just like boolean value
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")

    }

   //TODO: we can also throw range in the branch
    val y =5
    when(y){
        in 1..2 -> println("X is between 1 and 2")
        in 3..10 -> println("X is between 3 and 10")
        else ->{
            println("X is not in the range of")
        }
    }

    //TODO: We can use it as a replacement for an id-else statement
    val z:Int= 19
  var kk=  when{ // we can also assign the value to a variable.
       z< 20 -> println("Z is Less than 20")
       z> 20 -> println("Z is Greater than 20")
        else -> println()
    }

    // TODO: We can also assign more than one number and it can be random numbers.
    val a =5
    when(a) {
        1, 3, 5, 7, 9, 11 -> println("It's Odd")
        2, 4, 6, 8, 10 -> println("Its Even")
        else -> println()
    }

}
