import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val numArray: MutableList<Int> = mutableListOf()
    for (i in 0..<a) {
        numArray.add(sc.nextInt())
    }
    val resultArray: MutableList<Int> = mutableListOf()
    for (i in 0..<numArray.size) {
        var sum = 0
        for (j in (i + 1)..<numArray.size) {
            for (k in (j + 1)..<numArray.size) {
                val currentNum = numArray[i] + numArray[j] + numArray[k]
                if (currentNum <= b) {
                    resultArray.add(currentNum)
                }
            }
        }
    }
    println(resultArray.max())
}