abc072_b.kt
######################################
######################################
######################################
######################################
######################################
fun main(args: Array<String>) {
    solveABC072B()
}

fun solveABC072B() {
    val s = readLine()!!

    var result = ""
    for (i in s.indices) {
        val no = i + 1
        if (no % 2 == 0) {
            continue
        } else {
            result += s[i]
        }
    }

    println(result)
}

######################################
fun main(arr:Array<String>) {
    val s = readLine()!!
    println(s.indices.filter { it%2==0 }.map { s[it] }.joinToString(""))
}
######################################
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println(sc.next().filterIndexed{idx,ch -> idx % 2 == 0})
}
######################################
fun main(args: Array<String>){
    val s = readLine()!!
    var ans = ""
    var i = 0
    while (i < s.length){
        ans += s[i]
        i += 2
    }
    println(ans)
}
######################################
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    var a = ""
    for (i in 0 until s.length step 2) {
        a += s[i]
    }
    println(a)
}
######################################
