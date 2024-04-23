import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (l in 0..<n) {
        println(" ".repeat(n - l - 1) + "*".repeat(2 * l + 1))
    }
    for (l in 1..<n) {
        println(" ".repeat(l) + "*".repeat(2 * n - 2 * l - 1))
    }
}