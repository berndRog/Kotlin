package k05

fun useLambdaWithoutAndWithReceiver() {

   val text = "Hallo Erika Mustermann"

   // There is no difference in usage
   val lenWithout = lambdaWithoutReceiver(text)
   val lenWith    = lambdaWithReceiver(text)  // text is of type String

   println("\nlambda without Receiver T -> R")
   println("$text hat $lenWithout Zeichen")

   println("\nlambda with Receiver T.() -> R")
   println("$text hat $lenWith Zeichen")

}



