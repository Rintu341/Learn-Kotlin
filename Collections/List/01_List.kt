package List

fun main()
{
    val myList :List<Int> = listOf(1,2,3,4)
    println(myList) // [1, 2, 3, 4]
    println(myList.size)
//    myList[2] = 7  //error  // list immutable  (read only access)
    println(myList[3])

}