/*
    while can be used in two ways:
    ==> To execute a code block while a conditional expression is true. (while)
    ==> To execute the code block first and then check the conditional expression. (do-while)
 */
/*
===> NOTE <===
    The two most common loop structures in programming are for and while.
    ***Use for to iterate over a range of values and perform an action.
    ***Use while to continue an action until a particular condition is satisfied.
 */
fun main() {

    var m: Int = readln().toInt()
    while (m != 0)
    {
        println(m)
        m--;
    }

    var money:Int = readln().toInt()
    do
    {
        println(money)
    }while (money-- != 0)

    //qus : You have a list of words. Use for and if to print only the words that start with the letter l.
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    // Write your code here
    for(word in words)
    {
        if(word.startsWith('l'))
            println(word)
    }
}