fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a in b..c || a in c..b) {
        print("true")
    } else print("false")

}