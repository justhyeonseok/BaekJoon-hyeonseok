import java.util.*

data class Edge(val to: Int, val weight: Int)
data class Node(val index: Int, val dist: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int = this.dist - other.dist
}

fun main() {
    val sc = Scanner(System.`in`)
    val v = sc.nextInt()
    val e = sc.nextInt()
    val k = sc.nextInt()
    val graph = Array(v + 1) { mutableListOf<Edge>() }
    repeat(e) {
        val u = sc.nextInt()
        val vv = sc.nextInt()
        val w = sc.nextInt()
        graph[u].add(Edge(vv, w))
    }
    val dist = IntArray(v + 1) { Int.MAX_VALUE }
    dist[k] = 0
    val pq = PriorityQueue<Node>()
    pq.add(Node(k, 0))
    while (pq.isNotEmpty()) {
        val current = pq.poll()
        val now = current.index
        val cost = current.dist
        if (cost > dist[now]) continue

        for (edge in graph[now]) {
            val next = edge.to
            val newCost = cost + edge.weight

            if (newCost < dist[next]) {
                dist[next] = newCost
                pq.add(Node(next, newCost))
            }
        }
    }
    for (i in 1..v) {
        if (dist[i] == Int.MAX_VALUE) println("INF")
        else println(dist[i])
    }
}