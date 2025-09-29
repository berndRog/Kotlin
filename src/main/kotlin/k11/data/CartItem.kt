package k11.data

import de.rogallab.mobile.data.Product
import java.util.UUID


data class CartItem(
   val product: Product,
   val quantity: Int,
   val id: UUID = UUID.randomUUID()
) {
    fun asString():String = "%5d".format(quantity) +
                            (product.name).padEnd(20) +
                            "%.2f".format(product.price * quantity).padEnd(8)
}