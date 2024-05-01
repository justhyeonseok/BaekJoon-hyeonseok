import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    var matrix: Array<Array<Int>> = Array(9) { Array(9) { 0 } }
    for (i in 0..<9){
        val nextInput = sc.nextLine().split(" ").map { it.trim() }
        for (l in 0..<9) {
            matrix[i][l] = nextInput[l].toInt()
        }
    }
    var maxValue = 0
    var maxRow = 0
    var maxCol = 0
    for (i in 1..9) {
        for (j in 1..9) {
            if (matrix[i - 1][j - 1] >= maxValue) {
                maxValue = matrix[i - 1][j - 1]
                maxRow = i
                maxCol = j
            }
        }
    }
    println(maxValue)
    println("$maxRow $maxCol")
}