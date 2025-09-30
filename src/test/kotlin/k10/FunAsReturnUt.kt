package k10

import org.junit.Test
import kotlin.test.assertEquals

class FunAsReturnUt {

   fun makeGreeting(language: String): (String) -> String {
      return when (language.lowercase()) {
         "de" -> { name -> "Hallo $name!" }
         "en" -> { name -> "Hello $name!" }
         "fr" -> { name -> "Bonjour $name!" }
         else -> { name -> "Hi $name!" }
      }
   }

   @Test
   fun `makeGreeting german ok`() {
      // arrange
      val expected = "Hallo Bernd!"
      // act
      val greetInGerman = makeGreeting("de")
      val actual = greetInGerman("Bernd")
      // act
      assertEquals(expected, actual)
   }

   @Test
   fun `make Greeting english ok`() {
      // arrange
      val expected = "Hello Alice!"
      // act
      val greetInEnglish = makeGreeting("en")
      val actual = greetInEnglish("Alice")
      //
      assertEquals(expected, actual)
   }

   @Test
   fun `make Greeting french ok`() {
      // arrange
      val expected = "Bonjour Chloé!"
      // act
      val greetInFrench = makeGreeting("fr")
      val actual = greetInFrench("Chloé")
      //
      assertEquals(expected, actual)
   }

   @Test
   fun `makeGreeting fallback ok`() {
      // arrange
      val expected = "Hi Carlos!"
      // act
      val greetInSpanish = makeGreeting("es") // nicht vorhanden -> else-Zweig
      val result = greetInSpanish("Carlos")
      // assert
      assertEquals(expected, result)
   }
}
