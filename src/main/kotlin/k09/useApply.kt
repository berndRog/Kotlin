package k09


fun useApply() {

   val countryOOProg = Country("France");
   countryOOProg.capital = "Paris"
   countryOOProg.print()

   val country = Country("Germany").apply {
      this.capital = "Berlin"
      this.print()
   }
}

class Country(val name:String){
   var capital:String? = null

   fun print() {
      if( capital != null)
         println("Country: $name, Capital: $capital")
      else
         println("Country: $name")
   }
}
