package atcoder.practice.abc_c

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val tmp = Math.pow(2.0, n.toDouble()).toInt()

    val st = StringTokenizer(br.readLine())
    val players = Array(tmp) { st.nextToken().toInt() }

    val ans = Math.min(players.slice(0 until tmp / 2).max()!!, players.slice(tmp / 2 until tmp).max()!!)

    bw.write("${players.indexOf(ans) + 1}")

    bw.flush()
    bw.close()
}