fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }

    if (A.toSet().size == 1) {
        println("Yes")
    } else {
        println("No")
    }
}
