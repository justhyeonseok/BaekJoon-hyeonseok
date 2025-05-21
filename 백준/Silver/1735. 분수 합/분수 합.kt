import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    var x = a * d + b * c
    var y = b * d

    val gcdValue = gcd(x, y)
    x /= gcdValue
    y /= gcdValue

    println("$x $y")
}

// 최대공약수 구하기 (유클리드 호제법)
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

