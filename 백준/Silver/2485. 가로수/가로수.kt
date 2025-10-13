import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val trees = IntArray(n) { sc.nextInt() }

    val gaps = IntArray(n - 1) { i -> trees[i + 1] - trees[i] }

    var gcdValue = gaps[0]
    for (i in 1..<gaps.size) {
        gcdValue = gcd(gcdValue, gaps[i])
    }

    val totalGaps = (trees.last() - trees.first()) / gcdValue
    val result = totalGaps + 1 - n

    println(result)
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
