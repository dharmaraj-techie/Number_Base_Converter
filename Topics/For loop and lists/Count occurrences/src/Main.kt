fun main() {
    val size = readLine()!!.toInt()
    val mutList: MutableList<Int> = MutableList(size) {
        readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()

    var n = 0
    mutList.forEach {
        if(it == m)
            n++
    }
    print(n)
}