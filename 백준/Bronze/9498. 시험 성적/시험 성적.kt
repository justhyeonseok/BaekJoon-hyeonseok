import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    fun getGrade(a: Int): String {
        return when (a) {
            in 90..100 -> "A"
            in 80..<90 -> "B"
            in 70..<80 -> "C"
            in 60..<70 -> "D"
            else -> "F"
        }
    }
    println(getGrade(a))
}
