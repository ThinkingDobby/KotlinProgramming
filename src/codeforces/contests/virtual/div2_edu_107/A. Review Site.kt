package codeforces.contests.virtual.div2_edu_107

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())

        var up = 0
        for (i in 0 until n) {
            val temp = st.nextToken().toInt()
            if (temp == 1 || temp == 3) up++
        }

        bw.write("$up")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
