fun main() {
    val (string , n) = readLine()!!.split(" ")

    if(string.length > n.toInt()){
        val s = string.substring(n.toInt())
        val a = string.substringBefore(s)
        println(s+a)
    }else{
        println(string)
    }


}