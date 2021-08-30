fun main() {

    //TODO  While Loop
    var Counting = 0
    while(Counting < 4){
        println(Counting)
        Counting++
    }

    // TODO For Loop
    val NumCount =1..5;
    for (x in NumCount){
        println(x)
    }
    // TODO DO while loop
    var count=0
    do{
        println(count)
        count++
    }while (count<4)

    //TODO Loop with Array
    val shoppingList1 = mutableListOf("Hey", "Hello", "Hi")
    for( shoppingItem in shoppingList1)
        println(shoppingItem)

    val intArray = intArrayOf(4,5,6,3,3,6,6,6,)
    for(x in intArray.indices){
        print("${intArray[x]} ")
    }



}
