import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val colNum = input / 5
    val restNum = input % 5
    var result = -1
    if (restNum == 1) {
        if (input - 5 > 0) {
            result = colNum + 1
        }
    }
    if (restNum == 2) {
        if (input - 10 > 0) {
            result = colNum + 2
        }
    }
    if (restNum == 3) {
        result = colNum + 1

    }
    if (restNum == 4) {
        if (input - 5 > 0) {
            result = colNum + 2
        }
    }
    if (restNum == 0) {
        result = colNum
    }
    println(result)
}
