package k06
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Person1Ut {

   @Test
   fun ctorUt() {
      // Arrange
      val expectedName = "Erika Mustermann"
      val expectedGender = 'w'
      // Act
      val person = Person1(expectedName, expectedGender)
      // Assert
      assertEquals(expectedName, person.name)
      assertEquals(expectedGender, person.gender)
   }

   @Test
   fun asStringUt() {
      // Arrange
      val expectedName = "Erika Mustermann"
      val expectedGender = 'w'
      val person = Person1(expectedName, expectedGender)
      // Act
      val actual = person.asString()
      // Assert
      assertEquals("Name:Erika Mustermann, Gender:w", actual)
   }

   @Test
   fun changeNameUt() {
      // Arrange
      val expectedName = "Erika Mustermann"
      val expectedGender = 'w'
      val person = Person1(expectedName, expectedGender)
      // Act
      person.name = "Erika Meier"
      // Assert
      assertEquals("Erika Meier", person.name)
   }

   @Test
   fun printUt() {
      // Arrange
      val expectedName = "Erika Mustermann"
      val expectedGender = 'w'
      val person = Person1(expectedName, expectedGender)
      val outContent = ByteArrayOutputStream()
      System.setOut(PrintStream(outContent))
      // Act
      person.print()
      // Assert
      System.setOut(System.out)
      assertTrue(outContent.toString().contains("Erika Mustermann"))
   }
}