package baekjoon.section17

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var countTwo = 0
    var countFive = 0
    for (i in 1..n) {
        countTwo += factorizationWithTwo(i)
        countFive += factorizationWithFive(i)
    }

    bw.write("${Math.min(countTwo, countFive)}")

    bw.flush()
    bw.close()
}

fun factorizationWithTwo(_n: Int): Int {
    var n = _n
    var count = 0
    while(true) {
        if (n % 2 == 0) {
            n /= 2
            count++
        } else {
            break
        }
    }
    return count
}

fun factorizationWithFive(_n: Int): Int {
    var n = _n
    var count = 0
    while(true) {
        if (n % 5 == 0) {
            n /= 5
            count++
        } else {
            break
        }
    }
    return count
}