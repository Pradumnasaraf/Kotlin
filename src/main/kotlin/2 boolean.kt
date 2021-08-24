fun main(){
    val a = true
    val b = true
    val c = false
    val d = false

    println("AND operator")
    // AND operator (&&)
    val f = a && b  //both of condition need to be true
    val g = a && c
    val h = c && d
    println(f)
    println(g)
    println(h)

    println("OR operator")
    // OR operator (||)
    val i = a || b // at least of the condition need to be true
    val j = a || c
    val k = c || d
    println(i)
    println(j)
    println(k)

    println("== operator")
    // comparison operator (Equal ==)
    val l = a == b  //check both are equal or not and will return a boolean value
    println(l)

    println("!= operator")
    // comparison operator (Not Equal !=)
    val m = a !=c
    val n  = a != b
    val o = !( a != c) // reverse the whole condition means true to false or false to true
    val p  = !(a != b)

    println(m)
    println(n)
    println(o)
    println(p)

}