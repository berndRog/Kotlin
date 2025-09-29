package k07.person

import java.time.LocalDate
import java.time.LocalTime

class Dozent(
   name:String,
   gender: Char,
   val titel: String?,
   var gebiet: String,
   override var wert: Double = 0.0
): APerson(name, gender), IWorkHours {

   override fun getAnrede(): String {
      return when (gender) {
         'm' -> "Sehr geehrter Herr $titel $name"
         'w' -> "Sehr geehrte Frau $titel $name"
         else -> "Sehr geehrte Damen und Herren"
      }
   }

   override val workEntries: MutableMap<LocalDate, Pair<LocalTime?, LocalTime?>>
      = mutableMapOf()
}