fun main() {
    println("Enter Number: ")
    val number = readln().toInt()

    // use ranges in loops(for)
    if (number > 0) {
        for (number in 1..number) {
            println(number)
        }
        println()
        for (number in number downTo 1) {
            println(number)
        }
    }//if end

    for( n in 1 .. 10 step 2)
    {
        println(n)
    }

    val arr = arrayOf(12,23,45,18,90)
    for(a in arr)
    {
        println(a)
    }
    println("***************************")
    for(i in arr.indices) // for(i in 0 ..<arr.size)
    {
        println(arr[i])
    }
    // OR

    for ((index,value ) in arr.withIndex())
    {
        println("The element at $index is $value")
    }

}

