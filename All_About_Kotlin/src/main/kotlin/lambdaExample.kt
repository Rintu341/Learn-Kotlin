fun main() {
    val printmasg :(String)->String={it}
    println(printmasg("sujan"))

    val addition = {x:Int ,y:Int->x+y}
    val Add = addition(3,4);
    println(Add)
    println(calculator(5,6,addition))


}
fun calculator(x:Int,y:Int ,op:(a:Int,b:Int )->Int):Int
{
return op(x,y)
}

