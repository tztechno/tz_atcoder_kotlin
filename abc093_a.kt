//abc093_a.kt
####################################
####################################
####################################
####################################
####################################
fun main(arr:Array<String>) {
    if(readLine()!!.toList().sorted().joinToString("") == "abc") {
        println("Yes")
    } else {
        println("No")
    }
}

####################################
fun main() {
    val s = readLine()!!
    if(s.toList().sorted() == "abc".toList()) {
        println("Yes")
    } else {
        println("No")
    }
}

####################################
fun main(arr: Array<String>) {
    println(if(readLine()!!.toList().distinct().size == 3) "Yes" else "No")
}
####################################
fun main() {
    val s = readLine()!!
    if(s.contains("a") && s.contains("b") && s.contains("c")) println("Yes")
    else println("No")
}
####################################
