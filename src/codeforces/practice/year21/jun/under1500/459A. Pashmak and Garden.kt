package codeforces.practice.year21.jun.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val x1 = st.nextToken().toInt()
    val y1 = st.nextToken().toInt()
    val x2 = st.nextToken().toInt()
    val y2 = st.nextToken().toInt()

    var len = 0

    if (x1 - x2 == 0) {
        len = Math.abs(y1 - y2)
        bw.write("${x1 + len} $y1 ${x2 + len} $y2")
    } else if (y1 - y2 == 0) {
        len = Math.abs(x1 - x2)
        bw.write("$x1 ${y1 + len} $x2 ${y2 + len}")
    } else {
        len = Math.abs(x1 - x2)
        if (len == Math.abs(y1 - y2)) {
            if (x1 > x2) {
                bw.write("${x1 - len} $y1 ")
            } else {
                bw.write("${x1 + len} $y1 ")
            }
            if (y1 > y2) {
                bw.write("$x1 ${y1 - len} ")
            } else {
                bw.write("$x1 ${y1 + len} ")
            }
        } else {
            bw.write("-1")
        }
    }

    bw.flush()
    bw.close()
}