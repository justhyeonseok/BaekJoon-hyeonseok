import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val wordNum = sc.nextInt()
    val wordArray = Array<String>(wordNum) { "" }
    for (i in 0..<wordNum) {
        wordArray[i] = sc.next()
    }
    var result = 0
    for (word in wordArray) {
        if (isGroupWord(word)) {
            result++
        }
    }
    println(result)
}
fun isGroupWord(word: String): Boolean {
    val seen: HashSet<Char> = kotlin.collections.HashSet()
    var lastChar = word.first()
    for (char in word) {
        if (char != lastChar) {
            if (char in seen) {
                return false
            }
            seen.add(lastChar)
        }
        lastChar = char
    }
    return true
}
    