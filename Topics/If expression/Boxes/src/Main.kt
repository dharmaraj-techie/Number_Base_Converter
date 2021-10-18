fun main() {
    var box1 = readLine()!!.split(" ").map{ it.toInt()}
    var box2 = readLine()!!.split(" ").map{ it.toInt()}

    box1 = box1.sorted()
    box2 = box2.sorted()


    if(box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]){
        print("Box 1 = Box 2")
    } else if(box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]){
        print("Box 1 > Box 2")
    } else if(box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]){
        print("Box 1 < Box 2")
    } else
        print("Incomparable")

}