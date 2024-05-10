import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    val numArray1 = MutableList(0) { it }
    val numArray2 = MutableList(0) { it }
    for (i in 0..<input) {
        numArray1.add(sc.nextInt())
        numArray2.add(sc.nextInt())
    }
    val result1 = numArray1.max()
    val result2 = numArray1.min()
    val result3 = numArray2.max()
    val result4 = numArray2.min()
    println((result1 - result2) * (result3 - result4))
}