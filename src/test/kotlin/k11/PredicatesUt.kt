package k11

import k11.data.Person
import k11.data.listOfPeople
import org.junit.Test
import kotlin.collections.forEach
import kotlin.test.assertEquals


/*
   // Alice   29
   // Bob     31
   // Chris   35
   // Dianna  27
   // Ethan   21
   // Faith   23
   // Gavin   23
   // Henry   30
   // Ian     27
*/
class PredicatesUt {

   @Test
   fun allTrueUt() {
      // Arrange
      val people = listOfPeople()
      var expected = true
      // Act
      // are all people <= 40
      val actual = people.all { p: Person ->   p.age <= 40 }
      // Assert
      assertEquals(expected, actual)
  }
   @Test
   fun allFalseUt() {
      // Arrange
      val people = listOfPeople()
      var expected = false
      // Act
      // are all people <= 25
      val actual = people.all { p: Person ->   p.age <= 25 }
      // Assert
      assertEquals(expected, actual)
   }
   @Test
   fun anyFalseUt() {
      // Arrange
      val people = listOfPeople()
      var expected = false
      // Act
      // are any person <= 18
      val actual = people.any { p: Person ->   p.age <= 18 }
      // Assert
      assertEquals(expected, actual)
   }

   @Test
   fun anyTrueUt() {
      // Arrange
      val people = listOfPeople()
      var expected = true
      // Act
      // are any person == 23
      val actual = people.any { p: Person ->   p.age == 23 }
      // Assert
      assertEquals(expected, actual)
   }



}