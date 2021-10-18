fun main() {  
    val beyondTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()    
    // do not touch the lines above

    var result = true

    beyondTheWall.forEach {s ->
       if( ! backFromTheWall.contains(s)){
           result = false
           return@forEach
       }
    }

    println(result)


}