fun main() {

    // TODO Range are closed in Kotlin that means start and end value will be included range

    // TODO  Here i will go from 1-10

    val a= 1.rangeTo(10)
    if (3 in a){
        println("3 Is the Range")
    }
    if (310 !in a){ // !in not in range
        println("not in the Range")
    }

    for (i in 1..10) { print("$i ") }
    println()

    //TODO For excluding 10
    for (i in 1 until 10)
    {print("$i ")}
    println()

    //TODO For Counting Down to Up
    for (i in 10 downTo (0))
    {print("$i ")}
    println()

    // TODO by Using Step i will just 2 Steps Like String from 1 then 3,5, 7, till 9
    for (i in 1..10 step 2)
    {print("$i ") }
    println()

    // TODO Here i will be 10,8,6,4,2,0
    for (i in 10 downTo 0 step 2)
    { print("$i ")}
    println()

    doSomething(1,2,3,4,7)
}
fun doSomething(vararg numbers: Int) {
    var ticker =0
    for(number in numbers){
        ticker += number
    }
    println("total sum +$ticker")
}
