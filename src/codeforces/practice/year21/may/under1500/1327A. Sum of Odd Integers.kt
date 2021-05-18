package codeforces.practice.year21.may.under1500

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

        val nOdd = n % 2 == 1
        val kOdd = k % 2 == 1

        if (nOdd && kOdd) {
            if (Math.sqrt(n.toDouble()).toInt() < k) {
                bw.write("NO")
            } else {
                bw.write("YES")
            }
        } else if (nOdd && !kOdd) {
            bw.write("NO")
        } else if (!nOdd && kOdd) {
            bw.write("NO")
        } else {
            if (Math.sqrt(n.toDouble()).toInt() < k) {
                bw.write("NO")
            } else {
                bw.write("YES")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}