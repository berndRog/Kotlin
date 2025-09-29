package k11.data

class Cart(
   val name:String,
   cartItem: CartItem
) {
    val cartItems = mutableMapOf<Int, CartItem>()
    var pos = 1

    fun addItem(cartItem: CartItem) {
        cartItems.putIfAbsent(pos++, cartItem)
    }

    fun print() {
        println(name)
        cartItems.values.forEach { println(it.asString()) }
    }
}