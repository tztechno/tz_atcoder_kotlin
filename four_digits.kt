import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var s = scanner.nextLine().trim()
    val n = s.length
    if (n < 4) {
        s = s.padStart(4, '0')
    }
    println(s)
}
