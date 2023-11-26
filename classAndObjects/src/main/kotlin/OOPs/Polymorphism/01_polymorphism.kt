package OOPs.Polymorphism



open class Shape
{
    open fun findArea()
    {
        println("finding area of Shape")
    }
}
class Circle : Shape()
{
    override fun findArea() { // function overriding
        println("finding area of a Circle")
    }
}

class Rectangle :Shape()
{
    override fun findArea() { // function overriding
        println("finding area of a rectangle")
    }
}
fun calculateArea(shape :Shape)
{
    shape.findArea()
}
fun main() {
    val  shape1:Shape = Shape()
    val shape2:Shape = Circle()
    val shape3:Shape = Rectangle()

    /* function call is decide on runtime based on object type */

    calculateArea(shape1)
    calculateArea(shape2)
    calculateArea(shape3)

}