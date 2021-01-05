package baekjoon.section16

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = Array(n) { br.readLine().toInt() }

    inputs.sort()

    var gcdTmp = inputs[1] - inputs[0]

    for (i in 2 until n) {
        gcdTmp = greatestCommonDivisor(gcdTmp, inputs[i] - inputs[i - 1])
    }

    for (i in 2..gcdTmp) {
        if (gcdTmp % i == 0) {
            bw.write("$i ")
        }
    }

    bw.flush()
    bw.close()
}

fun greatestCommonDivisor(a: Int, b: Int): Int {
    return if (b == 0) a else greatestCommonDivisor(b, a % b)
}