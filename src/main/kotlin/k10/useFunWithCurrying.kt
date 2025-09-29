package k10

// Higher order function with currying, i.e. a function that returns a function
fun useFunWithCurrying() {
   println("\nHOF with currying")
   // Currying Add (Int,Int) -> Int  = (Int) -> (Int) -> Int
   val fa: (Int)-> Int = curryAdd(5)
   val resultAdd: Int = fa(10) // Number 10
   println("5 + 10 = $resultAdd")   // Output: 15

   val resultAdd2: Int = curryAdd(5)(10)
   println("5 + 10 = $resultAdd2")  // Output: 15

}


// Curried version of the add function
fun curryAdd(a: Int): (Int) -> Int {
   return { b -> a + b }
}


