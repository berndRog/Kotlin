package k11

import k11.data.Person
import k11.data.initCart
import k11.data.listOfNumbers
import k11.data.listOfPeople
import org.junit.Test
import kotlin.test.assertContentEquals
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
class FilterUt {

   //region numbers
   @Test
   fun filterEvenNumbersUt() {
      // Arrange
      val numbers = listOfNumbers(10)
      val expected = listOf(2,4,6,8,10)
      // Act
      val evenNumbers = numbers.filter { it % 2 == 0 }
      // Assert
      assertEquals(expected, evenNumbers)
   }

   @Test
   fun filterOddNumbersUt() {
      // Arrange
      val numbers = listOfNumbers(10)
      val expected = listOf(1,3,5,7,9)
      // Act
      val oddNumbers = numbers.filter { it % 2 != 0 }
      // Assert
      assertEquals(expected, oddNumbers)
   }
   @Test
   fun filterEvenNumbersLe15Ut() {
      // Arrange
      val numbers = listOfNumbers(20)
      val expected = listOf(1,3,5,7,9,11,13,15)
      // Act
      val actual = numbers
         .filter { it % 2 != 0 }
         .filter { it <= 15 }
      // Assert
      assertEquals(expected, actual)
   }
   //endregion

   // region people
   @Test
   fun filterAgeGe30Ut() {
      // Arrange
      val people = listOfPeople()
      val expected = listOf(Person("Bob",31), Person("Chris",35), Person("Henry",30))
      // Act
      val actual   = people.filter { it.age >= 30  }
      // Assert
      assertEquals(expected, actual)
   }
   @Test
   fun filterStartsWithHUt() {
      // Arrange
      val people = listOfPeople()
      val expected = listOf(Person("Henry",30))
      // Act
      val actual   = people.filter { it.name.startsWith("H") }
      // Assert
      assertEquals(expected, actual)
   }
   // endregion
   // region products
   @Test
   fun filterCartsUt() {
      // Arrange
      val cart = initCart()
      val cartItems = cart.items
      val expected = mapOf(1 to cart.items[1],  4 to cart.items[4])
      // Act
      val actual = cartItems
         .filter { it.value.product.price in 1.00..<2.50 }
      // Assert
      assertContentEquals(expected.values, actual.values)
   }
   // endregion

}