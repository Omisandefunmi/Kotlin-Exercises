fun main(){
    println("Enter any character")
    val character = readLine()?.uppercase()
    when(character){
        "A", "E", "I", "O", "U" -> println("$character is a vowel")
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" -> println("$character is neither a consonant nor vowel")
        else -> println("$character is a consonant")
    }

}