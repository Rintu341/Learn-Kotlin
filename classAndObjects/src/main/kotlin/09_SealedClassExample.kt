
sealed class  Pen
class BluePen(val price:Int):Pen()
class RedPen(val price: Int):Pen()

fun main() {
    val pen:Pen = BluePen(5)
    val pen2:Pen = RedPen(6)

    println( when(pen2)
        {
            is BluePen -> "${pen2.price+10}"
            is RedPen -> "${pen2.price+5}"
        }
    )
}
