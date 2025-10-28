package k11.data

/*
     3 x Bio Milch, 1l,          1.99 =   5.97
     2 x Butter,                 1.95 =   3.90
    10 x Joghurt,                0.89 =   8.90
     2 x Gouda Käse 100 g,       2.89 =   5.78
     5 x Emmentaler Käse 100g,   2.49 =  12.45
    -------------------------------------------
                                 Summe:  37.00
 */

fun initCart(): Cart {

    val product1 = Product("Bio Milch, 1l", 1.99)
    val product2 = Product("Butter", 1.95)
    val product3 = Product("Joghurt", 0.89)
    val product4 = Product("Gouda Käse 100 g", 2.89)
    val product5 = Product("Emmentaler Käse 100g", 2.49)

    val cartItem1 = CartItem(product1, 3)
    val cartItem2 = CartItem(product2, 2)
    val cartItem3 = CartItem(product3, 10)
    val cartItem4 = CartItem(product4, 2)
    val cartItem5 = CartItem(product5, 5)

    val cart = Cart("Warenkorb 1")
    cart.addItem(cartItem1)
    cart.addItem(cartItem2)
    cart.addItem(cartItem3)
    cart.addItem(cartItem4)
    cart.addItem(cartItem5)

    return cart
}
