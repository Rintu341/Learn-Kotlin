
class A()
{

}
fun printValues(array : Array<Any>)
{
    for(s in array){println(s)}
    println()
}
fun main() {

    // arrays are immutable

    val b = A()
    // arrayOf contain all types Array<Any>
    val mixed = arrayOf(1,"sujan",3.6,5.899999,b)
    printValues(mixed)
//    for(x in mixed){println(x)}

    //Contain all integers
    val intNum : IntArray = intArrayOf(1,3,7,12,4)
//    printValues(intNum)

//    val IntNum = arrayOf<Int>(4,6,8)
//    printValues(IntNum)

    //Contains float numbers
    val floatNum :FloatArray = floatArrayOf(3.6f,5.888f)

    println(floatNum[1])
    floatNum[1] = 78.7f
    println(floatNum[1])

    //Contains all Double numbers
    val doubleNum :DoubleArray = doubleArrayOf(4.6,3.8923,90.6)

    //Contains all characters
    val chars :CharArray = charArrayOf('i','p','9')

    // no pre function in not present for string  use Array<String>
    val  strings:Array<String> = arrayOf("Sujan","Soumita")
}