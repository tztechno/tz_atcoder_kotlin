//abc166_a.kt
################################
################################
################################
fun main(arr: Array<String>) {
    println(if(readLine()!! == "ABC") "ARC" else "ABC")
}
################################
fun main() {
    val s = readLine()!!
    if(s == "ABC") println("ARC")
    else println("ABC")
}
################################
fun main(args: Array<String>) {
    val s = readLine()!!
    if (s == "ABC") println("ARC")
    else println("ABC")
}
################################
### s == "ABC" ok
fun main() {
    val s = readLine()!!.toString()
    if (s == "ABC") {
        println("ARC")
    } else {
        println("ABC")
    }
}
################################
### s.equals("ABC") ok
fun main(args: Array<String>) {
    val s = readLine()!!
    if(s.equals("ABC")){
        println("ARC");
    }else{
        println("ABC");
    }
}
################################
