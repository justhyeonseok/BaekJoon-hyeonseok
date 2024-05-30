import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val numArray = MutableList<Int>(input) { 0 }
    for (i in 0..<input) {
        numArray[i] = scanner.nextInt()
    }
    for (i in 0..<input) {
        numArray.sort()
        println(numArray[i])
    }
}
