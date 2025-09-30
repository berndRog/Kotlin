package k07
import k07.person.APerson
import k07.person.Dozent
import k07.person.IWorkHours
import k07.person.Student
import org.junit.Test
import java.time.LocalDate
import java.time.LocalTime
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotNull

class StudentUt {

   private val _studi = Student(
      name = "Maria Müller",
      gender = 'w',
      matrNr = 123456
   )

   @Test
   fun `ctor ut`() {
      // Arrange
      val name = "Maria Müller"
      val gender = 'w'
      val matrNr = 123456
      // Act
      val actual = Student(name, gender, matrNr)
      // Assert
      assertNotNull(actual)
      assertIs<Student>(actual)
      assertIs<APerson>(actual)  // Student : APerson
   }

   @Test
   fun `properties ut`() {
      // Arrange
      val name = "Maria Müller"
      val gender = 'w'
      val matrNr = 123456
      val studi = Student(name, gender, matrNr)
      // Act
      val actualName = studi.name
      val actualGender = studi.gender
      val actualMatrNr = studi.matrNr
      // Assert
      assertEquals(name, actualName)
      assertEquals(gender, actualGender)
      assertEquals(matrNr, actualMatrNr)
   }

   @Test
   fun `getAnrede ut`() {
      // Arrange
      val expected = "Sehr geehrte Frau Maria Müller"
      // Act
      val actual = _studi.getAnrede()
      // Assert
      assertEquals(expected, actual)
   }

  
}