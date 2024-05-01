import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    var plusNum: Double = 0.0
    var sqrtNum: Double = 0.0
    val gradeToPoint = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0
    )
    for (i in 0..<20) {
        val input = sc.nextLine()
        val majorGpa = input.split(" ").map { it.trim() }
        if (majorGpa[2] != "P") {
            val gradeNum = gradeToPoint.getValue(majorGpa[2])
            plusNum += majorGpa[1].toDouble()
            sqrtNum += majorGpa[1].toDouble() * gradeNum
        } else {
            continue
        }
    }
    println(sqrtNum / plusNum)
}