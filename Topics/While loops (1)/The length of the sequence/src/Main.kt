import java.util.*

fun main() {
    var size = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        if(scanner.nextInt() == 0){
            break
        }
        size++
    }
    println(size)
}