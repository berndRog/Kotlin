package k06

fun useClassPerson() {

   val person1 = Person1("Erika Mustermann", 'w')
   person1.print()
   println( person1.asString())

   person1.name = "Erika Meier"
// person1.gender = 'm'
   println("${person1.asString()}")

// Person 2 -----------------------------------------------
   val person2 = Person2("Max Mustermann", 'm')
   println("\n${person2.asString()}")
   person2.print()

   person2.name = "Max Müller"
// person2.gender = '*'
   println("${person2.asString()}")

// Person 3 -----------------------------------------------
   val person3 = Person3("Anna Mustermann", 'w')
   println("\n${person3.asString()}")
   person3.print()

   person3.name = "Anna Arndt"
// person3.gender = '*'
   println("${person3.asString()}")


// Person 4 -----------------------------------------------
   val person4 = Person4("Moritz Mustermann", 'm')
   println("\n${person4.asString()}")
   person4.print()

   person4.name = "Moritz Schulze"
// person4.gender = '*'
   println("${person3.asString()}")

// data class Person  -----------------------------------------------
   var person = Person("Bernd Rogalla", 'm')
   println("\n${person.asString()}")
   person.print()

// person.name = "Moritz Schulze"
// person.gender = '*'
   person = person.copy( name = "Bernd Fischer", gender = '*')
   println("${person.asString()}")




}