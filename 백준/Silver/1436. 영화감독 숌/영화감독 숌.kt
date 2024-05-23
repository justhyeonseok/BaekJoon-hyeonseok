import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val result = mutableListOf<Int>()
    var changeNum = 666
    while (result.size < input) {
        if (contains666(changeNum)) {
            result.add(changeNum)
        }
        changeNum++
    }
    println(result[input - 1])
}

fun contains666(num: Int): Boolean {
    return num.toString().contains("666")
}