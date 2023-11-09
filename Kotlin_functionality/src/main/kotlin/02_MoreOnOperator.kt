import  java.util.ArrayList as MyList
fun main() {
    val a:Any = "Testing"
    val intoStr:String = a as String
    println(intoStr.length)
    val list = MyList<String>()
    list.add("hajkfhkj")
    list.add("iuriow")
    list.add("uwiruoi")
    println(list)
    for(i in list)
    {
        println(i)
    }

}