fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    println(Math.pow(32.0, (A - B).toDouble()).toInt())
}
