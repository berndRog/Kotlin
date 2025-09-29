package k06.delegate

// implement interface
class PrinterHandler : IPrinter {
   override fun simpleFeatures() {
      println("PrinterHandler: IPrinter - Simple features")
   }
}