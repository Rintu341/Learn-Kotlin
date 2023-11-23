fun main() {
    // When we do not create any constructor compiler create an default constructor
    // that have no parameter no body constructor
    val e = Empty()
}
class Empty{}
class Whatsapp
{
    //in Kotlin we mast initialize a property when declare
    // whenever we do not specify value at the time of declare
    //we use lateinit  it is work when variable type is var  not val
    //Datatype is should not  Int,Float,Char,Double..
    //may only String and object type
    // https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables
    lateinit var massage:String
}

