import java.io.File

fun main() {
    var noOfLine = 0
    File("inputFile").forEachLine {
        ++noOfLine
        println("#$noOfLine $it")
    }

}