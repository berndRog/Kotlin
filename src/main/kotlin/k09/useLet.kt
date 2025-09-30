package k09

fun useLet() {

   var name: String? = null
   name = "John"

   name = null
   val length = name?.let { it ->
      return@let it.length  // it.length is sufficient
   }
   println("(1) name: $name length:$length")

}