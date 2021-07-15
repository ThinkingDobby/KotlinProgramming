package codeforces.contests.virtual.div3_710

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt()
        val input = br.readLine()

        val first = input.indexOf('*')
        val last = input.lastIndexOf('*')

        var now = first
        if (first != last) {
            var count = 2
            while (true) {
                if (now + k >= last) break
                for (i in k downTo 1) {
                    if (now + k >= last) break
                    if (input[now + i] == '*') {
                        now += i
                        if (now < last) count++
                        break
                    }
                }
            }

            bw.write("$count")
        } else {
            bw.write("1")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
