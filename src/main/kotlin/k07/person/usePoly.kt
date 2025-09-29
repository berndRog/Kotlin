package k07.person

fun usePoly() {

   println("\nInheritance, Polymorphy")
   val dozent = Dozent("Franz Schiller", 'm', "Prof. Dr.", "Softwaretechnik", 42.0)
   val studi1 = Student("Lars Müller", 'm', 123456, 20.1)
   val studi2 = Student("Mareike Meier", 'w', 987654, 20.2)
   val studi3 = Student("Donald Duck", '*', 345678, 20.3)

   val people = mutableListOf<APerson>()
   people.add(dozent)
   people.add(studi1)
   people.add(studi2)
   people.add(studi3)

   people.forEach{ person ->
      println(person.getAnrede())
   }

   people.forEach{ person ->
      println("${person.name.padEnd(20)} wert:${person.wert}")
   }


}