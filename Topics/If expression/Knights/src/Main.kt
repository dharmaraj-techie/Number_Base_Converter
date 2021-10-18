import java.lang.Math.abs
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    
    print(
        if (abs(x2 - x1) * abs(y2 - y1) == 2) {
            "YES"
        } else {
            "NO"
        }
    )
}
