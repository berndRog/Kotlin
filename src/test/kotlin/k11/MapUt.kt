package k11

import k11.data.Book
import kotlin.test.assertTrue
import k11.data.listOfNumbers
import k11.data.listOfPeople
import k11.data.mapOfBooks
import org.junit.Test
import kotlin.String
import kotlin.collections.Map.Entry
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class MapUt {

   // region people
   // Alice   29
   // Bob     31
   // Chris   35
   // Dianna  27
   // Ethan   21
   // Faith   23
   // Gavin   23
   // Henry   30
   // Ian     27
   @Test
   fun mapNumbersUt() {
      // Arrange
      val numbers = listOfNumbers(10)
      val expected = listOf(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
      // Act
      val actual = numbers.map { it * it }
      // Assert
      assertEquals(expected, actual)
   }

   @Test
   fun mapNameUt() {
      // Arrange
      val people = listOfPeople()
      val expected = listOf("Alice", "Bob", "Chris", "Dianna", "Ethan", "Faith", "Gavin", "Henry", "Ian")
      // Act
      val actual = people.map { it.name }
      // Assert
      assertEquals(expected, actual)
   }
   @Test
   fun mapAgesUt() {
      // Arrange
      val people = listOfPeople()
      val expected = listOf(29, 31, 35, 27, 21, 23, 23, 30, 27)
      // Act
      val actual = people.map { it.age }
      // Assert
      assertEquals(expected, actual)
   }
   @Test
   fun mapTextUt() {
      // Arrange
      val people = listOfPeople()
      val expected = listOf(29, 31, 35, 27, 21, 23, 23, 30, 27)
      // Act
      val actual = people.map {
         "Name:" + it.name.padEnd(10) + " Age:" + "%4d".format(it.age)
      }
      // Assert
      //println(actual)
      actual.forEach { println(it) }
      assertTrue(true)
   }
   // endregion

   // region books  Map<String, Book>
   // Key                  Value
   //                      authors              title                            year  publisher   ISBN
   // 978-1-61729-329-0    D.Jemerov,S.Isakova  Kotlin in Action,                2017  Manning     978-1-61729-329-0
   // 978-1-78712-368-7    M.Moskala S.Wojda,   Android Development with Kotlin  2017  Packt       978-1-78712-368-7
   // 978-0-13-485419-9    P.Sommerhoff,        Kotlin for Android Development   2019  Pearson     978-0-13-485419-9
   // 978-1-61729-536-2    P.-Y.Saumont,        The Joy of Kotlin                2019  Manning     978-1-61729-536-2

   @Test
   fun mapBooksAuthorsUt() {
      // Arrange
      val books = mapOfBooks()
      val expected = listOf(
         listOf("D.Jemerov","S.Isakova"),
         listOf("M.Moskala", "S.Wojda"),
         listOf("P.Sommerhoff"),
         listOf("P.-Y.Saumont")
      )
      // Act
      val mapAuthors1: List<List<String>> = books.map { it:Entry<String, Book> -> it.value.authors }
      val mapAuthors2: List<List<String>> = books.values.map{ it:Book -> it.authors }
      // Assert
      mapAuthors1.forEach { it ->
         println(it.joinToString(","))
      }
      // Assert
      assertContentEquals(expected, mapAuthors1)
      assertContentEquals(expected, mapAuthors2)
   }
   @Test
   fun mapBooksAuthorsWithTitleUt() {
      // Arrange
      val books = mapOfBooks()
      val expected = listOf(
        //12345678901234567890123451234567890123456789012345678901234567890123456789012345678901234567890
         "D.Jemerov, S.Isakova     Kotlin in Action                   ",
         "M.Moskala, S.Wojda       Android Development with Kotlin    ",
         "P.Sommerhoff             Kotlin for Android Development     ",
         "P.-Y.Saumont             The Joy of Kotlin                  "
      )
      // Act
      val actual: List<String> = books.values.map{ it:Book ->
         "${it.authors.joinToString(", ")}".padEnd(25) + "${it.title}".padEnd(35)
      }
      // Assert
      actual.forEach { it ->
         println(it)
      }
      // Assert
      assertContentEquals(expected, actual)
   }
   // endregion


}

/*



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

*/