fun main() {
    print("Enter N: ")
    val N = readLine()!!.toInt()

    print("Enter A: ")
    val A = readLine()!!.split(" ").map { it.toInt() }

    println(N)
    println(A.joinToString(" "))
}
