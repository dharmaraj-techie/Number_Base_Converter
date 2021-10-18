import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val yr = scanner.nextInt()
    
    if(yr % 400 == 0){
        println("Leap")
    }else if(yr % 4 == 0 && yr % 100 != 0){
        println("Leap")
    }else {
        print("Regular")
    }
    
}
