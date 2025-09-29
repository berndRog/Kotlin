package k11

import k11.data.Book
import k11.data.Person
import k11.data.listOfNumbers
import k11.data.mutableListOfPeople
import k11.data.mutableMapOfBooks
import kotlin.collections.Map.Entry
import kotlin.collections.forEach

fun map() {

   // N U M B E R S
   val numbers = listOfNumbers(10)

   val squaredNumbers: List<Int> = numbers.map { it * it }
   println("\nMap,Original numbers $numbers")
   println("Squared  numbers $squaredNumbers")

   // P E O P L E
   println("\nMap, List of people")
   val people: MutableList<Person> = mutableListOfPeople()
   people.forEach { person -> println(person.asString()) }

   val names: List<String> = people.map { it.name }
   val ages: List<Int> = people.map { it.age }
   println("\nnames of ${names.count()} people")
   names.forEach { println(it) }

   val namesPlusAges = people.map {
      it.name +" ("+ it.age+ ")"
   }
   println("\nnames and ages of ${names.count()} people")
   namesPlusAges.forEach { println(it) }

   val namesPlusAgesFormatted = people.map {
      "Name:" + it.name.padEnd(10) + " Age:" + "%4d".format(it.age)
   }
   println("\nnames and ages formatted")
   namesPlusAgesFormatted.forEach { println(it) }

   // B O O K S
   println("\nMap, Map of books")
   val books: MutableMap<String, Book> = mutableMapOfBooks()
   books.forEach { it: Entry<String, Book> -> println(it.value.asString()) }

   val mapAuthors1: List<List<String>> = books.map { it:Entry<String, Book> -> it.value.authors }
   val mapAuthors2: List<List<String>> = books.values.map{ it:Book -> it.authors }
   val mapAuthors3: List<String> = books.values.map { it: Book -> it.authors.joinToString() }
   val mapAuthors4: String = books.values.map { it.authors }.joinToString()

   val mapMulti1: List<List<String>> = books.values.map { it.authors + it.title + it.isbn }
   val mapMulti2: List<String> = books.values.map { (it.authors + it.title + it.isbn).joinToString() }

   println("\nbooks.map { it.value.authors }" +
          "\n MutableMap<String,Book> -> List<List<String>>")
   mapAuthors1.forEach { println(it) }

   println(
      "\nbooks.values.map { it.authors }" +
         "\nMutableMap<String,Book> -> List<List<String>>"
   )
   mapAuthors2.forEach { println(it) }
   println(
      "\nbooks.values.map { it.authors.joinToString() }" +
         "\nMutableMap<String,Book> -> List<String>"
   )
   mapAuthors3.forEach { println(it) }
   println(
      "\nbooks.values.map { it.authors }.joinToString()" +
         "\nMutableMap<String,Book> -> String"
   )
   println(mapAuthors4)
   println(
      "\nbooks.values.map { it.authors + it.title + it.isbn }" +
         "\nMutableMap<String,Book> -> List<List<String>>"
   )
   mapMulti1.forEach { println(it) }
   println(
      "\nbooks.values.map { it.authors + it.title + it.isbn }.joinToString() " +
         "\nMutableMap<String,Book> -> List<String>"
   )
   mapMulti2.forEach { println(it) }


}