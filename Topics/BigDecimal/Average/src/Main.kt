import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val a = BigDecimal(readLine()!!)
    val b = BigDecimal(readLine()!!)
    val c = BigDecimal(readLine()!!)

    print( (a+b+c).setScale(0, RoundingMode.HALF_UP)/ 3.toBigDecimal() )
}