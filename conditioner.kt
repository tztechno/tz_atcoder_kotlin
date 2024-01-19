//abc174_a conditioner.kt

####################################
fun solve(x: Int){
    println(if (x >= 30) "Yes" else "No")
}

fun main() {
    val x = readLine()!!.toInt()
    solve(x)
}
####################################
fun main() {
    val X = readLine()!!.toInt()
    if (X>=30)
        println("Yes")
    else
        println("No")    
}
####################################
fun main() {
    val x = readLine()!!.toInt()
    val judge = x >= 30;
    val ans = if (judge) "Yes" else "No";
    println(ans);
}
####################################
