#kotlin
#ABC066_A
fun main() {
    val A = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    A.sort()
    print(A[0] + A[1])
}
