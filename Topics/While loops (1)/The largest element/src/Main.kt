import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var greatest = 0

    while (true) {
        val n = scanner.nextInt()
        if (n > greatest) {
            greatest = n
        }
        if (n == 0) {
            break
        }
    }
    print(greatest)
}
