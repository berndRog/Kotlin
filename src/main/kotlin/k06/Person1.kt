package k06

class Person1 {

   // fields must be initialized (if not nullable)
   private var _name:  String = ""
   private var _gender: Char = '*'

   // properties
   var name: String
      get() = _name
      set(value) { _name = value }

//   var gender: Char = '*'
//      get() = _gender
//      private set

   val gender: Char
      get() = _gender

   // constructor
   constructor(pName: String, pGender: Char ) {
      _name = pName
      _gender = pGender
   }

   // functions
   fun print(): Unit {
      println("Name:$_name, Gender:$_gender")
   }
   fun asString() =
      "Name:$_name, Gender:$_gender"

}