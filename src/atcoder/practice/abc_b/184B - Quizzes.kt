package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    val s = br.readLine()

    var score = x
    for (i in 0 until n) {
        if (s[i] == 'o') score++
        else if (score > 0) score--
    }

    bw.write("$score")

    bw.flush()
    bw.close()
}