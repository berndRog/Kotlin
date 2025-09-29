package k11

import k11.data.Person
import k11.data.mutableListOfPeople
import kotlin.collections.forEach

fun operators() {

   // P E O P L E
   println("\nMap, List of people")
   val people: MutableList<Person> = mutableListOfPeople()
   people.forEach { person -> println(person.asString()) }

   val personAge30: Person? = people.firstOrNull { it.age == 30 }
   println("person with age = 30: ${personAge30?.name}")

   val personAge23First: Person? = people.firstOrNull { it.age == 23 }
   val personAge23Last: Person? = people.lastOrNull { it.age == 23 }
   println("first person with age = 23: ${personAge23First?.name}")
   println("last person with age = 23: ${personAge23Last?.name}")

   val first3:List<Person> = people.take(3)
   val last3:List<Person> = people.takeLast(3)
   println("first three people: ${first3.joinToString()}")
   println("last three people: ${last3.joinToString()}")


   val slice = people.slice(3..5)  // indices!!!
   println("slice 3..5: ${slice.joinToString()}")


}