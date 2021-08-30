fun main(){
    val True1 = true
    val True2 = true
    val False1 = false
    val False2 = false

    println("AND operator")
    // AND operator (&&)
    val f = True1 && True2  //both of condition need to be true
    val g = True1 && False1
    val h = False1 && False2
    println(f)
    println(g)
    println(h)

    println("OR operator")
    // OR operator (||)
    val i = True1 || True2 // at least of the condition need to be true
    val j = True1 || False1
    val k = False1 || False2
    println(i)
    println(j)
    println(k)

    println("== EQUAL operator")
    // comparison operator (Equal ==)
    val l = True1 == True2  //check both are equal or not and will return a boolean value
    println(l)

    println("!= NOT operator")
    // comparison operator (Not Equal !=)
    val m = True1 !=False1
    val n  = True1 != True2
    val o = !( True1 != False1) // reverse the whole condition means true to false or false to true
    val p  = !(True1 != True2)

    println(m)
    println(n)
    println(o)
    println(p)

}