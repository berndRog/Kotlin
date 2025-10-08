package k10.ue1

fun transformList(
   values: List<Int>,
   operator: (Int) -> Int,
): List<Int> {

   val transformedList = mutableListOf<Int>()
   for (e in values)
      transformedList.add(operator(e))
   return transformedList.toList()
}

fun transformList2(
   values: List<Int>,
   operator: (Int) -> Int,
): List<Int>  = buildList {
   for (e in values) add(operator(e))
}

fun transformList3(
   values: List<Int>,
   operator: (Int) -> Int,
): List<Int>  = values.map{ operator(it) }