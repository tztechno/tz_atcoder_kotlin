//abc175_a rainy.kt

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.next()
    val DP = arrayOf(0, 0, 0, 0)

    for (i in 0 until A.length) {
        if (A[i] == 'R') {
            DP[i + 1] = DP[i] + 1
        }
    }
    println(DP.maxOrNull())
}
