import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val emptyList: MutableSet<Int> = linkedSetOf()
    val numList: MutableList<Int> = mutableListOf()
    for (i in 0..2) {
        numList.add(sc.nextInt())
    }
    for (i in 0..2) {
        emptyList.add(numList[i])
    }
    if (numList.sum() == 180) {
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
    else {
        println("Error")
    }
}