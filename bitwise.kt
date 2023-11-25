fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0 until 256) {
        if ((A xor i) == B) {
            println(i)
            break
        }
    }
}
