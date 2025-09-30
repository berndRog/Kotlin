package k05

// lambda with Receiver with function type: T.() -> R
val lambdaWithReceiver: String.() -> Int = {
   this.length // length can also be used without this.
}

// remarks
// A lambda with receiver changes how you write the lambda. Instead of taking
// a parameter, a lambda with receiver executes in the context of a specific
// object (the receiver).
// Inside the lambda, this refers to that receiver (in this case, a String),
// and you can access its members directly without needing to write this
// explicitly.