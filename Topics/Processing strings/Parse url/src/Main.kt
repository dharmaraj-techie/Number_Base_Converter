fun main() {
    val url = readLine()!!
    val keyValues = url.split("?").drop(1).joinToString().split("&")

    var password = ""
    keyValues.forEach {
        val para = it.split("=")
        if (para[0] == "pass") password = para[1]
        println("${para[0]} : ${para[1].ifBlank { "not found" }}")
    }

    if (password.isNotBlank()) println("password : $password")
}