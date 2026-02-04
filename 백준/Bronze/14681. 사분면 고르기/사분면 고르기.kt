import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val x = br.readLine().toInt()
    val y = br.readLine().toInt()
    if(x > 0) {
        if(y > 0) {
            println(1)
        } else {
            println(4)
        }
    } else if(x < 0) {
        if(y > 0) {
            println(2)
        } else {
            println(3)
        }
    }
}