package inheritance

fun main() {

    val items = listOf("Sujan","Soumita","Susoma","Souman")
    val itemsInt = listOf(24,78,19,90)
    val objFinder = Finder(listOfItem = itemsInt)


    objFinder.finder(element = 78){
        println("Found $it")
    }
}
class Finder<T>(
    private val listOfItem: List<T>
){
    fun finder(element: T, findItem:(T?)->Unit){
        val foundItemList = listOfItem.filter {
            it == element
        }
        if(foundItemList.isEmpty()){ findItem(null) }else{
            findItem(foundItemList.first())
        }

    }
}
