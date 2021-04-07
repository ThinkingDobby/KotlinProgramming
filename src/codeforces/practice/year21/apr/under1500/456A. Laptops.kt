package codeforces.practice.year21.apr.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        inputs.add(a to b)
    }

    inputs.sortBy { it.first }

    var ans = false
    for (i in 0 until n - 1) {
        if (inputs[i].second > inputs[i + 1].second) {
            ans = true
            break
        }
    }

    if (ans) {
        bw.write("Happy Alex")
    } else {
        bw.write("Poor Alex")
    }

    bw.flush()
    bw.close()
}