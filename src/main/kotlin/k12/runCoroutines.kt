package k12

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun runCoroutines() {

   val scope = CreateCoroutineScope(
      dispatcher = Dispatchers.IO,
      handleError = { errorMessage: String ->
         println(errorMessage)
      }
   )

  runBlocking {

      val job = scope.launch {
         val producer = produce()
         val inter = operations(producer)
         // Consumer 1
         consume(producer, "Consumer 1")
         // Consumer 1
         consume(inter, "Consumer 2")
      }
      job.join() // wait for the job to complete
   }

   println("Main program ends: ${Thread.currentThread().name}")

}