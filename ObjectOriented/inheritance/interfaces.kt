package inheritance

// interface do not have a constructor
interface  Workable // interfaces are also a abstract but it all method and properties are also abstract you should implemented them
{
    fun work()
}
interface Buildable
{
    val price:Int
    fun build()
}
class PC : Workable
{
    override fun work() {
        println("it should be workable")
    }
}
class Computer(price:Int) : Workable,Buildable
{
    override val price: Int

    init {
        this.price = price
    }
    override fun work() {
        println("it should be workable")
    }

    override fun build() {
        println("Build quality is Good")
    }
}

fun main() {
    val pc:PC = PC()
    pc.work()
    
    val computer:Buildable = Computer(60000) // because of computer object is Buildable type that's why it only access Buildable property/method
    computer.build()
    println(computer.price)

    val superComputer:Computer = Computer(120000)
    superComputer.build()
    superComputer.work()
    println(superComputer.price)
}