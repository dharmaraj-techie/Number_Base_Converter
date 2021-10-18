fun main() {
    val line = readLine()
    print("Elvis says: ${line ?: throw IllegalStateException() }")
}
