package k11

import k11.data.Person
import k11.data.mutableListOfPeople

fun aggregate() {

   println("\nAggregate, List of people")
   val people: MutableList<Person> = mutableListOfPeople()
   people.forEach { person -> println(person.asString()) }

   // Alice   29
   // Bob     31
   // Chris   35
   // Dianna  27
   // Ethan   21
   // Faith   23
   // Gavin   23
   // Henry   30
   // Ian     27

   // min(), max(), sum()
   val minPerson = people.minByOrNull { it.age }
   val maxPerson = people.maxByOrNull { it.age }

   val count30 = people.count { it.age >= 30 }


   val averagedAge = people.sumOf { it.age }.toDouble() / people.count()

   println("youngest person ${minPerson?.asString()} ")
   println("oldest   person ${maxPerson?.asString()} ")
   println("number people with an age >= 30: $count30")
   println("averaged age " + "%.1f".format(averagedAge))

}