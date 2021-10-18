import java.math.BigInteger

fun main() {
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()

   val (q, r)  = a.divideAndRemainder(b)

    print("$a = $b * $q + $r")

}