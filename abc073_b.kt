abc073_b.kt
#######################################
#######################################
#######################################
#######################################
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val lr = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem073b(n, lr))
}

fun problem073b(n: Int, lr: List<Pair<Int, Int>>): Int {
    var sum = 0
    for (i in 0 until n) {
        sum += lr[i].second - lr[i].first + 1
    }
    return sum
}
#######################################
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println((1..n).map { -sc.nextInt() + sc.nextInt() + 1 }.sum())
}
#######################################
fun main() {
    val n = readLine()!!.toInt()
    val seats = List(n) { readLine()!!.split(" ").map(String::toLong) }
    val ans = seats.map { it[1] - it[0] + 1L }.sum()
    println(ans)
}
#######################################
fun main() {
    val n = readLine()!!.toInt()
    var t = 0
    for (i in 0 until n) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        t += r - l + 1
    }
    println(t)
}
#######################################
