package converter

import java.math.BigDecimal
import java.math.BigInteger
import kotlin.math.pow

/**
 * Any base convertor
 */
fun main() {
    getUserInput()
}

/**
 * function that asks for user input
 */
fun getUserInput() {
    //this wile loop will run until user uses the /exit cmd
    while (true) {
        println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        val input = readLine()!!.trim()
        if (input == "/exit") break
        else {
            //get two input from user 1, from which base 2, to which base
            val (sourceBase, targetBase) = input.split(" ").map { it.toInt() }

            //this loop will run till user hits back
            while (true) {
                println("Enter number in base $sourceBase to convert to base $targetBase (To go back type /back)")
                //source base numeric
                val value = readLine()!!
                if (value == "/back") {
                    break
                } else {
                    //we first convert any given source base to base 10, because we can convert it to any base from 10,
                    //initial don't convert if the source base is already 10,
                    val decimal = if (sourceBase == 10) {
                        BigDecimal(value)
                    } else {
                        decimalConvertor(value, sourceBase)
                    }

                    val result = decimalToAnyBaseConvertor(decimal, targetBase)
                    println("Conversion result: $result \n")
                }
            }
        }
    }
}


/**
 * this function converts any given number to decimal value
 * @param sourceNumber pass the numeric value
 * @param sourceBase pass the base value of the source
 * @return returns a converted decimal vale of type BigDecimal
 */
private fun decimalConvertor(sourceNumber: String, sourceBase: Int): BigDecimal {
    return if (sourceNumber.contains(".")) {
        //we check weather the number has fractional part, if so we separate the fractional and Whole part
        val (decimal, fractional) = sourceNumber.split(".")
        // we convert the whole part and fractional part separately and sum them
        //they both return BigDecimal, so it's easy to sum
        val convertedDecimal =
            wholePartToDecimalConvertor(decimal, sourceBase) + fractionalPartToDecimalConvertor(fractional, sourceBase)
        convertedDecimal
    } else {
        //if there is no fractional part we only convert he whole part
        wholePartToDecimalConvertor(sourceNumber, sourceBase)
    }
}

/**
 * converts the whole part of any base to the decimal value
 * @param sourceNumber is the given whole number which needs to be converted onto decimal
 * @param sourceBase is the base in which the given sourceNumber is in
 * @returns result of type [BigDecimal]
 */
private fun wholePartToDecimalConvertor(sourceNumber: String, sourceBase: Int): BigDecimal {
    var decimal = BigInteger.ZERO
    val reversed = sourceNumber.reversed()
    for ((index, value) in reversed.withIndex()) {
        /**
         * [Character.getNumericValue]
         * this method returns the corresponding numeric value rather than the unicode int value
         * (e.g)
         *  - Character.getNumericValue(8)
         *  // 8 (Int)
         *  - Character.getNumericValue('a')
         *  //10 (Int)
         *  - Character.getNumericValue('f')
         *  //15 (Int)
         */
        decimal += BigInteger.valueOf(Character.getNumericValue(value) * sourceBase.toDouble().pow(index).toLong())
    }
    return decimal.toBigDecimal()
}

/**
 * converts the fractional part of any base to the decimal value
 * @param fractional is the given fractional part which needs to be converted into decimal
 * @param sourceBase is the base in which the given fraction is in
 * @returns result of type [BigDecimal]
 */
fun fractionalPartToDecimalConvertor(fractional: String, sourceBase: Int): BigDecimal {
    var decimal = BigDecimal.ZERO
    for ((index, value) in fractional.withIndex()) {
        /**
         * [Character.getNumericValue]
         * this method returns the corresponding numeric value rather than the unicode int value
         * (e.g)
         *  - Character.getNumericValue(8)
         *  // 8 (Int)
         *  - Character.getNumericValue('a')
         *  //10 (Int)
         *  - Character.getNumericValue('f')
         *  //15 (Int)
         */
        val a = sourceBase.toDouble().pow((index + 1) * -1)
        decimal += a.toBigDecimal().multiply(Character.getNumericValue(value).toBigDecimal())
    }
    return decimal

}


/**
 * this function converts the decimal value to any given base
 * @param decimal pass the decimal numerics as BigInteger
 * @param targetBase pass the base value to which you want to convert the decimal
 * @return it returns the converted result as a string
 */
private fun decimalToAnyBaseConvertor(decimal: BigDecimal, targetBase: Int): String {
    // we separate the decimal and fractional part of number
    val (wholePart, fractional) = decimal.divideAndRemainder(BigDecimal.ONE)

    return if (fractional == BigDecimal.ZERO) {
        //if it doesn't have the fractional part we only convert the whole part
        wholePartToTargetBaseConvertor(wholePart, targetBase)
    } else {
        //if it has fractional part we convert them separately and concatenate them
        wholePartToTargetBaseConvertor(wholePart, targetBase) + "." + fractionalPartToTargetBaseConvertor(fractional,
            targetBase)
    }
}

/**
 * converts the given decimal number to targetBase
 */
fun fractionalPartToTargetBaseConvertor(fractional: BigDecimal, targetBase: Int): String {
    var convertedFraction = ""
    var nextFraction = fractional
    var i = 0
    do {
        val (divisor, remainder) = (nextFraction * targetBase.toBigDecimal()).divideAndRemainder(BigDecimal.ONE)
        convertedFraction += Character.forDigit(divisor.toInt(), targetBase)
        nextFraction = remainder
        ++i
    } while (remainder != BigDecimal.ZERO && i < 5) // we need only up to 5 decimal places
    return convertedFraction
}

/**
 * converts the given decimal fractional part to targetBase
 */
private fun wholePartToTargetBaseConvertor(decimal: BigDecimal, targetBase: Int): String {
    var result = ""
    var q = decimal.toBigInteger()
    val base = targetBase.toBigInteger()
    while (q / base > BigInteger.ZERO) {
        // BigInteger.divideAndRemainder() this method returns both the divided and remainder
        val (divided, remainder) = q.divideAndRemainder(base)
        /**
         *  Character.forDigit(int digit, int radix)
         *  determines the character representation for a specific digit in the specified radix.
         *  (e.g)
         * - Character.forDigit(3, 10)
         * // 3
         * - Character.forDigit(14 , 16)
         * // e
         */
        result += Character.forDigit(remainder.toInt(), targetBase)
        q = divided
    }
    result += Character.forDigit(q.toInt(), targetBase)
    return result.reversed()
}


