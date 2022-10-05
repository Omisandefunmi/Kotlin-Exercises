import java.util.*

fun main(){
    val input = Scanner(System.`in`)

    println("Enter the numerator")
    val numerator = input.nextInt()

    println("Enter the denominator")
    val denominator = input.nextInt()

    val quotient = numerator / denominator
    val remainder = numerator % denominator

    val sum = quotient + remainder

    println("The quotient of $numerator and $denominator is $quotient")

    println("The remainder of $numerator and $denominator is $remainder")

    println("The sum of quotient $quotient and remainder $remainder is $sum")


}