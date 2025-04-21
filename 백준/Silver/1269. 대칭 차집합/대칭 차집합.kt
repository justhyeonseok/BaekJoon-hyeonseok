fun main() {
    val (aSize, bSize) = readln().split(" ").map { it.toInt() }

    val aSet = readln().split(" ").map { it.toInt() }.toSet()
    val bSet = readln().split(" ").map { it.toInt() }.toSet()

    val symmetricDiff = (aSet - bSet) + (bSet - aSet)

    println(symmetricDiff.size)
}