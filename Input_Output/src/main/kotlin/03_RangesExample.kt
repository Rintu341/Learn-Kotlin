fun main()
{
    println("Enter your age : ")
    val ageGroup:String = when (readln().toInt()) {
        in 18..25 -> "Adult"
        in 1..17 -> "Not Adult"
        else -> "Mature"
    }
    println(ageGroup)
}

