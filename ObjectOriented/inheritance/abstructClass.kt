package inheritance


// we cannot create an object of an abstract class
//in child class you Should implement  it
// function can be abstract then we need to implement this function/method in child class
abstract class Human1(open val name:String, open var age :Int)
{
    open fun speak()
    {
        println("Speaking...")
    }
    abstract fun greet() // abstract function don't have a body
}

open class Student1(override val name:String,override var age:Int) :Human1(name,age)
{
    fun study()
    {
        println("I am Studying...")
    }

    override fun greet() {
        println("Implemented Great in Student1 class")
    }
}
open class Employee1(override  val name :String, override var age :Int):Human1(name,age)
{
    fun empPayment()
    {
        println("Employee payment Received")
    }
    override fun greet() {
        println("Implemented Great in Employee class")
    }

}

fun main() {
    val employee = Employee1("Sujan",21)
    employee.speak()
    employee.greet()
    employee.empPayment()
    val student = Student1("Saheb",22)
    student.speak()
    student.greet()
    student.study()
}