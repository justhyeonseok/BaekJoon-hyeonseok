import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val word = sc.next()
    val arrayWord = word.split("")
    var result = 1
    val n = arrayWord.size - 2
    for(l in 1..n / 2) {
        if(arrayWord[l] != arrayWord[n - l + 1]) {
            result = 0
        }
    }
    println(result)
}

    