fun main() {
    val user = User("Sujan")
    val user2 = User("Saheb")

    println(user2.hashCode())
    println(user.toString())
}
data class User(val name :String) //Data class
