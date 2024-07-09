abc081_b.kt
##########################################
##########################################
##########################################
##########################################
##########################################
fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    var count = 0
    while (list.all { it % 2 == 0 }) {
        count++
        for (i in 0 until n) {
            list[i] /= 2
        }
    }
    println(count)
}
##########################################
fun main(args: Array<String>) {
    var count = 0
    val n = readln().toInt()
    var list: MutableList<Int> = readln().split(" ").map { it.toInt() }.toMutableList()
    var isContinue = true
    while (isContinue) {
        if (list.all { it % 2 == 0 }) {
            list = list.map { it / 2 }.toMutableList()
            count++
        } else {
            isContinue = false
        }
    }
    println(count)
}
##########################################
[after fix:AC]
fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val B = A.toMutableList()
    var flag = true

    for (i in 0 until N * 10) {
        for (j in 0 until N) {
            val bj = B[j]
            if (bj % 2 == 0) {
                B[j] = bj / 2
            } else {
                println(i)
                flag = false
                break
            }
        }
        if (!flag) {
            break
        }
    }
}
##########################################
[before fix]
fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    val B = A
    val flag=1
    for (i in 0 until N*10) {    
      for (j in 0 until N) {    
        val bj=B[j]
        if (bj%2==0)
          B[j]=bj/2
        else
          println(i)
          flag=0
          break
      }
    if (flag=0){
      break
    }      
  }
}
##########################################
[python]
N=int(input())
A=list(map(int,input().split()))
B=A
for i in range(N*10):
  for j in range(N):
    bj=B[j]
    if bj%2==0:
        B[j]=bj//2
    else:
        print(i)
        exit()
##########################################
