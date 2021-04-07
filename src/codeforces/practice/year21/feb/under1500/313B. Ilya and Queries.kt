package codeforces.practice.year21.feb.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val memo = Array(input.length + 1) { 0 }
    for (i in 1 until memo.size) {
        if (i == input.length) memo[i] = memo[i - 1]
        else memo[i] = memo[i - 1] + if (input[i - 1] == input[i]) 1 else 0
    }
    val m = br.readLine().toInt()
    for (i in 0 until m) {
        val st = StringTokenizer(br.readLine())
        val l = st.nextToken().toInt() - 1
        val r = st.nextToken().toInt() - 1

        val count = memo[r] - memo[l]

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}