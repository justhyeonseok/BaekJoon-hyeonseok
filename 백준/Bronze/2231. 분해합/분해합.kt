import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    var found = false
    for (i in 0..10000000) {
        var sum = i
        val digits = i.toString().map { it.toString().toInt() } // 문자열을 숫자 리스트로 변환
        for (digit in digits) {
            sum += digit
        }
        if (sum == a) {
            println(i)
            found = true
            break
        }
    }
    if (!found) {
        println(0)
    }
}
