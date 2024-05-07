import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val smallNum = MutableList(999) { it + 2 }
    var currentIndex = 0
    while (currentIndex < smallNum.size) {
        val currentNumber = smallNum[currentIndex]
        var multipleIndex = currentIndex + currentNumber
        while (multipleIndex < smallNum.size) {
            if (smallNum[multipleIndex] % currentNumber == 0) {
                smallNum.removeAt(multipleIndex)
                multipleIndex--
            }
            multipleIndex++
        }
        currentIndex++
    }
    val input = sc.nextLine().toInt()
    val numArray = sc.nextLine().split(" ").map { it.trim() }
    var count = 0
    for (i in 0..<input) {
        if (smallNum.contains(numArray[i].toInt())) {
            count++
        }
    }
    println(count)
}
