import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    val digits = input.map { it.toString().toInt() }.toIntArray()
    digits.sortDescending()
    val number = digits.joinToString("").toInt()

    println(number)
}
