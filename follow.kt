//ABC182_A
//Follow
//input= 200 300

fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val XB = 2*A+100   
    println(XB-B)
}
