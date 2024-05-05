import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val input = sc.nextLine()
        if (input == "0 0") {
            break
        }
        val styleInput = input.split(" ").map { it.trim() }
        if (styleInput[1].toInt() % styleInput[0].toInt() == 0) {
            println("factor")
        } else if (styleInput[0].toInt() % styleInput[1].toInt() == 0) {
            println("multiple")
        } else {
            println("neither")
        }
    }
}
