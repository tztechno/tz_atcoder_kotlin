fun main() {
    print("Enter a floating-point number: ")
    val X = readLine()?.toDoubleOrNull()

    if (X != null) {
        val a = (X * 10).toInt()

        when {
            a % 10 >= 5 -> println(X.toInt() + 1)
            a % 10 <= 4 -> println(X.toInt())
        }
    } else {
        println("Invalid input. Please enter a valid floating-point number.")
    }
}
