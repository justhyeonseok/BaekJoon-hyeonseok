import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val matrix: Array<Array<Int>> = Array(100) { Array(100) { 0 } }
    val inputInt = sc.nextLine().toInt()
    for (i in 0..<inputInt) {
        val input = sc.nextLine().split(" ")
        for (l in input[0].toInt()..input[0].toInt() + 9) {
            for (j in input[1].toInt()..input[1].toInt() + 9) {
                matrix[j][l] = 1
            }
        }
    }
    val count = matrix.flatten().count { it == 1 }
    println(count)
}