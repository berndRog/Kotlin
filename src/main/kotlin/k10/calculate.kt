package k10

// Higher-Order Function that takes a function type as parameter
fun calculate(
   x: Int,                        // parameter: Int
   y: Int,                        // parameter: Int
   operation: (Int, Int) -> Int   // parameter: (int,Int) -> Int (function type, callback)
): Int {
   // call the operation function with x and y (callback)
   return operation(x, y)
}