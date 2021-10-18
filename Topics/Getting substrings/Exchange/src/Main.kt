import java.util.*

fun main() {
   val scanner = Scanner(System.`in`)
   val input = scanner.next()
   println(input[input.lastIndex]+input.substring(1, input.lastIndex) + input[0])
}