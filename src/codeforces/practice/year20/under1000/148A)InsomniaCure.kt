package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toInt()
    val l = br.readLine().toInt()
    val m = br.readLine().toInt()
    val n = br.readLine().toInt()
    val d = br.readLine().toInt()

    var count = d
    for (i in 1..d) {
        if (i % k == 0) continue
        else if (i % l == 0) continue
        else if (i % m == 0) continue
        else if (i % n == 0) continue
        else count--
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}