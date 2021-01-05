package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val inputs = Array(n){st.nextToken().toInt()}

    var ans = 0
    if (inputs.count {it % 2 == 0} > 1) inputs.forEachIndexed { idx, value -> if (value % 2 != 0) ans = idx }
    else inputs.forEachIndexed { idx, value -> if (value % 2 == 0) ans = idx }

    bw.write("${ans + 1}")

    bw.flush()
    bw.close()
}