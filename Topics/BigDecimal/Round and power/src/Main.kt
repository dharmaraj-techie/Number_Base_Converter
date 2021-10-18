import java.math.BigDecimal
import java.math.BigInteger
import java.math.RoundingMode     

fun main() {
    val power = readLine()!!.toInt()
    val mode = readLine()!!.toInt()
    val number = BigDecimal(readLine()!!)

   print( number.setScale(mode, RoundingMode.FLOOR).pow(power))

}