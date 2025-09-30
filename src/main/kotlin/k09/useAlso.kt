package k09

fun useAlso(){

   val person = Person("Erika Mustermann", 'w').also { it->
      it.print()
   }


}

data class Person(
   val name:String,
   val gender: Char
) {
   fun print() =
      println("name: $name, gender: $gender")
}