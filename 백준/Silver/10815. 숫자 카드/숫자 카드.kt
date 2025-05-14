import java.util.*


fun main() {
    readln()
    val nCards = readln().split(" ").map { it.toInt() }.toSet()
    readln()
    val mQueries = readln().split(" ").map { it.toInt() }
    val result = mQueries.map { if (it in nCards) 1 else 0 }
    println(result.joinToString(" "))
}

