package Map
/*
A Map stores key-value pairs (or entries); keys are unique, but different keys can be paired with equal values
 */
fun main() {
    val maps:Map<Int,String> = mapOf<Int,String>(1 to "Sujan", 4 to "Susoma", 3 to "Soumita")
    println(maps) // read only access
    println(maps[4]) //[keys]

}