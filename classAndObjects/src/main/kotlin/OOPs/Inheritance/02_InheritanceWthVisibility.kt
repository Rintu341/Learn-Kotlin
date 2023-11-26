package OOPs.Inheritance

open class A
{
    private val xyz  = 6
    protected  val abc = 8 // can access in subClass
    internal val efg = 9 // Can access in Same module
    val pqr = 7 // by default public
}
class B:A()
{
    init
    {

//        println(xyz) // xyz is not visible in sub-class it is a private
        println(abc)// protected are visible
        println(efg)// internal are visible
        println(pqr) //public
    }
}
fun main()
{
    val b = B()

}
