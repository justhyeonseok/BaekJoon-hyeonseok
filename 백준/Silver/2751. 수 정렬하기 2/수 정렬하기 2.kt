import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>()

    for (i in 0..<n) {
        pq.add(br.readLine().toInt())
    }

    val sb = StringBuilder()
    while (pq.isNotEmpty()) {
        sb.append(pq.poll()).append('\n')
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}