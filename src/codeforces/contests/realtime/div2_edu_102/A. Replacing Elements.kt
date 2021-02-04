package codeforces.contests.realtime.div2_edu_102

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val d = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val inputs = Array(n) { st2.nextToken().toInt() }.sorted()

        if (inputs.last() <= d) {
            bw.write("YES")
        } else {
            if (d >= inputs[0] + inputs[1]) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}