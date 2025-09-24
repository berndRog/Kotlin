package de.rogallab.mobile.k04

fun collections() {

   println("\nCOLLECTIONS IN KOTLIN")

   println("\nimmutable reference to an empty immutable List<String>")
   val namesImmutable:  List<String> = listOf<String>("Anna", "Berta", "Carla")
   val namesImmutable2: List<String> = listOf("Anna", "Berta", "Carla")
   val namesImmutable3               = listOf<String>("Anna", "Berta", "Carla")
   val namesImmutable4               = listOf        ("Anna", "Berta", "Carla")
// namesImmutable = listOf()    // val cannot be reassigned
// namesImmutable.add("Anna")   // error list is immutable
   println("namesImmutable: $namesImmutable")


   // mutable reference to an immutable List<String>
   var namesImmutable5 = listOf<String>("Anna", "Berta", "Carla")
   namesImmutable5 = listOf("Artur", "Benno","Cord")    // var can be reassigned
// namesImmutable5.add("Anna")   // error list is immutable

   // immutable reference to a MutableList<String>
   val namesMutable:  MutableList<String> = mutableListOf<String>("Anna", "Berta", "Carla")
   val namesMutable2: MutableList<String> = mutableListOf        ("Anna", "Berta", "Carla")
   val namesMutable3                      = mutableListOf<String>("Anna", "Berta", "Carla")
   val namesMutable4                      = mutableListOf        ("Anna", "Berta", "Carla")
   namesMutable.add("Doro")     // ok list is mutable
   // a new list can be assigned to an immutable reference
// namesMutable = mutableListOf("Artur", "Benno", "Cord")

   // mutable reference to an empty MutableList<String>
   var namesMutable5: MutableList<String> = mutableListOf()
   var namesMutable6 = mutableListOf<String>()
   namesMutable5.add("Anna")
   namesMutable5.add("Berta")
   namesMutable5.add("Carla")
   // a new mutablelist can be assigned to an mutable reference
   namesMutable5 = mutableListOf("Artur","Benno","Cord")
   // a new immutable list cannot be assigned to a mutable reference
// namesMutable5 = listOf()


   println("namesMutable2")
   namesMutable2.forEach { name ->
      print("${name.padEnd(10)}, ")
   }
   println()
   namesMutable5.forEach { name ->
      print(String.format("%-10s, ", name))  // with Java
   }

   println("namesMutable5")
   namesMutable2.forEach { name ->
      print("${name.padStart(10)}, ")
   }
   println()
   namesMutable2.forEach { name ->
      print(String.format("%10s, ", name))  // with Java
   }

   val v: MutableList<Int> = ArrayList<Int>()

   // mutable and nullable reference of a nullable mutableList<String>?
   var names4Nullable: MutableList<String?>? = null
   names4Nullable = mutableListOf()
   names4Nullable = null
   names4Nullable?.add("Anna")
   names4Nullable?.add("Berta")
   names4Nullable?.add("Carla")
   names4Nullable?.add(null)


   // MutableList<T> implements immutable List<T> interface
   var values: List<Int> = mutableListOf(1,2,3,4,5)
// values.add(6)  // not ok: List<T> is immutable

   values.forEach { v ->
      println("${v.toString() .padStart(4)}")
      println(String.format("%4d", v))  // with Java
   }
   println("values: $values")

   // unsafe cast to MutableList<T>
   var mutableValues = values as MutableList<Int>
   mutableValues.add(6)  // ok: MutableList<T> is mutable

   // is -> type cast as included
   values.add(6)  // ok: MutableList<T> is mutable

   // immutable reference to an empty immutable Map<String,String>
   val countries1Map = mapOf<String, String>()

   // mutable reference to immutable Map<String,String>
   var countries2Map =
      mapOf("Belgien" to "Brüssel",
         "Dänemark" to "Kopenhagen",
         "Deutschland" to "Berlin",
         "Frankreich" to "Paris"
      )
   println("countries2Map $countries2Map")
   countries2Map.forEach { (k, v) ->
      println("Land: ${k.padEnd(20)}  Hauptstadt: ${v.padEnd(20)}")
   }

   countries2Map =
      mapOf("Italien" to "Rom",
         "Österreich" to "Wien",
         "Schweiz" to "Bern"
      )
   println("countries2Map $countries2Map")


   // mutable Map<String,String>
   var countriesMutableMap = mutableMapOf<String, String>()
   countriesMutableMap.putIfAbsent("Belgien", "Brüssel")
   countriesMutableMap.putIfAbsent("Dänemark", "Kopenhagen")
   countriesMutableMap.putIfAbsent("Deutschland", "Berlin")
   countriesMutableMap.putIfAbsent("Frankreich", "Paris")


}
