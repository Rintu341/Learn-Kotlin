package OOPs.Inheritance

open class Phone
{
    open val phoneName = ""
    open val model = ""

    open fun call()
    {
        println("just voice call")
    }
}
class smartPhone() : Phone()
{
    override val phoneName: String = "vivo"
    override  val model: String = "y20"
    override fun call() {
        super.call()
        println("video call")
    }
    fun phoneDetails()
    {
        println("phone name: ${phoneName}")
        println("phone model: ${model}")
    }
}
fun main()
{
    val smartPhone = smartPhone()
    smartPhone.phoneDetails()
    smartPhone.call()
}
