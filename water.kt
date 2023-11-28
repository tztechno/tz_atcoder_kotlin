fun main() {

    val N = readLine()?.toIntOrNull() ?: 0

    val m = N / 5
    val diff = N % 5

    val result = if (diff <= 2) {
        m * 5
    } else {
        (m + 1) * 5
    }

    println("$result")
}
