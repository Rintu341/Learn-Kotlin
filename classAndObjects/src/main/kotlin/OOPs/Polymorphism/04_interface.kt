package OOPs.Polymorphism

//interface is a collection of abstract method and properties
// An interfaces is similar to abstract class, but it can be implemented by multiple classes
interface parent {
    fun caring() // by default it abstract
}
class child :parent
{
    override fun caring() {
        println("Care their child")
    }
}

fun main() {
    val child = child()
    child.caring()
}