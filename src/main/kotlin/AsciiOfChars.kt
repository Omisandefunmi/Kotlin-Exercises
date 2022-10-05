import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    println("""
        Enter a character.
        
        NOTE: One character at a time!
    """.trimIndent())

    val userInput = input.next()
    var charValue: Char = userInput.elementAt(0)
    when(charValue){
        in 'A'..'Z' -> println("Ascii value of $charValue is ${charValue.toInt()}")
        in 'a'..'z' -> println("Ascii value of $charValue is ${charValue.toInt()}")
        in '0'..'9' -> println("Ascii value of $charValue is ${charValue.toInt()}")
    }
}