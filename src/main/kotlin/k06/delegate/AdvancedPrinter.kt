package k06.delegate

// delegate object as parameter
class AdvancedPrinter(
   private val _printerHandler: IPrinter  // PrinterHandler: IPrinter
) : IPrinter by _printerHandler {

   fun doSimple() {
      _printerHandler.simpleFeatures()
   }

   override fun simpleFeatures() {
      _printerHandler.simpleFeatures()
      // todo
   }

   fun additionalFeature() {
      println("AdvancedPrinter: IPrinter by PrinterHandler - Advanced features")
   }
}