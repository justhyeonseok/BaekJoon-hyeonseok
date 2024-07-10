fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val company = mutableSetOf<String>()

    repeat(n) {
        val (name, action) = br.readLine().split(" ")
        when (action) {
            "enter" -> company.add(name)
            "leave" -> company.remove(name)
        }
    }

    val sortedNames = company.sortedDescending()
    for (name in sortedNames) {
        println(name)
    }
}
