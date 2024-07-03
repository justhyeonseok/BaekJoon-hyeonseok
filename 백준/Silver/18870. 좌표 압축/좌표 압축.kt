import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val numbers = List(n) { sc.nextInt() }
    println(coordinateCompression(numbers).joinToString(" "))
}

fun coordinateCompression(coordinates: List<Int>): List<Int> {
    val sortedCoordinates = coordinates.toSortedSet().toList()
    val compressionMap = sortedCoordinates.mapIndexed { index, value -> value to index }.toMap()
    return coordinates.map { compressionMap[it]!! }
}
