package k07.car

interface IDrivable {
   val power: Int        // abstrakt -> muss implementiert werden
   val engine: String    // mit Default-Getter möglich
      get() = "Benzin"
   var plate: String

   fun start()           // abstrakte Funktion (ohne Implementierung)
   fun stop() =          // mit Standardimplementierung
      println("Vehicle stopped.")

}