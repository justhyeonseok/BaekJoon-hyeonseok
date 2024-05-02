import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val firstNum = sc.nextLine().toInt()
    for (i in 0..<firstNum) {
        val input = sc.nextLine().toInt()
        val a = input / 25
        val b = input % 25 / 10
        val c = input % 25 % 10 / 5
        val d = input % 25 % 10 % 5 / 1
        println("$a $b $c $d")
    }
}