package k05

fun lambdaWithoutAndWithReceiver() {

   val text = "Hallo Erika Mustermann"

   println("\nlambda without Receiver T -> R")
   val lenWithout = lambdaWithoutReceiver(text)
   println("$text hat $lenWithout Zeichen")

   println("\nlambda with Receiver T.() -> R")
   val lenWith = lambdaWithReceiver(text)
   println("$text hat $lenWith Zeichen")

}

// normal lambda with function type (T) -> R
val lambdaWithoutReceiver: (String) -> Int = { text ->
   text.length
}

// lambda with Receiver with function type: T.() -> R
// A lambda with receiver changes how you write the lambda.
// Instead of taking a parameter, a lambda with receiver executes
// in the context of a specific object (the receiver). Inside the lambda,
// this refers to that receiver (in this case, a String), and you can
// access its members directly without needing to write this explicitly.
val lambdaWithReceiver: String.() -> Int = {
   this.length // length without this.
}



