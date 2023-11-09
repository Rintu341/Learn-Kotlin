fun main()
{
    // take a string from user
    print("Enter name : ")
    /*
    val name = readln()
    println("Hello , $name ")
    OR
    */
    /*
    val name1 = readLine()
    println("Hello , $name1 ")
     */

    // take a number from user
    val name3 = readlnOrNull()
    println("Hello , $name3")

    println("Enter Number: ")
    val number1 = readln().toInt()
    println("Number is $number1")

    val userInput = readLine() // readline return null when end of file reached  or return input string
    println(userInput?.uppercase())
//    println(userInput?.toInt()?.minus(5)) // it throw an exception because of i tried to convert string to Int
    val myVariable = readln().toInt();
    println(myVariable.plus(7).toString().uppercase())

}