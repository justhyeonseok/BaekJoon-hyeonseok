import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextLine().toInt()
    val b = input.nextLine()
    val r = b.toInt()
    val arrayB = b.map { it.toString().toInt() }.toIntArray()
    println("${arrayB[2] * a}")
    println("${arrayB[1] * a}")
    println("${arrayB[0] * a}")
    println(a * r)
}
