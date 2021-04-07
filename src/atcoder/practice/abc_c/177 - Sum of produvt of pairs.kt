package atcoder.practice.abc_c

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val mod = 1_000_000_007

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toLong() }
    val sumArray = Array(n + 1){0L}

    for (i in n - 1 downTo 0) {
        sumArray[i] = (sumArray[i + 1] + inputs[i]) % mod
    }

    var sum = 0L
    for (i in 0 until n - 1) {
        sum = (sum + inputs[i] * sumArray[i + 1]) % mod
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}