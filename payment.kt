//abc173_a payment.kt

##############################
fun main() = println((10000 - readLine()!!.toInt()) % 1000)
##############################
fun main () {
    val n = readLine()!!.toInt()
    println((1000-n%1000) %1000)
}
##############################
fun main() {
    val (n) = readLine()!!.split(" ").map { it.toInt() }
    val result = if ((n % 1000) == 0) {
        0
    } else {
        1000 - (n % 1000)
    }
    println(result)
}
##############################
fun main() {
    val N = readLine()!!.toInt()
    val A=(1000-N%1000)%1000;
    println(A);
}
##############################
fun main(args: Array<String>) {
    val amount = readLine()!!.toInt()

    val gap = amount % 1000
    val result = if(gap > 0)  1000 - gap else 0

    println(result)
}

##############################
