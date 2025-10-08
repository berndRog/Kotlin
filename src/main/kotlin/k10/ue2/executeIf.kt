package k10.ue2

fun executeIf(
   condition: () -> Boolean,
   action:() -> Unit
) {
   if(condition()) action()
}
