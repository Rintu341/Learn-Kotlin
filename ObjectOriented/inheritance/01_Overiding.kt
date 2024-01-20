package inheritance

open class Parent(open val height:Int,open val skinColor:String = "Black")
{
    open fun Height()
    {
        println("Parent height is $height")
    }
    open fun growing()
    {
        println("keep growing")
    }

}
interface Grow
{
    fun growing(){
        println("keep growing")
    }

}
open class Child(override val height: Int,override val skinColor: String = "Black"):Parent(height = height) ,Grow // override property and method are automatically open for inheritance
{
    override fun Height() {
        println("Child height is $height")
    }

    //When ever a class inherited from two or more class or interfaces if they have some same method or property then
    // we need to specify which class or interface method or property we want to override
    // Syntax : super<class/interface>.function/method
    override fun growing() { // Also we can add more functionality
        super<Grow>.growing()
        println("Growing called from Child class")
    }

}
//class GrandParent(override val height: Int, override val skinColor: String= "Black") : Child(height = height)
//{
//    override fun Height() {
//        println("GrandChild height is $height")
//    }
//}
fun main() {
    val child = Child(height = 6, skinColor = "Black")
    child.Height();
    child.growing()
//    val grandParent = GrandParent(height = 6, skinColor = "Brawn")
//    grandParent.Height()

}