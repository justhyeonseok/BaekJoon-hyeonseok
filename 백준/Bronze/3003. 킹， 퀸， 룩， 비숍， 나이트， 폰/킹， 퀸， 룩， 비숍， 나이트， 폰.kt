import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val array = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val resultArray = intArrayOf(1,1,2,2,2,8)
    
    for(l in array.indices) {
        array[l] = resultArray[l] - array[l]
    }
    println(array.joinToString(" "))
}
