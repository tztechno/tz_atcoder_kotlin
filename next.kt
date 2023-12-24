#ABC329_B
#next


fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }

    // Remove duplicates and sort the list in ascending order
    val sortedUniqueList = A.distinct().sorted()

    // Check if there are at least two elements in the list
    println(sortedUniqueList[sortedUniqueList.size - 2])

    }


fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }

    // Remove duplicates and sort the list in ascending order
    val sortedUniqueList = A.distinct().sorted()

    // Check if there are at least two elements in the list
    if (sortedUniqueList.size >= 2) {
        // Print the second largest element
        println(sortedUniqueList[sortedUniqueList.size - 2])
    } else {
        println("Not enough elements in the list.")
    }
}

