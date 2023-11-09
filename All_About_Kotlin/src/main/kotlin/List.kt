import java.util.Scanner
import java.util.ArrayList


fun main() {
    val list = listOf<Int>(7,5,6,9)
    println(list[2]);
    val ma = arrayOf<String>("sujan","susoma");
    println(ma[0])
    val sublist = arrayListOf<Int>(8,5,3,2)
    println(sublist)
    val set = setOf<String>("MAKAUT","KGEC","JU","CU")
    println(set)
    val arrayList = ArrayList<String>()
    arrayList.add("Hii")
    arrayList.add("Hello")
    arrayList.add("Mood")
    arrayList.addAll(ma)
    println(arrayList)
    arrayList.addAll(index = 2, arrayListOf("soumita"))
    println(arrayList)



//    val value = Scanner()


}