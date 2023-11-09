


fun main() {
    val myarray = arrayOf(3,4,5,6)
    val function = {
        for(i in myarray)
            println(i)
    }
    //create an iterator
//    val p = myarray.iterator()
//    println(p.run { 78 })
    function()

}