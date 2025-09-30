package k10

import junit.framework.TestCase.assertFalse
import org.junit.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FunAsParameterUt {

   //region transformList

   fun transformList(
      numbers: List<Int>,
      transform: (Int) -> Int
   ): List<Int> {
      return numbers.map { transform(it) }
   }

   fun double(x:Int ) = 2 * x

   @Test
   fun `transformList with function reference`() {
      // assert
      val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
      val expected = listOf(2,4,6,8,10,12,14,16,18,20)
      // act
      val actual = transformList(numbers, ::double )
      // assert
      assertContentEquals(expected, actual)
   }

   @Test
   fun `transformList with function pointer`() {
      // assert
      val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
      val expected = listOf(2,4,6,8,10,12,14,16,18,20)
      // act
      val fp: (Int) -> Int = ::double
      val actual = transformList(numbers, fp)
      // assert
      assertContentEquals(expected, actual)
   }

   @Test
   fun `transformList with lambda as parameter`() {
      // assert
      val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
      val expected = listOf(2,4,6,8,10,12,14,16,18,20)
      // act
      val actual = transformList(numbers, { it -> 2 * it } )
      // assert
      assertContentEquals(expected, actual)
   }

   @Test
   fun `transformList with lambda`() {
      // assert
      val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
      val expected = listOf(2,4,6,8,10,12,14,16,18,20)
      // act
      val actual = transformList(numbers) { it -> 2 * it }
      // assert
      assertContentEquals(expected, actual)
   }
   //endregion

   //region executeIf

   fun executeIf(
      condition: () -> Boolean,
      action:() -> Unit
   ) {
      if(condition()) action()
   }

   @Test
   fun `executeIf is true`() {
      // arrange
      var x = 5
      var called = false
      // act
      executeIf({ x > 2 }) {
         called = true
      }
      // assert
      assertTrue(called)
   }

   @Test
   fun `executeIf is false`() {
      // arrange
      var x = 1
      var called = false
      // act
      executeIf({ x > 10 }) {
         called = true
      }
      assertFalse("Action should not be executed", called)
   }

   @Test
   fun `excecuteIf modulo is true`() {
      // arrange
      var number = 42
      var called = false
      // act
      executeIf( { number % 2 == 0 }) {
         called = true
      }
      assertTrue( called)
   }
   //endregion

   //region filter
   fun filterPeople(
      people: List<String>,
      predicate: (String) -> Boolean
   ): List<String> {
      var result = mutableListOf<String>()
      people.forEach {
         if( predicate(it)) result.add(it)
      }
      return result
      // return people.filter { predicate(it)
   }

   @Test
   fun `filter starts with A ok`() {
      // arrange
      val people = listOf("Anna", "Bernd", "Anke", "Chris")
      val expected = listOf("Anna", "Anke")
      // act
      val actual = filterPeople(people) { it.startsWith("A") }
      //
      assertEquals(expected, actual)
   }

   @Test
   fun `filter longer than 4 ok`() {
      // arrange
      val people = listOf("Tom", "Sarah", "Paul", "Katrin")
      val expected = listOf("Sarah", "Katrin")
      // act
      val result = filterPeople(people) { it.length > 4 }
      // assert
      assertEquals(expected, result)
   }

   @Test
   fun `filter end with a ok`() {
      // arrange
      val people = listOf("Tom", "Sarah", "Anna", "Chris")
      val expected = listOf("Anna")
      // act
      val actual = filterPeople(people) { it.endsWith("a") }
      //
      assertEquals(expected, actual)
   }
   //endregion
}