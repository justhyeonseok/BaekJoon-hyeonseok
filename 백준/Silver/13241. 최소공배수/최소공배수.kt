import java.util.*


fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(lcm(a, b))
}

//최대공약수
fun gcd(a: Long, b: Long): Long {
    return if (b.toInt() == 0) a else gcd(b, a % b)
}

//최소공배수
fun lcm(a: Long, b: Long): Long {
    return a * b / gcd(a, b)
}