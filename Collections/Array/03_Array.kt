
fun main() {
    //Create new array with given size
    val newArr = Array<Int>(9){0}  // specify {element}  fill all index by this element
    println(newArr.size)
    println(newArr.joinToString())// print all element inside collection
    for(x in newArr){
        println(x)
    }

    // create two-dimensional Array
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())
    // [[0, 0], [0, 0]]

    // Creates an array with values [null, null, null]
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
}