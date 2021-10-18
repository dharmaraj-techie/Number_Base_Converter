import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val availableBalance = scanner.nextInt()

    val spentAmmount = mutableListOf<Int>()


    while (scanner.hasNextInt()) {
        spentAmmount.add(scanner.nextInt())
    }

    if (spentAmmount.sum() > availableBalance) {
        println("Error, insufficient funds for the purchase. Your balance is " +
                "${availableBalance - (spentAmmount.sum() - spentAmmount[spentAmmount.lastIndex])}, " +
                "but you need ${spentAmmount[spentAmmount.lastIndex]}.")
    } else {
        println("Thank you for choosing us to manage your account! Your balance is ${availableBalance - spentAmmount.sum()}.")
    }
}