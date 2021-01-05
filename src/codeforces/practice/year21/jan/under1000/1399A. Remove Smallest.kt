package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }.sorted()

        var ans = true
        for (i in 1 until inputs.size) {
            if (Math.abs(inputs[i] - inputs[i - 1]) > 1) {
                ans = false
                break
            }
        }

        if (ans) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}