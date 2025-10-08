package k10.ue4

fun makeGreeting(language: String): (String) -> String {
      return when (language.lowercase()) {
         "de" -> { name -> "Hallo $name!" }
         "en" -> { name -> "Hello $name!" }
         "fr" -> { name -> "Bonjour $name!" }
         else -> { name -> "Hi $name!" }
      }
   }