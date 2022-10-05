import java.util.Scanner

fun main(){
    println("Enter a positive number")
    val input = Scanner(System.`in`)
    var number = input.nextInt()
    var total = 0
    if (number < 0){
        println("Only POSITIVE integers please #eyeroll#")
    }
    else {
        while (number in 1..number) {
            total += number
            number--
        }
        println("sum is $total")
    }
}