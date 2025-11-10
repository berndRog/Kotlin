package k12

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

fun operations( inFlow: Flow<Int> ): Flow<Int> =
   inFlow
      .onEach { println($"intermedia: $it") }
      .filter { number:Int -> number % 2 == 0}  // even numbers
      .onEach { println($"filtered:   $it") }
      .map { number -> number * 2 }             // double the number
      .onEach { println($"mapped:     $it") }