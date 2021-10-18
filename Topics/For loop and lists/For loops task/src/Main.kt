fun main() {
    val size = readLine()!!.toInt()
    val mutList: MutableList<Int> = MutableList(size) {
        readLine()!!.toInt()
    }
    val m = readLine()!!.split(" ").map {
        it.toInt()
    }.toMutableList()

    println(
        if (mutList.containsAll(m))
            "YES"
        else
            "NO"
    )
}