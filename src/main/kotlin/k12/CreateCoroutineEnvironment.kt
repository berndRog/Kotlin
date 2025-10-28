package k12

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

fun CreateCoroutinesEnviroment(
   dispatcher: CoroutineDispatcher,
   handleError: (String) -> Unit
): Pair<CoroutineContext, CoroutineScope> {

   // handle coroutine exceptions
   val coroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
      handleError("!!! ERROR: CoroutineException: $exception")
   }

   // select coroutine dispatcher
   val dispatcher: CoroutineDispatcher = dispatcher
   // create a coroutine context
   val coroutineContext: CoroutineContext = Job() + dispatcher + coroutineExceptionHandler
   // create a coroutine scope
   val coroutineScope = CoroutineScope(coroutineContext)

   return Pair(  coroutineContext, coroutineScope)

}