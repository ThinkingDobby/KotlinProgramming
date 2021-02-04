package atcoder.practice.abc_c

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var count = 0
    for (i in 1 until n) {
        count += (n - 1) / i
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}