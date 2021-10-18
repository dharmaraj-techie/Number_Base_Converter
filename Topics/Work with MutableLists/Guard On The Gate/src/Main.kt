fun main() {
    val backFromTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!.toString()  
    // do not touch the lines above
    backFromTheWall.add(returnedWatchman)
    print(backFromTheWall.joinToString())
}
