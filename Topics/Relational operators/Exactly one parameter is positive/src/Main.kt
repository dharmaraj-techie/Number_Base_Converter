import java.util.Scanner

fun main(args: Array<String>)  {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if(isPositive(a) && !isPositive(b) && !isPositive(c)) {
        print(true)
    }else if(!isPositive(a) && isPositive(b) && !isPositive(c)) {
        print(true)
    }else if(!isPositive(a) && !isPositive(b) && isPositive(c)) {
        print(true)
    }else{
        print(false)
    }
}

fun isPositive(i: Int) = i > 0