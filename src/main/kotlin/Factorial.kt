import java.util.*

fun main(){
    println("Enter an integer")
    val input = Scanner(System.`in`)
    var number = input.nextInt()
    val temp = number
    var total = 1
    while (number >= 1){
        total *= number
        number--
    }
    println("factorial of $temp is $total")
}