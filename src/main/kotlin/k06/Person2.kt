package k06

class Person2 {

   // properties
   var name: String
   val gender: Char

   // constructor
   constructor(pName: String, pGender: Char ) {
      name = pName
      gender = pGender
   }

   // functions
   fun print(): Unit {
      println("Name:$name, Gender:$gender");
   }
   fun asString() = "Name:$name, Gender:$gender";

}