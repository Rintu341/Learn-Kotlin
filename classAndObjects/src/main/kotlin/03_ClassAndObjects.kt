fun main() {
 val Emp = Employee("saheb")
    val Emp2 = Employee(1002,"milon")
    println("${Emp.code} and ${Emp.name} ")
    println("${Emp2.code} and ${Emp2.name} ")
}
class Employee(var name:String){
    var code:Int = 0
    constructor(code : Int,n:String) : this(n)
    {
        this.code = code
    }
}



