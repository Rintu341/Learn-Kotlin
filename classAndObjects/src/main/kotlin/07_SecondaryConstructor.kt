class Car
{
    // if you initialized property in constructor then lateinit is unnecessary:
    var  model:String
    lateinit var  type:String
    constructor(carModel:String,carType:String)
    {
        model = carModel
        type = carType
    }
    fun displayDetails()
    {
        println("Car Model : $model")
        println("Car Type : $type")
    }

}
fun main()
{
    val car = Car("Bugatti","Petrol")
    car.displayDetails()
}

