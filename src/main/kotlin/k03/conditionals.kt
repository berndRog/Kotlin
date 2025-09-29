package k03

fun conditionals() {

   println("\nCONTROL STRUCTUREs IN KOTLIN")
   println("\nif - else if - else")
   // -----------------------------------
   val a = 5
   val b = 10
   if (a > b) {
      println("a > b")
   } else if (a < b) {
      println("a < b")
   } else {
      println("a == b")
   }

   // if as expression
   val resultIf = if (a > b) {
      "a > b"  // last expression is the result
   } else if (a < b) {
      "a < b"
   } else {
      "a == b"
   }
   println("resultIf: $resultIf")

   println("\nwhen")
   // -----------------------------------
   val x = 2
   when (x) {
      1 -> println("x == 1")
      2 -> println("x == 2")
      else -> { // Note the block
         println("x is neither 1 nor 2")
      }
   }

   // when as expression
   val resultWhen = when (x) {
      1 -> "x == 1"
      2 -> "x == 2"
      else -> { // Note the block
         "x is neither 1 nor 2"
      }
   }
   println("resultWhen: $resultWhen")


   val maxSurfaceTempInK = 298

   when(maxSurfaceTempInK) {
      700                -> println("This is Mercury’s maximum surface temperature") // 1
      0, 1, 2            -> println("It’s as cold as it gets") // 2
      in 300..699   -> println("This temperature is also possible on Mercury") // 3
      !in 0..300    -> println("This is pretty hot") // 4
      earthSurfaceTemp() -> println("This is earth’s average surface temperature of 298 K") // 5
      else -> println("Given variable is of type Int")
   }
}

fun earthSurfaceTemp(): Any {
   return 298
}