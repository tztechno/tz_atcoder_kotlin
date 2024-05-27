abc079_b.kt
##########################################
for (i in 2..N) {
for (i in 2 until N+1) {
同じ意味になる
##########################################
val L = MutableList<Long>(N + 1) { 0 } // Long型のリストを作成
val L = MutableList(N + 1) { 0 }
##########################################
##########################################
##########################################
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val L = MutableList<Long>(N + 1) { 0 } // Long型のリストを作成
    L[0] = 2
    L[1] = 1
    for (i in 2..N) {
        L[i] = L[i - 2] + L[i - 1]
    }
    println(L[N])
}
##########################################
[WA]
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val L = MutableList(N + 1) { 0 }
    L[0] = 2
    L[1] = 1
    for (i in 2..N) {
        L[i] = L[i - 2] + L[i - 1]
    }
    println(L[N])
}
##########################################
[WA]
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val L = MutableList(N + 1) { 0 }
    L[0] = 2
    L[1] = 1
    for (i in 2 until N+1) {
        L[i] = L[i - 2] + L[i - 1]
    }
    println(L[N])
}
##########################################
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val L = MutableList(N+1) {0}
    val L[0]=2
    val L[1]=1
    for (i in 2..N) {    
        L[i]=L[i-2]+L[i-1]    
    }    
    println(L[N])
}
##########################################
[python]
N=int(input())
L=[2,1]
for i in range(N-1):
    L+=[L[-2]+L[-1]]
print(L[-1])
##########################################
