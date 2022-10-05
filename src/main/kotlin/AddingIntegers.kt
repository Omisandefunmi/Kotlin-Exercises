import java.util.Scanner

fun main(){
    println("Enter an integer")
    val input = Scanner(System.`in`)

    val number = input.nextInt()
    println("You have entered $number")

    println("Enter another integer")
    val number2 = input.nextInt();

    println("$number + $number2 = ${number + number2}")
}