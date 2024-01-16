package List
// In Mutable list can access and update element
// also this mutable list have many functions
fun main() {
    val myMList:MutableList<Int> = mutableListOf(1,2,3,4)
    println(myMList) //[1, 2, 3, 4]
    try {
    println(myMList[3])
    }catch (e:Exception)
    {
        println("Error : ${e.message}")
    }
    myMList.add(5)
    println(myMList.size)
    println(myMList.get(3))// same as index operator '[]'
    println(myMList.asReversed())
}