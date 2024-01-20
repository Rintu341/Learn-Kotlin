class House(val height:Double, var color:String = "White", val price:Double) // color  have a Default value
{
    fun about(color:String = "White") // Default parameter
    {
        this.color = color
        println("House = [Height = $height] , [color = $color] , [price = $price]")
    }
}
fun main()
{
    // benefit of use named  parameter that is it more readable  you know what you assign
    val house = House(height = 11.5, color = "White", price = 1400000.0) // named parameter  in class object creation
    house.about()
    val redHouse = House(9.0, price = 1200000.0 )
    redHouse.about(color = "Red") // named parameter in function parameter

}
