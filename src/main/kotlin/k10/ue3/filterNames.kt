package k10.ue3

fun filterNames(
   names: List<String>,
   predicate: (String) -> Boolean
): List<String> {
   val transformedList = mutableListOf<String>()
   for(name in names)
      if(predicate(name)) transformedList.add(name)
   return transformedList
}

fun filterNames2(
   names: List<String>,
   predicate: (String) -> Boolean
): List<String> = buildList {
   for (name in names)
      if(predicate(name)) add( name)
}

fun filterNames3(
   names: List<String>,
   predicate: (String) -> Boolean
): List<String> = names.filter { predicate(it)  }
