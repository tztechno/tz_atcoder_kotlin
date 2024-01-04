//ABC177_A late

fun main() {
    val (D,T,S) = readLine()!!.split(" ").map { it.toFloat() }

    if (D/S<=T) {
        println("Yes")
    } else {
        println("No")        
    }
}
