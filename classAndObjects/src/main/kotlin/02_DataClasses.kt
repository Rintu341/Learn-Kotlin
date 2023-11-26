
data class employee(var E_name:String,var E_age:Int)

fun main() {
    val emp = employee("Sujan",21)
    println(emp.E_name)
    println(emp.E_age)

    val empCopy = emp.copy()
    println(empCopy)
    empCopy.E_name = "Saheb"
    println(empCopy)

}
