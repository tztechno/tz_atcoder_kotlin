fun main() {

    val inputStr = readLine()
    val inputVals = inputStr?.split(' ')?.map { it.toIntOrNull() }

    if (inputVals != null && inputVals.size == 2) {

        val A = inputVals[0] ?: 0
        val B = inputVals[1] ?: 0

        val ADigits = A.toString().map { it.toString().toInt() }
        val BDigits = B.toString().map { it.toString().toInt() }

        val sumADigits = ADigits.sum()
        val sumBDigits = BDigits.sum()

        val ansValue = maxOf(sumADigits, sumBDigits)

        println(ansValue)
    } else {
        println("Invalid input. Please enter two space-separated numbers.")
    }
}
