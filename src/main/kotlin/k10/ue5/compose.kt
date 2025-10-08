package k10.ue5
fun <A, B, C> compose(
   g: (B) -> C,       // function type as parameter
   f: (A) -> B        // function type as parameter
): (A) -> C = { x ->  // returns a function type
   g(f(x))
}