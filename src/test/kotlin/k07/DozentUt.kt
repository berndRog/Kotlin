package k07
import k07.person.APerson
import k07.person.Dozent
import k07.person.IWorkHours
import org.junit.Test
import java.time.LocalDate
import java.time.LocalTime
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotNull

class DozentUt {

   private val _dozent = Dozent(
      name = "Franz Fischer",
      gender ='m',
      titel = "Prof. Dr.",
      gebiet = "Softwaretechnik"
   )

   @Test
   fun `ctor ut`() {
      // Arrange
      val name = "Franz Fischer"
      val gender = 'm'
      val titel = "Prof. Dr."
      val gebiet = "Softwaretechnik"
      // Act
      val actual = Dozent(name, gender, titel, gebiet)
      // Assert
      assertNotNull(actual)
      assertIs<Dozent>(actual)
      assertIs<APerson>(actual)  // Dozent : APerson
      assertIs<IWorkHours>(actual)
   }

   @Test
   fun `properties ut`() {
      // Arrange
      val name = "Franz Fischer"
      val gender = 'm'
      val titel = "Prof. Dr."
      val gebiet = "Softwaretechnik"
      val dozent = Dozent(name, gender, titel, gebiet)
      // Act
      val actualName = dozent.name
      val actualGender = dozent.gender
      val actualTitel = dozent.titel
      val actualGebiet = dozent.gebiet
      // Assert
      assertEquals(name, actualName)
      assertEquals(gender, actualGender)
      assertEquals(titel, actualTitel)
      assertEquals(gebiet, actualGebiet)
   }

   @Test
   fun `getAnrede ut`() {
      // Arrange
      val expected = "Sehr geehrter Herr Prof. Dr. Franz Fischer"
      // Act
      val actual = _dozent.getAnrede()
      // Assert
      assertEquals(expected, actual)
   }

   @Test
   fun `workhours ut`() {
      // Arrange
      val date250920 = LocalDate.of(2025,9,20)

      val start = LocalTime.of(8,12)
      val end = LocalTime.of(12,53)
      val expected = 4.683333333333334
      // Act
      _dozent.recordStart(date250920, start)
      _dozent.recordEnd(date250920, end)
      val actual = _dozent.getDailyHours(date250920)
      // Assert
      assertEquals(expected, actual, 1e-6)
   }

}