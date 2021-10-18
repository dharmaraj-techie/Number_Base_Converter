fun main() {
    val words = readLine()!!.split(" ")
    val sortedWords = words.sortedByDescending {it.length}

    println(sortedWords[0])
}