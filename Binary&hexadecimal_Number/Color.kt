
enum class Color(private val code:Int)
{
    RED(0XFF0000),GREEN(0x00FF00),BLUE(0x0000FF);
     fun colorRed():Boolean
     {
         return RED.code == this.code
     }
}


fun main() {

    println(Color.RED.colorRed())
    println(Color.GREEN)
}