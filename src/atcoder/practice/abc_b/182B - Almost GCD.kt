package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }

    val memo = Array(1001){0}
    for (i in 2..inputs.max()!!) {
        for (j in 0 until n) {
            if (inputs[j] % i == 0) memo[i]++
        }
    }

    bw.write("${memo.indexOf(memo.max())}")

    bw.flush()
    bw.close()
}