
//WAP to take a number from user and find digit count
fun countDigit(number :Int):Int// count on of digit in number
{
    var count = 0
    var n = number
    while(n > 0)
    {
        count++
        n /= 10
    }
    return  count
}
// WAP to take a number from user  and find the sum of cube of each digit
fun sumOfCube(number :Int):Int
{
    var r:Int
    var n = number
    var sum = 0
    while (n > 0)
    {
        r = n%10
        sum += r*r*r
        n /=10
    }
    return sum
}
//WAP to take a number from user and reverse that number
fun reverse(number:Int):Int
{
        var n =number
        var rev = 0
    while(n>0)
    {
        val r = n%10
        rev = rev *10 + r
        n /=10
    }
    return rev
}

fun main() {
    val number = readln().toInt()
    println(countDigit(number))
    println(sumOfCube(number))
    println(reverse(number))
}