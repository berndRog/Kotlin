package k11.data

data class Book(
   val authors: List<String>,
   val title: String,
   val year: Int,
   val publisher: String,
   val isbn: String
) {
    fun asString(): String =
       authors.joinToString().toString() + ", $title $publisher, $year, ISBN $isbn"

}