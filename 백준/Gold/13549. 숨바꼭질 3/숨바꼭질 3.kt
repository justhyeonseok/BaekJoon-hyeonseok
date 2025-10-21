import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val max = 100000
    val n = sc.nextInt()
    val k = sc.nextInt()

    val visited = IntArray(max + 1) { -1 }

    val deque: Deque<Int> = ArrayDeque()
    deque.add(n)
    visited[n] = 0

    while (deque.isNotEmpty()) {
        val x = deque.pollFirst()
        if (x == k) {
            println(visited[x])
            return
        }
        val teleport = x * 2
        if (teleport <= max && visited[teleport] == -1) {
            visited[teleport] = visited[x]
            deque.addFirst(teleport)
        }

        for (next in listOf(x - 1, x + 1)) {
            if (next in 0..max && visited[next] == -1) {
                visited[next] = visited[x] + 1
                deque.addLast(next)
            }
        }
    }
}