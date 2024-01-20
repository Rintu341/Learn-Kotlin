package inheritance

// In Kotlin class are by Default  final  if you inherited from it then that parent class should be open

open class Human(open val name:String, open var age :Int)
{
    open fun Speak()
    {
        println("Speaking...")
    }
    open fun Greating()
    {
        println("Hello $name")
    }
}

open class Student(override val name:String,override var age:Int) :Human(name,age)
{
    fun study()
    {
        println("I am Studying...")
    }
}
open class Employee(override  val name :String, override var age :Int):Human(name,age)
{
    fun empPayment()
    {
        println("Employee payment Received")
    }

}

fun main() {
    val employee = Employee("Sujan",21)
    employee.Speak()
    employee.Greating()
    employee.empPayment()
    val student = Student("Saheb",22)
    student.Speak()
    student.Greating()
    student.study()
}