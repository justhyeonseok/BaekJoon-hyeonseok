import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    println((a + b) % c)
    println(((a % c) + (b % c)) % c)
    println((a * b) % c)
    println(((a % c) * (b % c)) % c)
}
