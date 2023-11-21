fun main(){
    println("Enter first number")
    val num1 = readln().toInt()

    println("Enter second number")
    val num2 = readln().toInt()
 val result:Int = add(num1,num2)
 println(result)

}

fun add (
    num1:Int,
    num2:Int
):Int
{
    val result = num1+num2
    return result
}
fun askCoffeeDetails()
{
    println("who take Coffee")
    var name = readln()
    println("How many Pisses of Sugar you want");
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    // Call Function
    makeCoffee( sugarCountInt,name)
}

//  Function definition

fun makeCoffee(sugarCount : Int,  name : String){
    when (sugarCount) {
        0 -> {
            println("Coffee with no sugar for [$name]")
        }
        1 -> {
            println("Coffee with $sugarCount spoon of sugar for $name")
        }
        else -> println("Coffee with $sugarCount spoons of sugar for $name")
    }
}
