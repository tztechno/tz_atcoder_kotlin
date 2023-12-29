//ABC179_A
//plural

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var s = scanner.nextLine().trim()
    val n = s.length
    if (s[n-1]=='s') {
        println(s+"es")
    } else {
        println(s+"s")        
    }
}
