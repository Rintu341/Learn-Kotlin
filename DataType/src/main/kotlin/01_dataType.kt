//DATATYPE
// Data Types represent the type of data variables holds.
fun main()
{
    val num1 : Int = 23
    val num2 : Short =78
    val num3 : Byte = 89
    val num4 : Long = 782589

    val ch :Char = '8'
    val marks:Float  = 8908.78F
    val hight: Double = 169.898
    val userName : String = "i love you baby"
    val marksAllSubject:Array <Int> = arrayOf(2,4,5,6)

    println("first subject marks "+ marksAllSubject[0] )

    var favActivity : Array<String> = arrayOf("programming","travel","Music")
    println(favActivity[2]);
    favActivity[2] = "pubg"
    println(favActivity[2]);

    // can change  val type variable value in Array ,
    //because we change its content not variable
    marksAllSubject[0]= 7
    println(marksAllSubject[0])

}