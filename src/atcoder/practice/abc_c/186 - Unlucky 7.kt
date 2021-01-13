package atcoder.practice.abc_c

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var count = 0
    for (i in 1..n) {
        if ('7' in i.toString(8) || '7' in i.toString()) count++
    }

    bw.write("${n - count}")

    bw.flush()
    bw.close()
}