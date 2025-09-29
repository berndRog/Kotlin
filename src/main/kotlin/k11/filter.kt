package k11

import k11.data.initCart
import k11.data.listOfNumbers
import k11.data.mutableListOfPeople

fun filter() {

   val numbers = listOfNumbers(10)

   /*  FILTER ******************************************************************/
   // filter: selects elements matching a given predicate
   val filteredNumbers = numbers.filter { n -> n % 2 == 0 }

   println("\nFilter, original list $numbers hashcode: ${numbers.hashCode()}")
   println("filtered list $filteredNumbers")


   // immutable List<Int>, reference list is mutable
   var list = listOfNumbers(10)
   println("list = $list  hashcode: ${list.hashCode()}")

   // reference list points to a new list with the filtered element
   list     = list.filter { it % 2 == 0 }
   println("list = $list  hashcode: ${list.hashCode()}")


   val list2 = listOfNumbers(20)
      .filter { it % 2 == 0  }
      .filter { it <= 10}
   println("list = $list2  hashcode: ${list2.hashCode()}")

   // people
   val people = mutableListOfPeople()
   val peopleAgeGe30   = people.filter { it.age >= 30  }
   val peopleNameWithA = people.filter { it.name.startsWith("A")  }

   println("\nPeople age >= 30")
   peopleAgeGe30.forEach{println(it.asString())}
   println("\nPeople name start with A")
   peopleNameWithA.forEach{println(it.asString())}


   // total price of product   0.00 <= price < 2.50
   val cart = initCart()

   val totalPrice1 = cart.cartItems.values
      .filter { it.product.price >= 0.00 && it.product.price < 2.50 }
      .fold(
         0.0
      ) { acc, element -> acc + element.product.price * element.quantity }


   println("\nGesamtsumme für Artikel  0,00 <= Preis < 2,50")
   val totalPrice3 = cart.cartItems.values
      .filter {
         println("0,00 <=" + "%.2f".format(it.product.price).padStart(8)+" < 2,50 " +
            "${it.product.price >= 1.00 && it.product.price < 2.5}")
         it.product.price >= 0.00 && it.product.price < 2.50
      }
      .fold(
         0.0
      ) { acc, element ->
         println(
            "%.2f".format(acc).padStart(7) + "%d".format(element.quantity).padEnd(3)  +
               "%.2f".format(element.product.price).padEnd(6)
         )
         acc + element.product.price * element.quantity
      }



}

fun v4FirstLastTakeSkip() {

}

fun v4MinMaxSum() {
   val numbers = listOf(1, 3, 5, 7, 9, 11)

   println("Count:   ${numbers.count()}")
//    println("Max:     ${numbers.max()}")
//    println("Min:     ${numbers.min()}")
   println("Average: ${numbers.average()}")
   println("Sum:     ${numbers.sum()}")

   println("JoinToString: ${numbers.joinToString()}")

   // 1+2 = 3    3
   // 2+3 = 5    8
   // 3+4 = 7   15
   // 4+5 = 9

   var y = numbers.reduce { x, y -> x + y }
   println("Sum (reduce) $y")


   y = numbers.fold(0) { x, y -> x + y }
   println("Sum (fold) $y")

}