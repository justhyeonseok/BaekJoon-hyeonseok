import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val word = sc.next()
    val croatianLetters = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var count = 0
    var i = 0
    while (i < word.length) {
        when {
            i + 2 < word.length && word.substring(i, i + 3) in croatianLetters -> {
                count++
                i += 3
            }
            i + 1 < word.length && word.substring(i, i + 2) in croatianLetters -> {
                count++
                i += 2
            }
            else -> {
                count++
                i++
            }
        }
    }
    println(count)
}