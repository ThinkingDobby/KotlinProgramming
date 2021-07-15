package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    if (n % 2 == 1) {
        bw.write("-1")
    } else {
        for (i in 1..n step 2) {
            bw.write("${i + 1} $i ")
        }
    }

    bw.flush()
    bw.close()
}
