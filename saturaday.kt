fun main() {
    val S = readLine()!!.trim() 

    val name = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    val days = listOf(5, 4, 3, 2, 1)

    val mapping = name.zip(days).toMap()

    println(mapping[S])
}
