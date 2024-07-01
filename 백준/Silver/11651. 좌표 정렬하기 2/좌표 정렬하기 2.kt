import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val points: MutableList<IntArray> = ArrayList(n)

    for (i in 0..<n) {
        val x = sc.nextInt()
        val y = sc.nextInt()
        points.add(intArrayOf(x, y))
    }

    points.sortWith(Comparator.comparingInt { point: IntArray -> point[1] }.thenComparingInt { point: IntArray ->
        point[0]
    })

    for (point in points) {
        println(point[0].toString() + " " + point[1])
    }

}