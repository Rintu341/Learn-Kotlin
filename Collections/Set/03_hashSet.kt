package Set

fun main() {
    val hashset:HashSet<Int> = hashSetOf(5,4,2,7,8)
    val iterator = hashset.iterator()
    println(hashset) //[8, 2, 4, 5, 7]
}