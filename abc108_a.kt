abc108_a.kt
##############################################
##############################################
##############################################
##############################################
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val odd = (n+1) / 2
    val even = n / 2
    println(odd * even)
}

##############################################
fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    val odd = k/2 + k%2
    val even = k/2
    println(odd*even)
}
##############################################
fun main(args: Array<String>) {
    val N = readLine()!!.toLong()
    val ans = (N/2)*((N+1)/2)
    println(ans)
}
##############################################
[python]
N=int(input())
print((N//2)*((N+1)//2))
##############################################
