fun main() {
    val s = readLine()!!
    print(
        if (s.reversed() == s)
            "yes"
        else
            "no"
    )
}