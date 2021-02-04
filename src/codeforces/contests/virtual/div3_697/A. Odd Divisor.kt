package codeforces.contests.virtual.div3_697

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toLong()
        val tmp = n.toString(2)
        if (tmp.count{it == '1'} == 1) {
            bw.write("NO")
        } else {
            bw.write("YES")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}