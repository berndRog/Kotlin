package k06

class Person4(
   var name: String,  // property mutable
   val gender: Char   // property immutable
) {
   // functions
   fun print(): Unit {
      println("Name:$name, Gender:$gender");
   }
   fun asString() = "Name:$name, Gender:$gender";
}