import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val firstNum = sc.nextLine().toInt()
    val num = intArrayOf(0, 0)
    var x = 0
    var count = 1
    for (i in 0..<firstNum) {
        // 오른쪽으로 1칸
        if (num[0] == 0 && count != firstNum) {
            num[1] += 1
            count += 1
            x = 1
        }
        //아래로 한칸
        if (num[1] == 0 && count != firstNum) {
            num[0] += 1
            count += 1
            x = 0
        }
        // 왼쪽아래 대각선
        if (x == 1 && count != firstNum) {
            num[0] += 1
            num[1] -= 1
            count += 1
        }
        // 오른쪽위 대각선
        if (x == 0 && count != firstNum) {
            num[0] -= 1
            num[1] += 1
            count += 1
        }
    }
    val a = num[0] + 1
    val b = num[1] + 1
    println("$a/$b")
}