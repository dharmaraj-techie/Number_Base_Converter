fun main() {
    val input = readLine()!!

    val mid = input.length/2
    val front = input.substring(0,3).map { it.toInt() }.sum()
    val back = input.substring(3).map{ it.toInt() }.toList().sum()

    print(if(front == back) "Lucky" else "Regular")

}