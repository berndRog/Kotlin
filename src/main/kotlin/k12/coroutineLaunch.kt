package k12

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

fun coroutineLaunch(
   scope: CoroutineScope
): Job {
   val job = scope.launch {
      doWork(1000L)
   }
   return job
}