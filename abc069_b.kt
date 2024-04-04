abc069_b.kt
#########################################
#########################################
#########################################
#########################################
fun main() {
    val s = readLine()!!.toString()
    val num = s.length
    println( s.substring(0,1) + (num-2) + s.substring(s.length-1) )
}
#########################################
fun main() = println(readLine()!!.let { "${it.first()}${it.length - 2}${it.last()}" })
#########################################
fun main(){
    val s = readLine()!!;
   	val res = "${s.first()}${s.length-2}${s.last()}";
    println(res);
}
#########################################
fun main(args: Array<String>){
	readLine()!!.toList().let {
		println(it[0].toString() +(it.size - 2).toString() + it[it.size-1].toString())
    }
}
#########################################
fun main() {
    val s = readLine()!!
    val n = s.length
    println("${s[0]}${n-2}${s[n-1]}")
}
#########################################
