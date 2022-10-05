fun main(){
    var first = 45
    var second = 90
    println("first is $first and second is $second")
    val temp = first

    first = second
    second = temp
    println("first is now $first while second is now $second")
}