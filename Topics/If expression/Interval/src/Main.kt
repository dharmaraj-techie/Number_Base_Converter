fun main() {
    val A = readLine()!!.toInt()
    if(((-15 < A && A <= 12) || (14 < A && A <17)) || (19 <= A)){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
}