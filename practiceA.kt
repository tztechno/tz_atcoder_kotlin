//practiceA.kt
##################################
1
2 3
test
##################################
##################################
##################################
##################################
##################################
##################################
##################################
##################################
fun main() {
    val a = readln().toInt()
    val b = readln().split(" ").map { it.toInt() }
    val c = readln()
    
    println("${a+b[0]+b[1]} $c")
}
##################################
fun main() {
    val a = readln().toInt()
    val b = readln().split(" ").map { it.toInt() }
    val c = readln()
    
    println("${a + b.sum()} $c")
}
##################################
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val a: Int = sc.nextInt()
    val b: Int = sc.nextInt()
    val c: Int = sc.nextInt()
    val s: String = sc.next()
    println("${a + b + c} $s")
}
##################################
fun main() {
  val a = readLine()?.toInt() ?: 0
  val list = readLine()?.split(" ")?.map(String::toInt) ?: listOf()
  val b = if (list.size >= 1) {
    list[0]
  } else {
    0
  }
  val c = if (list.size >= 2) {
    list[1]
  } else {
    0
  }
  val s = readLine()
  
  println((a + b + c).toString() + " "+ s)
}
##################################
