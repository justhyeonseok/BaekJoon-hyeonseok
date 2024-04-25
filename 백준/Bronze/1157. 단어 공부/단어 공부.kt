import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val word = sc.next()
    val normalizedWord = word.toLowerCase()
    val frequencyMap = mutableMapOf<Char, Int>()

    normalizedWord.forEach { char ->
        if (char in 'a'..'z') {
            frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
        }
    }
    val maxFrequency = frequencyMap.maxByOrNull { it.value }?.value ?: 0
    val mostFrequentLetters = frequencyMap.filter { it.value == maxFrequency }.keys

    val result = if (mostFrequentLetters.size > 1) '?' else mostFrequentLetters.first().uppercaseChar()
    println(result)
}