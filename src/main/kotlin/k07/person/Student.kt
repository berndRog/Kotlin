package k07.person

class Student(
   name:String,
   gender: Char,
   val matrNr: Int,
   override var wert: Double = 0.0
): APerson(name, gender) {

   override fun getAnrede() =
      when(gender) {
         'm'  -> "Sehr geehrter Herr ${this@Student.name}"
         'w'  -> "Sehr geehrte Frau ${this@Student.name}"
         else -> "Sehr geehrte Damen und Herren"
      }
}