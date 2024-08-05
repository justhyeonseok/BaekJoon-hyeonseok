fun main() {
    val reader = System.`in`.bufferedReader()
    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    val pokemonByName = mutableMapOf<String, Int>()
    val pokemonByNumber = mutableListOf<String>()
    for (i in 1..n) {
        val name = reader.readLine()
        pokemonByName[name] = i
        pokemonByNumber.add(name)
    }

    val output = StringBuilder()
    repeat(m) {
        val question = reader.readLine()
        if (question[0].isDigit()) {
            // 숫자인 경우
            val number = question.toInt()
            output.append(pokemonByNumber[number - 1]).append("\n")
        } else {
            // 문자인 경우
            output.append(pokemonByName[question]).append("\n")
        }
    }
    print(output)
}
