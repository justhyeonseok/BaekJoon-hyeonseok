import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val input = sc.nextLine().toInt()
        val listNum = mutableListOf<Int>()
        if (input == -1) {
            break
        }
        for (i in 1..<input) {
            if (input % i == 0) {
                listNum.add(i)
            }
        }
        val sum = listNum.sum()
        if (sum == input) {
            print("$input = ")
            for (i in 0..<listNum.size - 1) {
                print("${listNum[i]} + ")
            }
            println("${listNum.last()}")
        } else {
            println("$input is NOT perfect.")
        }
    }
}
