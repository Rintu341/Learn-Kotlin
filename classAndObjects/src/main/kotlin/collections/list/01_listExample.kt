package collections.list

fun main() {
    //list is a Immutable coa not change after initialized
    val list = listOf("RAM","Graphics Card","SSD","Mechanical Keyboard");
    println(list)
    println(list[3])// access by index

    //In mutable list can add an element and remove element
    val  mutableList = mutableListOf("RAM","Graphics Card","SSD","Mechanical Keyboard")
    mutableList.add("Mouse")
    mutableList.remove("SSD")
    println(mutableList)



}


