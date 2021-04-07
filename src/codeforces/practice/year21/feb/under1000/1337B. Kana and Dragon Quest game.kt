package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        var x = st.nextToken().toInt()
        var n = st.nextToken().toInt()
        var m = st.nextToken().toInt()

        var defeated = false

        while (x > 20) {
            if (n == 0) break
            n--
            x = x / 2 + 10
        }

        if (x - 10 * m > 0) {
            bw.write("NO")
        } else {
            bw.write("YES")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}