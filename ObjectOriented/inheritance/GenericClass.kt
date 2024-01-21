package inheritance

class Addition<E>(private val num1: E, private val num2: E) where E : Number {
    fun add(): E {
        return when (num1) {
            is Int -> num1.toInt().plus(num2.toInt()) as E
            is Double -> num1.toDouble().plus(num2.toDouble()) as E
            is Float -> num1.toFloat().plus(num2.toFloat()) as E
            // Add other supported types as needed

            else -> throw IllegalArgumentException("Unsupported type")
        }
    }
}

fun main() {

    val addition = Addition<Double>(34.0,78.0)
    println( addition.add())
}