package k05

fun div(a: Int, b: Int): Int {
  if(b == 0) throw Exception("Division by zero")
  return a / b
}