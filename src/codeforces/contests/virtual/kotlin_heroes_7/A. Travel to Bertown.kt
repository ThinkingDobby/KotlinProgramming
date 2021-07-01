package codeforces.contests.virtual.kotlin_heroes_7

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val k = st1.nextToken().toInt()

        var max = 0
        repeat(n) {
            val st2 = StringTokenizer(br.readLine())
            val l = st2.nextToken().toInt()
            val r = st2.nextToken().toInt()
            if (l <= k && k <= r) max = Math.max(max, r - k + 1)
        }

        bw.write("$max")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
