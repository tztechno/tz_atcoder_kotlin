abc110_a.kt
#################################
#################################
import kotlin.math.max
fun main(args: Array<String>) {
    val (a, b, c) = readIntList()
    val ans = (a+b+c)+max(a,max(b,c))*9
    println(ans)
}
fun readIntList() = readLine()!!.split(' ').map { it.toInt() }
#################################
