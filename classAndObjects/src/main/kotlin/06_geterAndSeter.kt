fun main() {
    val R = Addition(4,6)
    println(R.Result)
    val myLicence = License(21)
    val myLicence2 = License(17)

    println(myLicence.age)

    val realPerson = person("sujan is a best developer")
    println(realPerson.name)
}
class Addition( num1:Int,num2:Int)
{
    val Num1 :Int  = num1
    val Num2 :Int  = num2

    //get() Example
    val  Result = Num1 + Num2
        get()
        {
            println("return successfully")
            return field // special variable
        }
}
class License(agePara:Int)
{

    //set() Example
    var age :Int = agePara
        set(value) {
            if(value >= 18)
            {
                field = value
            }else
            {
                println("you can get Licence")
            }
        }

}
class person(namePara:String)
{
    var name :String = namePara
        //inside get use field inside get as a variable
        get() {
            return field.uppercase()
        }

}

