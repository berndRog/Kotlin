package k10

// Higher order function which returns a function
fun useFunThatReturnsFun() {
   // Get functions that multiplies by 3 or 5
   val multiplyByThree: (Int) -> Int = multiplier(3)
   val multiplyByFive: (Int) -> Int = multiplier(5)
   // Use the returned functions
   println("\nHOF that returns a function type")
   println( multiplyByThree(10) ) // Output: 30
   println( multiplyByFive(10) )  // Output: 50

}




