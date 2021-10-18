import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val money = BigDecimal(readLine()!!)
    val interest = BigDecimal(readLine()!!).setScale(2, RoundingMode.CEILING)
    val years = readLine()!!.toInt()

    val finalAmount = ((interest / 100.toBigDecimal())+BigDecimal.ONE).pow(years) * money

    println( "Amount of money in the account: ${finalAmount.setScale(2, RoundingMode.CEILING)}")


}