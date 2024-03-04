package inheritance
enum class Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST
}
class Location(private val direction:Direction)
{
    fun findLocation()
    {
        println("your current Direction is $direction")
    }
}

fun main() {

//    val location = Location(Direction.NORTH)
//    location.findLocation()

    Repository.startFetch()
    getResult(result = Repository.getLoadingState())
    Repository.fetchComplete()
    getResult(result = Repository.getLoadingState())
    Repository.error()
    getResult(result = Repository.getLoadingState())
}


object Repository{
    private var loadingState:Result = Result.IDLE
    private var data:String? = null

    fun startFetch(){
        loadingState = Result.LOADING
        data = "data"
    }

    fun fetchComplete()
    {
        loadingState = Result.SUCCESS
        data = null
    }
    fun error()
    {
        loadingState = Result.ERROR
    }

    fun getLoadingState():Result
    {
        return loadingState
    }
}
fun getResult(result:Result)
{
    return when(result)
    {
        Result.SUCCESS -> println("Success!")
        Result.ERROR -> println("Error!")
        Result.IDLE -> println("Idle")
        Result.LOADING -> println("Loading...")
    }
}


enum class Result{
    SUCCESS,
    ERROR,
    IDLE,
    LOADING
}