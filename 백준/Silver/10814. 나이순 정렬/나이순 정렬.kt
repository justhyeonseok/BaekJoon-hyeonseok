import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val points = mutableListOf<Pair<Int, String>>()

    for (i in 0..<n) {
        val age = sc.nextInt()
        val name = sc.next()
        points.add(Pair(age, name))
    }
    points.sortBy { it.first }

    for ((age, name) in points) {
        println("$age $name")
    }
}
