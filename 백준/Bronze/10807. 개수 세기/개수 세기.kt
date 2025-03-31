import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = IntArray(a) { input.nextInt() }
    val c = input.nextInt()
    var answer = 0
    for (i in 0..<a) {
        if (b[i] == c) {
            answer += 1
        }
    }
    println(answer)
}