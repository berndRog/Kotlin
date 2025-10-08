package k10

import junit.framework.TestCase.assertFalse
import k10.ue1.doubleValues
import k10.ue1.transformList
import k10.ue2.executeIf
import k10.ue3.filterNames
import org.junit.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FunAsParameterUt {

   //region transformList
   @Test
   fun transformList_with_function_referenceUt() {
      // assert
      val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
      val expected = listOf(2,4,6,8,10,12,14,16,18,20)
      // act
      val actual = transformList(numbers, ::doubleValues )
      // assert
      assertContentEquals(expected, actual)
   }

   @Test
   fun transformList_with_function_pointerUt() {
      // assert
      val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
      val expected = listOf(2,4,6,8,10,12,14,16,18,20)
      // act
      val fp: (Int) -> Int = ::doubleValues
      val actual = transformList(numbers, fp)
      // assert
      assertContentEquals(expected, actual)
   }

   @Test
   fun transformList_with_lambda_as_parameterUt() {
      // assert
      val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
      val expected = listOf(2,4,6,8,10,12,14,16,18,20)
      // act
      val actual = transformList(numbers, { it -> 2 * it } )
      // assert
      assertContentEquals(expected, actual)
   }
   //endregion

   //region executeIf
   @Test
   fun executeIf_is_trueUt() {
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
   fun executeIf_is_falseUt() {
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
   fun excecuteIf_modulo_is_trueUt() {
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

   //region filterNames
   @Test
   fun filter_starts_with_A_ok() {
      // arrange
      val people = listOf("Anna", "Bernd", "Anke", "Chris")
      val expected = listOf("Anna", "Anke")
      // act
      val actual = filterNames(people) { it.startsWith("A") }
      //
      assertEquals(expected, actual)
   }

   @Test
   fun filter_longer_than_4_ok() {
      // arrange
      val people = listOf("Tom", "Sarah", "Paul", "Katrin")
      val expected = listOf("Sarah", "Katrin")
      // act
      val result = filterNames(people) { it.length > 4 }
      // assert
      assertEquals(expected, result)
   }

   @Test
   fun filter_end_with_a_ok() {
      // arrange
      val people = listOf("Tom", "Sarah", "Anna", "Chris")
      val expected = listOf("Anna")
      // act
      val actual = filterNames(people) { it.endsWith("a") }
      //
      assertEquals(expected, actual)
   }
   //endregion
}