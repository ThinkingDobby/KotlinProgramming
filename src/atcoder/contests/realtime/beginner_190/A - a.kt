package atcoder.contests.realtime.beginner_190

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val tmp = a - b

    if (c == 0) {
        if (tmp > 0) {
            bw.write("Takahashi")
        } else {
            bw.write("Aoki")
        }
    } else {
        if (tmp < 0) {
            bw.write("Aoki")
        } else {
            bw.write("Takahashi")
        }
    }

    bw.flush()
    bw.close()
}