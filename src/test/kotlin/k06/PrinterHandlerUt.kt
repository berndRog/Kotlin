package k06

import k06.delegate.IPrinter
import k06.delegate.PrinterHandler
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class PrinterHandlerTest {

   private val originalOut: PrintStream = System.out
   private lateinit var outContent: ByteArrayOutputStream

   private val _expected = "PrinterHandler: IPrinter - Simple features"

   @Before
   fun setUp() {
      // Redirect System.out to byte array to capture prints
      outContent = ByteArrayOutputStream()
      System.setOut(PrintStream(outContent))
   }
   @After
   fun tearDown() {
      // Restore original System.out
      System.setOut(originalOut)
   }

   @Test
   fun ctorUt() {
      // Act
      val printerHandler: IPrinter = PrinterHandler()
      //
      assertNotNull(printerHandler)
      assertTrue(printerHandler is IPrinter)
      assertTrue(printerHandler is PrinterHandler)
   }


   @Test
   fun simpleFeaturesUt() {
      // Arrange
      val printerHandler: IPrinter = PrinterHandler()
      // Act
      printerHandler.simpleFeatures()
      //
      val actual = outContent.toString().trim()
      assertEquals(_expected, actual)
   }
}