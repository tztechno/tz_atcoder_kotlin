//ABC192_B lowerupper

##################################################


##################################################


##################################################
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val S = scanner.next()
    var U = ""
    var L = ""
    var U2 = ""
    var L2 = ""
    val n = S.length

    for (i in 0 until n) {
        if (i % 2 == 0) {
            L += S[i]
            L2 += S[i].toLowerCase()
        } else {
            U += S[i]
            U2 += S[i].toUpperCase()
        }
    }

    if (U == U2 && L == L2) {
        println("Yes")
    } else {
        println("No")
    }
}
##################################################
