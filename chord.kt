import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()

    val name = arrayOf("ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD")

    if (s in name) {
        println("Yes")
    } else {
        println("No")
    }
}
