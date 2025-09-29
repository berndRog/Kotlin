package k05

fun functionType() {

   println("\nCONTROL STRUCTUREs IN KOTLIN")
   println("\ncall function f1()")
   val res = f1(5.0)
   println("f1(5) = $res")

   println("\ndefine a reference variable of a function type, i.e. function pointer")
// function pointer: function type (reference to a function)
// var fp: (Double) -> Double  // :: function type
// assign function reference to function pointer
   fp = ::f1
   println("fp: (Double) -> Double = ::f1 -> fp(5.0)= ${fp(5.0)}")

// Addition, Subtraction
   println("\ncall function add(a,b), sub(a,b")
   val cAdd: Int = add(3, 5)
   println("c = a + b = 3 + 5 = $cAdd")

   val cSub: Int = sub(3, 5)
   println("c = a - b = 3 - 5 = $cSub")

// function pointer: function type (reference to a function)
   println("\nfp2: (int, Int) -> Int = ::add")
   fp2 = ::add
   val resAdd = fp2(3, 5)
   println("c = a + b = 3 + 5 = $resAdd")

   println("\nfp2: (int, Int) -> Int = ::sub")
   fp2 = ::sub
   val resSub = fp2(3, 5)
   println("c = a - b = 3 - 5 = $resSub")

// Lambda functions
// function pointer = lambda expression with lambda type
   println("\nlambda functions")
   val f3a: (Double) -> Double = { x: Double -> x * x }
   var f3b: (Double) -> Double = { x -> x * x }
   var f3c: (Double) -> Double = { it -> it * it }
   var f3d: (Double) -> Double = { it * it }
   var f3e = { x: Double -> x * x }
   println("f3a(5.0) = ${f3a(5.0)}")
   println("f3b(5.0) = ${f3b(5.0)}")
   println("f3c(5.0) = ${f3c(5.0)}")
   println("f3d(5.0) = ${f3d(5.0)}")
   println("f3e(5.0) = ${f3e(5.0)}")


   println("function pointer = lambda expression")
   println("fp3: (Double) -> Double")
   fp3 = ::f1
   println("fp3 = ::f1  -> fp3(5.0) = ${fp3(5.0)}")

   fp3 = { x -> x * x }
   println("fp3 = = { x -> x * x } -> fp3(5.0) = ${fp3(5.0)}")

// lambda functions
   println("\nfAdd1: (Int, Int) -> Int = { a: Int, b: Int -> a + b }")
   var fAdd1: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
   var fSub1: (Int, Int) -> Int = { a: Int, b: Int -> a - b }

// omitting type in lambda parameter
   var fAdd2: (Int, Int) -> Int = { a, b -> a + b }
   var fSub2: (Int, Int) -> Int = { a, b -> a - b }

// function type from type inference
   var fAdd3 = { a: Int, b: Int -> a + b }
   var fSub3 = { a: Int, b: Int -> a - b }


   fAdd3 = ::add
   fSub3 = ::sub

   println("fAdd3(3,5) = ${fAdd3(3,5)}")
   println("fSub3(3,5) = ${fSub3(3,5)}")

}