package k11

import k11.data.initCart
import k11.data.listOfNumbers
import k11.data.listOfPeople
import org.junit.Test
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
class AggregatesUt {

   // region min, max, count, average
   @Test
   fun minUt() {
      // Arrange
      val people = listOfPeople()
      val expected = people.first { it.name == "Ethan" }
      // Act
      val personWithMinAge = people.minByOrNull { it.age }
      val minAge = people.minOf { it.age }
      // Assert
      assertEquals(expected, personWithMinAge)
      assertEquals(expected.age, minAge)
   }
   @Test
   fun maxUt() {
      // Arrange
      val people = listOfPeople()
      val expected = people.first { it.name == "Chris" }
      // Act
      val personWithMaxAge = people.maxByOrNull { it.age }
      val maxAge = people.maxOf { it.age }
      // Assert
      assertEquals(expected, personWithMaxAge)
      assertEquals(expected.age, maxAge)
   }
   @Test
   fun countUt() {
      // Arrange
      val people = listOfPeople()
      val expected = 9
      val expectedAgeGt25 = 6
      // Act
      val count = people.count()
      val countAgeGt25 = people.count{ it.age > 25 }
      // Assert
      assertEquals(expected, count)
      assertEquals(expectedAgeGt25, countAgeGt25)
   }
   @Test
   fun averageUt() {
      // Arrange
      val people = listOfPeople()
      val expected = 27.333333333333332
      // Act
      val averagedAge = people.map{it.age}.average()
      // Assert
      assertEquals(expected, expected, 1e-6)

   }
   // endregion

   // region fold, reduce
   @Test
   fun foldNumberUt() {
      // Arrange
      val numbers = listOfNumbers(10)
      val expected = 55
      // Act
      val sum = numbers
         .fold(0) { acc, number -> acc + number }
      // Assert
      assertEquals(expected, sum)
   }
   @Test
   fun reduceNumberUt() {
      // Arrange
      val numbers = listOfNumbers(10)
      val expected = 55
      // Act
      val sum = numbers
         .reduce { acc, n -> acc + n }
      val actul = numbers.sum()
      // Assert
      assertEquals(expected, sum)
   }

   @Test
   fun foldUt() {
      // Arrange
      val cart = initCart()
      val expected = 37.00
      // Act
      val totalPrice = cart.items.values.fold(0.00) { acc, cartItem ->
//       println("acc=$acc + ${cartItem.quantity} * ${cartItem.product.price}")
         acc + cartItem.quantity * cartItem.product.price }
      // Assert
      assertEquals(expected, totalPrice, 1e-6)
   }
}