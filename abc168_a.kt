//abc168_a.kt
################################
if (a in listOf(2, 4, 5, 7, 9))
if (listOf(0,1,6,8).contains(n)) 
both ok
################################
################################
fun main() = println(readLine()!!.last().let {
    when (it - '0') {
        0, 1, 6, 8 -> "pon"
        3 -> "bon"
        else -> "hon"
    }
})
################################
fun main() {
    val n = readLine()!!.toCharArray().last().toString().toInt()
    if(n == 3) println("bon")
    else if(listOf(0,1,6,8).contains(n)) println("pon")
    else println("hon")
}
################################
fun main() {
    val n = readLine()!!.toInt()
    var place = n

    if (n > 10) place = n % 10

    if (place == 2 || place == 4 || place == 5 || place == 7 || place == 9) {

        println("hon")

    } else if (place == 0 || place == 1 || place == 6 || place == 8) {
        println("pon")
    } else if (place == 3) {
        println("bon")
    }
}
################################
fun main(args: Array<String>) {
    val s = readLine()!!
    val a = s.last().toString().toInt()

    if (a in listOf(2, 4, 5, 7, 9))
        println("hon")
    else if (a in listOf(0, 1, 6, 8))
        println("pon")
    else
        println("bon")
}
################################
