import java.util.*

data class Node(val index: Int, val dist: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int = this.dist - other.dist
}

fun dijkstra(start: Int, graph: Array<MutableList<Pair<Int, Int>>>, n: Int): IntArray {
    val dist = IntArray(n + 1) { Int.MAX_VALUE }
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
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val e = sc.nextInt()
    val graph = Array(n + 1) { mutableListOf<Pair<Int, Int>>() }

    repeat(e) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()
        graph[a].add(Pair(b, c))
        graph[b].add(Pair(a, c))
    }

    val v1 = sc.nextInt()
    val v2 = sc.nextInt()

    val distFrom1 = dijkstra(1, graph, n)
    val distFromV1 = dijkstra(v1, graph, n)
    val distFromV2 = dijkstra(v2, graph, n)

    val path1 = safeSum(distFrom1[v1], distFromV1[v2], distFromV2[n])
    val path2 = safeSum(distFrom1[v2], distFromV2[v1], distFromV1[n])

    val result = if (path1 == Int.MAX_VALUE && path2 == Int.MAX_VALUE) -1
    else minOf(path1, path2)

    println(result)
}

fun safeSum(vararg values: Int): Int {
    return if (values.any { it == Int.MAX_VALUE }) Int.MAX_VALUE
    else values.sum()
}