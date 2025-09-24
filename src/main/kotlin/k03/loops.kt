package de.rogallab.mobile.k03

import kotlin.io.print

fun loops() {

   println("\nLOOPS IN KOTLIN")

   println("\nfor LOOP")
   // -----------------------------------
   println("\nfor loop over ranges")
   // in C#: for(int i=0; i<10; i++)
   for (i in 1..5 step 1) print("$i ")
   println()

   for (i in 1..10 step 2) print("$i ")
   println()

   for (i in 5 downTo 1 step 1) print("$i ")
   println()


   println("\nfor loop over collections")
   val names = listOf("apple", "banana", "kiwi")

   println("\niterate over items with range")
   for(i in 0..names.size-1 step 1)
      println("names[$i]: ${names[i]}")

   println("\niterate over items with index")
   for (index in names.indices)
      println("names[$index]: ${names[index]}")

   println("\niterate over items directly")
   for (item in names)
      println(item)


   println("\nwhile loop")
   // -----------------------------------
   var index = 0
   while (index < names.size) {
      println("names[$index]: ${names[index]}")
      index++
   }

   println("\ndo while loop")
   // -----------------------------------
   index = 0
   do {
      println("names[$index]: ${names[index]}")
      index++
   } while (index < names.size)


}