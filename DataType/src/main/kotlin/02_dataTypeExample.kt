//The content contained within parentheses () is called the class header.
// user-define data type
class User( val name:String, private val userId:Int ,val address:String)
{
    fun display()
    {
        println(name)
        println(userId)
        println(address)
    }
}
//initialize with default value "example@gmail.com"
class Contact (val id:Int ,var email:String ="example@gmail.com")

/*
===>  Kotlin has data classes which are particularly useful for storing data.
Data classes have the same functionality as classes,
but they come automatically with additional member functions.
These member functions allow you to easily print the instance to readable output,
compare instances of a class, copy instances, and more.
As these functions are automatically available,
you don't have to spend time writing the same boilerplate code for each of your classes.
*/
//To declare a data class, use the keyword data:
data class  Employee (val userId : Int , val userName:String)

fun main()
{
    //To create an object from a class, you declare a class instance using a constructor.
    val user1:User = User("sujan",101,"Mahishadal")
    user1.display()

    val contact = Contact(103,"sujanrintu@gmail.com")
    contact.email = "sujanmandal892748@gmail.com" // email is var type it value can change

    println("There email address is ${contact.email} ")


    //Data class have many in build functionality
    val empObj = Employee(3,"Soumita")
    val empObj2 = Employee(5,"Susoma")
    //Like

    // this function work for only  data classes
    println(empObj.toString()) //Prints a readable string of the class instance and its properties.
    //OR
    println(empObj)

   
    println(empObj2.equals(empObj)) //Compares instances of a class.
    // OR
    println("empObj == empObj2 : ${empObj == empObj2}")
    //empObj == empObj2 : false

    /*
    To create an exact copy of a data class instance, call the .copy()
    function on the instance.

    To create a copy of a data class instance and change some properties,
    call the .copy() function on the instance and add replacement values
    for properties as function parameters
    */
    val firstUser = Employee(4,"Saheb")
    val secondUser = Employee(5,"Lakshman")

    //create exact copy of user
    println(firstUser.copy())

    //Create a copy of secondUser with userId : 6
    println(secondUser.copy(userId = 6))
    //Create a copy of secondUser with userName : "sujan"
    println(secondUser.copy(userName = "sujan"))

     
}
