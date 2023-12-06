fun main() {
    val N = readLine()?.toDoubleOrNull()!!

    if (N <= 125) {
        println(4)
    } else if (N <= 211) {
        println(6)
    } else {
        println(8)
    }
}
