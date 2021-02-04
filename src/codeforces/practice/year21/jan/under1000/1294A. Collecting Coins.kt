package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val inputs = Array(3) { st.nextToken().toInt() }.sorted()
        val n = st.nextToken().toInt()

        val tmp = 2 * inputs[2] - inputs[1] - inputs[0]
        if (n >= tmp) {
            if ((n - tmp) % 3 == 0) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        } else {
            bw.write("NO")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}