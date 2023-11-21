

fun main() {
//    val temp = Temp("Sujan",170)
//    println(temp.B)
    val man = Human("Sujan", 170)
}

// Declare a class
// in () without val/var variable are as parameter
// but with val/var it as property of that class
class Temp (A: String, val B : Int)// A is a Parameter and B is a Property
{
    init {
        println(B)
    }
}
    class Human(
        name:String , 
        height :Int) // as a primary constructor
{
        val humanHeight = height;// constructor parameter can be used to initialize an object
    val firstProperty = "First Property : $name".also { println() }
    init {
        println("First initializer block prints $name ")
    }
    val secondProperty = "second Property : ${name.length}".also{println()}
    init{
        println("second initializer block prints ${name.length} ")
    }
}

class Person(val age:Int, var isMarried : Boolean = false)// class with default value
{

}
