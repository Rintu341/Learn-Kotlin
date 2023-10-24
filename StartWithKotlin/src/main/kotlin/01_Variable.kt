fun main() {
//variable in kotlin
    // variable is a memory location that store data
    //variable is container that store a value
    // At the time programing we can change its value and reuse it
// variable is two type
    // var --> it value can be change
    // val  --> value can not change
    var name = "Sujan Mandal"
    val userId = 142
    var  address = "kolkata"
    val hight = 169.7

    println(name)
    println(userId)
    println(address)
    println(hight) // normal printing

    // this is called interpolation
    println("My Hight is "+ hight)
    // we can also write like this
    println("My Hight is $hight")
    // String concatenation to a template

    var a = 49
    var b = 75

    //use curly brackets when use more then one variable together
    println("sum of $a and $b is ${a+b}")

    // kotlin is type Inference language
    // it automatically identify  type of variable if we do not specify
    var num = 90.7// it detect type of num is Double
    var Str = "sujan" // it is String

    //We can also specify the type of a variable
    var number : Int = 89
    var value : Float = 78.6F //use 'F' if  value is float type


    println("########################")
    }
