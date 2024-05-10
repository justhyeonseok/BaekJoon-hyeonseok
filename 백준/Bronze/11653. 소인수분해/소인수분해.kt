import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var input = sc.nextInt()
    var i = 2
    while (i <= input) {
        if (i == input) {
            println(i)
            break
        }
        if (input % i == 0) {
            println(i)
            input /= i
        } else {
            i++
        }
    }
    if (input == 1) {
        println()
    }
}