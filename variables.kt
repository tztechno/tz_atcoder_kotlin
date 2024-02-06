//abc170_a variables.kt
#####################################
fun main() = println(readLine()!!.split(" ").indexOf("0") + 1)
#####################################
fun readInts() = readLine()!!.split(' ').map(String::toInt)
fun main() {
	val x = readInts()
	println(x.indexOf(0) + 1)
}
#####################################
fun main() {
    val result = readLine()!!.split(" ").map { it.toInt() }
        .mapIndexed { i, v -> if(v == 0) { i+1 } else { 0 } }
        .filter { it > 0 }
        .first()
    println(result)
}
#####################################
import kotlin.math.*
import java.util.*
fun main(args : Array<String>) {
    var x = readLine()!!.split(" ").map{it.toInt()}
    for(i in 0..4){
        if(x[i] == 0)println(i+1)
    }
}
#####################################
fun main() {
    val X = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0 until 5) {
        if (X[i]==0){
            println(i+1)      
    }
  }
}
#####################################
