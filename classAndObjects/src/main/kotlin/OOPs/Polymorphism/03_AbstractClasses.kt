package OOPs.Polymorphism


// if a class contain at least one abstract method/ property
//then class will be abstract
// abstract  method => which do not have body
// if a class is abstract then for inheritance there are no need to add "open" keyword
abstract class Car
{
    abstract  val speed:Int
    fun Break()
    {
        println("Car break")
    }
    abstract fun drive()
}

// when you inherit an abstract class you should override the abstract member
class suparCar: Car() //override member of an abstract class "Car"
{
    override val speed: Int = 300
    override fun drive() {
        println("Super car Drive to fast, top speed $speed")
    }
}
fun main() {
    // cannot create an object of abstract class
    //    val car = Car()

    // superCar is now Complete
    val suparCar:Car = suparCar()
    suparCar.Break()
    suparCar.drive()
    println(suparCar.speed)
}