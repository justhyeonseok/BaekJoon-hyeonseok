import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    println(if (a > b) ">" else if (a < b) "<" else "==")
}
