import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    println("Enter a number")
    val number = input.nextInt()

    var a = 0
    var b = 1
    var count = 0

    if (number < 0 ){
        println("Enter a positive integer")
    }

    else if (number == 0){
        println("The fibonacci series for $number is $a")
    }
    else{
        while (count < number){
            var c = a + b
            print("$a ")
            a = b
            b = c

            count++
        }
    }
}