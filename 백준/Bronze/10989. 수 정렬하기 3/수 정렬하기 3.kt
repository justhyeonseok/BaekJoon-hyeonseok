import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val n = br.readLine().toInt()
    val pq = IntArray(n) { br.readLine().toInt() }
    pq.sort()
    for (i in 0..<n) {
        bw.write(pq[i].toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}