import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    var firstNum = sc.nextLine().toInt()
    firstNum -= 1
    var x = 0
    while (3 * x * (x + 1) < firstNum) {
        x += 1
    }
    println(x+1)
}