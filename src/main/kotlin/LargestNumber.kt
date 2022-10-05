import java.util.*

fun main(){
    println("Enter an integer")
    val input = Scanner(System.`in`)
    val number = input.nextInt()

    println("Enter another integer")
    val number2 = input.nextInt();

    println("Enter a third integer")
    val number3 = input.nextInt();

    if ((number >= number2) and (number >= number3 )){
        println("$number is the largest number")
    }

    else if ((number2 >= number) and (number2 >= number3 )){
        println("$number2 is the largest number")
    }
    else{
        println("$number3 is the largest number")
    }
}