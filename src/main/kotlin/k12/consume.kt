package k12

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach

// Consumer
suspend fun consume(
   inflow: Flow<Int>,
   name: String
) {
   var sum = 0
   inflow
      .onEach { println("$name: $it") }
      .collect { it: Int ->
         sum += it
      }
   println("$name sum: $sum")

}
