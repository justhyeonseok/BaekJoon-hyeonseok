import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val numList: MutableList<Int> = mutableListOf()
        val emptyList: MutableSet<Int> = linkedSetOf()
        for (i in 0..2) {
            numList.add(sc.nextInt())
        }
        if (numList[0] == 0) {
            break
        }
        numList.sort()
        if (numList[0] + numList[1] <= numList[2]) {
            println("Invalid")
        } else {
            for (i in 0..2) {
                emptyList.add(numList[i])
            }
            if (emptyList.size == 3) {
                println("Scalene")
            }
            if (emptyList.size == 2) {
                println("Isosceles")
            }
            if (emptyList.size == 1) {
                println("Equilateral")
            }
        }
    }
}