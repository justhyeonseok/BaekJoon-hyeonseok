import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a1 = sc.nextLong()
    val a2 = sc.nextLong()
    val c = sc.nextLong()
    val n0 = sc.nextLong()
    var result = 1
    for (i in n0..100) {
        if (i * c < a1 * i + a2) {
            result = 0
            break
        }
    }
    println(result)
}