package Array

fun main() {
    val myAlist:ArrayList<String> = arrayListOf("sujan","Sayan","soumodip","saheb")
    println(myAlist) //[sujan, Sayan, soumodip, saheb]
    println(myAlist.add(1,"susoma"))
    println(myAlist.add("kotlin"))
    println(myAlist.remove("Sayan"))
    val sublist = myAlist.subList(0,2)
    println(sublist)
    println(myAlist)
    println(myAlist.clear())

}