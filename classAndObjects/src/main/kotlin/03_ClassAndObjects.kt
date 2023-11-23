fun main() {
 val Emp = Employee("saheb")
    val Emp2 = Employee(1002,"milon")
    /*
    println("${Emp.code} and ${Emp.name} ")
    println("${Emp2.code} and ${Emp2.name} ")
     */
    val Emp3 = Employee(66000.8,"Minati")
}
class Employee(var name:String){
//    var code:Int = 0

    // this is constructor overloading  just function signature is different(no of argument or type of an argument)
    constructor(code : Int,n:String) : this(n)
    {
//        this.code = code
    }

    constructor(salary:Double ,m :String):this(m)
    {
        println(salary)
        
    }

}



