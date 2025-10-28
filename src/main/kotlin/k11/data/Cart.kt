package k11.data

class Cart(
   val name:String,
) {
    //                       pos, CartItem
    val items = mutableMapOf<Int, CartItem>()
    var pos = 1

    fun addItem(cartItem: CartItem) {
        items.putIfAbsent(pos++, cartItem)
    }
}