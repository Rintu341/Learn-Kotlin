package Set

/*
    It is a collection of unordered elements also it does not support duplicate elements.
    It is a collection of unique elements.
    Generally, the order of set elements does not have a significant effect.
    We can not perform add or remove operations because it is an immutable Set.
 */
fun main() {
    val imSet:Set<Int> = setOf(1,3,3,5) //[1,3,5]
    println(imSet)
    println(imSet.size)
    val FimSet:Int? = imSet.find{it==7}

    println(
        if(FimSet == null)
            "Not found"
        else
            "Found"
    )
}