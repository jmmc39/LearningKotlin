/*To compile this code use Kotlin Compiler
using this line
kotlinc helloThere.kt -include-runtime -d helloThere.jar
to execute it use
java -jar helloThere.jar
by J.M.M.C*/

fun main(args: Array<String>) {
    println("Type your name please c:")
    var name = readLine()
    println("Hello there, $name")
}
