import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()
    val e = sc.nextDouble()
    val c = sc.nextDouble()
    val d = sc.nextDouble()
    val f = sc.nextDouble()
    val determinant = a * d - b * c
    if (determinant != 0.0) {
        val x = (e * d - b * f) / determinant
        val y = (a * f - e * c) / determinant

        if (x.toInt().toDouble() == x && y.toInt().toDouble() == y &&
            x >= -999 && x <= 999 && y >= -999 && y <= 999) {
            println("${x.toInt()} ${y.toInt()}")
        }
    }
}