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
    val max: Int = if(A >= B && A>= C)
        A
    else if(B>=A && B>=C)
         B
    else
         C
    println("Maximum of $A ,$B and $C is $max")

    //Qus: Decide Grade based on student marks
    println("Enter student total mark : ");
    val mark = readln().toInt()

    /*
        Use when when you have a conditional expression with
        multiple branches. when can be used either as a statement
        or as an expression
     */
    val grade:String = when
    {
        mark > 90  -> "O"
        mark > 80  -> "A+"
        mark > 70  -> "A"
        mark > 60  -> "B+"
        mark > 50  -> "B"
        mark > 40  -> "C"
        mark > 30  -> "P"
        else  -> "FAIL"

    }
    println("Student Grade is $grade")
}