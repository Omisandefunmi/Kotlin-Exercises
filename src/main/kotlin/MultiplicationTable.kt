import java.util.*

fun main(){
    println("Enter an integer")
    val input = Scanner(System.`in`)
    var number = input.nextInt()
    var multiplier = 1

    while(multiplier <= 12){
        println("$number * $multiplier = ${multiplier * number}")
        multiplier++
    }
}