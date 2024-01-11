
fun printAll(strings : Collection<String>)
{
    for(s in strings){println(s)}
    println()
}

fun main() {

    // imMutable collection  can not its value just read only
    val myList = listOf<String>("House","Car","IPhone")
    printAll(myList)
    val mySet = setOf<String>("Sujan","Soumita")
    printAll(mySet)
}