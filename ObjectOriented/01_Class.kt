
class Person(name :String,age :Int)
{
    val name :String
    var age :Int

    init { // this block of code execute only once  , it work like a constructor in CPP/JAVA
        println("init block called")
        this.name = name
        this.age = age
    }
    fun greeting()
    {
        println("Hello : $name")
    }
//    fun displayBirthDay() :Int
//    {
//        return 2024-22
//    }
    fun displayBirthDay() = 2024 - age // another way of returning

}
fun main() {
    val person = Person("Sujan",21)
    person.greeting()
    println(person.displayBirthDay())
}
