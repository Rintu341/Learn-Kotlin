package inheritance
enum class Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST
}
class Location(val direction:Direction)
{
    fun findLocation()
    {
        println("your current Direction is $direction")
    }
}

fun main() {

    val location = Location(Direction.NORTH)
    location.findLocation()
}