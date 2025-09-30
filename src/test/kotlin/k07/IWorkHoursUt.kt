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
import kotlin.test.assertIsNot
import kotlin.test.assertNotNull

class IWorkHoursUt {

   private val _dozent = Dozent(
      name = "Franz Fischer",
      gender ='m',
      titel = "Prof. Dr.",
      gebiet = "Softwaretechnik"
   )

   private val _studi = Student(
      name = "Maria Müller",
      gender = 'w',
      matrNr = 123456
   )

   @Test
   fun `isOfType ut`() {
      // Arrange
      // Act
      // Assert
      assertIs<Dozent>(_dozent)
      assertIs<APerson>(_dozent)
      assertIs<IWorkHours>(_dozent)

      assertIs<Student>(_studi)
      assertIs<APerson>(_studi)
      assertIsNot<IWorkHours>(_studi)
   }

   @Test
   fun `calculate working hours ut`() {
      // Arrange
      val iWorkHours: IWorkHours = _dozent
      val date250920 = LocalDate.of(2025,9,20)
      val start = LocalTime.of(8,12)
      val end = LocalTime.of(12,53)
      val expected = 4.683333333333334
      // Act
      iWorkHours.recordStart(date250920,start)
      iWorkHours.recordEnd(date250920, end)
      val actual = iWorkHours.getDailyHours(date250920)
      // Assert
      assertEquals(expected, actual, 1e-6)
   }
}