import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()

    while(true ){
        print("$n ")
        if(n == 1){
            break
        }
        if(n % 2 == 0){
            n /= 2
        }else{
            n = n * 3 + 1
        }
    }
}