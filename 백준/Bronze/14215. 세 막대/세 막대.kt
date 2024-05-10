import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val numArray = intArrayOf(a, b, c)
    numArray.sort()
    if (numArray[2] != numArray[1] && numArray[1] != numArray[0]) {
        if (numArray[0] + numArray[1] > numArray[2]) {
            println(numArray.sum())
        } else {
            val x = numArray[0] + numArray[1]
            println(x + x - 1)
        }
    }
    if (numArray[1] == numArray[2] && numArray[0] != numArray[2]) {
        println(numArray.sum())
    }
    if (numArray[0] == numArray[1] && numArray[1] != numArray[2]) {
        val x = numArray[0] + numArray[1]
        println(x + x - 1)
    }
    if (a == b && b == c) {
        println(numArray.sum())
    }
}
