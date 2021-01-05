package codeforces.practice.year20.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val luckyNumber = arrayOf(4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777)
    val n = br.readLine().toInt()

    var ans = false
    for (i in luckyNumber.indices) {
        if (n % luckyNumber[i] == 0) {
            ans = true
            break
        }
    }

    if (ans) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}