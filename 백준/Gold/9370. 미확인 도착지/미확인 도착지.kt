import java.io.*
import java.util.*

data class Node(val index: Int, val dist: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int = this.dist.compareTo(other.dist)
}

fun dijkstra(start: Int, graph: Array<MutableList<Pair<Int, Int>>>, n: Int): IntArray {
    val dist = IntArray(n + 1) { Int.MAX_VALUE } // 각 배열의 순서가 정점이 되고, 그 정점들의 값이 가장 작은 값으로 최신화됨
    val pq = PriorityQueue<Node>()
    dist[start] = 0
    pq.add(Node(start, 0))

    while (pq.isNotEmpty()) {
        val (now, cost) = pq.poll().let { it.index to it.dist }
        if (cost > dist[now]) continue

        for ((next, weight) in graph[now]) {
            val newCost = cost + weight
            if (newCost < dist[next]) {
                dist[next] = newCost
                pq.add(Node(next, newCost))
            }
        }
    }
    return dist
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val testCase = br.readLine().toInt()
    repeat(testCase) {
        var st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()
        val targetCount = st.nextToken().toInt()

        st = StringTokenizer(br.readLine())
        val s = st.nextToken().toInt()
        val g = st.nextToken().toInt()
        val h = st.nextToken().toInt()
        val graph = Array(n + 1) { mutableListOf<Pair<Int, Int>>() }
        repeat(m) {
            st = StringTokenizer(br.readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            val d = st.nextToken().toInt()
            graph[a].add(b to d)
            graph[b].add(a to d)
        }
        val targets = mutableListOf<Int>()
        repeat(targetCount) {
            targets.add(br.readLine().toInt())
        }
        val distFromS = dijkstra(s, graph, n)
        val distFromG = dijkstra(g, graph, n)
        val distFromH = dijkstra(h, graph, n)
        val validTargets = mutableListOf<Int>()

        for (dest in targets) {
            val path1 = distFromS[g] + distFromG[h] + distFromH[dest]
            val path2 = distFromS[h] + distFromH[g] + distFromG[dest]
            val shortest = distFromS[dest]

            if (shortest == path1 || shortest == path2) {
                validTargets.add(dest)
            }
        }

        validTargets.sort()
        sb.append(validTargets.joinToString(" ")).append("\n")
    }

    print(sb)

}