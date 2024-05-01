import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val matrix = mutableListOf<List<Char>>()
    for (i in 0..4) {
        var input = sc.nextLine()
        if (input.length < 15) {
            input += " ".repeat(15 - input.length)
        }
        val charList = input.toList()
        matrix.add(charList)
    }
    val newMatrix = mutableListOf<Char>()
    for (i in 0..14) {
        for (l in 0..4) {
            newMatrix.add(matrix[l][i])
        }
    }
    val result = newMatrix.joinToString(separator = "") { it.toString() }.replace(" ", "")
    println(result)
}