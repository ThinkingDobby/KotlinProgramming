package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val tmp = a - b

        if (tmp > 0) {
            if (tmp % 2 == 0) bw.write("1")
            else bw.write("2")
        } else if (tmp < 0) {
            if (tmp % 2 == 0) bw.write("2")
            else bw.write("1")
        } else {
            bw.write("0")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}