class Animal(){
    var animalName:String ="Dog" //Properties
    var nickname :String = ""
    val legCount:Int= 4

}

fun main() {

    // creating instance for as class.
    val dog = Animal()
    val dog1:Animal = Animal() // Both way are correct

    println(dog.legCount)
    dog.nickname = "puppy" // Setting value for nickname
    println(dog.nickname)



}