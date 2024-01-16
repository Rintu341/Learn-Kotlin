package Set

fun main() {
    val muSet:MutableSet<Int>    = mutableSetOf(3,5,7,8)
    println(muSet)
    muSet.add(90)
    println(muSet)
    muSet.remove(7)
    println(muSet)
}