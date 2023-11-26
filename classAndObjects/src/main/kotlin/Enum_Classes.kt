fun main() {
    val sun = Day.SUN
    println(sun)
    println(sun.number)
}

enum class Day(val number:Int)
{
    SUN(0),
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6) 
}