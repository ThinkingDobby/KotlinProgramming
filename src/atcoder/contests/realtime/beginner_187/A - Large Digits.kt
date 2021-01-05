package atcoder.contests.realtime.beginner_187

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken()
    val b = st.nextToken()

    var sumA = 0
    var sumB = 0
    for (i in a) {
        sumA += i.toInt() - 48
    }
    for (i in b) {
        sumB += i.toInt() - 48
    }

    if (sumA > sumB) {
        bw.write("$sumA")
    } else {
        bw.write("$sumB")
    }

    bw.flush()
    bw.close()
}