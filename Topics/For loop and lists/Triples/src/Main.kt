fun main() {
    val size = readLine()!!.toInt()
    val mutList: MutableList<Int> = MutableList(size) {
        readLine()!!.toInt()
    }
    var numberOfTriplets = 0

    for(index in 0 until mutList.lastIndex - 1){
       if(mutList[index] + 1 == mutList[index + 1] && mutList[index + 1] + 1 == mutList[index + 2]){
           numberOfTriplets++
       }
    }

    print(numberOfTriplets)

}