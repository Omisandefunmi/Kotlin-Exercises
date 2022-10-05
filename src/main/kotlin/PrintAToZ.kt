fun main (){
    var ascii = 'A'.toInt()
    var count = 1
    while (count <= 26){
        print("${ascii.toChar()} ")
        ascii++
        count++
    }
}