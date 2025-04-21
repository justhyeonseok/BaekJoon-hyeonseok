fun main() {
    val s = readln()
    val substrings = mutableSetOf<String>()

    for (i in s.indices) {
        for (j in i + 1..s.length) {
            val sub = s.substring(i, j)
            substrings.add(sub)
        }
    }

    println(substrings.size)
}