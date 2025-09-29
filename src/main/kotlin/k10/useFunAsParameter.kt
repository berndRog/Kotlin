package k10

// Higher-Order Function that take a function type as parameter
fun useFunAsParameter() {
   println("\nHOF with function type as parameter")

   val x = 7
   val y = 5

   // different ways to pass a function as parameter
   // using a function reference ::add
   val res1a = calculate(x, y, ::add)
   // using a lambda expression
   val res1b = calculate( x,y, { a,b -> a + b })
   // interchanging parentheses and curly braces (...) {...}
   val res1c = calculate(x,y) { a,b -> a + b }
   println("res1a: $x + $y = $res1a")
   println("res1b: $x + $y = $res1b")
   println("res1c: $x + $y = $res1c")

   // using a reference variable fp2: (Int, Int) -> Int
   fp2 = ::add
   val res2a = calculate(x, y, fp2)
   // using a lambda expression ( {...} )
   val res2b = calculate(x, y, { a,b -> fp2(a,b) })
   // interchanging parentheses and curly braces (...) {...}
   val res2c = calculate(x, y) { a,b -> fp2(a,b) }
   println("\nres2a: $x + $y = $res2a")
   println("res2b: $x + $y = $res2b")
   println("res2c: $x + $y = $res2c")


   // assigning another function to the reference variable
   fp2 = ::sub
   // using the reference variable fp2
   val res3a = calculate(x, y, fp2)
   val res3b = calculate(x, y, { a, b -> fp2(a, b) })
   val res3c = calculate(x, y) { a, b -> fp2(a, b) }
   println("\nres3a: $x - $y = $res3a")
   println("res3a: $x - $y = $res3b")
   println("res3a: $x - $y = $res3c")

}