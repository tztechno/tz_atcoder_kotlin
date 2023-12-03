import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    //print("Enter a value for S: ")
    val S = scanner.next()

    if (S.length >= 2 && S.endsWith("er")) {
        println("er")
    } else {
        println("ist")
    }

    scanner.close()
}
