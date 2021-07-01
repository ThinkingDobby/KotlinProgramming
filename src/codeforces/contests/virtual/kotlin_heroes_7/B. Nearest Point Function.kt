package codeforces.contests.virtual.kotlin_heroes_7

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())

        var prev = st.nextToken().toLong()
        var crash = false

        for (i in 1 until n) {
            val temp = st.nextToken().toLong()
            if ((prev + temp) % 2 == 0L) {
                crash = true
                break
            }
            prev = temp
        }

        if (crash) bw.write("YES")
        else bw.write("NO")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}