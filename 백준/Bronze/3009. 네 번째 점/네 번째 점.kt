import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    val f = sc.nextInt()
    val numbers1 = arrayOf(a, c, e)
    val numbers2 = arrayOf(b, d, f)
    val frequencyMap1 = numbers1.groupBy { it }.mapValues { it.value.size }
    val frequencyMap2 = numbers2.groupBy { it }.mapValues { it.value.size }
    val x = frequencyMap1.filter { it.value == 1 }.keys.first()
    val y = frequencyMap2.filter { it.value == 1 }.keys.first()
    println("$x $y")
}