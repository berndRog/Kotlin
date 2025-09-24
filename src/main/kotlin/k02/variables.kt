package de.rogallab.mobile.k02


fun variables() {

   println("\nVARIABLES IN KOTLIN")

   // mutable variable (veränderlich)
   // -----------------------------------
   var name : String = "Bernd Rogalla"
   println(name)

   name = "Erika Mustermann" // var can be reassigned
   println(name)

   // immutable varibale (unveränderlich)
   // -----------------------------------
   val age: Int = 23;
   println("Alter: $age")

// age = 42; // error: val cannot be reassigned
   println("Alter: $age")


   println("\nNULLABLABILITY IN KOTLIN")
   // -----------------------------------
   var email: String? = "e.mustermann@t-online.de" // mutable + nullable
   // safe call operator ?.
   println("Email: $email Länge:${email?.length} Zeichen")

   // what happens if email is null?
   email = null
   println("Email: $email Länge:${email?.length} Zeichen")
   // length2 can not be null, i.e. it must have an Int value
   // length2 is 0 if email is null
   // safe call operator ?. + Elvis operator ?:
   val length2: Int  = email?.length ?: 0
   println("Email: $email Länge:$length2 Zeichen")

   // safe call with ?.let + optional run with ?:run (if else)
   email = "m.mustermann@gmail.com"
   email = null
   email?.let { // execute block only if email is not null
      println("?.let -> Email: $email Länge:${it.length} Zeichen")
   } ?:run {  // execute block if email is null
      println("?:run -> Email is null, no length available")
   }

}