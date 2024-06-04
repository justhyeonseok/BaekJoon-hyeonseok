import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val firstInput = sc.nextInt()
    val secondInput = sc.nextInt()
    val numArray = MutableList(firstInput) { 0 }
    for (i in 0..<firstInput) {
        numArray[i] = sc.nextInt()
    }
    val result = numArray.sortedDescending()
    println(result[secondInput - 1])
}