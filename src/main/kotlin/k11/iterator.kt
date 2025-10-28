package k11

import k11.data.Book
import k11.data.CartItem
import k11.data.Person
import k11.data.initCart
import k11.data.listOfPeople
import k11.data.mapOfBooks
import kotlin.String
import kotlin.collections.Map.Entry
import kotlin.collections.forEach

fun iterator() {

   val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

   println("iterator pattern")
   val numbersIterator = numbers.iterator()
   while (numbersIterator.hasNext()) {
      val item = numbersIterator.next()
      println(item)
   }

   println("\nas chaining operator with a lambda")
   numbers.forEach { item ->
      println(item)
   }

   // P E O P L E
   println("\nList of people")
   val people: List<Person> = listOfPeople()
   people.forEach { person -> println(person.asString()) }

   // B O O K S
   println("\nMap of books")
   val books: Map<String, Book> = mapOfBooks()
   books.forEach { it: Entry<String, Book> ->
      println(
         "${it.value.authors.joinToString(", ")}".padEnd(25) +
         "${it.value.title}".padEnd(35) +
         "${it.value.year}".padEnd(6) +
         "${it.value.publisher}".padEnd(10) +
         "${it.value.isbn}"
      )
   }

   // SHOPPING CART
   //   3 x Bio Milch, 1l,          1.99 =   5.97
   //   2 x Butter,                 1.95 =   3.90
   //  10 x Joghurt,                0.89 =   8.90
   //   2 x Gouda Käse 100 g,       2.89 =   5.78
   //   5 x Emmentaler Käse 100g,   2.49 =  12.45
   //  -------------------------------------------
   //                              Summe:  37.00
   println("\nShopping cart")
   val cart = initCart()
   val cartItems = cart.items as Map<String, CartItem>

   cartItems.forEach { item -> // : Entry<String, CartItem> ->
      val quantity = item.value.quantity
      val product = item.value.product
      val price = product.price
      val totalPrice = quantity * price
      println(
         "${quantity.toString().padStart(3)} x " +
         "${product.name.padEnd(25)} " +
         "${"%,.2f".format(price).padStart(6)} = " +
         "${"%,.2f".format(totalPrice).padStart(7)}"
      )
   }

}