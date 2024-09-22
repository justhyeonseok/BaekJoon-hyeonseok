import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextLine()
    val arrayA = a.split(" ").map { it.toLong() }.toLongArray()
    println("${arrayA[0] + arrayA[1] + arrayA[2]}")
}
