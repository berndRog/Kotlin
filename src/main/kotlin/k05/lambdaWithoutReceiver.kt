package k05

// normal lambda with function type (T) -> R
val lambdaWithoutReceiver: (String) -> Int = { text ->
   text.length
}