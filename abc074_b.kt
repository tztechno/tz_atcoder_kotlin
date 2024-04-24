abc074_b.kt
#######################################
x.sumBy { minOf(it, k - it) * 2 }
x.map { Math.min(it, K - it) * 2 }.sum()
#######################################
#######################################
#######################################
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            ans += Math.min(x, k - x);
        }
        System.out.println(ans * 2);

        sc.close();
        ;
    }
}

#######################################
fun main() {
    val (_, k) = List(2) { readLine()!!.toInt() }
    val x = readLine()!!.split(" ").map(String::toInt)
    println(x.sumBy { minOf(it, k - it) * 2 })
}
#######################################
fun main(args: Array<String>) {
    val N = readLine()!!.toLong()
    val K = readLine()!!.toLong()
    val x = readLine()!!.split(" ").map { it.toLong() }

    println(
        x.map { Math.min(it, K - it) * 2 }.sum()
    )
}
#######################################
[my AC ans]
import kotlin.math.min

fun main() {
    val N = readLine()!!.toInt()
    val K = readLine()!!.toInt()
    val X = readLine()!!.split(" ").map { it.toInt() }
    var S = 0
    for (i in 0 until N) {
        S += min(X[i], K - X[i]) * 2
    }
    println(S)
}
#######################################
[my AC ans]
fun main() {
    val N = readLine()!!.toInt()
    val K = readLine()!!.toInt()
    val X = readLine()!!.split(" ").map { it.toInt() }
    var S = 0
    for (i in 0 until N) {
        S += Math.min(X[i], K - X[i]) * 2
    }
    println(S)
}
#######################################
