package k09

fun useRun() {

   val result = Person2().run {
      this.name = "Erika Mustermann"
      this.gender ='w'
      "Person's name is $name and gender is $gender"
   }

   println(result)

}

class Person2() {

   var name:String? = null
   var gender: Char? = null

   fun print() =
      println("name: $name, gender: $gender")
}