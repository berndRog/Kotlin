package k12

import kotlinx.coroutines.delay

suspend fun doWork(duration: Long = 1000) {

   print("<-doWork          started ${Thread.currentThread().name}")
   delay(duration)
   print("<-doWork          ended   ${Thread.currentThread().name}")
}

