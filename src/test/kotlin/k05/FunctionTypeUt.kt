package k05

import org.junit.Test
import kotlin.test.assertEquals

class FunctionTypeUt {

   @Test
   // var fp: (Double) -> Double = { 0.0 }
   fun `fp1 ut`() {
      // arrange
      val expected = 25.0
      //val input = listOf("Alice", "Bob", "Charlie", "Alice", "Diana", "Bob", "Eve", "Charlie", "Frank")
      //val expected = listOf("Alice", "Bob", "Charlie", "Diana", "Eve", "Frank")
      // act
      var fp = ::f1 // -> x * x
      val actual = fp(5.0)
      // assert
      assertEquals(expected, actual, 1e-9)
   }

   @Test
   // var fp2: (Int, Int) -> Int = { a,b -> 0 }
   fun `fp2 with add ut`() {
      // arrange
      val a = 6
      val b = 2
      val expected = a + b
      // act
      var fp2 = ::add
      val actual = fp2(a,b)
      // assert
      assertEquals(expected, actual)
   }

   @Test
   // var fp2: (Int, Int) -> Int = { a,b -> 0 }
   fun `fp2 with sub ut`() {
      // arrange
      val a = 6
      val b = 2
      val expected = a - b
      // act
      var fp2 = ::sub
      val actual = fp2(a,b)
      // assert
      assertEquals(expected, actual)
   }

   @Test
   // var fp2: (Int, Int) -> Int = { a,b -> 0 }
   fun `fp2 with mul ut`() {
      // arrange
      val a = 6
      val b = 2
      val expected = a * b
      // act
      var fp2 = ::mul
      val actual = fp2(a,b)
      // assert
      assertEquals(expected, actual)
   }

   @Test
   // var fp2: (Int, Int) -> Int = { a,b -> 0 }
   fun `fp2 with div ut`() {
      // arrange
      val a = 6
      val b = 2
      val expected = a / b
      // act
      var fp2 = ::div
      val actual = fp2(a,b)
      // assert
      assertEquals(expected, actual)
   }

   @Test
   // var fp3: (Double) -> Double = {  0.0 }
   fun `fp3 with sin ut`() {
      // arrange
      val x = Math.PI/2.0
      val expected = 1.0
      // act
      var fp3 = Math::sin

      val actual = fp3(x)
      // assert
      assertEquals(expected, actual)
   }
}