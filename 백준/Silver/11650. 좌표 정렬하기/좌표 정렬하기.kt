import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val points = Array(n) { IntArray(2) }
    for (i in 0..<n) {
        points[i][0] = sc.nextInt()
        points[i][1] = sc.nextInt()
    }
    points.sortWith(compareBy({ it[0] }, { it[1] }))
    for (point in points) {
        println("${point[0]} ${point[1]}")
    }
}
