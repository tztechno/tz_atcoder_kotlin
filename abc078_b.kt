abc078_b.kt
#################################
#################################
private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC078B()
}

fun solveABC078B() {
    val (x, y, z) = readInts()
    var tmp = x
    var cnt = 0
    while (true) {
        if (tmp >= y + 2 * z) {
            tmp -= y + z
            cnt++
        } else {
            break
        }
    }
    println(cnt)
}
#################################
import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val X = nextInt()
    val Y = nextInt()
    val Z = nextInt()
    println((X-Z)/(Y+Z))
}
private var st = StringTokenizer("")
private val br = System.`in`.bufferedReader()

fun next(): String {
    while (!st.hasMoreTokens()) st = StringTokenizer(br.readLine())
    return st.nextToken()
}
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextLine() = br.readLine()
fun nextDouble() = next().toDouble()
#################################
import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    var (a, b, c) = readln().split(" ").map { it.toInt() }
    var res = 0
    if (a >= c) {
        a -= c
    }
    res += a / (b + c)
    println(res)
}
#################################
fun main(args: Array<String>) {
    val (X,Y,Z) = readIntList()
    println((X-Z)/(Y+Z))
}
fun readIntList() = readLine()!!.split(' ').map { it.toInt() }
#################################
[python]
X,Y,Z=map(int,input().split())
print((X-Z)//(Y+Z))
#################################
