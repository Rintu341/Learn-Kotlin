package inheritance

import javax.xml.crypto.Data

class Book(val title:String ,val arthur:String,val price:Int )
{
    override fun toString(): String {
        return ("Book[title = $title, arthur = $arthur, price = $price]")
    }
}
data class DataBook(val title:String ,val arthur:String,val price:Int ) {}

fun main() {
    val book = Book("C_Programming","KK",450)
    println(book)
    book.toString()
    val dataBook = DataBook("Java","Jhon K",500)
    println(dataBook)

    println(book.equals(dataBook))

   val dataBook1 = dataBook.copy()
    val set = hashSetOf(dataBook1,dataBook)
    println(set)
}