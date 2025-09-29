package k11

fun iterator() {

   val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

   println("iterator pattern")
   val numbersIterator = numbers.iterator()
   while (numbersIterator.hasNext()) {
      val item = numbersIterator.next()
      println(item)
   }

   println("\nas for loop (C#: foreach)")
   for (item in numbers) {
      println(item)
   }

   println("\nas chaining operator with a lambda")
   numbers.forEach { item ->
      println(item)
   }

   println("\nas chaining operator with iz in a lambda")
   numbers.forEach { it ->
      println(it)
   }

}