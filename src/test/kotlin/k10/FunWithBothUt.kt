package k10

import k10.ue5.compose
import k10.ue5.plus3
import k10.ue5.times2
import org.junit.Test
import kotlin.test.assertEquals

class FunWithBothUt {

   @Test
   fun compose_plus3_times2_ut() {
      // arrange
      val fp: (Int) -> Int = ::times2  // f(x) = x * 2
      val gp: (Int) -> Int = ::plus3   // g(x) = x + 3
      val expected = 17 // x = 7 -> (7 * 2) + 3
      // act g ° f
      val composed: (Int) -> Int = compose(gp, fp)
      val actual:Int  = composed(7)
      // assert
      assertEquals(expected,actual)
   }

   @Test
   fun compose_times2_plus3_ut() {
      // arrange
      val fp: (Int) -> Int = ::plus3   // f(x) = x + 3
      val gp: (Int) -> Int = ::times2  // g(x) = x * 2
      val expected = 20 // x = 7 -> (7 + 3) * 2 = 20
      // act  g ° f
      val composed = compose(gp, fp)
      val actual = composed(7)
      // assert
      assertEquals(expected,actual)
   }


   @Test
   fun `compose should combine two functions correctly`() {
      // Given
      val addTwo: (Int) -> Int = { it + 2 }
      val multiplyByThree: (Int) -> Int = { it * 3 }
      // When
      val composed = compose(multiplyByThree, addTwo)
      // Then
      assertEquals(15, composed(3)) // (3 + 2) * 3 = 15
   }

   @Test
   fun `compose should work with different types`() {
      // Given
      val intToString: (Int) -> String = { it.toString() }
      val stringLength: (String) -> Int = { it.length }
      // When
      val composed = compose(stringLength, intToString)
      // Then
      assertEquals(3, composed(100)) // "100".length = 3
   }

   @Test
   fun `compose should work with string operations`() {
      // Given
      val uppercase: (String) -> String = { it.uppercase() }
      val addExclamation: (String) -> String = { "$it!" }
      // When
      val composed = compose(addExclamation, uppercase)
      // Then
      assertEquals("HELLO!", composed("hello"))
   }
}
