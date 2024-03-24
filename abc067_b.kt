abc067_b.kt
#########################################
#########################################
#########################################
#########################################
#########################################
#########################################
fun main(args: Array<String>) {

    val list = readLine()!!.split(" ").map { it.toInt() }
    val numList = readLine()!!.split(" ").map { it.toInt() }

    val sortedNumList = numList.sortedDescending()

    var summary = 0

    // LOOK indexが1ベースの場合はuntilで調整する
    for (i in 0 until list[1])
        summary += sortedNumList[i]

    println(summary)
}
#########################################
fun main() {
    fun sc() = readLine()!!.split(" ").map(String::toInt)
    val (_, k) = sc()
    val l = sc()
    println(l.sortedDescending().take(k).sum())
}
#########################################
fun main() {
    val (n, k) = readLine()!!.split(" ").map{it.toInt()}
    val l = readLine()!!.split(" ").map{it.toInt()}
    val sortedL = l.sorted().reversed()
    val ans = sortedL.take(k).sum()
    println(ans)
}
#########################################
fun main() {
    val A = readLine()!!.split(" ").map { it.toInt() }
    val L = readLine()!!.split(" ").map { it.toInt() }

    val n = A[0]
    val k = A[1]
    val sortedList = L.sortedDescending()

    println(sortedList.take(k).sum())
}
#########################################
