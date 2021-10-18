import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()

    println(when{
        a > 0 -> "positive"
        a < 0 -> "negative"
        a == 0 -> "zero"
        else -> "null"
    })
}
