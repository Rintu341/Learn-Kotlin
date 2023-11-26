package OOPs.Inheritance
// When one class takes properties and behaviours from another class
//then this is called inheritance.
// Parent = Base = Super
// Child = Derived = Sub


//In Kotlin By default classes are can not be inherited (classes are final by default)
// if want to inherit then use "open" keyword before class
open class DAD{
    val P_name : String = "Madan Mohan Mandal"
    fun displayP_name()
    {
        println("Parent name ${P_name}")
    }
}
class child : DAD() {
    val C_name:String = "Sujan Mandal"

    fun displayC_name()
    {
        println("Child name $C_name")
    }
}
fun main()
{
    val child = child()
    child.displayP_name()
    child.displayC_name()

}


