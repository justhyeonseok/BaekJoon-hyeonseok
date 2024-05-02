import java.util.*
import kotlin.math.pow
fun main() {
    val sc = Scanner(System.`in`)
    val firstNum = sc.nextLine().toInt()
    val result: Double = (1.0 + (2.0).pow(firstNum.toDouble())).pow(2)
    println(result.toInt())
}