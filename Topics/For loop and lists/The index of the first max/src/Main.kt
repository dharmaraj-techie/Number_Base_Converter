fun main() {
    val size = readLine()!!.toInt()
    val mutList: MutableList<Int> = MutableList(size) {
        readLine()!!.toInt()
    }
     print(mutList.indexOf(mutList.maxOrNull())  )
}