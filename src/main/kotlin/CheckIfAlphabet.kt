fun main(){
    val charValue = readLine()?.uppercase()
    when(charValue?.get(0)){
        in 'A'..'Z' -> println("$charValue is an uppercase alphabet")
        in 'a'..'z' -> println("$charValue is a lowercase alphabet")
        else -> println("$charValue is not an alphabet")
    }
}