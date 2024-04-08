abc070_b.kt
##############################
maxOf(0, minOf(b, d) - maxOf(a, c))
import kotlin.math.max
import kotlin.math.min
##############################
##############################
##############################
##############################
##############################
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    val (a, b, c ,d) = readIntList()
    val ans = min(b, d) - max(a, c)
    println(if (ans > 0) ans else 0)
}

fun readIntList() = readLine()!!.split(' ').map { it.toInt() }
##############################
import kotlin.math.max
import kotlin.math.min

// https://atcoder.jp/contests/abc070/tasks/abc070_b
fun main() {
    refactored()
}

private fun refactored() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    val start = max(a, c)
    val end = min(b, d)

    print(max(0, end - start))
}
##############################
fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map{ it.toInt() }
    val t = maxOf(0, minOf(b, d) - maxOf(a, c))
    println(t)
}
##############################
