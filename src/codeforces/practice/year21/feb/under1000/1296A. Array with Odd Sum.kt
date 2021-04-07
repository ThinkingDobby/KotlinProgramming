package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        var odd = false
        var even = false
        for (i in 0 until n) {
            if (st.nextToken().toInt() % 2 == 0) {
                even = true
            } else {
                odd = true
            }
        }

        if (n % 2 != 0) {
            if (odd) bw.write("YES")
            else bw.write("NO")
        } else {
            if (odd && even) bw.write("YES")
            else bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}