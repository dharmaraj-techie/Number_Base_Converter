import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val s =  scanner.next()
    val b = scanner.next()
    
    if(s.toLowerCase() == b.toLowerCase())
        println("true")
    else 
        println("false")
}
