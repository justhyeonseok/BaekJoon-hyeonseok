import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()

    fun getGrade(a: Int): Int {
        return if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) 1 else 0
    }

    println(getGrade(a))
}