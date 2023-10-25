fun main()
{
    println("Enter your age : ")
    val age = readln().toShort()

    //Conditional statement
    /*
    if(age < 18)
        println("you can not drive a Car")
    else
        println("you can drive a Car")
     */
//    multiple if else
    if(age < 18)
        println("you can not drive a Car")
    else if(age >18)
        println("you can drive a Car")
    else
    {
       println("$age just wait and apply for driving licence")
    }

//    There is no ternary operator condition ? then : else in Kotlin.
//    Instead, if can be used as an expression.
//    When using if as an expression, there are no curly braces {}:
    val A = 5
    val B = 9
    val C = 2
    val max: Int;

    if(A >= B && A>= C) {
        max = A
    } else if(B>=A && B>=C) {
        max = B
    } else {
        max = C
    }
    println("Maximum of $A ,$B and $C is $max")
}