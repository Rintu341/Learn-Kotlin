/*
    create function by fun keyword
    fun function_name( parameter_name): return type
    {
        //function body
    }

 */
fun main() { // every program run from main
    myFun();
}
fun printName_Age(age:Int, name:String):String
{
    return "My name is $name and age is $age"
}
// default Argument
fun mood(massage:String,type:String = "Happy")
{
    println("type: $type")
    println("massage: $massage")
}
fun myFun()
{
    println("kay nam bataya appka ")
    println("Bhupendra yogi")
    println("America me kha kha gya ha app");
    println("bohot jaga gaya hua  main")
    println("nam bataya !")
    println("Bhupendra yogi")
    println();
    val str = printName_Age(21,"sujan mandal")
    println(str);

    mood("itni kyu tum kubsurot ho?")

    // named argument
    mood(type="Angry", massage = "Aak dikhata ha")
}