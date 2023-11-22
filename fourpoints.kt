import java.util.*

fun main() {
    val x = IntArray(3)
    val y = IntArray(3)

    for (i in 0 until 3) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        x[i] = input[0]
        y[i] = input[1]
    }

    val countX = HashMap<Int, Int>()
    val countY = HashMap<Int, Int>()

    for (i in 0 until 3) {
        countX[x[i]] = countX.getOrDefault(x[i], 0) + 1
        countY[y[i]] = countY.getOrDefault(y[i], 0) + 1
    }

    var x0 = 0
    var y0 = 0

    for (i in 0 until 3) {
        if (countX[x[i]] == 1) x0 = x[i]
        if (countY[y[i]] == 1) y0 = y[i]
    }

    println("$x0 $y0")
}
