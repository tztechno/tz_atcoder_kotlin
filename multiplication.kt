//abc169_a multiplication.kt
################################
################################
fun main() {
  val (a, b) = readLine()!!.split(" ").map { it.toInt() }
  println(a * b)
}
################################
fun main(args: Array<String>) {
  val (a: Int, b: Int) = readLine()!!.split(" ").map { it.toInt() }
  val result: Int = a * b
  println(result)
}
################################
fun main(arr: Array<String>) {
    println(readLine()!!.split(" ").map { it.toInt() }.let { it[0] * it[1] })
}
################################
import kotlin.math.*
import java.util.*
fun main(args : Array<String>) {
    var x = readLine()!!.split(" ").map{it.toInt()}
    println(x[0]*x[1])
}
################################
