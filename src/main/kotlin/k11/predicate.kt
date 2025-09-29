package k11

import k11.data.Person
import k11.data.mutableListOfPeople

fun predicate() {

   println("\nPredicate, List of people")
   val people: MutableList<Person> = mutableListOfPeople()
   people.forEach { person -> println(person.asString()) }

   val allPeople1 = people.all { p: Person ->   p.age <= 25 }
   val allPeople2 = people.all { it ->         it.age <= 25 }
   val allPeople3 = people.all {               it.age <= 25 }
   println("are all people <= 25: $allPeople3")

   val anyPeople  = people.any{ p: Person -> p.age <= 25 }
   println("are there any people <= 25: $anyPeople")

   val countPeople  = people.count{ p: Person -> p.age <= 25 }
   println("how many people <= 25: $countPeople")

}