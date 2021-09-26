package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toInt() }

    var f = 0
    var s = 0
    var t = 0
    for (i in 0 until n) {
        when (i % 3) {
            0 -> f += inputs[i]
            1 -> s += inputs[i]
            else -> t += inputs[i]
        }
    }

    val max = maxOf(f, s, t)
    if (max == f) bw.write("chest")
    else if (max == s) bw.write("biceps")
    else bw.write("back")

    bw.flush()
    bw.close()
}
