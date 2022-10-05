import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    val number = input.nextInt()

    val stringNum = number.toString()
    println("$number contains ${stringNum.length} digits")
}