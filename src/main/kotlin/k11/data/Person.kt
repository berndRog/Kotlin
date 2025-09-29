package k11.data

// immutable
data class Person(
   val name:String,
   val age:Int
) {
    fun asString()  = name.padEnd(10) +"%4d".format(age)
}
