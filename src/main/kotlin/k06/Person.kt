package k06

// immutable data class
data class Person(
   val name: String = "",
   val gender: Char = '*'
) {
   // functions
   fun print(): Unit {
      println("Name:$name, Gender:$gender");
   }
   fun asString() = "Name:$name, Gender:$gender";
}
