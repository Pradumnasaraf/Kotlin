
//TODO Secondary Constructor
class First{
    constructor(){
        println("No Elements")
    }
    constructor(a:Int){
        println(a)
    }
    constructor(a:Int, b:Int){
        println("a"+" b")
    }
    constructor(a:Int, b:Int, c:Int){
        println("a"+" b"+" c")
    }
}

fun main() {
    var myObj = First(1)

}