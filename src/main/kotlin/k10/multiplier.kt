package k10

// Higher order function which returns a function type
fun multiplier(
   factor: Int
): (Int) -> Int {
   return { number: Int -> factor * number }
}