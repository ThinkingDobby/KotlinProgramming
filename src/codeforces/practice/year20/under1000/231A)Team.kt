package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var ans = 0

    repeat(n) {
        val st = StringTokenizer(br.readLine())

        val answers = MutableList(3) { st.nextToken().toInt() }.filter { it == 1 }
        if (answers.size > 1) ans++
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}