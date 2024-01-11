fun main() {
    /*
        + lambda expression is always surrounded by curly braces.
        + Parameter declaration in the full syntactic from go inside curly braces and have optional  type annotation
        + The body goes after the "->"
        + The inferred return type of the lambda is not  "Unit" the last (or possibly single) expression inside
        the lambda body is treated as the return type
     */
    val sqrt = {a:Double -> a*a}
    println(sqrt(7.0))
}
