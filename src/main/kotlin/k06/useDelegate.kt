package k06

import k06.delegate.AdvancedPrinter
import k06.delegate.PrinterHandler

fun useDelegate() {

   // create class delegate object
   val printerHandler = PrinterHandler()
   // create object with class delegate as parameter
   val advancedPrinter = AdvancedPrinter(printerHandler)

   advancedPrinter.simpleFeatures() // delegate to PrinterHandler
   advancedPrinter.additionalFeature()

}