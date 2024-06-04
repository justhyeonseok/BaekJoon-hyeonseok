import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val numArray = MutableList(5) { 0 }
    for (i in 0..4) {
        numArray[i] = sc.nextInt()
    }
    val firstResult = numArray.sum() / 5
    val secondResult = numArray.sorted()
    println(firstResult)
    println(secondResult[2])
}