import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().split(" ").map { it.trim() }
    val a = input[0].toInt()
    val k = input[1].toInt()
    val listNum = mutableListOf<Int>()
    for (i in 1..a) {
        if (a % i == 0) {
            listNum.add(i)
        }
    }
    println(listNum.getOrNull(k - 1) ?: 0)
}
