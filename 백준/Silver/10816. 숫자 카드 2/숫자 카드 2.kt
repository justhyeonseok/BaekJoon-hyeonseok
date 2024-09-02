import java.util.*
fun main() {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val cardCountMap = mutableMapOf<Int, Int>()
    for (i in 0..<n) {
        val card = input.nextInt()
        cardCountMap[card] = cardCountMap.getOrDefault(card, 0) + 1
    }
    val m = input.nextInt()
    val result = mutableListOf<Int>()
    for (i in 0..<m) {
        val queryCard = input.nextInt()
        result.add(cardCountMap.getOrDefault(queryCard, 0))
    }
    println(result.joinToString(" "))
}
