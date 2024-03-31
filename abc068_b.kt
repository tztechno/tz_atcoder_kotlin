abc068_b.kt
#########################################
#########################################
#########################################
#########################################
fun main(arr: Array<String>) {
    val n = readLine()!!.toInt()
    var cur = 1
    for(i in (1..100)) {
        if(cur*2>n) {
            break
        }
        cur *= 2
    }
    println(cur)
}

#########################################
fun main() {
    val n = readLine()!!.toInt()
    var max = 1
    while (max <= n / 2) {
        max *= 2
    }
    println(max)
}
#########################################
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val list = listOf<Int>(1, 2, 4, 8, 16, 32, 64)

    var ans = 0
    for (a in list) {
        if (N >= a) {
            ans = a
        } else {
            break
        }
    }
    println(ans)
    
}
#########################################
fun main() {
    val N = readln().toInt()
    var ans = 1
    while (ans * 2 <= N) ans *= 2
    println(ans)
} 

#########################################
fun main() {
    val n = readLine()!!.toInt()
    var ans = 0
    var i = 0
    while (Math.pow(2.0, i.toDouble()) <= n) {
        ans = Math.pow(2.0, i.toDouble()).toInt()
        i++
    }
    println(ans)
}
#########################################
