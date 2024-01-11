fun main() {
 /*
    Higher Order Function Or High Order Function is a
    Function which takes a function as a parameter or return a function or can do both
  */
    //passing function into function
    //   val value = higherOrder(5.0,9.0,::multi)


    // improve function call inside function  using lambda
    higherOrder(5.0,7.0, { a: Double, b: Double -> a * b })
    //when last parameter is a lambda function then we can call it outside the parameter
    //    higherOrder(5.0,7.0) { a: Double, b: Double -> a * b }

    val ADD = myADD()
    println(ADD(7,8))
}

fun multi(a:Double,b:Double): Double {//Normal function
    return a*b
}

//higher order function that takes function as a argument
fun higherOrder(a:Double,b:Double, fn:(a:Double,b:Double)->Double)
{
    println(fn(a,b))
    println(fn(b,fn(a,b)))
}

//higher order function that return a function
fun add2(a:Int, b:Int):Int
{
    return a+b
}
fun myADD(): (Int,Int)-> Int
{
    return ::add2
}
