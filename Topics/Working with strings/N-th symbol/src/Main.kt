import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val string = scanner.nextLine()
    val number = scanner.nextInt()
    
    println("Symbol # $number of the string \"$string\" is \'${string[number-1]}\'")
    
}
