package k07.car

class Car(
   val maker: String,
   val model: String,
   override val power: Int,       // kotlin idiomatic
   override var plate: String
) : IDrivable {

   override fun start() {
      println("Car starts driving")
   }

}