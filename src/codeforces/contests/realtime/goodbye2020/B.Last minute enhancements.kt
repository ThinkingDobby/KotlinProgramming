package codeforces.contests.realtime.goodbye2020

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }

        var prev = inputs[0]
        var count = 1
        for (i in 1 until inputs.size) {
            if (prev <= inputs[i]) {
                if (prev != inputs[i]) {
                    count++
                    prev = inputs[i]
                } else {
                    count++
                    prev = inputs[i] + 1
                }
            }
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}