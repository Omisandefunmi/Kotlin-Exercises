import java.util.*

fun main(){
    println("Enter a word")
    val input = Scanner(System.`in`)

    val word  = input.nextLine()

    println("Which letter's frequency do you want to determine?")
    val charValue = input.nextLine()
    val letter = charValue.elementAt(0)

    var i = 0
    var frequency = 0
    while (i < word.length){
        if(word.toCharArray()[i] == letter){
            frequency++
        }
        i++
    }

    println("Letter '$letter' appeared $frequency time(s) in $word ")
}