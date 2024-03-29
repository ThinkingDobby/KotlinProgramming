package atcoder.practice.abc_c

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val p = Array(201){LongArray(13){0L}}
    p[0][0] = 1
    for (i in 1 until 201) {
        for (j in 1 until 13) {
            p[i][j] = p[i - 1][j] + p[i - 1][j - 1]
        }
    }

    val n = br.readLine().toInt()

    bw.write("${p[n][12]}")

    bw.flush()
    bw.close()
}