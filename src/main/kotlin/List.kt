fun main() {
    val shoppingList = listOf<String>("lamborghini", "Pent House", "Rolex")
    println(shoppingList[0])

    // Mutable list
    val shoppingList1 = mutableListOf("Hey", "Hello", "Hi")
    shoppingList1.add("hola")
    var counter =0
    while(counter < shoppingList.size){
        println(shoppingList1[counter])
        counter++
    }

    for( shoppingItem in shoppingList1)
        println(shoppingItem)


    for (i in 1..100){
        println(i)
    }



}