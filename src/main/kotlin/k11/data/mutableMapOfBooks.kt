package k11.data

fun mutableMapOfBooks(): MutableMap<String, Book> {

    // mutable MutableMap<String,Book>
    val book1 = Book(listOf("D.Jemerov", "S.Isakova"),
       "Kotlin in Action", 2017, "Manning", "978-1-61729-329-0")
    val book2 = Book(listOf("M.Moskala", "S.Wojda"),
       "Android Development with Kotlin", 2017, "Packt", "978-1-78712-368-7")
    val book3 = Book(listOf("P.Sommerhoff"),
       "Kotlin for Android Development", 2019, "Pearson", "978-0-13-485419-9")
    val book4 = Book(listOf("P.-Y.Saumont"),
       "The Joy of Kotlin", 2019, "Manning", " 978-1-61729-536-2")

    val books: MutableMap<String, Book> = mutableMapOf<String, Book>()
    books.putIfAbsent(book1.isbn, book1)
    books.putIfAbsent(book2.isbn, book2)
    books.putIfAbsent(book3.isbn, book3)
    books.putIfAbsent(book4.isbn, book4)

    return books
}
