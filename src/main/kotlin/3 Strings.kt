fun main() {
 val myString = "Hello"

 println(myString)
 println(myString.equals("Hey"))
 println(myString.toUpperCase())
 println(myString.toLowerCase())

//TODO just like /n in java here we use """ and | in every next line and on it calls a method called {@Link .trimMagin}
 val text1 = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()

 println(text1)

 // TODO Subs String,
 val myString1 = "Hello My Name is Pradumna Saraf"
 var mySub =""

 // TODO Here we want to print "Pradumna"
 mySub = myString1.substring(17..24) // we can simply we .. to tell the range
 println(mySub)



}