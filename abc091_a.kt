//abc091_a.kt
################################
################################
################################
################################
################################
################################
fun main() = println(readLine()!!.split(" ").map { it.toInt() }.let { if (it[0] + it[1] < it[2]) "No" else "Yes" })
################################
fun main(args:Array<String>) {
    val (a,b,c) = readLine()!!.split(" ").map { it.toInt() }
    println(if(a+b>=c) "Yes" else "No")
}

################################
fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
    println(if (a + b >= c) "Yes" else "No")
}

################################
fun main() {
    val (a,b,c)= readLine()!!.split(" ").map{it.toInt()}
    if (a+b>=c){
        println("Yes")       
    } else {
        println("No")        
    }
}
################################
