//abc094_a.kt
####################################
####################################
####################################
####################################
####################################
####################################
import java.util.*
import kotlin.math.*

fun readInts(): List<Int> = readLine()!!.split(" ").map { it.toInt() }
fun readInt(): Int = readLine()!!.toInt()

@OptIn(ExperimentalStdlibApi::class)
fun main(args: Array<String>) {
    val (a,b,x) = readInts()
    println(if(a <= x && x <= a + b) "YES" else "NO")
}
####################################
import kotlin.math.*
fun main(args: Array<String>) {
    val (a, b, x) = readLine()!!.split(" ").map{ it.toInt() }
    if ((a <= x) and (x <= a+b)) println("YES")
    else println("NO")
}

####################################
fun main() = println(readLine()!!.split(" ").map { it.toInt() }.let { (a, b, c) -> if (c in a..a + b) "YES" else "NO" })
####################################
fun main(args:Array<String>) {
    val (a,b,x) = readLine()!!.split(" ").map { it.toInt() }
    println(if(a<=x && x<=a+b) "YES" else "NO")
}
####################################
