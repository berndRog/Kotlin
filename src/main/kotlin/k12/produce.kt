package k12

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun produce(): Flow<Int> =
   // Flow builder
   flow<Int> {
      for (i in 1..10) {
         delay(500)
         println("\nemitted:    $i")
         emit(i)
      }
   }



