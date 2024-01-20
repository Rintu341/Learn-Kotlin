package inheritance

// use object we can create one type of object means each objects property / methods are same
// Because we do not create any constructor of an object
object  Teacher{
    val name:String = "Ram Sir"
    override fun toString(): String {
        return ("Teacher[name = $name]")
    }
}

// we can create many type of objects(means each object's property can be different) when we use classes
class Tea(
    val name :String
){
    override fun toString(): String {
        return ("Tea[name = $name]")
    }
}

fun main() {
    //object
    // property are same
    val teacher = Teacher
    val teacher2 = Teacher
    println(teacher.name)
    println(teacher2.name)

    //class
    //property are different
    val tea = Tea("Darjeeling")
    val tea2 = Tea(name = "Kerala")
    println(tea.toString())
    println(tea2.toString())
}