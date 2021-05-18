package codeforces.practice.year21.may.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var count = 5L
    var total = 0L
    while (true) {
        total += count
        if (total >= n) break
        count *= 2
    }
    total -= count

    var now = 0
    val space = count / 5
    while (true) {
        if (total >= n) break
        total += space
        now++
    }

    when (now) {
        1 -> bw.write("Sheldon")
        2 -> bw.write("Leonard")
        3 -> bw.write("Penny")
        4 -> bw.write("Rajesh")
        5 -> bw.write("Howard")
    }

    bw.flush()
    bw.close()
}