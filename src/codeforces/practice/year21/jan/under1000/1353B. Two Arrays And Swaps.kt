package codeforces.practice.year21.jan.under1000

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

        val st2 = StringTokenizer(br.readLine())
        val a = Array(n) { st2.nextToken().toInt() }.sorted().toMutableList()

        val st3 = StringTokenizer(br.readLine())
        val b = Array(n) { st3.nextToken().toInt() }.sorted().toMutableList()

        var sum = 0
        var j = n
        for (i in 0 until k) {
            j--
            if (a[i] >= b[j]) break
            a[i] = b[j]
        }

        bw.write("${a.sum()}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}