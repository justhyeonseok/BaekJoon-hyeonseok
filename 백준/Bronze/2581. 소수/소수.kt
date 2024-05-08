import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val M = sc.nextInt()
    val N = sc.nextInt()

    // 에라토스테네스의 체 알고리즘을 사용하여 소수 찾기
    val isPrime = BooleanArray(N + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..Math.sqrt(N.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..N step i) {
                isPrime[j] = false
            }
        }
    }

    // M 이상 N 이하의 범위에서 소수 찾기
    val primes = mutableListOf<Int>()
    for (i in M..N) {
        if (isPrime[i]) {
            primes.add(i)
        }
    }

    // 소수의 합과 최솟값 출력
    if (primes.isEmpty()) {
        println("-1")
    } else {
        println(primes.sum())
        println(primes.minOrNull()!!)
    }
}
