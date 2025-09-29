package k07.person


abstract class APerson(
   open var name: String,  // property mutable
   open val gender: Char   // property immutable
) {

   // abstract properties must be overridden in subclasses
   abstract var wert: Double
   // abstract function must be overridden in subclasses
   abstract fun getAnrede(): String

}