import java.util.*
import kotlin.math.ceil

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().split(" ").map { it.trim() }
    val high = input[0].toDouble()
    val slide = input[1].toDouble()
    val goal = input[2].toDouble()
    val oneSearch: Double = ((goal - high) / (high - slide))
    val result = ceil(oneSearch) + 1
    println(result.toInt())
}
