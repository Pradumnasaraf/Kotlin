fun main() {
    val x = 2
    if(x ==2){
        println("Its True")
    } else if (x ==3){
        print("X is Three")
    } else{
        println("x is not 2 or three")
    }

    val y = if(x==2) "TWO" else "THREE" // we can also assign and store values to a variables based on condition
    println(y)

}