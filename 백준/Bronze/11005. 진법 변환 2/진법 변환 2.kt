import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val num = sc.nextLine()
    val nunNum = num.split(" ").map { it.trim() }
    val result = nunNum[0].toInt().toString(nunNum[1].toInt()).uppercase(Locale.getDefault())
    println(result)
}