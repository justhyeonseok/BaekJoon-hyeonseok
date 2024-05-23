import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    val n = scanner.nextInt()
    scanner.nextLine()
    val board = Array(m) { scanner.nextLine().trim() }
    println(calculateMinRecolor(board, m, n))
}

fun calculateMinRecolor(board: Array<String>, m: Int, n: Int): Int {
    fun countRecolor(startRow: Int, startCol: Int, startColor: Int): Int {
        var count1 = 0
        var count2 = 0
        for (i in 0..<8) {
            for (j in 0..<8) {
                val expectedColor = if ((i + j) % 2 == startColor) 'W' else 'B'
                if (board[startRow + i][startCol + j] != expectedColor) {
                    count1++
                }
                val alternativeColor = if ((i + j) % 2 == startColor) 'B' else 'W'
                if (board[startRow + i][startCol + j] != alternativeColor) {
                    count2++
                }
            }
        }
        return minOf(count1, count2)
    }
    var minRecolor = Int.MAX_VALUE
    for (i in 0..m - 8) {
        for (j in 0..n - 8) {
            minRecolor = minOf(minRecolor, countRecolor(i, j, 0), countRecolor(i, j, 1))
        }
    }
    return minRecolor
}