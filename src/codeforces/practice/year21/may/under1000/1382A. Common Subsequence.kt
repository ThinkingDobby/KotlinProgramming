package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val m = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val a = Array(n) { st2.nextToken().toInt() }

        val st3 = StringTokenizer(br.readLine())
        val b = Array(m) { st3.nextToken().toInt() }

        var ans = false
        for (i in a) {
            if (i in b) {
                ans = true
                bw.write("YES")
                bw.newLine()
                bw.write("1 $i")
                break
            }
        }

        if (!ans) {
            bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}