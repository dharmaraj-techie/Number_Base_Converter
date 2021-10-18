import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstName = scanner.next()
    val secondName = scanner.next()
    val age = scanner.next()
    
    println("${firstName.first()}. $secondName, $age years old")
    
}
