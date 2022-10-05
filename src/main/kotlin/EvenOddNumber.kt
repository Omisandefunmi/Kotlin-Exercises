import java.util.*

fun main(){
    println("Enter an integer")
    val input = Scanner(System.`in`)

    val number = input.nextInt()

    if(number % 2 == 0){
        println("$number is an even number")
    }
    else{
        println("$number is an odd number")
    }
}