abc077_b.kt
##############################################
##############################################
##############################################
##############################################
fun main() = println(kotlin.math.sqrt(readLine()!!.toDouble()).toInt().let { it * it })
##############################################
import kotlin.math.sqrt
fun main() {
    val n = readLine()!!.toLong()
    val rootInt = sqrt(n.toDouble()).toInt()
    print(rootInt * rootInt)
}
##############################################
import kotlin.math.sqrt
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val m = sqrt(n.toDouble()).toInt()
    println(m * m)
}
##############################################
[python]
import math
n=int(input())
m=int(math.sqrt(n))
print(m**2)
##############################################
