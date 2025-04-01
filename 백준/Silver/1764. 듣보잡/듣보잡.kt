

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val unheardSet = mutableSetOf<String>()
    repeat(n) { unheardSet.add(br.readLine()) }

    val unseenSet = mutableSetOf<String>()
    repeat(m) { unseenSet.add(br.readLine()) }

    val result = unheardSet.intersect(unseenSet).sorted()
    println(result.size)
    result.forEach { println(it) }
}
