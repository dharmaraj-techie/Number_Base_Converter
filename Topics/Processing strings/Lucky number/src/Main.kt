fun main() {
    val input = readLine()!!

    val mid = input.length/2
    val front = input.substring(0,mid).map { it.toInt() }.sum()
    val back = input.substring(mid).map{ it.toInt() }.toList().sum()

   print(if(front == back) "YES" else "NO")

}