import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    
    print(
            when {
                c < a -> {
                    "Deficiency"
                }
                c > b -> {
                    "Excess"
                }
                else -> {
                    "Normal"
                }
            }
    )
}
