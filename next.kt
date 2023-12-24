#ABC329_B
#next

fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }

    // Create a set B from the list A
    val B = A.toSet()

    // Convert the set back to a list to allow sorting
    val C = B.toList()

    // Sort the list C in ascending order
    C.sort()

    // Print the second largest element (index -2)
    println(C[C.lastIndex - 1]) // Access the element using lastIndex
}
