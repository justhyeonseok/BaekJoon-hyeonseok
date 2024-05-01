import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    val firstNumArray = input.split(" ").map { it.trim() }
    var matrix1: Array<Array<Int>> = Array(firstNumArray[0].toInt()) { Array(firstNumArray[1].toInt()) { 0 } }
    var matrix2: Array<Array<Int>> = Array(firstNumArray[0].toInt()) { Array(firstNumArray[1].toInt()) { 0 } }
    for (i in 0..<firstNumArray[0].toInt()) {
        val nextInput = sc.nextLine().split(" ").map { it.trim() }
        for (l in 0..<firstNumArray[1].toInt()) {
            matrix1[i][l] = nextInput[l].toInt()
        }
    }
    for (i in 0..<firstNumArray[0].toInt()) {
        val nextInput = sc.nextLine().split(" ").map { it.trim() }
        for (l in 0..<firstNumArray[1].toInt()) {
            matrix2[i][l] = nextInput[l].toInt() + matrix1[i][l]
        }
    }
    for (row in matrix2) {
        println(row.joinToString(" "))
    }
}