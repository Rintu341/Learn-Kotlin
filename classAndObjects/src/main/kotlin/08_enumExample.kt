fun main() {
     val rgb = RGB.RED
    println(rgb)
    for(f in RGB.entries)
        println(f.toString())
}
enum class RGB(val value:Int )
{
    // all of these are an object of it's won class
    RED(100),
    GREEN(200),
    BLUE(300)
}