fun main()
{
    val myMobile = Mobile("Vivo-Y20", camera = 32)
    val myBook = Books("CPP")
}
class Mobile(val mobileName: String,val battery:Int = 5000, val camera:Int) // primary constructor with default value
{
    init {
        println("$mobileName $battery $camera")
    }
}

class Books(bookName:String,val noOfPages:Int)
{
    val bookName = bookName.plus(" from central Library")
    init{
        println("Book obj created ${this.bookName}")
        println(this.noOfPages)
    }
    constructor(bookName : String): // Secondary Constructor
            this(bookName, readln().toInt())

}
