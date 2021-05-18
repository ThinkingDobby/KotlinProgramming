package codeforces.practice.year21.may.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = Array(n) { br.readLine() }
    val first = inputs[0]
    var second = "0"
    var firstCount = 0
    var secondCount = 0
    for (i in inputs) {
        if (i == first) firstCount++
        else {
            second = i
            secondCount++
        }
    }

    if (firstCount > secondCount) bw.write(first)
    else bw.write(second)

    bw.flush()
    bw.close()
}