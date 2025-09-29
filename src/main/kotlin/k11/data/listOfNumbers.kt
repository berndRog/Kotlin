package k11.data

fun listOfNumbers(n: Int): List<Int> {

   val numbers = mutableListOf<Int>()
   for (i in 1..n) numbers.add(i)

   return numbers.toList()
}