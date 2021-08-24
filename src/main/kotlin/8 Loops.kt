fun main() {

    var counter =0
    val shoppingList1 = mutableListOf("Hey", "Hello", "Hi")

    // While Loop
    while(counter < shoppingList1.size){
        println(shoppingList1[counter])
        counter++
    }

    // For Loop
    for( shoppingItem in shoppingList1)
        println(shoppingItem)



    // TODO  Here i will go from 1-10
    for (i in 1..10) { print(i) }
    println()

    // TODO Here Reverse Order i will go form 10 to 1
    for (i in 10 downTo 0){
        println(i)
    }

    //TODO For excluding 10
    for (i in 1 until 10) {print(i) }
    println()

    //TODO For Counting Down to Up
    for (i in 10 downTo 0) { print(i)}
    println()

    // TODO by Using Step i will just 2 Steps Like String from 1 then 3,5, 7, till 9
    for (i in 1..10 step 2) {print(i) }
    println()

    // TODO Here i will be 10,8,6,4,2,0
    for (i in 10 downTo 0 step 2) { print(i)}
    println()
doSomething(1,2,3,4)






}
fun doSomething(vararg numbers: Int) {
    var ticker =0
    for(number in numbers){
        ticker += number
    }
    println(ticker)
}