package k06

class Person3(
   pName: String,
   pGender: Char
) {
   // properties
   var name: String = pName
   val gender: Char = pGender

   // functions
   fun print(): Unit {
      println("Name:$name, Gender:$gender");
   }
   fun asString() = "Name:$name, Gender:$gender";

}